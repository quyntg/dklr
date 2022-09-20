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

package com.fds.vr.filterconfig.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRConditionLocalService}.
 *
 * @author NhanHoang
 * @see VRConditionLocalService
 * @generated
 */
@ProviderType
public class VRConditionLocalServiceWrapper implements VRConditionLocalService,
	ServiceWrapper<VRConditionLocalService> {
	public VRConditionLocalServiceWrapper(
		VRConditionLocalService vrConditionLocalService) {
		_vrConditionLocalService = vrConditionLocalService;
	}

	/**
	* Adds the vr condition to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCondition the vr condition
	* @return the vr condition that was added
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition addVRCondition(
		com.fds.vr.filterconfig.model.VRCondition vrCondition) {
		return _vrConditionLocalService.addVRCondition(vrCondition);
	}

	/**
	* Creates a new vr condition with the primary key. Does not add the vr condition to the database.
	*
	* @param id the primary key for the new vr condition
	* @return the new vr condition
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition createVRCondition(long id) {
		return _vrConditionLocalService.createVRCondition(id);
	}

	/**
	* Deletes the vr condition from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCondition the vr condition
	* @return the vr condition that was removed
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition deleteVRCondition(
		com.fds.vr.filterconfig.model.VRCondition vrCondition) {
		return _vrConditionLocalService.deleteVRCondition(vrCondition);
	}

	/**
	* Deletes the vr condition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr condition
	* @return the vr condition that was removed
	* @throws PortalException if a vr condition with the primary key could not be found
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition deleteVRCondition(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrConditionLocalService.deleteVRCondition(id);
	}

	@Override
	public com.fds.vr.filterconfig.model.VRCondition fetchVRCondition(long id) {
		return _vrConditionLocalService.fetchVRCondition(id);
	}

	@Override
	public com.fds.vr.filterconfig.model.VRCondition getVRCondition(
		java.lang.String specificationCode)
		throws com.fds.vr.filterconfig.exception.NoSuchVRConditionException {
		return _vrConditionLocalService.getVRCondition(specificationCode);
	}

	/**
	* Returns the vr condition with the primary key.
	*
	* @param id the primary key of the vr condition
	* @return the vr condition
	* @throws PortalException if a vr condition with the primary key could not be found
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition getVRCondition(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrConditionLocalService.getVRCondition(id);
	}

	/**
	* Updates the vr condition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCondition the vr condition
	* @return the vr condition that was updated
	*/
	@Override
	public com.fds.vr.filterconfig.model.VRCondition updateVRCondition(
		com.fds.vr.filterconfig.model.VRCondition vrCondition) {
		return _vrConditionLocalService.updateVRCondition(vrCondition);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrConditionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrConditionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrConditionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrConditionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrConditionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr conditions.
	*
	* @return the number of vr conditions
	*/
	@Override
	public int getVRConditionsCount() {
		return _vrConditionLocalService.getVRConditionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrConditionLocalService.getOSGiServiceIdentifier();
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
		return _vrConditionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.filterconfig.model.impl.VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrConditionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.filterconfig.model.impl.VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrConditionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.filterconfig.model.VRCondition> getVRConditionByFilterModuleCode(
		java.lang.String filterModuleCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrConditionLocalService.getVRConditionByFilterModuleCode(filterModuleCode);
	}

	/**
	* Returns a range of all the vr conditions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.filterconfig.model.impl.VRConditionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr conditions
	* @param end the upper bound of the range of vr conditions (not inclusive)
	* @return the range of vr conditions
	*/
	@Override
	public java.util.List<com.fds.vr.filterconfig.model.VRCondition> getVRConditions(
		int start, int end) {
		return _vrConditionLocalService.getVRConditions(start, end);
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
		return _vrConditionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrConditionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRConditionLocalService getWrappedService() {
		return _vrConditionLocalService;
	}

	@Override
	public void setWrappedService(
		VRConditionLocalService vrConditionLocalService) {
		_vrConditionLocalService = vrConditionLocalService;
	}

	private VRConditionLocalService _vrConditionLocalService;
}