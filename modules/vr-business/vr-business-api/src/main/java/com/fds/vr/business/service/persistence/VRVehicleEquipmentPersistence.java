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

import com.fds.vr.business.exception.NoSuchVRVehicleEquipmentException;
import com.fds.vr.business.model.VRVehicleEquipment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleEquipmentPersistenceImpl
 * @see VRVehicleEquipmentUtil
 * @generated
 */
@ProviderType
public interface VRVehicleEquipmentPersistence extends BasePersistence<VRVehicleEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleEquipmentUtil} to access the vr vehicle equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr vehicle equipments
	*/
	public java.util.List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId);

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
	public java.util.List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end);

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
	public java.util.List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

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
	public java.util.List<VRVehicleEquipment> findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the first vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchByF_vehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the last vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchByF_vehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment[] findByF_vehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Removes all the vr vehicle equipments where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	*/
	public void removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId);

	/**
	* Returns the number of vr vehicle equipments where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr vehicle equipments
	*/
	public int countByF_vehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Returns all the vr vehicle equipments where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching vr vehicle equipments
	*/
	public java.util.List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId);

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
	public java.util.List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end);

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
	public java.util.List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

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
	public java.util.List<VRVehicleEquipment> findByF_certificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findByF_certificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the first vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchByF_certificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findByF_certificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the last vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchByF_certificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment[] findByF_certificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Removes all the vr vehicle equipments where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	*/
	public void removeByF_certificateRecordId(long certificateRecordId);

	/**
	* Returns the number of vr vehicle equipments where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching vr vehicle equipments
	*/
	public int countByF_certificateRecordId(long certificateRecordId);

	/**
	* Returns all the vr vehicle equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr vehicle equipments
	*/
	public java.util.List<VRVehicleEquipment> findBydossierId(long dossierId);

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
	public java.util.List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end);

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
	public java.util.List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

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
	public java.util.List<VRVehicleEquipment> findBydossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the first vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment findBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the last vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle equipment, or <code>null</code> if a matching vr vehicle equipment could not be found
	*/
	public VRVehicleEquipment fetchBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

	/**
	* Returns the vr vehicle equipments before and after the current vr vehicle equipment in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle equipment
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Removes all the vr vehicle equipments where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long dossierId);

	/**
	* Returns the number of vr vehicle equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle equipments
	*/
	public int countBydossierId(long dossierId);

	/**
	* Caches the vr vehicle equipment in the entity cache if it is enabled.
	*
	* @param vrVehicleEquipment the vr vehicle equipment
	*/
	public void cacheResult(VRVehicleEquipment vrVehicleEquipment);

	/**
	* Caches the vr vehicle equipments in the entity cache if it is enabled.
	*
	* @param vrVehicleEquipments the vr vehicle equipments
	*/
	public void cacheResult(
		java.util.List<VRVehicleEquipment> vrVehicleEquipments);

	/**
	* Creates a new vr vehicle equipment with the primary key. Does not add the vr vehicle equipment to the database.
	*
	* @param id the primary key for the new vr vehicle equipment
	* @return the new vr vehicle equipment
	*/
	public VRVehicleEquipment create(long id);

	/**
	* Removes the vr vehicle equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment that was removed
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment remove(long id)
		throws NoSuchVRVehicleEquipmentException;

	public VRVehicleEquipment updateImpl(VRVehicleEquipment vrVehicleEquipment);

	/**
	* Returns the vr vehicle equipment with the primary key or throws a {@link NoSuchVRVehicleEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment
	* @throws NoSuchVRVehicleEquipmentException if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment findByPrimaryKey(long id)
		throws NoSuchVRVehicleEquipmentException;

	/**
	* Returns the vr vehicle equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment, or <code>null</code> if a vr vehicle equipment with the primary key could not be found
	*/
	public VRVehicleEquipment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle equipments.
	*
	* @return the vr vehicle equipments
	*/
	public java.util.List<VRVehicleEquipment> findAll();

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
	public java.util.List<VRVehicleEquipment> findAll(int start, int end);

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
	public java.util.List<VRVehicleEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator);

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
	public java.util.List<VRVehicleEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle equipments.
	*
	* @return the number of vr vehicle equipments
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}