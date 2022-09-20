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

import com.fds.vr.business.exception.NoSuchVRCFGStandardException;
import com.fds.vr.business.model.VRCFGStandard;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcfg standard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCFGStandardPersistenceImpl
 * @see VRCFGStandardUtil
 * @generated
 */
@ProviderType
public interface VRCFGStandardPersistence extends BasePersistence<VRCFGStandard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCFGStandardUtil} to access the vrcfg standard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vrcfg standard in the entity cache if it is enabled.
	*
	* @param vrcfgStandard the vrcfg standard
	*/
	public void cacheResult(VRCFGStandard vrcfgStandard);

	/**
	* Caches the vrcfg standards in the entity cache if it is enabled.
	*
	* @param vrcfgStandards the vrcfg standards
	*/
	public void cacheResult(java.util.List<VRCFGStandard> vrcfgStandards);

	/**
	* Creates a new vrcfg standard with the primary key. Does not add the vrcfg standard to the database.
	*
	* @param id the primary key for the new vrcfg standard
	* @return the new vrcfg standard
	*/
	public VRCFGStandard create(long id);

	/**
	* Removes the vrcfg standard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcfg standard
	* @return the vrcfg standard that was removed
	* @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	*/
	public VRCFGStandard remove(long id) throws NoSuchVRCFGStandardException;

	public VRCFGStandard updateImpl(VRCFGStandard vrcfgStandard);

	/**
	* Returns the vrcfg standard with the primary key or throws a {@link NoSuchVRCFGStandardException} if it could not be found.
	*
	* @param id the primary key of the vrcfg standard
	* @return the vrcfg standard
	* @throws NoSuchVRCFGStandardException if a vrcfg standard with the primary key could not be found
	*/
	public VRCFGStandard findByPrimaryKey(long id)
		throws NoSuchVRCFGStandardException;

	/**
	* Returns the vrcfg standard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcfg standard
	* @return the vrcfg standard, or <code>null</code> if a vrcfg standard with the primary key could not be found
	*/
	public VRCFGStandard fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCFGStandard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcfg standards.
	*
	* @return the vrcfg standards
	*/
	public java.util.List<VRCFGStandard> findAll();

	/**
	* Returns a range of all the vrcfg standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcfg standards
	* @param end the upper bound of the range of vrcfg standards (not inclusive)
	* @return the range of vrcfg standards
	*/
	public java.util.List<VRCFGStandard> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcfg standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcfg standards
	* @param end the upper bound of the range of vrcfg standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcfg standards
	*/
	public java.util.List<VRCFGStandard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCFGStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vrcfg standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCFGStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcfg standards
	* @param end the upper bound of the range of vrcfg standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcfg standards
	*/
	public java.util.List<VRCFGStandard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCFGStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcfg standards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcfg standards.
	*
	* @return the number of vrcfg standards
	*/
	public int countAll();
}