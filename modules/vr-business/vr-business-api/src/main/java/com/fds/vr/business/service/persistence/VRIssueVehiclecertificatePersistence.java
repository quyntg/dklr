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

import com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException;
import com.fds.vr.business.model.VRIssueVehiclecertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr issue vehiclecertificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRIssueVehiclecertificatePersistenceImpl
 * @see VRIssueVehiclecertificateUtil
 * @generated
 */
@ProviderType
public interface VRIssueVehiclecertificatePersistence extends BasePersistence<VRIssueVehiclecertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueVehiclecertificateUtil} to access the vr issue vehiclecertificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBydossierId(
		long mtCore, long dossierId);

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBydossierId(
		long mtCore, long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBydossierId(
		long mtCore, long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBydossierId(
		long mtCore, long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findBydossierId_First(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchBydossierId_First(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findBydossierId_Last(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchBydossierId_Last(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long mtCore, long dossierId);

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public int countBydossierId(long mtCore, long dossierId);

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @return the matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId);

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findByissueId_MtCore_First(long mtCore,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchByissueId_MtCore_First(long mtCore,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findByissueId_MtCore_Last(long mtCore,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchByissueId_MtCore_Last(long mtCore,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate[] findByissueId_MtCore_PrevAndNext(
		long id, long mtCore, long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	*/
	public void removeByissueId_MtCore(long mtCore, long issueId);

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public int countByissueId_MtCore(long mtCore, long issueId);

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @return the matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId);

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findBycertificateId_First(long mtCore,
		long dossierId, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchBycertificateId_First(long mtCore,
		long dossierId, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findBycertificateId_Last(long mtCore,
		long dossierId, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchBycertificateId_Last(long mtCore,
		long dossierId, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long dossierId, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long mtCore, long dossierId,
		long certificateId);

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public int countBycertificateId(long mtCore, long dossierId,
		long certificateId);

	/**
	* Returns all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId(long issueId);

	/**
	* Returns a range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId(
		long issueId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId(
		long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findByissueId(
		long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate findByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public VRIssueVehiclecertificate fetchByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate[] findByissueId_PrevAndNext(long id,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Removes all the vr issue vehiclecertificates where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public void removeByissueId(long issueId);

	/**
	* Returns the number of vr issue vehiclecertificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public int countByissueId(long issueId);

	/**
	* Caches the vr issue vehiclecertificate in the entity cache if it is enabled.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	*/
	public void cacheResult(VRIssueVehiclecertificate vrIssueVehiclecertificate);

	/**
	* Caches the vr issue vehiclecertificates in the entity cache if it is enabled.
	*
	* @param vrIssueVehiclecertificates the vr issue vehiclecertificates
	*/
	public void cacheResult(
		java.util.List<VRIssueVehiclecertificate> vrIssueVehiclecertificates);

	/**
	* Creates a new vr issue vehiclecertificate with the primary key. Does not add the vr issue vehiclecertificate to the database.
	*
	* @param id the primary key for the new vr issue vehiclecertificate
	* @return the new vr issue vehiclecertificate
	*/
	public VRIssueVehiclecertificate create(long id);

	/**
	* Removes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate remove(long id)
		throws NoSuchVRIssueVehiclecertificateException;

	public VRIssueVehiclecertificate updateImpl(
		VRIssueVehiclecertificate vrIssueVehiclecertificate);

	/**
	* Returns the vr issue vehiclecertificate with the primary key or throws a {@link NoSuchVRIssueVehiclecertificateException} if it could not be found.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate findByPrimaryKey(long id)
		throws NoSuchVRIssueVehiclecertificateException;

	/**
	* Returns the vr issue vehiclecertificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate, or <code>null</code> if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public VRIssueVehiclecertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRIssueVehiclecertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr issue vehiclecertificates.
	*
	* @return the vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findAll();

	/**
	* Returns a range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue vehiclecertificates
	*/
	public java.util.List<VRIssueVehiclecertificate> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr issue vehiclecertificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr issue vehiclecertificates.
	*
	* @return the number of vr issue vehiclecertificates
	*/
	public int countAll();
}