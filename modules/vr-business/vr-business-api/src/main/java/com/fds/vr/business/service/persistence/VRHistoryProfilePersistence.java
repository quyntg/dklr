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

import com.fds.vr.business.exception.NoSuchVRHistoryProfileException;
import com.fds.vr.business.model.VRHistoryProfile;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr history profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRHistoryProfilePersistenceImpl
 * @see VRHistoryProfileUtil
 * @generated
 */
@ProviderType
public interface VRHistoryProfilePersistence extends BasePersistence<VRHistoryProfile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRHistoryProfileUtil} to access the vr history profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr history profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode);

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
	public java.util.List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_ApplicantCode(
		java.lang.String applicantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ApplicantCode_First(
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ApplicantCode_First(
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ApplicantCode_Last(
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ApplicantCode_Last(
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where applicantCode = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param applicantCode the applicant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile[] findByF_ApplicantCode_PrevAndNext(long id,
		java.lang.String applicantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where applicantCode = &#63; from the database.
	*
	* @param applicantCode the applicant code
	*/
	public void removeByF_ApplicantCode(java.lang.String applicantCode);

	/**
	* Returns the number of vr history profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the number of matching vr history profiles
	*/
	public int countByF_ApplicantCode(java.lang.String applicantCode);

	/**
	* Returns all the vr history profiles where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode);

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
	public java.util.List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_ProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ProductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ProductionPlantCode_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ProductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ProductionPlantCode_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile[] findByF_ProductionPlantCode_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByF_ProductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns the number of vr history profiles where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr history profiles
	*/
	public int countByF_ProductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns all the vr history profiles where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_DossierId(long dossierId);

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
	public java.util.List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_DossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile[] findByF_DossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByF_DossierId(long dossierId);

	/**
	* Returns the number of vr history profiles where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr history profiles
	*/
	public int countByF_DossierId(long dossierId);

	/**
	* Returns all the vr history profiles where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_dossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_dossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_dossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_dossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile[] findByF_dossierIdCTN_PrevAndNext(long id,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	*/
	public void removeByF_dossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns the number of vr history profiles where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vr history profiles
	*/
	public int countByF_dossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_First(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_First(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_dossierIdCTN_contentFileTemplate_Last(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_dossierIdCTN_contentFileTemplate_Last(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public VRHistoryProfile[] findByF_dossierIdCTN_contentFileTemplate_PrevAndNext(
		long id, java.lang.String dossierIdCTN,
		java.lang.String contentFileTemplate,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	*/
	public void removeByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate);

	/**
	* Returns the number of vr history profiles where dossierIdCTN = &#63; and contentFileTemplate = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param contentFileTemplate the content file template
	* @return the number of matching vr history profiles
	*/
	public int countByF_dossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate);

	/**
	* Returns all the vr history profiles where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the matching vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType);

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
	public java.util.List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end);

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
	public java.util.List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findByF_ContentType(
		java.lang.String contentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ContentType_First(
		java.lang.String contentType,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the first vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ContentType_First(
		java.lang.String contentType,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the last vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile
	* @throws NoSuchVRHistoryProfileException if a matching vr history profile could not be found
	*/
	public VRHistoryProfile findByF_ContentType_Last(
		java.lang.String contentType,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the last vr history profile in the ordered set where contentType = &#63;.
	*
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr history profile, or <code>null</code> if a matching vr history profile could not be found
	*/
	public VRHistoryProfile fetchByF_ContentType_Last(
		java.lang.String contentType,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

	/**
	* Returns the vr history profiles before and after the current vr history profile in the ordered set where contentType = &#63;.
	*
	* @param id the primary key of the current vr history profile
	* @param contentType the content type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile[] findByF_ContentType_PrevAndNext(long id,
		java.lang.String contentType,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator)
		throws NoSuchVRHistoryProfileException;

	/**
	* Removes all the vr history profiles where contentType = &#63; from the database.
	*
	* @param contentType the content type
	*/
	public void removeByF_ContentType(java.lang.String contentType);

	/**
	* Returns the number of vr history profiles where contentType = &#63;.
	*
	* @param contentType the content type
	* @return the number of matching vr history profiles
	*/
	public int countByF_ContentType(java.lang.String contentType);

	/**
	* Caches the vr history profile in the entity cache if it is enabled.
	*
	* @param vrHistoryProfile the vr history profile
	*/
	public void cacheResult(VRHistoryProfile vrHistoryProfile);

	/**
	* Caches the vr history profiles in the entity cache if it is enabled.
	*
	* @param vrHistoryProfiles the vr history profiles
	*/
	public void cacheResult(java.util.List<VRHistoryProfile> vrHistoryProfiles);

	/**
	* Creates a new vr history profile with the primary key. Does not add the vr history profile to the database.
	*
	* @param id the primary key for the new vr history profile
	* @return the new vr history profile
	*/
	public VRHistoryProfile create(long id);

	/**
	* Removes the vr history profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile that was removed
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile remove(long id)
		throws NoSuchVRHistoryProfileException;

	public VRHistoryProfile updateImpl(VRHistoryProfile vrHistoryProfile);

	/**
	* Returns the vr history profile with the primary key or throws a {@link NoSuchVRHistoryProfileException} if it could not be found.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile
	* @throws NoSuchVRHistoryProfileException if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile findByPrimaryKey(long id)
		throws NoSuchVRHistoryProfileException;

	/**
	* Returns the vr history profile with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile, or <code>null</code> if a vr history profile with the primary key could not be found
	*/
	public VRHistoryProfile fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRHistoryProfile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr history profiles.
	*
	* @return the vr history profiles
	*/
	public java.util.List<VRHistoryProfile> findAll();

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
	public java.util.List<VRHistoryProfile> findAll(int start, int end);

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
	public java.util.List<VRHistoryProfile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator);

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
	public java.util.List<VRHistoryProfile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRHistoryProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr history profiles from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr history profiles.
	*
	* @return the number of vr history profiles
	*/
	public int countAll();
}