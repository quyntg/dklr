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

import com.fds.vr.business.model.VRDossier;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr dossier service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRDossierPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRDossierPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRDossierPersistenceImpl
 * @generated
 */
@ProviderType
public class VRDossierUtil {
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
	public static void clearCache(VRDossier vrDossier) {
		getPersistence().clearCache(vrDossier);
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
	public static List<VRDossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRDossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRDossier> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRDossier update(VRDossier vrDossier) {
		return getPersistence().update(vrDossier);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRDossier update(VRDossier vrDossier,
		ServiceContext serviceContext) {
		return getPersistence().update(vrDossier, serviceContext);
	}

	/**
	* Returns all the vr dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByUuid_First(java.lang.String uuid,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByUuid_PrevAndNext(long dossierId,
		java.lang.String uuid, OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByUuid_PrevAndNext(dossierId, uuid, orderByComparator);
	}

	/**
	* Removes all the vr dossiers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of vr dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr dossiers
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByUUID_G(java.lang.String uuid, long groupId)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the vr dossier where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr dossier that was removed
	*/
	public static VRDossier removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of vr dossiers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr dossiers
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByUuid_C_PrevAndNext(long dossierId,
		java.lang.String uuid, long companyId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(dossierId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the vr dossiers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr dossiers
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_UID(long groupId, long userId) {
		return getPersistence().findByG_UID(groupId, userId);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end) {
		return getPersistence().findByG_UID(groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end, OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_UID(groupId, userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_UID(groupId, userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_UID_First(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_UID_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_UID_First(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_UID_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_UID_Last(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_UID_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_UID_Last(long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_UID_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByG_UID_PrevAndNext(long dossierId,
		long groupId, long userId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_UID_PrevAndNext(dossierId, groupId, userId,
			orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public static void removeByG_UID(long groupId, long userId) {
		getPersistence().removeByG_UID(groupId, userId);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching vr dossiers
	*/
	public static int countByG_UID(long groupId, long userId) {
		return getPersistence().countByG_UID(groupId, userId);
	}

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_REF(long groupId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().findByG_REF(groupId, referenceUid);
	}

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_REF(long groupId,
		java.lang.String referenceUid) {
		return getPersistence().fetchByG_REF(groupId, referenceUid);
	}

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_REF(long groupId,
		java.lang.String referenceUid, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByG_REF(groupId, referenceUid, retrieveFromCache);
	}

	/**
	* Removes the vr dossier where groupId = &#63; and referenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the vr dossier that was removed
	*/
	public static VRDossier removeByG_REF(long groupId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().removeByG_REF(groupId, referenceUid);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and referenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossiers
	*/
	public static int countByG_REF(long groupId, java.lang.String referenceUid) {
		return getPersistence().countByG_REF(groupId, referenceUid);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode) {
		return getPersistence().findByG_SC(groupId, serviceCode);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end) {
		return getPersistence().findByG_SC(groupId, serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_SC(groupId, serviceCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_SC(groupId, serviceCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_SC_First(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_SC_First(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_SC_First(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_SC_First(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_SC_Last(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_SC_Last(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_SC_Last(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_SC_Last(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByG_SC_PrevAndNext(long dossierId,
		long groupId, java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_SC_PrevAndNext(dossierId, groupId, serviceCode,
			orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public static void removeByG_SC(long groupId, java.lang.String serviceCode) {
		getPersistence().removeByG_SC(groupId, serviceCode);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching vr dossiers
	*/
	public static int countByG_SC(long groupId, java.lang.String serviceCode) {
		return getPersistence().countByG_SC(groupId, serviceCode);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode) {
		return getPersistence().findByG_GAC(groupId, serviceCode);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end) {
		return getPersistence().findByG_GAC(groupId, serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_GAC(groupId, serviceCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_GAC(groupId, serviceCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_GAC_First(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_GAC_First(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_GAC_Last(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_GAC_Last(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_GAC_Last(long groupId,
		java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_GAC_Last(groupId, serviceCode, orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByG_GAC_PrevAndNext(long dossierId,
		long groupId, java.lang.String serviceCode,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_GAC_PrevAndNext(dossierId, groupId, serviceCode,
			orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public static void removeByG_GAC(long groupId, java.lang.String serviceCode) {
		getPersistence().removeByG_GAC(groupId, serviceCode);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching vr dossiers
	*/
	public static int countByG_GAC(long groupId, java.lang.String serviceCode) {
		return getPersistence().countByG_GAC(groupId, serviceCode);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo) {
		return getPersistence().findByG_DTN(groupId, dossierTemplateNo);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end) {
		return getPersistence()
				   .findByG_DTN(groupId, dossierTemplateNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_DTN(groupId, dossierTemplateNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_DTN(groupId, dossierTemplateNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_DTN_First(groupId, dossierTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_DTN_First(groupId, dossierTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_DTN_Last(groupId, dossierTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_DTN_Last(groupId, dossierTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByG_DTN_PrevAndNext(long dossierId,
		long groupId, java.lang.String dossierTemplateNo,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_DTN_PrevAndNext(dossierId, groupId,
			dossierTemplateNo, orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	*/
	public static void removeByG_DTN(long groupId,
		java.lang.String dossierTemplateNo) {
		getPersistence().removeByG_DTN(groupId, dossierTemplateNo);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the number of matching vr dossiers
	*/
	public static int countByG_DTN(long groupId,
		java.lang.String dossierTemplateNo) {
		return getPersistence().countByG_DTN(groupId, dossierTemplateNo);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_DID(long groupId, long dossierId) {
		return getPersistence().findByG_DID(groupId, dossierId);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end) {
		return getPersistence().findByG_DID(groupId, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end, OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_DID(groupId, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end, OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_DID(groupId, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_DID_First(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_DID_First(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_DID_First(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_DID_First(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_DID_Last(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_DID_Last(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_DID_Last(long groupId, long dossierId,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_DID_Last(groupId, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	*/
	public static void removeByG_DID(long groupId, long dossierId) {
		getPersistence().removeByG_DID(groupId, dossierId);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching vr dossiers
	*/
	public static int countByG_DID(long groupId, long dossierId) {
		return getPersistence().countByG_DID(groupId, dossierId);
	}

	/**
	* Returns all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the matching vr dossiers
	*/
	public static List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus) {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus);
	}

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end) {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public static List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS_First(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_C_GAC_SC_DTNO_NOTDS_First(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public static VRDossier findByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS_Last(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence()
				   .fetchByG_C_GAC_SC_DTNO_NOTDS_Last(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus,
			orderByComparator);
	}

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier[] findByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(
		long dossierId, long groupId, long companyId,
		java.lang.String govAgencyCode, java.lang.String serviceCode,
		java.lang.String dossierTemplateNo, java.lang.String dossierStatus,
		OrderByComparator<VRDossier> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence()
				   .findByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(dossierId, groupId,
			companyId, govAgencyCode, serviceCode, dossierTemplateNo,
			dossierStatus, orderByComparator);
	}

	/**
	* Removes all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	*/
	public static void removeByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus) {
		getPersistence()
			.removeByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId, govAgencyCode,
			serviceCode, dossierTemplateNo, dossierStatus);
	}

	/**
	* Returns the number of vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the number of matching vr dossiers
	*/
	public static int countByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus) {
		return getPersistence()
				   .countByG_C_GAC_SC_DTNO_NOTDS(groupId, companyId,
			govAgencyCode, serviceCode, dossierTemplateNo, dossierStatus);
	}

	/**
	* Caches the vr dossier in the entity cache if it is enabled.
	*
	* @param vrDossier the vr dossier
	*/
	public static void cacheResult(VRDossier vrDossier) {
		getPersistence().cacheResult(vrDossier);
	}

	/**
	* Caches the vr dossiers in the entity cache if it is enabled.
	*
	* @param vrDossiers the vr dossiers
	*/
	public static void cacheResult(List<VRDossier> vrDossiers) {
		getPersistence().cacheResult(vrDossiers);
	}

	/**
	* Creates a new vr dossier with the primary key. Does not add the vr dossier to the database.
	*
	* @param dossierId the primary key for the new vr dossier
	* @return the new vr dossier
	*/
	public static VRDossier create(long dossierId) {
		return getPersistence().create(dossierId);
	}

	/**
	* Removes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier that was removed
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier remove(long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().remove(dossierId);
	}

	public static VRDossier updateImpl(VRDossier vrDossier) {
		return getPersistence().updateImpl(vrDossier);
	}

	/**
	* Returns the vr dossier with the primary key or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public static VRDossier findByPrimaryKey(long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRDossierException {
		return getPersistence().findByPrimaryKey(dossierId);
	}

	/**
	* Returns the vr dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier, or <code>null</code> if a vr dossier with the primary key could not be found
	*/
	public static VRDossier fetchByPrimaryKey(long dossierId) {
		return getPersistence().fetchByPrimaryKey(dossierId);
	}

	public static java.util.Map<java.io.Serializable, VRDossier> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr dossiers.
	*
	* @return the vr dossiers
	*/
	public static List<VRDossier> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of vr dossiers
	*/
	public static List<VRDossier> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr dossiers
	*/
	public static List<VRDossier> findAll(int start, int end,
		OrderByComparator<VRDossier> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr dossiers
	*/
	public static List<VRDossier> findAll(int start, int end,
		OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr dossiers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr dossiers.
	*
	* @return the number of vr dossiers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRDossierPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRDossierPersistence, VRDossierPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRDossierPersistence.class);
}