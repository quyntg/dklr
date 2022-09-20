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

import com.fds.vr.business.exception.NoSuchVRDossierFileException;
import com.fds.vr.business.model.VRDossierFile;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr dossier file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRDossierFilePersistenceImpl
 * @see VRDossierFileUtil
 * @generated
 */
@ProviderType
public interface VRDossierFilePersistence extends BasePersistence<VRDossierFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRDossierFileUtil} to access the vr dossier file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr dossier files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByUuid(java.lang.String uuid);

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
	public java.util.List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where uuid = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile[] findByUuid_PrevAndNext(long dossierFileId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of vr dossier files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching vr dossier files
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the vr dossier file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching vr dossier files
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByUuid_C_PrevAndNext(long dossierFileId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of vr dossier files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching vr dossier files
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo);

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
	public java.util.List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDID_FTN_First(long dossierId,
		java.lang.String fileTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_FTN_First(long dossierId,
		java.lang.String fileTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDID_FTN_Last(long dossierId,
		java.lang.String fileTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_FTN_Last(long dossierId,
		java.lang.String fileTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_FTN_PrevAndNext(long dossierFileId,
		long dossierId, java.lang.String fileTemplateNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	*/
	public void removeByDID_FTN(long dossierId, java.lang.String fileTemplateNo);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @return the number of matching vr dossier files
	*/
	public int countByDID_FTN(long dossierId, java.lang.String fileTemplateNo);

	/**
	* Returns all the vr dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_(long dossierId);

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
	public java.util.List<VRDossierFile> findByDID_(long dossierId, int start,
		int end);

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
	public java.util.List<VRDossierFile> findByDID_(long dossierId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_(long dossierId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDID__First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID__First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDID__Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID__Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where dossierId = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile[] findByDID__PrevAndNext(long dossierFileId,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByDID_(long dossierId);

	/**
	* Returns the number of vr dossier files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr dossier files
	*/
	public int countByDID_(long dossierId);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed);

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
	public java.util.List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDossierId(long dossierId,
		boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDossierId_First(long dossierId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDossierId_First(long dossierId,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDossierId_Last(long dossierId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDossierId_Last(long dossierId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDossierId_PrevAndNext(long dossierFileId,
		long dossierId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	*/
	public void removeByDossierId(long dossierId, boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByDossierId(long dossierId, boolean removed);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed);

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
	public java.util.List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByD_DPT(long dossierId,
		int dossierPartType, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByD_DPT_First(long dossierId, int dossierPartType,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByD_DPT_First(long dossierId,
		int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByD_DPT_Last(long dossierId, int dossierPartType,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByD_DPT_Last(long dossierId, int dossierPartType,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByD_DPT_PrevAndNext(long dossierFileId,
		long dossierId, int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	*/
	public void removeByD_DPT(long dossierId, int dossierPartType,
		boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByD_DPT(long dossierId, int dossierPartType, boolean removed);

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed);

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean removed)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByD_RUID(long dossierId, java.lang.String referenceUid,
		boolean removed);

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDID_REF(long dossierId,
		java.lang.String referenceUid) throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_REF(long dossierId,
		java.lang.String referenceUid);

	/**
	* Returns the vr dossier file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_REF(long dossierId,
		java.lang.String referenceUid, boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where dossierId = &#63; and referenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByDID_REF(long dossierId,
		java.lang.String referenceUid) throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public int countByDID_REF(long dossierId, java.lang.String referenceUid);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_ISN(long dossierId,
		boolean isNew, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByDID_ISN_First(long dossierId, boolean isNew,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_ISN_First(long dossierId, boolean isNew,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByDID_ISN_Last(long dossierId, boolean isNew,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_ISN_Last(long dossierId, boolean isNew,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_ISN_PrevAndNext(long dossierFileId,
		long dossierId, boolean isNew, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	*/
	public void removeByDID_ISN(long dossierId, boolean isNew, boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and isNew = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByDID_ISN(long dossierId, boolean isNew, boolean removed);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByDID_FTNO_First(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_FTNO_First(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByDID_FTNO_Last(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_FTNO_Last(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_FTNO_PrevAndNext(long dossierFileId,
		long dossierId, java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	*/
	public void removeByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByDID_FTNO(long dossierId, java.lang.String fileTemplateNo,
		boolean removed);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByDID_DPNO_First(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_DPNO_First(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByDID_DPNO_Last(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDID_DPNO_Last(long dossierId,
		java.lang.String dossierPartNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_DPNO_PrevAndNext(long dossierFileId,
		long dossierId, java.lang.String dossierPartNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	*/
	public void removeByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and dossierPartNo = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param dossierPartNo the dossier part no
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByDID_DPNO(long dossierId, java.lang.String dossierPartNo,
		boolean removed);

	/**
	* Returns all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByDID_FTNO_DPT_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

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
	public VRDossierFile fetchByDID_FTNO_DPT_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByDID_FTNO_DPT_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

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
	public VRDossierFile fetchByDID_FTNO_DPT_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_FTNO_DPT_PrevAndNext(long dossierFileId,
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	*/
	public void removeByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed);

	/**
	* Returns the number of vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and removed = &#63;.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param removed the removed
	* @return the number of matching vr dossier files
	*/
	public int countByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

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
	public VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

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
	public VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_First(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile findByDID_FTNO_DPT_NOT_NULL_FID_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

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
	public VRDossierFile fetchByDID_FTNO_DPT_NOT_NULL_FID_Last(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public VRDossierFile[] findByDID_FTNO_DPT_NOT_NULL_FID_PrevAndNext(
		long dossierFileId, long dossierId, java.lang.String fileTemplateNo,
		int dossierPartType, long fileEntryId, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where dossierId = &#63; and fileTemplateNo = &#63; and dossierPartType = &#63; and fileEntryId &gt; &#63; and removed = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param fileTemplateNo the file template no
	* @param dossierPartType the dossier part type
	* @param fileEntryId the file entry ID
	* @param removed the removed
	*/
	public void removeByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed);

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
	public int countByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed);

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDE_CODE(java.lang.String deliverableCode)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDE_CODE(java.lang.String deliverableCode);

	/**
	* Returns the vr dossier file where deliverableCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param deliverableCode the deliverable code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDE_CODE(java.lang.String deliverableCode,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByDE_CODE(java.lang.String deliverableCode)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr dossier files
	*/
	public int countByDE_CODE(java.lang.String deliverableCode);

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByGID_REF(long groupId,
		java.lang.String referenceUid) throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByGID_REF(long groupId,
		java.lang.String referenceUid);

	/**
	* Returns the vr dossier file where groupId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByGID_REF(long groupId,
		java.lang.String referenceUid, boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where groupId = &#63; and referenceUid = &#63; from the database.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByGID_REF(long groupId,
		java.lang.String referenceUid) throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where groupId = &#63; and referenceUid = &#63;.
	*
	* @param groupId the group ID
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public int countByGID_REF(long groupId, java.lang.String referenceUid);

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param fileEntryId the file entry ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByFILE_ID(long fileEntryId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByFILE_ID(long fileEntryId);

	/**
	* Returns the vr dossier file where fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fileEntryId the file entry ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByFILE_ID(long fileEntryId,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where fileEntryId = &#63; from the database.
	*
	* @param fileEntryId the file entry ID
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByFILE_ID(long fileEntryId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where fileEntryId = &#63;.
	*
	* @param fileEntryId the file entry ID
	* @return the number of matching vr dossier files
	*/
	public int countByFILE_ID(long fileEntryId);

	/**
	* Returns all the vr dossier files where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the matching vr dossier files
	*/
	public java.util.List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid);

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
	public java.util.List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end);

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
	public java.util.List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findByREF_UID(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByREF_UID_First(java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the first vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByREF_UID_First(java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByREF_UID_Last(java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the last vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByREF_UID_Last(java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

	/**
	* Returns the vr dossier files before and after the current vr dossier file in the ordered set where referenceUid = &#63;.
	*
	* @param dossierFileId the primary key of the current vr dossier file
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile[] findByREF_UID_PrevAndNext(long dossierFileId,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator)
		throws NoSuchVRDossierFileException;

	/**
	* Removes all the vr dossier files where referenceUid = &#63; from the database.
	*
	* @param referenceUid the reference uid
	*/
	public void removeByREF_UID(java.lang.String referenceUid);

	/**
	* Returns the number of vr dossier files where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the number of matching vr dossier files
	*/
	public int countByREF_UID(java.lang.String referenceUid);

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching vr dossier file
	* @throws NoSuchVRDossierFileException if a matching vr dossier file could not be found
	*/
	public VRDossierFile findByDossierFileId(long dossierFileId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDossierFileId(long dossierFileId);

	/**
	* Returns the vr dossier file where dossierFileId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierFileId the dossier file ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public VRDossierFile fetchByDossierFileId(long dossierFileId,
		boolean retrieveFromCache);

	/**
	* Removes the vr dossier file where dossierFileId = &#63; from the database.
	*
	* @param dossierFileId the dossier file ID
	* @return the vr dossier file that was removed
	*/
	public VRDossierFile removeByDossierFileId(long dossierFileId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the number of vr dossier files where dossierFileId = &#63;.
	*
	* @param dossierFileId the dossier file ID
	* @return the number of matching vr dossier files
	*/
	public int countByDossierFileId(long dossierFileId);

	/**
	* Caches the vr dossier file in the entity cache if it is enabled.
	*
	* @param vrDossierFile the vr dossier file
	*/
	public void cacheResult(VRDossierFile vrDossierFile);

	/**
	* Caches the vr dossier files in the entity cache if it is enabled.
	*
	* @param vrDossierFiles the vr dossier files
	*/
	public void cacheResult(java.util.List<VRDossierFile> vrDossierFiles);

	/**
	* Creates a new vr dossier file with the primary key. Does not add the vr dossier file to the database.
	*
	* @param dossierFileId the primary key for the new vr dossier file
	* @return the new vr dossier file
	*/
	public VRDossierFile create(long dossierFileId);

	/**
	* Removes the vr dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file that was removed
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile remove(long dossierFileId)
		throws NoSuchVRDossierFileException;

	public VRDossierFile updateImpl(VRDossierFile vrDossierFile);

	/**
	* Returns the vr dossier file with the primary key or throws a {@link NoSuchVRDossierFileException} if it could not be found.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file
	* @throws NoSuchVRDossierFileException if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile findByPrimaryKey(long dossierFileId)
		throws NoSuchVRDossierFileException;

	/**
	* Returns the vr dossier file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file, or <code>null</code> if a vr dossier file with the primary key could not be found
	*/
	public VRDossierFile fetchByPrimaryKey(long dossierFileId);

	@Override
	public java.util.Map<java.io.Serializable, VRDossierFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr dossier files.
	*
	* @return the vr dossier files
	*/
	public java.util.List<VRDossierFile> findAll();

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
	public java.util.List<VRDossierFile> findAll(int start, int end);

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
	public java.util.List<VRDossierFile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator);

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
	public java.util.List<VRDossierFile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRDossierFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr dossier files from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr dossier files.
	*
	* @return the number of vr dossier files
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}