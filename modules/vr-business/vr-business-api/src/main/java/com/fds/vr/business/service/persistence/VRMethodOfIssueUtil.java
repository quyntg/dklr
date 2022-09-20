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

import com.fds.vr.business.model.VRMethodOfIssue;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr method of issue service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRMethodOfIssuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMethodOfIssuePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRMethodOfIssuePersistenceImpl
 * @generated
 */
@ProviderType
public class VRMethodOfIssueUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRMethodOfIssue vrMethodOfIssue) {
		getPersistence().clearCache(vrMethodOfIssue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRMethodOfIssue> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRMethodOfIssue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRMethodOfIssue> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRMethodOfIssue> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRMethodOfIssue update(VRMethodOfIssue vrMethodOfIssue) {
		return getPersistence().update(vrMethodOfIssue);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRMethodOfIssue update(VRMethodOfIssue vrMethodOfIssue,
		ServiceContext serviceContext) {
		return getPersistence().update(vrMethodOfIssue, serviceContext);
	}

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
	public static VRMethodOfIssue findBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence()
				   .findBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public static VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) {
		return getPersistence()
				   .fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

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
	public static VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId,
			retrieveFromCache);
	}

	/**
	* Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the vr method of issue that was removed
	*/
	public static VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence()
				   .removeBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

	/**
	* Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantCode = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantCode the production plant code
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr method of issues
	*/
	public static int countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) {
		return getPersistence()
				   .countBycertifiedAssemblyType_productionPlantCode_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

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
	public static VRMethodOfIssue findBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence()
				   .findBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
	}

	/**
	* Returns the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr method of issue, or <code>null</code> if a matching vr method of issue could not be found
	*/
	public static VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId) {
		return getPersistence()
				   .fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
	}

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
	public static VRMethodOfIssue fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId,
			retrieveFromCache);
	}

	/**
	* Removes the vr method of issue where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the vr method of issue that was removed
	*/
	public static VRMethodOfIssue removeBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence()
				   .removeBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
	}

	/**
	* Returns the number of vr method of issues where certifiedAssemblyType = &#63; and productionPlantId = &#63; and vehicleClass = &#63; and applicantProfileId = &#63;.
	*
	* @param certifiedAssemblyType the certified assembly type
	* @param productionPlantId the production plant ID
	* @param vehicleClass the vehicle class
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr method of issues
	*/
	public static int countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId) {
		return getPersistence()
				   .countBycertifiedAssemblyType_productionPlantId_vehicleClass_applicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
	}

	/**
	* Caches the vr method of issue in the entity cache if it is enabled.
	*
	* @param vrMethodOfIssue the vr method of issue
	*/
	public static void cacheResult(VRMethodOfIssue vrMethodOfIssue) {
		getPersistence().cacheResult(vrMethodOfIssue);
	}

	/**
	* Caches the vr method of issues in the entity cache if it is enabled.
	*
	* @param vrMethodOfIssues the vr method of issues
	*/
	public static void cacheResult(List<VRMethodOfIssue> vrMethodOfIssues) {
		getPersistence().cacheResult(vrMethodOfIssues);
	}

	/**
	* Creates a new vr method of issue with the primary key. Does not add the vr method of issue to the database.
	*
	* @param id the primary key for the new vr method of issue
	* @return the new vr method of issue
	*/
	public static VRMethodOfIssue create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr method of issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue that was removed
	* @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	*/
	public static VRMethodOfIssue remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence().remove(id);
	}

	public static VRMethodOfIssue updateImpl(VRMethodOfIssue vrMethodOfIssue) {
		return getPersistence().updateImpl(vrMethodOfIssue);
	}

	/**
	* Returns the vr method of issue with the primary key or throws a {@link NoSuchVRMethodOfIssueException} if it could not be found.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue
	* @throws NoSuchVRMethodOfIssueException if a vr method of issue with the primary key could not be found
	*/
	public static VRMethodOfIssue findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRMethodOfIssueException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr method of issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue, or <code>null</code> if a vr method of issue with the primary key could not be found
	*/
	public static VRMethodOfIssue fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRMethodOfIssue> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr method of issues.
	*
	* @return the vr method of issues
	*/
	public static List<VRMethodOfIssue> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRMethodOfIssue> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRMethodOfIssue> findAll(int start, int end,
		OrderByComparator<VRMethodOfIssue> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRMethodOfIssue> findAll(int start, int end,
		OrderByComparator<VRMethodOfIssue> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr method of issues from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr method of issues.
	*
	* @return the number of vr method of issues
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRMethodOfIssuePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRMethodOfIssuePersistence, VRMethodOfIssuePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRMethodOfIssuePersistence.class);
}