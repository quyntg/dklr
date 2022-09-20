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

import com.fds.vr.business.exception.NoSuchVRReportException;
import com.fds.vr.business.model.VRReport;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRReportPersistenceImpl
 * @see VRReportUtil
 * @generated
 */
@ProviderType
public interface VRReportPersistence extends BasePersistence<VRReport> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRReportUtil} to access the vr report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr report where reportCode = &#63; or throws a {@link NoSuchVRReportException} if it could not be found.
	*
	* @param reportCode the report code
	* @return the matching vr report
	* @throws NoSuchVRReportException if a matching vr report could not be found
	*/
	public VRReport findByReportCode(java.lang.String reportCode)
		throws NoSuchVRReportException;

	/**
	* Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportCode the report code
	* @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	*/
	public VRReport fetchByReportCode(java.lang.String reportCode);

	/**
	* Returns the vr report where reportCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportCode the report code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr report, or <code>null</code> if a matching vr report could not be found
	*/
	public VRReport fetchByReportCode(java.lang.String reportCode,
		boolean retrieveFromCache);

	/**
	* Removes the vr report where reportCode = &#63; from the database.
	*
	* @param reportCode the report code
	* @return the vr report that was removed
	*/
	public VRReport removeByReportCode(java.lang.String reportCode)
		throws NoSuchVRReportException;

	/**
	* Returns the number of vr reports where reportCode = &#63;.
	*
	* @param reportCode the report code
	* @return the number of matching vr reports
	*/
	public int countByReportCode(java.lang.String reportCode);

	/**
	* Caches the vr report in the entity cache if it is enabled.
	*
	* @param vrReport the vr report
	*/
	public void cacheResult(VRReport vrReport);

	/**
	* Caches the vr reports in the entity cache if it is enabled.
	*
	* @param vrReports the vr reports
	*/
	public void cacheResult(java.util.List<VRReport> vrReports);

	/**
	* Creates a new vr report with the primary key. Does not add the vr report to the database.
	*
	* @param id the primary key for the new vr report
	* @return the new vr report
	*/
	public VRReport create(long id);

	/**
	* Removes the vr report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report
	* @return the vr report that was removed
	* @throws NoSuchVRReportException if a vr report with the primary key could not be found
	*/
	public VRReport remove(long id) throws NoSuchVRReportException;

	public VRReport updateImpl(VRReport vrReport);

	/**
	* Returns the vr report with the primary key or throws a {@link NoSuchVRReportException} if it could not be found.
	*
	* @param id the primary key of the vr report
	* @return the vr report
	* @throws NoSuchVRReportException if a vr report with the primary key could not be found
	*/
	public VRReport findByPrimaryKey(long id) throws NoSuchVRReportException;

	/**
	* Returns the vr report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr report
	* @return the vr report, or <code>null</code> if a vr report with the primary key could not be found
	*/
	public VRReport fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRReport> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr reports.
	*
	* @return the vr reports
	*/
	public java.util.List<VRReport> findAll();

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
	public java.util.List<VRReport> findAll(int start, int end);

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
	public java.util.List<VRReport> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReport> orderByComparator);

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
	public java.util.List<VRReport> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRReport> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr reports from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr reports.
	*
	* @return the number of vr reports
	*/
	public int countAll();
}