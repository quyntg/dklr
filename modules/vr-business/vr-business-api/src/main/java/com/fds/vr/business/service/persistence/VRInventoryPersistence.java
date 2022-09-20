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

import com.fds.vr.business.exception.NoSuchVRInventoryException;
import com.fds.vr.business.model.VRInventory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInventoryPersistenceImpl
 * @see VRInventoryUtil
 * @generated
 */
@ProviderType
public interface VRInventoryPersistence extends BasePersistence<VRInventory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInventoryUtil} to access the vr inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod);

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
	public java.util.List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end);

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
	public java.util.List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findByYearofPeriod(long mtCore,
		long yearofPeriod, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findByYearofPeriod_First(long mtCore, long yearofPeriod,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriod_First(long mtCore,
		long yearofPeriod,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findByYearofPeriod_Last(long mtCore, long yearofPeriod,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriod_Last(long mtCore, long yearofPeriod,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findByYearofPeriod_PrevAndNext(long id, long mtCore,
		long yearofPeriod,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	*/
	public void removeByYearofPeriod(long mtCore, long yearofPeriod);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @return the number of matching vr inventories
	*/
	public int countByYearofPeriod(long mtCore, long yearofPeriod);

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId);

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
	public java.util.List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end);

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
	public java.util.List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findByYearofPeriodAndCorporationId(
		long mtCore, long yearofPeriod, long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

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
	public VRInventory findByYearofPeriodAndCorporationId_First(long mtCore,
		long yearofPeriod, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriodAndCorporationId_First(long mtCore,
		long yearofPeriod, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory findByYearofPeriodAndCorporationId_Last(long mtCore,
		long yearofPeriod, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriodAndCorporationId_Last(long mtCore,
		long yearofPeriod, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findByYearofPeriodAndCorporationId_PrevAndNext(
		long id, long mtCore, long yearofPeriod, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	*/
	public void removeByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param corporationId the corporation ID
	* @return the number of matching vr inventories
	*/
	public int countByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId);

	/**
	* Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass);

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
	public java.util.List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end);

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
	public java.util.List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findByYearofPeriodAndVehicleClass(
		long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

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
	public VRInventory findByYearofPeriodAndVehicleClass_First(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriodAndVehicleClass_First(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory findByYearofPeriodAndVehicleClass_Last(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByYearofPeriodAndVehicleClass_Last(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findByYearofPeriodAndVehicleClass_PrevAndNext(
		long id, long mtCore, long yearofPeriod, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	*/
	public void removeByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param yearofPeriod the yearof period
	* @param vehicleClass the vehicle class
	* @return the number of matching vr inventories
	*/
	public int countByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, java.lang.String vehicleClass);

	/**
	* Returns all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findByBookIdAndVehicleClass(
		long mtCore, long bookId, java.lang.String vehicleClass);

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
	public java.util.List<VRInventory> findByBookIdAndVehicleClass(
		long mtCore, long bookId, java.lang.String vehicleClass, int start,
		int end);

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
	public java.util.List<VRInventory> findByBookIdAndVehicleClass(
		long mtCore, long bookId, java.lang.String vehicleClass, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findByBookIdAndVehicleClass(
		long mtCore, long bookId, java.lang.String vehicleClass, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

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
	public VRInventory findByBookIdAndVehicleClass_First(long mtCore,
		long bookId, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByBookIdAndVehicleClass_First(long mtCore,
		long bookId, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory findByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findByBookIdAndVehicleClass_PrevAndNext(long id,
		long mtCore, long bookId, java.lang.String vehicleClass,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	*/
	public void removeByBookIdAndVehicleClass(long mtCore, long bookId,
		java.lang.String vehicleClass);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param vehicleClass the vehicle class
	* @return the number of matching vr inventories
	*/
	public int countByBookIdAndVehicleClass(long mtCore, long bookId,
		java.lang.String vehicleClass);

	/**
	* Returns all the vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findByBookId(long mtCore, long bookId);

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
	public java.util.List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end);

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
	public java.util.List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findByBookId(long mtCore, long bookId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findByBookId_First(long mtCore, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByBookId_First(long mtCore, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findByBookId_Last(long mtCore, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchByBookId_Last(long mtCore, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findByBookId_PrevAndNext(long id, long mtCore,
		long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	*/
	public void removeByBookId(long mtCore, long bookId);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param bookId the book ID
	* @return the number of matching vr inventories
	*/
	public int countByBookId(long mtCore, long bookId);

	/**
	* Returns all the vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findBycheckType(long mtCore,
		long checkType);

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
	public java.util.List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end);

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
	public java.util.List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findBycheckType(long mtCore,
		long checkType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findBycheckType_First(long mtCore, long checkType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchBycheckType_First(long mtCore, long checkType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findBycheckType_Last(long mtCore, long checkType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchBycheckType_Last(long mtCore, long checkType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findBycheckType_PrevAndNext(long id, long mtCore,
		long checkType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and checkType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	*/
	public void removeBycheckType(long mtCore, long checkType);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and checkType = &#63;.
	*
	* @param mtCore the mt core
	* @param checkType the check type
	* @return the number of matching vr inventories
	*/
	public int countBycheckType(long mtCore, long checkType);

	/**
	* Returns all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @return the matching vr inventories
	*/
	public java.util.List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus);

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
	public java.util.List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end);

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
	public java.util.List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findBycheckStatus(long mtCore,
		long checkStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findBycheckStatus_First(long mtCore, long checkStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchBycheckStatus_First(long mtCore, long checkStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory
	* @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	*/
	public VRInventory findBycheckStatus_Last(long mtCore, long checkStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	*/
	public VRInventory fetchBycheckStatus_Last(long mtCore, long checkStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public VRInventory[] findBycheckStatus_PrevAndNext(long id, long mtCore,
		long checkStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException;

	/**
	* Removes all the vr inventories where mtCore = &#63; and checkStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	*/
	public void removeBycheckStatus(long mtCore, long checkStatus);

	/**
	* Returns the number of vr inventories where mtCore = &#63; and checkStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param checkStatus the check status
	* @return the number of matching vr inventories
	*/
	public int countBycheckStatus(long mtCore, long checkStatus);

	/**
	* Caches the vr inventory in the entity cache if it is enabled.
	*
	* @param vrInventory the vr inventory
	*/
	public void cacheResult(VRInventory vrInventory);

	/**
	* Caches the vr inventories in the entity cache if it is enabled.
	*
	* @param vrInventories the vr inventories
	*/
	public void cacheResult(java.util.List<VRInventory> vrInventories);

	/**
	* Creates a new vr inventory with the primary key. Does not add the vr inventory to the database.
	*
	* @param id the primary key for the new vr inventory
	* @return the new vr inventory
	*/
	public VRInventory create(long id);

	/**
	* Removes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory that was removed
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public VRInventory remove(long id) throws NoSuchVRInventoryException;

	public VRInventory updateImpl(VRInventory vrInventory);

	/**
	* Returns the vr inventory with the primary key or throws a {@link NoSuchVRInventoryException} if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory
	* @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	*/
	public VRInventory findByPrimaryKey(long id)
		throws NoSuchVRInventoryException;

	/**
	* Returns the vr inventory with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr inventory
	* @return the vr inventory, or <code>null</code> if a vr inventory with the primary key could not be found
	*/
	public VRInventory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInventory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr inventories.
	*
	* @return the vr inventories
	*/
	public java.util.List<VRInventory> findAll();

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
	public java.util.List<VRInventory> findAll(int start, int end);

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
	public java.util.List<VRInventory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator);

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
	public java.util.List<VRInventory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr inventories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr inventories.
	*
	* @return the number of vr inventories
	*/
	public int countAll();
}