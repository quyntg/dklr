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

import com.fds.vr.business.model.VRLimitConfigTechSpec;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr limit config tech spec service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRLimitConfigTechSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRLimitConfigTechSpecPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRLimitConfigTechSpecPersistenceImpl
 * @generated
 */
@ProviderType
public class VRLimitConfigTechSpecUtil {
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
	public static void clearCache(VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		getPersistence().clearCache(vrLimitConfigTechSpec);
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
	public static List<VRLimitConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRLimitConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRLimitConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRLimitConfigTechSpec update(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return getPersistence().update(vrLimitConfigTechSpec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRLimitConfigTechSpec update(
		VRLimitConfigTechSpec vrLimitConfigTechSpec,
		ServiceContext serviceContext) {
		return getPersistence().update(vrLimitConfigTechSpec, serviceContext);
	}

	/**
	* Returns all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @return the matching vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig) {
		return getPersistence()
				   .findByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig);
	}

	/**
	* Returns a range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @return the range of matching vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end) {
		return getPersistence()
				   .findByVT_MU_DC(vehicleType, markupSMRM,
			searchingDriveConfig, start, end);
	}

	/**
	* Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVT_MU_DC(vehicleType, markupSMRM,
			searchingDriveConfig, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVT_MU_DC(vehicleType, markupSMRM,
			searchingDriveConfig, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	*/
	public static VRLimitConfigTechSpec findByVT_MU_DC_First(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException {
		return getPersistence()
				   .findByVT_MU_DC_First(vehicleType, markupSMRM,
			searchingDriveConfig, orderByComparator);
	}

	/**
	* Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	*/
	public static VRLimitConfigTechSpec fetchByVT_MU_DC_First(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVT_MU_DC_First(vehicleType, markupSMRM,
			searchingDriveConfig, orderByComparator);
	}

	/**
	* Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	*/
	public static VRLimitConfigTechSpec findByVT_MU_DC_Last(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException {
		return getPersistence()
				   .findByVT_MU_DC_Last(vehicleType, markupSMRM,
			searchingDriveConfig, orderByComparator);
	}

	/**
	* Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	*/
	public static VRLimitConfigTechSpec fetchByVT_MU_DC_Last(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVT_MU_DC_Last(vehicleType, markupSMRM,
			searchingDriveConfig, orderByComparator);
	}

	/**
	* Returns the vr limit config tech specs before and after the current vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param id the primary key of the current vr limit config tech spec
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public static VRLimitConfigTechSpec[] findByVT_MU_DC_PrevAndNext(long id,
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException {
		return getPersistence()
				   .findByVT_MU_DC_PrevAndNext(id, vehicleType, markupSMRM,
			searchingDriveConfig, orderByComparator);
	}

	/**
	* Removes all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63; from the database.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	*/
	public static void removeByVT_MU_DC(java.lang.String vehicleType,
		java.lang.String markupSMRM, long searchingDriveConfig) {
		getPersistence()
			.removeByVT_MU_DC(vehicleType, markupSMRM, searchingDriveConfig);
	}

	/**
	* Returns the number of vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @return the number of matching vr limit config tech specs
	*/
	public static int countByVT_MU_DC(java.lang.String vehicleType,
		java.lang.String markupSMRM, long searchingDriveConfig) {
		return getPersistence()
				   .countByVT_MU_DC(vehicleType, markupSMRM,
			searchingDriveConfig);
	}

	/**
	* Caches the vr limit config tech spec in the entity cache if it is enabled.
	*
	* @param vrLimitConfigTechSpec the vr limit config tech spec
	*/
	public static void cacheResult(VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		getPersistence().cacheResult(vrLimitConfigTechSpec);
	}

	/**
	* Caches the vr limit config tech specs in the entity cache if it is enabled.
	*
	* @param vrLimitConfigTechSpecs the vr limit config tech specs
	*/
	public static void cacheResult(
		List<VRLimitConfigTechSpec> vrLimitConfigTechSpecs) {
		getPersistence().cacheResult(vrLimitConfigTechSpecs);
	}

	/**
	* Creates a new vr limit config tech spec with the primary key. Does not add the vr limit config tech spec to the database.
	*
	* @param id the primary key for the new vr limit config tech spec
	* @return the new vr limit config tech spec
	*/
	public static VRLimitConfigTechSpec create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec that was removed
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public static VRLimitConfigTechSpec remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException {
		return getPersistence().remove(id);
	}

	public static VRLimitConfigTechSpec updateImpl(
		VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return getPersistence().updateImpl(vrLimitConfigTechSpec);
	}

	/**
	* Returns the vr limit config tech spec with the primary key or throws a {@link NoSuchVRLimitConfigTechSpecException} if it could not be found.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public static VRLimitConfigTechSpec findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr limit config tech spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec, or <code>null</code> if a vr limit config tech spec with the primary key could not be found
	*/
	public static VRLimitConfigTechSpec fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRLimitConfigTechSpec> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr limit config tech specs.
	*
	* @return the vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @return the range of vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr limit config tech specs
	*/
	public static List<VRLimitConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr limit config tech specs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr limit config tech specs.
	*
	* @return the number of vr limit config tech specs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRLimitConfigTechSpecPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRLimitConfigTechSpecPersistence, VRLimitConfigTechSpecPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRLimitConfigTechSpecPersistence.class);
}