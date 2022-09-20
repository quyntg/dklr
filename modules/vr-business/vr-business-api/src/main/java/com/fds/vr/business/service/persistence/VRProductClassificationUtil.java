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

import com.fds.vr.business.model.VRProductClassification;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr product classification service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductClassificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductClassificationPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductClassificationPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductClassificationUtil {
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
	public static void clearCache(
		VRProductClassification vrProductClassification) {
		getPersistence().clearCache(vrProductClassification);
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
	public static List<VRProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductClassification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductClassification update(
		VRProductClassification vrProductClassification) {
		return getPersistence().update(vrProductClassification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductClassification update(
		VRProductClassification vrProductClassification,
		ServiceContext serviceContext) {
		return getPersistence().update(vrProductClassification, serviceContext);
	}

	/**
	* Returns all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the matching vr product classifications
	*/
	public static List<VRProductClassification> findByproductPlantID(
		long mtCore, long productPlantID) {
		return getPersistence().findByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Returns a range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @return the range of matching vr product classifications
	*/
	public static List<VRProductClassification> findByproductPlantID(
		long mtCore, long productPlantID, int start, int end) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end);
	}

	/**
	* Returns an ordered range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr product classifications
	*/
	public static List<VRProductClassification> findByproductPlantID(
		long mtCore, long productPlantID, int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr product classifications
	*/
	public static List<VRProductClassification> findByproductPlantID(
		long mtCore, long productPlantID, int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product classification
	* @throws NoSuchVRProductClassificationException if a matching vr product classification could not be found
	*/
	public static VRProductClassification findByproductPlantID_First(
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductClassificationException {
		return getPersistence()
				   .findByproductPlantID_First(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the first vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product classification, or <code>null</code> if a matching vr product classification could not be found
	*/
	public static VRProductClassification fetchByproductPlantID_First(
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchByproductPlantID_First(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the last vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product classification
	* @throws NoSuchVRProductClassificationException if a matching vr product classification could not be found
	*/
	public static VRProductClassification findByproductPlantID_Last(
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductClassificationException {
		return getPersistence()
				   .findByproductPlantID_Last(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the last vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product classification, or <code>null</code> if a matching vr product classification could not be found
	*/
	public static VRProductClassification fetchByproductPlantID_Last(
		long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return getPersistence()
				   .fetchByproductPlantID_Last(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the vr product classifications before and after the current vr product classification in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param id the primary key of the current vr product classification
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product classification
	* @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	*/
	public static VRProductClassification[] findByproductPlantID_PrevAndNext(
		long id, long mtCore, long productPlantID,
		OrderByComparator<VRProductClassification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductClassificationException {
		return getPersistence()
				   .findByproductPlantID_PrevAndNext(id, mtCore,
			productPlantID, orderByComparator);
	}

	/**
	* Removes all the vr product classifications where mtCore = &#63; and productPlantID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	*/
	public static void removeByproductPlantID(long mtCore, long productPlantID) {
		getPersistence().removeByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Returns the number of vr product classifications where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the number of matching vr product classifications
	*/
	public static int countByproductPlantID(long mtCore, long productPlantID) {
		return getPersistence().countByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Caches the vr product classification in the entity cache if it is enabled.
	*
	* @param vrProductClassification the vr product classification
	*/
	public static void cacheResult(
		VRProductClassification vrProductClassification) {
		getPersistence().cacheResult(vrProductClassification);
	}

	/**
	* Caches the vr product classifications in the entity cache if it is enabled.
	*
	* @param vrProductClassifications the vr product classifications
	*/
	public static void cacheResult(
		List<VRProductClassification> vrProductClassifications) {
		getPersistence().cacheResult(vrProductClassifications);
	}

	/**
	* Creates a new vr product classification with the primary key. Does not add the vr product classification to the database.
	*
	* @param id the primary key for the new vr product classification
	* @return the new vr product classification
	*/
	public static VRProductClassification create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr product classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product classification
	* @return the vr product classification that was removed
	* @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	*/
	public static VRProductClassification remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductClassificationException {
		return getPersistence().remove(id);
	}

	public static VRProductClassification updateImpl(
		VRProductClassification vrProductClassification) {
		return getPersistence().updateImpl(vrProductClassification);
	}

	/**
	* Returns the vr product classification with the primary key or throws a {@link NoSuchVRProductClassificationException} if it could not be found.
	*
	* @param id the primary key of the vr product classification
	* @return the vr product classification
	* @throws NoSuchVRProductClassificationException if a vr product classification with the primary key could not be found
	*/
	public static VRProductClassification findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductClassificationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr product classification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr product classification
	* @return the vr product classification, or <code>null</code> if a vr product classification with the primary key could not be found
	*/
	public static VRProductClassification fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductClassification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr product classifications.
	*
	* @return the vr product classifications
	*/
	public static List<VRProductClassification> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @return the range of vr product classifications
	*/
	public static List<VRProductClassification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr product classifications
	*/
	public static List<VRProductClassification> findAll(int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr product classifications
	*/
	public static List<VRProductClassification> findAll(int start, int end,
		OrderByComparator<VRProductClassification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr product classifications from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr product classifications.
	*
	* @return the number of vr product classifications
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductClassificationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductClassificationPersistence, VRProductClassificationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductClassificationPersistence.class);
}