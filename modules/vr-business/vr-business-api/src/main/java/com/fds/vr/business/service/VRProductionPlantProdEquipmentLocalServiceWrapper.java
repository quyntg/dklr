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
 * Provides a wrapper for {@link VRProductionPlantProdEquipmentLocalService}.
 *
 * @author LamTV
 * @see VRProductionPlantProdEquipmentLocalService
 * @generated
 */
@ProviderType
public class VRProductionPlantProdEquipmentLocalServiceWrapper
	implements VRProductionPlantProdEquipmentLocalService,
		ServiceWrapper<VRProductionPlantProdEquipmentLocalService> {
	public VRProductionPlantProdEquipmentLocalServiceWrapper(
		VRProductionPlantProdEquipmentLocalService vrProductionPlantProdEquipmentLocalService) {
		_vrProductionPlantProdEquipmentLocalService = vrProductionPlantProdEquipmentLocalService;
	}

	/**
	* Adds the vr production plant prod equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantProdEquipment the vr production plant prod equipment
	* @return the vr production plant prod equipment that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment addVRProductionPlantProdEquipment(
		com.fds.vr.business.model.VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		return _vrProductionPlantProdEquipmentLocalService.addVRProductionPlantProdEquipment(vrProductionPlantProdEquipment);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment createVRProductionPlantProdEquipment(
		com.fds.vr.business.model.VRProductionPlantProdEquipment object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantProdEquipmentLocalService.createVRProductionPlantProdEquipment(object);
	}

	/**
	* Creates a new vr production plant prod equipment with the primary key. Does not add the vr production plant prod equipment to the database.
	*
	* @param id the primary key for the new vr production plant prod equipment
	* @return the new vr production plant prod equipment
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment createVRProductionPlantProdEquipment(
		long id) {
		return _vrProductionPlantProdEquipmentLocalService.createVRProductionPlantProdEquipment(id);
	}

	/**
	* Deletes the vr production plant prod equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantProdEquipment the vr production plant prod equipment
	* @return the vr production plant prod equipment that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment deleteVRProductionPlantProdEquipment(
		com.fds.vr.business.model.VRProductionPlantProdEquipment vrProductionPlantProdEquipment) {
		return _vrProductionPlantProdEquipmentLocalService.deleteVRProductionPlantProdEquipment(vrProductionPlantProdEquipment);
	}

	/**
	* Deletes the vr production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant prod equipment
	* @return the vr production plant prod equipment that was removed
	* @throws PortalException if a vr production plant prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment deleteVRProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantProdEquipmentLocalService.deleteVRProductionPlantProdEquipment(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment fetchVRProductionPlantProdEquipment(
		long id) {
		return _vrProductionPlantProdEquipmentLocalService.fetchVRProductionPlantProdEquipment(id);
	}

	/**
	* Returns the vr production plant prod equipment with the primary key.
	*
	* @param id the primary key of the vr production plant prod equipment
	* @return the vr production plant prod equipment
	* @throws PortalException if a vr production plant prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment getVRProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantProdEquipmentLocalService.getVRProductionPlantProdEquipment(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment updateProductionPlantProdEquipment(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return _vrProductionPlantProdEquipmentLocalService.updateProductionPlantProdEquipment(mapValues,
			mtCore);
	}

	/**
	* Updates the vr production plant prod equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantProdEquipment the vr production plant prod equipment
	* @return the vr production plant prod equipment that was updated
	* @throws SystemException
	*/
	@Override
	public com.fds.vr.business.model.VRProductionPlantProdEquipment updateVRProductionPlantProdEquipment(
		com.fds.vr.business.model.VRProductionPlantProdEquipment vrProductionPlantProdEquipment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantProdEquipmentLocalService.updateVRProductionPlantProdEquipment(vrProductionPlantProdEquipment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductionPlantProdEquipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductionPlantProdEquipmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductionPlantProdEquipmentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantProdEquipmentLocalService.findData(sql,
			columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantProdEquipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionPlantProdEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr production plant prod equipments.
	*
	* @return the number of vr production plant prod equipments
	*/
	@Override
	public int getVRProductionPlantProdEquipmentsCount() {
		return _vrProductionPlantProdEquipmentLocalService.getVRProductionPlantProdEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionPlantProdEquipmentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlantProdEquipment> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData,
		java.lang.String productionPlantCode) {
		return _vrProductionPlantProdEquipmentLocalService.adminProcessData(arrayData,
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
		return _vrProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionPlantProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlantProdEquipment> findByProductionPlanCode(
		java.lang.String productionPlantCode) {
		return _vrProductionPlantProdEquipmentLocalService.findByProductionPlanCode(productionPlantCode);
	}

	/**
	* Returns a range of all the vr production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant prod equipments
	* @param end the upper bound of the range of vr production plant prod equipments (not inclusive)
	* @return the range of vr production plant prod equipments
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionPlantProdEquipment> getVRProductionPlantProdEquipments(
		int start, int end) {
		return _vrProductionPlantProdEquipmentLocalService.getVRProductionPlantProdEquipments(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionPlantProdEquipmentLocalService.counData(sql);
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
		return _vrProductionPlantProdEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductionPlantProdEquipmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductionPlantProdEquipmentLocalService getWrappedService() {
		return _vrProductionPlantProdEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductionPlantProdEquipmentLocalService vrProductionPlantProdEquipmentLocalService) {
		_vrProductionPlantProdEquipmentLocalService = vrProductionPlantProdEquipmentLocalService;
	}

	private VRProductionPlantProdEquipmentLocalService _vrProductionPlantProdEquipmentLocalService;
}