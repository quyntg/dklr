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

import com.fds.vr.business.exception.NoSuchVRMigrateReviewException;
import com.fds.vr.business.model.VRMigrateReview;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr migrate review service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateReviewPersistenceImpl
 * @see VRMigrateReviewUtil
 * @generated
 */
@ProviderType
public interface VRMigrateReviewPersistence extends BasePersistence<VRMigrateReview> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRMigrateReviewUtil} to access the vr migrate review persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr migrate reviews where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @return the matching vr migrate reviews
	*/
	public java.util.List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID);

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
	public java.util.List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end);

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
	public java.util.List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator);

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
	public java.util.List<VRMigrateReview> findBytaskMigrationID(
		int taskMigrationID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate review
	* @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	*/
	public VRMigrateReview findBytaskMigrationID_First(int taskMigrationID,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException;

	/**
	* Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	*/
	public VRMigrateReview fetchBytaskMigrationID_First(int taskMigrationID,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator);

	/**
	* Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate review
	* @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	*/
	public VRMigrateReview findBytaskMigrationID_Last(int taskMigrationID,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException;

	/**
	* Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	*/
	public VRMigrateReview fetchBytaskMigrationID_Last(int taskMigrationID,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator);

	/**
	* Returns the vr migrate reviews before and after the current vr migrate review in the ordered set where taskMigrationID = &#63;.
	*
	* @param id the primary key of the current vr migrate review
	* @param taskMigrationID the task migration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr migrate review
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public VRMigrateReview[] findBytaskMigrationID_PrevAndNext(long id,
		int taskMigrationID,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException;

	/**
	* Removes all the vr migrate reviews where taskMigrationID = &#63; from the database.
	*
	* @param taskMigrationID the task migration ID
	*/
	public void removeBytaskMigrationID(int taskMigrationID);

	/**
	* Returns the number of vr migrate reviews where taskMigrationID = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @return the number of matching vr migrate reviews
	*/
	public int countBytaskMigrationID(int taskMigrationID);

	/**
	* Caches the vr migrate review in the entity cache if it is enabled.
	*
	* @param vrMigrateReview the vr migrate review
	*/
	public void cacheResult(VRMigrateReview vrMigrateReview);

	/**
	* Caches the vr migrate reviews in the entity cache if it is enabled.
	*
	* @param vrMigrateReviews the vr migrate reviews
	*/
	public void cacheResult(java.util.List<VRMigrateReview> vrMigrateReviews);

	/**
	* Creates a new vr migrate review with the primary key. Does not add the vr migrate review to the database.
	*
	* @param id the primary key for the new vr migrate review
	* @return the new vr migrate review
	*/
	public VRMigrateReview create(long id);

	/**
	* Removes the vr migrate review with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review that was removed
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public VRMigrateReview remove(long id)
		throws NoSuchVRMigrateReviewException;

	public VRMigrateReview updateImpl(VRMigrateReview vrMigrateReview);

	/**
	* Returns the vr migrate review with the primary key or throws a {@link NoSuchVRMigrateReviewException} if it could not be found.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review
	* @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	*/
	public VRMigrateReview findByPrimaryKey(long id)
		throws NoSuchVRMigrateReviewException;

	/**
	* Returns the vr migrate review with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review, or <code>null</code> if a vr migrate review with the primary key could not be found
	*/
	public VRMigrateReview fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRMigrateReview> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr migrate reviews.
	*
	* @return the vr migrate reviews
	*/
	public java.util.List<VRMigrateReview> findAll();

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
	public java.util.List<VRMigrateReview> findAll(int start, int end);

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
	public java.util.List<VRMigrateReview> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator);

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
	public java.util.List<VRMigrateReview> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateReview> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr migrate reviews from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr migrate reviews.
	*
	* @return the number of vr migrate reviews
	*/
	public int countAll();
}