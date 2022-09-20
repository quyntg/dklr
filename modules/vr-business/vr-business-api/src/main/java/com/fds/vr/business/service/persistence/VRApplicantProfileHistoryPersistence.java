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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException;
import com.fds.vr.business.model.VRApplicantProfileHistory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr applicant profile history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfileHistoryPersistenceImpl
 * @see VRApplicantProfileHistoryUtil
 * @generated
 */
@ProviderType
public interface VRApplicantProfileHistoryPersistence extends BasePersistence<VRApplicantProfileHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRApplicantProfileHistoryUtil} to access the vr applicant profile history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingStatus_First(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingStatus_Last(long mtCore,
		java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findBymappingStatus_PrevAndNext(
		long id, long mtCore, java.lang.String mappingStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	*/
	public void removeBymappingStatus(long mtCore,
		java.lang.String mappingStatus);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingStatus the mapping status
	* @return the number of matching vr applicant profile histories
	*/
	public int countBymappingStatus(long mtCore, java.lang.String mappingStatus);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantCode_First(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantCode_Last(long mtCore,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findByapplicantCode_PrevAndNext(
		long id, long mtCore, java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	*/
	public void removeByapplicantCode(long mtCore,
		java.lang.String applicantCode);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCode the applicant code
	* @return the number of matching vr applicant profile histories
	*/
	public int countByapplicantCode(long mtCore, java.lang.String applicantCode);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingMA_CTY_First(long mtCore,
		java.lang.String mappingMA_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingMA_CTY_First(long mtCore,
		java.lang.String mappingMA_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingMA_CTY_Last(long mtCore,
		java.lang.String mappingMA_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingMA_CTY_Last(long mtCore,
		java.lang.String mappingMA_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findBymappingMA_CTY_PrevAndNext(
		long id, long mtCore, java.lang.String mappingMA_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	*/
	public void removeBymappingMA_CTY(long mtCore,
		java.lang.String mappingMA_CTY);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingMA_CTY the mapping ma_cty
	* @return the number of matching vr applicant profile histories
	*/
	public int countBymappingMA_CTY(long mtCore, java.lang.String mappingMA_CTY);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingTEN_CTY_First(long mtCore,
		java.lang.String mappingTEN_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingTEN_CTY_First(long mtCore,
		java.lang.String mappingTEN_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findBymappingTEN_CTY_Last(long mtCore,
		java.lang.String mappingTEN_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchBymappingTEN_CTY_Last(long mtCore,
		java.lang.String mappingTEN_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findBymappingTEN_CTY_PrevAndNext(
		long id, long mtCore, java.lang.String mappingTEN_CTY,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	*/
	public void removeBymappingTEN_CTY(long mtCore,
		java.lang.String mappingTEN_CTY);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	*
	* @param mtCore the mt core
	* @param mappingTEN_CTY the mapping ten_cty
	* @return the number of matching vr applicant profile histories
	*/
	public int countBymappingTEN_CTY(long mtCore,
		java.lang.String mappingTEN_CTY);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantRegion_First(long mtCore,
		java.lang.String applicantRegion,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantRegion_First(long mtCore,
		java.lang.String applicantRegion,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantRegion_Last(long mtCore,
		java.lang.String applicantRegion,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantRegion_Last(long mtCore,
		java.lang.String applicantRegion,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findByapplicantRegion_PrevAndNext(
		long id, long mtCore, java.lang.String applicantRegion,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	*/
	public void removeByapplicantRegion(long mtCore,
		java.lang.String applicantRegion);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantRegion the applicant region
	* @return the number of matching vr applicant profile histories
	*/
	public int countByapplicantRegion(long mtCore,
		java.lang.String applicantRegion);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantCity_First(long mtCore,
		java.lang.String applicantCity,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantCity_First(long mtCore,
		java.lang.String applicantCity,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantCity_Last(long mtCore,
		java.lang.String applicantCity,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantCity_Last(long mtCore,
		java.lang.String applicantCity,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findByapplicantCity_PrevAndNext(
		long id, long mtCore, java.lang.String applicantCity,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	*/
	public void removeByapplicantCity(long mtCore,
		java.lang.String applicantCity);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantCity the applicant city
	* @return the number of matching vr applicant profile histories
	*/
	public int countByapplicantCity(long mtCore, java.lang.String applicantCity);

	/**
	* Returns all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @return the matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus);

	/**
	* Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantStatus_First(long mtCore,
		java.lang.String applicantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantStatus_First(long mtCore,
		java.lang.String applicantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory findByapplicantStatus_Last(long mtCore,
		java.lang.String applicantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	*/
	public VRApplicantProfileHistory fetchByapplicantStatus_Last(long mtCore,
		java.lang.String applicantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param id the primary key of the current vr applicant profile history
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory[] findByapplicantStatus_PrevAndNext(
		long id, long mtCore, java.lang.String applicantStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Removes all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	*/
	public void removeByapplicantStatus(long mtCore,
		java.lang.String applicantStatus);

	/**
	* Returns the number of vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantStatus the applicant status
	* @return the number of matching vr applicant profile histories
	*/
	public int countByapplicantStatus(long mtCore,
		java.lang.String applicantStatus);

	/**
	* Caches the vr applicant profile history in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	*/
	public void cacheResult(VRApplicantProfileHistory vrApplicantProfileHistory);

	/**
	* Caches the vr applicant profile histories in the entity cache if it is enabled.
	*
	* @param vrApplicantProfileHistories the vr applicant profile histories
	*/
	public void cacheResult(
		java.util.List<VRApplicantProfileHistory> vrApplicantProfileHistories);

	/**
	* Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	*
	* @param id the primary key for the new vr applicant profile history
	* @return the new vr applicant profile history
	*/
	public VRApplicantProfileHistory create(long id);

	/**
	* Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history that was removed
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory remove(long id)
		throws NoSuchVRApplicantProfileHistoryException;

	public VRApplicantProfileHistory updateImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory);

	/**
	* Returns the vr applicant profile history with the primary key or throws a {@link NoSuchVRApplicantProfileHistoryException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history
	* @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory findByPrimaryKey(long id)
		throws NoSuchVRApplicantProfileHistoryException;

	/**
	* Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	*/
	public VRApplicantProfileHistory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRApplicantProfileHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr applicant profile histories.
	*
	* @return the vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll();

	/**
	* Returns a range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator);

	/**
	* Returns an ordered range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr applicant profile histories
	*/
	public java.util.List<VRApplicantProfileHistory> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr applicant profile histories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr applicant profile histories.
	*
	* @return the number of vr applicant profile histories
	*/
	public int countAll();
}