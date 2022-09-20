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

import com.fds.vr.business.model.VRProductType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr product type service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductTypePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductTypePersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductTypeUtil {
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
	public static void clearCache(VRProductType vrProductType) {
		getPersistence().clearCache(vrProductType);
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
	public static List<VRProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductType update(VRProductType vrProductType) {
		return getPersistence().update(vrProductType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductType update(VRProductType vrProductType,
		ServiceContext serviceContext) {
		return getPersistence().update(vrProductType, serviceContext);
	}

	/**
	* Returns all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @return the matching vr product types
	*/
	public static List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode) {
		return getPersistence()
				   .findByPPC_PCC(productionPlantCode, productClassificationCode);
	}

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
	public static List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end) {
		return getPersistence()
				   .findByPPC_PCC(productionPlantCode,
			productClassificationCode, start, end);
	}

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
	public static List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .findByPPC_PCC(productionPlantCode,
			productClassificationCode, start, end, orderByComparator);
	}

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
	public static List<VRProductType> findByPPC_PCC(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode, int start, int end,
		OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPPC_PCC(productionPlantCode,
			productClassificationCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public static VRProductType findByPPC_PCC_First(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByPPC_PCC_First(productionPlantCode,
			productClassificationCode, orderByComparator);
	}

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public static VRProductType fetchByPPC_PCC_First(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .fetchByPPC_PCC_First(productionPlantCode,
			productClassificationCode, orderByComparator);
	}

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public static VRProductType findByPPC_PCC_Last(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByPPC_PCC_Last(productionPlantCode,
			productClassificationCode, orderByComparator);
	}

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public static VRProductType fetchByPPC_PCC_Last(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .fetchByPPC_PCC_Last(productionPlantCode,
			productClassificationCode, orderByComparator);
	}

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
	public static VRProductType[] findByPPC_PCC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByPPC_PCC_PrevAndNext(id, productionPlantCode,
			productClassificationCode, orderByComparator);
	}

	/**
	* Removes all the vr product types where productionPlantCode = &#63; and productClassificationCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	*/
	public static void removeByPPC_PCC(java.lang.String productionPlantCode,
		java.lang.String productClassificationCode) {
		getPersistence()
			.removeByPPC_PCC(productionPlantCode, productClassificationCode);
	}

	/**
	* Returns the number of vr product types where productionPlantCode = &#63; and productClassificationCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param productClassificationCode the product classification code
	* @return the number of matching vr product types
	*/
	public static int countByPPC_PCC(java.lang.String productionPlantCode,
		java.lang.String productClassificationCode) {
		return getPersistence()
				   .countByPPC_PCC(productionPlantCode,
			productClassificationCode);
	}

	/**
	* Returns all the vr product types where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr product types
	*/
	public static List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().findByproductionPlantCode(productionPlantCode);
	}

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
	public static List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence()
				   .findByproductionPlantCode(productionPlantCode, start, end);
	}

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
	public static List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantCode(productionPlantCode, start, end,
			orderByComparator);
	}

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
	public static List<VRProductType> findByproductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantCode(productionPlantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public static VRProductType findByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByproductionPlantCode_First(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the first vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public static VRProductType fetchByproductionPlantCode_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_First(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type
	* @throws NoSuchVRProductTypeException if a matching vr product type could not be found
	*/
	public static VRProductType findByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByproductionPlantCode_Last(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product type, or <code>null</code> if a matching vr product type could not be found
	*/
	public static VRProductType fetchByproductionPlantCode_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantCode_Last(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the vr product types before and after the current vr product type in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr product type
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product type
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public static VRProductType[] findByproductionPlantCode_PrevAndNext(
		long id, java.lang.String productionPlantCode,
		OrderByComparator<VRProductType> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence()
				   .findByproductionPlantCode_PrevAndNext(id,
			productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vr product types where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public static void removeByproductionPlantCode(
		java.lang.String productionPlantCode) {
		getPersistence().removeByproductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the number of vr product types where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr product types
	*/
	public static int countByproductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().countByproductionPlantCode(productionPlantCode);
	}

	/**
	* Caches the vr product type in the entity cache if it is enabled.
	*
	* @param vrProductType the vr product type
	*/
	public static void cacheResult(VRProductType vrProductType) {
		getPersistence().cacheResult(vrProductType);
	}

	/**
	* Caches the vr product types in the entity cache if it is enabled.
	*
	* @param vrProductTypes the vr product types
	*/
	public static void cacheResult(List<VRProductType> vrProductTypes) {
		getPersistence().cacheResult(vrProductTypes);
	}

	/**
	* Creates a new vr product type with the primary key. Does not add the vr product type to the database.
	*
	* @param id the primary key for the new vr product type
	* @return the new vr product type
	*/
	public static VRProductType create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr product type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type that was removed
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public static VRProductType remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence().remove(id);
	}

	public static VRProductType updateImpl(VRProductType vrProductType) {
		return getPersistence().updateImpl(vrProductType);
	}

	/**
	* Returns the vr product type with the primary key or throws a {@link NoSuchVRProductTypeException} if it could not be found.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type
	* @throws NoSuchVRProductTypeException if a vr product type with the primary key could not be found
	*/
	public static VRProductType findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr product type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type, or <code>null</code> if a vr product type with the primary key could not be found
	*/
	public static VRProductType fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr product types.
	*
	* @return the vr product types
	*/
	public static List<VRProductType> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRProductType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRProductType> findAll(int start, int end,
		OrderByComparator<VRProductType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRProductType> findAll(int start, int end,
		OrderByComparator<VRProductType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr product types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr product types.
	*
	* @return the number of vr product types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductTypePersistence, VRProductTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductTypePersistence.class);
}