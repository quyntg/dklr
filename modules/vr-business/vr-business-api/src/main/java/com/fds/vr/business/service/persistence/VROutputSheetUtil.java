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

import com.fds.vr.business.model.VROutputSheet;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr output sheet service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VROutputSheetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetPersistence
 * @see com.fds.vr.business.service.persistence.impl.VROutputSheetPersistenceImpl
 * @generated
 */
@ProviderType
public class VROutputSheetUtil {
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
	public static void clearCache(VROutputSheet vrOutputSheet) {
		getPersistence().clearCache(vrOutputSheet);
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
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VROutputSheet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VROutputSheet update(VROutputSheet vrOutputSheet) {
		return getPersistence().update(vrOutputSheet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VROutputSheet update(VROutputSheet vrOutputSheet,
		ServiceContext serviceContext) {
		return getPersistence().update(vrOutputSheet, serviceContext);
	}

	/**
	* Returns all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @return the matching vr output sheets
	*/
	public static List<VROutputSheet> findByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo) {
		return getPersistence().findByinputSheetNo(mtCore, outputSheetNo);
	}

	/**
	* Returns a range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo, int start, int end) {
		return getPersistence()
				   .findByinputSheetNo(mtCore, outputSheetNo, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findByinputSheetNo(mtCore, outputSheetNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByinputSheetNo(mtCore, outputSheetNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findByinputSheetNo_First(long mtCore,
		java.lang.String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByinputSheetNo_First(mtCore, outputSheetNo,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchByinputSheetNo_First(long mtCore,
		java.lang.String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchByinputSheetNo_First(mtCore, outputSheetNo,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findByinputSheetNo_Last(long mtCore,
		java.lang.String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByinputSheetNo_Last(mtCore, outputSheetNo,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchByinputSheetNo_Last(long mtCore,
		java.lang.String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchByinputSheetNo_Last(mtCore, outputSheetNo,
			orderByComparator);
	}

	/**
	* Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param id the primary key of the current vr output sheet
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet[] findByinputSheetNo_PrevAndNext(long id,
		long mtCore, java.lang.String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByinputSheetNo_PrevAndNext(id, mtCore, outputSheetNo,
			orderByComparator);
	}

	/**
	* Removes all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	*/
	public static void removeByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo) {
		getPersistence().removeByinputSheetNo(mtCore, outputSheetNo);
	}

	/**
	* Returns the number of vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetNo the output sheet no
	* @return the number of matching vr output sheets
	*/
	public static int countByinputSheetNo(long mtCore,
		java.lang.String outputSheetNo) {
		return getPersistence().countByinputSheetNo(mtCore, outputSheetNo);
	}

	/**
	* Returns all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @return the matching vr output sheets
	*/
	public static List<VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId) {
		return getPersistence()
				   .findBypurchaserCorporationId(mtCore, purchaserCorporationId);
	}

