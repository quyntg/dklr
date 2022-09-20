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

import com.fds.vr.business.model.VRCorporationAttendee;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the vr corporation attendee service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCorporationAttendeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationAttendeePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationAttendeePersistenceImpl
 * @generated
 */
@ProviderType
public class VRCorporationAttendeeUtil {
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
	public static void clearCache(VRCorporationAttendee vrCorporationAttendee) {
		getPersistence().clearCache(vrCorporationAttendee);
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
	public static List<VRCorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCorporationAttendee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCorporationAttendee update(
		VRCorporationAttendee vrCorporationAttendee) {
		return getPersistence().update(vrCorporationAttendee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCorporationAttendee update(
		VRCorporationAttendee vrCorporationAttendee,
		ServiceContext serviceContext) {
		return getPersistence().update(vrCorporationAttendee, serviceContext);
	}

	/**
	* Returns all the vr corporation attendees where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode) {
		return getPersistence().findByCorporationCode(corporationCode);
	}

	/**
	* Returns a range of all the vr corporation attendees where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end) {
		return getPersistence()
				   .findByCorporationCode(corporationCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByCorporationCode(corporationCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationCode(corporationCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByCorporationCode_First(
		java.lang.String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCode_First(corporationCode,
			orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByCorporationCode_First(
		java.lang.String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationCode_First(corporationCode,
			orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByCorporationCode_Last(
		java.lang.String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCode_Last(corporationCode,
			orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByCorporationCode_Last(
		java.lang.String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationCode_Last(corporationCode,
			orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByCorporationCode_PrevAndNext(
		long id, java.lang.String corporationCode,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCode_PrevAndNext(id, corporationCode,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where corporationCode = &#63; from the database.
	*
	* @param corporationCode the corporation code
	*/
	public static void removeByCorporationCode(java.lang.String corporationCode) {
		getPersistence().removeByCorporationCode(corporationCode);
	}

	/**
	* Returns the number of vr corporation attendees where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the number of matching vr corporation attendees
	*/
	public static int countByCorporationCode(java.lang.String corporationCode) {
		return getPersistence().countByCorporationCode(corporationCode);
	}

	/**
	* Returns all the vr corporation attendees where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerId(long managerId) {
		return getPersistence().findByManagerId(managerId);
	}

	/**
	* Returns a range of all the vr corporation attendees where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end) {
		return getPersistence().findByManagerId(managerId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByManagerId(managerId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where managerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerId(long managerId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByManagerId(managerId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByManagerId_First(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerId_First(managerId, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByManagerId_First(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByManagerId_First(managerId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByManagerId_Last(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerId_Last(managerId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByManagerId_Last(long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByManagerId_Last(managerId, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByManagerId_PrevAndNext(long id,
		long managerId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerId_PrevAndNext(id, managerId, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where managerId = &#63; from the database.
	*
	* @param managerId the manager ID
	*/
	public static void removeByManagerId(long managerId) {
		getPersistence().removeByManagerId(managerId);
	}

	/**
	* Returns the number of vr corporation attendees where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the number of matching vr corporation attendees
	*/
	public static int countByManagerId(long managerId) {
		return getPersistence().countByManagerId(managerId);
	}

	/**
	* Returns all the vr corporation attendees where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderId(long leaderId) {
		return getPersistence().findByLeaderId(leaderId);
	}

	/**
	* Returns a range of all the vr corporation attendees where leaderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end) {
		return getPersistence().findByLeaderId(leaderId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where leaderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByLeaderId(leaderId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where leaderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLeaderId(leaderId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByLeaderId_First(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence().findByLeaderId_First(leaderId, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByLeaderId_First(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByLeaderId_First(leaderId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByLeaderId_Last(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence().findByLeaderId_Last(leaderId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByLeaderId_Last(long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence().fetchByLeaderId_Last(leaderId, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByLeaderId_PrevAndNext(long id,
		long leaderId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByLeaderId_PrevAndNext(id, leaderId, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where leaderId = &#63; from the database.
	*
	* @param leaderId the leader ID
	*/
	public static void removeByLeaderId(long leaderId) {
		getPersistence().removeByLeaderId(leaderId);
	}

	/**
	* Returns the number of vr corporation attendees where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @return the number of matching vr corporation attendees
	*/
	public static int countByLeaderId(long leaderId) {
		return getPersistence().countByLeaderId(leaderId);
	}

	/**
	* Returns all the vr corporation attendees where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo) {
		return getPersistence().findByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns a range of all the vr corporation attendees where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end) {
		return getPersistence().findByApplicantIdNo(applicantIdNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNo_First(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNo_First(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNo_Last(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNo_Last(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByApplicantIdNo_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNo_PrevAndNext(id, applicantIdNo,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	*/
	public static void removeByApplicantIdNo(java.lang.String applicantIdNo) {
		getPersistence().removeByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns the number of vr corporation attendees where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr corporation attendees
	*/
	public static int countByApplicantIdNo(java.lang.String applicantIdNo) {
		return getPersistence().countByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate) {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate(applicantIdNo,
			inspectionDate);
	}

	/**
	* Returns a range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start, int end) {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate(applicantIdNo,
			inspectionDate, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate(applicantIdNo,
			inspectionDate, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate(applicantIdNo,
			inspectionDate, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByApplicantIdNoInspectionDate_First(
		java.lang.String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate_First(applicantIdNo,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByApplicantIdNoInspectionDate_First(
		java.lang.String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNoInspectionDate_First(applicantIdNo,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByApplicantIdNoInspectionDate_Last(
		java.lang.String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate_Last(applicantIdNo,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByApplicantIdNoInspectionDate_Last(
		java.lang.String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNoInspectionDate_Last(applicantIdNo,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByApplicantIdNoInspectionDate_PrevAndNext(
		long id, java.lang.String applicantIdNo, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByApplicantIdNoInspectionDate_PrevAndNext(id,
			applicantIdNo, inspectionDate, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	*/
	public static void removeByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate) {
		getPersistence()
			.removeByApplicantIdNoInspectionDate(applicantIdNo, inspectionDate);
	}

	/**
	* Returns the number of vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public static int countByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate) {
		return getPersistence()
				   .countByApplicantIdNoInspectionDate(applicantIdNo,
			inspectionDate);
	}

	/**
	* Returns all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate) {
		return getPersistence()
				   .findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate);
	}

	/**
	* Returns a range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end) {
		return getPersistence()
				   .findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end, OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationCodeInspectionDate(corporationCode,
			inspectionDate, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByCorporationCodeInspectionDate_First(
		java.lang.String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCodeInspectionDate_First(corporationCode,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByCorporationCodeInspectionDate_First(
		java.lang.String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationCodeInspectionDate_First(corporationCode,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByCorporationCodeInspectionDate_Last(
		java.lang.String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCodeInspectionDate_Last(corporationCode,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByCorporationCodeInspectionDate_Last(
		java.lang.String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationCodeInspectionDate_Last(corporationCode,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByCorporationCodeInspectionDate_PrevAndNext(
		long id, java.lang.String corporationCode, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByCorporationCodeInspectionDate_PrevAndNext(id,
			corporationCode, inspectionDate, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63; from the database.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	*/
	public static void removeByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate) {
		getPersistence()
			.removeByCorporationCodeInspectionDate(corporationCode,
			inspectionDate);
	}

	/**
	* Returns the number of vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public static int countByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate) {
		return getPersistence()
				   .countByCorporationCodeInspectionDate(corporationCode,
			inspectionDate);
	}

	/**
	* Returns all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate) {
		return getPersistence()
				   .findByManagerIdInspectionDate(managerId, inspectionDate);
	}

	/**
	* Returns a range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end) {
		return getPersistence()
				   .findByManagerIdInspectionDate(managerId, inspectionDate,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByManagerIdInspectionDate(managerId, inspectionDate,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByManagerIdInspectionDate(managerId, inspectionDate,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerIdInspectionDate_First(managerId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByManagerIdInspectionDate_First(managerId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerIdInspectionDate_Last(managerId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByManagerIdInspectionDate_Last(managerId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByManagerIdInspectionDate_PrevAndNext(
		long id, long managerId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByManagerIdInspectionDate_PrevAndNext(id, managerId,
			inspectionDate, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63; from the database.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	*/
	public static void removeByManagerIdInspectionDate(long managerId,
		Date inspectionDate) {
		getPersistence()
			.removeByManagerIdInspectionDate(managerId, inspectionDate);
	}

	/**
	* Returns the number of vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public static int countByManagerIdInspectionDate(long managerId,
		Date inspectionDate) {
		return getPersistence()
				   .countByManagerIdInspectionDate(managerId, inspectionDate);
	}

	/**
	* Returns all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate) {
		return getPersistence()
				   .findByLeaderIdInspectionDate(leaderId, inspectionDate);
	}

	/**
	* Returns a range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end) {
		return getPersistence()
				   .findByLeaderIdInspectionDate(leaderId, inspectionDate,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByLeaderIdInspectionDate(leaderId, inspectionDate,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLeaderIdInspectionDate(leaderId, inspectionDate,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByLeaderIdInspectionDate_First(leaderId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByLeaderIdInspectionDate_First(leaderId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByLeaderIdInspectionDate_Last(leaderId, inspectionDate,
			orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByLeaderIdInspectionDate_Last(leaderId,
			inspectionDate, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByLeaderIdInspectionDate_PrevAndNext(
		long id, long leaderId, Date inspectionDate,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByLeaderIdInspectionDate_PrevAndNext(id, leaderId,
			inspectionDate, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63; from the database.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	*/
	public static void removeByLeaderIdInspectionDate(long leaderId,
		Date inspectionDate) {
		getPersistence().removeByLeaderIdInspectionDate(leaderId, inspectionDate);
	}

	/**
	* Returns the number of vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public static int countByLeaderIdInspectionDate(long leaderId,
		Date inspectionDate) {
		return getPersistence()
				   .countByLeaderIdInspectionDate(leaderId, inspectionDate);
	}

	/**
	* Returns all the vr corporation attendees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierId(long dossierId) {
		return getPersistence().findByDossierId(dossierId);
	}

	/**
	* Returns a range of all the vr corporation attendees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end) {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierId_First(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierId_First(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierId_Last(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierId_Last(long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByDossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeByDossierId(long dossierId) {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr corporation attendees
	*/
	public static int countByDossierId(long dossierId) {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Returns all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory) {
		return getPersistence()
				   .findByDossierIdActivityCategory(dossierId, activityCatetory);
	}

	/**
	* Returns a range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end) {
		return getPersistence()
				   .findByDossierIdActivityCategory(dossierId,
			activityCatetory, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByDossierIdActivityCategory(dossierId,
			activityCatetory, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierIdActivityCategory(dossierId,
			activityCatetory, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierIdActivityCategory_First(
		long dossierId, java.lang.String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdActivityCategory_First(dossierId,
			activityCatetory, orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierIdActivityCategory_First(
		long dossierId, java.lang.String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdActivityCategory_First(dossierId,
			activityCatetory, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierIdActivityCategory_Last(
		long dossierId, java.lang.String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdActivityCategory_Last(dossierId,
			activityCatetory, orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierIdActivityCategory_Last(
		long dossierId, java.lang.String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdActivityCategory_Last(dossierId,
			activityCatetory, orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByDossierIdActivityCategory_PrevAndNext(
		long id, long dossierId, java.lang.String activityCatetory,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdActivityCategory_PrevAndNext(id, dossierId,
			activityCatetory, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	*/
	public static void removeByDossierIdActivityCategory(long dossierId,
		java.lang.String activityCatetory) {
		getPersistence()
			.removeByDossierIdActivityCategory(dossierId, activityCatetory);
	}

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @return the number of matching vr corporation attendees
	*/
	public static int countByDossierIdActivityCategory(long dossierId,
		java.lang.String activityCatetory) {
		return getPersistence()
				   .countByDossierIdActivityCategory(dossierId, activityCatetory);
	}

	/**
	* Returns all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @return the matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType) {
		return getPersistence().findByDossierIdAssignType(dossierId, assignType);
	}

	/**
	* Returns a range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end) {
		return getPersistence()
				   .findByDossierIdAssignType(dossierId, assignType, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .findByDossierIdAssignType(dossierId, assignType, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierIdAssignType(dossierId, assignType, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierIdAssignType_First(
		long dossierId, java.lang.String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdAssignType_First(dossierId, assignType,
			orderByComparator);
	}

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierIdAssignType_First(
		long dossierId, java.lang.String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdAssignType_First(dossierId, assignType,
			orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee findByDossierIdAssignType_Last(
		long dossierId, java.lang.String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdAssignType_Last(dossierId, assignType,
			orderByComparator);
	}

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public static VRCorporationAttendee fetchByDossierIdAssignType_Last(
		long dossierId, java.lang.String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdAssignType_Last(dossierId, assignType,
			orderByComparator);
	}

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee[] findByDossierIdAssignType_PrevAndNext(
		long id, long dossierId, java.lang.String assignType,
		OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence()
				   .findByDossierIdAssignType_PrevAndNext(id, dossierId,
			assignType, orderByComparator);
	}

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; and assignType = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	*/
	public static void removeByDossierIdAssignType(long dossierId,
		java.lang.String assignType) {
		getPersistence().removeByDossierIdAssignType(dossierId, assignType);
	}

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @return the number of matching vr corporation attendees
	*/
	public static int countByDossierIdAssignType(long dossierId,
		java.lang.String assignType) {
		return getPersistence().countByDossierIdAssignType(dossierId, assignType);
	}

	/**
	* Caches the vr corporation attendee in the entity cache if it is enabled.
	*
	* @param vrCorporationAttendee the vr corporation attendee
	*/
	public static void cacheResult(VRCorporationAttendee vrCorporationAttendee) {
		getPersistence().cacheResult(vrCorporationAttendee);
	}

	/**
	* Caches the vr corporation attendees in the entity cache if it is enabled.
	*
	* @param vrCorporationAttendees the vr corporation attendees
	*/
	public static void cacheResult(
		List<VRCorporationAttendee> vrCorporationAttendees) {
		getPersistence().cacheResult(vrCorporationAttendees);
	}

	/**
	* Creates a new vr corporation attendee with the primary key. Does not add the vr corporation attendee to the database.
	*
	* @param id the primary key for the new vr corporation attendee
	* @return the new vr corporation attendee
	*/
	public static VRCorporationAttendee create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee that was removed
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence().remove(id);
	}

	public static VRCorporationAttendee updateImpl(
		VRCorporationAttendee vrCorporationAttendee) {
		return getPersistence().updateImpl(vrCorporationAttendee);
	}

	/**
	* Returns the vr corporation attendee with the primary key or throws a {@link NoSuchVRCorporationAttendeeException} if it could not be found.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee, or <code>null</code> if a vr corporation attendee with the primary key could not be found
	*/
	public static VRCorporationAttendee fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCorporationAttendee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr corporation attendees.
	*
	* @return the vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findAll(int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation attendees
	*/
	public static List<VRCorporationAttendee> findAll(int start, int end,
		OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr corporation attendees from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr corporation attendees.
	*
	* @return the number of vr corporation attendees
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCorporationAttendeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCorporationAttendeePersistence, VRCorporationAttendeePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCorporationAttendeePersistence.class);
}