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

import com.fds.vr.business.exception.NoSuchVRRegistrationException;
import com.fds.vr.business.model.VRRegistration;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRRegistrationPersistenceImpl
 * @see VRRegistrationUtil
 * @generated
 */
@ProviderType
public interface VRRegistrationPersistence extends BasePersistence<VRRegistration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRRegistrationUtil} to access the vr registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the vr registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where uuid = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByUuid_PrevAndNext(long registrationId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of vr registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr registrations
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the vr registration where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr registration that was removed
	*/
	public VRRegistration removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the number of vr registrations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr registrations
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByUuid_C_PrevAndNext(long registrationId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr registrations
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByF_submitting_First(long groupId,
		boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByF_submitting_First(long groupId,
		boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByF_submitting_Last(long groupId,
		boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByF_submitting_Last(long groupId,
		boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByF_submitting_PrevAndNext(
		long registrationId, long groupId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and submitting = &#63; from the database.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	*/
	public void removeByF_submitting(long groupId, boolean submitting);

	/**
	* Returns the number of vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @return the number of matching vr registrations
	*/
	public int countByF_submitting(long groupId, boolean submitting);

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByGID_UID(long groupId,
		long userId);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByGID_UID(long groupId,
		long userId, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByGID_UID(long groupId,
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByGID_UID(long groupId,
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByGID_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByGID_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByGID_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByGID_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByGID_UID_PrevAndNext(long registrationId,
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByGID_UID(long groupId, long userId);

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching vr registrations
	*/
	public int countByGID_UID(long groupId, long userId);

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByG_REGID(long groupId, long registrationId)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_REGID(long groupId, long registrationId);

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_REGID(long groupId, long registrationId,
		boolean retrieveFromCache);

	/**
	* Removes the vr registration where groupId = &#63; and registrationId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the vr registration that was removed
	*/
	public VRRegistration removeByG_REGID(long groupId, long registrationId)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the number of vr registrations where groupId = &#63; and registrationId = &#63;.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the number of matching vr registrations
	*/
	public int countByG_REGID(long groupId, long registrationId);

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_USERID_SUBMITTING(
		long groupId, long userId, boolean submitting);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_USERID_SUBMITTING(
		long groupId, long userId, boolean submitting, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_USERID_SUBMITTING(
		long groupId, long userId, boolean submitting, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByF_USERID_SUBMITTING(
		long groupId, long userId, boolean submitting, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByF_USERID_SUBMITTING_First(long groupId,
		long userId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByF_USERID_SUBMITTING_First(long groupId,
		long userId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByF_USERID_SUBMITTING_PrevAndNext(
		long registrationId, long groupId, long userId, boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	*/
	public void removeByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting);

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @return the number of matching vr registrations
	*/
	public int countByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting);

	/**
	* Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByG_APPNO_GOVCODE_First(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_APPNO_GOVCODE_First(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByG_APPNO_GOVCODE_Last(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_APPNO_GOVCODE_Last(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByG_APPNO_GOVCODE_PrevAndNext(
		long registrationId, long groupId, java.lang.String applicantIdNo,
		java.lang.String govAgencyCode, int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63; from the database.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	*/
	public void removeByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState);

	/**
	* Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @return the number of matching vr registrations
	*/
	public int countByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState);

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByG_USER_STATE_First(long groupId, long userId,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_USER_STATE_First(long groupId, long userId,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByG_USER_STATE_Last(long groupId, long userId,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByG_USER_STATE_Last(long groupId, long userId,
		int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByG_USER_STATE_PrevAndNext(
		long registrationId, long groupId, long userId, int registrationState,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	*/
	public void removeByG_USER_STATE(long groupId, long userId,
		int registrationState);

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @return the number of matching vr registrations
	*/
	public int countByG_USER_STATE(long groupId, long userId,
		int registrationState);

	/**
	* Returns the vr registration where applicantIdNo = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByREG_APPNO(java.lang.String applicantIdNo)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByREG_APPNO(java.lang.String applicantIdNo);

	/**
	* Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applicantIdNo the applicant ID no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByREG_APPNO(java.lang.String applicantIdNo,
		boolean retrieveFromCache);

	/**
	* Removes the vr registration where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @return the vr registration that was removed
	*/
	public VRRegistration removeByREG_APPNO(java.lang.String applicantIdNo)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the number of vr registrations where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr registrations
	*/
	public int countByREG_APPNO(java.lang.String applicantIdNo);

	/**
	* Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @return the matching vr registrations
	*/
	public java.util.List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted);

	/**
	* Returns a range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr registrations
	*/
	public java.util.List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByREG_APPNO_markasdeleted_First(long groupId,
		java.lang.String applicantIdNo, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByREG_APPNO_markasdeleted_First(long groupId,
		java.lang.String applicantIdNo, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public VRRegistration findByREG_APPNO_markasdeleted_Last(long groupId,
		java.lang.String applicantIdNo, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public VRRegistration fetchByREG_APPNO_markasdeleted_Last(long groupId,
		java.lang.String applicantIdNo, int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration[] findByREG_APPNO_markasdeleted_PrevAndNext(
		long registrationId, long groupId, java.lang.String applicantIdNo,
		int markasdeleted,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator)
		throws NoSuchVRRegistrationException;

	/**
	* Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63; from the database.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	*/
	public void removeByREG_APPNO_markasdeleted(long groupId,
		java.lang.String applicantIdNo, int markasdeleted);

	/**
	* Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @return the number of matching vr registrations
	*/
	public int countByREG_APPNO_markasdeleted(long groupId,
		java.lang.String applicantIdNo, int markasdeleted);

	/**
	* Caches the vr registration in the entity cache if it is enabled.
	*
	* @param vrRegistration the vr registration
	*/
	public void cacheResult(VRRegistration vrRegistration);

	/**
	* Caches the vr registrations in the entity cache if it is enabled.
	*
	* @param vrRegistrations the vr registrations
	*/
	public void cacheResult(java.util.List<VRRegistration> vrRegistrations);

	/**
	* Creates a new vr registration with the primary key. Does not add the vr registration to the database.
	*
	* @param registrationId the primary key for the new vr registration
	* @return the new vr registration
	*/
	public VRRegistration create(long registrationId);

	/**
	* Removes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration that was removed
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration remove(long registrationId)
		throws NoSuchVRRegistrationException;

	public VRRegistration updateImpl(VRRegistration vrRegistration);

	/**
	* Returns the vr registration with the primary key or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public VRRegistration findByPrimaryKey(long registrationId)
		throws NoSuchVRRegistrationException;

	/**
	* Returns the vr registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration, or <code>null</code> if a vr registration with the primary key could not be found
	*/
	public VRRegistration fetchByPrimaryKey(long registrationId);

	@Override
	public java.util.Map<java.io.Serializable, VRRegistration> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr registrations.
	*
	* @return the vr registrations
	*/
	public java.util.List<VRRegistration> findAll();

	/**
	* Returns a range of all the vr registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of vr registrations
	*/
	public java.util.List<VRRegistration> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr registrations
	*/
	public java.util.List<VRRegistration> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator);

	/**
	* Returns an ordered range of all the vr registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr registrations
	*/
	public java.util.List<VRRegistration> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr registrations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr registrations.
	*
	* @return the number of vr registrations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}