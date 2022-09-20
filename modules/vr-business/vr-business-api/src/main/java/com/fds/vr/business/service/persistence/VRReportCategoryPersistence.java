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

import com.fds.vr.business.exception.NoSuchVRReportCategoryException;
import com.fds.vr.business.model.VRReportCategory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr report category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRReportCategoryPersistenceImpl
 * @see VRReportCategoryUtil
 * @generated
 */
@ProviderType
public interface VRReportCategoryPersistence extends BasePersistence<VRReportCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRReportCategoryUtil} to access the vr report category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr report category where rptCode = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param rptCode the rpt code
	* @return the matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptCode(java.lang.String rptCode)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param rptCode the rpt code
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptCode(java.lang.String rptCode);

	/**
	* Returns the vr report category where rptCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param rptCode the rpt code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptCode(java.lang.String rptCode,
		boolean retrieveFromCache);

	/**
	* Removes the vr report category where rptCode = &#63; from the database.
	*
	* @param rptCode the rpt code
	* @return the vr report category that was removed
	*/
	public VRReportCategory removeByrptCode(java.lang.String rptCode)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the number of vr report categories where rptCode = &#63;.
	*
	* @param rptCode the rpt code
	* @return the number of matching vr report categories
	*/
	public int countByrptCode(java.lang.String rptCode);

	/**
	* Returns all the vr report categories where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @return the matching vr report categories
	*/
	public java.util.List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup);

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
	public java.util.List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end);

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
	public java.util.List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

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
	public java.util.List<VRReportCategory> findByrptGroup(
		java.lang.String rptGroup, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptGroup_First(java.lang.String rptGroup,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the first vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptGroup_First(java.lang.String rptGroup,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

	/**
	* Returns the last vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptGroup_Last(java.lang.String rptGroup,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the last vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptGroup_Last(java.lang.String rptGroup,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

	/**
	* Returns the vr report categories before and after the current vr report category in the ordered set where rptGroup = &#63;.
	*
	* @param id the primary key of the current vr report category
	* @param rptGroup the rpt group
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public VRReportCategory[] findByrptGroup_PrevAndNext(int id,
		java.lang.String rptGroup,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Removes all the vr report categories where rptGroup = &#63; from the database.
	*
	* @param rptGroup the rpt group
	*/
	public void removeByrptGroup(java.lang.String rptGroup);

	/**
	* Returns the number of vr report categories where rptGroup = &#63;.
	*
	* @param rptGroup the rpt group
	* @return the number of matching vr report categories
	*/
	public int countByrptGroup(java.lang.String rptGroup);

	/**
	* Returns all the vr report categories where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @return the matching vr report categories
	*/
	public java.util.List<VRReportCategory> findByrptLevel(int rptLevel);

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
	public java.util.List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end);

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
	public java.util.List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

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
	public java.util.List<VRReportCategory> findByrptLevel(int rptLevel,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptLevel_First(int rptLevel,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the first vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptLevel_First(int rptLevel,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

	/**
	* Returns the last vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptLevel_Last(int rptLevel,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the last vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptLevel_Last(int rptLevel,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

	/**
	* Returns the vr report categories before and after the current vr report category in the ordered set where rptLevel = &#63;.
	*
	* @param id the primary key of the current vr report category
	* @param rptLevel the rpt level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public VRReportCategory[] findByrptLevel_PrevAndNext(int id, int rptLevel,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator)
		throws NoSuchVRReportCategoryException;

	/**
	* Removes all the vr report categories where rptLevel = &#63; from the database.
	*
	* @param rptLevel the rpt level
	*/
	public void removeByrptLevel(int rptLevel);

	/**
	* Returns the number of vr report categories where rptLevel = &#63;.
	*
	* @param rptLevel the rpt level
	* @return the number of matching vr report categories
	*/
	public int countByrptLevel(int rptLevel);

	/**
	* Returns the vr report category where rptDescription = &#63; or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param rptDescription the rpt description
	* @return the matching vr report category
	* @throws NoSuchVRReportCategoryException if a matching vr report category could not be found
	*/
	public VRReportCategory findByrptDescription(
		java.lang.String rptDescription) throws NoSuchVRReportCategoryException;

	/**
	* Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param rptDescription the rpt description
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptDescription(
		java.lang.String rptDescription);

	/**
	* Returns the vr report category where rptDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param rptDescription the rpt description
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report category, or <code>null</code> if a matching vr report category could not be found
	*/
	public VRReportCategory fetchByrptDescription(
		java.lang.String rptDescription, boolean retrieveFromCache);

	/**
	* Removes the vr report category where rptDescription = &#63; from the database.
	*
	* @param rptDescription the rpt description
	* @return the vr report category that was removed
	*/
	public VRReportCategory removeByrptDescription(
		java.lang.String rptDescription) throws NoSuchVRReportCategoryException;

	/**
	* Returns the number of vr report categories where rptDescription = &#63;.
	*
	* @param rptDescription the rpt description
	* @return the number of matching vr report categories
	*/
	public int countByrptDescription(java.lang.String rptDescription);

	/**
	* Caches the vr report category in the entity cache if it is enabled.
	*
	* @param vrReportCategory the vr report category
	*/
	public void cacheResult(VRReportCategory vrReportCategory);

	/**
	* Caches the vr report categories in the entity cache if it is enabled.
	*
	* @param vrReportCategories the vr report categories
	*/
	public void cacheResult(java.util.List<VRReportCategory> vrReportCategories);

	/**
	* Creates a new vr report category with the primary key. Does not add the vr report category to the database.
	*
	* @param id the primary key for the new vr report category
	* @return the new vr report category
	*/
	public VRReportCategory create(int id);

	/**
	* Removes the vr report category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category that was removed
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public VRReportCategory remove(int id)
		throws NoSuchVRReportCategoryException;

	public VRReportCategory updateImpl(VRReportCategory vrReportCategory);

	/**
	* Returns the vr report category with the primary key or throws a {@link NoSuchVRReportCategoryException} if it could not be found.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category
	* @throws NoSuchVRReportCategoryException if a vr report category with the primary key could not be found
	*/
	public VRReportCategory findByPrimaryKey(int id)
		throws NoSuchVRReportCategoryException;

	/**
	* Returns the vr report category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category, or <code>null</code> if a vr report category with the primary key could not be found
	*/
	public VRReportCategory fetchByPrimaryKey(int id);

	@Override
	public java.util.Map<java.io.Serializable, VRReportCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr report categories.
	*
	* @return the vr report categories
	*/
	public java.util.List<VRReportCategory> findAll();

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
	public java.util.List<VRReportCategory> findAll(int start, int end);

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
	public java.util.List<VRReportCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator);

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
	public java.util.List<VRReportCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReportCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr report categories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr report categories.
	*
	* @return the number of vr report categories
	*/
	public int countAll();
}