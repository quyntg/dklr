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

import com.fds.vr.business.model.VRProductionPlantEquipmentMarkup;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr production plant equipment markup service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductionPlantEquipmentMarkupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkupPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantEquipmentMarkupPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupUtil {
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
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		getPersistence().clearCache(vrProductionPlantEquipmentMarkup);
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
	public static List<VRProductionPlantEquipmentMarkup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductionPlantEquipmentMarkup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductionPlantEquipmentMarkup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductionPlantEquipmentMarkup update(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		return getPersistence().update(vrProductionPlantEquipmentMarkup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductionPlantEquipmentMarkup update(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrProductionPlantEquipmentMarkup, serviceContext);
	}

	/**
	* Returns all the vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @return the matching vr production plant equipment markups
	*/
	public static List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		return getPersistence()
				   .findByproductionPlantEquipmentId(productionPlantEquipmentId);
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end) {
		return getPersistence()
				   .findByproductionPlantEquipmentId(productionPlantEquipmentId,
			start, end);
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return getPersistence()
				   .findByproductionPlantEquipmentId(productionPlantEquipmentId,
			start, end, orderByComparator);
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId, int start, int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductionPlantEquipmentId(productionPlantEquipmentId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	*/
	public static VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException {
		return getPersistence()
				   .findByproductionPlantEquipmentId_First(productionPlantEquipmentId,
			orderByComparator);
	}

	/**
	* Returns the first vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	*/
	public static VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_First(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantEquipmentId_First(productionPlantEquipmentId,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a matching vr production plant equipment markup could not be found
	*/
	public static VRProductionPlantEquipmentMarkup findByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException {
		return getPersistence()
				   .findByproductionPlantEquipmentId_Last(productionPlantEquipmentId,
			orderByComparator);
	}

	/**
	* Returns the last vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment markup, or <code>null</code> if a matching vr production plant equipment markup could not be found
	*/
	public static VRProductionPlantEquipmentMarkup fetchByproductionPlantEquipmentId_Last(
		long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return getPersistence()
				   .fetchByproductionPlantEquipmentId_Last(productionPlantEquipmentId,
			orderByComparator);
	}

	/**
	* Returns the vr production plant equipment markups before and after the current vr production plant equipment markup in the ordered set where productionPlantEquipmentId = &#63;.
	*
	* @param id the primary key of the current vr production plant equipment markup
	* @param productionPlantEquipmentId the production plant equipment ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public static VRProductionPlantEquipmentMarkup[] findByproductionPlantEquipmentId_PrevAndNext(
		long id, long productionPlantEquipmentId,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException {
		return getPersistence()
				   .findByproductionPlantEquipmentId_PrevAndNext(id,
			productionPlantEquipmentId, orderByComparator);
	}

	/**
	* Removes all the vr production plant equipment markups where productionPlantEquipmentId = &#63; from the database.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	*/
	public static void removeByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		getPersistence()
			.removeByproductionPlantEquipmentId(productionPlantEquipmentId);
	}

	/**
	* Returns the number of vr production plant equipment markups where productionPlantEquipmentId = &#63;.
	*
	* @param productionPlantEquipmentId the production plant equipment ID
	* @return the number of matching vr production plant equipment markups
	*/
	public static int countByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		return getPersistence()
				   .countByproductionPlantEquipmentId(productionPlantEquipmentId);
	}

	/**
	* Caches the vr production plant equipment markup in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	*/
	public static void cacheResult(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		getPersistence().cacheResult(vrProductionPlantEquipmentMarkup);
	}

	/**
	* Caches the vr production plant equipment markups in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipmentMarkups the vr production plant equipment markups
	*/
	public static void cacheResult(
		List<VRProductionPlantEquipmentMarkup> vrProductionPlantEquipmentMarkups) {
		getPersistence().cacheResult(vrProductionPlantEquipmentMarkups);
	}

	/**
	* Creates a new vr production plant equipment markup with the primary key. Does not add the vr production plant equipment markup to the database.
	*
	* @param id the primary key for the new vr production plant equipment markup
	* @return the new vr production plant equipment markup
	*/
	public static VRProductionPlantEquipmentMarkup create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup that was removed
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public static VRProductionPlantEquipmentMarkup remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException {
		return getPersistence().remove(id);
	}

	public static VRProductionPlantEquipmentMarkup updateImpl(
		VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		return getPersistence().updateImpl(vrProductionPlantEquipmentMarkup);
	}

	/**
	* Returns the vr production plant equipment markup with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentMarkupException} if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup
	* @throws NoSuchVRProductionPlantEquipmentMarkupException if a vr production plant equipment markup with the primary key could not be found
	*/
	public static VRProductionPlantEquipmentMarkup findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr production plant equipment markup with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup, or <code>null</code> if a vr production plant equipment markup with the primary key could not be found
	*/
	public static VRProductionPlantEquipmentMarkup fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductionPlantEquipmentMarkup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr production plant equipment markups.
	*
	* @return the vr production plant equipment markups
	*/
	public static List<VRProductionPlantEquipmentMarkup> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRProductionPlantEquipmentMarkup> findAll(int start,
		int end,
		OrderByComparator<VRProductionPlantEquipmentMarkup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr production plant equipment markups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr production plant equipment markups.
	*
	* @return the number of vr production plant equipment markups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductionPlantEquipmentMarkupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantEquipmentMarkupPersistence, VRProductionPlantEquipmentMarkupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantEquipmentMarkupPersistence.class);
}