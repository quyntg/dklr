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

import com.fds.vr.business.exception.NoSuchVRCertificateProgressFileException;
import com.fds.vr.business.model.VRCertificateProgressFile;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr certificate progress file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCertificateProgressFilePersistenceImpl
 * @see VRCertificateProgressFileUtil
 * @generated
 */
@ProviderType
public interface VRCertificateProgressFilePersistence extends BasePersistence<VRCertificateProgressFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCertificateProgressFileUtil} to access the vr certificate progress file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vr certificate progress file in the entity cache if it is enabled.
	*
	* @param vrCertificateProgressFile the vr certificate progress file
	*/
	public void cacheResult(VRCertificateProgressFile vrCertificateProgressFile);

	/**
	* Caches the vr certificate progress files in the entity cache if it is enabled.
	*
	* @param vrCertificateProgressFiles the vr certificate progress files
	*/
	public void cacheResult(
		java.util.List<VRCertificateProgressFile> vrCertificateProgressFiles);

	/**
	* Creates a new vr certificate progress file with the primary key. Does not add the vr certificate progress file to the database.
	*
	* @param id the primary key for the new vr certificate progress file
	* @return the new vr certificate progress file
	*/
	public VRCertificateProgressFile create(long id);

	/**
	* Removes the vr certificate progress file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file that was removed
	* @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	*/
	public VRCertificateProgressFile remove(long id)
		throws NoSuchVRCertificateProgressFileException;

	public VRCertificateProgressFile updateImpl(
		VRCertificateProgressFile vrCertificateProgressFile);

	/**
	* Returns the vr certificate progress file with the primary key or throws a {@link NoSuchVRCertificateProgressFileException} if it could not be found.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file
	* @throws NoSuchVRCertificateProgressFileException if a vr certificate progress file with the primary key could not be found
	*/
	public VRCertificateProgressFile findByPrimaryKey(long id)
		throws NoSuchVRCertificateProgressFileException;

	/**
	* Returns the vr certificate progress file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file, or <code>null</code> if a vr certificate progress file with the primary key could not be found
	*/
	public VRCertificateProgressFile fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCertificateProgressFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr certificate progress files.
	*
	* @return the vr certificate progress files
	*/
	public java.util.List<VRCertificateProgressFile> findAll();

	/**
	* Returns a range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @return the range of vr certificate progress files
	*/
	public java.util.List<VRCertificateProgressFile> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr certificate progress files
	*/
	public java.util.List<VRCertificateProgressFile> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCertificateProgressFile> orderByComparator);

	/**
	* Returns an ordered range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr certificate progress files
	*/
	public java.util.List<VRCertificateProgressFile> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCertificateProgressFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr certificate progress files from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr certificate progress files.
	*
	* @return the number of vr certificate progress files
	*/
	public int countAll();
}