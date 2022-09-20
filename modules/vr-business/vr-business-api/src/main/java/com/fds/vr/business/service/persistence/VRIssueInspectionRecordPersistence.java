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

import com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException;
import com.fds.vr.business.model.VRIssueInspectionRecord;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr issue inspection record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRIssueInspectionRecordPersistenceImpl
 * @see VRIssueInspectionRecordUtil
 * @generated
 */
@ProviderType
public interface VRIssueInspectionRecordPersistence extends BasePersistence<VRIssueInspectionRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueInspectionRecordUtil} to access the vr issue inspection record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr issue inspection records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBydossierId(
		long dossierId);

	/**
	* Returns a range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Removes all the vr issue inspection records where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long dossierId);

	/**
	* Returns the number of vr issue inspection records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr issue inspection records
	*/
	public int countBydossierId(long dossierId);

	/**
	* Returns all the vr issue inspection records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findByissueId(long issueId);

	/**
	* Returns a range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord[] findByissueId_PrevAndNext(long id,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Removes all the vr issue inspection records where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public void removeByissueId(long issueId);

	/**
	* Returns the number of vr issue inspection records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue inspection records
	*/
	public int countByissueId(long issueId);

	/**
	* Returns all the vr issue inspection records where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @return the matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId);

	/**
	* Returns a range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findBycertificateId_First(
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchBycertificateId_First(
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord findBycertificateId_Last(
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public VRIssueInspectionRecord fetchBycertificateId_Last(
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord[] findBycertificateId_PrevAndNext(long id,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Removes all the vr issue inspection records where certificateId = &#63; from the database.
	*
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long certificateId);

	/**
	* Returns the number of vr issue inspection records where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @return the number of matching vr issue inspection records
	*/
	public int countBycertificateId(long certificateId);

	/**
	* Caches the vr issue inspection record in the entity cache if it is enabled.
	*
	* @param vrIssueInspectionRecord the vr issue inspection record
	*/
	public void cacheResult(VRIssueInspectionRecord vrIssueInspectionRecord);

	/**
	* Caches the vr issue inspection records in the entity cache if it is enabled.
	*
	* @param vrIssueInspectionRecords the vr issue inspection records
	*/
	public void cacheResult(
		java.util.List<VRIssueInspectionRecord> vrIssueInspectionRecords);

	/**
	* Creates a new vr issue inspection record with the primary key. Does not add the vr issue inspection record to the database.
	*
	* @param id the primary key for the new vr issue inspection record
	* @return the new vr issue inspection record
	*/
	public VRIssueInspectionRecord create(long id);

	/**
	* Removes the vr issue inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record that was removed
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord remove(long id)
		throws NoSuchVRIssueInspectionRecordException;

	public VRIssueInspectionRecord updateImpl(
		VRIssueInspectionRecord vrIssueInspectionRecord);

	/**
	* Returns the vr issue inspection record with the primary key or throws a {@link NoSuchVRIssueInspectionRecordException} if it could not be found.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord findByPrimaryKey(long id)
		throws NoSuchVRIssueInspectionRecordException;

	/**
	* Returns the vr issue inspection record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record, or <code>null</code> if a vr issue inspection record with the primary key could not be found
	*/
	public VRIssueInspectionRecord fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRIssueInspectionRecord> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr issue inspection records.
	*
	* @return the vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findAll();

	/**
	* Returns a range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue inspection records
	*/
	public java.util.List<VRIssueInspectionRecord> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr issue inspection records from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr issue inspection records.
	*
	* @return the number of vr issue inspection records
	*/
	public int countAll();
}