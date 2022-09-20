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

import com.fds.vr.business.model.VRIssue;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr issue service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRIssuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssuePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRIssuePersistenceImpl
 * @generated
 */
@ProviderType
public class VRIssueUtil {
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
	public static void clearCache(VRIssue vrIssue) {
		getPersistence().clearCache(vrIssue);
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
	public static List<VRIssue> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRIssue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRIssue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRIssue update(VRIssue vrIssue) {
		return getPersistence().update(vrIssue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRIssue update(VRIssue vrIssue, ServiceContext serviceContext) {
		return getPersistence().update(vrIssue, serviceContext);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findBydossierId(long mtCore, long dossierId) {
		return getPersistence().findBydossierId(mtCore, dossierId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end) {
		return getPersistence().findBydossierId(mtCore, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, mtCore, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long mtCore, long dossierId) {
		getPersistence().removeBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issues
	*/
	public static int countBydossierId(long mtCore, long dossierId) {
		return getPersistence().countBydossierId(mtCore, dossierId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @return the matching vr issues
	*/
	public static List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo) {
		return getPersistence().findBystampIssueNo(mtCore, stampIssueNo);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end) {
		return getPersistence()
				   .findBystampIssueNo(mtCore, stampIssueNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findBystampIssueNo(mtCore, stampIssueNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBystampIssueNo(mtCore, stampIssueNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBystampIssueNo_First(long mtCore,
		java.lang.String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBystampIssueNo_First(mtCore, stampIssueNo,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBystampIssueNo_First(long mtCore,
		java.lang.String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBystampIssueNo_First(mtCore, stampIssueNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBystampIssueNo_Last(long mtCore,
		java.lang.String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBystampIssueNo_Last(mtCore, stampIssueNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBystampIssueNo_Last(long mtCore,
		java.lang.String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBystampIssueNo_Last(mtCore, stampIssueNo,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findBystampIssueNo_PrevAndNext(long id,
		long mtCore, java.lang.String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBystampIssueNo_PrevAndNext(id, mtCore, stampIssueNo,
			orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and stampIssueNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	*/
	public static void removeBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo) {
		getPersistence().removeBystampIssueNo(mtCore, stampIssueNo);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @return the number of matching vr issues
	*/
	public static int countBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo) {
		return getPersistence().countBystampIssueNo(mtCore, stampIssueNo);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByapplicantProfileId_First(long mtCore,
		long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByapplicantProfileId_First(mtCore, dossierId,
			applicantProfileId, orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByapplicantProfileId_First(long mtCore,
		long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_First(mtCore, dossierId,
			applicantProfileId, orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByapplicantProfileId_Last(long mtCore,
		long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByapplicantProfileId_Last(mtCore, dossierId,
			applicantProfileId, orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByapplicantProfileId_Last(long mtCore,
		long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_Last(mtCore, dossierId,
			applicantProfileId, orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findByapplicantProfileId_PrevAndNext(long id,
		long mtCore, long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByapplicantProfileId_PrevAndNext(id, mtCore, dossierId,
			applicantProfileId, orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	*/
	public static void removeByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) {
		getPersistence()
			.removeByapplicantProfileId(mtCore, dossierId, applicantProfileId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr issues
	*/
	public static int countByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) {
		return getPersistence()
				   .countByapplicantProfileId(mtCore, dossierId,
			applicantProfileId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId) {
		return getPersistence().findBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBycorporationId_First(long mtCore,
		java.lang.String corporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycorporationId_First(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBycorporationId_First(long mtCore,
		java.lang.String corporationId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBycorporationId_First(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBycorporationId_Last(long mtCore,
		java.lang.String corporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycorporationId_Last(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBycorporationId_Last(long mtCore,
		java.lang.String corporationId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBycorporationId_Last(mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findBycorporationId_PrevAndNext(long id,
		long mtCore, java.lang.String corporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycorporationId_PrevAndNext(id, mtCore, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	*/
	public static void removeBycorporationId(long mtCore,
		java.lang.String corporationId) {
		getPersistence().removeBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the number of matching vr issues
	*/
	public static int countBycorporationId(long mtCore,
		java.lang.String corporationId) {
		return getPersistence().countBycorporationId(mtCore, corporationId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId) {
		return getPersistence()
				   .findByissueCorporationId(mtCore, issueCorporationId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end) {
		return getPersistence()
				   .findByissueCorporationId(mtCore, issueCorporationId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findByissueCorporationId(mtCore, issueCorporationId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueCorporationId(mtCore, issueCorporationId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByissueCorporationId_First(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByissueCorporationId_First(mtCore, issueCorporationId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByissueCorporationId_First(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByissueCorporationId_First(mtCore, issueCorporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByissueCorporationId_Last(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByissueCorporationId_Last(mtCore, issueCorporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByissueCorporationId_Last(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByissueCorporationId_Last(mtCore, issueCorporationId,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findByissueCorporationId_PrevAndNext(long id,
		long mtCore, long issueCorporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByissueCorporationId_PrevAndNext(id, mtCore,
			issueCorporationId, orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and issueCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	*/
	public static void removeByissueCorporationId(long mtCore,
		long issueCorporationId) {
		getPersistence().removeByissueCorporationId(mtCore, issueCorporationId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @return the number of matching vr issues
	*/
	public static int countByissueCorporationId(long mtCore,
		long issueCorporationId) {
		return getPersistence()
				   .countByissueCorporationId(mtCore, issueCorporationId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId) {
		return getPersistence()
				   .findByverifyCorporationId(mtCore, verifyCorporationId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end) {
		return getPersistence()
				   .findByverifyCorporationId(mtCore, verifyCorporationId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findByverifyCorporationId(mtCore, verifyCorporationId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByverifyCorporationId(mtCore, verifyCorporationId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByverifyCorporationId_First(long mtCore,
		java.lang.String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByverifyCorporationId_First(mtCore,
			verifyCorporationId, orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByverifyCorporationId_First(long mtCore,
		java.lang.String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByverifyCorporationId_First(mtCore,
			verifyCorporationId, orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByverifyCorporationId_Last(long mtCore,
		java.lang.String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByverifyCorporationId_Last(mtCore, verifyCorporationId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByverifyCorporationId_Last(long mtCore,
		java.lang.String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByverifyCorporationId_Last(mtCore,
			verifyCorporationId, orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findByverifyCorporationId_PrevAndNext(long id,
		long mtCore, java.lang.String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByverifyCorporationId_PrevAndNext(id, mtCore,
			verifyCorporationId, orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and verifyCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	*/
	public static void removeByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId) {
		getPersistence().removeByverifyCorporationId(mtCore, verifyCorporationId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @return the number of matching vr issues
	*/
	public static int countByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId) {
		return getPersistence()
				   .countByverifyCorporationId(mtCore, verifyCorporationId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @return the matching vr issues
	*/
	public static List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId) {
		return getPersistence()
				   .findByproductionPlantId(mtCore, productionPlantId);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end) {
		return getPersistence()
				   .findByproductionPlantId(mtCore, productionPlantId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantId(mtCore, productionPlantId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantId(mtCore, productionPlantId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByproductionPlantId_First(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByproductionPlantId_First(mtCore, productionPlantId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByproductionPlantId_First(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantId_First(mtCore, productionPlantId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByproductionPlantId_Last(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByproductionPlantId_Last(mtCore, productionPlantId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByproductionPlantId_Last(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantId_Last(mtCore, productionPlantId,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findByproductionPlantId_PrevAndNext(long id,
		long mtCore, long productionPlantId,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByproductionPlantId_PrevAndNext(id, mtCore,
			productionPlantId, orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and productionPlantId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	*/
	public static void removeByproductionPlantId(long mtCore,
		long productionPlantId) {
		getPersistence().removeByproductionPlantId(mtCore, productionPlantId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @return the number of matching vr issues
	*/
	public static int countByproductionPlantId(long mtCore,
		long productionPlantId) {
		return getPersistence()
				   .countByproductionPlantId(mtCore, productionPlantId);
	}

	/**
	* Returns all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vr issues
	*/
	public static List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findBycopReportNo_PrevAndNext(long id, long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findBycopReportNo_PrevAndNext(id, mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vr issues where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public static void removeBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		getPersistence().removeBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vr issues
	*/
	public static int countBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().countBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @return the matching vr issues
	*/
	public static List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus) {
		return getPersistence()
				   .findByIC_IS(issueCorporationId, digitalIssueStatus);
	}

	/**
	* Returns a range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public static List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end) {
		return getPersistence()
				   .findByIC_IS(issueCorporationId, digitalIssueStatus, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .findByIC_IS(issueCorporationId, digitalIssueStatus, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public static List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByIC_IS(issueCorporationId, digitalIssueStatus, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByIC_IS_First(issueCorporationId, digitalIssueStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByIC_IS_First(issueCorporationId, digitalIssueStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByIC_IS_Last(issueCorporationId, digitalIssueStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence()
				   .fetchByIC_IS_Last(issueCorporationId, digitalIssueStatus,
			orderByComparator);
	}

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue[] findByIC_IS_PrevAndNext(long id,
		long issueCorporationId, int digitalIssueStatus,
		OrderByComparator<VRIssue> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence()
				   .findByIC_IS_PrevAndNext(id, issueCorporationId,
			digitalIssueStatus, orderByComparator);
	}

	/**
	* Removes all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63; from the database.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	*/
	public static void removeByIC_IS(long issueCorporationId,
		int digitalIssueStatus) {
		getPersistence().removeByIC_IS(issueCorporationId, digitalIssueStatus);
	}

	/**
	* Returns the number of vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @return the number of matching vr issues
	*/
	public static int countByIC_IS(long issueCorporationId,
		int digitalIssueStatus) {
		return getPersistence()
				   .countByIC_IS(issueCorporationId, digitalIssueStatus);
	}

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or throws a {@link NoSuchVRIssueException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public static VRIssue findByF_MT_DID(long mtCore, long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence().findByF_MT_DID(mtCore, dossierId);
	}

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByF_MT_DID(long mtCore, long dossierId) {
		return getPersistence().fetchByF_MT_DID(mtCore, dossierId);
	}

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public static VRIssue fetchByF_MT_DID(long mtCore, long dossierId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_MT_DID(mtCore, dossierId, retrieveFromCache);
	}

	/**
	* Removes the vr issue where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the vr issue that was removed
	*/
	public static VRIssue removeByF_MT_DID(long mtCore, long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence().removeByF_MT_DID(mtCore, dossierId);
	}

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issues
	*/
	public static int countByF_MT_DID(long mtCore, long dossierId) {
		return getPersistence().countByF_MT_DID(mtCore, dossierId);
	}

	/**
	* Caches the vr issue in the entity cache if it is enabled.
	*
	* @param vrIssue the vr issue
	*/
	public static void cacheResult(VRIssue vrIssue) {
		getPersistence().cacheResult(vrIssue);
	}

	/**
	* Caches the vr issues in the entity cache if it is enabled.
	*
	* @param vrIssues the vr issues
	*/
	public static void cacheResult(List<VRIssue> vrIssues) {
		getPersistence().cacheResult(vrIssues);
	}

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	public static VRIssue create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence().remove(id);
	}

	public static VRIssue updateImpl(VRIssue vrIssue) {
		return getPersistence().updateImpl(vrIssue);
	}

	/**
	* Returns the vr issue with the primary key or throws a {@link NoSuchVRIssueException} if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public static VRIssue findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue, or <code>null</code> if a vr issue with the primary key could not be found
	*/
	public static VRIssue fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRIssue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr issues.
	*
	* @return the vr issues
	*/
	public static List<VRIssue> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	public static List<VRIssue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issues
	*/
	public static List<VRIssue> findAll(int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issues
	*/
	public static List<VRIssue> findAll(int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr issues from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRIssuePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRIssuePersistence, VRIssuePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRIssuePersistence.class);
}