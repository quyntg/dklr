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
 * Provides a wrapper for {@link VRProductionPlantSupplierLocalService}.
 *
 * @author LamTV
 * @see VRProductionPlantSupplierLocalService
 * @generated
 */
@ProviderType
public class VRProductionPlantSupplierLocalServiceWrapper
	implements VRProductionPlantSupplierLocalService,
		ServiceWrapper<VRProductionPlantSupplierLocalService> {
	public VRProductionPlantSupplierLocalServiceWrapper(
		VRProductionPlantSupplierLocalService vrProductionPlantSupplierLocalService) {
		_vrProductionPlantSupplierLocalService = vrProductionPlantSupplierLocalService;
	}

	/**
	* Adds the vr production plant supplier to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantSupplier the vr production plant supplier
	* @return the vr production plant supplier that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier addVRProductionPlantSupplier(
		com.fds.vr.business.model.VRProductionPlantSupplier vrProductionPlantSupplier) {
		return _vrProductionPlantSupplierLocalService.addVRProductionPlantSupplier(vrProductionPlantSupplier);
	}

	/**
	* Creates a new vr production plant supplier with the primary key. Does not add the vr production plant supplier to the database.
	*
	* @param id the primary key for the new vr production plant supplier
	* @return the new vr production plant supplier
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier createVRProductionPlantSupplier(
		long id) {
		return _vrProductionPlantSupplierLocalService.createVRProductionPlantSupplier(id);
	}

	/**
	* Deletes the vr production plant supplier from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantSupplier the vr production plant supplier
	* @return the vr production plant supplier that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier deleteVRProductionPlantSupplier(
		com.fds.vr.business.model.VRProductionPlantSupplier vrProductionPlantSupplier) {
		return _vrProductionPlantSupplierLocalService.deleteVRProductionPlantSupplier(vrProductionPlantSupplier);
	}

	/**
	* Deletes the vr production plant supplier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier that was removed
	* @throws PortalException if a vr production plant supplier with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier deleteVRProductionPlantSupplier(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantSupplierLocalService.deleteVRProductionPlantSupplier(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier fetchVRProductionPlantSupplier(
		long id) {
		return _vrProductionPlantSupplierLocalService.fetchVRProductionPlantSupplier(id);
	}

	/**
	* Returns the vr production plant supplier with the primary key.
	*
	* @param id the primary key of the vr production plant supplier
	* @return the vr production plant supplier
	* @throws PortalException if a vr production plant supplier with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier getVRProductionPlantSupplier(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantSupplierLocalService.getVRProductionPlantSupplier(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier updateProductionPlantSupplier(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues) {
		return _vrProductionPlantSupplierLocalService.updateProductionPlantSupplier(mapValues);
	}

	/**
	* Updates the vr production plant supplier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantSupplier the vr production plant supplier
	* @return the vr production plant supplier that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantSupplier updateVRProductionPlantSupplier(
		com.fds.vr.business.model.VRProductionPlantSupplier vrProductionPlantSupplier) {
		return _vrProductionPlantSupplierLocalService.updateVRProductionPlantSupplier(vrProductionPlantSupplier);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductionPlantSupplierLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductionPlantSupplierLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductionPlantSupplierLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantSupplierLocalService.findData(sql,
			columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantSupplierLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantSupplierLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr production plant suppliers.
	*
	* @return the number of vr production plant suppliers
	*/
	@Override
	public int getVRProductionPlantSuppliersCount() {
		return _vrProductionPlantSupplierLocalService.getVRProductionPlantSuppliersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionPlantSupplierLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlantSupplier> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData,
		java.lang.String productionPlantCode) {
		return _vrProductionPlantSupplierLocalService.adminProcessData(arrayData,
			productionPlantCode);
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
		return _vrProductionPlantSupplierLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantSupplierLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantSupplierLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the vr production plant suppliers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantSupplierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant suppliers
	* @param end the upper bound of the range of vr production plant suppliers (not inclusive)
	* @return the range of vr production plant suppliers
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlantSupplier> getVRProductionPlantSuppliers(
		int start, int end) {
		return _vrProductionPlantSupplierLocalService.getVRProductionPlantSuppliers(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantSupplierLocalService.counData(sql);
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
		return _vrProductionPlantSupplierLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductionPlantSupplierLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductionPlantSupplierLocalService getWrappedService() {
		return _vrProductionPlantSupplierLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductionPlantSupplierLocalService vrProductionPlantSupplierLocalService) {
		_vrProductionPlantSupplierLocalService = vrProductionPlantSupplierLocalService;
	}

	private VRProductionPlantSupplierLocalService _vrProductionPlantSupplierLocalService;
}