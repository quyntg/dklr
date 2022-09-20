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

import com.fds.vr.business.exception.NoSuchVRMethodOfIssueException;
import com.fds.vr.business.model.VRMethodOfIssue;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr method of issue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRMethodOfIssuePersistenceImpl
 * @see VRMethodOfIssueUtil
 * @generated
 */
@ProviderType
public interface VRMethodOfIssuePersistence extends BasePersistence<VRMethodOfIssue> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRMethodOfIssueUtil} to access the vr method of issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue
	* @throws NoSuchVRMethodOfIssueException if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue findBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) throws NoSuchVRMethodOfIssueException;

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId);

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId, boolean retrieveFromCache);

	/**
	* Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the vr method of issue that was removed
	*/
	public VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) throws NoSuchVRMethodOfIssueException;

	/**
	* Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr method of issues
	*/
	public int countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId);

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue
	* @throws NoSuchVRMethodOfIssueException if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue findBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException;

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId);

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId,
		boolean retrieveFromCache);

	/**
	* Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the vr method of issue that was removed
	*/
	public VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId)
		throws NoSuchVRMethodOfIssueException;

	/**
	* Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr method of issues
	*/
	public int countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId);

	/**
	* Caches the vr method of issue in the entity cache if it is enabled.
	*
	* @param vrMethodOfIssue the vr method of issue
	*/
	public void cacheResult(VRMethodOfIssue vrMethodOfIssue);

	/**
	* Caches the vr method of issues in the entity cache if it is enabled.
	*
	* @param vrMethodOfIssues the vr method of issues
	*/
	public void cacheResult(java.util.List<VRMethodOfIssue> vrMethodOfIssues);

	/**
	* Creates a new vr method of issue with the primary key. Does not add the vr method of issue to the database.
	*
	* @param id the primary key for the new vr method of issue
	* @return the new vr method of issue
	*/
	public VRMethodOfIssue create(long id);

	/**
	* Removes the vr method of issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue that was removed
	* @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	*/
	public VRMethodOfIssue remove(long id)
		throws NoSuchVRMethodOfIssueException;

	public VRMethodOfIssue updateImpl(VRMethodOfIssue vrMethodOfIssue);

	/**
	* Returns the vr method of issue with the primary key or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue
	* @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	*/
	public VRMethodOfIssue findByPrimaryKey(long id)
		throws NoSuchVRMethodOfIssueException;

	/**
	* Returns the vr method of issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue, or <code>null</code> if a vr method of issue with the primary key could not be found
	*/
	public VRMethodOfIssue fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRMethodOfIssue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr method of issues.
	*
	* @return the vr method of issues
	*/
	public java.util.List<VRMethodOfIssue> findAll();

	/**
	* Returns a range of all the vr method of issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr method of issues
	* @param end the upper bound of the range of vr method of issues (not inclusive)
	* @return the range of vr method of issues
	*/
	public java.util.List<VRMethodOfIssue> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr method of issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr method of issues
	* @param end the upper bound of the range of vr method of issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr method of issues
	*/
	public java.util.List<VRMethodOfIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMethodOfIssue> orderByComparator);

	/**
	* Returns an ordered range of all the vr method of issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr method of issues
	* @param end the upper bound of the range of vr method of issues (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr method of issues
	*/
	public java.util.List<VRMethodOfIssue> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMethodOfIssue> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr method of issues from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr method of issues.
	*
	* @return the number of vr method of issues
	*/
	public int countAll();
}