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

import com.fds.vr.business.model.VRInputStampbookDetails;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr input stampbook details service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookDetailsPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsUtil {
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
		VRInputStampbookDetails vrInputStampbookDetails) {
		getPersistence().clearCache(vrInputStampbookDetails);
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
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRInputStampbookDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRInputStampbookDetails update(
		VRInputStampbookDetails vrInputStampbookDetails) {
		return getPersistence().update(vrInputStampbookDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRInputStampbookDetails update(
		VRInputStampbookDetails vrInputStampbookDetails,
		ServiceContext serviceContext) {
		return getPersistence().update(vrInputStampbookDetails, serviceContext);
	}

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBystampSerialNo_purchaserId(purchaserId, stampSerialNo);
	}

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo) {
		return getPersistence()
				   .fetchBystampSerialNo_purchaserId(purchaserId, stampSerialNo);
	}

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBystampSerialNo_purchaserId(purchaserId,
			stampSerialNo, retrieveFromCache);
	}

	/**
	* Removes the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; from the database.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the vr input stampbook details that was removed
	*/
	public static VRInputStampbookDetails removeBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .removeBystampSerialNo_purchaserId(purchaserId, stampSerialNo);
	}

	/**
	* Returns the number of vr input stampbook detailses where purchaserId = &#63; and stampSerialNo = &#63;.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countBystampSerialNo_purchaserId(long purchaserId,
		java.lang.String stampSerialNo) {
		return getPersistence()
				   .countBystampSerialNo_purchaserId(purchaserId, stampSerialNo);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId) {
		return getPersistence().findByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByInputSheetId_First(
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByInputSheetId_First(
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByInputSheetId_Last(
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findByInputSheetId_PrevAndNext(
		long id, long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetId_PrevAndNext(id, mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public static void removeByInputSheetId(long mtCore, long inputSheetId) {
		getPersistence().removeByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countByInputSheetId(long mtCore, long inputSheetId) {
		return getPersistence().countByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_PrevAndNext(id, mtCore,
			inputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
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
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return getPersistence()
				   .countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId) {
		return getPersistence().findBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycorporationId_First(
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycorporationId_First(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycorporationId_First(
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycorporationId_First(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycorporationId_Last(
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycorporationId_Last(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycorporationId_Last(
		long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycorporationId_Last(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findBycorporationId_PrevAndNext(
		long id, long mtCore, long corporationId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycorporationId_PrevAndNext(id, mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	*/
	public static void removeBycorporationId(long mtCore, long corporationId) {
		getPersistence().removeBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countBycorporationId(long mtCore, long corporationId) {
		return getPersistence().countBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId) {
		return getPersistence().findBydossierId(mtCore, dossierId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return getPersistence().findBydossierId(mtCore, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findBydossierId_PrevAndNext(
		long id, long mtCore, long dossierId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, mtCore, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long mtCore, long dossierId) {
		getPersistence().removeBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countBydossierId(long mtCore, long dossierId) {
		return getPersistence().countBydossierId(mtCore, dossierId);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId) {
		return getPersistence().findBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycertificateId_First(
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycertificateId_First(
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycertificateId_Last(
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycertificateId_Last(
		long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long certificateId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long mtCore, long certificateId) {
		getPersistence().removeBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countBycertificateId(long mtCore, long certificateId) {
		return getPersistence().countBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findBycertificateNumber_PrevAndNext(
		long id, long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findBycertificateNumber_PrevAndNext(id, mtCore,
			certificateNumber, orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public static void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		getPersistence().removeBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		return getPersistence()
				   .countBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @return the matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId) {
		return getPersistence().findByvehicleRecordId(mtCore, vehicleRecordId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end) {
		return getPersistence()
				   .findByvehicleRecordId(mtCore, vehicleRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .findByvehicleRecordId(mtCore, vehicleRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByvehicleRecordId(mtCore, vehicleRecordId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByvehicleRecordId_First(
		long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByvehicleRecordId_First(mtCore, vehicleRecordId,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByvehicleRecordId_First(
		long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleRecordId_First(mtCore, vehicleRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByvehicleRecordId_Last(
		long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByvehicleRecordId_Last(mtCore, vehicleRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByvehicleRecordId_Last(
		long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleRecordId_Last(mtCore, vehicleRecordId,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails[] findByvehicleRecordId_PrevAndNext(
		long id, long mtCore, long vehicleRecordId,
		OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence()
				   .findByvehicleRecordId_PrevAndNext(id, mtCore,
			vehicleRecordId, orderByComparator);
	}

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	*/
	public static void removeByvehicleRecordId(long mtCore, long vehicleRecordId) {
		getPersistence().removeByvehicleRecordId(mtCore, vehicleRecordId);
	}

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countByvehicleRecordId(long mtCore, long vehicleRecordId) {
		return getPersistence().countByvehicleRecordId(mtCore, vehicleRecordId);
	}

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails findByBookIdAndSequenceNo(
		long bookId, long sequenceNo)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().findByBookIdAndSequenceNo(bookId, sequenceNo);
	}

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByBookIdAndSequenceNo(
		long bookId, long sequenceNo) {
		return getPersistence().fetchByBookIdAndSequenceNo(bookId, sequenceNo);
	}

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public static VRInputStampbookDetails fetchByBookIdAndSequenceNo(
		long bookId, long sequenceNo, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByBookIdAndSequenceNo(bookId, sequenceNo,
			retrieveFromCache);
	}

	/**
	* Removes the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; from the database.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the vr input stampbook details that was removed
	*/
	public static VRInputStampbookDetails removeByBookIdAndSequenceNo(
		long bookId, long sequenceNo)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().removeByBookIdAndSequenceNo(bookId, sequenceNo);
	}

	/**
	* Returns the number of vr input stampbook detailses where bookId = &#63; and sequenceNo = &#63;.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the number of matching vr input stampbook detailses
	*/
	public static int countByBookIdAndSequenceNo(long bookId, long sequenceNo) {
		return getPersistence().countByBookIdAndSequenceNo(bookId, sequenceNo);
	}

	/**
	* Caches the vr input stampbook details in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	*/
	public static void cacheResult(
		VRInputStampbookDetails vrInputStampbookDetails) {
		getPersistence().cacheResult(vrInputStampbookDetails);
	}

	/**
	* Caches the vr input stampbook detailses in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetailses the vr input stampbook detailses
	*/
	public static void cacheResult(
		List<VRInputStampbookDetails> vrInputStampbookDetailses) {
		getPersistence().cacheResult(vrInputStampbookDetailses);
	}

	/**
	* Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	*
	* @param id the primary key for the new vr input stampbook details
	* @return the new vr input stampbook details
	*/
	public static VRInputStampbookDetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details that was removed
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().remove(id);
	}

	public static VRInputStampbookDetails updateImpl(
		VRInputStampbookDetails vrInputStampbookDetails) {
		return getPersistence().updateImpl(vrInputStampbookDetails);
	}

	/**
	* Returns the vr input stampbook details with the primary key or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	*/
	public static VRInputStampbookDetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRInputStampbookDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr input stampbook detailses.
	*
	* @return the vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbook detailses
	*/
	public static List<VRInputStampbookDetails> findAll(int start, int end,
		OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr input stampbook detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr input stampbook detailses.
	*
	* @return the number of vr input stampbook detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRInputStampbookDetailsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInputStampbookDetailsPersistence, VRInputStampbookDetailsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRInputStampbookDetailsPersistence.class);
}