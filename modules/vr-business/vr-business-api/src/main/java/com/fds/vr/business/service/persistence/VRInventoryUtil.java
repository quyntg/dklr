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

import com.fds.vr.business.model.VRInventory;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr inventory service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRInventoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInventoryPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRInventoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRInventoryUtil {
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
	public static void clearCache(VRInventory vrInventory) {
		getPersistence().clearCache(vrInventory);
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
	public static List<VRInventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRInventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRInventory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRInventory update(VRInventory vrInventory) {
		return getPersistence().update(vrInventory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRInventory update(VRInventory vrInventory,
		ServiceContext serviceContext) {
		return getPersistence().update(vrInventory, serviceContext);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod) {
		return getPersistence().findByYearofPeriod(mtCore, yearofPeriod);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end) {
		return getPersistence()
				   .findByYearofPeriod(mtCore, yearofPeriod, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findByYearofPeriod(mtCore, yearofPeriod, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByYearofPeriod(mtCore, yearofPeriod, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriod_First(long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriod_First(mtCore, yearofPeriod,
			orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriod_First(long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriod_First(mtCore, yearofPeriod,
			orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriod_Last(long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriod_Last(mtCore, yearofPeriod,
			orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriod_Last(long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriod_Last(mtCore, yearofPeriod,
			orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findByYearofPeriod_PrevAndNext(long id,
		long mtCore, long yearofPeriod,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriod_PrevAndNext(id, mtCore, yearofPeriod,
			orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	*/
	public static void removeByYearofPeriod(long mtCore, long yearofPeriod) {
		getPersistence().removeByYearofPeriod(mtCore, yearofPeriod);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @return the number of matching vr inventories
	*/
	public static int countByYearofPeriod(long mtCore, long yearofPeriod) {
		return getPersistence().countByYearofPeriod(mtCore, yearofPeriod);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId) {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end) {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriodAndCorporationId_First(
		long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId_First(mtCore,
			yearofPeriod, corporationId, orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriodAndCorporationId_First(
		long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriodAndCorporationId_First(mtCore,
			yearofPeriod, corporationId, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriodAndCorporationId_Last(
		long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId_Last(mtCore,
			yearofPeriod, corporationId, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriodAndCorporationId_Last(
		long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriodAndCorporationId_Last(mtCore,
			yearofPeriod, corporationId, orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findByYearofPeriodAndCorporationId_PrevAndNext(
		long id, long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndCorporationId_PrevAndNext(id, mtCore,
			yearofPeriod, corporationId, orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	*/
	public static void removeByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId) {
		getPersistence()
			.removeByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @return the number of matching vr inventories
	*/
	public static int countByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId) {
		return getPersistence()
				   .countByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass) {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end) {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriodAndVehicleClass_First(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass_First(mtCore,
			yearofPeriod, vehicleClass, orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriodAndVehicleClass_First(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriodAndVehicleClass_First(mtCore,
			yearofPeriod, vehicleClass, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByYearofPeriodAndVehicleClass_Last(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass_Last(mtCore,
			yearofPeriod, vehicleClass, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByYearofPeriodAndVehicleClass_Last(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByYearofPeriodAndVehicleClass_Last(mtCore,
			yearofPeriod, vehicleClass, orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findByYearofPeriodAndVehicleClass_PrevAndNext(
		long id, long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByYearofPeriodAndVehicleClass_PrevAndNext(id, mtCore,
			yearofPeriod, vehicleClass, orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	*/
	public static void removeByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass) {
		getPersistence()
			.removeByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @return the number of matching vr inventories
	*/
	public static int countByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass) {
		return getPersistence()
				   .countByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, java.lang.String vehicleClass) {
		return getPersistence()
				   .findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, java.lang.String vehicleClass, int start, int end) {
		return getPersistence()
				   .findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, java.lang.String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, java.lang.String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByBookIdAndVehicleClass_First(long mtCore,
		long bookId, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookIdAndVehicleClass_First(mtCore, bookId,
			vehicleClass, orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByBookIdAndVehicleClass_First(long mtCore,
		long bookId, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByBookIdAndVehicleClass_First(mtCore, bookId,
			vehicleClass, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookIdAndVehicleClass_Last(mtCore, bookId,
			vehicleClass, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByBookIdAndVehicleClass_Last(mtCore, bookId,
			vehicleClass, orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findByBookIdAndVehicleClass_PrevAndNext(
		long id, long mtCore, long bookId, java.lang.String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookIdAndVehicleClass_PrevAndNext(id, mtCore, bookId,
			vehicleClass, orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	*/
	public static void removeByBookIdAndVehicleClass(long mtCore, long bookId,
		java.lang.String vehicleClass) {
		getPersistence()
			.removeByBookIdAndVehicleClass(mtCore, bookId, vehicleClass);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @return the number of matching vr inventories
	*/
	public static int countByBookIdAndVehicleClass(long mtCore, long bookId,
		java.lang.String vehicleClass) {
		return getPersistence()
				   .countByBookIdAndVehicleClass(mtCore, bookId, vehicleClass);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findByBookId(long mtCore, long bookId) {
		return getPersistence().findByBookId(mtCore, bookId);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end) {
		return getPersistence().findByBookId(mtCore, bookId, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findByBookId(mtCore, bookId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBookId(mtCore, bookId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByBookId_First(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookId_First(mtCore, bookId, orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByBookId_First(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByBookId_First(mtCore, bookId, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findByBookId_Last(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookId_Last(mtCore, bookId, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchByBookId_Last(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchByBookId_Last(mtCore, bookId, orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findByBookId_PrevAndNext(long id, long mtCore,
		long bookId, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findByBookId_PrevAndNext(id, mtCore, bookId,
			orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	*/
	public static void removeByBookId(long mtCore, long bookId) {
		getPersistence().removeByBookId(mtCore, bookId);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @return the number of matching vr inventories
	*/
	public static int countByBookId(long mtCore, long bookId) {
		return getPersistence().countByBookId(mtCore, bookId);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findBycheckType(long mtCore, long checkType) {
		return getPersistence().findBycheckType(mtCore, checkType);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end) {
		return getPersistence().findBycheckType(mtCore, checkType, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findBycheckType(mtCore, checkType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycheckType(mtCore, checkType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findBycheckType_First(long mtCore,
		long checkType, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckType_First(mtCore, checkType, orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchBycheckType_First(long mtCore,
		long checkType, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchBycheckType_First(mtCore, checkType, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findBycheckType_Last(long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckType_Last(mtCore, checkType, orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchBycheckType_Last(long mtCore,
		long checkType, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchBycheckType_Last(mtCore, checkType, orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findBycheckType_PrevAndNext(long id,
		long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckType_PrevAndNext(id, mtCore, checkType,
			orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and checkType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	*/
	public static void removeBycheckType(long mtCore, long checkType) {
		getPersistence().removeBycheckType(mtCore, checkType);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @return the number of matching vr inventories
	*/
	public static int countBycheckType(long mtCore, long checkType) {
		return getPersistence().countBycheckType(mtCore, checkType);
	}

	/**
	* Returns all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @return the matching vr inventories
	*/
	public static List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus) {
		return getPersistence().findBycheckStatus(mtCore, checkStatus);
	}

	/**
	* Returns a range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end) {
		return getPersistence()
				   .findBycheckStatus(mtCore, checkStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .findBycheckStatus(mtCore, checkStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inventories
	*/
	public static List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycheckStatus(mtCore, checkStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findBycheckStatus_First(long mtCore,
		long checkStatus, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckStatus_First(mtCore, checkStatus,
			orderByComparator);
	}

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchBycheckStatus_First(long mtCore,
		long checkStatus, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchBycheckStatus_First(mtCore, checkStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public static VRInventory findBycheckStatus_Last(long mtCore,
		long checkStatus, OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckStatus_Last(mtCore, checkStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public static VRInventory fetchBycheckStatus_Last(long mtCore,
		long checkStatus, OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence()
				   .fetchBycheckStatus_Last(mtCore, checkStatus,
			orderByComparator);
	}

	/**
	* Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param id the primary key of the current vr inventory
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory[] findBycheckStatus_PrevAndNext(long id,
		long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence()
				   .findBycheckStatus_PrevAndNext(id, mtCore, checkStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr inventories where mtCore = &#63; and checkStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	*/
	public static void removeBycheckStatus(long mtCore, long checkStatus) {
		getPersistence().removeBycheckStatus(mtCore, checkStatus);
	}

	/**
	* Returns the number of vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @return the number of matching vr inventories
	*/
	public static int countBycheckStatus(long mtCore, long checkStatus) {
		return getPersistence().countBycheckStatus(mtCore, checkStatus);
	}

	/**
	* Caches the vr inventory in the entity cache if it is enabled.
	*
	* @param vrInventory the vr inventory
	*/
	public static void cacheResult(VRInventory vrInventory) {
		getPersistence().cacheResult(vrInventory);
	}

	/**
	* Caches the vr inventories in the entity cache if it is enabled.
	*
	* @param vrInventories the vr inventories
	*/
	public static void cacheResult(List<VRInventory> vrInventories) {
		getPersistence().cacheResult(vrInventories);
	}

	/**
	* Creates a new vr inventory with the primary key. Does not add the vr inventory to the database.
	*
	* @param id the primary key for the new vr inventory
	* @return the new vr inventory
	*/
	public static VRInventory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory that was removed
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence().remove(id);
	}

	public static VRInventory updateImpl(VRInventory vrInventory) {
		return getPersistence().updateImpl(vrInventory);
	}

	/**
	* Returns the vr inventory with the primary key or throws a {@link NoSuchVRInventoryException} if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public static VRInventory findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRInventoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr inventory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory, or <code>null</code> if a vr inventory with the primary key could not be found
	*/
	public static VRInventory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRInventory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr inventories.
	*
	* @return the vr inventories
	*/
	public static List<VRInventory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @return the range of vr inventories
	*/
	public static List<VRInventory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr inventories
	*/
	public static List<VRInventory> findAll(int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr inventories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inventories
	* @param end the upper bound of the range of vr inventories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr inventories
	*/
	public static List<VRInventory> findAll(int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr inventories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr inventories.
	*
	* @return the number of vr inventories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRInventoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInventoryPersistence, VRInventoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRInventoryPersistence.class);
}