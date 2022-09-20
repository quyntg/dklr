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

import com.fds.vr.business.exception.NoSuchVRDossierException;
import com.fds.vr.business.model.VRDossier;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr dossier service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRDossierPersistenceImpl
 * @see VRDossierUtil
 * @generated
 */
@ProviderType
public interface VRDossierPersistence extends BasePersistence<VRDossier> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRDossierUtil} to access the vr dossier persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByUuid_PrevAndNext(long dossierId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of vr dossiers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr dossiers
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRDossierException;

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the vr dossier where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr dossier that was removed
	*/
	public VRDossier removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRDossierException;

	/**
	* Returns the number of vr dossiers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr dossiers
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByUuid_C_PrevAndNext(long dossierId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of vr dossiers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr dossiers
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_UID(long groupId, long userId);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_UID(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_UID_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_UID_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByG_UID_PrevAndNext(long dossierId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByG_UID(long groupId, long userId);

	/**
	* Returns the number of vr dossiers where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching vr dossiers
	*/
	public int countByG_UID(long groupId, long userId);

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_REF(long groupId, java.lang.String referenceUid)
		throws NoSuchVRDossierException;

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_REF(long groupId, java.lang.String referenceUid);

	/**
	* Returns the vr dossier where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_REF(long groupId, java.lang.String referenceUid,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier where groupId = &#63; and referenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the vr dossier that was removed
	*/
	public VRDossier removeByG_REF(long groupId, java.lang.String referenceUid)
		throws NoSuchVRDossierException;

	/**
	* Returns the number of vr dossiers where groupId = &#63; and referenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossiers
	*/
	public int countByG_REF(long groupId, java.lang.String referenceUid);

	/**
	* Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_SC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_SC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_SC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_SC_Last(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_SC_Last(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByG_SC_PrevAndNext(long dossierId, long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public void removeByG_SC(long groupId, java.lang.String serviceCode);

	/**
	* Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching vr dossiers
	*/
	public int countByG_SC(long groupId, java.lang.String serviceCode);

	/**
	* Returns all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_GAC(long groupId,
		java.lang.String serviceCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_GAC_First(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_GAC_Last(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_GAC_Last(long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and serviceCode = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param serviceCode the service code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByG_GAC_PrevAndNext(long dossierId, long groupId,
		java.lang.String serviceCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where groupId = &#63; and serviceCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	*/
	public void removeByG_GAC(long groupId, java.lang.String serviceCode);

	/**
	* Returns the number of vr dossiers where groupId = &#63; and serviceCode = &#63;.
	*
	* @param groupId the group ID
	* @param serviceCode the service code
	* @return the number of matching vr dossiers
	*/
	public int countByG_GAC(long groupId, java.lang.String serviceCode);

	/**
	* Returns all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DTN(long groupId,
		java.lang.String dossierTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_DTN_First(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_DTN_Last(long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByG_DTN_PrevAndNext(long dossierId, long groupId,
		java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where groupId = &#63; and dossierTemplateNo = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	*/
	public void removeByG_DTN(long groupId, java.lang.String dossierTemplateNo);

	/**
	* Returns the number of vr dossiers where groupId = &#63; and dossierTemplateNo = &#63;.
	*
	* @param groupId the group ID
	* @param dossierTemplateNo the dossier template no
	* @return the number of matching vr dossiers
	*/
	public int countByG_DTN(long groupId, java.lang.String dossierTemplateNo);

	/**
	* Returns all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DID(long groupId, long dossierId);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_DID(long groupId, long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_DID_First(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_DID_Last(long groupId, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Removes all the vr dossiers where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	*/
	public void removeByG_DID(long groupId, long dossierId);

	/**
	* Returns the number of vr dossiers where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching vr dossiers
	*/
	public int countByG_DID(long groupId, long dossierId);

	/**
	* Returns all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus);

	/**
	* Returns a range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr dossiers
	*/
	public java.util.List<VRDossier> findByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the first vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_First(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier
	* @throws NoSuchVRDossierException if a matching vr dossier could not be found
	*/
	public VRDossier findByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Returns the last vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public VRDossier fetchByG_C_GAC_SC_DTNO_NOTDS_Last(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns the vr dossiers before and after the current vr dossier in the ordered set where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param dossierId the primary key of the current vr dossier
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier[] findByG_C_GAC_SC_DTNO_NOTDS_PrevAndNext(long dossierId,
		long groupId, long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator)
		throws NoSuchVRDossierException;

	/**
	* Removes all the vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63; from the database.
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
	* Returns the number of vr dossiers where groupId = &#63; and companyId = &#63; and govAgencyCode = &#63; and serviceCode = &#63; and dossierTemplateNo = &#63; and dossierStatus &ne; &#63;.
	*
	* @param groupId the group ID
	* @param companyId the company ID
	* @param govAgencyCode the gov agency code
	* @param serviceCode the service code
	* @param dossierTemplateNo the dossier template no
	* @param dossierStatus the dossier status
	* @return the number of matching vr dossiers
	*/
	public int countByG_C_GAC_SC_DTNO_NOTDS(long groupId, long companyId,
		java.lang.String govAgencyCode, java.lang.String serviceCode,
		java.lang.String dossierTemplateNo, java.lang.String dossierStatus);

	/**
	* Caches the vr dossier in the entity cache if it is enabled.
	*
	* @param vrDossier the vr dossier
	*/
	public void cacheResult(VRDossier vrDossier);

	/**
	* Caches the vr dossiers in the entity cache if it is enabled.
	*
	* @param vrDossiers the vr dossiers
	*/
	public void cacheResult(java.util.List<VRDossier> vrDossiers);

	/**
	* Creates a new vr dossier with the primary key. Does not add the vr dossier to the database.
	*
	* @param dossierId the primary key for the new vr dossier
	* @return the new vr dossier
	*/
	public VRDossier create(long dossierId);

	/**
	* Removes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier that was removed
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier remove(long dossierId) throws NoSuchVRDossierException;

	public VRDossier updateImpl(VRDossier vrDossier);

	/**
	* Returns the vr dossier with the primary key or throws a {@link NoSuchVRDossierException} if it could not be found.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier
	* @throws NoSuchVRDossierException if a vr dossier with the primary key could not be found
	*/
	public VRDossier findByPrimaryKey(long dossierId)
		throws NoSuchVRDossierException;

	/**
	* Returns the vr dossier with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier, or <code>null</code> if a vr dossier with the primary key could not be found
	*/
	public VRDossier fetchByPrimaryKey(long dossierId);

	@Override
	public java.util.Map<java.io.Serializable, VRDossier> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr dossiers.
	*
	* @return the vr dossiers
	*/
	public java.util.List<VRDossier> findAll();

	/**
	* Returns a range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of vr dossiers
	*/
	public java.util.List<VRDossier> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr dossiers
	*/
	public java.util.List<VRDossier> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator);

	/**
	* Returns an ordered range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr dossiers
	*/
	public java.util.List<VRDossier> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossier> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr dossiers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr dossiers.
	*
	* @return the number of vr dossiers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}