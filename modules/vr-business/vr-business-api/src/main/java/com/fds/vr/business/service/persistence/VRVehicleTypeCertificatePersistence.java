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

import com.fds.vr.business.exception.NoSuchVRVehicleTypeCertificateException;
import com.fds.vr.business.model.VRVehicleTypeCertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle type certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleTypeCertificatePersistenceImpl
 * @see VRVehicleTypeCertificateUtil
 * @generated
 */
@ProviderType
public interface VRVehicleTypeCertificatePersistence extends BasePersistence<VRVehicleTypeCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleTypeCertificateUtil} to access the vr vehicle type certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr vehicle type certificates where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectorId_First(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectorId_First(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectorId_Last(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectorId_Last(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectorId = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByInspectorId_PrevAndNext(long id,
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	*/
	public void removeByInspectorId(long inspectorId);

	/**
	* Returns the number of vr vehicle type certificates where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByInspectorId(long inspectorId);

	/**
	* Returns all the vr vehicle type certificates where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId);

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
	public java.util.List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByCorporationId_PrevAndNext(long id,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public void removeByCorporationId(java.lang.String corporationId);

	/**
	* Returns the number of vr vehicle type certificates where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByCorporationId(java.lang.String corporationId);

	/**
	* Returns all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByInspectorIdCorporationId_PrevAndNext(
		long id, java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	*/
	public void removeByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId);

	/**
	* Returns the number of vr vehicle type certificates where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByInspectorIdCorporationId(java.lang.String corporationId,
		long inspectorId);

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByServiceCode_First(
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByServiceCode_First(
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByServiceCode_Last(
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByServiceCode_Last(
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where serviceCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByServiceCode_PrevAndNext(long id,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; from the database.
	*
	* @param serviceCode the service code
	*/
	public void removeByServiceCode(java.lang.String serviceCode);

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByServiceCode(java.lang.String serviceCode);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantIdNo_First(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantIdNo_Last(
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where applicantIdNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param applicantIdNo the applicant ID no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByApplicantIdNo_PrevAndNext(long id,
		java.lang.String applicantIdNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	*/
	public void removeByApplicantIdNo(java.lang.String applicantIdNo);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByApplicantIdNo(java.lang.String applicantIdNo);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByApplicantAndProductionPlant_First(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_First(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByApplicantAndProductionPlant_Last(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantAndProductionPlant_Last(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByApplicantAndProductionPlant_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	*/
	public void removeByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and productionPlantCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode);

	/**
	* Returns all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore);

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
	public java.util.List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDossierNo_MtCore_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDossierNo_MtCore_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDossierNo_MtCore_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDossierNo_MtCore_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByDossierNo_MtCore_PrevAndNext(
		long id, java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	*/
	public void removeByDossierNo_MtCore(java.lang.String dossierNo, long mtCore);

	/**
	* Returns the number of vr vehicle type certificates where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByDossierNo_MtCore(java.lang.String dossierNo, long mtCore);

	/**
	* Returns all the vr vehicle type certificates where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public void removeByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns the number of vr vehicle type certificates where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns all the vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByManufacturerForeignCode_First(
		java.lang.String manufacturerForeignCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByManufacturerForeignCode_First(
		java.lang.String manufacturerForeignCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByManufacturerForeignCode_Last(
		java.lang.String manufacturerForeignCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByManufacturerForeignCode_Last(
		java.lang.String manufacturerForeignCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where manufacturerForeignCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param manufacturerForeignCode the manufacturer foreign code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByManufacturerForeignCode_PrevAndNext(
		long id, java.lang.String manufacturerForeignCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where manufacturerForeignCode = &#63; from the database.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	*/
	public void removeByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode);

	/**
	* Returns the number of vr vehicle type certificates where manufacturerForeignCode = &#63;.
	*
	* @param manufacturerForeignCode the manufacturer foreign code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode);

	/**
	* Returns all the vr vehicle type certificates where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo);

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
	public java.util.List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCopReportNo_First(
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCopReportNo_First(
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCopReportNo_Last(
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCopReportNo_Last(
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where copReportNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByCopReportNo_PrevAndNext(long id,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where copReportNo = &#63; from the database.
	*
	* @param copReportNo the cop report no
	*/
	public void removeByCopReportNo(java.lang.String copReportNo);

	/**
	* Returns the number of vr vehicle type certificates where copReportNo = &#63;.
	*
	* @param copReportNo the cop report no
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByCopReportNo(java.lang.String copReportNo);

	/**
	* Returns all the vr vehicle type certificates where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDesignerCode_First(
		java.lang.String designerCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDesignerCode_First(
		java.lang.String designerCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDesignerCode_Last(
		java.lang.String designerCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDesignerCode_Last(
		java.lang.String designerCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designerCode = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param designerCode the designer code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByDesignerCode_PrevAndNext(long id,
		java.lang.String designerCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where designerCode = &#63; from the database.
	*
	* @param designerCode the designer code
	*/
	public void removeByDesignerCode(java.lang.String designerCode);

	/**
	* Returns the number of vr vehicle type certificates where designerCode = &#63;.
	*
	* @param designerCode the designer code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByDesignerCode(java.lang.String designerCode);

	/**
	* Returns all the vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo);

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
	public java.util.List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByVerificationCertificateNo_First(
		java.lang.String verificationCertificateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByVerificationCertificateNo_First(
		java.lang.String verificationCertificateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByVerificationCertificateNo_Last(
		java.lang.String verificationCertificateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByVerificationCertificateNo_Last(
		java.lang.String verificationCertificateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where verificationCertificateNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param verificationCertificateNo the verification certificate no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByVerificationCertificateNo_PrevAndNext(
		long id, java.lang.String verificationCertificateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where verificationCertificateNo = &#63; from the database.
	*
	* @param verificationCertificateNo the verification certificate no
	*/
	public void removeByVerificationCertificateNo(
		java.lang.String verificationCertificateNo);

	/**
	* Returns the number of vr vehicle type certificates where verificationCertificateNo = &#63;.
	*
	* @param verificationCertificateNo the verification certificate no
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByVerificationCertificateNo(
		java.lang.String verificationCertificateNo);

	/**
	* Returns all the vr vehicle type certificates where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDesignsymbol_First(
		java.lang.String designSymbol,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDesignsymbol_First(
		java.lang.String designSymbol,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDesignsymbol_Last(
		java.lang.String designSymbol,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDesignsymbol_Last(
		java.lang.String designSymbol,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where designSymbol = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param designSymbol the design symbol
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByDesignsymbol_PrevAndNext(long id,
		java.lang.String designSymbol,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where designSymbol = &#63; from the database.
	*
	* @param designSymbol the design symbol
	*/
	public void removeByDesignsymbol(java.lang.String designSymbol);

	/**
	* Returns the number of vr vehicle type certificates where designSymbol = &#63;.
	*
	* @param designSymbol the design symbol
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByDesignsymbol(java.lang.String designSymbol);

	/**
	* Returns all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCertificaterecordno_First(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCertificaterecordno_First(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCertificaterecordno_Last(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCertificaterecordno_Last(
		java.lang.String certificateRecordNo, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByCertificaterecordno_PrevAndNext(
		long id, java.lang.String certificateRecordNo,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63; from the database.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	*/
	public void removeByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode);

	/**
	* Returns the number of vr vehicle type certificates where certificateRecordNo = &#63; and serviceCode = &#63;.
	*
	* @param certificateRecordNo the certificate record no
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode);

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByExpiredstatus_First(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByExpiredstatus_First(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByExpiredstatus_Last(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByExpiredstatus_Last(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByExpiredstatus_PrevAndNext(long id,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	*
	* @param expiredStatus the expired status
	*/
	public void removeByExpiredstatus(java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByExpiredstatus(java.lang.String expiredStatus);

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_First(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_First(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByExpiredstatusAndServiceCode_Last(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByExpiredstatusAndServiceCode_Last(
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByExpiredstatusAndServiceCode_PrevAndNext(
		long id, java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63; from the database.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	*/
	public void removeByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode);

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByVehicletypeAndServiceCode_First(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_First(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByVehicletypeAndServiceCode_Last(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByVehicletypeAndServiceCode_Last(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByVehicletypeAndServiceCode_PrevAndNext(
		long id, java.lang.String vehicleClass,
		java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public void removeByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode);

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
	public int countByVehicletypeAndServiceCode(java.lang.String vehicleClass,
		java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode);

	/**
	* Returns all the vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard);

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
	public java.util.List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCommonsafetystandard_First(
		java.lang.String commonSafetyStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCommonsafetystandard_First(
		java.lang.String commonSafetyStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByCommonsafetystandard_Last(
		java.lang.String commonSafetyStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByCommonsafetystandard_Last(
		java.lang.String commonSafetyStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where commonSafetyStandard = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param commonSafetyStandard the common safety standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByCommonsafetystandard_PrevAndNext(
		long id, java.lang.String commonSafetyStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where commonSafetyStandard = &#63; from the database.
	*
	* @param commonSafetyStandard the common safety standard
	*/
	public void removeByCommonsafetystandard(
		java.lang.String commonSafetyStandard);

	/**
	* Returns the number of vr vehicle type certificates where commonSafetyStandard = &#63;.
	*
	* @param commonSafetyStandard the common safety standard
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByCommonsafetystandard(
		java.lang.String commonSafetyStandard);

	/**
	* Returns all the vr vehicle type certificates where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard);

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
	public java.util.List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByEmissionstandard_First(
		java.lang.String emissionStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByEmissionstandard_First(
		java.lang.String emissionStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByEmissionstandard_Last(
		java.lang.String emissionStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByEmissionstandard_Last(
		java.lang.String emissionStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where emissionStandard = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param emissionStandard the emission standard
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByEmissionstandard_PrevAndNext(
		long id, java.lang.String emissionStandard,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where emissionStandard = &#63; from the database.
	*
	* @param emissionStandard the emission standard
	*/
	public void removeByEmissionstandard(java.lang.String emissionStandard);

	/**
	* Returns the number of vr vehicle type certificates where emissionStandard = &#63;.
	*
	* @param emissionStandard the emission standard
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByEmissionstandard(java.lang.String emissionStandard);

	/**
	* Returns all the vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectionRecordNo_First(
		java.lang.String inspectionRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectionRecordNo_First(
		java.lang.String inspectionRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByInspectionRecordNo_Last(
		java.lang.String inspectionRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByInspectionRecordNo_Last(
		java.lang.String inspectionRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where inspectionRecordNo = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param inspectionRecordNo the inspection record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByInspectionRecordNo_PrevAndNext(
		long id, java.lang.String inspectionRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where inspectionRecordNo = &#63; from the database.
	*
	* @param inspectionRecordNo the inspection record no
	*/
	public void removeByInspectionRecordNo(java.lang.String inspectionRecordNo);

	/**
	* Returns the number of vr vehicle type certificates where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByInspectionRecordNo(java.lang.String inspectionRecordNo);

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByApplicantAndService_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantAndService_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByApplicantAndService_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByApplicantAndService_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByApplicantAndService_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	*/
	public void removeByApplicantAndService(java.lang.String serviceCode,
		java.lang.String applicantIdNo, long mtCore);

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByApplicantAndService(java.lang.String serviceCode,
		java.lang.String applicantIdNo, long mtCore);

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByDossierId(long dossierId, long mtCore)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDossierId(long dossierId, long mtCore);

	/**
	* Returns the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByDossierId(long dossierId,
		long mtCore, boolean retrieveFromCache);

	/**
	* Removes the vr vehicle type certificate where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the vr vehicle type certificate that was removed
	*/
	public VRVehicleTypeCertificate removeByDossierId(long dossierId,
		long mtCore) throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the number of vr vehicle type certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByDossierId(long dossierId, long mtCore);

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlantCode_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlantCode_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlantCode_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	*/
	public void removeByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore);

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantCode = &#63; and mtCore = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantCode the production plant code
	* @param mtCore the mt core
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore);

	/**
	* Returns all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_First(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByServiceCodeAndProductionPlant_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeAndProductionPlant_Last(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByServiceCodeAndProductionPlant_PrevAndNext(
		long id, java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public void removeByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns the number of vr vehicle type certificates where serviceCode = &#63; and applicantIdNo = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param serviceCode the service code
	* @param applicantIdNo the applicant ID no
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns all the vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByF_EXP_STATUS_First(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_EXP_STATUS_First(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByF_EXP_STATUS_Last(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_EXP_STATUS_Last(
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the vr vehicle type certificates before and after the current vr vehicle type certificate in the ordered set where expiredStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle type certificate
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate[] findByF_EXP_STATUS_PrevAndNext(long id,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle type certificates where expiredStatus = &#63; from the database.
	*
	* @param expiredStatus the expired status
	*/
	public void removeByF_EXP_STATUS(java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = &#63;.
	*
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_EXP_STATUS(java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where expiredStatus = any &#63;.
	*
	* @param expiredStatuses the expired statuses
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_EXP_STATUS(java.lang.String[] expiredStatuses);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_First(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_First(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate findByF_APPNO_EXP_STATUS_Last(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_APPNO_EXP_STATUS_Last(
		java.lang.String applicantIdNo, java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByF_APPNO_EXP_STATUS_PrevAndNext(
		long id, java.lang.String applicantIdNo,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatuses,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	*/
	public void removeByF_APPNO_EXP_STATUS(java.lang.String applicantIdNo,
		java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_APPNO_EXP_STATUS(java.lang.String applicantIdNo,
		java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and expiredStatus = any &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param expiredStatuses the expired statuses
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_APPNO_EXP_STATUS(java.lang.String applicantIdNo,
		java.lang.String[] expiredStatuses);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the first vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the last vr vehicle type certificate in the ordered set where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle type certificate, or <code>null</code> if a matching vr vehicle type certificate could not be found
	*/
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByF_APP_VH_EXP_PrevAndNext(long id,
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	*/
	public void removeByF_APP_VH_EXP(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_APP_VH_EXP(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByF_APP_VH_EXP_CERTNO_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByF_APP_VH_EXP_CERTNO_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByF_APP_VH_EXP_CERTNO_PrevAndNext(
		long id, java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	*/
	public void removeByF_APP_VH_EXP_CERTNO(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus,
		java.lang.String certificateRecordNo);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and certificateRecordNo = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param certificateRecordNo the certificate record no
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByF_APP_VH_EXP_CERTNO(java.lang.String applicantIdNo,
		java.lang.String vehicleClass, java.lang.String expiredStatus,
		java.lang.String certificateRecordNo);

	/**
	* Returns all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the matching vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

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
	public VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_First(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate findByServiceCodeVehicleClassAndApplicantIdNo_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

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
	public VRVehicleTypeCertificate fetchByServiceCodeVehicleClassAndApplicantIdNo_Last(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public VRVehicleTypeCertificate[] findByServiceCodeVehicleClassAndApplicantIdNo_PrevAndNext(
		long id, java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Removes all the vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63; from the database.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	*/
	public void removeByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode);

	/**
	* Returns the number of vr vehicle type certificates where applicantIdNo = &#63; and vehicleClass = &#63; and expiredStatus = &#63; and serviceCode = &#63;.
	*
	* @param applicantIdNo the applicant ID no
	* @param vehicleClass the vehicle class
	* @param expiredStatus the expired status
	* @param serviceCode the service code
	* @return the number of matching vr vehicle type certificates
	*/
	public int countByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode);

	/**
	* Caches the vr vehicle type certificate in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	*/
	public void cacheResult(VRVehicleTypeCertificate vrVehicleTypeCertificate);

	/**
	* Caches the vr vehicle type certificates in the entity cache if it is enabled.
	*
	* @param vrVehicleTypeCertificates the vr vehicle type certificates
	*/
	public void cacheResult(
		java.util.List<VRVehicleTypeCertificate> vrVehicleTypeCertificates);

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	public VRVehicleTypeCertificate create(long id);

	/**
	* Removes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate remove(long id)
		throws NoSuchVRVehicleTypeCertificateException;

	public VRVehicleTypeCertificate updateImpl(
		VRVehicleTypeCertificate vrVehicleTypeCertificate);

	/**
	* Returns the vr vehicle type certificate with the primary key or throws a {@link NoSuchVRVehicleTypeCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws NoSuchVRVehicleTypeCertificateException if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate findByPrimaryKey(long id)
		throws NoSuchVRVehicleTypeCertificateException;

	/**
	* Returns the vr vehicle type certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate, or <code>null</code> if a vr vehicle type certificate with the primary key could not be found
	*/
	public VRVehicleTypeCertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleTypeCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle type certificates.
	*
	* @return the vr vehicle type certificates
	*/
	public java.util.List<VRVehicleTypeCertificate> findAll();

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
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end);

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
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator);

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
	public java.util.List<VRVehicleTypeCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleTypeCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle type certificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	public int countAll();
}