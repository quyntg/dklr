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

import com.fds.vr.business.model.VRApplicantProfileHistory;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr applicant profile history service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfileHistoryPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryUtil {
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
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		getPersistence().clearCache(vrApplicantProfileHistory);
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
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRApplicantProfileHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRApplicantProfileHistory update(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		return getPersistence().update(vrApplicantProfileHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRApplicantProfileHistory update(
		VRApplicantProfileHistory vrApplicantProfileHistory,
		ServiceContext serviceContext) {
		return getPersistence().update(vrApplicantProfileHistory, serviceContext);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus) {
		return getPersistence().findBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingStatus_First(
		long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingStatus_First(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingStatus_First(
		long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingStatus_First(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingStatus_Last(
		long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingStatus_Last(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingStatus_Last(
		long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingStatus_Last(mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findBymappingStatus_PrevAndNext(
		long id, long mtCore, java.lang.String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingStatus_PrevAndNext(id, mtCore, mappingStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	*/
	public static void removeBymappingStatus(long mtCore,
		java.lang.String mappingStatus) {
		getPersistence().removeBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the number of matching vr applicant profile histories
	*/
	public static int countBymappingStatus(long mtCore,
		java.lang.String mappingStatus) {
		return getPersistence().countBymappingStatus(mtCore, mappingStatus);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode) {
		return getPersistence().findByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantCode_First(
		long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCode_First(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantCode_First(
		long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCode_First(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantCode_Last(
		long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCode_Last(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantCode_Last(
		long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCode_Last(mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findByapplicantCode_PrevAndNext(
		long id, long mtCore, java.lang.String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCode_PrevAndNext(id, mtCore, applicantCode,
			orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	*/
	public static void removeByapplicantCode(long mtCore,
		java.lang.String applicantCode) {
		getPersistence().removeByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the number of matching vr applicant profile histories
	*/
	public static int countByapplicantCode(long mtCore,
		java.lang.String applicantCode) {
		return getPersistence().countByapplicantCode(mtCore, applicantCode);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY) {
		return getPersistence().findBymappingMA_CTY(mtCore, mappingMA_CTY);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end) {
		return getPersistence()
				   .findBymappingMA_CTY(mtCore, mappingMA_CTY, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findBymappingMA_CTY(mtCore, mappingMA_CTY, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymappingMA_CTY(mtCore, mappingMA_CTY, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingMA_CTY_First(
		long mtCore, java.lang.String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingMA_CTY_First(mtCore, mappingMA_CTY,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingMA_CTY_First(
		long mtCore, java.lang.String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingMA_CTY_First(mtCore, mappingMA_CTY,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingMA_CTY_Last(
		long mtCore, java.lang.String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingMA_CTY_Last(mtCore, mappingMA_CTY,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingMA_CTY_Last(
		long mtCore, java.lang.String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingMA_CTY_Last(mtCore, mappingMA_CTY,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findBymappingMA_CTY_PrevAndNext(
		long id, long mtCore, java.lang.String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingMA_CTY_PrevAndNext(id, mtCore, mappingMA_CTY,
			orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	*/
	public static void removeBymappingMA_CTY(long mtCore,
		java.lang.String mappingMA_CTY) {
		getPersistence().removeBymappingMA_CTY(mtCore, mappingMA_CTY);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @return the number of matching vr applicant profile histories
	*/
	public static int countBymappingMA_CTY(long mtCore,
		java.lang.String mappingMA_CTY) {
		return getPersistence().countBymappingMA_CTY(mtCore, mappingMA_CTY);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY) {
		return getPersistence().findBymappingTEN_CTY(mtCore, mappingTEN_CTY);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end) {
		return getPersistence()
				   .findBymappingTEN_CTY(mtCore, mappingTEN_CTY, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findBymappingTEN_CTY(mtCore, mappingTEN_CTY, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymappingTEN_CTY(mtCore, mappingTEN_CTY, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingTEN_CTY_First(
		long mtCore, java.lang.String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingTEN_CTY_First(mtCore, mappingTEN_CTY,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingTEN_CTY_First(
		long mtCore, java.lang.String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingTEN_CTY_First(mtCore, mappingTEN_CTY,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findBymappingTEN_CTY_Last(
		long mtCore, java.lang.String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingTEN_CTY_Last(mtCore, mappingTEN_CTY,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchBymappingTEN_CTY_Last(
		long mtCore, java.lang.String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchBymappingTEN_CTY_Last(mtCore, mappingTEN_CTY,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findBymappingTEN_CTY_PrevAndNext(
		long id, long mtCore, java.lang.String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findBymappingTEN_CTY_PrevAndNext(id, mtCore,
			mappingTEN_CTY, orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	*/
	public static void removeBymappingTEN_CTY(long mtCore,
		java.lang.String mappingTEN_CTY) {
		getPersistence().removeBymappingTEN_CTY(mtCore, mappingTEN_CTY);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @return the number of matching vr applicant profile histories
	*/
	public static int countBymappingTEN_CTY(long mtCore,
		java.lang.String mappingTEN_CTY) {
		return getPersistence().countBymappingTEN_CTY(mtCore, mappingTEN_CTY);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion) {
		return getPersistence().findByapplicantRegion(mtCore, applicantRegion);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end) {
		return getPersistence()
				   .findByapplicantRegion(mtCore, applicantRegion, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findByapplicantRegion(mtCore, applicantRegion, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantRegion(mtCore, applicantRegion, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantRegion_First(
		long mtCore, java.lang.String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantRegion_First(mtCore, applicantRegion,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantRegion_First(
		long mtCore, java.lang.String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantRegion_First(mtCore, applicantRegion,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantRegion_Last(
		long mtCore, java.lang.String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantRegion_Last(mtCore, applicantRegion,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantRegion_Last(
		long mtCore, java.lang.String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantRegion_Last(mtCore, applicantRegion,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findByapplicantRegion_PrevAndNext(
		long id, long mtCore, java.lang.String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantRegion_PrevAndNext(id, mtCore,
			applicantRegion, orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	*/
	public static void removeByapplicantRegion(long mtCore,
		java.lang.String applicantRegion) {
		getPersistence().removeByapplicantRegion(mtCore, applicantRegion);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @return the number of matching vr applicant profile histories
	*/
	public static int countByapplicantRegion(long mtCore,
		java.lang.String applicantRegion) {
		return getPersistence().countByapplicantRegion(mtCore, applicantRegion);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity) {
		return getPersistence().findByapplicantCity(mtCore, applicantCity);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end) {
		return getPersistence()
				   .findByapplicantCity(mtCore, applicantCity, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findByapplicantCity(mtCore, applicantCity, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantCity(mtCore, applicantCity, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantCity_First(
		long mtCore, java.lang.String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCity_First(mtCore, applicantCity,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantCity_First(
		long mtCore, java.lang.String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCity_First(mtCore, applicantCity,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantCity_Last(
		long mtCore, java.lang.String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCity_Last(mtCore, applicantCity,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantCity_Last(
		long mtCore, java.lang.String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantCity_Last(mtCore, applicantCity,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findByapplicantCity_PrevAndNext(
		long id, long mtCore, java.lang.String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantCity_PrevAndNext(id, mtCore, applicantCity,
			orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	*/
	public static void removeByapplicantCity(long mtCore,
		java.lang.String applicantCity) {
		getPersistence().removeByapplicantCity(mtCore, applicantCity);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @return the number of matching vr applicant profile histories
	*/
	public static int countByapplicantCity(long mtCore,
		java.lang.String applicantCity) {
		return getPersistence().countByapplicantCity(mtCore, applicantCity);
	}

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @return the matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus) {
		return getPersistence().findByapplicantStatus(mtCore, applicantStatus);
	}

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end) {
		return getPersistence()
				   .findByapplicantStatus(mtCore, applicantStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .findByapplicantStatus(mtCore, applicantStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantStatus(mtCore, applicantStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantStatus_First(
		long mtCore, java.lang.String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantStatus_First(mtCore, applicantStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantStatus_First(
		long mtCore, java.lang.String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantStatus_First(mtCore, applicantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory findByapplicantStatus_Last(
		long mtCore, java.lang.String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantStatus_Last(mtCore, applicantStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public static VRApplicantProfileHistory fetchByapplicantStatus_Last(
		long mtCore, java.lang.String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantStatus_Last(mtCore, applicantStatus,
			orderByComparator);
	}

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory[] findByapplicantStatus_PrevAndNext(
		long id, long mtCore, java.lang.String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence()
				   .findByapplicantStatus_PrevAndNext(id, mtCore,
			applicantStatus, orderByComparator);
	}

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	*/
	public static void removeByapplicantStatus(long mtCore,
		java.lang.String applicantStatus) {
		getPersistence().removeByapplicantStatus(mtCore, applicantStatus);
	}

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @return the number of matching vr applicant profile histories
	*/
	public static int countByapplicantStatus(long mtCore,
		java.lang.String applicantStatus) {
		return getPersistence().countByapplicantStatus(mtCore, applicantStatus);
	}

	/**
	* Caches the vr applicant profile history in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	*/
	public static void cacheResult(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		getPersistence().cacheResult(vrApplicantProfileHistory);
	}

	/**
	* Caches the vr applicant profile histories in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistories the vr applicant profile histories
	*/
	public static void cacheResult(
		List<VRApplicantProfileHistory> vrApplicantProfileHistories) {
		getPersistence().cacheResult(vrApplicantProfileHistories);
	}

	/**
	* Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	*
	* @param id the primary key for the new vr applicant profile history
	* @return the new vr applicant profile history
	*/
	public static VRApplicantProfileHistory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history that was removed
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence().remove(id);
	}

	public static VRApplicantProfileHistory updateImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		return getPersistence().updateImpl(vrApplicantProfileHistory);
	}

	/**
	* Returns the vr applicant profile history with the primary key or throws a {@link NoSuchVRApplicantProfileHistoryException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	*/
	public static VRApplicantProfileHistory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRApplicantProfileHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr applicant profile histories.
	*
	* @return the vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr applicant profile histories
	*/
	public static List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr applicant profile histories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr applicant profile histories.
	*
	* @return the number of vr applicant profile histories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRApplicantProfileHistoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRApplicantProfileHistoryPersistence, VRApplicantProfileHistoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRApplicantProfileHistoryPersistence.class);
}