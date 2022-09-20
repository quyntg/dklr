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

import com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException;
import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant equipment markup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantEquipmentMarkupPersistenceImpl
 * @see VRProductionPlantEquipmentMarkupUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantEquipmentMarkupPersistence
	extends BasePersistence<VRProductionPlantEquipmentMarkup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantEquipmentMarkupUtil} to access the vr production plant equipment markup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @return the matching vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId);

	/**
	* Returns a range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @return the range of matching vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end);

	/**
	* Returns an ordered range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	*/
	public VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException;

	/**
	* Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	*/
	public VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator);

	/**
	* Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	*/
	public VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException;

	/**
	* Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	*/
	public VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator);

	/**
	* Returns the vr production plant equipment markups before and after the current vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param id the primary key of the current vr production plant equipment markup
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public VRProductionPlantEquipmentMarkup[] findByproductionPlantEquipmentId_PrevAndNext(
		long id, long productionPlantEquipmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws NoSuchVRProductionPlantEquipmentMarkupException;

	/**
	* Removes all the vr production plant equipment markups where productionPlantEquipmentId = &#63; from the database.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	*/
	public void removeByproductionPlantEquipmentId(
		long productionPlantEquipmentId);

	/**
	* Returns the number of vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @return the number of matching vr production plant equipment markups
	*/
	public int countByproductionPlantEquipmentId(
		long productionPlantEquipmentId);

	/**
	* Caches the vr production plant equipment markup in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	*/
	public void cacheResult(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup);

	/**
	* Caches the vr production plant equipment markups in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipmentMarkups the vr production plant equipment markups
	*/
	public void cacheResult(
		java.util.List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups);

	/**
	* Creates a new vr production plant equipment markup with the primary key. Does not add the vr production plant equipment markup to the database.
	*
	* @param id the primary key for the new vr production plant equipment markup
	* @return the new vr production plant equipment markup
	*/
	public VRProductionPlantEquipmentMarkup create(long id);

	/**
	* Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup that was removed
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public VRProductionPlantEquipmentMarkup remove(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException;

	public VRProductionPlantEquipmentMarkup updateImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup);

	/**
	* Returns the vr production plant equipment markup with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentMarkupException} if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public VRProductionPlantEquipmentMarkup findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantEquipmentMarkupException;

	/**
	* Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	*/
	public VRProductionPlantEquipmentMarkup fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlantEquipmentMarkup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plant equipment markups.
	*
	* @return the vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findAll();

	/**
	* Returns a range of all the vr production plant equipment markups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @return the range of vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the vr production plant equipment markups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant equipment markups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant equipment markups
	*/
	public java.util.List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plant equipment markups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plant equipment markups.
	*
	* @return the number of vr production plant equipment markups
	*/
	public int countAll();
}