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

import com.fds.vr.business.exception.NoSuchVRExpireCertificateException;
import com.fds.vr.business.model.VRExpireCertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr expire certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRExpireCertificatePersistenceImpl
 * @see VRExpireCertificateUtil
 * @generated
 */
@ProviderType
public interface VRExpireCertificatePersistence extends BasePersistence<VRExpireCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRExpireCertificateUtil} to access the vr expire certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate findByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId);

	/**
	* Returns the vr expire certificate where vehicleTypeCertificateId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId, boolean retrieveFromCache);

	/**
	* Removes the vr expire certificate where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the vr expire certificate that was removed
	*/
	public VRExpireCertificate removeByF_vehicleTypeCertificateId(
		long vehicleTypeCertificateId)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the number of vr expire certificates where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr expire certificates
	*/
	public int countByF_vehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Returns the vr expire certificate where dossierId = &#63; or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @return the matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate findBydossierId(long dossierId)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchBydossierId(long dossierId);

	/**
	* Returns the vr expire certificate where dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchBydossierId(long dossierId,
		boolean retrieveFromCache);

	/**
	* Removes the vr expire certificate where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @return the vr expire certificate that was removed
	*/
	public VRExpireCertificate removeBydossierId(long dossierId)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the number of vr expire certificates where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr expire certificates
	*/
	public int countBydossierId(long dossierId);

	/**
	* Returns all the vr expire certificates where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @return the matching vr expire certificates
	*/
	public java.util.List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus);

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
	public java.util.List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end);

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
	public java.util.List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator);

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
	public java.util.List<VRExpireCertificate> findByF_dossierStatus(
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate findByF_dossierStatus_First(
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the first vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchByF_dossierStatus_First(
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator);

	/**
	* Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate findByF_dossierStatus_Last(
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the last vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr expire certificate, or <code>null</code> if a matching vr expire certificate could not be found
	*/
	public VRExpireCertificate fetchByF_dossierStatus_Last(
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator);

	/**
	* Returns the vr expire certificates before and after the current vr expire certificate in the ordered set where dossierStatus = &#63;.
	*
	* @param id the primary key of the current vr expire certificate
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public VRExpireCertificate[] findByF_dossierStatus_PrevAndNext(long id,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator)
		throws NoSuchVRExpireCertificateException;

	/**
	* Removes all the vr expire certificates where dossierStatus = &#63; from the database.
	*
	* @param dossierStatus the dossier status
	*/
	public void removeByF_dossierStatus(java.lang.String dossierStatus);

	/**
	* Returns the number of vr expire certificates where dossierStatus = &#63;.
	*
	* @param dossierStatus the dossier status
	* @return the number of matching vr expire certificates
	*/
	public int countByF_dossierStatus(java.lang.String dossierStatus);

	/**
	* Caches the vr expire certificate in the entity cache if it is enabled.
	*
	* @param vrExpireCertificate the vr expire certificate
	*/
	public void cacheResult(VRExpireCertificate vrExpireCertificate);

	/**
	* Caches the vr expire certificates in the entity cache if it is enabled.
	*
	* @param vrExpireCertificates the vr expire certificates
	*/
	public void cacheResult(
		java.util.List<VRExpireCertificate> vrExpireCertificates);

	/**
	* Creates a new vr expire certificate with the primary key. Does not add the vr expire certificate to the database.
	*
	* @param id the primary key for the new vr expire certificate
	* @return the new vr expire certificate
	*/
	public VRExpireCertificate create(long id);

	/**
	* Removes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate that was removed
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public VRExpireCertificate remove(long id)
		throws NoSuchVRExpireCertificateException;

	public VRExpireCertificate updateImpl(
		VRExpireCertificate vrExpireCertificate);

	/**
	* Returns the vr expire certificate with the primary key or throws a {@link NoSuchVRExpireCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate
	* @throws NoSuchVRExpireCertificateException if a vr expire certificate with the primary key could not be found
	*/
	public VRExpireCertificate findByPrimaryKey(long id)
		throws NoSuchVRExpireCertificateException;

	/**
	* Returns the vr expire certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate, or <code>null</code> if a vr expire certificate with the primary key could not be found
	*/
	public VRExpireCertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRExpireCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr expire certificates.
	*
	* @return the vr expire certificates
	*/
	public java.util.List<VRExpireCertificate> findAll();

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
	public java.util.List<VRExpireCertificate> findAll(int start, int end);

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
	public java.util.List<VRExpireCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator);

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
	public java.util.List<VRExpireCertificate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRExpireCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr expire certificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr expire certificates.
	*
	* @return the number of vr expire certificates
	*/
	public int countAll();
}