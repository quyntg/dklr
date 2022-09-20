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

import com.fds.vr.business.model.VRDossierFile;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr dossier file service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRDossierFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRDossierFilePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRDossierFilePersistenceImpl
 * @generated
 */
@ProviderType
public class VRDossierFileUtil {
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
	public static void clearCache(VRDossierFile vrDossierFile) {
		getPersistence().clearCache(vrDossierFile);
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
	public static List<VRDossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRDossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRDossierFile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRDossierFile update(VRDossierFile vrDossierFile) {
		return getPersistence().update(vrDossierFile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRDossierFile update(VRDossierFile vrDossierFile,
		ServiceContext serviceContext) {
		return getPersistence().update(vrDossierFile, serviceContext);
	}

	/**
	* Returns all the vr dossier files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the vr dossier files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByUuid_First(java.lang.String uuid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByUuid_PrevAndNext(long dossierFileId,
		java.lang.String uuid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByUuid_PrevAndNext(dossierFileId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the vr dossier files where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of vr dossier files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr dossier files
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByUUID_G(java.lang.String uuid, long groupId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of vr dossier files where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr dossier files
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByUuid_C_PrevAndNext(long dossierFileId,
		java.lang.String uuid, long companyId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(dossierFileId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the vr dossier files where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr dossier files
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo) {
		return getPersistence().findByDID_FTN(dossierId, fileTemplateNo);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end) {
		return getPersistence()
				   .findByDID_FTN(dossierId, fileTemplateNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_FTN(dossierId, fileTemplateNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_FTN(dossierId, fileTemplateNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTN_First(long dossierId,
		java.lang.String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTN_First(dossierId, fileTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTN_First(long dossierId,
		java.lang.String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTN_First(dossierId, fileTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTN_Last(long dossierId,
		java.lang.String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTN_Last(dossierId, fileTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTN_Last(long dossierId,
		java.lang.String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTN_Last(dossierId, fileTemplateNo,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_FTN_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String fileTemplateNo,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTN_PrevAndNext(dossierFileId, dossierId,
			fileTemplateNo, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	*/
	public static void removeByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo) {
		getPersistence().removeByDID_FTN(dossierId, fileTemplateNo);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo) {
		return getPersistence().countByDID_FTN(dossierId, fileTemplateNo);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_(long dossierId) {
		return getPersistence().findByDID_(dossierId);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_(long dossierId, int start,
		int end) {
		return getPersistence().findByDID_(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_(long dossierId, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_(long dossierId, int start,
		int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID__First(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByDID__First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID__First(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().fetchByDID__First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID__Last(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByDID__Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID__Last(long dossierId,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().fetchByDID__Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID__PrevAndNext(long dossierFileId,
		long dossierId, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID__PrevAndNext(dossierFileId, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeByDID_(long dossierId) {
		getPersistence().removeByDID_(dossierId);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_(long dossierId) {
		return getPersistence().countByDID_(dossierId);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed) {
		return getPersistence().findByDossierId(dossierId, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end) {
		return getPersistence().findByDossierId(dossierId, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDossierId(dossierId, removed, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId(dossierId, removed, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDossierId_First(long dossierId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDossierId_First(dossierId, removed, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDossierId_First(long dossierId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, removed, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDossierId_Last(long dossierId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, removed, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDossierId_Last(long dossierId,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, removed, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDossierId_PrevAndNext(
		long dossierFileId, long dossierId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(dossierFileId, dossierId,
			removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	*/
	public static void removeByDossierId(long dossierId, boolean removed) {
		getPersistence().removeByDossierId(dossierId, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDossierId(long dossierId, boolean removed) {
		return getPersistence().countByDossierId(dossierId, removed);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed) {
		return getPersistence().findByD_DPT(dossierId, dossierPartType, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end) {
		return getPersistence()
				   .findByD_DPT(dossierId, dossierPartType, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByD_DPT(dossierId, dossierPartType, removed, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByD_DPT(dossierId, dossierPartType, removed, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByD_DPT_First(long dossierId,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByD_DPT_First(dossierId, dossierPartType, removed,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByD_DPT_First(long dossierId,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByD_DPT_First(dossierId, dossierPartType, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByD_DPT_Last(long dossierId,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByD_DPT_Last(dossierId, dossierPartType, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByD_DPT_Last(long dossierId,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByD_DPT_Last(dossierId, dossierPartType, removed,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByD_DPT_PrevAndNext(long dossierFileId,
		long dossierId, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByD_DPT_PrevAndNext(dossierFileId, dossierId,
			dossierPartType, removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	*/
	public static void removeByD_DPT(long dossierId, int dossierPartType,
		boolean removed) {
		getPersistence().removeByD_DPT(dossierId, dossierPartType, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByD_DPT(long dossierId, int dossierPartType,
		boolean removed) {
		return getPersistence().countByD_DPT(dossierId, dossierPartType, removed);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByD_RUID(dossierId, referenceUid, removed);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed) {
		return getPersistence().fetchByD_RUID(dossierId, referenceUid, removed);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByD_RUID(dossierId, referenceUid, removed,
			retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByD_RUID(dossierId, referenceUid, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed) {
		return getPersistence().countByD_RUID(dossierId, referenceUid, removed);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_REF(long dossierId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByDID_REF(dossierId, referenceUid);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_REF(long dossierId,
		java.lang.String referenceUid) {
		return getPersistence().fetchByDID_REF(dossierId, referenceUid);
	}

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_REF(long dossierId,
		java.lang.String referenceUid, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDID_REF(dossierId, referenceUid, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByDID_REF(long dossierId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByDID_REF(dossierId, referenceUid);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_REF(long dossierId,
		java.lang.String referenceUid) {
		return getPersistence().countByDID_REF(dossierId, referenceUid);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed) {
		return getPersistence().findByDID_ISN(dossierId, isNew, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end) {
		return getPersistence()
				   .findByDID_ISN(dossierId, isNew, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_ISN(dossierId, isNew, removed, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_ISN(dossierId, isNew, removed, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_ISN_First(long dossierId,
		boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_ISN_First(dossierId, isNew, removed,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_ISN_First(long dossierId,
		boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_ISN_First(dossierId, isNew, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_ISN_Last(long dossierId,
		boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_ISN_Last(dossierId, isNew, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_ISN_Last(long dossierId,
		boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_ISN_Last(dossierId, isNew, removed,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_ISN_PrevAndNext(
		long dossierFileId, long dossierId, boolean isNew, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_ISN_PrevAndNext(dossierFileId, dossierId, isNew,
			removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	*/
	public static void removeByDID_ISN(long dossierId, boolean isNew,
		boolean removed) {
		getPersistence().removeByDID_ISN(dossierId, isNew, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_ISN(long dossierId, boolean isNew,
		boolean removed) {
		return getPersistence().countByDID_ISN(dossierId, isNew, removed);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed) {
		return getPersistence()
				   .findByDID_FTNO(dossierId, fileTemplateNo, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end) {
		return getPersistence()
				   .findByDID_FTNO(dossierId, fileTemplateNo, removed, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_FTNO(dossierId, fileTemplateNo, removed, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_FTNO(dossierId, fileTemplateNo, removed, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_First(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_First(dossierId, fileTemplateNo, removed,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_First(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_First(dossierId, fileTemplateNo, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_Last(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_Last(dossierId, fileTemplateNo, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_Last(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_Last(dossierId, fileTemplateNo, removed,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_FTNO_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String fileTemplateNo,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_PrevAndNext(dossierFileId, dossierId,
			fileTemplateNo, removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	*/
	public static void removeByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed) {
		getPersistence().removeByDID_FTNO(dossierId, fileTemplateNo, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed) {
		return getPersistence()
				   .countByDID_FTNO(dossierId, fileTemplateNo, removed);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed) {
		return getPersistence().findByDID_DPNO(dossierId, dossierPartNo, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end) {
		return getPersistence()
				   .findByDID_DPNO(dossierId, dossierPartNo, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_DPNO(dossierId, dossierPartNo, removed, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_DPNO(dossierId, dossierPartNo, removed, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_DPNO_First(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_DPNO_First(dossierId, dossierPartNo, removed,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_DPNO_First(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_DPNO_First(dossierId, dossierPartNo, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_DPNO_Last(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_DPNO_Last(dossierId, dossierPartNo, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_DPNO_Last(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_DPNO_Last(dossierId, dossierPartNo, removed,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_DPNO_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String dossierPartNo,
		boolean removed, OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_DPNO_PrevAndNext(dossierFileId, dossierId,
			dossierPartNo, removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	*/
	public static void removeByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed) {
		getPersistence().removeByDID_DPNO(dossierId, dossierPartNo, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed) {
		return getPersistence()
				   .countByDID_DPNO(dossierId, dossierPartNo, removed);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed) {
		return getPersistence()
				   .findByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end) {
		return getPersistence()
				   .findByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end, OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_DPT_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_First(dossierId, fileTemplateNo,
			dossierPartType, removed, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_DPT_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_DPT_First(dossierId, fileTemplateNo,
			dossierPartType, removed, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_DPT_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_Last(dossierId, fileTemplateNo,
			dossierPartType, removed, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_DPT_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_DPT_Last(dossierId, fileTemplateNo,
			dossierPartType, removed, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_FTNO_DPT_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String fileTemplateNo,
		int dossierPartType, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_PrevAndNext(dossierFileId, dossierId,
			fileTemplateNo, dossierPartType, removed, orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	*/
	public static void removeByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed) {
		getPersistence()
			.removeByDID_FTNO_DPT(dossierId, fileTemplateNo, dossierPartType,
			removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed) {
		return getPersistence()
				   .countByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed);
	}

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed) {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed);
	}

	/**
	* Returns a range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end) {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_First(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID_First(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed,
			orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_First(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_DPT_NOT_NULL_FID_First(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_Last(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID_Last(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed,
			orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_Last(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByDID_FTNO_DPT_NOT_NULL_FID_Last(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed,
			orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String fileTemplateNo,
		int dossierPartType, long fileEntryId, boolean removed,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(dossierFileId,
			dossierId, fileTemplateNo, dossierPartType, fileEntryId, removed,
			orderByComparator);
	}

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	*/
	public static void removeByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed) {
		getPersistence()
			.removeByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed);
	}

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public static int countByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed) {
		return getPersistence()
				   .countByDID_FTNO_DPT_NOT_NULL_FID(dossierId, fileTemplateNo,
			dossierPartType, fileEntryId, removed);
	}

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDE_CODE(java.lang.String deliverableCode)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByDE_CODE(deliverableCode);
	}

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDE_CODE(java.lang.String deliverableCode) {
		return getPersistence().fetchByDE_CODE(deliverableCode);
	}

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param deliverableCode the deliverable code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDE_CODE(
		java.lang.String deliverableCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDE_CODE(deliverableCode, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByDE_CODE(
		java.lang.String deliverableCode)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByDE_CODE(deliverableCode);
	}

	/**
	* Returns the number of vr dossier files where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr dossier files
	*/
	public static int countByDE_CODE(java.lang.String deliverableCode) {
		return getPersistence().countByDE_CODE(deliverableCode);
	}

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByGID_REF(long groupId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByGID_REF(groupId, referenceUid);
	}

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByGID_REF(long groupId,
		java.lang.String referenceUid) {
		return getPersistence().fetchByGID_REF(groupId, referenceUid);
	}

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByGID_REF(long groupId,
		java.lang.String referenceUid, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByGID_REF(groupId, referenceUid, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where groupId = &#63; and referenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByGID_REF(long groupId,
		java.lang.String referenceUid)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByGID_REF(groupId, referenceUid);
	}

	/**
	* Returns the number of vr dossier files where groupId = &#63; and referenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public static int countByGID_REF(long groupId, java.lang.String referenceUid) {
		return getPersistence().countByGID_REF(groupId, referenceUid);
	}

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param fileEntryId the file entry ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByFILE_ID(long fileEntryId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByFILE_ID(fileEntryId);
	}

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByFILE_ID(long fileEntryId) {
		return getPersistence().fetchByFILE_ID(fileEntryId);
	}

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByFILE_ID(long fileEntryId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByFILE_ID(fileEntryId, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByFILE_ID(long fileEntryId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByFILE_ID(fileEntryId);
	}

	/**
	* Returns the number of vr dossier files where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching vr dossier files
	*/
	public static int countByFILE_ID(long fileEntryId) {
		return getPersistence().countByFILE_ID(fileEntryId);
	}

	/**
	* Returns all the vr dossier files where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the matching vr dossier files
	*/
	public static List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid) {
		return getPersistence().findByREF_UID(referenceUid);
	}

	/**
	* Returns a range of all the vr dossier files where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end) {
		return getPersistence().findByREF_UID(referenceUid, start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .findByREF_UID(referenceUid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossier files
	*/
	public static List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByREF_UID(referenceUid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByREF_UID_First(
		java.lang.String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByREF_UID_First(referenceUid, orderByComparator);
	}

	/**
	* Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByREF_UID_First(
		java.lang.String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByREF_UID_First(referenceUid, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByREF_UID_Last(
		java.lang.String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByREF_UID_Last(referenceUid, orderByComparator);
	}

	/**
	* Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByREF_UID_Last(
		java.lang.String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence()
				   .fetchByREF_UID_Last(referenceUid, orderByComparator);
	}

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile[] findByREF_UID_PrevAndNext(
		long dossierFileId, java.lang.String referenceUid,
		OrderByComparator<VRDossierFile> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence()
				   .findByREF_UID_PrevAndNext(dossierFileId, referenceUid,
			orderByComparator);
	}

	/**
	* Removes all the vr dossier files where referenceUid = &#63; from the database.
	*
	* @param referenceUid the reference uid
	*/
	public static void removeByREF_UID(java.lang.String referenceUid) {
		getPersistence().removeByREF_UID(referenceUid);
	}

	/**
	* Returns the number of vr dossier files where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public static int countByREF_UID(java.lang.String referenceUid) {
		return getPersistence().countByREF_UID(referenceUid);
	}

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public static VRDossierFile findByDossierFileId(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByDossierFileId(dossierFileId);
	}

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDossierFileId(long dossierFileId) {
		return getPersistence().fetchByDossierFileId(dossierFileId);
	}

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static VRDossierFile fetchByDossierFileId(long dossierFileId,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByDossierFileId(dossierFileId, retrieveFromCache);
	}

	/**
	* Removes the vr dossier file where dossierFileId = &#63; from the database.
	*
	* @param dossierFileId the dossier file ID
	* @return the vr dossier file that was removed
	*/
	public static VRDossierFile removeByDossierFileId(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().removeByDossierFileId(dossierFileId);
	}

	/**
	* Returns the number of vr dossier files where dossierFileId = &#63;.
	*
	* @param dossierFileId the dossier file ID
	* @return the number of matching vr dossier files
	*/
	public static int countByDossierFileId(long dossierFileId) {
		return getPersistence().countByDossierFileId(dossierFileId);
	}

	/**
	* Caches the vr dossier file in the entity cache if it is enabled.
	*
	* @param vrDossierFile the vr dossier file
	*/
	public static void cacheResult(VRDossierFile vrDossierFile) {
		getPersistence().cacheResult(vrDossierFile);
	}

	/**
	* Caches the vr dossier files in the entity cache if it is enabled.
	*
	* @param vrDossierFiles the vr dossier files
	*/
	public static void cacheResult(List<VRDossierFile> vrDossierFiles) {
		getPersistence().cacheResult(vrDossierFiles);
	}

	/**
	* Creates a new vr dossier file with the primary key. Does not add the vr dossier file to the database.
	*
	* @param dossierFileId the primary key for the new vr dossier file
	* @return the new vr dossier file
	*/
	public static VRDossierFile create(long dossierFileId) {
		return getPersistence().create(dossierFileId);
	}

	/**
	* Removes the vr dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file that was removed
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile remove(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().remove(dossierFileId);
	}

	public static VRDossierFile updateImpl(VRDossierFile vrDossierFile) {
		return getPersistence().updateImpl(vrDossierFile);
	}

	/**
	* Returns the vr dossier file with the primary key or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile findByPrimaryKey(long dossierFileId)
		throws com.fds.vr.business.exception.NoSuchVRDossierFileException {
		return getPersistence().findByPrimaryKey(dossierFileId);
	}

	/**
	* Returns the vr dossier file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file, or <code>null</code> if a vr dossier file with the primary key could not be found
	*/
	public static VRDossierFile fetchByPrimaryKey(long dossierFileId) {
		return getPersistence().fetchByPrimaryKey(dossierFileId);
	}

	public static java.util.Map<java.io.Serializable, VRDossierFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr dossier files.
	*
	* @return the vr dossier files
	*/
	public static List<VRDossierFile> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of vr dossier files
	*/
	public static List<VRDossierFile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr dossier files
	*/
	public static List<VRDossierFile> findAll(int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr dossier files
	*/
	public static List<VRDossierFile> findAll(int start, int end,
		OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr dossier files from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr dossier files.
	*
	* @return the number of vr dossier files
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRDossierFilePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRDossierFilePersistence, VRDossierFilePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRDossierFilePersistence.class);
}