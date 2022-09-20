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

import com.fds.vr.business.exception.NoSuchVRProductionPlantException;
import com.fds.vr.business.model.VRProductionPlant;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantPersistenceImpl
 * @see VRProductionPlantUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantPersistence extends BasePersistence<VRProductionPlant> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantUtil} to access the vr production plant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId);

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
	public java.util.List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end);

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
	public java.util.List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByregistrationFormId(
		long mtCore, long applicantProfileId, long registrationId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByregistrationFormId_First(long mtCore,
		long applicantProfileId, long registrationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByregistrationFormId_First(long mtCore,
		long applicantProfileId, long registrationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByregistrationFormId_Last(long mtCore,
		long applicantProfileId, long registrationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByregistrationFormId_Last(long mtCore,
		long applicantProfileId, long registrationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByregistrationFormId_PrevAndNext(long id,
		long mtCore, long applicantProfileId, long registrationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	*/
	public void removeByregistrationFormId(long mtCore,
		long applicantProfileId, long registrationId);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationId the registration ID
	* @return the number of matching vr production plants
	*/
	public int countByregistrationFormId(long mtCore, long applicantProfileId,
		long registrationId);

	/**
	* Returns all the vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus);

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
	public java.util.List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end);

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
	public java.util.List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findBymappingStatus_PrevAndNext(long id,
		long mtCore, java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and mappingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	*/
	public void removeBymappingStatus(long mtCore,
		java.lang.String mappingStatus);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the number of matching vr production plants
	*/
	public int countBymappingStatus(long mtCore, java.lang.String mappingStatus);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode);

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
	public java.util.List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end);

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
	public java.util.List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByapplicantCode(long mtCore,
		java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByapplicantCode_PrevAndNext(long id,
		long mtCore, java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	*/
	public void removeByapplicantCode(long mtCore,
		java.lang.String applicantCode);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the number of matching vr production plants
	*/
	public int countByapplicantCode(long mtCore, java.lang.String applicantCode);

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns the vr production plant where productionPlantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode, boolean retrieveFromCache);

	/**
	* Removes the vr production plant where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	* @return the vr production plant that was removed
	*/
	public VRProductionPlant removeByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the number of vr production plants where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plants
	*/
	public int countByF_ProductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

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
	public java.util.List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantCode_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantCode_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantCode_PrevAndNext(long id,
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	*/
	public void removeByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantCode(long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR);

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
	public java.util.List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end);

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
	public java.util.List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findBymappingMA_XUONG_LR_First(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchBymappingMA_XUONG_LR_First(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findBymappingMA_XUONG_LR_Last(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchBymappingMA_XUONG_LR_Last(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findBymappingMA_XUONG_LR_PrevAndNext(long id,
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	*/
	public void removeBymappingMA_XUONG_LR(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and mappingMA_CTY = &#63; and mappingMA_XUONG_LR = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param mappingMA_XUONG_LR the mapping ma_xuong_lr
	* @return the number of matching vr production plants
	*/
	public int countBymappingMA_XUONG_LR(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR);

	/**
	* Returns all the vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType);

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
	public java.util.List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByproductionPlantType_First(long mtCore,
		java.lang.String productionPlantType,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantType_First(long mtCore,
		java.lang.String productionPlantType,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByproductionPlantType_Last(long mtCore,
		java.lang.String productionPlantType,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantType_Last(long mtCore,
		java.lang.String productionPlantType,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantType_PrevAndNext(long id,
		long mtCore, java.lang.String productionPlantType,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and productionPlantType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	*/
	public void removeByproductionPlantType(long mtCore,
		java.lang.String productionPlantType);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and productionPlantType = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantType the production plant type
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantType(long mtCore,
		java.lang.String productionPlantType);

	/**
	* Returns all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByproductionPlantStatus_First(long mtCore,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantStatus_First(long mtCore,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByproductionPlantStatus_Last(long mtCore,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantStatus_Last(long mtCore,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantStatus_PrevAndNext(
		long id, long mtCore, java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	*/
	public void removeByproductionPlantStatus(long mtCore,
		java.lang.String productionPlantStatus);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantStatus(long mtCore,
		java.lang.String productionPlantStatus);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantStatus_PPCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	*/
	public void removeByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantStatus_PPCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantStatus_PPName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	*/
	public void removeByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantStatus);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantStatus_PPName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantStatus);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantStatus_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantStatus_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	*/
	public void removeByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantAddress = &#63; and productionPlantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantAddress the production plant address
	* @param productionPlantStatus the production plant status
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantStatus_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantName_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantName_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantName_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public void removeByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantName_PPAddress(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress);

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
	public java.util.List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantRep_PPAddress_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

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
	public VRProductionPlant fetchByproductionPlantRep_PPAddress_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantRep_PPAddress_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	*/
	public void removeByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantRepresentative = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantRepresentative the production plant representative
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantRep_PPAddress(long mtCore,
		long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress);

	/**
	* Returns all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

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
	public VRProductionPlant findByproductionPlantName_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantName_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant findByproductionPlantName_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByproductionPlantName_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public VRProductionPlant[] findByproductionPlantName_PrevAndNext(long id,
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	*/
	public void removeByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName);

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @return the number of matching vr production plants
	*/
	public int countByproductionPlantName(long mtCore, long applicantProfileId,
		java.lang.String productionPlantName);

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId);

	/**
	* Returns the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId,
		boolean retrieveFromCache);

	/**
	* Removes the vr production plant where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the vr production plant that was removed
	*/
	public VRProductionPlant removeByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the number of vr production plants where mtCore = &#63; and applicantProfileId = &#63; and registrationFormId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param registrationFormId the registration form ID
	* @return the number of matching vr production plants
	*/
	public int countByF_MT_APP_FORM_ID(long mtCore, long applicantProfileId,
		long registrationFormId);

	/**
	* Returns all the vr production plants where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr production plants
	*/
	public java.util.List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId);

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
	public java.util.List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end);

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
	public java.util.List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findByapplicantProfileId(
		long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByapplicantProfileId_First(
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the first vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByapplicantProfileId_First(
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant
	* @throws NoSuchVRProductionPlantException if a matching vr production plant could not be found
	*/
	public VRProductionPlant findByapplicantProfileId_Last(
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the last vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant, or <code>null</code> if a matching vr production plant could not be found
	*/
	public VRProductionPlant fetchByapplicantProfileId_Last(
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

	/**
	* Returns the vr production plants before and after the current vr production plant in the ordered set where applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr production plant
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant[] findByapplicantProfileId_PrevAndNext(long id,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator)
		throws NoSuchVRProductionPlantException;

	/**
	* Removes all the vr production plants where applicantProfileId = &#63; from the database.
	*
	* @param applicantProfileId the applicant profile ID
	*/
	public void removeByapplicantProfileId(long applicantProfileId);

	/**
	* Returns the number of vr production plants where applicantProfileId = &#63;.
	*
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr production plants
	*/
	public int countByapplicantProfileId(long applicantProfileId);

	/**
	* Caches the vr production plant in the entity cache if it is enabled.
	*
	* @param vrProductionPlant the vr production plant
	*/
	public void cacheResult(VRProductionPlant vrProductionPlant);

	/**
	* Caches the vr production plants in the entity cache if it is enabled.
	*
	* @param vrProductionPlants the vr production plants
	*/
	public void cacheResult(
		java.util.List<VRProductionPlant> vrProductionPlants);

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public VRProductionPlant create(long id);

	/**
	* Removes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant remove(long id)
		throws NoSuchVRProductionPlantException;

	public VRProductionPlant updateImpl(VRProductionPlant vrProductionPlant);

	/**
	* Returns the vr production plant with the primary key or throws a {@link NoSuchVRProductionPlantException} if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws NoSuchVRProductionPlantException if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantException;

	/**
	* Returns the vr production plant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant, or <code>null</code> if a vr production plant with the primary key could not be found
	*/
	public VRProductionPlant fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlant> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plants.
	*
	* @return the vr production plants
	*/
	public java.util.List<VRProductionPlant> findAll();

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
	public java.util.List<VRProductionPlant> findAll(int start, int end);

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
	public java.util.List<VRProductionPlant> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator);

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
	public java.util.List<VRProductionPlant> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlant> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plants from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	public int countAll();
}