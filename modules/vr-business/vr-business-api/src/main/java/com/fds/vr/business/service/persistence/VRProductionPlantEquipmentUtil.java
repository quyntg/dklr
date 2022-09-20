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

import com.fds.vr.business.model.VRProductionPlantEquipment;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr production plant equipment service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductionPlantEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductionPlantEquipmentPersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentUtil {
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
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		getPersistence().clearCache(vrProductionPlantEquipment);
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
	public static List<VRProductionPlantEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductionPlantEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductionPlantEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductionPlantEquipment update(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		return getPersistence().update(vrProductionPlantEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductionPlantEquipment update(
		VRProductionPlantEquipment vrProductionPlantEquipment,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrProductionPlantEquipment, serviceContext);
	}

	/**
	* Returns all the vr production plant equipments where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findByPPC(
		java.lang.String productionPlantCode) {
		return getPersistence().findByPPC(productionPlantCode);
	}

	/**
	* Returns a range of all the vr production plant equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @return the range of matching vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence().findByPPC(productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr production plant equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return getPersistence()
				   .findByPPC(productionPlantCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plant equipments where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPPC(productionPlantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment
	* @throws NoSuchVRProductionPlantEquipmentException if a matching vr production plant equipment could not be found
	*/
	public static VRProductionPlantEquipment findByPPC_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException {
		return getPersistence()
				   .findByPPC_First(productionPlantCode, orderByComparator);
	}

	/**
	* Returns the first vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production plant equipment, or <code>null</code> if a matching vr production plant equipment could not be found
	*/
	public static VRProductionPlantEquipment fetchByPPC_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByPPC_First(productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment
	* @throws NoSuchVRProductionPlantEquipmentException if a matching vr production plant equipment could not be found
	*/
	public static VRProductionPlantEquipment findByPPC_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException {
		return getPersistence()
				   .findByPPC_Last(productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production plant equipment, or <code>null</code> if a matching vr production plant equipment could not be found
	*/
	public static VRProductionPlantEquipment fetchByPPC_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByPPC_Last(productionPlantCode, orderByComparator);
	}

	/**
	* Returns the vr production plant equipments before and after the current vr production plant equipment in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production plant equipment
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production plant equipment
	* @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	*/
	public static VRProductionPlantEquipment[] findByPPC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException {
		return getPersistence()
				   .findByPPC_PrevAndNext(id, productionPlantCode,
			orderByComparator);
	}

	/**
	* Removes all the vr production plant equipments where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public static void removeByPPC(java.lang.String productionPlantCode) {
		getPersistence().removeByPPC(productionPlantCode);
	}

	/**
	* Returns the number of vr production plant equipments where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production plant equipments
	*/
	public static int countByPPC(java.lang.String productionPlantCode) {
		return getPersistence().countByPPC(productionPlantCode);
	}

	/**
	* Caches the vr production plant equipment in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipment the vr production plant equipment
	*/
	public static void cacheResult(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		getPersistence().cacheResult(vrProductionPlantEquipment);
	}

	/**
	* Caches the vr production plant equipments in the entity cache if it is enabled.
	*
	* @param vrProductionPlantEquipments the vr production plant equipments
	*/
	public static void cacheResult(
		List<VRProductionPlantEquipment> vrProductionPlantEquipments) {
		getPersistence().cacheResult(vrProductionPlantEquipments);
	}

	/**
	* Creates a new vr production plant equipment with the primary key. Does not add the vr production plant equipment to the database.
	*
	* @param id the primary key for the new vr production plant equipment
	* @return the new vr production plant equipment
	*/
	public static VRProductionPlantEquipment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant equipment
	* @return the vr production plant equipment that was removed
	* @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	*/
	public static VRProductionPlantEquipment remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException {
		return getPersistence().remove(id);
	}

	public static VRProductionPlantEquipment updateImpl(
		VRProductionPlantEquipment vrProductionPlantEquipment) {
		return getPersistence().updateImpl(vrProductionPlantEquipment);
	}

	/**
	* Returns the vr production plant equipment with the primary key or throws a {@link NoSuchVRProductionPlantEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment
	* @return the vr production plant equipment
	* @throws NoSuchVRProductionPlantEquipmentException if a vr production plant equipment with the primary key could not be found
	*/
	public static VRProductionPlantEquipment findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr production plant equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production plant equipment
	* @return the vr production plant equipment, or <code>null</code> if a vr production plant equipment with the primary key could not be found
	*/
	public static VRProductionPlantEquipment fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductionPlantEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr production plant equipments.
	*
	* @return the vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @return the range of vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipments
	* @param end the upper bound of the range of vr production plant equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production plant equipments
	*/
	public static List<VRProductionPlantEquipment> findAll(int start, int end,
		OrderByComparator<VRProductionPlantEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr production plant equipments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr production plant equipments.
	*
	* @return the number of vr production plant equipments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductionPlantEquipmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantEquipmentPersistence, VRProductionPlantEquipmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantEquipmentPersistence.class);
}