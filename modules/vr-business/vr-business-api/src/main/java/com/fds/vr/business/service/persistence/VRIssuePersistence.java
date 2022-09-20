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

import com.fds.vr.business.exception.NoSuchVRIssueException;
import com.fds.vr.business.model.VRIssue;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr issue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRIssuePersistenceImpl
 * @see VRIssueUtil
 * @generated
 */
@ProviderType
public interface VRIssuePersistence extends BasePersistence<VRIssue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueUtil} to access the vr issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findBydossierId(long mtCore, long dossierId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBydossierId_First(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBydossierId_First(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBydossierId_Last(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBydossierId_Last(long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long mtCore, long dossierId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issues
	*/
	public int countBydossierId(long mtCore, long dossierId);

	/**
	* Returns all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBystampIssueNo_First(long mtCore,
		java.lang.String stampIssueNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBystampIssueNo_First(long mtCore,
		java.lang.String stampIssueNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBystampIssueNo_Last(long mtCore,
		java.lang.String stampIssueNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBystampIssueNo_Last(long mtCore,
		java.lang.String stampIssueNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findBystampIssueNo_PrevAndNext(long id, long mtCore,
		java.lang.String stampIssueNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and stampIssueNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	*/
	public void removeBystampIssueNo(long mtCore, java.lang.String stampIssueNo);

	/**
	* Returns the number of vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	*
	* @param mtCore the mt core
	* @param stampIssueNo the stamp issue no
	* @return the number of matching vr issues
	*/
	public int countBystampIssueNo(long mtCore, java.lang.String stampIssueNo);

	/**
	* Returns all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByapplicantProfileId(long mtCore,
		long dossierId, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByapplicantProfileId_First(long mtCore, long dossierId,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByapplicantProfileId_First(long mtCore, long dossierId,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByapplicantProfileId_Last(long mtCore, long dossierId,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByapplicantProfileId_Last(long mtCore, long dossierId,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findByapplicantProfileId_PrevAndNext(long id, long mtCore,
		long dossierId, long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	*/
	public void removeByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr issues
	*/
	public int countByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId);

	/**
	* Returns all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBycorporationId_First(long mtCore,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBycorporationId_First(long mtCore,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBycorporationId_Last(long mtCore,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBycorporationId_Last(long mtCore,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findBycorporationId_PrevAndNext(long id, long mtCore,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	*/
	public void removeBycorporationId(long mtCore,
		java.lang.String corporationId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the number of matching vr issues
	*/
	public int countBycorporationId(long mtCore, java.lang.String corporationId);

	/**
	* Returns all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByissueCorporationId_First(long mtCore,
		long issueCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByissueCorporationId_First(long mtCore,
		long issueCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByissueCorporationId_Last(long mtCore,
		long issueCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByissueCorporationId_Last(long mtCore,
		long issueCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findByissueCorporationId_PrevAndNext(long id, long mtCore,
		long issueCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and issueCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	*/
	public void removeByissueCorporationId(long mtCore, long issueCorporationId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueCorporationId the issue corporation ID
	* @return the number of matching vr issues
	*/
	public int countByissueCorporationId(long mtCore, long issueCorporationId);

	/**
	* Returns all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByverifyCorporationId_First(long mtCore,
		java.lang.String verifyCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByverifyCorporationId_First(long mtCore,
		java.lang.String verifyCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByverifyCorporationId_Last(long mtCore,
		java.lang.String verifyCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByverifyCorporationId_Last(long mtCore,
		java.lang.String verifyCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findByverifyCorporationId_PrevAndNext(long id,
		long mtCore, java.lang.String verifyCorporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and verifyCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	*/
	public void removeByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param verifyCorporationId the verify corporation ID
	* @return the number of matching vr issues
	*/
	public int countByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId);

	/**
	* Returns all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByproductionPlantId_First(long mtCore,
		long productionPlantId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByproductionPlantId_First(long mtCore,
		long productionPlantId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByproductionPlantId_Last(long mtCore,
		long productionPlantId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByproductionPlantId_Last(long mtCore,
		long productionPlantId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findByproductionPlantId_PrevAndNext(long id, long mtCore,
		long productionPlantId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and productionPlantId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	*/
	public void removeByproductionPlantId(long mtCore, long productionPlantId);

	/**
	* Returns the number of vr issues where mtCore = &#63; and productionPlantId = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantId the production plant ID
	* @return the number of matching vr issues
	*/
	public int countByproductionPlantId(long mtCore, long productionPlantId);

	/**
	* Returns all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo);

	/**
	* Returns a range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findBycopReportNo_PrevAndNext(long id, long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public void removeBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns the number of vr issues where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vr issues
	*/
	public int countBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @return the matching vr issues
	*/
	public java.util.List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus);

	/**
	* Returns a range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of matching vr issues
	*/
	public java.util.List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end);

	/**
	* Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issues
	*/
	public java.util.List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns the vr issues before and after the current vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param id the primary key of the current vr issue
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue[] findByIC_IS_PrevAndNext(long id, long issueCorporationId,
		int digitalIssueStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException;

	/**
	* Removes all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63; from the database.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	*/
	public void removeByIC_IS(long issueCorporationId, int digitalIssueStatus);

	/**
	* Returns the number of vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	*
	* @param issueCorporationId the issue corporation ID
	* @param digitalIssueStatus the digital issue status
	* @return the number of matching vr issues
	*/
	public int countByIC_IS(long issueCorporationId, int digitalIssueStatus);

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or throws a {@link NoSuchVRIssueException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue
	* @throws NoSuchVRIssueException if a matching vr issue could not be found
	*/
	public VRIssue findByF_MT_DID(long mtCore, long dossierId)
		throws NoSuchVRIssueException;

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByF_MT_DID(long mtCore, long dossierId);

	/**
	* Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	*/
	public VRIssue fetchByF_MT_DID(long mtCore, long dossierId,
		boolean retrieveFromCache);

	/**
	* Removes the vr issue where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the vr issue that was removed
	*/
	public VRIssue removeByF_MT_DID(long mtCore, long dossierId)
		throws NoSuchVRIssueException;

	/**
	* Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issues
	*/
	public int countByF_MT_DID(long mtCore, long dossierId);

	/**
	* Caches the vr issue in the entity cache if it is enabled.
	*
	* @param vrIssue the vr issue
	*/
	public void cacheResult(VRIssue vrIssue);

	/**
	* Caches the vr issues in the entity cache if it is enabled.
	*
	* @param vrIssues the vr issues
	*/
	public void cacheResult(java.util.List<VRIssue> vrIssues);

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	public VRIssue create(long id);

	/**
	* Removes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue remove(long id) throws NoSuchVRIssueException;

	public VRIssue updateImpl(VRIssue vrIssue);

	/**
	* Returns the vr issue with the primary key or throws a {@link NoSuchVRIssueException} if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	*/
	public VRIssue findByPrimaryKey(long id) throws NoSuchVRIssueException;

	/**
	* Returns the vr issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue, or <code>null</code> if a vr issue with the primary key could not be found
	*/
	public VRIssue fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRIssue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr issues.
	*
	* @return the vr issues
	*/
	public java.util.List<VRIssue> findAll();

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issues
	*/
	public java.util.List<VRIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr issues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	public int countAll();
}