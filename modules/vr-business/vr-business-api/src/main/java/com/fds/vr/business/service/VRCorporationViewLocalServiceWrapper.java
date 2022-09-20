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
 * Provides a wrapper for {@link VRCorporationViewLocalService}.
 *
 * @author LamTV
 * @see VRCorporationViewLocalService
 * @generated
 */
@ProviderType
public class VRCorporationViewLocalServiceWrapper
	implements VRCorporationViewLocalService,
		ServiceWrapper<VRCorporationViewLocalService> {
	public VRCorporationViewLocalServiceWrapper(
		VRCorporationViewLocalService vrCorporationViewLocalService) {
		_vrCorporationViewLocalService = vrCorporationViewLocalService;
	}

	/**
	* Adds the vr corporation view to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was added
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView addVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return _vrCorporationViewLocalService.addVRCorporationView(vrCorporationView);
	}

	/**
	* Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	*
	* @param id the primary key for the new vr corporation view
	* @return the new vr corporation view
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView createVRCorporationView(
		long id) {
		return _vrCorporationViewLocalService.createVRCorporationView(id);
	}

	/**
	* Deletes the vr corporation view from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView deleteVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return _vrCorporationViewLocalService.deleteVRCorporationView(vrCorporationView);
	}

	/**
	* Deletes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view that was removed
	* @throws PortalException if a vr corporation view with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView deleteVRCorporationView(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCorporationViewLocalService.deleteVRCorporationView(id);
	}

	@Override
	public com.fds.vr.business.model.VRCorporationView fetchVRCorporationView(
		long id) {
		return _vrCorporationViewLocalService.fetchVRCorporationView(id);
	}

	@Override
	public com.fds.vr.business.model.VRCorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByCorporationIdAndIsLeader(corporationId,
			isLeader);
	}

	@Override
	public com.fds.vr.business.model.VRCorporationView findByInspectorIdCorporationIdIsLeader(
		java.lang.String corporationId, long inspectorId, int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByInspectorIdCorporationIdIsLeader(corporationId,
			inspectorId, isLeader);
	}

	/**
	* Returns the vr corporation view with the primary key.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view
	* @throws PortalException if a vr corporation view with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView getVRCorporationView(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCorporationViewLocalService.getVRCorporationView(id);
	}

	/**
	* Updates the vr corporation view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRCorporationView updateVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return _vrCorporationViewLocalService.updateVRCorporationView(vrCorporationView);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrCorporationViewLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrCorporationViewLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrCorporationViewLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCorporationViewLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCorporationViewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr corporation views.
	*
	* @return the number of vr corporation views
	*/
	@Override
	public int getVRCorporationViewsCount() {
		return _vrCorporationViewLocalService.getVRCorporationViewsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrCorporationViewLocalService.getOSGiServiceIdentifier();
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
		return _vrCorporationViewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrCorporationViewLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrCorporationViewLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCorporationView> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByCorporationId(corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCorporationView> findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByInspectorId(inspectorId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByInspectorIdCorporationId(corporationId,
			inspectorId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCorporationView> findByIsLeader(
		int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.findByIsLeader(isLeader);
	}

	/**
	* Returns a range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of vr corporation views
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRCorporationView> getVRCorporationViews(
		int start, int end) {
		return _vrCorporationViewLocalService.getVRCorporationViews(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrCorporationViewLocalService.counData(sql);
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
		return _vrCorporationViewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrCorporationViewLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCorporationViewLocalService getWrappedService() {
		return _vrCorporationViewLocalService;
	}

	@Override
	public void setWrappedService(
		VRCorporationViewLocalService vrCorporationViewLocalService) {
		_vrCorporationViewLocalService = vrCorporationViewLocalService;
	}

	private VRCorporationViewLocalService _vrCorporationViewLocalService;
}