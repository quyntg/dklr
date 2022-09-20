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

import com.fds.vr.business.exception.NoSuchVRCorporationAttendeeException;
import com.fds.vr.business.model.VRCorporationAttendee;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

/**
 * The persistence interface for the vr corporation attendee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationAttendeePersistenceImpl
 * @see VRCorporationAttendeeUtil
 * @generated
 */
@ProviderType
public interface VRCorporationAttendeePersistence extends BasePersistence<VRCorporationAttendee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationAttendeeUtil} to access the vr corporation attendee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr corporation attendees where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByCorporationCode_First(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByCorporationCode_First(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByCorporationCode_Last(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByCorporationCode_Last(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where corporationCode = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee[] findByCorporationCode_PrevAndNext(long id,
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where corporationCode = &#63; from the database.
	*
	* @param corporationCode the corporation code
	*/
	public void removeByCorporationCode(java.lang.String corporationCode);

	/**
	* Returns the number of vr corporation attendees where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the number of matching vr corporation attendees
	*/
	public int countByCorporationCode(java.lang.String corporationCode);

	/**
	* Returns all the vr corporation attendees where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByManagerId(long managerId);

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
	public java.util.List<VRCorporationAttendee> findByManagerId(
		long managerId, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByManagerId(
		long managerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByManagerId(
		long managerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByManagerId_First(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByManagerId_First(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByManagerId_Last(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByManagerId_Last(long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where managerId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param managerId the manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee[] findByManagerId_PrevAndNext(long id,
		long managerId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where managerId = &#63; from the database.
	*
	* @param managerId the manager ID
	*/
	public void removeByManagerId(long managerId);

	/**
	* Returns the number of vr corporation attendees where managerId = &#63;.
	*
	* @param managerId the manager ID
	* @return the number of matching vr corporation attendees
	*/
	public int countByManagerId(long managerId);

	/**
	* Returns all the vr corporation attendees where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByLeaderId(long leaderId);

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
	public java.util.List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByLeaderId(long leaderId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByLeaderId_First(long leaderId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByLeaderId_First(long leaderId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByLeaderId_Last(long leaderId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByLeaderId_Last(long leaderId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where leaderId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param leaderId the leader ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee[] findByLeaderId_PrevAndNext(long id,
		long leaderId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where leaderId = &#63; from the database.
	*
	* @param leaderId the leader ID
	*/
	public void removeByLeaderId(long leaderId);

	/**
	* Returns the number of vr corporation attendees where leaderId = &#63;.
	*
	* @param leaderId the leader ID
	* @return the number of matching vr corporation attendees
	*/
	public int countByLeaderId(long leaderId);

	/**
	* Returns all the vr corporation attendees where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where applicantIdNo = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee[] findByApplicantIdNo_PrevAndNext(long id,
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	*/
	public void removeByApplicantIdNo(java.lang.String applicantIdNo);

	/**
	* Returns the number of vr corporation attendees where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr corporation attendees
	*/
	public int countByApplicantIdNo(java.lang.String applicantIdNo);

	/**
	* Returns all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByApplicantIdNoInspectionDate_First(
		java.lang.String applicantIdNo, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByApplicantIdNoInspectionDate_First(
		java.lang.String applicantIdNo, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByApplicantIdNoInspectionDate_Last(
		java.lang.String applicantIdNo, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByApplicantIdNoInspectionDate_Last(
		java.lang.String applicantIdNo, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByApplicantIdNoInspectionDate_PrevAndNext(
		long id, java.lang.String applicantIdNo, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	*/
	public void removeByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate);

	/**
	* Returns the number of vr corporation attendees where applicantIdNo = &#63; and inspectionDate = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public int countByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate);

	/**
	* Returns all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByCorporationCodeInspectionDate_First(
		java.lang.String corporationCode, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByCorporationCodeInspectionDate_First(
		java.lang.String corporationCode, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByCorporationCodeInspectionDate_Last(
		java.lang.String corporationCode, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByCorporationCodeInspectionDate_Last(
		java.lang.String corporationCode, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByCorporationCodeInspectionDate_PrevAndNext(
		long id, java.lang.String corporationCode, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63; from the database.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	*/
	public void removeByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate);

	/**
	* Returns the number of vr corporation attendees where corporationCode = &#63; and inspectionDate = &#63;.
	*
	* @param corporationCode the corporation code
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public int countByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate);

	/**
	* Returns all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate);

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
	public java.util.List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByManagerIdInspectionDate(
		long managerId, Date inspectionDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByManagerIdInspectionDate_First(
		long managerId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByManagerIdInspectionDate_Last(
		long managerId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByManagerIdInspectionDate_PrevAndNext(
		long id, long managerId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where managerId = &#63; and inspectionDate = &#63; from the database.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	*/
	public void removeByManagerIdInspectionDate(long managerId,
		Date inspectionDate);

	/**
	* Returns the number of vr corporation attendees where managerId = &#63; and inspectionDate = &#63;.
	*
	* @param managerId the manager ID
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public int countByManagerIdInspectionDate(long managerId,
		Date inspectionDate);

	/**
	* Returns all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate);

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
	public java.util.List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByLeaderIdInspectionDate(
		long leaderId, Date inspectionDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByLeaderIdInspectionDate_First(
		long leaderId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByLeaderIdInspectionDate_Last(
		long leaderId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByLeaderIdInspectionDate_PrevAndNext(
		long id, long leaderId, Date inspectionDate,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where leaderId = &#63; and inspectionDate = &#63; from the database.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	*/
	public void removeByLeaderIdInspectionDate(long leaderId,
		Date inspectionDate);

	/**
	* Returns the number of vr corporation attendees where leaderId = &#63; and inspectionDate = &#63;.
	*
	* @param leaderId the leader ID
	* @param inspectionDate the inspection date
	* @return the number of matching vr corporation attendees
	*/
	public int countByLeaderIdInspectionDate(long leaderId, Date inspectionDate);

	/**
	* Returns all the vr corporation attendees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByDossierId(long dossierId);

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
	public java.util.List<VRCorporationAttendee> findByDossierId(
		long dossierId, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the vr corporation attendees before and after the current vr corporation attendee in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr corporation attendee
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee[] findByDossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByDossierId(long dossierId);

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr corporation attendees
	*/
	public int countByDossierId(long dossierId);

	/**
	* Returns all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierIdActivityCategory_First(
		long dossierId, java.lang.String activityCatetory,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierIdActivityCategory_First(
		long dossierId, java.lang.String activityCatetory,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierIdActivityCategory_Last(
		long dossierId, java.lang.String activityCatetory,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierIdActivityCategory_Last(
		long dossierId, java.lang.String activityCatetory,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByDossierIdActivityCategory_PrevAndNext(
		long id, long dossierId, java.lang.String activityCatetory,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; and activityCatetory = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	*/
	public void removeByDossierIdActivityCategory(long dossierId,
		java.lang.String activityCatetory);

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63; and activityCatetory = &#63;.
	*
	* @param dossierId the dossier ID
	* @param activityCatetory the activity catetory
	* @return the number of matching vr corporation attendees
	*/
	public int countByDossierIdActivityCategory(long dossierId,
		java.lang.String activityCatetory);

	/**
	* Returns all the vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @return the matching vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierIdAssignType_First(
		long dossierId, java.lang.String assignType,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the first vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierIdAssignType_First(
		long dossierId, java.lang.String assignType,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee findByDossierIdAssignType_Last(
		long dossierId, java.lang.String assignType,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the last vr corporation attendee in the ordered set where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation attendee, or <code>null</code> if a matching vr corporation attendee could not be found
	*/
	public VRCorporationAttendee fetchByDossierIdAssignType_Last(
		long dossierId, java.lang.String assignType,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public VRCorporationAttendee[] findByDossierIdAssignType_PrevAndNext(
		long id, long dossierId, java.lang.String assignType,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Removes all the vr corporation attendees where dossierId = &#63; and assignType = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	*/
	public void removeByDossierIdAssignType(long dossierId,
		java.lang.String assignType);

	/**
	* Returns the number of vr corporation attendees where dossierId = &#63; and assignType = &#63;.
	*
	* @param dossierId the dossier ID
	* @param assignType the assign type
	* @return the number of matching vr corporation attendees
	*/
	public int countByDossierIdAssignType(long dossierId,
		java.lang.String assignType);

	/**
	* Caches the vr corporation attendee in the entity cache if it is enabled.
	*
	* @param vrCorporationAttendee the vr corporation attendee
	*/
	public void cacheResult(VRCorporationAttendee vrCorporationAttendee);

	/**
	* Caches the vr corporation attendees in the entity cache if it is enabled.
	*
	* @param vrCorporationAttendees the vr corporation attendees
	*/
	public void cacheResult(
		java.util.List<VRCorporationAttendee> vrCorporationAttendees);

	/**
	* Creates a new vr corporation attendee with the primary key. Does not add the vr corporation attendee to the database.
	*
	* @param id the primary key for the new vr corporation attendee
	* @return the new vr corporation attendee
	*/
	public VRCorporationAttendee create(long id);

	/**
	* Removes the vr corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee that was removed
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee remove(long id)
		throws NoSuchVRCorporationAttendeeException;

	public VRCorporationAttendee updateImpl(
		VRCorporationAttendee vrCorporationAttendee);

	/**
	* Returns the vr corporation attendee with the primary key or throws a {@link NoSuchVRCorporationAttendeeException} if it could not be found.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee
	* @throws NoSuchVRCorporationAttendeeException if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee findByPrimaryKey(long id)
		throws NoSuchVRCorporationAttendeeException;

	/**
	* Returns the vr corporation attendee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee, or <code>null</code> if a vr corporation attendee with the primary key could not be found
	*/
	public VRCorporationAttendee fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCorporationAttendee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr corporation attendees.
	*
	* @return the vr corporation attendees
	*/
	public java.util.List<VRCorporationAttendee> findAll();

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
	public java.util.List<VRCorporationAttendee> findAll(int start, int end);

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
	public java.util.List<VRCorporationAttendee> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator);

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
	public java.util.List<VRCorporationAttendee> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationAttendee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr corporation attendees from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr corporation attendees.
	*
	* @return the number of vr corporation attendees
	*/
	public int countAll();
}