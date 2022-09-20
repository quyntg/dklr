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

import org.opencps.dossiermgt.exception.NoSuchDossierException;
import org.opencps.dossiermgt.model.Dossier;

/**
 * The persistence interface for the dossier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.persistence.impl.DossierPersistenceImpl
 * @see DossierUtil
 * @generated
 */
@ProviderType
public interface DossierPersistence extends BasePersistence<Dossier> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierUtil} to access the dossier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where uuid = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByUuid_PrevAndNext(long dossierId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dossiers
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the dossier where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDossierException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierException;

	/**
	* Returns the dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dossier where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dossier that was removed
	*/
	public Dossier removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDossierException;

	/**
	* Returns the number of dossiers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dossiers
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByUuid_C_PrevAndNext(long dossierId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dossiers
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_UID(long groupId, long userId);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_UID(long groupId, long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_UID(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_UID(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByG_UID_PrevAndNext(long dossierId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByG_UID(long groupId, long userId);

	/**
	* Returns the number of dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching dossiers
	*/
	public int countByG_UID(long groupId, long userId);

	/**
	* Returns the dossier where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchDossierException} if it could not be found.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_REF(long groupId, java.lang.String referenceUid)
		throws NoSuchDossierException;

	/**
	* Returns the dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_REF(long groupId, java.lang.String referenceUid);

	/**
	* Returns the dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_REF(long groupId, java.lang.String referenceUid,
		boolean retrieveFromCache);

	/**
	* Removes the dossier where groupId = &#63; and referenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the dossier that was removed
	*/
	public Dossier removeByG_REF(long groupId, java.lang.String referenceUid)
		throws NoSuchDossierException;

	/**
	* Returns the number of dossiers where groupId = &#63; and referenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the number of matching dossiers
	*/
	public int countByG_REF(long groupId, java.lang.String referenceUid);

	/**
	* Returns all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_SC(long groupId,
		java.lang.String serviceCode);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_SC_First(long groupId, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_SC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_SC_Last(long groupId, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_SC_Last(long groupId, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByG_SC_PrevAndNext(long dossierId, long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public void removeByG_SC(long groupId, java.lang.String serviceCode);

	/**
	* Returns the number of dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching dossiers
	*/
	public int countByG_SC(long groupId, java.lang.String serviceCode);

	/**
	* Returns all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_GAC(long groupId,
		java.lang.String serviceCode);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_GAC_Last(long groupId, java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_GAC_Last(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByG_GAC_PrevAndNext(long dossierId, long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public void removeByG_GAC(long groupId, java.lang.String serviceCode);

	/**
	* Returns the number of dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching dossiers
	*/
	public int countByG_GAC(long groupId, java.lang.String serviceCode);

	/**
	* Returns all the dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByG_DTN_PrevAndNext(long dossierId, long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and dossierTemplateNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	*/
	public void removeByG_DTN(long groupId, java.lang.String dossierTemplateNo);

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the number of matching dossiers
	*/
	public int countByG_DTN(long groupId, java.lang.String dossierTemplateNo);

	/**
	* Returns all the dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_DID(long groupId, long dossierId);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DID(long groupId, long dossierId,
		int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DID(long groupId, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_DID(long groupId, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Removes all the dossiers where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	*/
	public void removeByG_DID(long groupId, long dossierId);

	/**
	* Returns the number of dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching dossiers
	*/
	public int countByG_DID(long groupId, long dossierId);

	/**
	* Returns all the dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(long dossierId,
		long groupId, long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	*/
	public void removeByG_C_GAC_SC_DTNO_NOTDS(long groupId, long companyId,
		java.lang.String govAgencyCode, java.lang.String serviceCode,
		java.lang.String dossierTemplateNo, java.lang.String dossierStatus);

	/**
	* Returns the number of dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	*/
	public int countByG_C_GAC_SC_DTNO_NOTDS(long groupId, long companyId,
		java.lang.String govAgencyCode, java.lang.String serviceCode,
		java.lang.String dossierTemplateNo, java.lang.String dossierStatus);

	/**
	* Returns all the dossiers where submitting = &#63;.
	*
	* @param submitting the submitting
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findBySUB_MIT(boolean submitting);

	/**
	* Returns a range of all the dossiers where submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param submitting the submitting
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findBySUB_MIT(boolean submitting, int start,
		int end);

	/**
	* Returns an ordered range of all the dossiers where submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param submitting the submitting
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findBySUB_MIT(boolean submitting, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where submitting = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param submitting the submitting
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findBySUB_MIT(boolean submitting, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where submitting = &#63;.
	*
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findBySUB_MIT_First(boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where submitting = &#63;.
	*
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchBySUB_MIT_First(boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where submitting = &#63;.
	*
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findBySUB_MIT_Last(boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where submitting = &#63;.
	*
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchBySUB_MIT_Last(boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where submitting = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param submitting the submitting
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findBySUB_MIT_PrevAndNext(long dossierId,
		boolean submitting,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where submitting = &#63; from the database.
	*
	* @param submitting the submitting
	*/
	public void removeBySUB_MIT(boolean submitting);

	/**
	* Returns the number of dossiers where submitting = &#63;.
	*
	* @param submitting the submitting
	* @return the number of matching dossiers
	*/
	public int countBySUB_MIT(boolean submitting);

	/**
	* Returns all the dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @return the matching dossiers
	*/
	public java.util.List<Dossier> findByF_GID_SC_DS(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus);

	/**
	* Returns a range of all the dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of matching dossiers
	*/
	public java.util.List<Dossier> findByF_GID_SC_DS(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		int start, int end);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByF_GID_SC_DS(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dossiers
	*/
	public java.util.List<Dossier> findByF_GID_SC_DS(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByF_GID_SC_DS_First(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the first dossier in the ordered set where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByF_GID_SC_DS_First(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier
	* @throws NoSuchDossierException if a matching dossier could not be found
	*/
	public Dossier findByF_GID_SC_DS_Last(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Returns the last dossier in the ordered set where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	public Dossier fetchByF_GID_SC_DS_Last(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns the dossiers before and after the current dossier in the ordered set where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param dossierId the primary key of the current dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier[] findByF_GID_SC_DS_PrevAndNext(long dossierId,
		long groupId, java.lang.String serviceCode,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator)
		throws NoSuchDossierException;

	/**
	* Removes all the dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	*/
	public void removeByF_GID_SC_DS(long groupId, java.lang.String serviceCode,
		java.lang.String dossierStatus);

	/**
	* Returns the number of dossiers where groupId = &#63; and serviceCode = &#63; and dossierStatus = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param dossierStatus the dossier status
	* @return the number of matching dossiers
	*/
	public int countByF_GID_SC_DS(long groupId, java.lang.String serviceCode,
		java.lang.String dossierStatus);

	/**
	* Caches the dossier in the entity cache if it is enabled.
	*
	* @param dossier the dossier
	*/
	public void cacheResult(Dossier dossier);

	/**
	* Caches the dossiers in the entity cache if it is enabled.
	*
	* @param dossiers the dossiers
	*/
	public void cacheResult(java.util.List<Dossier> dossiers);

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public Dossier create(long dossierId);

	/**
	* Removes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier remove(long dossierId) throws NoSuchDossierException;

	public Dossier updateImpl(Dossier dossier);

	/**
	* Returns the dossier with the primary key or throws a {@link NoSuchDossierException} if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws NoSuchDossierException if a dossier with the primary key could not be found
	*/
	public Dossier findByPrimaryKey(long dossierId)
		throws NoSuchDossierException;

	/**
	* Returns the dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier, or <code>null</code> if a dossier with the primary key could not be found
	*/
	public Dossier fetchByPrimaryKey(long dossierId);

	@Override
	public java.util.Map<java.io.Serializable, Dossier> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dossiers.
	*
	* @return the dossiers
	*/
	public java.util.List<Dossier> findAll();

	/**
	* Returns a range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of dossiers
	*/
	public java.util.List<Dossier> findAll(int start, int end);

	/**
	* Returns an ordered range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dossiers
	*/
	public java.util.List<Dossier> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator);

	/**
	* Returns an ordered range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dossiers
	*/
	public java.util.List<Dossier> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dossiers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}