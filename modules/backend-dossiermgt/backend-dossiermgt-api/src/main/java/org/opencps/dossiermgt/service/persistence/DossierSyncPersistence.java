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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.opencps.dossiermgt.exception.NoSuchDossierSyncException;
import org.opencps.dossiermgt.model.DossierSync;

/**
 * The persistence interface for the dossier sync service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.persistence.impl.DossierSyncPersistenceImpl
 * @see DossierSyncUtil
 * @generated
 */
@ProviderType
public interface DossierSyncPersistence extends BasePersistence<DossierSync> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierSyncUtil} to access the dossier sync persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossier syncs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByUuid(java.lang.String uuid);

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
	public java.util.List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where uuid = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync[] findByUuid_PrevAndNext(long dossierSyncId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of dossier syncs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dossier syncs
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierSyncException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierSyncException;

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the dossier sync where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier sync where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dossier sync that was removed
	*/
	public DossierSync removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierSyncException;

	/**
	* Returns the number of dossier syncs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dossier syncs
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public DossierSync[] findByUuid_C_PrevAndNext(long dossierSyncId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of dossier syncs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dossier syncs
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

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
	public DossierSync findByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid)
		throws NoSuchDossierSyncException;

	/**
	* Returns the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid);

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
	public DossierSync fetchByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid,
		boolean retrieveFromCache);

	/**
	* Removes the dossier sync where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the dossier sync that was removed
	*/
	public DossierSync removeByF_D_M_CPK_FR(long dossierId, int method,
		long classPK, java.lang.String fileReferenceUid)
		throws NoSuchDossierSyncException;

	/**
	* Returns the number of dossier syncs where dossierId = &#63; and method = &#63; and classPK = &#63; and fileReferenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param method the method
	* @param classPK the class pk
	* @param fileReferenceUid the file reference uid
	* @return the number of matching dossier syncs
	*/
	public int countByF_D_M_CPK_FR(long dossierId, int method, long classPK,
		java.lang.String fileReferenceUid);

	/**
	* Returns all the dossier syncs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByG_ID(long groupId);

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
	public java.util.List<DossierSync> findByG_ID(long groupId, int start,
		int end);

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
	public java.util.List<DossierSync> findByG_ID(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByG_ID(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where groupId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync[] findByG_ID_PrevAndNext(long dossierSyncId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG_ID(long groupId);

	/**
	* Returns the number of dossier syncs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching dossier syncs
	*/
	public int countByG_ID(long groupId);

	/**
	* Returns all the dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId);

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
	public java.util.List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end);

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
	public java.util.List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByG_ID_DID(long groupId,
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public DossierSync[] findByG_ID_DID_PrevAndNext(long dossierSyncId,
		long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	*/
	public void removeByG_ID_DID(long groupId, long dossierId);

	/**
	* Returns the number of dossier syncs where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching dossier syncs
	*/
	public int countByG_ID_DID(long groupId, long dossierId);

	/**
	* Returns all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid);

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
	public java.util.List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end);

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
	public java.util.List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_DRF_First(long groupId,
		java.lang.String dossierReferenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_DRF_First(long groupId,
		java.lang.String dossierReferenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByG_ID_DRF_Last(long groupId,
		java.lang.String dossierReferenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByG_ID_DRF_Last(long groupId,
		java.lang.String dossierReferenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public DossierSync[] findByG_ID_DRF_PrevAndNext(long dossierSyncId,
		long groupId, java.lang.String dossierReferenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where groupId = &#63; and dossierReferenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	*/
	public void removeByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid);

	/**
	* Returns the number of dossier syncs where groupId = &#63; and dossierReferenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param dossierReferenceUid the dossier reference uid
	* @return the number of matching dossier syncs
	*/
	public int countByG_ID_DRF(long groupId,
		java.lang.String dossierReferenceUid);

	/**
	* Returns all the dossier syncs where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findBySRV_NO(java.lang.String serverNo);

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
	public java.util.List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end);

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
	public java.util.List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findBySRV_NO(java.lang.String serverNo,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findBySRV_NO_First(java.lang.String serverNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchBySRV_NO_First(java.lang.String serverNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findBySRV_NO_Last(java.lang.String serverNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchBySRV_NO_Last(java.lang.String serverNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where serverNo = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param serverNo the server no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync[] findBySRV_NO_PrevAndNext(long dossierSyncId,
		java.lang.String serverNo,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where serverNo = &#63; from the database.
	*
	* @param serverNo the server no
	*/
	public void removeBySRV_NO(java.lang.String serverNo);

	/**
	* Returns the number of dossier syncs where serverNo = &#63;.
	*
	* @param serverNo the server no
	* @return the number of matching dossier syncs
	*/
	public int countBySRV_NO(java.lang.String serverNo);

	/**
	* Returns all the dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state);

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
	public java.util.List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end);

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
	public java.util.List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findBySRV_NO_STATE(
		java.lang.String serverNo, int state, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findBySRV_NO_STATE_First(java.lang.String serverNo,
		int state,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchBySRV_NO_STATE_First(java.lang.String serverNo,
		int state,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findBySRV_NO_STATE_Last(java.lang.String serverNo,
		int state,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchBySRV_NO_STATE_Last(java.lang.String serverNo,
		int state,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public DossierSync[] findBySRV_NO_STATE_PrevAndNext(long dossierSyncId,
		java.lang.String serverNo, int state,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where serverNo = &#63; and state = &#63; from the database.
	*
	* @param serverNo the server no
	* @param state the state
	*/
	public void removeBySRV_NO_STATE(java.lang.String serverNo, int state);

	/**
	* Returns the number of dossier syncs where serverNo = &#63; and state = &#63;.
	*
	* @param serverNo the server no
	* @param state the state
	* @return the number of matching dossier syncs
	*/
	public int countBySRV_NO_STATE(java.lang.String serverNo, int state);

	/**
	* Returns all the dossier syncs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching dossier syncs
	*/
	public java.util.List<DossierSync> findByDossierId(long dossierId);

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
	public java.util.List<DossierSync> findByDossierId(long dossierId,
		int start, int end);

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
	public java.util.List<DossierSync> findByDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findByDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the first dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the last dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync
	* @throws NoSuchDossierSyncException if a matching dossier sync could not be found
	*/
	public DossierSync findByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Returns the last dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public DossierSync fetchByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

	/**
	* Returns the dossier syncs before and after the current dossier sync in the ordered set where dossierId = &#63;.
	*
	* @param dossierSyncId the primary key of the current dossier sync
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync[] findByDossierId_PrevAndNext(long dossierSyncId,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator)
		throws NoSuchDossierSyncException;

	/**
	* Removes all the dossier syncs where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByDossierId(long dossierId);

	/**
	* Returns the number of dossier syncs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching dossier syncs
	*/
	public int countByDossierId(long dossierId);

	/**
	* Caches the dossier sync in the entity cache if it is enabled.
	*
	* @param dossierSync the dossier sync
	*/
	public void cacheResult(DossierSync dossierSync);

	/**
	* Caches the dossier syncs in the entity cache if it is enabled.
	*
	* @param dossierSyncs the dossier syncs
	*/
	public void cacheResult(java.util.List<DossierSync> dossierSyncs);

	/**
	* Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	*
	* @param dossierSyncId the primary key for the new dossier sync
	* @return the new dossier sync
	*/
	public DossierSync create(long dossierSyncId);

	/**
	* Removes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync that was removed
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync remove(long dossierSyncId)
		throws NoSuchDossierSyncException;

	public DossierSync updateImpl(DossierSync dossierSync);

	/**
	* Returns the dossier sync with the primary key or throws a {@link NoSuchDossierSyncException} if it could not be found.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync
	* @throws NoSuchDossierSyncException if a dossier sync with the primary key could not be found
	*/
	public DossierSync findByPrimaryKey(long dossierSyncId)
		throws NoSuchDossierSyncException;

	/**
	* Returns the dossier sync with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync, or <code>null</code> if a dossier sync with the primary key could not be found
	*/
	public DossierSync fetchByPrimaryKey(long dossierSyncId);

	@Override
	public java.util.Map<java.io.Serializable, DossierSync> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dossier syncs.
	*
	* @return the dossier syncs
	*/
	public java.util.List<DossierSync> findAll();

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
	public java.util.List<DossierSync> findAll(int start, int end);

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
	public java.util.List<DossierSync> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator);

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
	public java.util.List<DossierSync> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DossierSync> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dossier syncs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dossier syncs.
	*
	* @return the number of dossier syncs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}