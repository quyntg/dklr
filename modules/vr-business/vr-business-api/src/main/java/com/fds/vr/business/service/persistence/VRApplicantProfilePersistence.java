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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileException;
import com.fds.vr.business.model.VRApplicantProfile;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr applicant profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRApplicantProfilePersistenceImpl
 * @see VRApplicantProfileUtil
 * @generated
 */
@ProviderType
public interface VRApplicantProfilePersistence extends BasePersistence<VRApplicantProfile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRApplicantProfileUtil} to access the vr applicant profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	*
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile
	* @throws NoSuchVRApplicantProfileException if a matching vr applicant profile could not be found
	*/
	public VRApplicantProfile findByapplicantCode(
		java.lang.String applicantCode)
		throws NoSuchVRApplicantProfileException;

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applicantCode the applicant code
	* @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	*/
	public VRApplicantProfile fetchByapplicantCode(
		java.lang.String applicantCode);

	/**
	* Returns the vr applicant profile where applicantCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applicantCode the applicant code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr applicant profile, or <code>null</code> if a matching vr applicant profile could not be found
	*/
	public VRApplicantProfile fetchByapplicantCode(
		java.lang.String applicantCode, boolean retrieveFromCache);

	/**
	* Removes the vr applicant profile where applicantCode = &#63; from the database.
	*
	* @param applicantCode the applicant code
	* @return the vr applicant profile that was removed
	*/
	public VRApplicantProfile removeByapplicantCode(
		java.lang.String applicantCode)
		throws NoSuchVRApplicantProfileException;

	/**
	* Returns the number of vr applicant profiles where applicantCode = &#63;.
	*
	* @param applicantCode the applicant code
	* @return the number of matching vr applicant profiles
	*/
	public int countByapplicantCode(java.lang.String applicantCode);

	/**
	* Caches the vr applicant profile in the entity cache if it is enabled.
	*
	* @param vrApplicantProfile the vr applicant profile
	*/
	public void cacheResult(VRApplicantProfile vrApplicantProfile);

	/**
	* Caches the vr applicant profiles in the entity cache if it is enabled.
	*
	* @param vrApplicantProfiles the vr applicant profiles
	*/
	public void cacheResult(
		java.util.List<VRApplicantProfile> vrApplicantProfiles);

	/**
	* Creates a new vr applicant profile with the primary key. Does not add the vr applicant profile to the database.
	*
	* @param id the primary key for the new vr applicant profile
	* @return the new vr applicant profile
	*/
	public VRApplicantProfile create(long id);

	/**
	* Removes the vr applicant profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile that was removed
	* @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	*/
	public VRApplicantProfile remove(long id)
		throws NoSuchVRApplicantProfileException;

	public VRApplicantProfile updateImpl(VRApplicantProfile vrApplicantProfile);

	/**
	* Returns the vr applicant profile with the primary key or throws a {@link NoSuchVRApplicantProfileException} if it could not be found.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile
	* @throws NoSuchVRApplicantProfileException if a vr applicant profile with the primary key could not be found
	*/
	public VRApplicantProfile findByPrimaryKey(long id)
		throws NoSuchVRApplicantProfileException;

	/**
	* Returns the vr applicant profile with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr applicant profile
	* @return the vr applicant profile, or <code>null</code> if a vr applicant profile with the primary key could not be found
	*/
	public VRApplicantProfile fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRApplicantProfile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr applicant profiles.
	*
	* @return the vr applicant profiles
	*/
	public java.util.List<VRApplicantProfile> findAll();

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
	public java.util.List<VRApplicantProfile> findAll(int start, int end);

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
	public java.util.List<VRApplicantProfile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfile> orderByComparator);

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
	public java.util.List<VRApplicantProfile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRApplicantProfile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr applicant profiles from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr applicant profiles.
	*
	* @return the number of vr applicant profiles
	*/
	public int countAll();
}