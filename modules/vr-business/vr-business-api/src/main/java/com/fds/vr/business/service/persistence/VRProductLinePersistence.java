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

import com.fds.vr.business.exception.NoSuchVRProductLineException;
import com.fds.vr.business.model.VRProductLine;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr product line service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductLinePersistenceImpl
 * @see VRProductLineUtil
 * @generated
 */
@ProviderType
public interface VRProductLinePersistence extends BasePersistence<VRProductLine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductLineUtil} to access the vr product line persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the matching vr product lines
	*/
	public java.util.List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID);

	/**
	* Returns a range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @return the range of matching vr product lines
	*/
	public java.util.List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end);

	/**
	* Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr product lines
	*/
	public java.util.List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator);

	/**
	* Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr product lines
	*/
	public java.util.List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product line
	* @throws NoSuchVRProductLineException if a matching vr product line could not be found
	*/
	public VRProductLine findByproductPlantID_First(long mtCore,
		long productPlantID,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException;

	/**
	* Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product line, or <code>null</code> if a matching vr product line could not be found
	*/
	public VRProductLine fetchByproductPlantID_First(long mtCore,
		long productPlantID,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator);

	/**
	* Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product line
	* @throws NoSuchVRProductLineException if a matching vr product line could not be found
	*/
	public VRProductLine findByproductPlantID_Last(long mtCore,
		long productPlantID,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException;

	/**
	* Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product line, or <code>null</code> if a matching vr product line could not be found
	*/
	public VRProductLine fetchByproductPlantID_Last(long mtCore,
		long productPlantID,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator);

	/**
	* Returns the vr product lines before and after the current vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param id the primary key of the current vr product line
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product line
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public VRProductLine[] findByproductPlantID_PrevAndNext(long id,
		long mtCore, long productPlantID,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator)
		throws NoSuchVRProductLineException;

	/**
	* Removes all the vr product lines where mtCore = &#63; and productPlantID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	*/
	public void removeByproductPlantID(long mtCore, long productPlantID);

	/**
	* Returns the number of vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the number of matching vr product lines
	*/
	public int countByproductPlantID(long mtCore, long productPlantID);

	/**
	* Caches the vr product line in the entity cache if it is enabled.
	*
	* @param vrProductLine the vr product line
	*/
	public void cacheResult(VRProductLine vrProductLine);

	/**
	* Caches the vr product lines in the entity cache if it is enabled.
	*
	* @param vrProductLines the vr product lines
	*/
	public void cacheResult(java.util.List<VRProductLine> vrProductLines);

	/**
	* Creates a new vr product line with the primary key. Does not add the vr product line to the database.
	*
	* @param id the primary key for the new vr product line
	* @return the new vr product line
	*/
	public VRProductLine create(long id);

	/**
	* Removes the vr product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line that was removed
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public VRProductLine remove(long id) throws NoSuchVRProductLineException;

	public VRProductLine updateImpl(VRProductLine vrProductLine);

	/**
	* Returns the vr product line with the primary key or throws a {@link NoSuchVRProductLineException} if it could not be found.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public VRProductLine findByPrimaryKey(long id)
		throws NoSuchVRProductLineException;

	/**
	* Returns the vr product line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line, or <code>null</code> if a vr product line with the primary key could not be found
	*/
	public VRProductLine fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductLine> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr product lines.
	*
	* @return the vr product lines
	*/
	public java.util.List<VRProductLine> findAll();

	/**
	* Returns a range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @return the range of vr product lines
	*/
	public java.util.List<VRProductLine> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr product lines
	*/
	public java.util.List<VRProductLine> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator);

	/**
	* Returns an ordered range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr product lines
	*/
	public java.util.List<VRProductLine> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductLine> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr product lines from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr product lines.
	*
	* @return the number of vr product lines
	*/
	public int countAll();
}