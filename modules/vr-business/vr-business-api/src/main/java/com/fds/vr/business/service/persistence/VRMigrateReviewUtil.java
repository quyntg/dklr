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

import com.fds.vr.business.model.VRMigrateReview;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr migrate review service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRMigrateReviewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateReviewPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateReviewPersistenceImpl
 * @generated
 */
@ProviderType
public class VRMigrateReviewUtil {
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
	public static void clearCache(VRMigrateReview vrMigrateReview) {
		getPersistence().clearCache(vrMigrateReview);
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
	public static List<VRMigrateReview> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRMigrateReview> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRMigrateReview> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRMigrateReview update(VRMigrateReview vrMigrateReview) {
		return getPersistence().update(vrMigrateReview);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRMigrateReview update(VRMigrateReview vrMigrateReview,
		ServiceContext serviceContext) {
		return getPersistence().update(vrMigrateReview, serviceContext);
	}

	/**
	* Returns all the vr migrate reviews where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @return the matching vr migrate reviews
	*/
	public static List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID) {
		return getPersistence().findBytaskMigrationID(taskMigrationID);
	}

	/**
	* Returns a range of all the vr migrate reviews where taskMigrationID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @return the range of matching vr migrate reviews
	*/
	public static List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end) {
		return getPersistence()
				   .findBytaskMigrationID(taskMigrationID, start, end);
	}

	/**
	* Returns an ordered range of all the vr migrate reviews where taskMigrationID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr migrate reviews
	*/
	public static List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return getPersistence()
				   .findBytaskMigrationID(taskMigrationID, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr migrate reviews where taskMigrationID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr migrate reviews
	*/
	public static List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBytaskMigrationID(taskMigrationID, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate review
	* @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	*/
	public static VRMigrateReview findBytaskMigrationID_First(
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateReviewException {
		return getPersistence()
				   .findBytaskMigrationID_First(taskMigrationID,
			orderByComparator);
	}

	/**
	* Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	*/
	public static VRMigrateReview fetchBytaskMigrationID_First(
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return getPersistence()
				   .fetchBytaskMigrationID_First(taskMigrationID,
			orderByComparator);
	}

	/**
	* Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate review
	* @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	*/
	public static VRMigrateReview findBytaskMigrationID_Last(
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateReviewException {
		return getPersistence()
				   .findBytaskMigrationID_Last(taskMigrationID,
			orderByComparator);
	}

	/**
	* Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	*/
	public static VRMigrateReview fetchBytaskMigrationID_Last(
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return getPersistence()
				   .fetchBytaskMigrationID_Last(taskMigrationID,
			orderByComparator);
	}

	/**
	* Returns the vr migrate reviews before and after the current vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param id the primary key of the current vr migrate review
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr migrate review
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public static VRMigrateReview[] findBytaskMigrationID_PrevAndNext(long id,
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateReviewException {
		return getPersistence()
				   .findBytaskMigrationID_PrevAndNext(id, taskMigrationID,
			orderByComparator);
	}

	/**
	* Removes all the vr migrate reviews where taskMigrationID = &#63; from the database.
	*
	* @param taskMigrationID the task migration ID
	*/
	public static void removeBytaskMigrationID(int taskMigrationID) {
		getPersistence().removeBytaskMigrationID(taskMigrationID);
	}

	/**
	* Returns the number of vr migrate reviews where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @return the number of matching vr migrate reviews
	*/
	public static int countBytaskMigrationID(int taskMigrationID) {
		return getPersistence().countBytaskMigrationID(taskMigrationID);
	}

	/**
	* Caches the vr migrate review in the entity cache if it is enabled.
	*
	* @param vrMigrateReview the vr migrate review
	*/
	public static void cacheResult(VRMigrateReview vrMigrateReview) {
		getPersistence().cacheResult(vrMigrateReview);
	}

	/**
	* Caches the vr migrate reviews in the entity cache if it is enabled.
	*
	* @param vrMigrateReviews the vr migrate reviews
	*/
	public static void cacheResult(List<VRMigrateReview> vrMigrateReviews) {
		getPersistence().cacheResult(vrMigrateReviews);
	}

	/**
	* Creates a new vr migrate review with the primary key. Does not add the vr migrate review to the database.
	*
	* @param id the primary key for the new vr migrate review
	* @return the new vr migrate review
	*/
	public static VRMigrateReview create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr migrate review with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review that was removed
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public static VRMigrateReview remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateReviewException {
		return getPersistence().remove(id);
	}

	public static VRMigrateReview updateImpl(VRMigrateReview vrMigrateReview) {
		return getPersistence().updateImpl(vrMigrateReview);
	}

	/**
	* Returns the vr migrate review with the primary key or throws a {@link NoSuchVRMigrateReviewException} if it could not be found.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public static VRMigrateReview findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateReviewException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr migrate review with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review, or <code>null</code> if a vr migrate review with the primary key could not be found
	*/
	public static VRMigrateReview fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRMigrateReview> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr migrate reviews.
	*
	* @return the vr migrate reviews
	*/
	public static List<VRMigrateReview> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr migrate reviews.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @return the range of vr migrate reviews
	*/
	public static List<VRMigrateReview> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr migrate reviews.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr migrate reviews
	*/
	public static List<VRMigrateReview> findAll(int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr migrate reviews.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr migrate reviews
	*/
	public static List<VRMigrateReview> findAll(int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr migrate reviews from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr migrate reviews.
	*
	* @return the number of vr migrate reviews
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRMigrateReviewPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRMigrateReviewPersistence, VRMigrateReviewPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRMigrateReviewPersistence.class);
}