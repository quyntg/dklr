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

import com.fds.vr.business.model.VRTrackchanges;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr trackchanges service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRTrackchangesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTrackchangesPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRTrackchangesPersistenceImpl
 * @generated
 */
@ProviderType
public class VRTrackchangesUtil {
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
	public static void clearCache(VRTrackchanges vrTrackchanges) {
		getPersistence().clearCache(vrTrackchanges);
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
	public static List<VRTrackchanges> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRTrackchanges> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRTrackchanges> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRTrackchanges update(VRTrackchanges vrTrackchanges) {
		return getPersistence().update(vrTrackchanges);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRTrackchanges update(VRTrackchanges vrTrackchanges,
		ServiceContext serviceContext) {
		return getPersistence().update(vrTrackchanges, serviceContext);
	}

	/**
	* Returns the vr trackchanges where applicantCode = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	*
	* @param applicantCode the applicant code
	* @return the matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_ApplicantCode(
		java.lang.String applicantCode)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence().findByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns the vr trackchanges where applicantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applicantCode the applicant code
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ApplicantCode(
		java.lang.String applicantCode) {
		return getPersistence().fetchByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns the vr trackchanges where applicantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applicantCode the applicant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ApplicantCode(
		java.lang.String applicantCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_ApplicantCode(applicantCode, retrieveFromCache);
	}

	/**
	* Removes the vr trackchanges where applicantCode = &#63; from the database.
	*
	* @param applicantCode the applicant code
	* @return the vr trackchanges that was removed
	*/
	public static VRTrackchanges removeByF_ApplicantCode(
		java.lang.String applicantCode)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence().removeByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns the number of vr trackchangeses where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the number of matching vr trackchangeses
	*/
	public static int countByF_ApplicantCode(java.lang.String applicantCode) {
		return getPersistence().countByF_ApplicantCode(applicantCode);
	}

	/**
	* Returns the vr trackchanges where productionPlantCode = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence().findByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr trackchanges where productionPlantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().fetchByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr trackchanges where productionPlantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param productionPlantCode the production plant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ProductionPlantCode(
		java.lang.String productionPlantCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_ProductionPlantCode(productionPlantCode,
			retrieveFromCache);
	}

	/**
	* Removes the vr trackchanges where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	* @return the vr trackchanges that was removed
	*/
	public static VRTrackchanges removeByF_ProductionPlantCode(
		java.lang.String productionPlantCode)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .removeByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the number of vr trackchangeses where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr trackchangeses
	*/
	public static int countByF_ProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getPersistence().countByF_ProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param contentFileTemplate the content file template
	* @return the matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_DossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .findByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	/**
	* Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param contentFileTemplate the content file template
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_DossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate) {
		return getPersistence()
				   .fetchByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	/**
	* Returns the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param contentFileTemplate the content file template
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_DossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate, retrieveFromCache);
	}

	/**
	* Removes the vr trackchanges where dossierId = &#63; and contentFileTemplate = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param contentFileTemplate the content file template
	* @return the vr trackchanges that was removed
	*/
	public static VRTrackchanges removeByF_DossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .removeByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	/**
	* Returns the number of vr trackchangeses where dossierId = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierId the dossier ID
	* @param contentFileTemplate the content file template
	* @return the number of matching vr trackchangeses
	*/
	public static int countByF_DossierId_ContentFileTemplate(long dossierId,
		java.lang.String contentFileTemplate) {
		return getPersistence()
				   .countByF_DossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	/**
	* Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_dossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .findByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_dossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_dossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate, retrieveFromCache);
	}

	/**
	* Removes the vr trackchanges where dossierIdCTN = &#63; and contentFileTemplate = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the vr trackchanges that was removed
	*/
	public static VRTrackchanges removeByF_dossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .removeByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns the number of vr trackchangeses where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the number of matching vr trackchangeses
	*/
	public static int countByF_dossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return getPersistence()
				   .countByF_dossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	/**
	* Returns all the vr trackchangeses where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the matching vr trackchangeses
	*/
	public static List<VRTrackchanges> findByF_ContentType(
		java.lang.String contentType) {
		return getPersistence().findByF_ContentType(contentType);
	}

	/**
	* Returns a range of all the vr trackchangeses where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @return the range of matching vr trackchangeses
	*/
	public static List<VRTrackchanges> findByF_ContentType(
		java.lang.String contentType, int start, int end) {
		return getPersistence().findByF_ContentType(contentType, start, end);
	}

	/**
	* Returns an ordered range of all the vr trackchangeses where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr trackchangeses
	*/
	public static List<VRTrackchanges> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return getPersistence()
				   .findByF_ContentType(contentType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr trackchangeses where contentType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contentType the content type
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr trackchangeses
	*/
	public static List<VRTrackchanges> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_ContentType(contentType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr trackchanges in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_ContentType_First(
		java.lang.String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .findByF_ContentType_First(contentType, orderByComparator);
	}

	/**
	* Returns the first vr trackchanges in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ContentType_First(
		java.lang.String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return getPersistence()
				   .fetchByF_ContentType_First(contentType, orderByComparator);
	}

	/**
	* Returns the last vr trackchanges in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr trackchanges
	* @throws NoSuchVRTrackchangesException if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges findByF_ContentType_Last(
		java.lang.String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .findByF_ContentType_Last(contentType, orderByComparator);
	}

	/**
	* Returns the last vr trackchanges in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr trackchanges, or <code>null</code> if a matching vr trackchanges could not be found
	*/
	public static VRTrackchanges fetchByF_ContentType_Last(
		java.lang.String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return getPersistence()
				   .fetchByF_ContentType_Last(contentType, orderByComparator);
	}

	/**
	* Returns the vr trackchangeses before and after the current vr trackchanges in the ordered set where contentType = &#63;.
	*
	* @param id the primary key of the current vr trackchanges
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr trackchanges
	* @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	*/
	public static VRTrackchanges[] findByF_ContentType_PrevAndNext(long id,
		java.lang.String contentType,
		OrderByComparator<VRTrackchanges> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence()
				   .findByF_ContentType_PrevAndNext(id, contentType,
			orderByComparator);
	}

	/**
	* Removes all the vr trackchangeses where contentType = &#63; from the database.
	*
	* @param contentType the content type
	*/
	public static void removeByF_ContentType(java.lang.String contentType) {
		getPersistence().removeByF_ContentType(contentType);
	}

	/**
	* Returns the number of vr trackchangeses where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the number of matching vr trackchangeses
	*/
	public static int countByF_ContentType(java.lang.String contentType) {
		return getPersistence().countByF_ContentType(contentType);
	}

	/**
	* Caches the vr trackchanges in the entity cache if it is enabled.
	*
	* @param vrTrackchanges the vr trackchanges
	*/
	public static void cacheResult(VRTrackchanges vrTrackchanges) {
		getPersistence().cacheResult(vrTrackchanges);
	}

	/**
	* Caches the vr trackchangeses in the entity cache if it is enabled.
	*
	* @param vrTrackchangeses the vr trackchangeses
	*/
	public static void cacheResult(List<VRTrackchanges> vrTrackchangeses) {
		getPersistence().cacheResult(vrTrackchangeses);
	}

	/**
	* Creates a new vr trackchanges with the primary key. Does not add the vr trackchanges to the database.
	*
	* @param id the primary key for the new vr trackchanges
	* @return the new vr trackchanges
	*/
	public static VRTrackchanges create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr trackchanges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges that was removed
	* @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	*/
	public static VRTrackchanges remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence().remove(id);
	}

	public static VRTrackchanges updateImpl(VRTrackchanges vrTrackchanges) {
		return getPersistence().updateImpl(vrTrackchanges);
	}

	/**
	* Returns the vr trackchanges with the primary key or throws a {@link NoSuchVRTrackchangesException} if it could not be found.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges
	* @throws NoSuchVRTrackchangesException if a vr trackchanges with the primary key could not be found
	*/
	public static VRTrackchanges findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRTrackchangesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr trackchanges with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges, or <code>null</code> if a vr trackchanges with the primary key could not be found
	*/
	public static VRTrackchanges fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRTrackchanges> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr trackchangeses.
	*
	* @return the vr trackchangeses
	*/
	public static List<VRTrackchanges> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr trackchangeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @return the range of vr trackchangeses
	*/
	public static List<VRTrackchanges> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr trackchangeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr trackchangeses
	*/
	public static List<VRTrackchanges> findAll(int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr trackchangeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr trackchangeses
	*/
	public static List<VRTrackchanges> findAll(int start, int end,
		OrderByComparator<VRTrackchanges> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr trackchangeses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr trackchangeses.
	*
	* @return the number of vr trackchangeses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRTrackchangesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTrackchangesPersistence, VRTrackchangesPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRTrackchangesPersistence.class);
}