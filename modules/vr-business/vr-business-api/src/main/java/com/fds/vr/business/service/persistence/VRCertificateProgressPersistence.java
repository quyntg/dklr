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

import com.fds.vr.business.exception.NoSuchVRCertificateProgressException;
import com.fds.vr.business.model.VRCertificateProgress;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr certificate progress service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCertificateProgressPersistenceImpl
 * @see VRCertificateProgressUtil
 * @generated
 */
@ProviderType
public interface VRCertificateProgressPersistence extends BasePersistence<VRCertificateProgress> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCertificateProgressUtil} to access the vr certificate progress persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr certificate progress in the entity cache if it is enabled.
	*
	* @param vrCertificateProgress the vr certificate progress
	*/
	public void cacheResult(VRCertificateProgress vrCertificateProgress);

	/**
	* Caches the vr certificate progresses in the entity cache if it is enabled.
	*
	* @param vrCertificateProgresses the vr certificate progresses
	*/
	public void cacheResult(
		java.util.List<VRCertificateProgress> vrCertificateProgresses);

	/**
	* Creates a new vr certificate progress with the primary key. Does not add the vr certificate progress to the database.
	*
	* @param id the primary key for the new vr certificate progress
	* @return the new vr certificate progress
	*/
	public VRCertificateProgress create(long id);

	/**
	* Removes the vr certificate progress with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress that was removed
	* @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	*/
	public VRCertificateProgress remove(long id)
		throws NoSuchVRCertificateProgressException;

	public VRCertificateProgress updateImpl(
		VRCertificateProgress vrCertificateProgress);

	/**
	* Returns the vr certificate progress with the primary key or throws a {@link NoSuchVRCertificateProgressException} if it could not be found.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress
	* @throws NoSuchVRCertificateProgressException if a vr certificate progress with the primary key could not be found
	*/
	public VRCertificateProgress findByPrimaryKey(long id)
		throws NoSuchVRCertificateProgressException;

	/**
	* Returns the vr certificate progress with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress, or <code>null</code> if a vr certificate progress with the primary key could not be found
	*/
	public VRCertificateProgress fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCertificateProgress> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr certificate progresses.
	*
	* @return the vr certificate progresses
	*/
	public java.util.List<VRCertificateProgress> findAll();

	/**
	* Returns a range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @return the range of vr certificate progresses
	*/
	public java.util.List<VRCertificateProgress> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr certificate progresses
	*/
	public java.util.List<VRCertificateProgress> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCertificateProgress> orderByComparator);

	/**
	* Returns an ordered range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr certificate progresses
	*/
	public java.util.List<VRCertificateProgress> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCertificateProgress> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr certificate progresses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr certificate progresses.
	*
	* @return the number of vr certificate progresses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}