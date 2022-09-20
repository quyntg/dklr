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
 * Provides a wrapper for {@link VRVehicleEquipmentLocalService}.
 *
 * @author LamTV
 * @see VRVehicleEquipmentLocalService
 * @generated
 */
@ProviderType
public class VRVehicleEquipmentLocalServiceWrapper
	implements VRVehicleEquipmentLocalService,
		ServiceWrapper<VRVehicleEquipmentLocalService> {
	public VRVehicleEquipmentLocalServiceWrapper(
		VRVehicleEquipmentLocalService vrVehicleEquipmentLocalService) {
		_vrVehicleEquipmentLocalService = vrVehicleEquipmentLocalService;
	}

	/**
	* Adds the vr vehicle equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleEquipment the vr vehicle equipment
	* @return the vr vehicle equipment that was added
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment addVRVehicleEquipment(
		com.fds.vr.business.model.VRVehicleEquipment vrVehicleEquipment) {
		return _vrVehicleEquipmentLocalService.addVRVehicleEquipment(vrVehicleEquipment);
	}

	/**
	* Creates a new vr vehicle equipment with the primary key. Does not add the vr vehicle equipment to the database.
	*
	* @param id the primary key for the new vr vehicle equipment
	* @return the new vr vehicle equipment
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment createVRVehicleEquipment(
		long id) {
		return _vrVehicleEquipmentLocalService.createVRVehicleEquipment(id);
	}

	/**
	* Deletes the vr vehicle equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleEquipment the vr vehicle equipment
	* @return the vr vehicle equipment that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment deleteVRVehicleEquipment(
		com.fds.vr.business.model.VRVehicleEquipment vrVehicleEquipment) {
		return _vrVehicleEquipmentLocalService.deleteVRVehicleEquipment(vrVehicleEquipment);
	}

	/**
	* Deletes the vr vehicle equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment that was removed
	* @throws PortalException if a vr vehicle equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment deleteVRVehicleEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleEquipmentLocalService.deleteVRVehicleEquipment(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleEquipment fetchVRVehicleEquipment(
		long id) {
		return _vrVehicleEquipmentLocalService.fetchVRVehicleEquipment(id);
	}

	/**
	* Returns the vr vehicle equipment with the primary key.
	*
	* @param id the primary key of the vr vehicle equipment
	* @return the vr vehicle equipment
	* @throws PortalException if a vr vehicle equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment getVRVehicleEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleEquipmentLocalService.getVRVehicleEquipment(id);
	}

	/**
	* Updates the vr vehicle equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleEquipment the vr vehicle equipment
	* @return the vr vehicle equipment that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleEquipment updateVRVehicleEquipment(
		com.fds.vr.business.model.VRVehicleEquipment vrVehicleEquipment) {
		return _vrVehicleEquipmentLocalService.updateVRVehicleEquipment(vrVehicleEquipment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrVehicleEquipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrVehicleEquipmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrVehicleEquipmentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleEquipmentLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleEquipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle equipments.
	*
	* @return the number of vr vehicle equipments
	*/
	@Override
	public int getVRVehicleEquipmentsCount() {
		return _vrVehicleEquipmentLocalService.getVRVehicleEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrVehicleEquipmentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleEquipment> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore) {
		return _vrVehicleEquipmentLocalService.adminProcessData(arrayData,
			dossierId, mtCore);
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
		return _vrVehicleEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleEquipment> findByDossierId(
		long dossierId, int start, int end) {
		return _vrVehicleEquipmentLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleEquipment> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrVehicleEquipmentLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr vehicle equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle equipments
	* @param end the upper bound of the range of vr vehicle equipments (not inclusive)
	* @return the range of vr vehicle equipments
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleEquipment> getVRVehicleEquipments(
		int start, int end) {
		return _vrVehicleEquipmentLocalService.getVRVehicleEquipments(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleEquipmentLocalService.counData(sql);
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
		return _vrVehicleEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrVehicleEquipmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRVehicleEquipmentLocalService getWrappedService() {
		return _vrVehicleEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		VRVehicleEquipmentLocalService vrVehicleEquipmentLocalService) {
		_vrVehicleEquipmentLocalService = vrVehicleEquipmentLocalService;
	}

	private VRVehicleEquipmentLocalService _vrVehicleEquipmentLocalService;
}