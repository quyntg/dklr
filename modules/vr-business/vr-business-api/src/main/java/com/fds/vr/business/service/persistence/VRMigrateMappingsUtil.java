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

import com.fds.vr.business.model.VRMigrateMappings;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr migrate mappings service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRMigrateMappingsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateMappingsPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRMigrateMappingsPersistenceImpl
 * @generated
 */
@ProviderType
public class VRMigrateMappingsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRMigrateMappings vrMigrateMappings) {
		getPersistence().clearCache(vrMigrateMappings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRMigrateMappings> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRMigrateMappings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRMigrateMappings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRMigrateMappings update(VRMigrateMappings vrMigrateMappings) {
		return getPersistence().update(vrMigrateMappings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRMigrateMappings update(
		VRMigrateMappings vrMigrateMappings, ServiceContext serviceContext) {
		return getPersistence().update(vrMigrateMappings, serviceContext);
	}

	/**
	* Returns all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @return the matching vr migrate mappingses
	*/
	public static List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo) {
		return getPersistence()
				   .findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo);
	}

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
	public static List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start, int end) {
		return getPersistence()
				   .findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, start, end);
	}

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
	public static List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end, OrderByComparator<VRMigrateMappings> orderByComparator) {
		return getPersistence()
				   .findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, start, end, orderByComparator);
	}

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
	public static List<VRMigrateMappings> findByMiId_DataGRId_Seq(
		int taskMigrationID, int dataGroupId, int sequenceNo, int start,
		int end, OrderByComparator<VRMigrateMappings> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VRMigrateMappings findByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateMappingsException {
		return getPersistence()
				   .findByMiId_DataGRId_Seq_First(taskMigrationID, dataGroupId,
			sequenceNo, orderByComparator);
	}

	/**
	* Returns the first vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	*/
	public static VRMigrateMappings fetchByMiId_DataGRId_Seq_First(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		return getPersistence()
				   .fetchByMiId_DataGRId_Seq_First(taskMigrationID,
			dataGroupId, sequenceNo, orderByComparator);
	}

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
	public static VRMigrateMappings findByMiId_DataGRId_Seq_Last(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateMappingsException {
		return getPersistence()
				   .findByMiId_DataGRId_Seq_Last(taskMigrationID, dataGroupId,
			sequenceNo, orderByComparator);
	}

	/**
	* Returns the last vr migrate mappings in the ordered set where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr migrate mappings, or <code>null</code> if a matching vr migrate mappings could not be found
	*/
	public static VRMigrateMappings fetchByMiId_DataGRId_Seq_Last(
		int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		return getPersistence()
				   .fetchByMiId_DataGRId_Seq_Last(taskMigrationID, dataGroupId,
			sequenceNo, orderByComparator);
	}

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
	public static VRMigrateMappings[] findByMiId_DataGRId_Seq_PrevAndNext(
		long id, int taskMigrationID, int dataGroupId, int sequenceNo,
		OrderByComparator<VRMigrateMappings> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRMigrateMappingsException {
		return getPersistence()
				   .findByMiId_DataGRId_Seq_PrevAndNext(id, taskMigrationID,
			dataGroupId, sequenceNo, orderByComparator);
	}

	/**
	* Removes all the vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63; from the database.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	*/
	public static void removeByMiId_DataGRId_Seq(int taskMigrationID,
		int dataGroupId, int sequenceNo) {
		getPersistence()
			.removeByMiId_DataGRId_Seq(taskMigrationID, dataGroupId, sequenceNo);
	}

	/**
	* Returns the number of vr migrate mappingses where taskMigrationID = &#63; and dataGroupId = &#63; and sequenceNo = &#63;.
	*
	* @param taskMigrationID the task migration ID
	* @param dataGroupId the data group ID
	* @param sequenceNo the sequence no
	* @return the number of matching vr migrate mappingses
	*/
	public static int countByMiId_DataGRId_Seq(int taskMigrationID,
		int dataGroupId, int sequenceNo) {
		return getPersistence()
				   .countByMiId_DataGRId_Seq(taskMigrationID, dataGroupId,
			sequenceNo);
	}

	/**
	* Caches the vr migrate mappings in the entity cache if it is enabled.
	*
	* @param vrMigrateMappings the vr migrate mappings
	*/
	public static void cacheResult(VRMigrateMappings vrMigrateMappings) {
		getPersistence().cacheResult(vrMigrateMappings);
	}

	/**
	* Caches the vr migrate mappingses in the entity cache if it is enabled.
	*
	* @param vrMigrateMappingses the vr migrate mappingses
	*/
	public static void cacheResult(List<VRMigrateMappings> vrMigrateMappingses) {
		getPersistence().cacheResult(vrMigrateMappingses);
	}

	/**
	* Creates a new vr migrate mappings with the primary key. Does not add the vr migrate mappings to the database.
	*
	* @param id the primary key for the new vr migrate mappings
	* @return the new vr migrate mappings
	*/
	public static VRMigrateMappings create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr migrate mappings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings that was removed
	* @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	*/
	public static VRMigrateMappings remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateMappingsException {
		return getPersistence().remove(id);
	}

	public static VRMigrateMappings updateImpl(
		VRMigrateMappings vrMigrateMappings) {
		return getPersistence().updateImpl(vrMigrateMappings);
	}

	/**
	* Returns the vr migrate mappings with the primary key or throws a {@link NoSuchVRMigrateMappingsException} if it could not be found.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings
	* @throws NoSuchVRMigrateMappingsException if a vr migrate mappings with the primary key could not be found
	*/
	public static VRMigrateMappings findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRMigrateMappingsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr migrate mappings with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr migrate mappings
	* @return the vr migrate mappings, or <code>null</code> if a vr migrate mappings with the primary key could not be found
	*/
	public static VRMigrateMappings fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRMigrateMappings> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr migrate mappingses.
	*
	* @return the vr migrate mappingses
	*/
	public static List<VRMigrateMappings> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRMigrateMappings> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRMigrateMappings> findAll(int start, int end,
		OrderByComparator<VRMigrateMappings> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRMigrateMappings> findAll(int start, int end,
		OrderByComparator<VRMigrateMappings> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr migrate mappingses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr migrate mappingses.
	*
	* @return the number of vr migrate mappingses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRMigrateMappingsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRMigrateMappingsPersistence, VRMigrateMappingsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRMigrateMappingsPersistence.class);
}