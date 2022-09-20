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

import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr vehicle type certificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleTypeCertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateUtil {
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
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		getPersistence().clearCache(vrVehicleTypeCertificate);
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
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRVehicleTypeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRVehicleTypeCertificate update(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getPersistence().update(vrVehicleTypeCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRVehicleTypeCertificate update(
		VRVehicleTypeCertificate vrVehicleTypeCertificate,
		ServiceContext serviceContext) {
		return getPersistence().update(vrVehicleTypeCertificate, serviceContext);
	}

	/**
	* Returns all the vr vehicle type certificates where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId) {
		return getPersistence().findByInspectorId(inspectorId);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end) {
		return getPersistence().findByInspectorId(inspectorId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByInspectorId(inspectorId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorId(inspectorId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectorId_First(
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorId_First(inspectorId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectorId_First(
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorId_First(inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectorId_Last(
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorId_Last(inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectorId_Last(
		long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorId_Last(inspectorId, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByInspectorId_PrevAndNext(
		long id, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorId_PrevAndNext(id, inspectorId,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	*/
	public static void removeByInspectorId(long inspectorId) {
		getPersistence().removeByInspectorId(inspectorId);
	}

	/**
	* Returns the number of vr vehicle type certificates where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByInspectorId(long inspectorId) {
		return getPersistence().countByInspectorId(inspectorId);
	}

	/**
	* Returns all the vr vehicle type certificates where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId) {
		return getPersistence().findByCorporationId(corporationId);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end) {
		return getPersistence().findByCorporationId(corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public static void removeByCorporationId(java.lang.String corporationId) {
		getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of vr vehicle type certificates where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByCorporationId(java.lang.String corporationId) {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Returns all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorIdCorporationId(corporationId, inspectorId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorIdCorporationId_First(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorIdCorporationId_First(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorIdCorporationId_Last(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorIdCorporationId_Last(corporationId,
			inspectorId, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByInspectorIdCorporationId_PrevAndNext(
		long id, java.lang.String corporationId, long inspectorId,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectorIdCorporationId_PrevAndNext(id,
			corporationId, inspectorId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63; from the database.
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
	* Returns the number of vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId) {
		return getPersistence()
				   .countByInspectorIdCorporationId(corporationId, inspectorId);
	}

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode) {
		return getPersistence().findByServiceCode(serviceCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end) {
		return getPersistence().findByServiceCode(serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByServiceCode(serviceCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByServiceCode(serviceCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCode_First(
		java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCode_First(serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCode_First(
		java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCode_First(serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCode_Last(
		java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCode_Last(serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCode_Last(
		java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCode_Last(serviceCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByServiceCode_PrevAndNext(
		long id, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCode_PrevAndNext(id, serviceCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; from the database.
	*
	* @param serviceCode the service code
	*/
	public static void removeByServiceCode(java.lang.String serviceCode) {
		getPersistence().removeByServiceCode(serviceCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByServiceCode(java.lang.String serviceCode) {
		return getPersistence().countByServiceCode(serviceCode);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo) {
		return getPersistence().findByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end) {
		return getPersistence().findByApplicantIdNo(applicantIdNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantIdNo(applicantIdNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantIdNo_First(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNo_First(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantIdNo_Last(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantIdNo_Last(applicantIdNo, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByApplicantIdNo_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantIdNo_PrevAndNext(id, applicantIdNo,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	*/
	public static void removeByApplicantIdNo(java.lang.String applicantIdNo) {
		getPersistence().removeByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByApplicantIdNo(java.lang.String applicantIdNo) {
		return getPersistence().countByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode) {
		return getPersistence()
				   .findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end) {
		return getPersistence()
				   .findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantAndProductionPlant_First(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndProductionPlant_First(applicantIdNo,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_First(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantAndProductionPlant_First(applicantIdNo,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantAndProductionPlant_Last(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndProductionPlant_Last(applicantIdNo,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_Last(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantAndProductionPlant_Last(applicantIdNo,
			productionPlantCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByApplicantAndProductionPlant_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndProductionPlant_PrevAndNext(id,
			applicantIdNo, productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	*/
	public static void removeByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode) {
		getPersistence()
			.removeByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode) {
		return getPersistence()
				   .countByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode);
	}

	/**
	* Returns all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore) {
		return getPersistence().findByDossierNo_MtCore(dossierNo, mtCore);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end) {
		return getPersistence()
				   .findByDossierNo_MtCore(dossierNo, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByDossierNo_MtCore(dossierNo, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierNo_MtCore(dossierNo, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDossierNo_MtCore_First(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDossierNo_MtCore_First(dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDossierNo_MtCore_First(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_MtCore_First(dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDossierNo_MtCore_Last(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDossierNo_MtCore_Last(dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDossierNo_MtCore_Last(
		java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_MtCore_Last(dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByDossierNo_MtCore_PrevAndNext(
		long id, java.lang.String dossierNo, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDossierNo_MtCore_PrevAndNext(id, dossierNo, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	*/
	public static void removeByDossierNo_MtCore(java.lang.String dossierNo,
		long mtCore) {
		getPersistence().removeByDossierNo_MtCore(dossierNo, mtCore);
	}

	/**
	* Returns the number of vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByDossierNo_MtCore(java.lang.String dossierNo,
		long mtCore) {
		return getPersistence().countByDossierNo_MtCore(dossierNo, mtCore);
	}

	/**
	* Returns all the vr vehicle type certificates where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode) {
		return getPersistence().findByDeliverableCode(deliverableCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDeliverableCode_PrevAndNext(id, deliverableCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public static void removeByDeliverableCode(java.lang.String deliverableCode) {
		getPersistence().removeByDeliverableCode(deliverableCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByDeliverableCode(java.lang.String deliverableCode) {
		return getPersistence().countByDeliverableCode(deliverableCode);
	}

	/**
	* Returns all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode) {
		return getPersistence()
				   .findByManufacturerForeignCode(manufacturerForeignCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end) {
		return getPersistence()
				   .findByManufacturerForeignCode(manufacturerForeignCode,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByManufacturerForeignCode(manufacturerForeignCode,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByManufacturerForeignCode(manufacturerForeignCode,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByManufacturerForeignCode_First(
		java.lang.String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByManufacturerForeignCode_First(manufacturerForeignCode,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByManufacturerForeignCode_First(
		java.lang.String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByManufacturerForeignCode_First(manufacturerForeignCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByManufacturerForeignCode_Last(
		java.lang.String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByManufacturerForeignCode_Last(manufacturerForeignCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByManufacturerForeignCode_Last(
		java.lang.String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByManufacturerForeignCode_Last(manufacturerForeignCode,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByManufacturerForeignCode_PrevAndNext(
		long id, java.lang.String manufacturerForeignCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByManufacturerForeignCode_PrevAndNext(id,
			manufacturerForeignCode, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where manufacturerForeignCode = &#63; from the database.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	*/
	public static void removeByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode) {
		getPersistence().removeByManufacturerForeignCode(manufacturerForeignCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode) {
		return getPersistence()
				   .countByManufacturerForeignCode(manufacturerForeignCode);
	}

	/**
	* Returns all the vr vehicle type certificates where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo) {
		return getPersistence().findByCopReportNo(copReportNo);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end) {
		return getPersistence().findByCopReportNo(copReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByCopReportNo(copReportNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCopReportNo(copReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCopReportNo_First(
		java.lang.String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCopReportNo_First(copReportNo, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCopReportNo_First(
		java.lang.String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCopReportNo_First(copReportNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCopReportNo_Last(
		java.lang.String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCopReportNo_Last(copReportNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCopReportNo_Last(
		java.lang.String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCopReportNo_Last(copReportNo, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByCopReportNo_PrevAndNext(
		long id, java.lang.String copReportNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCopReportNo_PrevAndNext(id, copReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where copReportNo = &#63; from the database.
	*
	* @param copReportNo the cop report no
	*/
	public static void removeByCopReportNo(java.lang.String copReportNo) {
		getPersistence().removeByCopReportNo(copReportNo);
	}

	/**
	* Returns the number of vr vehicle type certificates where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByCopReportNo(java.lang.String copReportNo) {
		return getPersistence().countByCopReportNo(copReportNo);
	}

	/**
	* Returns all the vr vehicle type certificates where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode) {
		return getPersistence().findByDesignerCode(designerCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where designerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designerCode the designer code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end) {
		return getPersistence().findByDesignerCode(designerCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where designerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designerCode the designer code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByDesignerCode(designerCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where designerCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designerCode the designer code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDesignerCode(designerCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDesignerCode_First(
		java.lang.String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignerCode_First(designerCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDesignerCode_First(
		java.lang.String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDesignerCode_First(designerCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDesignerCode_Last(
		java.lang.String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignerCode_Last(designerCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDesignerCode_Last(
		java.lang.String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDesignerCode_Last(designerCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByDesignerCode_PrevAndNext(
		long id, java.lang.String designerCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignerCode_PrevAndNext(id, designerCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where designerCode = &#63; from the database.
	*
	* @param designerCode the designer code
	*/
	public static void removeByDesignerCode(java.lang.String designerCode) {
		getPersistence().removeByDesignerCode(designerCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByDesignerCode(java.lang.String designerCode) {
		return getPersistence().countByDesignerCode(designerCode);
	}

	/**
	* Returns all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo) {
		return getPersistence()
				   .findByVerificationCertificateNo(verificationCertificateNo);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param verificationCertificateNo the verification certificate no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end) {
		return getPersistence()
				   .findByVerificationCertificateNo(verificationCertificateNo,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param verificationCertificateNo the verification certificate no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByVerificationCertificateNo(verificationCertificateNo,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param verificationCertificateNo the verification certificate no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVerificationCertificateNo(verificationCertificateNo,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByVerificationCertificateNo_First(
		java.lang.String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVerificationCertificateNo_First(verificationCertificateNo,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByVerificationCertificateNo_First(
		java.lang.String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByVerificationCertificateNo_First(verificationCertificateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByVerificationCertificateNo_Last(
		java.lang.String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVerificationCertificateNo_Last(verificationCertificateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByVerificationCertificateNo_Last(
		java.lang.String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByVerificationCertificateNo_Last(verificationCertificateNo,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByVerificationCertificateNo_PrevAndNext(
		long id, java.lang.String verificationCertificateNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVerificationCertificateNo_PrevAndNext(id,
			verificationCertificateNo, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where verificationCertificateNo = &#63; from the database.
	*
	* @param verificationCertificateNo the verification certificate no
	*/
	public static void removeByVerificationCertificateNo(
		java.lang.String verificationCertificateNo) {
		getPersistence()
			.removeByVerificationCertificateNo(verificationCertificateNo);
	}

	/**
	* Returns the number of vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByVerificationCertificateNo(
		java.lang.String verificationCertificateNo) {
		return getPersistence()
				   .countByVerificationCertificateNo(verificationCertificateNo);
	}

	/**
	* Returns all the vr vehicle type certificates where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol) {
		return getPersistence().findByDesignsymbol(designSymbol);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where designSymbol = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designSymbol the design symbol
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end) {
		return getPersistence().findByDesignsymbol(designSymbol, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where designSymbol = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designSymbol the design symbol
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByDesignsymbol(designSymbol, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where designSymbol = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param designSymbol the design symbol
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDesignsymbol(designSymbol, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDesignsymbol_First(
		java.lang.String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignsymbol_First(designSymbol, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDesignsymbol_First(
		java.lang.String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDesignsymbol_First(designSymbol, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDesignsymbol_Last(
		java.lang.String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignsymbol_Last(designSymbol, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDesignsymbol_Last(
		java.lang.String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByDesignsymbol_Last(designSymbol, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByDesignsymbol_PrevAndNext(
		long id, java.lang.String designSymbol,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByDesignsymbol_PrevAndNext(id, designSymbol,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where designSymbol = &#63; from the database.
	*
	* @param designSymbol the design symbol
	*/
	public static void removeByDesignsymbol(java.lang.String designSymbol) {
		getPersistence().removeByDesignsymbol(designSymbol);
	}

	/**
	* Returns the number of vr vehicle type certificates where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByDesignsymbol(java.lang.String designSymbol) {
		return getPersistence().countByDesignsymbol(designSymbol);
	}

	/**
	* Returns all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode) {
		return getPersistence()
				   .findByCertificaterecordno(certificateRecordNo, serviceCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end) {
		return getPersistence()
				   .findByCertificaterecordno(certificateRecordNo, serviceCode,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByCertificaterecordno(certificateRecordNo, serviceCode,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCertificaterecordno(certificateRecordNo, serviceCode,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCertificaterecordno_First(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCertificaterecordno_First(certificateRecordNo,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCertificaterecordno_First(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCertificaterecordno_First(certificateRecordNo,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCertificaterecordno_Last(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCertificaterecordno_Last(certificateRecordNo,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCertificaterecordno_Last(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCertificaterecordno_Last(certificateRecordNo,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByCertificaterecordno_PrevAndNext(
		long id, java.lang.String certificateRecordNo,
		java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCertificaterecordno_PrevAndNext(id,
			certificateRecordNo, serviceCode, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63; from the database.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	*/
	public static void removeByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode) {
		getPersistence()
			.removeByCertificaterecordno(certificateRecordNo, serviceCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode) {
		return getPersistence()
				   .countByCertificaterecordno(certificateRecordNo, serviceCode);
	}

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus) {
		return getPersistence().findByExpiredstatus(expiredStatus);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end) {
		return getPersistence().findByExpiredstatus(expiredStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByExpiredstatus(expiredStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByExpiredstatus(expiredStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByExpiredstatus_First(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatus_First(expiredStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByExpiredstatus_First(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByExpiredstatus_First(expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByExpiredstatus_Last(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatus_Last(expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByExpiredstatus_Last(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByExpiredstatus_Last(expiredStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByExpiredstatus_PrevAndNext(
		long id, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatus_PrevAndNext(id, expiredStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	*
	* @param expiredStatus the expired status
	*/
	public static void removeByExpiredstatus(java.lang.String expiredStatus) {
		getPersistence().removeByExpiredstatus(expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByExpiredstatus(java.lang.String expiredStatus) {
		return getPersistence().countByExpiredstatus(expiredStatus);
	}

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode(expiredStatus, serviceCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end) {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode(expiredStatus,
			serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode(expiredStatus,
			serviceCode, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode(expiredStatus,
			serviceCode, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_First(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode_First(expiredStatus,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_First(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByExpiredstatusAndServiceCode_First(expiredStatus,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_Last(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode_Last(expiredStatus,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_Last(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByExpiredstatusAndServiceCode_Last(expiredStatus,
			serviceCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByExpiredstatusAndServiceCode_PrevAndNext(
		long id, java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByExpiredstatusAndServiceCode_PrevAndNext(id,
			expiredStatus, serviceCode, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63; from the database.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	*/
	public static void removeByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		getPersistence()
			.removeByExpiredstatusAndServiceCode(expiredStatus, serviceCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		return getPersistence()
				   .countByExpiredstatusAndServiceCode(expiredStatus,
			serviceCode);
	}

	/**
	* Returns all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode) {
		return getPersistence()
				   .findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end) {
		return getPersistence()
				   .findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByVehicletypeAndServiceCode_First(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVehicletypeAndServiceCode_First(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_First(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByVehicletypeAndServiceCode_First(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByVehicletypeAndServiceCode_Last(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVehicletypeAndServiceCode_Last(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_Last(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByVehicletypeAndServiceCode_Last(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByVehicletypeAndServiceCode_PrevAndNext(
		long id, java.lang.String vehicleClass,
		java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByVehicletypeAndServiceCode_PrevAndNext(id,
			vehicleClass, certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	*/
	public static void removeByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode) {
		getPersistence()
			.removeByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where vehicleClass = &#63; and certifiedVehicleType = &#63; and certifiedTrademarkName = &#63; and certifiedCommercialName = &#63; and certifiedModelCode = &#63; and serviceCode = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param certifiedVehicleType the certified vehicle type
	* @param certifiedTrademarkName the certified trademark name
	* @param certifiedCommercialName the certified commercial name
	* @param certifiedModelCode the certified model code
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode) {
		return getPersistence()
				   .countByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode);
	}

	/**
	* Returns all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard) {
		return getPersistence().findByCommonsafetystandard(commonSafetyStandard);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param commonSafetyStandard the common safety standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end) {
		return getPersistence()
				   .findByCommonsafetystandard(commonSafetyStandard, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param commonSafetyStandard the common safety standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByCommonsafetystandard(commonSafetyStandard, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param commonSafetyStandard the common safety standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCommonsafetystandard(commonSafetyStandard, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCommonsafetystandard_First(
		java.lang.String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCommonsafetystandard_First(commonSafetyStandard,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCommonsafetystandard_First(
		java.lang.String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCommonsafetystandard_First(commonSafetyStandard,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByCommonsafetystandard_Last(
		java.lang.String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCommonsafetystandard_Last(commonSafetyStandard,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByCommonsafetystandard_Last(
		java.lang.String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByCommonsafetystandard_Last(commonSafetyStandard,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByCommonsafetystandard_PrevAndNext(
		long id, java.lang.String commonSafetyStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByCommonsafetystandard_PrevAndNext(id,
			commonSafetyStandard, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where commonSafetyStandard = &#63; from the database.
	*
	* @param commonSafetyStandard the common safety standard
	*/
	public static void removeByCommonsafetystandard(
		java.lang.String commonSafetyStandard) {
		getPersistence().removeByCommonsafetystandard(commonSafetyStandard);
	}

	/**
	* Returns the number of vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByCommonsafetystandard(
		java.lang.String commonSafetyStandard) {
		return getPersistence().countByCommonsafetystandard(commonSafetyStandard);
	}

	/**
	* Returns all the vr vehicle type certificates where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard) {
		return getPersistence().findByEmissionstandard(emissionStandard);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where emissionStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionStandard the emission standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end) {
		return getPersistence()
				   .findByEmissionstandard(emissionStandard, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where emissionStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionStandard the emission standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByEmissionstandard(emissionStandard, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where emissionStandard = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionStandard the emission standard
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEmissionstandard(emissionStandard, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByEmissionstandard_First(
		java.lang.String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByEmissionstandard_First(emissionStandard,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByEmissionstandard_First(
		java.lang.String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByEmissionstandard_First(emissionStandard,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByEmissionstandard_Last(
		java.lang.String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByEmissionstandard_Last(emissionStandard,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByEmissionstandard_Last(
		java.lang.String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByEmissionstandard_Last(emissionStandard,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByEmissionstandard_PrevAndNext(
		long id, java.lang.String emissionStandard,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByEmissionstandard_PrevAndNext(id, emissionStandard,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where emissionStandard = &#63; from the database.
	*
	* @param emissionStandard the emission standard
	*/
	public static void removeByEmissionstandard(
		java.lang.String emissionStandard) {
		getPersistence().removeByEmissionstandard(emissionStandard);
	}

	/**
	* Returns the number of vr vehicle type certificates where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByEmissionstandard(java.lang.String emissionStandard) {
		return getPersistence().countByEmissionstandard(emissionStandard);
	}

	/**
	* Returns all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo) {
		return getPersistence().findByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordNo the inspection record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end) {
		return getPersistence()
				   .findByInspectionRecordNo(inspectionRecordNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordNo the inspection record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByInspectionRecordNo(inspectionRecordNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordNo the inspection record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectionRecordNo(inspectionRecordNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectionRecordNo_First(
		java.lang.String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectionRecordNo_First(inspectionRecordNo,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectionRecordNo_First(
		java.lang.String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectionRecordNo_First(inspectionRecordNo,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByInspectionRecordNo_Last(
		java.lang.String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectionRecordNo_Last(inspectionRecordNo,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByInspectionRecordNo_Last(
		java.lang.String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByInspectionRecordNo_Last(inspectionRecordNo,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByInspectionRecordNo_PrevAndNext(
		long id, java.lang.String inspectionRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByInspectionRecordNo_PrevAndNext(id,
			inspectionRecordNo, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where inspectionRecordNo = &#63; from the database.
	*
	* @param inspectionRecordNo the inspection record no
	*/
	public static void removeByInspectionRecordNo(
		java.lang.String inspectionRecordNo) {
		getPersistence().removeByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the number of vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByInspectionRecordNo(
		java.lang.String inspectionRecordNo) {
		return getPersistence().countByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore) {
		return getPersistence()
				   .findByApplicantAndService(serviceCode, applicantIdNo, mtCore);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end) {
		return getPersistence()
				   .findByApplicantAndService(serviceCode, applicantIdNo,
			mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByApplicantAndService(serviceCode, applicantIdNo,
			mtCore, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantAndService(serviceCode, applicantIdNo,
			mtCore, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantAndService_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndService_First(serviceCode, applicantIdNo,
			mtCore, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantAndService_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantAndService_First(serviceCode,
			applicantIdNo, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByApplicantAndService_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndService_Last(serviceCode, applicantIdNo,
			mtCore, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByApplicantAndService_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantAndService_Last(serviceCode, applicantIdNo,
			mtCore, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByApplicantAndService_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByApplicantAndService_PrevAndNext(id, serviceCode,
			applicantIdNo, mtCore, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	*/
	public static void removeByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore) {
		getPersistence()
			.removeByApplicantAndService(serviceCode, applicantIdNo, mtCore);
	}

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByApplicantAndService(java.lang.String serviceCode,
		java.lang.String applicantIdNo, long mtCore) {
		return getPersistence()
				   .countByApplicantAndService(serviceCode, applicantIdNo,
			mtCore);
	}

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByDossierId(long dossierId,
		long mtCore)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().findByDossierId(dossierId, mtCore);
	}

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDossierId(long dossierId,
		long mtCore) {
		return getPersistence().fetchByDossierId(dossierId, mtCore);
	}

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByDossierId(long dossierId,
		long mtCore, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDossierId(dossierId, mtCore, retrieveFromCache);
	}

	/**
	* Removes the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the vr vehicle type certificate that was removed
	*/
	public static VRVehicleTypeCertificate removeByDossierId(long dossierId,
		long mtCore)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().removeByDossierId(dossierId, mtCore);
	}

	/**
	* Returns the number of vr vehicle type certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByDossierId(long dossierId, long mtCore) {
		return getPersistence().countByDossierId(dossierId, mtCore);
	}

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode_First(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeAndProductionPlantCode_First(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode_Last(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeAndProductionPlantCode_Last(serviceCode,
			applicantIdNo, productionPlantCode, mtCore, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlantCode_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlantCode_PrevAndNext(id,
			serviceCode, applicantIdNo, productionPlantCode, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	*/
	public static void removeByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore) {
		getPersistence()
			.removeByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore);
	}

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore) {
		return getPersistence()
				   .countByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore);
	}

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant_First(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeAndProductionPlant_First(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant_Last(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeAndProductionPlant_Last(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlant_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeAndProductionPlant_PrevAndNext(id,
			serviceCode, applicantIdNo, productionPlantName,
			productionPlantAddress, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public static void removeByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		getPersistence()
			.removeByServiceCodeAndProductionPlant(serviceCode, applicantIdNo,
			productionPlantName, productionPlantAddress);
	}

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getPersistence()
				   .countByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress);
	}

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus) {
		return getPersistence().findByF_EXP_STATUS(expiredStatus);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end) {
		return getPersistence().findByF_EXP_STATUS(expiredStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_EXP_STATUS(expiredStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_EXP_STATUS(expiredStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_EXP_STATUS_First(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_EXP_STATUS_First(expiredStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_EXP_STATUS_First(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_EXP_STATUS_First(expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_EXP_STATUS_Last(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_EXP_STATUS_Last(expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_EXP_STATUS_Last(
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_EXP_STATUS_Last(expiredStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByF_EXP_STATUS_PrevAndNext(
		long id, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_EXP_STATUS_PrevAndNext(id, expiredStatus,
			orderByComparator);
	}

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatuses the expired statuses
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses) {
		return getPersistence().findByF_EXP_STATUS(expiredStatuses);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatuses the expired statuses
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end) {
		return getPersistence().findByF_EXP_STATUS(expiredStatuses, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatuses the expired statuses
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_EXP_STATUS(expiredStatuses, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where expiredStatus = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_EXP_STATUS(expiredStatuses, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	*
	* @param expiredStatus the expired status
	*/
	public static void removeByF_EXP_STATUS(java.lang.String expiredStatus) {
		getPersistence().removeByF_EXP_STATUS(expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_EXP_STATUS(java.lang.String expiredStatus) {
		return getPersistence().countByF_EXP_STATUS(expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = any &#63;.
	*
	* @param expiredStatuses the expired statuses
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_EXP_STATUS(java.lang.String[] expiredStatuses) {
		return getPersistence().countByF_EXP_STATUS(expiredStatuses);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_First(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS_First(applicantIdNo,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_First(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APPNO_EXP_STATUS_First(applicantIdNo,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_Last(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS_Last(applicantIdNo, expiredStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_Last(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APPNO_EXP_STATUS_Last(applicantIdNo,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByF_APPNO_EXP_STATUS_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS_PrevAndNext(id, applicantIdNo,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatuses the expired statuses
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatuses the expired statuses
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatuses the expired statuses
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	*/
	public static void removeByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus) {
		getPersistence().removeByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus) {
		return getPersistence()
				   .countByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatuses the expired statuses
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses) {
		return getPersistence()
				   .countByF_APPNO_EXP_STATUS(applicantIdNo, expiredStatuses);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus) {
		return getPersistence()
				   .findByF_APP_VH_EXP(applicantIdNo, vehicleClass,
			expiredStatus);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end) {
		return getPersistence()
				   .findByF_APP_VH_EXP(applicantIdNo, vehicleClass,
			expiredStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_APP_VH_EXP(applicantIdNo, vehicleClass,
			expiredStatus, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_APP_VH_EXP(applicantIdNo, vehicleClass,
			expiredStatus, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APP_VH_EXP_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_First(applicantIdNo, vehicleClass,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APP_VH_EXP_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_VH_EXP_First(applicantIdNo, vehicleClass,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APP_VH_EXP_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_Last(applicantIdNo, vehicleClass,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APP_VH_EXP_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_VH_EXP_Last(applicantIdNo, vehicleClass,
			expiredStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByF_APP_VH_EXP_PrevAndNext(
		long id, java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_PrevAndNext(id, applicantIdNo,
			vehicleClass, expiredStatus, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	*/
	public static void removeByF_APP_VH_EXP(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus) {
		getPersistence()
			.removeByF_APP_VH_EXP(applicantIdNo, vehicleClass, expiredStatus);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_APP_VH_EXP(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus) {
		return getPersistence()
				   .countByF_APP_VH_EXP(applicantIdNo, vehicleClass,
			expiredStatus);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo) {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end) {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO_First(applicantIdNo,
			vehicleClass, expiredStatus, certificateRecordNo, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_VH_EXP_CERTNO_First(applicantIdNo,
			vehicleClass, expiredStatus, certificateRecordNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO_Last(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_APP_VH_EXP_CERTNO_Last(applicantIdNo,
			vehicleClass, expiredStatus, certificateRecordNo, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByF_APP_VH_EXP_CERTNO_PrevAndNext(
		long id, java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByF_APP_VH_EXP_CERTNO_PrevAndNext(id, applicantIdNo,
			vehicleClass, expiredStatus, certificateRecordNo, orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	*/
	public static void removeByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo) {
		getPersistence()
			.removeByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo) {
		return getPersistence()
				   .countByF_APP_VH_EXP_CERTNO(applicantIdNo, vehicleClass,
			expiredStatus, certificateRecordNo);
	}

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode);
	}

	/**
	* Returns a range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end) {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo_First(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, orderByComparator);
	}

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeVehicleClassAndApplicantIdNo_First(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo_Last(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, orderByComparator);
	}

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public static VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByServiceCodeVehicleClassAndApplicantIdNo_Last(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode, orderByComparator);
	}

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate[] findByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(
		long id, java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence()
				   .findByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(id,
			applicantIdNo, vehicleClass, expiredStatus, serviceCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	*/
	public static void removeByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		getPersistence()
			.removeByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode);
	}

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public static int countByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		return getPersistence()
				   .countByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode);
	}

	/**
	* Caches the vr vehicle type certificate in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	*/
	public static void cacheResult(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		getPersistence().cacheResult(vrVehicleTypeCertificate);
	}

	/**
	* Caches the vr vehicle type certificates in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificates the vr vehicle type certificates
	*/
	public static void cacheResult(
		List<VRVehicleTypeCertificate> vrVehicleTypeCertificates) {
		getPersistence().cacheResult(vrVehicleTypeCertificates);
	}

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public static VRVehicleTypeCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().remove(id);
	}

	public static VRVehicleTypeCertificate updateImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return getPersistence().updateImpl(vrVehicleTypeCertificate);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	*/
	public static VRVehicleTypeCertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRVehicleTypeCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr vehicle type certificates.
	*
	* @return the vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle type certificates
	*/
	public static List<VRVehicleTypeCertificate> findAll(int start, int end,
		OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle type certificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRVehicleTypeCertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleTypeCertificatePersistence, VRVehicleTypeCertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleTypeCertificatePersistence.class);
}