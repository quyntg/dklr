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

import com.fds.vr.business.model.VRReport;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr report service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRReportPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRReportPersistenceImpl
 * @generated
 */
@ProviderType
public class VRReportUtil {
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
	public static void clearCache(VRReport vrReport) {
		getPersistence().clearCache(vrReport);
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
	public static List<VRReport> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRReport> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRReport update(VRReport vrReport) {
		return getPersistence().update(vrReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRReport update(VRReport vrReport,
		ServiceContext serviceContext) {
		return getPersistence().update(vrReport, serviceContext);
	}

	/**
	* Returns the vr report where reportCode = &#63; or throws a {@link NoSuchVRReportException} if it could not be found.
	*
	* @param reportCode the report code
	* @return the matching vr report
	* @throws NoSuchVRReportException if a matching vr report could not be found
	*/
	public static VRReport findByReportCode(java.lang.String reportCode)
		throws com.fds.vr.business.exception.NoSuchVRReportException {
		return getPersistence().findByReportCode(reportCode);
	}

	/**
	* Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportCode the report code
	* @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	*/
	public static VRReport fetchByReportCode(java.lang.String reportCode) {
		return getPersistence().fetchByReportCode(reportCode);
	}

	/**
	* Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportCode the report code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	*/
	public static VRReport fetchByReportCode(java.lang.String reportCode,
		boolean retrieveFromCache) {
		return getPersistence().fetchByReportCode(reportCode, retrieveFromCache);
	}

	/**
	* Removes the vr report where reportCode = &#63; from the database.
	*
	* @param reportCode the report code
	* @return the vr report that was removed
	*/
	public static VRReport removeByReportCode(java.lang.String reportCode)
		throws com.fds.vr.business.exception.NoSuchVRReportException {
		return getPersistence().removeByReportCode(reportCode);
	}

	/**
	* Returns the number of vr reports where reportCode = &#63;.
	*
	* @param reportCode the report code
	* @return the number of matching vr reports
	*/
	public static int countByReportCode(java.lang.String reportCode) {
		return getPersistence().countByReportCode(reportCode);
	}

	/**
	* Caches the vr report in the entity cache if it is enabled.
	*
	* @param vrReport the vr report
	*/
	public static void cacheResult(VRReport vrReport) {
		getPersistence().cacheResult(vrReport);
	}

	/**
	* Caches the vr reports in the entity cache if it is enabled.
	*
	* @param vrReports the vr reports
	*/
	public static void cacheResult(List<VRReport> vrReports) {
		getPersistence().cacheResult(vrReports);
	}

	/**
	* Creates a new vr report with the primary key. Does not add the vr report to the database.
	*
	* @param id the primary key for the new vr report
	* @return the new vr report
	*/
	public static VRReport create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report
	* @return the vr report that was removed
	* @throws NoSuchVRReportException if a vr report with the primary key could not be found
	*/
	public static VRReport remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRReportException {
		return getPersistence().remove(id);
	}

	public static VRReport updateImpl(VRReport vrReport) {
		return getPersistence().updateImpl(vrReport);
	}

	/**
	* Returns the vr report with the primary key or throws a {@link NoSuchVRReportException} if it could not be found.
	*
	* @param id the primary key of the vr report
	* @return the vr report
	* @throws NoSuchVRReportException if a vr report with the primary key could not be found
	*/
	public static VRReport findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRReportException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr report
	* @return the vr report, or <code>null</code> if a vr report with the primary key could not be found
	*/
	public static VRReport fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRReport> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr reports.
	*
	* @return the vr reports
	*/
	public static List<VRReport> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr reports
	* @param end the upper bound of the range of vr reports (not inclusive)
	* @return the range of vr reports
	*/
	public static List<VRReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr reports
	* @param end the upper bound of the range of vr reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr reports
	*/
	public static List<VRReport> findAll(int start, int end,
		OrderByComparator<VRReport> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr reports
	* @param end the upper bound of the range of vr reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr reports
	*/
	public static List<VRReport> findAll(int start, int end,
		OrderByComparator<VRReport> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr reports from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr reports.
	*
	* @return the number of vr reports
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRReportPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRReportPersistence, VRReportPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRReportPersistence.class);
}