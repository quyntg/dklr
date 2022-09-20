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

import com.fds.vr.business.model.VRRegistration;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr registration service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRRegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRRegistrationPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRRegistrationPersistenceImpl
 * @generated
 */
@ProviderType
public class VRRegistrationUtil {
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
	public static void clearCache(VRRegistration vrRegistration) {
		getPersistence().clearCache(vrRegistration);
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
	public static List<VRRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRRegistration update(VRRegistration vrRegistration) {
		return getPersistence().update(vrRegistration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRRegistration update(VRRegistration vrRegistration,
		ServiceContext serviceContext) {
		return getPersistence().update(vrRegistration, serviceContext);
	}

	/**
	* Returns all the vr registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByUuid(java.lang.String uuid,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByUuid_First(java.lang.String uuid,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the vr registrations before and after the current vr registration in the ordered set where uuid = &#63;.
	*
	* @param registrationId the primary key of the current vr registration
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public static VRRegistration[] findByUuid_PrevAndNext(long registrationId,
		java.lang.String uuid,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByUuid_PrevAndNext(registrationId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the vr registrations where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of vr registrations where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr registrations
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr registration where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the vr registration where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr registration that was removed
	*/
	public static VRRegistration removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of vr registrations where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr registrations
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static VRRegistration[] findByUuid_C_PrevAndNext(
		long registrationId, java.lang.String uuid, long companyId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(registrationId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the vr registrations where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of vr registrations where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr registrations
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting) {
		return getPersistence().findByF_submitting(groupId, submitting);
	}

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
	public static List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end) {
		return getPersistence()
				   .findByF_submitting(groupId, submitting, start, end);
	}

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
	public static List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByF_submitting(groupId, submitting, start, end,
			orderByComparator);
	}

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
	public static List<VRRegistration> findByF_submitting(long groupId,
		boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_submitting(groupId, submitting, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByF_submitting_First(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_submitting_First(groupId, submitting,
			orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByF_submitting_First(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByF_submitting_First(groupId, submitting,
			orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByF_submitting_Last(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_submitting_Last(groupId, submitting,
			orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByF_submitting_Last(long groupId,
		boolean submitting, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByF_submitting_Last(groupId, submitting,
			orderByComparator);
	}

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
	public static VRRegistration[] findByF_submitting_PrevAndNext(
		long registrationId, long groupId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_submitting_PrevAndNext(registrationId, groupId,
			submitting, orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and submitting = &#63; from the database.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	*/
	public static void removeByF_submitting(long groupId, boolean submitting) {
		getPersistence().removeByF_submitting(groupId, submitting);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param submitting the submitting
	* @return the number of matching vr registrations
	*/
	public static int countByF_submitting(long groupId, boolean submitting) {
		return getPersistence().countByF_submitting(groupId, submitting);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByGID_UID(long groupId, long userId) {
		return getPersistence().findByGID_UID(groupId, userId);
	}

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
	public static List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end) {
		return getPersistence().findByGID_UID(groupId, userId, start, end);
	}

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
	public static List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByGID_UID(groupId, userId, start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByGID_UID(long groupId, long userId,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGID_UID(groupId, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByGID_UID_First(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByGID_UID_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByGID_UID_First(long groupId,
		long userId, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByGID_UID_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByGID_UID_Last(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByGID_UID_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByGID_UID_Last(long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByGID_UID_Last(groupId, userId, orderByComparator);
	}

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
	public static VRRegistration[] findByGID_UID_PrevAndNext(
		long registrationId, long groupId, long userId,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByGID_UID_PrevAndNext(registrationId, groupId, userId,
			orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public static void removeByGID_UID(long groupId, long userId) {
		getPersistence().removeByGID_UID(groupId, userId);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching vr registrations
	*/
	public static int countByGID_UID(long groupId, long userId) {
		return getPersistence().countByGID_UID(groupId, userId);
	}

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByG_REGID(long groupId, long registrationId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByG_REGID(groupId, registrationId);
	}

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByG_REGID(long groupId,
		long registrationId) {
		return getPersistence().fetchByG_REGID(groupId, registrationId);
	}

	/**
	* Returns the vr registration where groupId = &#63; and registrationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByG_REGID(long groupId,
		long registrationId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByG_REGID(groupId, registrationId, retrieveFromCache);
	}

	/**
	* Removes the vr registration where groupId = &#63; and registrationId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the vr registration that was removed
	*/
	public static VRRegistration removeByG_REGID(long groupId,
		long registrationId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().removeByG_REGID(groupId, registrationId);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and registrationId = &#63;.
	*
	* @param groupId the group ID
	* @param registrationId the registration ID
	* @return the number of matching vr registrations
	*/
	public static int countByG_REGID(long groupId, long registrationId) {
		return getPersistence().countByG_REGID(groupId, registrationId);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting) {
		return getPersistence()
				   .findByF_USERID_SUBMITTING(groupId, userId, submitting);
	}

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
	public static List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end) {
		return getPersistence()
				   .findByF_USERID_SUBMITTING(groupId, userId, submitting,
			start, end);
	}

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
	public static List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByF_USERID_SUBMITTING(groupId, userId, submitting,
			start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByF_USERID_SUBMITTING(long groupId,
		long userId, boolean submitting, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_USERID_SUBMITTING(groupId, userId, submitting,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VRRegistration findByF_USERID_SUBMITTING_First(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_USERID_SUBMITTING_First(groupId, userId,
			submitting, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByF_USERID_SUBMITTING_First(
		long groupId, long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByF_USERID_SUBMITTING_First(groupId, userId,
			submitting, orderByComparator);
	}

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
	public static VRRegistration findByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_USERID_SUBMITTING_Last(groupId, userId, submitting,
			orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByF_USERID_SUBMITTING_Last(long groupId,
		long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByF_USERID_SUBMITTING_Last(groupId, userId,
			submitting, orderByComparator);
	}

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
	public static VRRegistration[] findByF_USERID_SUBMITTING_PrevAndNext(
		long registrationId, long groupId, long userId, boolean submitting,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByF_USERID_SUBMITTING_PrevAndNext(registrationId,
			groupId, userId, submitting, orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	*/
	public static void removeByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting) {
		getPersistence().removeByF_USERID_SUBMITTING(groupId, userId, submitting);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63; and submitting = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param submitting the submitting
	* @return the number of matching vr registrations
	*/
	public static int countByF_USERID_SUBMITTING(long groupId, long userId,
		boolean submitting) {
		return getPersistence()
				   .countByF_USERID_SUBMITTING(groupId, userId, submitting);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState) {
		return getPersistence()
				   .findByG_APPNO_GOVCODE(groupId, applicantIdNo,
			govAgencyCode, registrationState);
	}

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
	public static List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end) {
		return getPersistence()
				   .findByG_APPNO_GOVCODE(groupId, applicantIdNo,
			govAgencyCode, registrationState, start, end);
	}

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
	public static List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByG_APPNO_GOVCODE(groupId, applicantIdNo,
			govAgencyCode, registrationState, start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_APPNO_GOVCODE(groupId, applicantIdNo,
			govAgencyCode, registrationState, start, end, orderByComparator,
			retrieveFromCache);
	}

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
	public static VRRegistration findByG_APPNO_GOVCODE_First(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_APPNO_GOVCODE_First(groupId, applicantIdNo,
			govAgencyCode, registrationState, orderByComparator);
	}

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
	public static VRRegistration fetchByG_APPNO_GOVCODE_First(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByG_APPNO_GOVCODE_First(groupId, applicantIdNo,
			govAgencyCode, registrationState, orderByComparator);
	}

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
	public static VRRegistration findByG_APPNO_GOVCODE_Last(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_APPNO_GOVCODE_Last(groupId, applicantIdNo,
			govAgencyCode, registrationState, orderByComparator);
	}

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
	public static VRRegistration fetchByG_APPNO_GOVCODE_Last(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByG_APPNO_GOVCODE_Last(groupId, applicantIdNo,
			govAgencyCode, registrationState, orderByComparator);
	}

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
	public static VRRegistration[] findByG_APPNO_GOVCODE_PrevAndNext(
		long registrationId, long groupId, java.lang.String applicantIdNo,
		java.lang.String govAgencyCode, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_APPNO_GOVCODE_PrevAndNext(registrationId, groupId,
			applicantIdNo, govAgencyCode, registrationState, orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63; from the database.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	*/
	public static void removeByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState) {
		getPersistence()
			.removeByG_APPNO_GOVCODE(groupId, applicantIdNo, govAgencyCode,
			registrationState);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and govAgencyCode = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param govAgencyCode the gov agency code
	* @param registrationState the registration state
	* @return the number of matching vr registrations
	*/
	public static int countByG_APPNO_GOVCODE(long groupId,
		java.lang.String applicantIdNo, java.lang.String govAgencyCode,
		int registrationState) {
		return getPersistence()
				   .countByG_APPNO_GOVCODE(groupId, applicantIdNo,
			govAgencyCode, registrationState);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState) {
		return getPersistence()
				   .findByG_USER_STATE(groupId, userId, registrationState);
	}

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
	public static List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end) {
		return getPersistence()
				   .findByG_USER_STATE(groupId, userId, registrationState,
			start, end);
	}

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
	public static List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByG_USER_STATE(groupId, userId, registrationState,
			start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByG_USER_STATE(long groupId,
		long userId, int registrationState, int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_USER_STATE(groupId, userId, registrationState,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VRRegistration findByG_USER_STATE_First(long groupId,
		long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_USER_STATE_First(groupId, userId,
			registrationState, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByG_USER_STATE_First(long groupId,
		long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByG_USER_STATE_First(groupId, userId,
			registrationState, orderByComparator);
	}

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
	public static VRRegistration findByG_USER_STATE_Last(long groupId,
		long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_USER_STATE_Last(groupId, userId, registrationState,
			orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByG_USER_STATE_Last(long groupId,
		long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByG_USER_STATE_Last(groupId, userId,
			registrationState, orderByComparator);
	}

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
	public static VRRegistration[] findByG_USER_STATE_PrevAndNext(
		long registrationId, long groupId, long userId, int registrationState,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByG_USER_STATE_PrevAndNext(registrationId, groupId,
			userId, registrationState, orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	*/
	public static void removeByG_USER_STATE(long groupId, long userId,
		int registrationState) {
		getPersistence().removeByG_USER_STATE(groupId, userId, registrationState);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and userId = &#63; and registrationState = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param registrationState the registration state
	* @return the number of matching vr registrations
	*/
	public static int countByG_USER_STATE(long groupId, long userId,
		int registrationState) {
		return getPersistence()
				   .countByG_USER_STATE(groupId, userId, registrationState);
	}

	/**
	* Returns the vr registration where applicantIdNo = &#63; or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr registration
	* @throws NoSuchVRRegistrationException if a matching vr registration could not be found
	*/
	public static VRRegistration findByREG_APPNO(java.lang.String applicantIdNo)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByREG_APPNO(applicantIdNo);
	}

	/**
	* Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByREG_APPNO(
		java.lang.String applicantIdNo) {
		return getPersistence().fetchByREG_APPNO(applicantIdNo);
	}

	/**
	* Returns the vr registration where applicantIdNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applicantIdNo the applicant ID no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByREG_APPNO(
		java.lang.String applicantIdNo, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByREG_APPNO(applicantIdNo, retrieveFromCache);
	}

	/**
	* Removes the vr registration where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @return the vr registration that was removed
	*/
	public static VRRegistration removeByREG_APPNO(
		java.lang.String applicantIdNo)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().removeByREG_APPNO(applicantIdNo);
	}

	/**
	* Returns the number of vr registrations where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr registrations
	*/
	public static int countByREG_APPNO(java.lang.String applicantIdNo) {
		return getPersistence().countByREG_APPNO(applicantIdNo);
	}

	/**
	* Returns all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @return the matching vr registrations
	*/
	public static List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted) {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted);
	}

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
	public static List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end) {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, start, end);
	}

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
	public static List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end, OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findByREG_APPNO_markasdeleted(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VRRegistration findByREG_APPNO_markasdeleted_First(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted_First(groupId, applicantIdNo,
			markasdeleted, orderByComparator);
	}

	/**
	* Returns the first vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByREG_APPNO_markasdeleted_First(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByREG_APPNO_markasdeleted_First(groupId,
			applicantIdNo, markasdeleted, orderByComparator);
	}

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
	public static VRRegistration findByREG_APPNO_markasdeleted_Last(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted_Last(groupId, applicantIdNo,
			markasdeleted, orderByComparator);
	}

	/**
	* Returns the last vr registration in the ordered set where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static VRRegistration fetchByREG_APPNO_markasdeleted_Last(
		long groupId, java.lang.String applicantIdNo, int markasdeleted,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence()
				   .fetchByREG_APPNO_markasdeleted_Last(groupId, applicantIdNo,
			markasdeleted, orderByComparator);
	}

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
	public static VRRegistration[] findByREG_APPNO_markasdeleted_PrevAndNext(
		long registrationId, long groupId, java.lang.String applicantIdNo,
		int markasdeleted, OrderByComparator<VRRegistration> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence()
				   .findByREG_APPNO_markasdeleted_PrevAndNext(registrationId,
			groupId, applicantIdNo, markasdeleted, orderByComparator);
	}

	/**
	* Removes all the vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63; from the database.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	*/
	public static void removeByREG_APPNO_markasdeleted(long groupId,
		java.lang.String applicantIdNo, int markasdeleted) {
		getPersistence()
			.removeByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted);
	}

	/**
	* Returns the number of vr registrations where groupId = &#63; and applicantIdNo = &#63; and markasdeleted = &#63;.
	*
	* @param groupId the group ID
	* @param applicantIdNo the applicant ID no
	* @param markasdeleted the markasdeleted
	* @return the number of matching vr registrations
	*/
	public static int countByREG_APPNO_markasdeleted(long groupId,
		java.lang.String applicantIdNo, int markasdeleted) {
		return getPersistence()
				   .countByREG_APPNO_markasdeleted(groupId, applicantIdNo,
			markasdeleted);
	}

	/**
	* Caches the vr registration in the entity cache if it is enabled.
	*
	* @param vrRegistration the vr registration
	*/
	public static void cacheResult(VRRegistration vrRegistration) {
		getPersistence().cacheResult(vrRegistration);
	}

	/**
	* Caches the vr registrations in the entity cache if it is enabled.
	*
	* @param vrRegistrations the vr registrations
	*/
	public static void cacheResult(List<VRRegistration> vrRegistrations) {
		getPersistence().cacheResult(vrRegistrations);
	}

	/**
	* Creates a new vr registration with the primary key. Does not add the vr registration to the database.
	*
	* @param registrationId the primary key for the new vr registration
	* @return the new vr registration
	*/
	public static VRRegistration create(long registrationId) {
		return getPersistence().create(registrationId);
	}

	/**
	* Removes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration that was removed
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public static VRRegistration remove(long registrationId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().remove(registrationId);
	}

	public static VRRegistration updateImpl(VRRegistration vrRegistration) {
		return getPersistence().updateImpl(vrRegistration);
	}

	/**
	* Returns the vr registration with the primary key or throws a {@link NoSuchVRRegistrationException} if it could not be found.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration
	* @throws NoSuchVRRegistrationException if a vr registration with the primary key could not be found
	*/
	public static VRRegistration findByPrimaryKey(long registrationId)
		throws com.fds.vr.business.exception.NoSuchVRRegistrationException {
		return getPersistence().findByPrimaryKey(registrationId);
	}

	/**
	* Returns the vr registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration, or <code>null</code> if a vr registration with the primary key could not be found
	*/
	public static VRRegistration fetchByPrimaryKey(long registrationId) {
		return getPersistence().fetchByPrimaryKey(registrationId);
	}

	public static java.util.Map<java.io.Serializable, VRRegistration> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr registrations.
	*
	* @return the vr registrations
	*/
	public static List<VRRegistration> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRRegistration> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRRegistration> findAll(int start, int end,
		OrderByComparator<VRRegistration> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRRegistration> findAll(int start, int end,
		OrderByComparator<VRRegistration> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr registrations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr registrations.
	*
	* @return the number of vr registrations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRRegistrationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRRegistrationPersistence, VRRegistrationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRRegistrationPersistence.class);
}