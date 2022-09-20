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

import com.fds.vr.business.model.VRCOPReportRepository;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop report repository service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportRepositoryPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryUtil {
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
	public static void clearCache(VRCOPReportRepository vrcopReportRepository) {
		getPersistence().clearCache(vrcopReportRepository);
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
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPReportRepository update(
		VRCOPReportRepository vrcopReportRepository) {
		return getPersistence().update(vrcopReportRepository);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPReportRepository update(
		VRCOPReportRepository vrcopReportRepository,
		ServiceContext serviceContext) {
		return getPersistence().update(vrcopReportRepository, serviceContext);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus) {
		return getPersistence().findBycopReportStatus(mtCore, copReportStatus);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end) {
		return getPersistence()
				   .findBycopReportStatus(mtCore, copReportStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findBycopReportStatus(mtCore, copReportStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportStatus(mtCore, copReportStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findBycopReportStatus_First(
		long mtCore, java.lang.String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBycopReportStatus_First(mtCore, copReportStatus,
			orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBycopReportStatus_First(
		long mtCore, java.lang.String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportStatus_First(mtCore, copReportStatus,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findBycopReportStatus_Last(
		long mtCore, java.lang.String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBycopReportStatus_Last(mtCore, copReportStatus,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBycopReportStatus_Last(
		long mtCore, java.lang.String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportStatus_Last(mtCore, copReportStatus,
			orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findBycopReportStatus_PrevAndNext(
		long id, long mtCore, java.lang.String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBycopReportStatus_PrevAndNext(id, mtCore,
			copReportStatus, orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	*/
	public static void removeBycopReportStatus(long mtCore,
		java.lang.String copReportStatus) {
		getPersistence().removeBycopReportStatus(mtCore, copReportStatus);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @return the number of matching vrcop report repositories
	*/
	public static int countBycopReportStatus(long mtCore,
		java.lang.String copReportStatus) {
		return getPersistence().countBycopReportStatus(mtCore, copReportStatus);
	}

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findBycopReportNo(long mtCore,
		java.lang.String copReportNo)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().fetchBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBycopReportNo(long mtCore,
		java.lang.String copReportNo, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBycopReportNo(mtCore, copReportNo, retrieveFromCache);
	}

	/**
	* Removes the vrcop report repository where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the vrcop report repository that was removed
	*/
	public static VRCOPReportRepository removeBycopReportNo(long mtCore,
		java.lang.String copReportNo)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().removeBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop report repositories
	*/
	public static int countBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().countBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByapplicantProfileId_First(
		long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByapplicantProfileId_First(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByapplicantProfileId_First(
		long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_First(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByapplicantProfileId_Last(
		long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByapplicantProfileId_Last(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByapplicantProfileId_Last(
		long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_Last(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findByapplicantProfileId_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByapplicantProfileId_PrevAndNext(id, mtCore,
			applicantProfileId, orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	*/
	public static void removeByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		getPersistence().removeByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vrcop report repositories
	*/
	public static int countByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		return getPersistence()
				   .countByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification) {
		return getPersistence()
				   .findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end) {
		return getPersistence()
				   .findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantCode_copClassification_First(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_copClassification_First(mtCore,
			productionPlantCode, copClassification, orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantCode_copClassification_First(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_copClassification_First(mtCore,
			productionPlantCode, copClassification, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantCode_copClassification_Last(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_copClassification_Last(mtCore,
			productionPlantCode, copClassification, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantCode_copClassification_Last(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_copClassification_Last(mtCore,
			productionPlantCode, copClassification, orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findByproductionPlantCode_copClassification_PrevAndNext(
		long id, long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_copClassification_PrevAndNext(id,
			mtCore, productionPlantCode, copClassification, orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	*/
	public static void removeByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification) {
		getPersistence()
			.removeByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @return the number of matching vrcop report repositories
	*/
	public static int countByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification) {
		return getPersistence()
				   .countByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_First(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_First(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_Last(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_Last(mtCore, applicantProfileId,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findByproductionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantCode_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
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
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vrcop report repositories
	*/
	public static int countByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode) {
		return getPersistence()
				   .countByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantName_First(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantName_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_First(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByproductionPlantName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantName_Last(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByproductionPlantName_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantName_Last(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findByproductionPlantName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findByproductionPlantName_PrevAndNext(id, mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public static void removeByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		getPersistence()
			.removeByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vrcop report repositories
	*/
	public static int countByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .countByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress);
	}

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode);
	}

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode_First(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchBymtCore_applicantProfileId_productionPlantCode_First(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode_Last(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .fetchBymtCore_applicantProfileId_productionPlantCode_Last(mtCore,
			applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository[] findBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence()
				   .findBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(id,
			mtCore, applicantProfileId, productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	*/
	public static void removeBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		getPersistence()
			.removeBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode);
	}

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vrcop report repositories
	*/
	public static int countBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		return getPersistence()
				   .countBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode);
	}

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByDosierId_MtCore(long dossierId,
		long mtCore)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().findByDosierId_MtCore(dossierId, mtCore);
	}

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore) {
		return getPersistence().fetchByDosierId_MtCore(dossierId, mtCore);
	}

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDosierId_MtCore(dossierId, mtCore, retrieveFromCache);
	}

	/**
	* Removes the vrcop report repository where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the vrcop report repository that was removed
	*/
	public static VRCOPReportRepository removeByDosierId_MtCore(
		long dossierId, long mtCore)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().removeByDosierId_MtCore(dossierId, mtCore);
	}

	/**
	* Returns the number of vrcop report repositories where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vrcop report repositories
	*/
	public static int countByDosierId_MtCore(long dossierId, long mtCore) {
		return getPersistence().countByDosierId_MtCore(dossierId, mtCore);
	}

	/**
	* Caches the vrcop report repository in the entity cache if it is enabled.
	*
	* @param vrcopReportRepository the vrcop report repository
	*/
	public static void cacheResult(VRCOPReportRepository vrcopReportRepository) {
		getPersistence().cacheResult(vrcopReportRepository);
	}

	/**
	* Caches the vrcop report repositories in the entity cache if it is enabled.
	*
	* @param vrcopReportRepositories the vrcop report repositories
	*/
	public static void cacheResult(
		List<VRCOPReportRepository> vrcopReportRepositories) {
		getPersistence().cacheResult(vrcopReportRepositories);
	}

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public static VRCOPReportRepository create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().remove(id);
	}

	public static VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository) {
		return getPersistence().updateImpl(vrcopReportRepository);
	}

	/**
	* Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop report repositories.
	*
	* @return the vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop report repositories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPReportRepositoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPReportRepositoryPersistence, VRCOPReportRepositoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPReportRepositoryPersistence.class);
}