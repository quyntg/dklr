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

import com.fds.vr.business.model.VRReportCategory;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr report category service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRReportCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRReportCategoryPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRReportCategoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRReportCategoryUtil {
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
	public static void clearCache(VRReportCategory vrReportCategory) {
		getPersistence().clearCache(vrReportCategory);
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
	public static List<VRReportCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRReportCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRReportCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRReportCategory update(VRReportCategory vrReportCategory) {
		return getPersistence().update(vrReportCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRReportCategory update(VRReportCategory vrReportCategory,
		ServiceContext serviceContext) {
		return getPersistence().update(vrReportCategory, serviceContext);
	}

	/**
	* Returns the vr report category where rptCode = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param rptCode the rpt code
	* @return the matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptCode(java.lang.String rptCode)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptCode(rptCode);
	}

	/**
	* Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param rptCode the rpt code
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptCode(java.lang.String rptCode) {
		return getPersistence().fetchByrptCode(rptCode);
	}

	/**
	* Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param rptCode the rpt code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptCode(java.lang.String rptCode,
		boolean retrieveFromCache) {
		return getPersistence().fetchByrptCode(rptCode, retrieveFromCache);
	}

	/**
	* Removes the vr report category where rptCode = &#63; from the database.
	*
	* @param rptCode the rpt code
	* @return the vr report category that was removed
	*/
	public static VRReportCategory removeByrptCode(java.lang.String rptCode)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().removeByrptCode(rptCode);
	}

	/**
	* Returns the number of vr report categories where rptCode = &#63;.
	*
	* @param rptCode the rpt code
	* @return the number of matching vr report categories
	*/
	public static int countByrptCode(java.lang.String rptCode) {
		return getPersistence().countByrptCode(rptCode);
	}

	/**
	* Returns all the vr report categories where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @return the matching vr report categories
	*/
	public static List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup) {
		return getPersistence().findByrptGroup(rptGroup);
	}

	/**
	* Returns a range of all the vr report categories where rptGroup = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptGroup the rpt group
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @return the range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end) {
		return getPersistence().findByrptGroup(rptGroup, start, end);
	}

	/**
	* Returns an ordered range of all the vr report categories where rptGroup = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptGroup the rpt group
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence()
				   .findByrptGroup(rptGroup, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr report categories where rptGroup = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptGroup the rpt group
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByrptGroup(rptGroup, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptGroup_First(
		java.lang.String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptGroup_First(rptGroup, orderByComparator);
	}

	/**
	* Returns the first vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptGroup_First(
		java.lang.String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence()
				   .fetchByrptGroup_First(rptGroup, orderByComparator);
	}

	/**
	* Returns the last vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptGroup_Last(
		java.lang.String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptGroup_Last(rptGroup, orderByComparator);
	}

	/**
	* Returns the last vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptGroup_Last(
		java.lang.String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence().fetchByrptGroup_Last(rptGroup, orderByComparator);
	}

	/**
	* Returns the vr report categories before and after the current vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param id the primary key of the current vr report category
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public static VRReportCategory[] findByrptGroup_PrevAndNext(int id,
		java.lang.String rptGroup,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence()
				   .findByrptGroup_PrevAndNext(id, rptGroup, orderByComparator);
	}

	/**
	* Removes all the vr report categories where rptGroup = &#63; from the database.
	*
	* @param rptGroup the rpt group
	*/
	public static void removeByrptGroup(java.lang.String rptGroup) {
		getPersistence().removeByrptGroup(rptGroup);
	}

	/**
	* Returns the number of vr report categories where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @return the number of matching vr report categories
	*/
	public static int countByrptGroup(java.lang.String rptGroup) {
		return getPersistence().countByrptGroup(rptGroup);
	}

	/**
	* Returns all the vr report categories where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @return the matching vr report categories
	*/
	public static List<VRReportCategory> findByrptLevel(int rptLevel) {
		return getPersistence().findByrptLevel(rptLevel);
	}

	/**
	* Returns a range of all the vr report categories where rptLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptLevel the rpt level
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @return the range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end) {
		return getPersistence().findByrptLevel(rptLevel, start, end);
	}

	/**
	* Returns an ordered range of all the vr report categories where rptLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptLevel the rpt level
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence()
				   .findByrptLevel(rptLevel, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr report categories where rptLevel = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param rptLevel the rpt level
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr report categories
	*/
	public static List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByrptLevel(rptLevel, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptLevel_First(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptLevel_First(rptLevel, orderByComparator);
	}

	/**
	* Returns the first vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptLevel_First(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence()
				   .fetchByrptLevel_First(rptLevel, orderByComparator);
	}

	/**
	* Returns the last vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptLevel_Last(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptLevel_Last(rptLevel, orderByComparator);
	}

	/**
	* Returns the last vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptLevel_Last(int rptLevel,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence().fetchByrptLevel_Last(rptLevel, orderByComparator);
	}

	/**
	* Returns the vr report categories before and after the current vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param id the primary key of the current vr report category
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public static VRReportCategory[] findByrptLevel_PrevAndNext(int id,
		int rptLevel, OrderByComparator<VRReportCategory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence()
				   .findByrptLevel_PrevAndNext(id, rptLevel, orderByComparator);
	}

	/**
	* Removes all the vr report categories where rptLevel = &#63; from the database.
	*
	* @param rptLevel the rpt level
	*/
	public static void removeByrptLevel(int rptLevel) {
		getPersistence().removeByrptLevel(rptLevel);
	}

	/**
	* Returns the number of vr report categories where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @return the number of matching vr report categories
	*/
	public static int countByrptLevel(int rptLevel) {
		return getPersistence().countByrptLevel(rptLevel);
	}

	/**
	* Returns the vr report category where rptDescription = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param rptDescription the rpt description
	* @return the matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public static VRReportCategory findByrptDescription(
		java.lang.String rptDescription)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByrptDescription(rptDescription);
	}

	/**
	* Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param rptDescription the rpt description
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptDescription(
		java.lang.String rptDescription) {
		return getPersistence().fetchByrptDescription(rptDescription);
	}

	/**
	* Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param rptDescription the rpt description
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public static VRReportCategory fetchByrptDescription(
		java.lang.String rptDescription, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByrptDescription(rptDescription, retrieveFromCache);
	}

	/**
	* Removes the vr report category where rptDescription = &#63; from the database.
	*
	* @param rptDescription the rpt description
	* @return the vr report category that was removed
	*/
	public static VRReportCategory removeByrptDescription(
		java.lang.String rptDescription)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().removeByrptDescription(rptDescription);
	}

	/**
	* Returns the number of vr report categories where rptDescription = &#63;.
	*
	* @param rptDescription the rpt description
	* @return the number of matching vr report categories
	*/
	public static int countByrptDescription(java.lang.String rptDescription) {
		return getPersistence().countByrptDescription(rptDescription);
	}

	/**
	* Caches the vr report category in the entity cache if it is enabled.
	*
	* @param vrReportCategory the vr report category
	*/
	public static void cacheResult(VRReportCategory vrReportCategory) {
		getPersistence().cacheResult(vrReportCategory);
	}

	/**
	* Caches the vr report categories in the entity cache if it is enabled.
	*
	* @param vrReportCategories the vr report categories
	*/
	public static void cacheResult(List<VRReportCategory> vrReportCategories) {
		getPersistence().cacheResult(vrReportCategories);
	}

	/**
	* Creates a new vr report category with the primary key. Does not add the vr report category to the database.
	*
	* @param id the primary key for the new vr report category
	* @return the new vr report category
	*/
	public static VRReportCategory create(int id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr report category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category that was removed
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public static VRReportCategory remove(int id)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().remove(id);
	}

	public static VRReportCategory updateImpl(VRReportCategory vrReportCategory) {
		return getPersistence().updateImpl(vrReportCategory);
	}

	/**
	* Returns the vr report category with the primary key or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public static VRReportCategory findByPrimaryKey(int id)
		throws com.fds.vr.business.exception.NoSuchVRReportCategoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr report category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category, or <code>null</code> if a vr report category with the primary key could not be found
	*/
	public static VRReportCategory fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRReportCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr report categories.
	*
	* @return the vr report categories
	*/
	public static List<VRReportCategory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @return the range of vr report categories
	*/
	public static List<VRReportCategory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr report categories
	*/
	public static List<VRReportCategory> findAll(int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr report categories
	*/
	public static List<VRReportCategory> findAll(int start, int end,
		OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr report categories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr report categories.
	*
	* @return the number of vr report categories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRReportCategoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRReportCategoryPersistence, VRReportCategoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRReportCategoryPersistence.class);
}