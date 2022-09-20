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

import com.fds.vr.business.model.VRProductLine;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr product line service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRProductLinePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRProductLinePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRProductLinePersistenceImpl
 * @generated
 */
@ProviderType
public class VRProductLineUtil {
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
	public static void clearCache(VRProductLine vrProductLine) {
		getPersistence().clearCache(vrProductLine);
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
	public static List<VRProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRProductLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRProductLine> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRProductLine update(VRProductLine vrProductLine) {
		return getPersistence().update(vrProductLine);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRProductLine update(VRProductLine vrProductLine,
		ServiceContext serviceContext) {
		return getPersistence().update(vrProductLine, serviceContext);
	}

	/**
	* Returns all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the matching vr product lines
	*/
	public static List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID) {
		return getPersistence().findByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Returns a range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @return the range of matching vr product lines
	*/
	public static List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end);
	}

	/**
	* Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr product lines
	*/
	public static List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductLine> orderByComparator) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr product lines
	*/
	public static List<VRProductLine> findByproductPlantID(long mtCore,
		long productPlantID, int start, int end,
		OrderByComparator<VRProductLine> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByproductPlantID(mtCore, productPlantID, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product line
	* @throws NoSuchVRProductLineException if a matching vr product line could not be found
	*/
	public static VRProductLine findByproductPlantID_First(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductLineException {
		return getPersistence()
				   .findByproductPlantID_First(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the first vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr product line, or <code>null</code> if a matching vr product line could not be found
	*/
	public static VRProductLine fetchByproductPlantID_First(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator) {
		return getPersistence()
				   .fetchByproductPlantID_First(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product line
	* @throws NoSuchVRProductLineException if a matching vr product line could not be found
	*/
	public static VRProductLine findByproductPlantID_Last(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductLineException {
		return getPersistence()
				   .findByproductPlantID_Last(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the last vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr product line, or <code>null</code> if a matching vr product line could not be found
	*/
	public static VRProductLine fetchByproductPlantID_Last(long mtCore,
		long productPlantID, OrderByComparator<VRProductLine> orderByComparator) {
		return getPersistence()
				   .fetchByproductPlantID_Last(mtCore, productPlantID,
			orderByComparator);
	}

	/**
	* Returns the vr product lines before and after the current vr product line in the ordered set where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param id the primary key of the current vr product line
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr product line
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public static VRProductLine[] findByproductPlantID_PrevAndNext(long id,
		long mtCore, long productPlantID,
		OrderByComparator<VRProductLine> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRProductLineException {
		return getPersistence()
				   .findByproductPlantID_PrevAndNext(id, mtCore,
			productPlantID, orderByComparator);
	}

	/**
	* Removes all the vr product lines where mtCore = &#63; and productPlantID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	*/
	public static void removeByproductPlantID(long mtCore, long productPlantID) {
		getPersistence().removeByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Returns the number of vr product lines where mtCore = &#63; and productPlantID = &#63;.
	*
	* @param mtCore the mt core
	* @param productPlantID the product plant ID
	* @return the number of matching vr product lines
	*/
	public static int countByproductPlantID(long mtCore, long productPlantID) {
		return getPersistence().countByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Caches the vr product line in the entity cache if it is enabled.
	*
	* @param vrProductLine the vr product line
	*/
	public static void cacheResult(VRProductLine vrProductLine) {
		getPersistence().cacheResult(vrProductLine);
	}

	/**
	* Caches the vr product lines in the entity cache if it is enabled.
	*
	* @param vrProductLines the vr product lines
	*/
	public static void cacheResult(List<VRProductLine> vrProductLines) {
		getPersistence().cacheResult(vrProductLines);
	}

	/**
	* Creates a new vr product line with the primary key. Does not add the vr product line to the database.
	*
	* @param id the primary key for the new vr product line
	* @return the new vr product line
	*/
	public static VRProductLine create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line that was removed
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public static VRProductLine remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductLineException {
		return getPersistence().remove(id);
	}

	public static VRProductLine updateImpl(VRProductLine vrProductLine) {
		return getPersistence().updateImpl(vrProductLine);
	}

	/**
	* Returns the vr product line with the primary key or throws a {@link NoSuchVRProductLineException} if it could not be found.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line
	* @throws NoSuchVRProductLineException if a vr product line with the primary key could not be found
	*/
	public static VRProductLine findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRProductLineException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr product line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line, or <code>null</code> if a vr product line with the primary key could not be found
	*/
	public static VRProductLine fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRProductLine> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr product lines.
	*
	* @return the vr product lines
	*/
	public static List<VRProductLine> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @return the range of vr product lines
	*/
	public static List<VRProductLine> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr product lines
	*/
	public static List<VRProductLine> findAll(int start, int end,
		OrderByComparator<VRProductLine> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr product lines
	*/
	public static List<VRProductLine> findAll(int start, int end,
		OrderByComparator<VRProductLine> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr product lines from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr product lines.
	*
	* @return the number of vr product lines
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRProductLinePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductLinePersistence, VRProductLinePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRProductLinePersistence.class);
}