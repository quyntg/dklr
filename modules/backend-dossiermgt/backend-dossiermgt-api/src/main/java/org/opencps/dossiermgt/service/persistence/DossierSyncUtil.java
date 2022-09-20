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

package org.opencps.dossiermgt.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.DossierSync;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the dossier sync service. This utility wraps {@link org.opencps.dossiermgt.service.persistence.impl.DossierSyncPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DossierSyncPersistence
 * @see org.opencps.dossiermgt.service.persistence.impl.DossierSyncPersistenceImpl
 * @generated
 */
@ProviderType
public class DossierSyncUtil {
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
	public static void clearCache(DossierSync dossierSync) {
		getPersistence().clearCache(dossierSync);
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
	public static List<DossierSync> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DossierSync> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DossierSync> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DossierSync update(DossierSync dossierSync) {
		return getPersistence().update(dossierSync);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DossierSync update(DossierSync dossierSync,
		ServiceContext serviceContext) {
		return getPersistence().update(dossierSync, serviceContext);
	}

	/**
	* Returns all the dossier syncs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the dossier syncs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByUuid_First(java.lang.String uuid,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByUuid_Last(java.lang.String uuid,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where uuid = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByUuid_PrevAndNext(long dossierSyncId,
		java.lang.String uuid, OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByUuid_PrevAndNext(dossierSyncId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the dossier syncs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of dossier syncs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dossier syncs
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierSyncException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByUUID_G(java.lang.String uuid, long groupId)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the dossier sync where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dossier sync that was removed
	*/
	public static DossierSync removeByUUID_G(java.lang.String uuid, long groupId)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of dossier syncs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dossier syncs
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByUuid_C_PrevAndNext(long dossierSyncId,
		java.lang.String uuid, long companyId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(dossierSyncId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dossier syncs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dossier syncs
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or throws a {@link NoSuchDossierSyncException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid);
	}

	/**
	* Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid) {
		return getPersistence()
				   .fetchByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid);
	}

	/**
	* Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid, retrieveFromCache);
	}

	/**
	* Removes the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the dossier sync that was removed
	*/
	public static DossierSync removeByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .removeByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid);
	}

	/**
	* Returns the number of dossier syncs where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the number of matching dossier syncs
	*/
	public static int countByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid) {
		return getPersistence()
				   .countByF_D_M_CPK_FR(dossierId, method, classPK,
			fileReferenceUid);
	}

	/**
	* Returns all the dossier syncs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID(long groupId) {
		return getPersistence().findByG_ID(groupId);
	}

	/**
	* Returns a range of all the dossier syncs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID(long groupId, int start, int end) {
		return getPersistence().findByG_ID(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID(long groupId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findByG_ID(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID(long groupId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_ID(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_First(long groupId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByG_ID_First(groupId, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_First(long groupId,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchByG_ID_First(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_Last(long groupId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByG_ID_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_Last(long groupId,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchByG_ID_Last(groupId, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByG_ID_PrevAndNext(long dossierSyncId,
		long groupId, OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_PrevAndNext(dossierSyncId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the dossier syncs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByG_ID(long groupId) {
		getPersistence().removeByG_ID(groupId);
	}

	/**
	* Returns the number of dossier syncs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossier syncs
	*/
	public static int countByG_ID(long groupId) {
		return getPersistence().countByG_ID(groupId);
	}

	/**
	* Returns all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DID(long groupId, long dossierId) {
		return getPersistence().findByG_ID_DID(groupId, dossierId);
	}

	/**
	* Returns a range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end) {
		return getPersistence().findByG_ID_DID(groupId, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findByG_ID_DID(groupId, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_ID_DID(groupId, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_DID_First(long groupId,
		long dossierId, OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DID_First(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_DID_First(long groupId,
		long dossierId, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByG_ID_DID_First(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_DID_Last(long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DID_Last(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_DID_Last(long groupId,
		long dossierId, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByG_ID_DID_Last(groupId, dossierId, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByG_ID_DID_PrevAndNext(long dossierSyncId,
		long groupId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DID_PrevAndNext(dossierSyncId, groupId,
			dossierId, orderByComparator);
	}

	/**
	* Removes all the dossier syncs where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	*/
	public static void removeByG_ID_DID(long groupId, long dossierId) {
		getPersistence().removeByG_ID_DID(groupId, dossierId);
	}

	/**
	* Returns the number of dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching dossier syncs
	*/
	public static int countByG_ID_DID(long groupId, long dossierId) {
		return getPersistence().countByG_ID_DID(groupId, dossierId);
	}

	/**
	* Returns all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid) {
		return getPersistence().findByG_ID_DRF(groupId, dossierReferenceUid);
	}

	/**
	* Returns a range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end) {
		return getPersistence()
				   .findByG_ID_DRF(groupId, dossierReferenceUid, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findByG_ID_DRF(groupId, dossierReferenceUid, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_ID_DRF(groupId, dossierReferenceUid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_DRF_First(long groupId,
		java.lang.String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DRF_First(groupId, dossierReferenceUid,
			orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_DRF_First(long groupId,
		java.lang.String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByG_ID_DRF_First(groupId, dossierReferenceUid,
			orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByG_ID_DRF_Last(long groupId,
		java.lang.String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DRF_Last(groupId, dossierReferenceUid,
			orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByG_ID_DRF_Last(long groupId,
		java.lang.String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByG_ID_DRF_Last(groupId, dossierReferenceUid,
			orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByG_ID_DRF_PrevAndNext(long dossierSyncId,
		long groupId, java.lang.String dossierReferenceUid,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByG_ID_DRF_PrevAndNext(dossierSyncId, groupId,
			dossierReferenceUid, orderByComparator);
	}

	/**
	* Removes all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	*/
	public static void removeByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid) {
		getPersistence().removeByG_ID_DRF(groupId, dossierReferenceUid);
	}

	/**
	* Returns the number of dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @return the number of matching dossier syncs
	*/
	public static int countByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid) {
		return getPersistence().countByG_ID_DRF(groupId, dossierReferenceUid);
	}

	/**
	* Returns all the dossier syncs where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO(java.lang.String serverNo) {
		return getPersistence().findBySRV_NO(serverNo);
	}

	/**
	* Returns a range of all the dossier syncs where serverNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end) {
		return getPersistence().findBySRV_NO(serverNo, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where serverNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findBySRV_NO(serverNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where serverNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySRV_NO(serverNo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findBySRV_NO_First(java.lang.String serverNo,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findBySRV_NO_First(serverNo, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchBySRV_NO_First(java.lang.String serverNo,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchBySRV_NO_First(serverNo, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findBySRV_NO_Last(java.lang.String serverNo,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findBySRV_NO_Last(serverNo, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchBySRV_NO_Last(java.lang.String serverNo,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().fetchBySRV_NO_Last(serverNo, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findBySRV_NO_PrevAndNext(long dossierSyncId,
		java.lang.String serverNo,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findBySRV_NO_PrevAndNext(dossierSyncId, serverNo,
			orderByComparator);
	}

	/**
	* Removes all the dossier syncs where serverNo = &#63; from the database.
	*
	* @param serverNo the server no
	*/
	public static void removeBySRV_NO(java.lang.String serverNo) {
		getPersistence().removeBySRV_NO(serverNo);
	}

	/**
	* Returns the number of dossier syncs where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @return the number of matching dossier syncs
	*/
	public static int countBySRV_NO(java.lang.String serverNo) {
		return getPersistence().countBySRV_NO(serverNo);
	}

	/**
	* Returns all the dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state) {
		return getPersistence().findBySRV_NO_STATE(serverNo, state);
	}

	/**
	* Returns a range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param state the state
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end) {
		return getPersistence().findBySRV_NO_STATE(serverNo, state, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param state the state
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findBySRV_NO_STATE(serverNo, state, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param serverNo the server no
	* @param state the state
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySRV_NO_STATE(serverNo, state, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findBySRV_NO_STATE_First(
		java.lang.String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findBySRV_NO_STATE_First(serverNo, state, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchBySRV_NO_STATE_First(
		java.lang.String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchBySRV_NO_STATE_First(serverNo, state, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findBySRV_NO_STATE_Last(
		java.lang.String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findBySRV_NO_STATE_Last(serverNo, state, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchBySRV_NO_STATE_Last(
		java.lang.String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchBySRV_NO_STATE_Last(serverNo, state, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findBySRV_NO_STATE_PrevAndNext(
		long dossierSyncId, java.lang.String serverNo, int state,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findBySRV_NO_STATE_PrevAndNext(dossierSyncId, serverNo,
			state, orderByComparator);
	}

	/**
	* Removes all the dossier syncs where serverNo = &#63; and state = &#63; from the database.
	*
	* @param serverNo the server no
	* @param state the state
	*/
	public static void removeBySRV_NO_STATE(java.lang.String serverNo, int state) {
		getPersistence().removeBySRV_NO_STATE(serverNo, state);
	}

	/**
	* Returns the number of dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @return the number of matching dossier syncs
	*/
	public static int countBySRV_NO_STATE(java.lang.String serverNo, int state) {
		return getPersistence().countBySRV_NO_STATE(serverNo, state);
	}

	/**
	* Returns all the dossier syncs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier syncs
	*/
	public static List<DossierSync> findByDossierId(long dossierId) {
		return getPersistence().findByDossierId(dossierId);
	}

	/**
	* Returns a range of all the dossier syncs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of matching dossier syncs
	*/
	public static List<DossierSync> findByDossierId(long dossierId, int start,
		int end) {
		return getPersistence().findByDossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByDossierId(long dossierId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossier syncs
	*/
	public static List<DossierSync> findByDossierId(long dossierId, int start,
		int end, OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByDossierId_First(long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByDossierId_First(long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public static DossierSync findByDossierId_Last(long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static DossierSync fetchByDossierId_Last(long dossierId,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync[] findByDossierId_PrevAndNext(
		long dossierSyncId, long dossierId,
		OrderByComparator<DossierSync> orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(dossierSyncId, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the dossier syncs where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeByDossierId(long dossierId) {
		getPersistence().removeByDossierId(dossierId);
	}

	/**
	* Returns the number of dossier syncs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier syncs
	*/
	public static int countByDossierId(long dossierId) {
		return getPersistence().countByDossierId(dossierId);
	}

	/**
	* Caches the dossier sync in the entity cache if it is enabled.
	*
	* @param dossierSync the dossier sync
	*/
	public static void cacheResult(DossierSync dossierSync) {
		getPersistence().cacheResult(dossierSync);
	}

	/**
	* Caches the dossier syncs in the entity cache if it is enabled.
	*
	* @param dossierSyncs the dossier syncs
	*/
	public static void cacheResult(List<DossierSync> dossierSyncs) {
		getPersistence().cacheResult(dossierSyncs);
	}

	/**
	* Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	*
	* @param dossierSyncId the primary key for the new dossier sync
	* @return the new dossier sync
	*/
	public static DossierSync create(long dossierSyncId) {
		return getPersistence().create(dossierSyncId);
	}

	/**
	* Removes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync that was removed
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync remove(long dossierSyncId)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().remove(dossierSyncId);
	}

	public static DossierSync updateImpl(DossierSync dossierSync) {
		return getPersistence().updateImpl(dossierSync);
	}

	/**
	* Returns the dossier sync with the primary key or throws a {@link NoSuchDossierSyncException} if it could not be found.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public static DossierSync findByPrimaryKey(long dossierSyncId)
		throws org.opencps.dossiermgt.exception.NoSuchDossierSyncException {
		return getPersistence().findByPrimaryKey(dossierSyncId);
	}

	/**
	* Returns the dossier sync with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync, or <code>null</code> if a dossier sync with the primary key could not be found
	*/
	public static DossierSync fetchByPrimaryKey(long dossierSyncId) {
		return getPersistence().fetchByPrimaryKey(dossierSyncId);
	}

	public static java.util.Map<java.io.Serializable, DossierSync> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the dossier syncs.
	*
	* @return the dossier syncs
	*/
	public static List<DossierSync> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dossier syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of dossier syncs
	*/
	public static List<DossierSync> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dossier syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossier syncs
	*/
	public static List<DossierSync> findAll(int start, int end,
		OrderByComparator<DossierSync> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dossier syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dossier syncs
	*/
	public static List<DossierSync> findAll(int start, int end,
		OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the dossier syncs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dossier syncs.
	*
	* @return the number of dossier syncs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DossierSyncPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DossierSyncPersistence, DossierSyncPersistence> _serviceTracker =
		ServiceTrackerFactory.open(DossierSyncPersistence.class);
}