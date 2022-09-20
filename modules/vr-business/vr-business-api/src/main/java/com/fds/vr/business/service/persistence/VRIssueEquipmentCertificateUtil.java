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

import com.fds.vr.business.model.VRIssueEquipmentCertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr issue equipment certificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRIssueEquipmentCertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRIssueEquipmentCertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRIssueEquipmentCertificateUtil {
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
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		getPersistence().clearCache(vrIssueEquipmentCertificate);
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
	public static List<VRIssueEquipmentCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRIssueEquipmentCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRIssueEquipmentCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRIssueEquipmentCertificate update(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		return getPersistence().update(vrIssueEquipmentCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRIssueEquipmentCertificate update(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(vrIssueEquipmentCertificate, serviceContext);
	}

	/**
	* Returns all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId) {
		return getPersistence()
				   .findByIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end) {
		return getPersistence()
				   .findByIssueVehicleCertificateId(issueVehicleCertificateId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findByIssueVehicleCertificateId(issueVehicleCertificateId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIssueVehicleCertificateId(issueVehicleCertificateId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByIssueVehicleCertificateId_First(issueVehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByIssueVehicleCertificateId_First(issueVehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByIssueVehicleCertificateId_Last(issueVehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByIssueVehicleCertificateId_Last(issueVehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findByIssueVehicleCertificateId_PrevAndNext(
		long id, long issueVehicleCertificateId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByIssueVehicleCertificateId_PrevAndNext(id,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where issueVehicleCertificateId = &#63; from the database.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public static void removeByIssueVehicleCertificateId(
		long issueVehicleCertificateId) {
		getPersistence()
			.removeByIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Returns the number of vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countByIssueVehicleCertificateId(
		long issueVehicleCertificateId) {
		return getPersistence()
				   .countByIssueVehicleCertificateId(issueVehicleCertificateId);
	}

	/**
	* Returns all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo) {
		return getPersistence()
				   .findByvehicleCertificateRecordNo(vehicleCertificateRecordNo);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end) {
		return getPersistence()
				   .findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByvehicleCertificateRecordNo(vehicleCertificateRecordNo,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_First(
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByvehicleCertificateRecordNo_First(vehicleCertificateRecordNo,
			orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_First(
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleCertificateRecordNo_First(vehicleCertificateRecordNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_Last(
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByvehicleCertificateRecordNo_Last(vehicleCertificateRecordNo,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_Last(
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleCertificateRecordNo_Last(vehicleCertificateRecordNo,
			orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findByvehicleCertificateRecordNo_PrevAndNext(
		long id, java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByvehicleCertificateRecordNo_PrevAndNext(id,
			vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63; from the database.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	*/
	public static void removeByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo) {
		getPersistence()
			.removeByvehicleCertificateRecordNo(vehicleCertificateRecordNo);
	}

	/**
	* Returns the number of vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo) {
		return getPersistence()
				   .countByvehicleCertificateRecordNo(vehicleCertificateRecordNo);
	}

	/**
	* Returns all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo) {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end) {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_First(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo_First(applicantNo,
			vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_First(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_CertificateRecordNo_First(applicantNo,
			vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_Last(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo_Last(applicantNo,
			vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_Last(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_CertificateRecordNo_Last(applicantNo,
			vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findByApplicantNo_CertificateRecordNo_PrevAndNext(
		long id, java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_CertificateRecordNo_PrevAndNext(id,
			applicantNo, vehicleCertificateRecordNo, orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	*/
	public static void removeByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo) {
		getPersistence()
			.removeByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo);
	}

	/**
	* Returns the number of vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo) {
		return getPersistence()
				   .countByApplicantNo_CertificateRecordNo(applicantNo,
			vehicleCertificateRecordNo);
	}

	/**
	* Returns all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo) {
		return getPersistence().findByApplicantNo(applicantNo);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end) {
		return getPersistence().findByApplicantNo(applicantNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findByApplicantNo(applicantNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantNo(applicantNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByApplicantNo_First(
		java.lang.String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_First(applicantNo, orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByApplicantNo_First(
		java.lang.String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_First(applicantNo, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByApplicantNo_Last(
		java.lang.String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_Last(applicantNo, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByApplicantNo_Last(
		java.lang.String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_Last(applicantNo, orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findByApplicantNo_PrevAndNext(
		long id, java.lang.String applicantNo,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByApplicantNo_PrevAndNext(id, applicantNo,
			orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where applicantNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	*/
	public static void removeByApplicantNo(java.lang.String applicantNo) {
		getPersistence().removeByApplicantNo(applicantNo);
	}

	/**
	* Returns the number of vr issue equipment certificates where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countByApplicantNo(java.lang.String applicantNo) {
		return getPersistence().countByApplicantNo(applicantNo);
	}

	/**
	* Returns all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore) {
		return getPersistence().findBydossierID_MtCore(dossierId, mtCore);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end) {
		return getPersistence()
				   .findBydossierID_MtCore(dossierId, mtCore, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findBydossierID_MtCore(dossierId, mtCore, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierID_MtCore(dossierId, mtCore, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findBydossierID_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findBydossierID_MtCore_First(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchBydossierID_MtCore_First(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchBydossierID_MtCore_First(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findBydossierID_MtCore_Last(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .fetchBydossierID_MtCore_Last(dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findBydossierID_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findBydossierID_MtCore_PrevAndNext(id, dossierId, mtCore,
			orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public static void removeBydossierID_MtCore(long dossierId, long mtCore) {
		getPersistence().removeBydossierID_MtCore(dossierId, mtCore);
	}

	/**
	* Returns the number of vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countBydossierID_MtCore(long dossierId, long mtCore) {
		return getPersistence().countBydossierID_MtCore(dossierId, mtCore);
	}

	/**
	* Returns all the vr issue equipment certificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByissueId(long issueId) {
		return getPersistence().findByissueId(issueId);
	}

	/**
	* Returns a range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end) {
		return getPersistence().findByissueId(issueId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByissueId_First(
		long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence().findByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByissueId_First(
		long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence().fetchByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate findByissueId_Last(long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence().findByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByissueId_Last(
		long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence().fetchByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate[] findByissueId_PrevAndNext(
		long id, long issueId,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence()
				   .findByissueId_PrevAndNext(id, issueId, orderByComparator);
	}

	/**
	* Removes all the vr issue equipment certificates where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public static void removeByissueId(long issueId) {
		getPersistence().removeByissueId(issueId);
	}

	/**
	* Returns the number of vr issue equipment certificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue equipment certificates
	*/
	public static int countByissueId(long issueId) {
		return getPersistence().countByissueId(issueId);
	}

	/**
	* Caches the vr issue equipment certificate in the entity cache if it is enabled.
	*
	* @param vrIssueEquipmentCertificate the vr issue equipment certificate
	*/
	public static void cacheResult(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		getPersistence().cacheResult(vrIssueEquipmentCertificate);
	}

	/**
	* Caches the vr issue equipment certificates in the entity cache if it is enabled.
	*
	* @param vrIssueEquipmentCertificates the vr issue equipment certificates
	*/
	public static void cacheResult(
		List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates) {
		getPersistence().cacheResult(vrIssueEquipmentCertificates);
	}

	/**
	* Creates a new vr issue equipment certificate with the primary key. Does not add the vr issue equipment certificate to the database.
	*
	* @param id the primary key for the new vr issue equipment certificate
	* @return the new vr issue equipment certificate
	*/
	public static VRIssueEquipmentCertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr issue equipment certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate that was removed
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence().remove(id);
	}

	public static VRIssueEquipmentCertificate updateImpl(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		return getPersistence().updateImpl(vrIssueEquipmentCertificate);
	}

	/**
	* Returns the vr issue equipment certificate with the primary key or throws a {@link NoSuchVRIssueEquipmentCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr issue equipment certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate, or <code>null</code> if a vr issue equipment certificate with the primary key could not be found
	*/
	public static VRIssueEquipmentCertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRIssueEquipmentCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr issue equipment certificates.
	*
	* @return the vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findAll(int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue equipment certificates
	*/
	public static List<VRIssueEquipmentCertificate> findAll(int start, int end,
		OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr issue equipment certificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr issue equipment certificates.
	*
	* @return the number of vr issue equipment certificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRIssueEquipmentCertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRIssueEquipmentCertificatePersistence, VRIssueEquipmentCertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRIssueEquipmentCertificatePersistence.class);
}