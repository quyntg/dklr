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

import com.fds.vr.business.model.VRInputStampbook;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr input stampbook service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRInputStampbookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputStampbookPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookPersistenceImpl
 * @generated
 */
@ProviderType
public class VRInputStampbookUtil {
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
	public static void clearCache(VRInputStampbook vrInputStampbook) {
		getPersistence().clearCache(vrInputStampbook);
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
	public static List<VRInputStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRInputStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRInputStampbook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRInputStampbook update(VRInputStampbook vrInputStampbook) {
		return getPersistence().update(vrInputStampbook);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRInputStampbook update(VRInputStampbook vrInputStampbook,
		ServiceContext serviceContext) {
		return getPersistence().update(vrInputStampbook, serviceContext);
	}

	/**
	* Returns all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @return the matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3) {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3(vehicleClass, stampType,
			sum3);
	}

	/**
	* Returns a range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end) {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3(vehicleClass, stampType,
			sum3, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3(vehicleClass, stampType,
			sum3, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3(vehicleClass, stampType,
			sum3, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByvehicleClass_stampType_sum3_First(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3_First(vehicleClass,
			stampType, sum3, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByvehicleClass_stampType_sum3_First(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleClass_stampType_sum3_First(vehicleClass,
			stampType, sum3, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByvehicleClass_stampType_sum3_Last(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3_Last(vehicleClass,
			stampType, sum3, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByvehicleClass_stampType_sum3_Last(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleClass_stampType_sum3_Last(vehicleClass,
			stampType, sum3, orderByComparator);
	}

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook[] findByvehicleClass_stampType_sum3_PrevAndNext(
		long id, java.lang.String vehicleClass, java.lang.String stampType,
		long sum3, OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByvehicleClass_stampType_sum3_PrevAndNext(id,
			vehicleClass, stampType, sum3, orderByComparator);
	}

	/**
	* Removes all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	*/
	public static void removeByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3) {
		getPersistence()
			.removeByvehicleClass_stampType_sum3(vehicleClass, stampType, sum3);
	}

	/**
	* Returns the number of vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @return the number of matching vr input stampbooks
	*/
	public static int countByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3) {
		return getPersistence()
				   .countByvehicleClass_stampType_sum3(vehicleClass, stampType,
			sum3);
	}

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return getPersistence().findByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_First(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId, OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetId_Last(mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetId_PrevAndNext(id, mtCore, inputSheetId,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public static void removeByInputSheetId(long mtCore, long inputSheetId) {
		getPersistence().removeByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr input stampbooks
	*/
	public static int countByInputSheetId(long mtCore, long inputSheetId) {
		return getPersistence().countByInputSheetId(mtCore, inputSheetId);
	}

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_First(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookId_Last(mtCore, inputSheetId,
			bookId, orderByComparator);
	}

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookId_PrevAndNext(id, mtCore,
			inputSheetId, bookId, orderByComparator);
	}

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
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
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr input stampbooks
	*/
	public static int countByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return getPersistence()
				   .countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
			inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findByInputSheetIdAndBookIdAndStampType_PrevAndNext(id,
			mtCore, inputSheetId, bookId, stampType, orderByComparator);
	}

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
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
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr input stampbooks
	*/
	public static int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType) {
		return getPersistence()
				   .countByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	/**
	* Returns all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @return the matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findBySum3GreaterThan(long sum3) {
		return getPersistence().findBySum3GreaterThan(sum3);
	}

	/**
	* Returns a range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end) {
		return getPersistence().findBySum3GreaterThan(sum3, start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .findBySum3GreaterThan(sum3, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public static List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySum3GreaterThan(sum3, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findBySum3GreaterThan_First(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findBySum3GreaterThan_First(sum3, orderByComparator);
	}

	/**
	* Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchBySum3GreaterThan_First(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBySum3GreaterThan_First(sum3, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook findBySum3GreaterThan_Last(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findBySum3GreaterThan_Last(sum3, orderByComparator);
	}

	/**
	* Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public static VRInputStampbook fetchBySum3GreaterThan_Last(long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence()
				   .fetchBySum3GreaterThan_Last(sum3, orderByComparator);
	}

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook[] findBySum3GreaterThan_PrevAndNext(
		long id, long sum3,
		OrderByComparator<VRInputStampbook> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence()
				   .findBySum3GreaterThan_PrevAndNext(id, sum3,
			orderByComparator);
	}

	/**
	* Removes all the vr input stampbooks where sum3 &gt; &#63; from the database.
	*
	* @param sum3 the sum3
	*/
	public static void removeBySum3GreaterThan(long sum3) {
		getPersistence().removeBySum3GreaterThan(sum3);
	}

	/**
	* Returns the number of vr input stampbooks where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @return the number of matching vr input stampbooks
	*/
	public static int countBySum3GreaterThan(long sum3) {
		return getPersistence().countBySum3GreaterThan(sum3);
	}

	/**
	* Caches the vr input stampbook in the entity cache if it is enabled.
	*
	* @param vrInputStampbook the vr input stampbook
	*/
	public static void cacheResult(VRInputStampbook vrInputStampbook) {
		getPersistence().cacheResult(vrInputStampbook);
	}

	/**
	* Caches the vr input stampbooks in the entity cache if it is enabled.
	*
	* @param vrInputStampbooks the vr input stampbooks
	*/
	public static void cacheResult(List<VRInputStampbook> vrInputStampbooks) {
		getPersistence().cacheResult(vrInputStampbooks);
	}

	/**
	* Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	*
	* @param id the primary key for the new vr input stampbook
	* @return the new vr input stampbook
	*/
	public static VRInputStampbook create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook that was removed
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence().remove(id);
	}

	public static VRInputStampbook updateImpl(VRInputStampbook vrInputStampbook) {
		return getPersistence().updateImpl(vrInputStampbook);
	}

	/**
	* Returns the vr input stampbook with the primary key or throws a {@link NoSuchVRInputStampbookException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRInputStampbookException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr input stampbook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook, or <code>null</code> if a vr input stampbook with the primary key could not be found
	*/
	public static VRInputStampbook fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRInputStampbook> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr input stampbooks.
	*
	* @return the vr input stampbooks
	*/
	public static List<VRInputStampbook> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of vr input stampbooks
	*/
	public static List<VRInputStampbook> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbooks
	*/
	public static List<VRInputStampbook> findAll(int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbooks
	*/
	public static List<VRInputStampbook> findAll(int start, int end,
		OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr input stampbooks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr input stampbooks.
	*
	* @return the number of vr input stampbooks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRInputStampbookPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInputStampbookPersistence, VRInputStampbookPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRInputStampbookPersistence.class);
}