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

import com.fds.vr.business.model.VRVehicleSpecification;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr vehicle specification service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRVehicleSpecificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleSpecificationPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleSpecificationPersistenceImpl
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationUtil {
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
	public static void clearCache(VRVehicleSpecification vrVehicleSpecification) {
		getPersistence().clearCache(vrVehicleSpecification);
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
	public static List<VRVehicleSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRVehicleSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRVehicleSpecification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRVehicleSpecification update(
		VRVehicleSpecification vrVehicleSpecification) {
		return getPersistence().update(vrVehicleSpecification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRVehicleSpecification update(
		VRVehicleSpecification vrVehicleSpecification,
		ServiceContext serviceContext) {
		return getPersistence().update(vrVehicleSpecification, serviceContext);
	}

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findBySC_VCID(
		long vehicleCertificateId, java.lang.String specificationCode)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findBySC_VCID(vehicleCertificateId, specificationCode);
	}

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchBySC_VCID(
		long vehicleCertificateId, java.lang.String specificationCode) {
		return getPersistence()
				   .fetchBySC_VCID(vehicleCertificateId, specificationCode);
	}

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchBySC_VCID(
		long vehicleCertificateId, java.lang.String specificationCode,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBySC_VCID(vehicleCertificateId, specificationCode,
			retrieveFromCache);
	}

	/**
	* Removes the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the vr vehicle specification that was removed
	*/
	public static VRVehicleSpecification removeBySC_VCID(
		long vehicleCertificateId, java.lang.String specificationCode)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .removeBySC_VCID(vehicleCertificateId, specificationCode);
	}

	/**
	* Returns the number of vr vehicle specifications where vehicleCertificateId = &#63; and specificationCode = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the number of matching vr vehicle specifications
	*/
	public static int countBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode) {
		return getPersistence()
				   .countBySC_VCID(vehicleCertificateId, specificationCode);
	}

	/**
	* Returns all the vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId) {
		return getPersistence().findByVehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Returns a range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return getPersistence()
				   .findByVehicleCertificateId(vehicleCertificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .findByVehicleCertificateId(vehicleCertificateId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByVehicleCertificateId(vehicleCertificateId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findByVehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByVehicleCertificateId_First(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchByVehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchByVehicleCertificateId_First(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findByVehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByVehicleCertificateId_Last(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchByVehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchByVehicleCertificateId_Last(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification[] findByVehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByVehicleCertificateId_PrevAndNext(id,
			vehicleCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle specifications where vehicleCertificateId = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	*/
	public static void removeByVehicleCertificateId(long vehicleCertificateId) {
		getPersistence().removeByVehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Returns the number of vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the number of matching vr vehicle specifications
	*/
	public static int countByVehicleCertificateId(long vehicleCertificateId) {
		return getPersistence().countByVehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Returns all the vr vehicle specifications where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode) {
		return getPersistence().findByDeliverableCode(deliverableCode);
	}

	/**
	* Returns a range of all the vr vehicle specifications where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findByDeliverableCode_PrevAndNext(id, deliverableCode,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle specifications where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public static void removeByDeliverableCode(java.lang.String deliverableCode) {
		getPersistence().removeByDeliverableCode(deliverableCode);
	}

	/**
	* Returns the number of vr vehicle specifications where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr vehicle specifications
	*/
	public static int countByDeliverableCode(java.lang.String deliverableCode) {
		return getPersistence().countByDeliverableCode(deliverableCode);
	}

	/**
	* Returns all the vr vehicle specifications where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findBydossierId(long dossierId) {
		return getPersistence().findBydossierId(dossierId);
	}

	/**
	* Returns a range of all the vr vehicle specifications where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end) {
		return getPersistence().findBydossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findBydossierId_First(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchBydossierId_First(
		long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification findBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public static VRVehicleSpecification fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification[] findBydossierId_PrevAndNext(
		long id, long dossierId,
		OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle specifications where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long dossierId) {
		getPersistence().removeBydossierId(dossierId);
	}

	/**
	* Returns the number of vr vehicle specifications where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle specifications
	*/
	public static int countBydossierId(long dossierId) {
		return getPersistence().countBydossierId(dossierId);
	}

	/**
	* Caches the vr vehicle specification in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	*/
	public static void cacheResult(
		VRVehicleSpecification vrVehicleSpecification) {
		getPersistence().cacheResult(vrVehicleSpecification);
	}

	/**
	* Caches the vr vehicle specifications in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecifications the vr vehicle specifications
	*/
	public static void cacheResult(
		List<VRVehicleSpecification> vrVehicleSpecifications) {
		getPersistence().cacheResult(vrVehicleSpecifications);
	}

	/**
	* Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	*
	* @param id the primary key for the new vr vehicle specification
	* @return the new vr vehicle specification
	*/
	public static VRVehicleSpecification create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification that was removed
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence().remove(id);
	}

	public static VRVehicleSpecification updateImpl(
		VRVehicleSpecification vrVehicleSpecification) {
		return getPersistence().updateImpl(vrVehicleSpecification);
	}

	/**
	* Returns the vr vehicle specification with the primary key or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification, or <code>null</code> if a vr vehicle specification with the primary key could not be found
	*/
	public static VRVehicleSpecification fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRVehicleSpecification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr vehicle specifications.
	*
	* @return the vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findAll(int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle specifications
	*/
	public static List<VRVehicleSpecification> findAll(int start, int end,
		OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle specifications from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr vehicle specifications.
	*
	* @return the number of vr vehicle specifications
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRVehicleSpecificationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleSpecificationPersistence, VRVehicleSpecificationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleSpecificationPersistence.class);
}