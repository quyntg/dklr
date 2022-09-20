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

import com.fds.vr.business.exception.NoSuchVRActionconfigException;
import com.fds.vr.business.model.VRActionconfig;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr actionconfig service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRActionconfigPersistenceImpl
 * @see VRActionconfigUtil
 * @generated
 */
@ProviderType
public interface VRActionconfigPersistence extends BasePersistence<VRActionconfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRActionconfigUtil} to access the vr actionconfig persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the matching vr actionconfig
	* @throws NoSuchVRActionconfigException if a matching vr actionconfig could not be found
	*/
	public VRActionconfig findByA_P(java.lang.String actionCode,
		java.lang.String processNo) throws NoSuchVRActionconfigException;

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	*/
	public VRActionconfig fetchByA_P(java.lang.String actionCode,
		java.lang.String processNo);

	/**
	* Returns the vr actionconfig where actionCode = &#63; and processNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr actionconfig, or <code>null</code> if a matching vr actionconfig could not be found
	*/
	public VRActionconfig fetchByA_P(java.lang.String actionCode,
		java.lang.String processNo, boolean retrieveFromCache);

	/**
	* Removes the vr actionconfig where actionCode = &#63; and processNo = &#63; from the database.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the vr actionconfig that was removed
	*/
	public VRActionconfig removeByA_P(java.lang.String actionCode,
		java.lang.String processNo) throws NoSuchVRActionconfigException;

	/**
	* Returns the number of vr actionconfigs where actionCode = &#63; and processNo = &#63;.
	*
	* @param actionCode the action code
	* @param processNo the process no
	* @return the number of matching vr actionconfigs
	*/
	public int countByA_P(java.lang.String actionCode,
		java.lang.String processNo);

	/**
	* Caches the vr actionconfig in the entity cache if it is enabled.
	*
	* @param vrActionconfig the vr actionconfig
	*/
	public void cacheResult(VRActionconfig vrActionconfig);

	/**
	* Caches the vr actionconfigs in the entity cache if it is enabled.
	*
	* @param vrActionconfigs the vr actionconfigs
	*/
	public void cacheResult(java.util.List<VRActionconfig> vrActionconfigs);

	/**
	* Creates a new vr actionconfig with the primary key. Does not add the vr actionconfig to the database.
	*
	* @param id the primary key for the new vr actionconfig
	* @return the new vr actionconfig
	*/
	public VRActionconfig create(long id);

	/**
	* Removes the vr actionconfig with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig that was removed
	* @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	*/
	public VRActionconfig remove(long id) throws NoSuchVRActionconfigException;

	public VRActionconfig updateImpl(VRActionconfig vrActionconfig);

	/**
	* Returns the vr actionconfig with the primary key or throws a {@link NoSuchVRActionconfigException} if it could not be found.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig
	* @throws NoSuchVRActionconfigException if a vr actionconfig with the primary key could not be found
	*/
	public VRActionconfig findByPrimaryKey(long id)
		throws NoSuchVRActionconfigException;

	/**
	* Returns the vr actionconfig with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr actionconfig
	* @return the vr actionconfig, or <code>null</code> if a vr actionconfig with the primary key could not be found
	*/
	public VRActionconfig fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRActionconfig> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr actionconfigs.
	*
	* @return the vr actionconfigs
	*/
	public java.util.List<VRActionconfig> findAll();

	/**
	* Returns a range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @return the range of vr actionconfigs
	*/
	public java.util.List<VRActionconfig> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr actionconfigs
	*/
	public java.util.List<VRActionconfig> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRActionconfig> orderByComparator);

	/**
	* Returns an ordered range of all the vr actionconfigs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRActionconfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr actionconfigs
	* @param end the upper bound of the range of vr actionconfigs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr actionconfigs
	*/
	public java.util.List<VRActionconfig> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRActionconfig> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr actionconfigs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr actionconfigs.
	*
	* @return the number of vr actionconfigs
	*/
	public int countAll();
}