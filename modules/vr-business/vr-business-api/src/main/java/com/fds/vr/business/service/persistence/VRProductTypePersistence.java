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

import com.fds.vr.business.exception.NoSuchVRProductTypeException;
import com.fds.vr.business.model.VRProductType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr product type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductTypePersistenceImpl
 * @see VRProductTypeUtil
 * @generated
 */
@ProviderType
public interface VRProductTypePersistence extends BasePersistence<VRProductType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductTypeUtil} to access the vr product type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @return the matching vr product types
	*/
	public java.util.List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode);

	/**
	* Returns a range of all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @return the range of matching vr product types
	*/
	public java.util.List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end);

	/**
	* Returns an ordered range of all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr product types
	*/
	public java.util.List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr product types
	*/
	public java.util.List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public VRProductType findByPPC_PCC_First(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public VRProductType fetchByPPC_PCC_First(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public VRProductType findByPPC_PCC_Last(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public VRProductType fetchByPPC_PCC_Last(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns the vr product types before and after the current vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param id the primary key of the current vr product type
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product type
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public VRProductType[] findByPPC_PCC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Removes all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	*/
	public void removeByPPC_PCC(java.lang.String productionPlantCode,
		java.lang.String productClassificationCode);

	/**
	* Returns the number of vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @return the number of matching vr product types
	*/
	public int countByPPC_PCC(java.lang.String productionPlantCode,
		java.lang.String productClassificationCode);

	/**
	* Returns all the vr product types where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr product types
	*/
	public java.util.List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vr product types where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @return the range of matching vr product types
	*/
	public java.util.List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr product types where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr product types
	*/
	public java.util.List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vr product types where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr product types
	*/
	public java.util.List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public VRProductType findByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public VRProductType fetchByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public VRProductType findByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public VRProductType fetchByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns the vr product types before and after the current vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr product type
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product type
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public VRProductType[] findByproductionPlantCode_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator)
		throws NoSuchVRProductTypeException;

	/**
	* Removes all the vr product types where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByproductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns the number of vr product types where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr product types
	*/
	public int countByproductionPlantCode(java.lang.String productionPlantCode);

	/**
	* Caches the vr product type in the entity cache if it is enabled.
	*
	* @param vrProductType the vr product type
	*/
	public void cacheResult(VRProductType vrProductType);

	/**
	* Caches the vr product types in the entity cache if it is enabled.
	*
	* @param vrProductTypes the vr product types
	*/
	public void cacheResult(java.util.List<VRProductType> vrProductTypes);

	/**
	* Creates a new vr product type with the primary key. Does not add the vr product type to the database.
	*
	* @param id the primary key for the new vr product type
	* @return the new vr product type
	*/
	public VRProductType create(long id);

	/**
	* Removes the vr product type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type that was removed
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public VRProductType remove(long id) throws NoSuchVRProductTypeException;

	public VRProductType updateImpl(VRProductType vrProductType);

	/**
	* Returns the vr product type with the primary key or throws a {@link NoSuchVRProductTypeException} if it could not be found.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public VRProductType findByPrimaryKey(long id)
		throws NoSuchVRProductTypeException;

	/**
	* Returns the vr product type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type, or <code>null</code> if a vr product type with the primary key could not be found
	*/
	public VRProductType fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr product types.
	*
	* @return the vr product types
	*/
	public java.util.List<VRProductType> findAll();

	/**
	* Returns a range of all the vr product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @return the range of vr product types
	*/
	public java.util.List<VRProductType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr product types
	*/
	public java.util.List<VRProductType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vr product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr product types
	*/
	public java.util.List<VRProductType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr product types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr product types.
	*
	* @return the number of vr product types
	*/
	public int countAll();
}