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

import com.fds.vr.business.model.VRProductionPlant;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr production plant service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantUtil {
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
	public static void clearCache(VRProductionPlant vrProductionPlant) {
		getPersistence().clearCache(vrProductionPlant);
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
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductionPlant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductionPlant update(VRProductionPlant vrProductionPlant) {
		return getPersistence().update(vrProductionPlant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductionPlant update(
		VRProductionPlant vrProductionPlant, ServiceContext serviceContext) {
		return getPersistence().update(vrProductionPlant, serviceContext);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId) {
		return getPersistence()
				   .findByregistrationFormId(mtCore, applicantProfileId,
			registrationId);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end) {
		return getPersistence()
				   .findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByregistrationFormId(mtCore, applicantProfileId,
			registrationId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByregistrationFormId_First(
		long mtCore, long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByregistrationFormId_First(mtCore, applicantProfileId,
			registrationId, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByregistrationFormId_First(
		long mtCore, long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByregistrationFormId_First(mtCore, applicantProfileId,
			registrationId, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByregistrationFormId_Last(long mtCore,
		long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByregistrationFormId_Last(mtCore, applicantProfileId,
			registrationId, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByregistrationFormId_Last(
		long mtCore, long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByregistrationFormId_Last(mtCore, applicantProfileId,
			registrationId, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByregistrationFormId_PrevAndNext(
		long id, long mtCore, long applicantProfileId, long registrationId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByregistrationFormId_PrevAndNext(id, mtCore,
			applicantProfileId, registrationId, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	*/
	public static void removeByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId) {
		getPersistence()
			.removeByregistrationFormId(mtCore, applicantProfileId,
			registrationId);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @return the number of matching vr production plants
	*/
	public static int countByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId) {
		return getPersistence()
				   .countByregistrationFormId(mtCore, applicantProfileId,
			registrationId);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus) {
		return getPersistence().findBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingStatus_First(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchBymappingStatus_First(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingStatus_Last(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchBymappingStatus_Last(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findBymappingStatus_PrevAndNext(long id,
		long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingStatus_PrevAndNext(id, mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and mappingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	*/
	public static void removeBymappingStatus(long mtCore,
		java.lang.String mappingStatus) {
		getPersistence().removeBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the number of matching vr production plants
	*/
	public static int countBymappingStatus(long mtCore,
		java.lang.String mappingStatus) {
		return getPersistence().countBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode) {
		return getPersistence().findByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantCode_First(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCode_First(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantCode_Last(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCode_Last(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByapplicantCode_PrevAndNext(long id,
		long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantCode_PrevAndNext(id, mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	*/
	public static void removeByapplicantCode(long mtCore,
		java.lang.String applicantCode) {
		getPersistence().removeByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the number of matching vr production plants
	*/
	public static int countByapplicantCode(long mtCore,
		java.lang.String applicantCode) {
		return getPersistence().countByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence().findByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().fetchByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_ProductionPlantCode(productionPlantCode,
			retrieveFromCache);
	}

	/**
	* Removes the vr production plant where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	* @return the vr production plant that was removed
	*/
	public static VRProductionPlant removeByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .removeByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the number of vr production plants where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plants
	*/
	public static int countByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().countByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantCode_First(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_First(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantCode_Last(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_Last(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantCode_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	*/
	public static void removeByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode) {
		getPersistence()
			.removeByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode) {
		return getPersistence()
				   .countByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR) {
		return getPersistence()
				   .findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end) {
		return getPersistence()
				   .findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findBymappingMA_XUONG_LR_First(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingMA_XUONG_LR_First(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchBymappingMA_XUONG_LR_First(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchBymappingMA_XUONG_LR_First(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findBymappingMA_XUONG_LR_Last(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingMA_XUONG_LR_Last(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchBymappingMA_XUONG_LR_Last(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchBymappingMA_XUONG_LR_Last(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findBymappingMA_XUONG_LR_PrevAndNext(
		long id, long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findBymappingMA_XUONG_LR_PrevAndNext(id, mtCore,
			mappingMA_CTY, mappingMA_XUONG_LR, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	*/
	public static void removeBymappingMA_XUONG_LR(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR) {
		getPersistence()
			.removeBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @return the number of matching vr production plants
	*/
	public static int countBymappingMA_XUONG_LR(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR) {
		return getPersistence()
				   .countBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType) {
		return getPersistence()
				   .findByproductionPlantType(mtCore, productionPlantType);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end) {
		return getPersistence()
				   .findByproductionPlantType(mtCore, productionPlantType,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantType(mtCore, productionPlantType,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantType(mtCore, productionPlantType,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantType_First(
		long mtCore, java.lang.String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantType_First(mtCore,
			productionPlantType, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantType_First(
		long mtCore, java.lang.String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantType_First(mtCore,
			productionPlantType, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantType_Last(
		long mtCore, java.lang.String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantType_Last(mtCore, productionPlantType,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantType_Last(
		long mtCore, java.lang.String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantType_Last(mtCore,
			productionPlantType, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantType_PrevAndNext(
		long id, long mtCore, java.lang.String productionPlantType,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantType_PrevAndNext(id, mtCore,
			productionPlantType, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and productionPlantType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	*/
	public static void removeByproductionPlantType(long mtCore,
		java.lang.String productionPlantType) {
		getPersistence().removeByproductionPlantType(mtCore, productionPlantType);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantType(long mtCore,
		java.lang.String productionPlantType) {
		return getPersistence()
				   .countByproductionPlantType(mtCore, productionPlantType);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus) {
		return getPersistence()
				   .findByproductionPlantStatus(mtCore, productionPlantStatus);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start, int end) {
		return getPersistence()
				   .findByproductionPlantStatus(mtCore, productionPlantStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantStatus(mtCore, productionPlantStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start,
		int end, OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantStatus(mtCore, productionPlantStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_First(
		long mtCore, java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_First(mtCore,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_First(
		long mtCore, java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_First(mtCore,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_Last(
		long mtCore, java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_Last(mtCore,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_Last(
		long mtCore, java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_Last(mtCore,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantStatus_PrevAndNext(
		long id, long mtCore, java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PrevAndNext(id, mtCore,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	*/
	public static void removeByproductionPlantStatus(long mtCore,
		java.lang.String productionPlantStatus) {
		getPersistence()
			.removeByproductionPlantStatus(mtCore, productionPlantStatus);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantStatus(long mtCore,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .countByproductionPlantStatus(mtCore, productionPlantStatus);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end) {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode_First(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPCode_First(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode_Last(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPCode_Last(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantStatus_PPCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPCode_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	*/
	public static void removeByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus) {
		getPersistence()
			.removeByproductionPlantStatus_PPCode(mtCore, applicantProfileId,
			productionPlantCode, productionPlantStatus);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .countByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .findByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end) {
		return getPersistence()
				   .findByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPName_First(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPName_First(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPName_Last(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPName_Last(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantStatus_PPName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPName_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	*/
	public static void removeByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantStatus) {
		getPersistence()
			.removeByproductionPlantStatus_PPName(mtCore, applicantProfileId,
			productionPlantName, productionPlantStatus);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .countByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end) {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress_First(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPAddress_First(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantStatus_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantStatus_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantStatus_PPAddress_PrevAndNext(id,
			mtCore, applicantProfileId, productionPlantAddress,
			productionPlantStatus, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	*/
	public static void removeByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus) {
		getPersistence()
			.removeByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus) {
		return getPersistence()
				   .countByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .findByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end) {
		return getPersistence()
				   .findByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_PPAddress_First(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_PPAddress_First(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantName_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_PPAddress_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public static void removeByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		getPersistence()
			.removeByproductionPlantName_PPAddress(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .countByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end) {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress_First(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantRep_PPAddress_First(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantRep_PPAddress_Last(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantRep_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantRep_PPAddress_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	*/
	public static void removeByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress) {
		getPersistence()
			.removeByproductionPlantRep_PPAddress(mtCore, applicantProfileId,
			productionPlantRepresentative, productionPlantAddress);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .countByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress);
	}

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName);
	}

	/**
	* Returns a range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_First(mtCore, applicantProfileId,
			productionPlantName, orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_First(mtCore,
			applicantProfileId, productionPlantName, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByproductionPlantName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_Last(mtCore, applicantProfileId,
			productionPlantName, orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByproductionPlantName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_Last(mtCore, applicantProfileId,
			productionPlantName, orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByproductionPlantName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByproductionPlantName_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantName, orderByComparator);
	}

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	*/
	public static void removeByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName) {
		getPersistence()
			.removeByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @return the number of matching vr production plants
	*/
	public static int countByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName) {
		return getPersistence()
				   .countByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName);
	}

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId);
	}

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId) {
		return getPersistence()
				   .fetchByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId);
	}

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId, retrieveFromCache);
	}

	/**
	* Removes the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the vr production plant that was removed
	*/
	public static VRProductionPlant removeByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .removeByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId);
	}

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the number of matching vr production plants
	*/
	public static int countByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId) {
		return getPersistence()
				   .countByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId);
	}

	/**
	* Returns all the vr production plants where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId) {
		return getPersistence().findByapplicantProfileId(applicantProfileId);
	}

	/**
	* Returns a range of all the vr production plants where applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end) {
		return getPersistence()
				   .findByapplicantProfileId(applicantProfileId, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants where applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileId(applicantProfileId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants where applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plants
	*/
	public static List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileId(applicantProfileId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByapplicantProfileId_First(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantProfileId_First(applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByapplicantProfileId_First(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_First(applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public static VRProductionPlant findByapplicantProfileId_Last(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantProfileId_Last(applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public static VRProductionPlant fetchByapplicantProfileId_Last(
		long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_Last(applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant[] findByapplicantProfileId_PrevAndNext(
		long id, long applicantProfileId,
		OrderByComparator<VRProductionPlant> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence()
				   .findByapplicantProfileId_PrevAndNext(id,
			applicantProfileId, orderByComparator);
	}

	/**
	* Removes all the vr production plants where applicantProfileId = &#63; from the database.
	*
	* @param applicantProfileId the applicant profile ID
	*/
	public static void removeByapplicantProfileId(long applicantProfileId) {
		getPersistence().removeByapplicantProfileId(applicantProfileId);
	}

	/**
	* Returns the number of vr production plants where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr production plants
	*/
	public static int countByapplicantProfileId(long applicantProfileId) {
		return getPersistence().countByapplicantProfileId(applicantProfileId);
	}

	/**
	* Caches the vr production plant in the entity cache if it is enabled.
	*
	* @param vrProductionPlant the vr production plant
	*/
	public static void cacheResult(VRProductionPlant vrProductionPlant) {
		getPersistence().cacheResult(vrProductionPlant);
	}

	/**
	* Caches the vr production plants in the entity cache if it is enabled.
	*
	* @param vrProductionPlants the vr production plants
	*/
	public static void cacheResult(List<VRProductionPlant> vrProductionPlants) {
		getPersistence().cacheResult(vrProductionPlants);
	}

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public static VRProductionPlant create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence().remove(id);
	}

	public static VRProductionPlant updateImpl(
		VRProductionPlant vrProductionPlant) {
		return getPersistence().updateImpl(vrProductionPlant);
	}

	/**
	* Returns the vr production plant with the primary key or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	*/
	public static VRProductionPlant fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductionPlant> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr production plants.
	*
	* @return the vr production plants
	*/
	public static List<VRProductionPlant> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plants
	*/
	public static List<VRProductionPlant> findAll(int start, int end,
		OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr production plants from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductionPlantPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantPersistence, VRProductionPlantPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantPersistence.class);
}