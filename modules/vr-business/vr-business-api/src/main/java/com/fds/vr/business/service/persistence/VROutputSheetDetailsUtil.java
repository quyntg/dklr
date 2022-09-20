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

import com.fds.vr.business.model.VROutputSheetDetails;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr output sheet details service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VROutputSheetDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetDetailsPersistence
 * @see com.fds.vr.business.service.persistence.impl.VROutputSheetDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class VROutputSheetDetailsUtil {
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
	public static void clearCache(VROutputSheetDetails vrOutputSheetDetails) {
		getPersistence().clearCache(vrOutputSheetDetails);
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
	public static List<VROutputSheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VROutputSheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VROutputSheetDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VROutputSheetDetails update(
		VROutputSheetDetails vrOutputSheetDetails) {
		return getPersistence().update(vrOutputSheetDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VROutputSheetDetails update(
		VROutputSheetDetails vrOutputSheetDetails, ServiceContext serviceContext) {
		return getPersistence().update(vrOutputSheetDetails, serviceContext);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return getPersistence().findByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByInputSheetId_PrevAndNext(
		long id, long mtCore, long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetId_PrevAndNext(id, mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public static void removeByInputSheetId(long mtCore, long inputSheetId) {
		getPersistence().removeByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByInputSheetId(long mtCore, long inputSheetId) {
		return getPersistence().countByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_PrevAndNext(id, mtCore,
			inputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	*/
	public static void removeByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		getPersistence()
			.removeByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return getPersistence()
				   .countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId) {
		return getPersistence().findByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetId_First(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetId_First(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetId_Last(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetId_Last(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByOutputSheetId_PrevAndNext(
		long id, long mtCore, long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetId_PrevAndNext(id, mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	*/
	public static void removeByOutputSheetId(long mtCore, long outputSheetId) {
		getPersistence().removeByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByOutputSheetId(long mtCore, long outputSheetId) {
		return getPersistence().countByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_First(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookId_First(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_Last(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookId_Last(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_PrevAndNext(id, mtCore,
			outputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	*/
	public static void removeByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId) {
		getPersistence()
			.removeByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId) {
		return getPersistence()
				   .countByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_PrevAndNext(id,
			mtCore, inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public static void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType) {
		getPersistence()
			.removeByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .countByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_First(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookIdAndStampType_First(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(id,
			mtCore, outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public static void removeByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType) {
		getPersistence()
			.removeByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .countByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId) {
		return getPersistence().findBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long mtCore, long certificateId) {
		getPersistence().removeBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countBycertificateId(long mtCore, long certificateId) {
		return getPersistence().countBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findBycertificateNumber_PrevAndNext(
		long id, long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findBycertificateNumber_PrevAndNext(id, mtCore,
			certificateNumber, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public static void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		getPersistence().removeBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr output sheet detailses
	*/
	public static int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		return getPersistence()
				   .countBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByissueVehicleCertificateId_First(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByissueVehicleCertificateId_First(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails findByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByissueVehicleCertificateId_Last(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public static VROutputSheetDetails fetchByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence()
				   .fetchByissueVehicleCertificateId_Last(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence()
				   .findByissueVehicleCertificateId_PrevAndNext(id, mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public static void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		getPersistence()
			.removeByissueVehicleCertificateId(mtCore, issueVehicleCertificateId);
	}

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr output sheet detailses
	*/
	public static int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		return getPersistence()
				   .countByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Caches the vr output sheet details in the entity cache if it is enabled.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	*/
	public static void cacheResult(VROutputSheetDetails vrOutputSheetDetails) {
		getPersistence().cacheResult(vrOutputSheetDetails);
	}

	/**
	* Caches the vr output sheet detailses in the entity cache if it is enabled.
	*
	* @param vrOutputSheetDetailses the vr output sheet detailses
	*/
	public static void cacheResult(
		List<VROutputSheetDetails> vrOutputSheetDetailses) {
		getPersistence().cacheResult(vrOutputSheetDetailses);
	}

	/**
	* Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	*
	* @param id the primary key for the new vr output sheet details
	* @return the new vr output sheet details
	*/
	public static VROutputSheetDetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details that was removed
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails remove(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence().remove(id);
	}

	public static VROutputSheetDetails updateImpl(
		VROutputSheetDetails vrOutputSheetDetails) {
		return getPersistence().updateImpl(vrOutputSheetDetails);
	}

	/**
	* Returns the vr output sheet details with the primary key or throws a {@link NoSuchVROutputSheetDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr output sheet details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details, or <code>null</code> if a vr output sheet details with the primary key could not be found
	*/
	public static VROutputSheetDetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VROutputSheetDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr output sheet detailses.
	*
	* @return the vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findAll(int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr output sheet detailses
	*/
	public static List<VROutputSheetDetails> findAll(int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr output sheet detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr output sheet detailses.
	*
	* @return the number of vr output sheet detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VROutputSheetDetailsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VROutputSheetDetailsPersistence, VROutputSheetDetailsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VROutputSheetDetailsPersistence.class);
}