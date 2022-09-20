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

import com.fds.vr.business.exception.NoSuchVRSyncDateException;
import com.fds.vr.business.model.VRSyncDate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr sync date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRSyncDatePersistenceImpl
 * @see VRSyncDateUtil
 * @generated
 */
@ProviderType
public interface VRSyncDatePersistence extends BasePersistence<VRSyncDate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRSyncDateUtil} to access the vr sync date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr sync date in the entity cache if it is enabled.
	*
	* @param vrSyncDate the vr sync date
	*/
	public void cacheResult(VRSyncDate vrSyncDate);

	/**
	* Caches the vr sync dates in the entity cache if it is enabled.
	*
	* @param vrSyncDates the vr sync dates
	*/
	public void cacheResult(java.util.List<VRSyncDate> vrSyncDates);

	/**
	* Creates a new vr sync date with the primary key. Does not add the vr sync date to the database.
	*
	* @param id the primary key for the new vr sync date
	* @return the new vr sync date
	*/
	public VRSyncDate create(long id);

	/**
	* Removes the vr sync date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date that was removed
	* @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	*/
	public VRSyncDate remove(long id) throws NoSuchVRSyncDateException;

	public VRSyncDate updateImpl(VRSyncDate vrSyncDate);

	/**
	* Returns the vr sync date with the primary key or throws a {@link NoSuchVRSyncDateException} if it could not be found.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date
	* @throws NoSuchVRSyncDateException if a vr sync date with the primary key could not be found
	*/
	public VRSyncDate findByPrimaryKey(long id)
		throws NoSuchVRSyncDateException;

	/**
	* Returns the vr sync date with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date, or <code>null</code> if a vr sync date with the primary key could not be found
	*/
	public VRSyncDate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRSyncDate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr sync dates.
	*
	* @return the vr sync dates
	*/
	public java.util.List<VRSyncDate> findAll();

	/**
	* Returns a range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @return the range of vr sync dates
	*/
	public java.util.List<VRSyncDate> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr sync dates
	*/
	public java.util.List<VRSyncDate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRSyncDate> orderByComparator);

	/**
	* Returns an ordered range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr sync dates
	*/
	public java.util.List<VRSyncDate> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRSyncDate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr sync dates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr sync dates.
	*
	* @return the number of vr sync dates
	*/
	public int countAll();
}