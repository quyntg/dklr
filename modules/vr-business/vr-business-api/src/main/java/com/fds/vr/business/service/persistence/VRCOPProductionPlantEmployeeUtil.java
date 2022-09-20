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

import com.fds.vr.business.model.VRCOPProductionPlantEmployee;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop production plant employee service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCOPProductionPlantEmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductionPlantEmployeePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductionPlantEmployeePersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEmployeeUtil {
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
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		getPersistence().clearCache(vrcopProductionPlantEmployee);
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
	public static List<VRCOPProductionPlantEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPProductionPlantEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPProductionPlantEmployee> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPProductionPlantEmployee update(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return getPersistence().update(vrcopProductionPlantEmployee);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPProductionPlantEmployee update(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrcopProductionPlantEmployee, serviceContext);
	}

	/**
	* Returns all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns a range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop production plant employee
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportRepositoryID_PrevAndNext(id, mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Removes all the vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
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
	* Returns the number of vrcop production plant employees where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop production plant employees
	*/
	public static int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		return getPersistence()
				   .countBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportNo(
		long mtCore, java.lang.String copReportNo) {
		return getPersistence().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns a range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopReportNo_First(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopReportNo_First(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopReportNo_Last(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopReportNo_Last(
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop production plant employee
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee[] findBycopReportNo_PrevAndNext(
		long id, long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopReportNo_PrevAndNext(id, mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vrcop production plant employees where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public static void removeBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		getPersistence().removeBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the number of vrcop production plant employees where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop production plant employees
	*/
	public static int countBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().countBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns all the vrcop production plant employees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId) {
		return getPersistence().findBycopDossierId(dossierId);
	}

	/**
	* Returns a range of all the vrcop production plant employees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end) {
		return getPersistence().findBycopDossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .findBycopDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findBycopDossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopDossierId(dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopDossierId_First(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchBycopDossierId_Last(
		long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchBycopDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vrcop production plant employee
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee[] findBycopDossierId_PrevAndNext(
		long id, long dossierId,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findBycopDossierId_PrevAndNext(id, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vrcop production plant employees where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeBycopDossierId(long dossierId) {
		getPersistence().removeBycopDossierId(dossierId);
	}

	/**
	* Returns the number of vrcop production plant employees where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vrcop production plant employees
	*/
	public static int countBycopDossierId(long dossierId) {
		return getPersistence().countBycopDossierId(dossierId);
	}

	/**
	* Returns all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore) {
		return getPersistence().findByDossierId_MtCore(dossierId, mtCore);
	}

	/**
	* Returns a range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end) {
		return getPersistence()
				   .findByDossierId_MtCore(dossierId, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findByDossierId_MtCore_First(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the first vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchByDossierId_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_MtCore_First(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee findByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findByDossierId_MtCore_Last(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchByDossierId_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_MtCore_Last(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vrcop production plant employee
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee[] findByDossierId_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence()
				   .findByDossierId_MtCore_PrevAndNext(id, dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vrcop production plant employees where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public static void removeByDossierId_MtCore(long dossierId, long mtCore) {
		getPersistence().removeByDossierId_MtCore(dossierId, mtCore);
	}

	/**
	* Returns the number of vrcop production plant employees where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vrcop production plant employees
	*/
	public static int countByDossierId_MtCore(long dossierId, long mtCore) {
		return getPersistence().countByDossierId_MtCore(dossierId, mtCore);
	}

	/**
	* Caches the vrcop production plant employee in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	*/
	public static void cacheResult(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		getPersistence().cacheResult(vrcopProductionPlantEmployee);
	}

	/**
	* Caches the vrcop production plant employees in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEmployees the vrcop production plant employees
	*/
	public static void cacheResult(
		List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees) {
		getPersistence().cacheResult(vrcopProductionPlantEmployees);
	}

	/**
	* Creates a new vrcop production plant employee with the primary key. Does not add the vrcop production plant employee to the database.
	*
	* @param id the primary key for the new vrcop production plant employee
	* @return the new vrcop production plant employee
	*/
	public static VRCOPProductionPlantEmployee create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence().remove(id);
	}

	public static VRCOPProductionPlantEmployee updateImpl(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return getPersistence().updateImpl(vrcopProductionPlantEmployee);
	}

	/**
	* Returns the vrcop production plant employee with the primary key or throws a {@link NoSuchVRCOPProductionPlantEmployeeException} if it could not be found.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPProductionPlantEmployeeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop production plant employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee, or <code>null</code> if a vrcop production plant employee with the primary key could not be found
	*/
	public static VRCOPProductionPlantEmployee fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPProductionPlantEmployee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop production plant employees.
	*
	* @return the vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findAll(int start,
		int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop production plant employees
	*/
	public static List<VRCOPProductionPlantEmployee> findAll(int start,
		int end,
		OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop production plant employees from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop production plant employees.
	*
	* @return the number of vrcop production plant employees
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPProductionPlantEmployeePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductionPlantEmployeePersistence, VRCOPProductionPlantEmployeePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductionPlantEmployeePersistence.class);
}