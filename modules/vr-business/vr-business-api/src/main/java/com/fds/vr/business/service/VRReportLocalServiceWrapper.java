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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRReportLocalService}.
 *
 * @author LamTV
 * @see VRReportLocalService
 * @generated
 */
@ProviderType
public class VRReportLocalServiceWrapper implements VRReportLocalService,
	ServiceWrapper<VRReportLocalService> {
	public VRReportLocalServiceWrapper(
		VRReportLocalService vrReportLocalService) {
		_vrReportLocalService = vrReportLocalService;
	}

	/**
	* Adds the vr report to the database. Also notifies the appropriate model listeners.
	*
	* @param vrReport the vr report
	* @return the vr report that was added
	*/
	@Override
	public com.fds.vr.business.model.VRReport addVRReport(
		com.fds.vr.business.model.VRReport vrReport) {
		return _vrReportLocalService.addVRReport(vrReport);
	}

	/**
	* Creates a new vr report with the primary key. Does not add the vr report to the database.
	*
	* @param id the primary key for the new vr report
	* @return the new vr report
	*/
	@Override
	public com.fds.vr.business.model.VRReport createVRReport(long id) {
		return _vrReportLocalService.createVRReport(id);
	}

	/**
	* Deletes the vr report from the database. Also notifies the appropriate model listeners.
	*
	* @param vrReport the vr report
	* @return the vr report that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRReport deleteVRReport(
		com.fds.vr.business.model.VRReport vrReport) {
		return _vrReportLocalService.deleteVRReport(vrReport);
	}

	/**
	* Deletes the vr report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report
	* @return the vr report that was removed
	* @throws PortalException if a vr report with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRReport deleteVRReport(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportLocalService.deleteVRReport(id);
	}

	@Override
	public com.fds.vr.business.model.VRReport fetchVRReport(long id) {
		return _vrReportLocalService.fetchVRReport(id);
	}

	@Override
	public com.fds.vr.business.model.VRReport getReport(
		java.lang.String reportCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportLocalService.getReport(reportCode);
	}

	/**
	* Returns the vr report with the primary key.
	*
	* @param id the primary key of the vr report
	* @return the vr report
	* @throws PortalException if a vr report with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRReport getVRReport(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportLocalService.getVRReport(id);
	}

	/**
	* Updates the vr report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrReport the vr report
	* @return the vr report that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRReport updateVRReport(
		com.fds.vr.business.model.VRReport vrReport) {
		return _vrReportLocalService.updateVRReport(vrReport);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrReportLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrReportLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrReportLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr reports.
	*
	* @return the number of vr reports
	*/
	@Override
	public int getVRReportsCount() {
		return _vrReportLocalService.getVRReportsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrReportLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrReportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrReportLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrReportLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vr reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr reports
	* @param end the upper bound of the range of vr reports (not inclusive)
	* @return the range of vr reports
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRReport> getVRReports(
		int start, int end) {
		return _vrReportLocalService.getVRReports(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrReportLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vrReportLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public VRReportLocalService getWrappedService() {
		return _vrReportLocalService;
	}

	@Override
	public void setWrappedService(VRReportLocalService vrReportLocalService) {
		_vrReportLocalService = vrReportLocalService;
	}

	private VRReportLocalService _vrReportLocalService;
}