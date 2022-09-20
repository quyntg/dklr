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

import com.fds.vr.business.exception.NoSuchVRVehicleRecordException;
import com.fds.vr.business.model.VRVehicleRecord;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr vehicle record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleRecordPersistenceImpl
 * @see VRVehicleRecordUtil
 * @generated
 */
@ProviderType
public interface VRVehicleRecordPersistence extends BasePersistence<VRVehicleRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRVehicleRecordUtil} to access the vr vehicle record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByissueVehicleCertificateId_First(long mtCore,
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByissueVehicleCertificateId_First(long mtCore,
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByissueVehicleCertificateId_Last(long mtCore,
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByissueVehicleCertificateId_Last(long mtCore,
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr vehicle records
	*/
	public int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId);

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findBydossierId_First(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchBydossierId_First(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findBydossierId_Last(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchBydossierId_Last(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long mtCore, long dossierId);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle records
	*/
	public int countBydossierId(long mtCore, long dossierId);

	/**
	* Returns the vr vehicle record where frameNo = &#63; or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	*
	* @param frameNo the frame no
	* @return the matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByframeNo(java.lang.String frameNo)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param frameNo the frame no
	* @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByframeNo(java.lang.String frameNo);

	/**
	* Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param frameNo the frame no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByframeNo(java.lang.String frameNo,
		boolean retrieveFromCache);

	/**
	* Removes the vr vehicle record where frameNo = &#63; from the database.
	*
	* @param frameNo the frame no
	* @return the vr vehicle record that was removed
	*/
	public VRVehicleRecord removeByframeNo(java.lang.String frameNo)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the number of vr vehicle records where frameNo = &#63;.
	*
	* @param frameNo the frame no
	* @return the number of matching vr vehicle records
	*/
	public int countByframeNo(java.lang.String frameNo);

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long mtCore, long certificateId);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr vehicle records
	*/
	public int countBycertificateId(long mtCore, long certificateId);

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findByapplicantProfileId_PrevAndNext(long id,
		long mtCore, long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	*/
	public void removeByapplicantProfileId(long mtCore, long applicantProfileId);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr vehicle records
	*/
	public int countByapplicantProfileId(long mtCore, long applicantProfileId);

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findByapplicantProfileIdAndPrintingStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId, long printingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	*/
	public void removeByapplicantProfileIdAndPrintingStatus(long mtCore,
		long applicantProfileId, long printingStatus);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @return the number of matching vr vehicle records
	*/
	public int countByapplicantProfileIdAndPrintingStatus(long mtCore,
		long applicantProfileId, long printingStatus);

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus);

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		long vehicleRecordStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	*/
	public void removeByapplicantProfileIdAndVehicleRecordStatus(long mtCore,
		long applicantProfileId, long vehicleRecordStatus);

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @return the number of matching vr vehicle records
	*/
	public int countByapplicantProfileIdAndVehicleRecordStatus(long mtCore,
		long applicantProfileId, long vehicleRecordStatus);

	/**
	* Returns all the vr vehicle records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueId(long issueId);

	/**
	* Returns a range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueId(long issueId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueId(long issueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findByissueId(long issueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord findByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public VRVehicleRecord fetchByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord[] findByissueId_PrevAndNext(long id, long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator)
		throws NoSuchVRVehicleRecordException;

	/**
	* Removes all the vr vehicle records where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public void removeByissueId(long issueId);

	/**
	* Returns the number of vr vehicle records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr vehicle records
	*/
	public int countByissueId(long issueId);

	/**
	* Caches the vr vehicle record in the entity cache if it is enabled.
	*
	* @param vrVehicleRecord the vr vehicle record
	*/
	public void cacheResult(VRVehicleRecord vrVehicleRecord);

	/**
	* Caches the vr vehicle records in the entity cache if it is enabled.
	*
	* @param vrVehicleRecords the vr vehicle records
	*/
	public void cacheResult(java.util.List<VRVehicleRecord> vrVehicleRecords);

	/**
	* Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	*
	* @param id the primary key for the new vr vehicle record
	* @return the new vr vehicle record
	*/
	public VRVehicleRecord create(long id);

	/**
	* Removes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record that was removed
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord remove(long id)
		throws NoSuchVRVehicleRecordException;

	public VRVehicleRecord updateImpl(VRVehicleRecord vrVehicleRecord);

	/**
	* Returns the vr vehicle record with the primary key or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord findByPrimaryKey(long id)
		throws NoSuchVRVehicleRecordException;

	/**
	* Returns the vr vehicle record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record, or <code>null</code> if a vr vehicle record with the primary key could not be found
	*/
	public VRVehicleRecord fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRVehicleRecord> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr vehicle records.
	*
	* @return the vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll();

	/**
	* Returns a range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle records
	*/
	public java.util.List<VRVehicleRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr vehicle records from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr vehicle records.
	*
	* @return the number of vr vehicle records
	*/
	public int countAll();
}