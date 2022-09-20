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

import com.fds.vr.business.model.VRCorporationInspector;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr corporation inspector service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCorporationInspectorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCorporationInspectorPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationInspectorPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCorporationInspectorUtil {
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
	public static void clearCache(VRCorporationInspector vrCorporationInspector) {
		getPersistence().clearCache(vrCorporationInspector);
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
	public static List<VRCorporationInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCorporationInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCorporationInspector> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCorporationInspector update(
		VRCorporationInspector vrCorporationInspector) {
		return getPersistence().update(vrCorporationInspector);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCorporationInspector update(
		VRCorporationInspector vrCorporationInspector,
		ServiceContext serviceContext) {
		return getPersistence().update(vrCorporationInspector, serviceContext);
	}

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	*
	* @param inspectorid the inspectorid
	* @return the matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByInspectorId(long inspectorid)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().findByInspectorId(inspectorid);
	}

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorid the inspectorid
	* @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByInspectorId(long inspectorid) {
		return getPersistence().fetchByInspectorId(inspectorid);
	}

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorid the inspectorid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByInspectorId(long inspectorid,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByInspectorId(inspectorid, retrieveFromCache);
	}

	/**
	* Removes the vr corporation inspector where inspectorid = &#63; from the database.
	*
	* @param inspectorid the inspectorid
	* @return the vr corporation inspector that was removed
	*/
	public static VRCorporationInspector removeByInspectorId(long inspectorid)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().removeByInspectorId(inspectorid);
	}

	/**
	* Returns the number of vr corporation inspectors where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @return the number of matching vr corporation inspectors
	*/
	public static int countByInspectorId(long inspectorid) {
		return getPersistence().countByInspectorId(inspectorid);
	}

	/**
	* Returns all the vr corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByTeamId(long teamId) {
		return getPersistence().findByTeamId(teamId);
	}

	/**
	* Returns a range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end) {
		return getPersistence().findByTeamId(teamId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .findByTeamId(teamId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTeamId(teamId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByTeamId_First(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().findByTeamId_First(teamId, orderByComparator);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByTeamId_First(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence().fetchByTeamId_First(teamId, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByTeamId_Last(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().findByTeamId_Last(teamId, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByTeamId_Last(long teamId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence().fetchByTeamId_Last(teamId, orderByComparator);
	}

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector[] findByTeamId_PrevAndNext(long id,
		long teamId, OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByTeamId_PrevAndNext(id, teamId, orderByComparator);
	}

	/**
	* Removes all the vr corporation inspectors where teamId = &#63; from the database.
	*
	* @param teamId the team ID
	*/
	public static void removeByTeamId(long teamId) {
		getPersistence().removeByTeamId(teamId);
	}

	/**
	* Returns the number of vr corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the number of matching vr corporation inspectors
	*/
	public static int countByTeamId(long teamId) {
		return getPersistence().countByTeamId(teamId);
	}

	/**
	* Returns all the vr corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId) {
		return getPersistence().findByCorporationId(corporationId);
	}

	/**
	* Returns a range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end) {
		return getPersistence().findByCorporationId(corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation inspectors where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public static void removeByCorporationId(java.lang.String corporationId) {
		getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of vr corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr corporation inspectors
	*/
	public static int countByCorporationId(java.lang.String corporationId) {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Returns all the vr corporation inspectors where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode) {
		return getPersistence().findByInspectorcode(contactcode);
	}

	/**
	* Returns a range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end) {
		return getPersistence().findByInspectorcode(contactcode, start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .findByInspectorcode(contactcode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorcode(contactcode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByInspectorcode_First(
		java.lang.String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByInspectorcode_First(contactcode, orderByComparator);
	}

	/**
	* Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByInspectorcode_First(
		java.lang.String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorcode_First(contactcode, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector findByInspectorcode_Last(
		java.lang.String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByInspectorcode_Last(contactcode, orderByComparator);
	}

	/**
	* Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public static VRCorporationInspector fetchByInspectorcode_Last(
		java.lang.String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorcode_Last(contactcode, orderByComparator);
	}

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector[] findByInspectorcode_PrevAndNext(
		long id, java.lang.String contactcode,
		OrderByComparator<VRCorporationInspector> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence()
				   .findByInspectorcode_PrevAndNext(id, contactcode,
			orderByComparator);
	}

	/**
	* Removes all the vr corporation inspectors where contactcode = &#63; from the database.
	*
	* @param contactcode the contactcode
	*/
	public static void removeByInspectorcode(java.lang.String contactcode) {
		getPersistence().removeByInspectorcode(contactcode);
	}

	/**
	* Returns the number of vr corporation inspectors where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the number of matching vr corporation inspectors
	*/
	public static int countByInspectorcode(java.lang.String contactcode) {
		return getPersistence().countByInspectorcode(contactcode);
	}

	/**
	* Caches the vr corporation inspector in the entity cache if it is enabled.
	*
	* @param vrCorporationInspector the vr corporation inspector
	*/
	public static void cacheResult(
		VRCorporationInspector vrCorporationInspector) {
		getPersistence().cacheResult(vrCorporationInspector);
	}

	/**
	* Caches the vr corporation inspectors in the entity cache if it is enabled.
	*
	* @param vrCorporationInspectors the vr corporation inspectors
	*/
	public static void cacheResult(
		List<VRCorporationInspector> vrCorporationInspectors) {
		getPersistence().cacheResult(vrCorporationInspectors);
	}

	/**
	* Creates a new vr corporation inspector with the primary key. Does not add the vr corporation inspector to the database.
	*
	* @param id the primary key for the new vr corporation inspector
	* @return the new vr corporation inspector
	*/
	public static VRCorporationInspector create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector that was removed
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().remove(id);
	}

	public static VRCorporationInspector updateImpl(
		VRCorporationInspector vrCorporationInspector) {
		return getPersistence().updateImpl(vrCorporationInspector);
	}

	/**
	* Returns the vr corporation inspector with the primary key or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCorporationInspectorException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector, or <code>null</code> if a vr corporation inspector with the primary key could not be found
	*/
	public static VRCorporationInspector fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCorporationInspector> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr corporation inspectors.
	*
	* @return the vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findAll(int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation inspectors
	*/
	public static List<VRCorporationInspector> findAll(int start, int end,
		OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr corporation inspectors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr corporation inspectors.
	*
	* @return the number of vr corporation inspectors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRCorporationInspectorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCorporationInspectorPersistence, VRCorporationInspectorPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCorporationInspectorPersistence.class);
}