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

import com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.business.model.VRCOPReportRepository;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop report repository service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl
 * @see VRCOPReportRepositoryUtil
 * @generated
 */
@ProviderType
public interface VRCOPReportRepositoryPersistence extends BasePersistence<VRCOPReportRepository> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPReportRepositoryUtil} to access the vrcop report repository persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findBycopReportStatus_First(long mtCore,
		java.lang.String copReportStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBycopReportStatus_First(long mtCore,
		java.lang.String copReportStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findBycopReportStatus_Last(long mtCore,
		java.lang.String copReportStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBycopReportStatus_Last(long mtCore,
		java.lang.String copReportStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findBycopReportStatus_PrevAndNext(long id,
		long mtCore, java.lang.String copReportStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	*/
	public void removeBycopReportStatus(long mtCore,
		java.lang.String copReportStatus);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportStatus the cop report status
	* @return the number of matching vrcop report repositories
	*/
	public int countBycopReportStatus(long mtCore,
		java.lang.String copReportStatus);

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findBycopReportNo(long mtCore,
		java.lang.String copReportNo)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBycopReportNo(long mtCore,
		java.lang.String copReportNo);

	/**
	* Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBycopReportNo(long mtCore,
		java.lang.String copReportNo, boolean retrieveFromCache);

	/**
	* Removes the vrcop report repository where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the vrcop report repository that was removed
	*/
	public VRCOPReportRepository removeBycopReportNo(long mtCore,
		java.lang.String copReportNo)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop report repositories
	*/
	public int countBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findByapplicantProfileId_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	*/
	public void removeByapplicantProfileId(long mtCore, long applicantProfileId);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vrcop report repositories
	*/
	public int countByapplicantProfileId(long mtCore, long applicantProfileId);

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantCode_copClassification_First(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantCode_copClassification_First(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantCode_copClassification_Last(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantCode_copClassification_Last(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findByproductionPlantCode_copClassification_PrevAndNext(
		long id, long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	*/
	public void removeByproductionPlantCode_copClassification(long mtCore,
		java.lang.String productionPlantCode, java.lang.String copClassification);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	*
	* @param mtCore the mt core
	* @param productionPlantCode the production plant code
	* @param copClassification the cop classification
	* @return the number of matching vrcop report repositories
	*/
	public int countByproductionPlantCode_copClassification(long mtCore,
		java.lang.String productionPlantCode, java.lang.String copClassification);

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantCode_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantCode_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findByproductionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	*/
	public void removeByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vrcop report repositories
	*/
	public int countByproductionPlantCode(long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantName_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantName_First(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByproductionPlantName_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByproductionPlantName_Last(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findByproductionPlantName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	*/
	public void removeByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantName the production plant name
	* @param productionPlantAddress the production plant address
	* @return the number of matching vrcop report repositories
	*/
	public int countByproductionPlantName(long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	/**
	* Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vrcop report repository
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository[] findBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	*/
	public void removeBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param productionPlantCode the production plant code
	* @return the number of matching vrcop report repositories
	*/
	public int countBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository findByDosierId_MtCore(long dossierId,
		long mtCore) throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore);

	/**
	* Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore, boolean retrieveFromCache);

	/**
	* Removes the vrcop report repository where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the vrcop report repository that was removed
	*/
	public VRCOPReportRepository removeByDosierId_MtCore(long dossierId,
		long mtCore) throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the number of vrcop report repositories where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vrcop report repositories
	*/
	public int countByDosierId_MtCore(long dossierId, long mtCore);

	/**
	* Caches the vrcop report repository in the entity cache if it is enabled.
	*
	* @param vrcopReportRepository the vrcop report repository
	*/
	public void cacheResult(VRCOPReportRepository vrcopReportRepository);

	/**
	* Caches the vrcop report repositories in the entity cache if it is enabled.
	*
	* @param vrcopReportRepositories the vrcop report repositories
	*/
	public void cacheResult(
		java.util.List<VRCOPReportRepository> vrcopReportRepositories);

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public VRCOPReportRepository create(long id);

	/**
	* Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository remove(long id)
		throws NoSuchVRCOPReportRepositoryException;

	public VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository);

	/**
	* Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository findByPrimaryKey(long id)
		throws NoSuchVRCOPReportRepositoryException;

	/**
	* Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	*/
	public VRCOPReportRepository fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop report repositories.
	*
	* @return the vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll();

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report repositories
	*/
	public java.util.List<VRCOPReportRepository> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop report repositories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	public int countAll();
}