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

import com.fds.vr.business.exception.NoSuchVRTemplateNoException;
import com.fds.vr.business.model.VRTemplateNo;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr template no service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRTemplateNoPersistenceImpl
 * @see VRTemplateNoUtil
 * @generated
 */
@ProviderType
public interface VRTemplateNoPersistence extends BasePersistence<VRTemplateNo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRTemplateNoUtil} to access the vr template no persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr template no where patternNo = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param patternNo the pattern no
	* @return the matching vr template no
	* @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	*/
	public VRTemplateNo findByP_N(java.lang.String patternNo)
		throws NoSuchVRTemplateNoException;

	/**
	* Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param patternNo the pattern no
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public VRTemplateNo fetchByP_N(java.lang.String patternNo);

	/**
	* Returns the vr template no where patternNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param patternNo the pattern no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public VRTemplateNo fetchByP_N(java.lang.String patternNo,
		boolean retrieveFromCache);

	/**
	* Removes the vr template no where patternNo = &#63; from the database.
	*
	* @param patternNo the pattern no
	* @return the vr template no that was removed
	*/
	public VRTemplateNo removeByP_N(java.lang.String patternNo)
		throws NoSuchVRTemplateNoException;

	/**
	* Returns the number of vr template nos where patternNo = &#63;.
	*
	* @param patternNo the pattern no
	* @return the number of matching vr template nos
	*/
	public int countByP_N(java.lang.String patternNo);

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the matching vr template no
	* @throws NoSuchVRTemplateNoException if a matching vr template no could not be found
	*/
	public VRTemplateNo findByP_N_Y(java.lang.String patternNo, int year)
		throws NoSuchVRTemplateNoException;

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public VRTemplateNo fetchByP_N_Y(java.lang.String patternNo, int year);

	/**
	* Returns the vr template no where patternNo = &#63; and year = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr template no, or <code>null</code> if a matching vr template no could not be found
	*/
	public VRTemplateNo fetchByP_N_Y(java.lang.String patternNo, int year,
		boolean retrieveFromCache);

	/**
	* Removes the vr template no where patternNo = &#63; and year = &#63; from the database.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the vr template no that was removed
	*/
	public VRTemplateNo removeByP_N_Y(java.lang.String patternNo, int year)
		throws NoSuchVRTemplateNoException;

	/**
	* Returns the number of vr template nos where patternNo = &#63; and year = &#63;.
	*
	* @param patternNo the pattern no
	* @param year the year
	* @return the number of matching vr template nos
	*/
	public int countByP_N_Y(java.lang.String patternNo, int year);

	/**
	* Caches the vr template no in the entity cache if it is enabled.
	*
	* @param vrTemplateNo the vr template no
	*/
	public void cacheResult(VRTemplateNo vrTemplateNo);

	/**
	* Caches the vr template nos in the entity cache if it is enabled.
	*
	* @param vrTemplateNos the vr template nos
	*/
	public void cacheResult(java.util.List<VRTemplateNo> vrTemplateNos);

	/**
	* Creates a new vr template no with the primary key. Does not add the vr template no to the database.
	*
	* @param id the primary key for the new vr template no
	* @return the new vr template no
	*/
	public VRTemplateNo create(long id);

	/**
	* Removes the vr template no with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no that was removed
	* @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	*/
	public VRTemplateNo remove(long id) throws NoSuchVRTemplateNoException;

	public VRTemplateNo updateImpl(VRTemplateNo vrTemplateNo);

	/**
	* Returns the vr template no with the primary key or throws a {@link NoSuchVRTemplateNoException} if it could not be found.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no
	* @throws NoSuchVRTemplateNoException if a vr template no with the primary key could not be found
	*/
	public VRTemplateNo findByPrimaryKey(long id)
		throws NoSuchVRTemplateNoException;

	/**
	* Returns the vr template no with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no, or <code>null</code> if a vr template no with the primary key could not be found
	*/
	public VRTemplateNo fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRTemplateNo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr template nos.
	*
	* @return the vr template nos
	*/
	public java.util.List<VRTemplateNo> findAll();

	/**
	* Returns a range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @return the range of vr template nos
	*/
	public java.util.List<VRTemplateNo> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr template nos
	*/
	public java.util.List<VRTemplateNo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTemplateNo> orderByComparator);

	/**
	* Returns an ordered range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr template nos
	*/
	public java.util.List<VRTemplateNo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTemplateNo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr template nos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr template nos.
	*
	* @return the number of vr template nos
	*/
	public int countAll();
}