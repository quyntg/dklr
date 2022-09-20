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

import com.fds.vr.business.model.VRApplicantProfile;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr applicant profile service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRApplicantProfilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfilePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfilePersistenceImpl
 * @generated
 */
@ProviderType
public class VRApplicantProfileUtil {
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
	public static void clearCache(VRApplicantProfile vrApplicantProfile) {
		getPersistence().clearCache(vrApplicantProfile);
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
	public static List<VRApplicantProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRApplicantProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRApplicantProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRApplicantProfile> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRApplicantProfile update(
		VRApplicantProfile vrApplicantProfile) {
		return getPersistence().update(vrApplicantProfile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRApplicantProfile update(
		VRApplicantProfile vrApplicantProfile, ServiceContext serviceContext) {
		return getPersistence().update(vrApplicantProfile, serviceContext);
	}

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	*
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile
	* @throws NoSuchVRApplicantProfileException if a matching vr applicant profile could not be found
	*/
	public static VRApplicantProfile findByapplicantCode(
		java.lang.String applicantCode)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileException {
		return getPersistence().findByapplicantCode(applicantCode);
	}

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	*/
	public static VRApplicantProfile fetchByapplicantCode(
		java.lang.String applicantCode) {
		return getPersistence().fetchByapplicantCode(applicantCode);
	}

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applicantCode the applicant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	*/
	public static VRApplicantProfile fetchByapplicantCode(
		java.lang.String applicantCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByapplicantCode(applicantCode, retrieveFromCache);
	}

	/**
	* Removes the vr applicant profile where applicantCode = &#63; from the database.
	*
	* @param applicantCode the applicant code
	* @return the vr applicant profile that was removed
	*/
	public static VRApplicantProfile removeByapplicantCode(
		java.lang.String applicantCode)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileException {
		return getPersistence().removeByapplicantCode(applicantCode);
	}

	/**
	* Returns the number of vr applicant profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the number of matching vr applicant profiles
	*/
	public static int countByapplicantCode(java.lang.String applicantCode) {
		return getPersistence().countByapplicantCode(applicantCode);
	}

	/**
	* Caches the vr applicant profile in the entity cache if it is enabled.
	*
	* @param vrApplicantProfile the vr applicant profile
	*/
	public static void cacheResult(VRApplicantProfile vrApplicantProfile) {
		getPersistence().cacheResult(vrApplicantProfile);
	}

	/**
	* Caches the vr applicant profiles in the entity cache if it is enabled.
	*
	* @param vrApplicantProfiles the vr applicant profiles
	*/
	public static void cacheResult(List<VRApplicantProfile> vrApplicantProfiles) {
		getPersistence().cacheResult(vrApplicantProfiles);
	}

	/**
	* Creates a new vr applicant profile with the primary key. Does not add the vr applicant profile to the database.
	*
	* @param id the primary key for the new vr applicant profile
	* @return the new vr applicant profile
	*/
	public static VRApplicantProfile create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr applicant profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile that was removed
	* @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	*/
	public static VRApplicantProfile remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileException {
		return getPersistence().remove(id);
	}

	public static VRApplicantProfile updateImpl(
		VRApplicantProfile vrApplicantProfile) {
		return getPersistence().updateImpl(vrApplicantProfile);
	}

	/**
	* Returns the vr applicant profile with the primary key or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile
	* @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	*/
	public static VRApplicantProfile findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRApplicantProfileException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr applicant profile with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile, or <code>null</code> if a vr applicant profile with the primary key could not be found
	*/
	public static VRApplicantProfile fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRApplicantProfile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr applicant profiles.
	*
	* @return the vr applicant profiles
	*/
	public static List<VRApplicantProfile> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr applicant profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profiles
	* @param end the upper bound of the range of vr applicant profiles (not inclusive)
	* @return the range of vr applicant profiles
	*/
	public static List<VRApplicantProfile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr applicant profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profiles
	* @param end the upper bound of the range of vr applicant profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr applicant profiles
	*/
	public static List<VRApplicantProfile> findAll(int start, int end,
		OrderByComparator<VRApplicantProfile> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr applicant profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profiles
	* @param end the upper bound of the range of vr applicant profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr applicant profiles
	*/
	public static List<VRApplicantProfile> findAll(int start, int end,
		OrderByComparator<VRApplicantProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr applicant profiles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr applicant profiles.
	*
	* @return the number of vr applicant profiles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRApplicantProfilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRApplicantProfilePersistence, VRApplicantProfilePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRApplicantProfilePersistence.class);
}