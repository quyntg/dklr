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

import com.fds.vr.business.exception.NoSuchVRProductionPlantProdEquipmentException;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant prod equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantProdEquipmentPersistenceImpl
 * @see VRProductionPlantProdEquipmentUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantProdEquipmentPersistence
	extends BasePersistence<VRProductionPlantProdEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantProdEquipmentUtil} to access the vr production plant prod equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production plant prod equipments where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findByPPC(
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @return the range of matching vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant prod equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant prod equipment
	* @throws NoSuchVRProductionPlantProdEquipmentException if a matching vr production plant prod equipment could not be found
	*/
	public VRProductionPlantProdEquipment findByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException;

	/**
	* Returns the first vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant prod equipment, or <code>null</code> if a matching vr production plant prod equipment could not be found
	*/
	public VRProductionPlantProdEquipment fetchByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator);

	/**
	* Returns the last vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant prod equipment
	* @throws NoSuchVRProductionPlantProdEquipmentException if a matching vr production plant prod equipment could not be found
	*/
	public VRProductionPlantProdEquipment findByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException;

	/**
	* Returns the last vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant prod equipment, or <code>null</code> if a matching vr production plant prod equipment could not be found
	*/
	public VRProductionPlantProdEquipment fetchByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator);

	/**
	* Returns the vr production plant prod equipments before and after the current vr production plant prod equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant prod equipment
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant prod equipment
	* @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	*/
	public VRProductionPlantProdEquipment[] findByPPC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator)
		throws NoSuchVRProductionPlantProdEquipmentException;

	/**
	* Removes all the vr production plant prod equipments where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByPPC(java.lang.String productionPlantCode);

	/**
	* Returns the number of vr production plant prod equipments where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plant prod equipments
	*/
	public int countByPPC(java.lang.String productionPlantCode);

	/**
	* Caches the vr production plant prod equipment in the entity cache if it is enabled.
	*
	* @param vrProductionPlantProdEquipment the vr production plant prod equipment
	*/
	public void cacheResult(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment);

	/**
	* Caches the vr production plant prod equipments in the entity cache if it is enabled.
	*
	* @param vrProductionPlantProdEquipments the vr production plant prod equipments
	*/
	public void cacheResult(
		java.util.List<VRProductionPlantProdEquipment> vrProductionPlantProdEquipments);

	/**
	* Creates a new vr production plant prod equipment with the primary key. Does not add the vr production plant prod equipment to the database.
	*
	* @param id the primary key for the new vr production plant prod equipment
	* @return the new vr production plant prod equipment
	*/
	public VRProductionPlantProdEquipment create(long id);

	/**
	* Removes the vr production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant prod equipment
	* @return the vr production plant prod equipment that was removed
	* @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	*/
	public VRProductionPlantProdEquipment remove(long id)
		throws NoSuchVRProductionPlantProdEquipmentException;

	public VRProductionPlantProdEquipment updateImpl(
		VRProductionPlantProdEquipment vrProductionPlantProdEquipment);

	/**
	* Returns the vr production plant prod equipment with the primary key or throws a {@link NoSuchVRProductionPlantProdEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vr production plant prod equipment
	* @return the vr production plant prod equipment
	* @throws NoSuchVRProductionPlantProdEquipmentException if a vr production plant prod equipment with the primary key could not be found
	*/
	public VRProductionPlantProdEquipment findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantProdEquipmentException;

	/**
	* Returns the vr production plant prod equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant prod equipment
	* @return the vr production plant prod equipment, or <code>null</code> if a vr production plant prod equipment with the primary key could not be found
	*/
	public VRProductionPlantProdEquipment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlantProdEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plant prod equipments.
	*
	* @return the vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findAll();

	/**
	* Returns a range of all the vr production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @return the range of vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the vr production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant prod equipments
	*/
	public java.util.List<VRProductionPlantProdEquipment> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plant prod equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plant prod equipments.
	*
	* @return the number of vr production plant prod equipments
	*/
	public int countAll();
}