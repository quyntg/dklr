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

import com.fds.vr.business.model.VRHistoryProfile;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr history profile service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRHistoryProfilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRHistoryProfilePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRHistoryProfilePersistenceImpl
 * @generated
 */
@ProviderType
public class VRHistoryProfileUtil {
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
	public static void clearCache(VRHistoryProfile vrHistoryProfile) {
		getPersistence().clearCache(vrHistoryProfile);
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
	public static List<VRHistoryProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRHistoryProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRHistoryProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRHistoryProfile update(VRHistoryProfile vrHistoryProfile) {
		return getPersistence().update(vrHistoryProfile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRHistoryProfile update(VRHistoryProfile vrHistoryProfile,
		ServiceContext serviceContext) {
		return getPersistence().update(vrHistoryProfile, serviceContext);
	}

	/**
	* Returns all the vr history profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode) {
		return getPersistence().findByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns a range of all the vr history profiles where applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end) {
		return getPersistence().findByF_ApplicantCode(applicantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_ApplicantCode(applicantCode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where applicantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantCode the applicant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_ApplicantCode(applicantCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ApplicantCode_First(
		java.lang.String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ApplicantCode_First(applicantCode, orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ApplicantCode_First(
		java.lang.String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ApplicantCode_First(applicantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ApplicantCode_Last(
		java.lang.String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ApplicantCode_Last(applicantCode, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ApplicantCode_Last(
		java.lang.String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ApplicantCode_Last(applicantCode, orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_ApplicantCode_PrevAndNext(
		long id, java.lang.String applicantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ApplicantCode_PrevAndNext(id, applicantCode,
			orderByComparator);
	}

	/**
	* Removes all the vr history profiles where applicantCode = &#63; from the database.
	*
	* @param applicantCode the applicant code
	*/
	public static void removeByF_ApplicantCode(java.lang.String applicantCode) {
		getPersistence().removeByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns the number of vr history profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the number of matching vr history profiles
	*/
	public static int countByF_ApplicantCode(java.lang.String applicantCode) {
		return getPersistence().countByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns all the vr history profiles where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().findByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns a range of all the vr history profiles where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end) {
		return getPersistence()
				   .findByF_ProductionPlantCode(productionPlantCode, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_ProductionPlantCode(productionPlantCode, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_ProductionPlantCode(productionPlantCode, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ProductionPlantCode_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ProductionPlantCode_First(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ProductionPlantCode_First(
		java.lang.String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ProductionPlantCode_First(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ProductionPlantCode_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ProductionPlantCode_Last(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ProductionPlantCode_Last(
		java.lang.String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ProductionPlantCode_Last(productionPlantCode,
			orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_ProductionPlantCode_PrevAndNext(
		long id, java.lang.String productionPlantCode,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ProductionPlantCode_PrevAndNext(id,
			productionPlantCode, orderByComparator);
	}

	/**
	* Removes all the vr history profiles where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public static void removeByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		getPersistence().removeByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the number of vr history profiles where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr history profiles
	*/
	public static int countByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().countByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns all the vr history profiles where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_DossierId(long dossierId) {
		return getPersistence().findByF_DossierId(dossierId);
	}

	/**
	* Returns a range of all the vr history profiles where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end) {
		return getPersistence().findByF_DossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_DossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_DossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_DossierId_First(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_DossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_DossierId_First(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_DossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_DossierId_Last(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_DossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_DossierId_Last(long dossierId,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_DossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_DossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_DossierId_PrevAndNext(id, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr history profiles where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeByF_DossierId(long dossierId) {
		getPersistence().removeByF_DossierId(dossierId);
	}

	/**
	* Returns the number of vr history profiles where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr history profiles
	*/
	public static int countByF_DossierId(long dossierId) {
		return getPersistence().countByF_DossierId(dossierId);
	}

	/**
	* Returns all the vr history profiles where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN) {
		return getPersistence().findByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns a range of all the vr history profiles where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end) {
		return getPersistence().findByF_dossierIdCTN(dossierIdCTN, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_dossierIdCTN(dossierIdCTN, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_dossierIdCTN(dossierIdCTN, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_dossierIdCTN_First(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_First(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_dossierIdCTN_First(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_First(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_dossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_Last(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_dossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_Last(dossierIdCTN, orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_dossierIdCTN_PrevAndNext(long id,
		java.lang.String dossierIdCTN,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_PrevAndNext(id, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Removes all the vr history profiles where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	*/
	public static void removeByF_dossierIdCTN(java.lang.String dossierIdCTN) {
		getPersistence().removeByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the number of vr history profiles where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vr history profiles
	*/
	public static int countByF_dossierIdCTN(java.lang.String dossierIdCTN) {
		return getPersistence().countByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns a range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end) {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_First(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate_First(dossierIdCTN,
			contentFileTemplate, orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_First(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_contentFileTemplate_First(dossierIdCTN,
			contentFileTemplate, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_Last(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate_Last(dossierIdCTN,
			contentFileTemplate, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_Last(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_contentFileTemplate_Last(dossierIdCTN,
			contentFileTemplate, orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_dossierIdCTN_contentFileTemplate_PrevAndNext(
		long id, java.lang.String dossierIdCTN,
		java.lang.String contentFileTemplate,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_dossierIdCTN_contentFileTemplate_PrevAndNext(id,
			dossierIdCTN, contentFileTemplate, orderByComparator);
	}

	/**
	* Removes all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	*/
	public static void removeByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		getPersistence()
			.removeByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns the number of vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the number of matching vr history profiles
	*/
	public static int countByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return getPersistence()
				   .countByF_dossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns all the vr history profiles where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType) {
		return getPersistence().findByF_ContentType(contentType);
	}

	/**
	* Returns a range of all the vr history profiles where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end) {
		return getPersistence().findByF_ContentType(contentType, start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .findByF_ContentType(contentType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr history profiles
	*/
	public static List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_ContentType(contentType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ContentType_First(
		java.lang.String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ContentType_First(contentType, orderByComparator);
	}

	/**
	* Returns the first vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ContentType_First(
		java.lang.String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ContentType_First(contentType, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile findByF_ContentType_Last(
		java.lang.String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ContentType_Last(contentType, orderByComparator);
	}

	/**
	* Returns the last vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public static VRHistoryProfile fetchByF_ContentType_Last(
		java.lang.String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence()
				   .fetchByF_ContentType_Last(contentType, orderByComparator);
	}

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where contentType = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile[] findByF_ContentType_PrevAndNext(long id,
		java.lang.String contentType,
		OrderByComparator<VRHistoryProfile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence()
				   .findByF_ContentType_PrevAndNext(id, contentType,
			orderByComparator);
	}

	/**
	* Removes all the vr history profiles where contentType = &#63; from the database.
	*
	* @param contentType the content type
	*/
	public static void removeByF_ContentType(java.lang.String contentType) {
		getPersistence().removeByF_ContentType(contentType);
	}

	/**
	* Returns the number of vr history profiles where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the number of matching vr history profiles
	*/
	public static int countByF_ContentType(java.lang.String contentType) {
		return getPersistence().countByF_ContentType(contentType);
	}

	/**
	* Caches the vr history profile in the entity cache if it is enabled.
	*
	* @param vrHistoryProfile the vr history profile
	*/
	public static void cacheResult(VRHistoryProfile vrHistoryProfile) {
		getPersistence().cacheResult(vrHistoryProfile);
	}

	/**
	* Caches the vr history profiles in the entity cache if it is enabled.
	*
	* @param vrHistoryProfiles the vr history profiles
	*/
	public static void cacheResult(List<VRHistoryProfile> vrHistoryProfiles) {
		getPersistence().cacheResult(vrHistoryProfiles);
	}

	/**
	* Creates a new vr history profile with the primary key. Does not add the vr history profile to the database.
	*
	* @param id the primary key for the new vr history profile
	* @return the new vr history profile
	*/
	public static VRHistoryProfile create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr history profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile that was removed
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence().remove(id);
	}

	public static VRHistoryProfile updateImpl(VRHistoryProfile vrHistoryProfile) {
		return getPersistence().updateImpl(vrHistoryProfile);
	}

	/**
	* Returns the vr history profile with the primary key or throws a {@link NoSuchVRHistoryProfileException} if it could not be found.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRHistoryProfileException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr history profile with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile, or <code>null</code> if a vr history profile with the primary key could not be found
	*/
	public static VRHistoryProfile fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRHistoryProfile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr history profiles.
	*
	* @return the vr history profiles
	*/
	public static List<VRHistoryProfile> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr history profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of vr history profiles
	*/
	public static List<VRHistoryProfile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr history profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr history profiles
	*/
	public static List<VRHistoryProfile> findAll(int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr history profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr history profiles
	*/
	public static List<VRHistoryProfile> findAll(int start, int end,
		OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr history profiles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr history profiles.
	*
	* @return the number of vr history profiles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRHistoryProfilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRHistoryProfilePersistence, VRHistoryProfilePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRHistoryProfilePersistence.class);
}