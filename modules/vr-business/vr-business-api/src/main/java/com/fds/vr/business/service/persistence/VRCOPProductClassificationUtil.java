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

import com.fds.vr.business.model.VRCOPProductClassification;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop product classification service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCOPProductClassificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductClassificationPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductClassificationPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductClassificationUtil {
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
		VRCOPProductClassification vrcopProductClassification) {
		getPersistence().clearCache(vrcopProductClassification);
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
	public static List<VRCOPProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPProductClassification update(
		VRCOPProductClassification vrcopProductClassification) {
		return getPersistence().update(vrcopProductClassification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPProductClassification update(
		VRCOPProductClassification vrcopProductClassification,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrcopProductClassification, serviceContext);
	}

	/**
	* Returns all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop product classification
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public static VRCOPProductClassification[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportRepositoryID_PrevAndNext(id, mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Removes all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	*/
	public static void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		getPersistence()
			.removeBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns the number of vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop product classifications
	*/
	public static int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		return getPersistence()
				   .countBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo) {
		return getPersistence().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification findBycopReportNo_First(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification fetchBycopReportNo_First(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification findBycopReportNo_Last(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public static VRCOPProductClassification fetchBycopReportNo_Last(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop product classification
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public static VRCOPProductClassification[] findBycopReportNo_PrevAndNext(
		long id, long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence()
				   .findBycopReportNo_PrevAndNext(id, mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public static void removeBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		getPersistence().removeBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the number of vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop product classifications
	*/
	public static int countBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().countBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Caches the vrcop product classification in the entity cache if it is enabled.
	*
	* @param vrcopProductClassification the vrcop product classification
	*/
	public static void cacheResult(
		VRCOPProductClassification vrcopProductClassification) {
		getPersistence().cacheResult(vrcopProductClassification);
	}

	/**
	* Caches the vrcop product classifications in the entity cache if it is enabled.
	*
	* @param vrcopProductClassifications the vrcop product classifications
	*/
	public static void cacheResult(
		List<VRCOPProductClassification> vrcopProductClassifications) {
		getPersistence().cacheResult(vrcopProductClassifications);
	}

	/**
	* Creates a new vrcop product classification with the primary key. Does not add the vrcop product classification to the database.
	*
	* @param id the primary key for the new vrcop product classification
	* @return the new vrcop product classification
	*/
	public static VRCOPProductClassification create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop product classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification that was removed
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public static VRCOPProductClassification remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence().remove(id);
	}

	public static VRCOPProductClassification updateImpl(
		VRCOPProductClassification vrcopProductClassification) {
		return getPersistence().updateImpl(vrcopProductClassification);
	}

	/**
	* Returns the vrcop product classification with the primary key or throws a {@link NoSuchVRCOPProductClassificationException} if it could not be found.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public static VRCOPProductClassification findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop product classification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification, or <code>null</code> if a vrcop product classification with the primary key could not be found
	*/
	public static VRCOPProductClassification fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPProductClassification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop product classifications.
	*
	* @return the vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findAll(int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop product classifications
	*/
	public static List<VRCOPProductClassification> findAll(int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop product classifications from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop product classifications.
	*
	* @return the number of vrcop product classifications
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPProductClassificationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductClassificationPersistence, VRCOPProductClassificationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductClassificationPersistence.class);
}