	/**
	* Returns a range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId, int start, int end) {
		return getPersistence()
				   .findBypurchaserCorporationId(mtCore,
			purchaserCorporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findBypurchaserCorporationId(mtCore,
			purchaserCorporationId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBypurchaserCorporationId(mtCore,
			purchaserCorporationId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBypurchaserCorporationId_First(
		long mtCore, long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBypurchaserCorporationId_First(mtCore,
			purchaserCorporationId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBypurchaserCorporationId_First(
		long mtCore, long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBypurchaserCorporationId_First(mtCore,
			purchaserCorporationId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBypurchaserCorporationId_Last(long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBypurchaserCorporationId_Last(mtCore,
			purchaserCorporationId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBypurchaserCorporationId_Last(
		long mtCore, long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBypurchaserCorporationId_Last(mtCore,
			purchaserCorporationId, orderByComparator);
	}

	/**
	* Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param id the primary key of the current vr output sheet
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet[] findBypurchaserCorporationId_PrevAndNext(
		long id, long mtCore, long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBypurchaserCorporationId_PrevAndNext(id, mtCore,
			purchaserCorporationId, orderByComparator);
	}

	/**
	* Removes all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	*/
	public static void removeBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId) {
		getPersistence()
			.removeBypurchaserCorporationId(mtCore, purchaserCorporationId);
	}

	/**
	* Returns the number of vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param purchaserCorporationId the purchaser corporation ID
	* @return the number of matching vr output sheets
	*/
	public static int countBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId) {
		return getPersistence()
				   .countBypurchaserCorporationId(mtCore, purchaserCorporationId);
	}

	/**
	* Returns all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @return the matching vr output sheets
	*/
	public static List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		return getPersistence()
				   .findBysupplierCorporationId(mtCore, supplierCorporationId);
	}

	/**
	* Returns a range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end) {
		return getPersistence()
				   .findBysupplierCorporationId(mtCore, supplierCorporationId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findBysupplierCorporationId(mtCore, supplierCorporationId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBysupplierCorporationId(mtCore, supplierCorporationId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBysupplierCorporationId_First(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBysupplierCorporationId_First(mtCore,
			supplierCorporationId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBysupplierCorporationId_First(
		long mtCore, long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBysupplierCorporationId_First(mtCore,
			supplierCorporationId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBysupplierCorporationId_Last(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBysupplierCorporationId_Last(mtCore,
			supplierCorporationId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBysupplierCorporationId_Last(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBysupplierCorporationId_Last(mtCore,
			supplierCorporationId, orderByComparator);
	}

	/**
	* Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param id the primary key of the current vr output sheet
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet[] findBysupplierCorporationId_PrevAndNext(
		long id, long mtCore, long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBysupplierCorporationId_PrevAndNext(id, mtCore,
			supplierCorporationId, orderByComparator);
	}

	/**
	* Removes all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	*/
	public static void removeBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		getPersistence()
			.removeBysupplierCorporationId(mtCore, supplierCorporationId);
	}

	/**
	* Returns the number of vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param supplierCorporationId the supplier corporation ID
	* @return the number of matching vr output sheets
	*/
	public static int countBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		return getPersistence()
				   .countBysupplierCorporationId(mtCore, supplierCorporationId);
	}

	/**
	* Returns all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr output sheets
	*/
	public static List<VROutputSheet> findBydossierId(long mtCore,
		long dossierId) {
		return getPersistence().findBydossierId(mtCore, dossierId);
	}

	/**
	* Returns a range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return getPersistence().findBydossierId(mtCore, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBydossierId_First(long mtCore,
		long dossierId, OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBydossierId_First(long mtCore,
		long dossierId, OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findBydossierId_Last(long mtCore,
		long dossierId, OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchBydossierId_Last(long mtCore,
		long dossierId, OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr output sheet
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, mtCore, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr output sheets where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long mtCore, long dossierId) {
		getPersistence().removeBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the number of vr output sheets where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr output sheets
	*/
	public static int countBydossierId(long mtCore, long dossierId) {
		return getPersistence().countBydossierId(mtCore, dossierId);
	}

	/**
	* Returns all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @return the matching vr output sheets
	*/
	public static List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType) {
		return getPersistence().findByoutputSheetType(mtCore, outputSheetType);
	}

	/**
	* Returns a range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end) {
		return getPersistence()
				   .findByoutputSheetType(mtCore, outputSheetType, start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .findByoutputSheetType(mtCore, outputSheetType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheets
	*/
	public static List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByoutputSheetType(mtCore, outputSheetType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findByoutputSheetType_First(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByoutputSheetType_First(mtCore, outputSheetType,
			orderByComparator);
	}

	/**
	* Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchByoutputSheetType_First(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchByoutputSheetType_First(mtCore, outputSheetType,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet
	* @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	*/
	public static VROutputSheet findByoutputSheetType_Last(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByoutputSheetType_Last(mtCore, outputSheetType,
			orderByComparator);
	}

	/**
	* Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	*/
	public static VROutputSheet fetchByoutputSheetType_Last(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence()
				   .fetchByoutputSheetType_Last(mtCore, outputSheetType,
			orderByComparator);
	}

	/**
	* Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param id the primary key of the current vr output sheet
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet[] findByoutputSheetType_PrevAndNext(long id,
		long mtCore, long outputSheetType,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence()
				   .findByoutputSheetType_PrevAndNext(id, mtCore,
			outputSheetType, orderByComparator);
	}

	/**
	* Removes all the vr output sheets where mtCore = &#63; and outputSheetType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	*/
	public static void removeByoutputSheetType(long mtCore, long outputSheetType) {
		getPersistence().removeByoutputSheetType(mtCore, outputSheetType);
	}

	/**
	* Returns the number of vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetType the output sheet type
	* @return the number of matching vr output sheets
	*/
	public static int countByoutputSheetType(long mtCore, long outputSheetType) {
		return getPersistence().countByoutputSheetType(mtCore, outputSheetType);
	}

	/**
	* Caches the vr output sheet in the entity cache if it is enabled.
	*
	* @param vrOutputSheet the vr output sheet
	*/
	public static void cacheResult(VROutputSheet vrOutputSheet) {
		getPersistence().cacheResult(vrOutputSheet);
	}

	/**
	* Caches the vr output sheets in the entity cache if it is enabled.
	*
	* @param vrOutputSheets the vr output sheets
	*/
	public static void cacheResult(List<VROutputSheet> vrOutputSheets) {
		getPersistence().cacheResult(vrOutputSheets);
	}

	/**
	* Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	*
	* @param id the primary key for the new vr output sheet
	* @return the new vr output sheet
	*/
	public static VROutputSheet create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet that was removed
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet remove(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence().remove(id);
	}

	public static VROutputSheet updateImpl(VROutputSheet vrOutputSheet) {
		return getPersistence().updateImpl(vrOutputSheet);
	}

	/**
	* Returns the vr output sheet with the primary key or throws a {@link NoSuchVROutputSheetException} if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet
	* @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVROutputSheetException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr output sheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet, or <code>null</code> if a vr output sheet with the primary key could not be found
	*/
	public static VROutputSheet fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VROutputSheet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr output sheets.
	*
	* @return the vr output sheets
	*/
	public static List<VROutputSheet> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr output sheets
	*/
	public static List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr output sheets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr output sheets.
	*
	* @return the number of vr output sheets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VROutputSheetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VROutputSheetPersistence, VROutputSheetPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VROutputSheetPersistence.class);
}