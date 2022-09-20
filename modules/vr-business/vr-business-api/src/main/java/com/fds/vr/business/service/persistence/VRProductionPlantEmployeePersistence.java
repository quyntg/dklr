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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEmployeeException;
import com.fds.vr.business.model.VRProductionPlantEmployee;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantEmployeePersistenceImpl
 * @see VRProductionPlantEmployeeUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantEmployeePersistence extends BasePersistence<VRProductionPlantEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantEmployeeUtil} to access the vr production plant employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production plant employees where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findByPPC(
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vr production plant employees where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @return the range of matching vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findByPPC(
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr production plant employees where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant employees where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant employee in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant employee
	* @throws NoSuchVRProductionPlantEmployeeException if a matching vr production plant employee could not be found
	*/
	public VRProductionPlantEmployee findByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException;

	/**
	* Returns the first vr production plant employee in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant employee, or <code>null</code> if a matching vr production plant employee could not be found
	*/
	public VRProductionPlantEmployee fetchByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator);

	/**
	* Returns the last vr production plant employee in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant employee
	* @throws NoSuchVRProductionPlantEmployeeException if a matching vr production plant employee could not be found
	*/
	public VRProductionPlantEmployee findByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException;

	/**
	* Returns the last vr production plant employee in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant employee, or <code>null</code> if a matching vr production plant employee could not be found
	*/
	public VRProductionPlantEmployee fetchByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator);

	/**
	* Returns the vr production plant employees before and after the current vr production plant employee in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant employee
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant employee
	* @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	*/
	public VRProductionPlantEmployee[] findByPPC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator)
		throws NoSuchVRProductionPlantEmployeeException;

	/**
	* Removes all the vr production plant employees where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByPPC(java.lang.String productionPlantCode);

	/**
	* Returns the number of vr production plant employees where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plant employees
	*/
	public int countByPPC(java.lang.String productionPlantCode);

	/**
	* Caches the vr production plant employee in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEmployee the vr production plant employee
	*/
	public void cacheResult(VRProductionPlantEmployee vrProductionPlantEmployee);

	/**
	* Caches the vr production plant employees in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEmployees the vr production plant employees
	*/
	public void cacheResult(
		java.util.List<VRProductionPlantEmployee> vrProductionPlantEmployees);

	/**
	* Creates a new vr production plant employee with the primary key. Does not add the vr production plant employee to the database.
	*
	* @param id the primary key for the new vr production plant employee
	* @return the new vr production plant employee
	*/
	public VRProductionPlantEmployee create(long id);

	/**
	* Removes the vr production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant employee
	* @return the vr production plant employee that was removed
	* @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	*/
	public VRProductionPlantEmployee remove(long id)
		throws NoSuchVRProductionPlantEmployeeException;

	public VRProductionPlantEmployee updateImpl(
		VRProductionPlantEmployee vrProductionPlantEmployee);

	/**
	* Returns the vr production plant employee with the primary key or throws a {@link NoSuchVRProductionPlantEmployeeException} if it could not be found.
	*
	* @param id the primary key of the vr production plant employee
	* @return the vr production plant employee
	* @throws NoSuchVRProductionPlantEmployeeException if a vr production plant employee with the primary key could not be found
	*/
	public VRProductionPlantEmployee findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEmployeeException;

	/**
	* Returns the vr production plant employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant employee
	* @return the vr production plant employee, or <code>null</code> if a vr production plant employee with the primary key could not be found
	*/
	public VRProductionPlantEmployee fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlantEmployee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plant employees.
	*
	* @return the vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findAll();

	/**
	* Returns a range of all the vr production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @return the range of vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant employees
	* @param end the upper bound of the range of vr production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant employees
	*/
	public java.util.List<VRProductionPlantEmployee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plant employees from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plant employees.
	*
	* @return the number of vr production plant employees
	*/
	public int countAll();
}