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

import com.fds.vr.business.model.VRConfigTechSpec;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr config tech spec service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRConfigTechSpecPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRConfigTechSpecPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRConfigTechSpecPersistenceImpl
 * @generated
 */
@ProviderType
public class VRConfigTechSpecUtil {
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
	public static void clearCache(VRConfigTechSpec vrConfigTechSpec) {
		getPersistence().clearCache(vrConfigTechSpec);
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
	public static List<VRConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRConfigTechSpec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRConfigTechSpec update(VRConfigTechSpec vrConfigTechSpec) {
		return getPersistence().update(vrConfigTechSpec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRConfigTechSpec update(VRConfigTechSpec vrConfigTechSpec,
		ServiceContext serviceContext) {
		return getPersistence().update(vrConfigTechSpec, serviceContext);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleType, specCategory);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleType, specCategory,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleType, specCategory,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleType, specCategory,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_VT_SC_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_First(vehicleClass, vehicleType,
			specCategory, orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_VT_SC_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_VT_SC_First(vehicleClass, vehicleType,
			specCategory, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_VT_SC_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_Last(vehicleClass, vehicleType,
			specCategory, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_VT_SC_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_VT_SC_Last(vehicleClass, vehicleType,
			specCategory, orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_VT_SC_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_PrevAndNext(id, vehicleClass, vehicleType,
			specCategory, orderByComparator);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_VT_SC(vehicleClass, vehicleTypes, specCategory,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	*/
	public static void removeByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory) {
		getPersistence()
			.removeByVC_VT_SC(vehicleClass, vehicleType, specCategory);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory) {
		return getPersistence()
				   .countByVC_VT_SC(vehicleClass, vehicleType, specCategory);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String[] vehicleTypes, java.lang.String specCategory) {
		return getPersistence()
				   .countByVC_VT_SC(vehicleClass, vehicleTypes, specCategory);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_VT_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_MD_First(vehicleClass, vehicleType,
			specCategory, module, orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_VT_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_VT_SC_MD_First(vehicleClass, vehicleType,
			specCategory, module, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_VT_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_MD_Last(vehicleClass, vehicleType,
			specCategory, module, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_VT_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_VT_SC_MD_Last(vehicleClass, vehicleType,
			specCategory, module, orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_VT_SC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_VT_SC_MD_PrevAndNext(id, vehicleClass,
			vehicleType, specCategory, module, orderByComparator);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_VT_SC_MD(vehicleClass, vehicleTypes, specCategory,
			module, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	*/
	public static void removeByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory,
		java.lang.String module) {
		getPersistence()
			.removeByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory, module);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory,
		java.lang.String module) {
		return getPersistence()
				   .countByVC_VT_SC_MD(vehicleClass, vehicleType, specCategory,
			module);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String[] vehicleTypes, java.lang.String specCategory,
		java.lang.String module) {
		return getPersistence()
				   .countByVC_VT_SC_MD(vehicleClass, vehicleTypes,
			specCategory, module);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory) {
		return getPersistence().findByVC_SC(vehicleClass, specCategory);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end) {
		return getPersistence()
				   .findByVC_SC(vehicleClass, specCategory, start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_SC(vehicleClass, specCategory, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_SC(vehicleClass, specCategory, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_First(vehicleClass, specCategory,
			orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_First(vehicleClass, specCategory,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_Last(vehicleClass, specCategory,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_Last(vehicleClass, specCategory,
			orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_SC_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_PrevAndNext(id, vehicleClass, specCategory,
			orderByComparator);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	*/
	public static void removeByVC_SC(java.lang.String vehicleClass,
		java.lang.String specCategory) {
		getPersistence().removeByVC_SC(vehicleClass, specCategory);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_SC(java.lang.String vehicleClass,
		java.lang.String specCategory) {
		return getPersistence().countByVC_SC(vehicleClass, specCategory);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module) {
		return getPersistence()
				   .findByVC_SC_MD(vehicleClass, specCategory, module);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end) {
		return getPersistence()
				   .findByVC_SC_MD(vehicleClass, specCategory, module, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_SC_MD(vehicleClass, specCategory, module, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_SC_MD(vehicleClass, specCategory, module, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD_First(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_MD_First(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD_Last(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_MD_Last(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_SC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD_PrevAndNext(id, vehicleClass, specCategory,
			module, orderByComparator);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	*/
	public static void removeByVC_SC_MD(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module) {
		getPersistence().removeByVC_SC_MD(vehicleClass, specCategory, module);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_SC_MD(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module) {
		return getPersistence()
				   .countByVC_SC_MD(vehicleClass, specCategory, module);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module) {
		return getPersistence()
				   .findByVC_SC_MD_(vehicleClass, specCategory, module);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end) {
		return getPersistence()
				   .findByVC_SC_MD_(vehicleClass, specCategory, module, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_SC_MD_(vehicleClass, specCategory, module, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_SC_MD_(vehicleClass, specCategory, module, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_MD__First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD__First(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_MD__First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_MD__First(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_SC_MD__Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD__Last(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_SC_MD__Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_SC_MD__Last(vehicleClass, specCategory, module,
			orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_SC_MD__PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_SC_MD__PrevAndNext(id, vehicleClass, specCategory,
			module, orderByComparator);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	*/
	public static void removeByVC_SC_MD_(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module) {
		getPersistence().removeByVC_SC_MD_(vehicleClass, specCategory, module);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_SC_MD_(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module) {
		return getPersistence()
				   .countByVC_SC_MD_(vehicleClass, specCategory, module);
	}

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module) {
		return getPersistence().findByVC_MD(vehicleClass, module);
	}

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end) {
		return getPersistence().findByVC_MD(vehicleClass, module, start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .findByVC_MD(vehicleClass, module, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public static List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end, OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVC_MD(vehicleClass, module, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_MD_First(
		java.lang.String vehicleClass, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_MD_First(vehicleClass, module, orderByComparator);
	}

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_MD_First(
		java.lang.String vehicleClass, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_MD_First(vehicleClass, module, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec findByVC_MD_Last(
		java.lang.String vehicleClass, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_MD_Last(vehicleClass, module, orderByComparator);
	}

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public static VRConfigTechSpec fetchByVC_MD_Last(
		java.lang.String vehicleClass, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence()
				   .fetchByVC_MD_Last(vehicleClass, module, orderByComparator);
	}

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec[] findByVC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String module,
		OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence()
				   .findByVC_MD_PrevAndNext(id, vehicleClass, module,
			orderByComparator);
	}

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	*/
	public static void removeByVC_MD(java.lang.String vehicleClass,
		java.lang.String module) {
		getPersistence().removeByVC_MD(vehicleClass, module);
	}

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public static int countByVC_MD(java.lang.String vehicleClass,
		java.lang.String module) {
		return getPersistence().countByVC_MD(vehicleClass, module);
	}

	/**
	* Caches the vr config tech spec in the entity cache if it is enabled.
	*
	* @param vrConfigTechSpec the vr config tech spec
	*/
	public static void cacheResult(VRConfigTechSpec vrConfigTechSpec) {
		getPersistence().cacheResult(vrConfigTechSpec);
	}

	/**
	* Caches the vr config tech specs in the entity cache if it is enabled.
	*
	* @param vrConfigTechSpecs the vr config tech specs
	*/
	public static void cacheResult(List<VRConfigTechSpec> vrConfigTechSpecs) {
		getPersistence().cacheResult(vrConfigTechSpecs);
	}

	/**
	* Creates a new vr config tech spec with the primary key. Does not add the vr config tech spec to the database.
	*
	* @param id the primary key for the new vr config tech spec
	* @return the new vr config tech spec
	*/
	public static VRConfigTechSpec create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec that was removed
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence().remove(id);
	}

	public static VRConfigTechSpec updateImpl(VRConfigTechSpec vrConfigTechSpec) {
		return getPersistence().updateImpl(vrConfigTechSpec);
	}

	/**
	* Returns the vr config tech spec with the primary key or throws a {@link NoSuchVRConfigTechSpecException} if it could not be found.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRConfigTechSpecException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr config tech spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec, or <code>null</code> if a vr config tech spec with the primary key could not be found
	*/
	public static VRConfigTechSpec fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRConfigTechSpec> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr config tech specs.
	*
	* @return the vr config tech specs
	*/
	public static List<VRConfigTechSpec> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of vr config tech specs
	*/
	public static List<VRConfigTechSpec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr config tech specs
	*/
	public static List<VRConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr config tech specs
	*/
	public static List<VRConfigTechSpec> findAll(int start, int end,
		OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr config tech specs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr config tech specs.
	*
	* @return the number of vr config tech specs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRConfigTechSpecPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRConfigTechSpecPersistence, VRConfigTechSpecPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRConfigTechSpecPersistence.class);
}