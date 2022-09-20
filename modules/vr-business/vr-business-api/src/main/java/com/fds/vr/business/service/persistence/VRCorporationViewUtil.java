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

import com.fds.vr.business.model.VRCorporationView;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr corporation view service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCorporationViewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationViewPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationViewPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCorporationViewUtil {
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
	public static void clearCache(VRCorporationView vrCorporationView) {
		getPersistence().clearCache(vrCorporationView);
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
	public static List<VRCorporationView> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCorporationView> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCorporationView> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCorporationView update(VRCorporationView vrCorporationView) {
		return getPersistence().update(vrCorporationView);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCorporationView update(
		VRCorporationView vrCorporationView, ServiceContext serviceContext) {
		return getPersistence().update(vrCorporationView, serviceContext);
	}

	/**
	* Returns all the vr corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorId(long inspectorId) {
		return getPersistence().findByInspectorId(inspectorId);
	}

	/**
	* Returns a range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end) {
		return getPersistence().findByInspectorId(inspectorId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .findByInspectorId(inspectorId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorId(long inspectorId,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorId(inspectorId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByInspectorId_First(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorId_First(inspectorId, orderByComparator);
	}

	/**
	* Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorId_First(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorId_First(inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByInspectorId_Last(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorId_Last(inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorId_Last(long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorId_Last(inspectorId, orderByComparator);
	}

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView[] findByInspectorId_PrevAndNext(long id,
		long inspectorId, OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorId_PrevAndNext(id, inspectorId,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation views where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	*/
	public static void removeByInspectorId(long inspectorId) {
		getPersistence().removeByInspectorId(inspectorId);
	}

	/**
	* Returns the number of vr corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching vr corporation views
	*/
	public static int countByInspectorId(long inspectorId) {
		return getPersistence().countByInspectorId(inspectorId);
	}

	/**
	* Returns all the vr corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr corporation views
	*/
	public static List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId) {
		return getPersistence().findByCorporationId(corporationId);
	}

	/**
	* Returns a range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end) {
		return getPersistence().findByCorporationId(corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView[] findByCorporationId_PrevAndNext(long id,
		java.lang.String corporationId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation views where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public static void removeByCorporationId(java.lang.String corporationId) {
		getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of vr corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr corporation views
	*/
	public static int countByCorporationId(java.lang.String corporationId) {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Returns all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId);
	}

	/**
	* Returns a range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorIdCorporationId_First(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorIdCorporationId_First(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorIdCorporationId_Last(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorIdCorporationId_Last(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView[] findByInspectorIdCorporationId_PrevAndNext(
		long id, java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorIdCorporationId_PrevAndNext(id,
			corporationId, inspectorId, orderByComparator);
	}

	/**
	* Removes all the vr corporation views where corporationId = &#63; and inspectorId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	*/
	public static void removeByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId) {
		getPersistence()
			.removeByInspectorIdCorporationId(corporationId, inspectorId);
	}

	/**
	* Returns the number of vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the number of matching vr corporation views
	*/
	public static int countByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId) {
		return getPersistence()
				   .countByInspectorIdCorporationId(corporationId, inspectorId);
	}

	/**
	* Returns all the vr corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the matching vr corporation views
	*/
	public static List<VRCorporationView> findByIsLeader(int isLeader) {
		return getPersistence().findByIsLeader(isLeader);
	}

	/**
	* Returns a range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end) {
		return getPersistence().findByIsLeader(isLeader, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .findByIsLeader(isLeader, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public static List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIsLeader(isLeader, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByIsLeader_First(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence().findByIsLeader_First(isLeader, orderByComparator);
	}

	/**
	* Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByIsLeader_First(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence()
				   .fetchByIsLeader_First(isLeader, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByIsLeader_Last(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence().findByIsLeader_Last(isLeader, orderByComparator);
	}

	/**
	* Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByIsLeader_Last(int isLeader,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence().fetchByIsLeader_Last(isLeader, orderByComparator);
	}

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView[] findByIsLeader_PrevAndNext(long id,
		int isLeader, OrderByComparator<VRCorporationView> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByIsLeader_PrevAndNext(id, isLeader, orderByComparator);
	}

	/**
	* Removes all the vr corporation views where isLeader = &#63; from the database.
	*
	* @param isLeader the is leader
	*/
	public static void removeByIsLeader(int isLeader) {
		getPersistence().removeByIsLeader(isLeader);
	}

	/**
	* Returns the number of vr corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public static int countByIsLeader(int isLeader) {
		return getPersistence().countByIsLeader(isLeader);
	}

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader);
	}

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader) {
		return getPersistence()
				   .fetchByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader);
	}

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader, retrieveFromCache);
	}

	/**
	* Removes the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the vr corporation view that was removed
	*/
	public static VRCorporationView removeByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .removeByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader);
	}

	/**
	* Returns the number of vr corporation views where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public static int countByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader) {
		return getPersistence()
				   .countByInspectorIdCorporationIdIsLeader(inspectorId,
			corporationId, isLeader);
	}

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public static VRCorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .findByCorporationIdAndIsLeader(corporationId, isLeader);
	}

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader) {
		return getPersistence()
				   .fetchByCorporationIdAndIsLeader(corporationId, isLeader);
	}

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public static VRCorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByCorporationIdAndIsLeader(corporationId, isLeader,
			retrieveFromCache);
	}

	/**
	* Removes the vr corporation view where corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the vr corporation view that was removed
	*/
	public static VRCorporationView removeByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence()
				   .removeByCorporationIdAndIsLeader(corporationId, isLeader);
	}

	/**
	* Returns the number of vr corporation views where corporationId = &#63; and isLeader = &#63;.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public static int countByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader) {
		return getPersistence()
				   .countByCorporationIdAndIsLeader(corporationId, isLeader);
	}

	/**
	* Caches the vr corporation view in the entity cache if it is enabled.
	*
	* @param vrCorporationView the vr corporation view
	*/
	public static void cacheResult(VRCorporationView vrCorporationView) {
		getPersistence().cacheResult(vrCorporationView);
	}

	/**
	* Caches the vr corporation views in the entity cache if it is enabled.
	*
	* @param vrCorporationViews the vr corporation views
	*/
	public static void cacheResult(List<VRCorporationView> vrCorporationViews) {
		getPersistence().cacheResult(vrCorporationViews);
	}

	/**
	* Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	*
	* @param id the primary key for the new vr corporation view
	* @return the new vr corporation view
	*/
	public static VRCorporationView create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view that was removed
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence().remove(id);
	}

	public static VRCorporationView updateImpl(
		VRCorporationView vrCorporationView) {
		return getPersistence().updateImpl(vrCorporationView);
	}

	/**
	* Returns the vr corporation view with the primary key or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationViewException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr corporation view with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view, or <code>null</code> if a vr corporation view with the primary key could not be found
	*/
	public static VRCorporationView fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCorporationView> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr corporation views.
	*
	* @return the vr corporation views
	*/
	public static List<VRCorporationView> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of vr corporation views
	*/
	public static List<VRCorporationView> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation views
	*/
	public static List<VRCorporationView> findAll(int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation views
	*/
	public static List<VRCorporationView> findAll(int start, int end,
		OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr corporation views from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr corporation views.
	*
	* @return the number of vr corporation views
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRCorporationViewPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCorporationViewPersistence, VRCorporationViewPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCorporationViewPersistence.class);
}