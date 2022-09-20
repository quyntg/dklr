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

import com.fds.vr.business.exception.NoSuchVRMigrateMappingsException;
import com.fds.vr.business.model.VRMigrateMappings;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr migrate mappings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateMappingsPersistenceImpl
 * @see VRMigrateMappingsUtil
 * @generated
 */
@ProviderType
public interface VRMigrateMappingsPersistence extends BasePersistence<VRMigrateMappings> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRMigrateMappingsUtil} to access the vr migrate mappings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @return the matching vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo);

	/**
	* Returns a range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @return the range of matching vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start, int end);

	/**
	* Returns an ordered range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator);

	/**
	* Returns an ordered range of all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate mappings
	* @throws NoSuchVRMigrateMappingsException if a matching vr migrate mappings could not be found
	*/
	public VRMigrateMappings findByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException;

	/**
	* Returns the first vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	*/
	public VRMigrateMappings fetchByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator);

	/**
	* Returns the last vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate mappings
	* @throws NoSuchVRMigrateMappingsException if a matching vr migrate mappings could not be found
	*/
	public VRMigrateMappings findByMiId_DataGRId_Seq_Last(int taskMigrationID,
		int dataGroupId, int sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException;

	/**
	* Returns the last vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	*/
	public VRMigrateMappings fetchByMiId_DataGRId_Seq_Last(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator);

	/**
	* Returns the vr migrate mappingses before and after the current vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param id the primary key of the current vr migrate mappings
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr migrate mappings
	* @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	*/
	public VRMigrateMappings[] findByMiId_DataGRId_Seq_PrevAndNext(long id,
		int taskMigrationID, int dataGroupId, int sequenceNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator)
		throws NoSuchVRMigrateMappingsException;

	/**
	* Removes all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63; from the database.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	*/
	public void removeByMiId_DataGRId_Seq(int taskMigrationID, int dataGroupId,
		int sequenceNo);

	/**
	* Returns the number of vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @return the number of matching vr migrate mappingses
	*/
	public int countByMiId_DataGRId_Seq(int taskMigrationID, int dataGroupId,
		int sequenceNo);

	/**
	* Caches the vr migrate mappings in the entity cache if it is enabled.
	*
	* @param vrMigrateMappings the vr migrate mappings
	*/
	public void cacheResult(VRMigrateMappings vrMigrateMappings);

	/**
	* Caches the vr migrate mappingses in the entity cache if it is enabled.
	*
	* @param vrMigrateMappingses the vr migrate mappingses
	*/
	public void cacheResult(
		java.util.List<VRMigrateMappings> vrMigrateMappingses);

	/**
	* Creates a new vr migrate mappings with the primary key. Does not add the vr migrate mappings to the database.
	*
	* @param id the primary key for the new vr migrate mappings
	* @return the new vr migrate mappings
	*/
	public VRMigrateMappings create(long id);

	/**
	* Removes the vr migrate mappings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings that was removed
	* @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	*/
	public VRMigrateMappings remove(long id)
		throws NoSuchVRMigrateMappingsException;

	public VRMigrateMappings updateImpl(VRMigrateMappings vrMigrateMappings);

	/**
	* Returns the vr migrate mappings with the primary key or throws a {@link NoSuchVRMigrateMappingsException} if it could not be found.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings
	* @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	*/
	public VRMigrateMappings findByPrimaryKey(long id)
		throws NoSuchVRMigrateMappingsException;

	/**
	* Returns the vr migrate mappings with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings, or <code>null</code> if a vr migrate mappings with the primary key could not be found
	*/
	public VRMigrateMappings fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRMigrateMappings> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr migrate mappingses.
	*
	* @return the vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findAll();

	/**
	* Returns a range of all the vr migrate mappingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @return the range of vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr migrate mappingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator);

	/**
	* Returns an ordered range of all the vr migrate mappingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateMappingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate mappingses
	* @param end the upper bound of the range of vr migrate mappingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr migrate mappingses
	*/
	public java.util.List<VRMigrateMappings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRMigrateMappings> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr migrate mappingses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr migrate mappingses.
	*
	* @return the number of vr migrate mappingses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}