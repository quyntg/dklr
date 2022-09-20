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

import com.fds.vr.business.exception.NoSuchVRProductionPlantSupplierException;
import com.fds.vr.business.model.VRProductionPlantSupplier;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production plant supplier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantSupplierPersistenceImpl
 * @see VRProductionPlantSupplierUtil
 * @generated
 */
@ProviderType
public interface VRProductionPlantSupplierPersistence extends BasePersistence<VRProductionPlantSupplier> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantSupplierUtil} to access the vr production plant supplier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production plant suppliers where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findBycorporationCode(
		java.lang.String corporationCode);

	/**
	* Returns a range of all the vr production plant suppliers where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @return the range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findBycorporationCode(
		java.lang.String corporationCode, int start, int end);

	/**
	* Returns an ordered range of all the vr production plant suppliers where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findBycorporationCode(
		java.lang.String corporationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant suppliers where corporationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationCode the corporation code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findBycorporationCode(
		java.lang.String corporationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant supplier in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier findBycorporationCode_First(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Returns the first vr production plant supplier in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier fetchBycorporationCode_First(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns the last vr production plant supplier in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier findBycorporationCode_Last(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Returns the last vr production plant supplier in the ordered set where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier fetchBycorporationCode_Last(
		java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns the vr production plant suppliers before and after the current vr production plant supplier in the ordered set where corporationCode = &#63;.
	*
	* @param id the primary key of the current vr production plant supplier
	* @param corporationCode the corporation code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public VRProductionPlantSupplier[] findBycorporationCode_PrevAndNext(
		long id, java.lang.String corporationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Removes all the vr production plant suppliers where corporationCode = &#63; from the database.
	*
	* @param corporationCode the corporation code
	*/
	public void removeBycorporationCode(java.lang.String corporationCode);

	/**
	* Returns the number of vr production plant suppliers where corporationCode = &#63;.
	*
	* @param corporationCode the corporation code
	* @return the number of matching vr production plant suppliers
	*/
	public int countBycorporationCode(java.lang.String corporationCode);

	/**
	* Returns all the vr production plant suppliers where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findByproductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vr production plant suppliers where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @return the range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr production plant suppliers where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant suppliers where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier findByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Returns the first vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier fetchByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns the last vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier findByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Returns the last vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant supplier, or <code>null</code> if a matching vr production plant supplier could not be found
	*/
	public VRProductionPlantSupplier fetchByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns the vr production plant suppliers before and after the current vr production plant supplier in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant supplier
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public VRProductionPlantSupplier[] findByproductionPlantCode_PrevAndNext(
		long id, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Removes all the vr production plant suppliers where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByproductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns the number of vr production plant suppliers where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plant suppliers
	*/
	public int countByproductionPlantCode(java.lang.String productionPlantCode);

	/**
	* Caches the vr production plant supplier in the entity cache if it is enabled.
	*
	* @param vrProductionPlantSupplier the vr production plant supplier
	*/
	public void cacheResult(VRProductionPlantSupplier vrProductionPlantSupplier);

	/**
	* Caches the vr production plant suppliers in the entity cache if it is enabled.
	*
	* @param vrProductionPlantSuppliers the vr production plant suppliers
	*/
	public void cacheResult(
		java.util.List<VRProductionPlantSupplier> vrProductionPlantSuppliers);

	/**
	* Creates a new vr production plant supplier with the primary key. Does not add the vr production plant supplier to the database.
	*
	* @param id the primary key for the new vr production plant supplier
	* @return the new vr production plant supplier
	*/
	public VRProductionPlantSupplier create(long id);

	/**
	* Removes the vr production plant supplier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier that was removed
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public VRProductionPlantSupplier remove(long id)
		throws NoSuchVRProductionPlantSupplierException;

	public VRProductionPlantSupplier updateImpl(
		VRProductionPlantSupplier vrProductionPlantSupplier);

	/**
	* Returns the vr production plant supplier with the primary key or throws a {@link NoSuchVRProductionPlantSupplierException} if it could not be found.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier
	* @throws NoSuchVRProductionPlantSupplierException if a vr production plant supplier with the primary key could not be found
	*/
	public VRProductionPlantSupplier findByPrimaryKey(long id)
		throws NoSuchVRProductionPlantSupplierException;

	/**
	* Returns the vr production plant supplier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier, or <code>null</code> if a vr production plant supplier with the primary key could not be found
	*/
	public VRProductionPlantSupplier fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionPlantSupplier> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production plant suppliers.
	*
	* @return the vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findAll();

	/**
	* Returns a range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @return the range of vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator);

	/**
	* Returns an ordered range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant suppliers
	*/
	public java.util.List<VRProductionPlantSupplier> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionPlantSupplier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production plant suppliers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production plant suppliers.
	*
	* @return the number of vr production plant suppliers
	*/
	public int countAll();
}