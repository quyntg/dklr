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

import com.fds.vr.business.exception.NoSuchVRVehicleSpecificationException;
import com.fds.vr.business.model.VRVehicleSpecification;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleSpecificationPersistenceImpl
 * @see VRVehicleSpecificationUtil
 * @generated
 */
@ProviderType
public interface VRVehicleSpecificationPersistence extends BasePersistence<VRVehicleSpecification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleSpecificationUtil} to access the vr vehicle specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode);

	/**
	* Returns the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode, boolean retrieveFromCache);

	/**
	* Removes the vr vehicle specification where vehicleCertificateId = &#63; and specificationCode = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the vr vehicle specification that was removed
	*/
	public VRVehicleSpecification removeBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the number of vr vehicle specifications where vehicleCertificateId = &#63; and specificationCode = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param specificationCode the specification code
	* @return the number of matching vr vehicle specifications
	*/
	public int countBySC_VCID(long vehicleCertificateId,
		java.lang.String specificationCode);

	/**
	* Returns all the vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the matching vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId);

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
	public java.util.List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end);

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
	public java.util.List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

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
	public java.util.List<VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findByVehicleCertificateId_First(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the first vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchByVehicleCertificateId_First(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findByVehicleCertificateId_Last(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the last vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchByVehicleCertificateId_Last(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification[] findByVehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Removes all the vr vehicle specifications where vehicleCertificateId = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	*/
	public void removeByVehicleCertificateId(long vehicleCertificateId);

	/**
	* Returns the number of vr vehicle specifications where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the number of matching vr vehicle specifications
	*/
	public int countByVehicleCertificateId(long vehicleCertificateId);

	/**
	* Returns all the vr vehicle specifications where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode);

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
	public java.util.List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end);

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
	public java.util.List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

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
	public java.util.List<VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the first vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the last vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification[] findByDeliverableCode_PrevAndNext(long id,
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Removes all the vr vehicle specifications where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public void removeByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns the number of vr vehicle specifications where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr vehicle specifications
	*/
	public int countByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns all the vr vehicle specifications where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findBydossierId(
		long dossierId);

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
	public java.util.List<VRVehicleSpecification> findBydossierId(
		long dossierId, int start, int end);

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
	public java.util.List<VRVehicleSpecification> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

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
	public java.util.List<VRVehicleSpecification> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the first vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification findBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the last vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle specification, or <code>null</code> if a matching vr vehicle specification could not be found
	*/
	public VRVehicleSpecification fetchBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

	/**
	* Returns the vr vehicle specifications before and after the current vr vehicle specification in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle specification
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Removes all the vr vehicle specifications where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long dossierId);

	/**
	* Returns the number of vr vehicle specifications where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle specifications
	*/
	public int countBydossierId(long dossierId);

	/**
	* Caches the vr vehicle specification in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	*/
	public void cacheResult(VRVehicleSpecification vrVehicleSpecification);

	/**
	* Caches the vr vehicle specifications in the entity cache if it is enabled.
	*
	* @param vrVehicleSpecifications the vr vehicle specifications
	*/
	public void cacheResult(
		java.util.List<VRVehicleSpecification> vrVehicleSpecifications);

	/**
	* Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	*
	* @param id the primary key for the new vr vehicle specification
	* @return the new vr vehicle specification
	*/
	public VRVehicleSpecification create(long id);

	/**
	* Removes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification that was removed
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification remove(long id)
		throws NoSuchVRVehicleSpecificationException;

	public VRVehicleSpecification updateImpl(
		VRVehicleSpecification vrVehicleSpecification);

	/**
	* Returns the vr vehicle specification with the primary key or throws a {@link NoSuchVRVehicleSpecificationException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification
	* @throws NoSuchVRVehicleSpecificationException if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification findByPrimaryKey(long id)
		throws NoSuchVRVehicleSpecificationException;

	/**
	* Returns the vr vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification, or <code>null</code> if a vr vehicle specification with the primary key could not be found
	*/
	public VRVehicleSpecification fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleSpecification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle specifications.
	*
	* @return the vr vehicle specifications
	*/
	public java.util.List<VRVehicleSpecification> findAll();

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
	public java.util.List<VRVehicleSpecification> findAll(int start, int end);

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
	public java.util.List<VRVehicleSpecification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator);

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
	public java.util.List<VRVehicleSpecification> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleSpecification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle specifications from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle specifications.
	*
	* @return the number of vr vehicle specifications
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}