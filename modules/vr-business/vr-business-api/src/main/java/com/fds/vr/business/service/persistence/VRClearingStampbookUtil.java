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

import com.fds.vr.business.model.VRClearingStampbook;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr clearing stampbook service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRClearingStampbookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRClearingStampbookPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRClearingStampbookPersistenceImpl
 * @generated
 */
@ProviderType
public class VRClearingStampbookUtil {
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
	public static void clearCache(VRClearingStampbook vrClearingStampbook) {
		getPersistence().clearCache(vrClearingStampbook);
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
	public static List<VRClearingStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRClearingStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRClearingStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRClearingStampbook update(
		VRClearingStampbook vrClearingStampbook) {
		return getPersistence().update(vrClearingStampbook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRClearingStampbook update(
		VRClearingStampbook vrClearingStampbook, ServiceContext serviceContext) {
		return getPersistence().update(vrClearingStampbook, serviceContext);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return getPersistence().findByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByInputSheetId_PrevAndNext(
		long id, long mtCore, long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetId_PrevAndNext(id, mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public static void removeByInputSheetId(long mtCore, long inputSheetId) {
		getPersistence().removeByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByInputSheetId(long mtCore, long inputSheetId) {
		return getPersistence().countByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_PrevAndNext(id, mtCore,
			inputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
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
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return getPersistence()
				   .countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId) {
		return getPersistence().findByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetId_First(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetId_First(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetId_Last(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetId_Last(mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByOutputSheetId_PrevAndNext(
		long id, long mtCore, long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetId_PrevAndNext(id, mtCore, outputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	*/
	public static void removeByOutputSheetId(long mtCore, long outputSheetId) {
		getPersistence().removeByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByOutputSheetId(long mtCore, long outputSheetId) {
		return getPersistence().countByOutputSheetId(mtCore, outputSheetId);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_First(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookId_First(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_Last(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookId_Last(mtCore, outputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookId_PrevAndNext(id, mtCore,
			outputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
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
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId) {
		return getPersistence()
				   .countByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_PrevAndNext(id,
			mtCore, inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
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
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .countByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_First(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookIdAndStampType_First(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
			outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(id,
			mtCore, outputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
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
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .countByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId) {
		return getPersistence().findBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long mtCore, long certificateId) {
		getPersistence().removeBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countBycertificateId(long mtCore, long certificateId) {
		return getPersistence().countBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateNumber(mtCore, certificateNumber, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBycertificateNumber_First(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_First(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBycertificateNumber_Last(
		long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateNumber_Last(mtCore, certificateNumber,
			orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findBycertificateNumber_PrevAndNext(
		long id, long mtCore, java.lang.String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBycertificateNumber_PrevAndNext(id, mtCore,
			certificateNumber, orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public static void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		getPersistence().removeBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber) {
		return getPersistence()
				   .countBycertificateNumber(mtCore, certificateNumber);
	}

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @return the matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId) {
		return getPersistence().findBydebitNoteId(mtCore, debitNoteId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end) {
		return getPersistence()
				   .findBydebitNoteId(mtCore, debitNoteId, start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .findBydebitNoteId(mtCore, debitNoteId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydebitNoteId(mtCore, debitNoteId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBydebitNoteId_First(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBydebitNoteId_First(mtCore, debitNoteId,
			orderByComparator);
	}

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBydebitNoteId_First(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBydebitNoteId_First(mtCore, debitNoteId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook findBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBydebitNoteId_Last(mtCore, debitNoteId,
			orderByComparator);
	}

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public static VRClearingStampbook fetchBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBydebitNoteId_Last(mtCore, debitNoteId,
			orderByComparator);
	}

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook[] findBydebitNoteId_PrevAndNext(long id,
		long mtCore, long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence()
				   .findBydebitNoteId_PrevAndNext(id, mtCore, debitNoteId,
			orderByComparator);
	}

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	*/
	public static void removeBydebitNoteId(long mtCore, long debitNoteId) {
		getPersistence().removeBydebitNoteId(mtCore, debitNoteId);
	}

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @return the number of matching vr clearing stampbooks
	*/
	public static int countBydebitNoteId(long mtCore, long debitNoteId) {
		return getPersistence().countBydebitNoteId(mtCore, debitNoteId);
	}

	/**
	* Caches the vr clearing stampbook in the entity cache if it is enabled.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	*/
	public static void cacheResult(VRClearingStampbook vrClearingStampbook) {
		getPersistence().cacheResult(vrClearingStampbook);
	}

	/**
	* Caches the vr clearing stampbooks in the entity cache if it is enabled.
	*
	* @param vrClearingStampbooks the vr clearing stampbooks
	*/
	public static void cacheResult(
		List<VRClearingStampbook> vrClearingStampbooks) {
		getPersistence().cacheResult(vrClearingStampbooks);
	}

	/**
	* Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	*
	* @param id the primary key for the new vr clearing stampbook
	* @return the new vr clearing stampbook
	*/
	public static VRClearingStampbook create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence().remove(id);
	}

	public static VRClearingStampbook updateImpl(
		VRClearingStampbook vrClearingStampbook) {
		return getPersistence().updateImpl(vrClearingStampbook);
	}

	/**
	* Returns the vr clearing stampbook with the primary key or throws a {@link NoSuchVRClearingStampbookException} if it could not be found.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRClearingStampbookException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr clearing stampbook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook, or <code>null</code> if a vr clearing stampbook with the primary key could not be found
	*/
	public static VRClearingStampbook fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRClearingStampbook> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr clearing stampbooks.
	*
	* @return the vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findAll(int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr clearing stampbooks
	*/
	public static List<VRClearingStampbook> findAll(int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr clearing stampbooks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr clearing stampbooks.
	*
	* @return the number of vr clearing stampbooks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRClearingStampbookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRClearingStampbookPersistence, VRClearingStampbookPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRClearingStampbookPersistence.class);
}