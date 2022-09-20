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

package com.fds.vr.filterconfig.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.exception.NoSuchVRConditionException;
import com.fds.vr.filterconfig.model.VRCondition;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr condition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanHoang
 * @see com.fds.vr.filterconfig.service.persistence.impl.VRConditionPersistenceImpl
 * @see VRConditionUtil
 * @generated
 */
@ProviderType
public interface VRConditionPersistence extends BasePersistence<VRCondition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRConditionUtil} to access the vr condition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr condition where specificationCode = &#63; or throws a {@link NoSuchVRConditionException} if it could not be found.
	*
	* @param specificationCode the specification code
	* @return the matching vr condition
	* @throws NoSuchVRConditionException if a matching vr condition could not be found
	*/
	public VRCondition findBySPEC_CODE(java.lang.String specificationCode)
		throws NoSuchVRConditionException;

	/**
	* Returns the vr condition where specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param specificationCode the specification code
	* @return the matching vr condition, or <code>null</code> if a matching vr condition could not be found
	*/
	public VRCondition fetchBySPEC_CODE(java.lang.String specificationCode);

	/**
	* Returns the vr condition where specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr condition, or <code>null</code> if a matching vr condition could not be found
	*/
	public VRCondition fetchBySPEC_CODE(java.lang.String specificationCode,
		boolean retrieveFromCache);

	/**
	* Removes the vr condition where specificationCode = &#63; from the database.
	*
	* @param specificationCode the specification code
	* @return the vr condition that was removed
	*/
	public VRCondition removeBySPEC_CODE(java.lang.String specificationCode)
		throws NoSuchVRConditionException;

	/**
	* Returns the number of vr conditions where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @return the number of matching vr conditions
	*/
	public int countBySPEC_CODE(java.lang.String specificationCode);

	/**
	* Returns all the vr conditions where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @return the matching vr conditions
	*/
	public java.util.List<VRCondition> findByFILTER_MODULE_CODE(
		java.lang.String filterModuleCode);

	/**
	* Returns a range of all the vr conditions where filterModuleCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param filterModuleCode the filter module code
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @return the range of matching vr conditions
	*/
	public java.util.List<VRCondition> findByFILTER_MODULE_CODE(
		java.lang.String filterModuleCode, int start, int end);

	/**
	* Returns an ordered range of all the vr conditions where filterModuleCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param filterModuleCode the filter module code
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr conditions
	*/
	public java.util.List<VRCondition> findByFILTER_MODULE_CODE(
		java.lang.String filterModuleCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator);

	/**
	* Returns an ordered range of all the vr conditions where filterModuleCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param filterModuleCode the filter module code
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr conditions
	*/
	public java.util.List<VRCondition> findByFILTER_MODULE_CODE(
		java.lang.String filterModuleCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr condition in the ordered set where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr condition
	* @throws NoSuchVRConditionException if a matching vr condition could not be found
	*/
	public VRCondition findByFILTER_MODULE_CODE_First(
		java.lang.String filterModuleCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException;

	/**
	* Returns the first vr condition in the ordered set where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr condition, or <code>null</code> if a matching vr condition could not be found
	*/
	public VRCondition fetchByFILTER_MODULE_CODE_First(
		java.lang.String filterModuleCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator);

	/**
	* Returns the last vr condition in the ordered set where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr condition
	* @throws NoSuchVRConditionException if a matching vr condition could not be found
	*/
	public VRCondition findByFILTER_MODULE_CODE_Last(
		java.lang.String filterModuleCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException;

	/**
	* Returns the last vr condition in the ordered set where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr condition, or <code>null</code> if a matching vr condition could not be found
	*/
	public VRCondition fetchByFILTER_MODULE_CODE_Last(
		java.lang.String filterModuleCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator);

	/**
	* Returns the vr conditions before and after the current vr condition in the ordered set where filterModuleCode = &#63;.
	*
	* @param id the primary key of the current vr condition
	* @param filterModuleCode the filter module code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr condition
	* @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	*/
	public VRCondition[] findByFILTER_MODULE_CODE_PrevAndNext(long id,
		java.lang.String filterModuleCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator)
		throws NoSuchVRConditionException;

	/**
	* Removes all the vr conditions where filterModuleCode = &#63; from the database.
	*
	* @param filterModuleCode the filter module code
	*/
	public void removeByFILTER_MODULE_CODE(java.lang.String filterModuleCode);

	/**
	* Returns the number of vr conditions where filterModuleCode = &#63;.
	*
	* @param filterModuleCode the filter module code
	* @return the number of matching vr conditions
	*/
	public int countByFILTER_MODULE_CODE(java.lang.String filterModuleCode);

	/**
	* Caches the vr condition in the entity cache if it is enabled.
	*
	* @param vrCondition the vr condition
	*/
	public void cacheResult(VRCondition vrCondition);

	/**
	* Caches the vr conditions in the entity cache if it is enabled.
	*
	* @param vrConditions the vr conditions
	*/
	public void cacheResult(java.util.List<VRCondition> vrConditions);

	/**
	* Creates a new vr condition with the primary key. Does not add the vr condition to the database.
	*
	* @param id the primary key for the new vr condition
	* @return the new vr condition
	*/
	public VRCondition create(long id);

	/**
	* Removes the vr condition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr condition
	* @return the vr condition that was removed
	* @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	*/
	public VRCondition remove(long id) throws NoSuchVRConditionException;

	public VRCondition updateImpl(VRCondition vrCondition);

	/**
	* Returns the vr condition with the primary key or throws a {@link NoSuchVRConditionException} if it could not be found.
	*
	* @param id the primary key of the vr condition
	* @return the vr condition
	* @throws NoSuchVRConditionException if a vr condition with the primary key could not be found
	*/
	public VRCondition findByPrimaryKey(long id)
		throws NoSuchVRConditionException;

	/**
	* Returns the vr condition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr condition
	* @return the vr condition, or <code>null</code> if a vr condition with the primary key could not be found
	*/
	public VRCondition fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCondition> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr conditions.
	*
	* @return the vr conditions
	*/
	public java.util.List<VRCondition> findAll();

	/**
	* Returns a range of all the vr conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @return the range of vr conditions
	*/
	public java.util.List<VRCondition> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr conditions
	*/
	public java.util.List<VRCondition> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator);

	/**
	* Returns an ordered range of all the vr conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr conditions
	*/
	public java.util.List<VRCondition> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCondition> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr conditions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr conditions.
	*
	* @return the number of vr conditions
	*/
	public int countAll();
}