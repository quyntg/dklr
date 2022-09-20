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

import com.fds.vr.business.model.VRExpireCertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr expire certificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRExpireCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRExpireCertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRExpireCertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRExpireCertificateUtil {
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
	public static void clearCache(VRExpireCertificate vrExpireCertificate) {
		getPersistence().clearCache(vrExpireCertificate);
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
	public static List<VRExpireCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRExpireCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRExpireCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRExpireCertificate update(
		VRExpireCertificate vrExpireCertificate) {
		return getPersistence().update(vrExpireCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRExpireCertificate update(
		VRExpireCertificate vrExpireCertificate, ServiceContext serviceContext) {
		return getPersistence().update(vrExpireCertificate, serviceContext);
	}

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence()
				   .findByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return getPersistence()
				   .fetchByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_vehicleTypeCertificateId(vehicleTypeCertificateId,
			retrieveFromCache);
	}

	/**
	* Removes the vr expire certificate where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the vr expire certificate that was removed
	*/
	public static VRExpireCertificate removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence()
				   .removeByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the number of vr expire certificates where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr expire certificates
	*/
	public static int countByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return getPersistence()
				   .countByF_vehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the vr expire certificate where dossierId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @return the matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate findBydossierId(long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence().findBydossierId(dossierId);
	}

	/**
	* Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchBydossierId(long dossierId) {
		return getPersistence().fetchBydossierId(dossierId);
	}

	/**
	* Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchBydossierId(long dossierId,
		boolean retrieveFromCache) {
		return getPersistence().fetchBydossierId(dossierId, retrieveFromCache);
	}

	/**
	* Removes the vr expire certificate where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @return the vr expire certificate that was removed
	*/
	public static VRExpireCertificate removeBydossierId(long dossierId)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence().removeBydossierId(dossierId);
	}

	/**
	* Returns the number of vr expire certificates where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr expire certificates
	*/
	public static int countBydossierId(long dossierId) {
		return getPersistence().countBydossierId(dossierId);
	}

	/**
	* Returns all the vr expire certificates where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @return the matching vr expire certificates
	*/
	public static List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus) {
		return getPersistence().findByF_dossierStatus(dossierStatus);
	}

	/**
	* Returns a range of all the vr expire certificates where dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @return the range of matching vr expire certificates
	*/
	public static List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end) {
		return getPersistence().findByF_dossierStatus(dossierStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr expire certificates where dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr expire certificates
	*/
	public static List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return getPersistence()
				   .findByF_dossierStatus(dossierStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr expire certificates where dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr expire certificates
	*/
	public static List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_dossierStatus(dossierStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate findByF_dossierStatus_First(
		java.lang.String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence()
				   .findByF_dossierStatus_First(dossierStatus, orderByComparator);
	}

	/**
	* Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchByF_dossierStatus_First(
		java.lang.String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierStatus_First(dossierStatus,
			orderByComparator);
	}

	/**
	* Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate findByF_dossierStatus_Last(
		java.lang.String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence()
				   .findByF_dossierStatus_Last(dossierStatus, orderByComparator);
	}

	/**
	* Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public static VRExpireCertificate fetchByF_dossierStatus_Last(
		java.lang.String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierStatus_Last(dossierStatus, orderByComparator);
	}

	/**
	* Returns the vr expire certificates before and after the current vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param id the primary key of the current vr expire certificate
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public static VRExpireCertificate[] findByF_dossierStatus_PrevAndNext(
		long id, java.lang.String dossierStatus,
		OrderByComparator<VRExpireCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence()
				   .findByF_dossierStatus_PrevAndNext(id, dossierStatus,
			orderByComparator);
	}

	/**
	* Removes all the vr expire certificates where dossierStatus = &#63; from the database.
	*
	* @param dossierStatus the dossier status
	*/
	public static void removeByF_dossierStatus(java.lang.String dossierStatus) {
		getPersistence().removeByF_dossierStatus(dossierStatus);
	}

	/**
	* Returns the number of vr expire certificates where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @return the number of matching vr expire certificates
	*/
	public static int countByF_dossierStatus(java.lang.String dossierStatus) {
		return getPersistence().countByF_dossierStatus(dossierStatus);
	}

	/**
	* Caches the vr expire certificate in the entity cache if it is enabled.
	*
	* @param vrExpireCertificate the vr expire certificate
	*/
	public static void cacheResult(VRExpireCertificate vrExpireCertificate) {
		getPersistence().cacheResult(vrExpireCertificate);
	}

	/**
	* Caches the vr expire certificates in the entity cache if it is enabled.
	*
	* @param vrExpireCertificates the vr expire certificates
	*/
	public static void cacheResult(
		List<VRExpireCertificate> vrExpireCertificates) {
		getPersistence().cacheResult(vrExpireCertificates);
	}

	/**
	* Creates a new vr expire certificate with the primary key. Does not add the vr expire certificate to the database.
	*
	* @param id the primary key for the new vr expire certificate
	* @return the new vr expire certificate
	*/
	public static VRExpireCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate that was removed
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public static VRExpireCertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence().remove(id);
	}

	public static VRExpireCertificate updateImpl(
		VRExpireCertificate vrExpireCertificate) {
		return getPersistence().updateImpl(vrExpireCertificate);
	}

	/**
	* Returns the vr expire certificate with the primary key or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public static VRExpireCertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRExpireCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr expire certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate, or <code>null</code> if a vr expire certificate with the primary key could not be found
	*/
	public static VRExpireCertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRExpireCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr expire certificates.
	*
	* @return the vr expire certificates
	*/
	public static List<VRExpireCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr expire certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @return the range of vr expire certificates
	*/
	public static List<VRExpireCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr expire certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr expire certificates
	*/
	public static List<VRExpireCertificate> findAll(int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr expire certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr expire certificates
	*/
	public static List<VRExpireCertificate> findAll(int start, int end,
		OrderByComparator<VRExpireCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr expire certificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr expire certificates.
	*
	* @return the number of vr expire certificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRExpireCertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRExpireCertificatePersistence, VRExpireCertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRExpireCertificatePersistence.class);
}