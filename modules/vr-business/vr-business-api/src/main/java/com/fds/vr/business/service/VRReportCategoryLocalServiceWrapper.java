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
 * Provides a wrapper for {@link VRReportCategoryLocalService}.
 *
 * @author LamTV
 * @see VRReportCategoryLocalService
 * @generated
 */
@ProviderType
public class VRReportCategoryLocalServiceWrapper
	implements VRReportCategoryLocalService,
		ServiceWrapper<VRReportCategoryLocalService> {
	public VRReportCategoryLocalServiceWrapper(
		VRReportCategoryLocalService vrReportCategoryLocalService) {
		_vrReportCategoryLocalService = vrReportCategoryLocalService;
	}

	/**
	* Adds the vr report category to the database. Also notifies the appropriate model listeners.
	*
	* @param vrReportCategory the vr report category
	* @return the vr report category that was added
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory addVRReportCategory(
		com.fds.vr.business.model.VRReportCategory vrReportCategory) {
		return _vrReportCategoryLocalService.addVRReportCategory(vrReportCategory);
	}

	/**
	* Creates a new vr report category with the primary key. Does not add the vr report category to the database.
	*
	* @param id the primary key for the new vr report category
	* @return the new vr report category
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory createVRReportCategory(
		int id) {
		return _vrReportCategoryLocalService.createVRReportCategory(id);
	}

	/**
	* Deletes the vr report category from the database. Also notifies the appropriate model listeners.
	*
	* @param vrReportCategory the vr report category
	* @return the vr report category that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory deleteVRReportCategory(
		com.fds.vr.business.model.VRReportCategory vrReportCategory) {
		return _vrReportCategoryLocalService.deleteVRReportCategory(vrReportCategory);
	}

	/**
	* Deletes the vr report category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category that was removed
	* @throws PortalException if a vr report category with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory deleteVRReportCategory(
		int id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportCategoryLocalService.deleteVRReportCategory(id);
	}

	@Override
	public com.fds.vr.business.model.VRReportCategory fetchVRReportCategory(
		int id) {
		return _vrReportCategoryLocalService.fetchVRReportCategory(id);
	}

	@Override
	public com.fds.vr.business.model.VRReportCategory findByRptCode(
		java.lang.String rptCode) {
		return _vrReportCategoryLocalService.findByRptCode(rptCode);
	}

	@Override
	public com.fds.vr.business.model.VRReportCategory findByRptDescription(
		java.lang.String rptDescription) {
		return _vrReportCategoryLocalService.findByRptDescription(rptDescription);
	}

	/**
	* Returns the vr report category with the primary key.
	*
	* @param id the primary key of the vr report category
	* @return the vr report category
	* @throws PortalException if a vr report category with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory getVRReportCategory(
		int id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportCategoryLocalService.getVRReportCategory(id);
	}

	/**
	* Updates the vr report category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrReportCategory the vr report category
	* @return the vr report category that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRReportCategory updateVRReportCategory(
		com.fds.vr.business.model.VRReportCategory vrReportCategory) {
		return _vrReportCategoryLocalService.updateVRReportCategory(vrReportCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrReportCategoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrReportCategoryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrReportCategoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportCategoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrReportCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr report categories.
	*
	* @return the number of vr report categories
	*/
	@Override
	public int getVRReportCategoriesCount() {
		return _vrReportCategoryLocalService.getVRReportCategoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrReportCategoryLocalService.getOSGiServiceIdentifier();
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
		return _vrReportCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrReportCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrReportCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRReportCategory> findByRptGroup(
		java.lang.String rptGroup, int start, int end) {
		return _vrReportCategoryLocalService.findByRptGroup(rptGroup, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRReportCategory> findByRptLevel(
		int rptLevel, int start, int end) {
		return _vrReportCategoryLocalService.findByRptLevel(rptLevel, start, end);
	}

	/**
	* Returns a range of all the vr report categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRReportCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr report categories
	* @param end the upper bound of the range of vr report categories (not inclusive)
	* @return the range of vr report categories
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRReportCategory> getVRReportCategories(
		int start, int end) {
		return _vrReportCategoryLocalService.getVRReportCategories(start, end);
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
		return _vrReportCategoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrReportCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRReportCategoryLocalService getWrappedService() {
		return _vrReportCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		VRReportCategoryLocalService vrReportCategoryLocalService) {
		_vrReportCategoryLocalService = vrReportCategoryLocalService;
	}

	private VRReportCategoryLocalService _vrReportCategoryLocalService;
}