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

import com.fds.vr.business.model.VRVehicleEquipment;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr vehicle equipment service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRVehicleEquipmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleEquipmentPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleEquipmentPersistenceImpl
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentUtil {
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
	public static void clearCache(VRVehicleEquipment vrVehicleEquipment) {
		getPersistence().clearCache(vrVehicleEquipment);
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
	public static List<VRVehicleEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRVehicleEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRVehicleEquipment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRVehicleEquipment update(
		VRVehicleEquipment vrVehicleEquipment) {
		return getPersistence().update(vrVehicleEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRVehicleEquipment update(
		VRVehicleEquipment vrVehicleEquipment, ServiceContext serviceContext) {
		return getPersistence().update(vrVehicleEquipment, serviceContext);
	}

	/**
	* Returns all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns a range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @return the range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId_First(vehicleTypeCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByF_vehicleTypeCertificateId_First(vehicleTypeCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId_Last(vehicleTypeCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByF_vehicleTypeCertificateId_Last(vehicleTypeCertificateId,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment[] findByF_vehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId_PrevAndNext(id,
			vehicleTypeCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle equipments where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	*/
	public static void removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		getPersistence()
			.removeByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the number of vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr vehicle equipments
	*/
	public static int countByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return getPersistence()
				   .countByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns all the vr vehicle equipments where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId) {
		return getPersistence().findByF_certificateRecordId(certificateRecordId);
	}

	/**
	* Returns a range of all the vr vehicle equipments where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @return the range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end) {
		return getPersistence()
				   .findByF_certificateRecordId(certificateRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .findByF_certificateRecordId(certificateRecordId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_certificateRecordId(certificateRecordId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findByF_certificateRecordId_First(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_certificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchByF_certificateRecordId_First(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByF_certificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findByF_certificateRecordId_Last(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_certificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchByF_certificateRecordId_Last(
		long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchByF_certificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment[] findByF_certificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findByF_certificateRecordId_PrevAndNext(id,
			certificateRecordId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle equipments where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	*/
	public static void removeByF_certificateRecordId(long certificateRecordId) {
		getPersistence().removeByF_certificateRecordId(certificateRecordId);
	}

	/**
	* Returns the number of vr vehicle equipments where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching vr vehicle equipments
	*/
	public static int countByF_certificateRecordId(long certificateRecordId) {
		return getPersistence().countByF_certificateRecordId(certificateRecordId);
	}

	/**
	* Returns all the vr vehicle equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findBydossierId(long dossierId) {
		return getPersistence().findBydossierId(dossierId);
	}

	/**
	* Returns a range of all the vr vehicle equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @return the range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end) {
		return getPersistence().findBydossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment findBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public static VRVehicleEquipment fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment[] findBydossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle equipments where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long dossierId) {
		getPersistence().removeBydossierId(dossierId);
	}

	/**
	* Returns the number of vr vehicle equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle equipments
	*/
	public static int countBydossierId(long dossierId) {
		return getPersistence().countBydossierId(dossierId);
	}

	/**
	* Caches the vr vehicle equipment in the entity cache if it is enabled.
	*
	* @param vrVehicleEquipment the vr vehicle equipment
	*/
	public static void cacheResult(VRVehicleEquipment vrVehicleEquipment) {
		getPersistence().cacheResult(vrVehicleEquipment);
	}

	/**
	* Caches the vr vehicle equipments in the entity cache if it is enabled.
	*
	* @param vrVehicleEquipments the vr vehicle equipments
	*/
	public static void cacheResult(List<VRVehicleEquipment> vrVehicleEquipments) {
		getPersistence().cacheResult(vrVehicleEquipments);
	}

	/**
	* Creates a new vr vehicle equipment with the primary key. Does not add the vr vehicle equipment to the database.
	*
	* @param id the primary key for the new vr vehicle equipment
	* @return the new vr vehicle equipment
	*/
	public static VRVehicleEquipment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr vehicle equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment that was removed
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence().remove(id);
	}

	public static VRVehicleEquipment updateImpl(
		VRVehicleEquipment vrVehicleEquipment) {
		return getPersistence().updateImpl(vrVehicleEquipment);
	}

	/**
	* Returns the vr vehicle equipment with the primary key or throws a {@link NoSuchVRVehicleEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr vehicle equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment, or <code>null</code> if a vr vehicle equipment with the primary key could not be found
	*/
	public static VRVehicleEquipment fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRVehicleEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr vehicle equipments.
	*
	* @return the vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr vehicle equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @return the range of vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findAll(int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle equipments
	*/
	public static List<VRVehicleEquipment> findAll(int start, int end,
		OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle equipments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr vehicle equipments.
	*
	* @return the number of vr vehicle equipments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRVehicleEquipmentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleEquipmentPersistence, VRVehicleEquipmentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleEquipmentPersistence.class);
}