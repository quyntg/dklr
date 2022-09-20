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
 * Provides a wrapper for {@link VRProductionClassificationLocalService}.
 *
 * @author LamTV
 * @see VRProductionClassificationLocalService
 * @generated
 */
@ProviderType
public class VRProductionClassificationLocalServiceWrapper
	implements VRProductionClassificationLocalService,
		ServiceWrapper<VRProductionClassificationLocalService> {
	public VRProductionClassificationLocalServiceWrapper(
		VRProductionClassificationLocalService vrProductionClassificationLocalService) {
		_vrProductionClassificationLocalService = vrProductionClassificationLocalService;
	}

	/**
	* Adds the vr production classification to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionClassification the vr production classification
	* @return the vr production classification that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification addVRProductionClassification(
		com.fds.vr.business.model.VRProductionClassification vrProductionClassification) {
		return _vrProductionClassificationLocalService.addVRProductionClassification(vrProductionClassification);
	}

	@Override
	public com.fds.vr.business.model.VRProductionClassification createVRProductionClassification(
		com.fds.vr.business.model.VRProductionClassification object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionClassificationLocalService.createVRProductionClassification(object);
	}

	/**
	* Creates a new vr production classification with the primary key. Does not add the vr production classification to the database.
	*
	* @param id the primary key for the new vr production classification
	* @return the new vr production classification
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification createVRProductionClassification(
		long id) {
		return _vrProductionClassificationLocalService.createVRProductionClassification(id);
	}

	/**
	* Deletes the vr production classification from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionClassification the vr production classification
	* @return the vr production classification that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification deleteVRProductionClassification(
		com.fds.vr.business.model.VRProductionClassification vrProductionClassification) {
		return _vrProductionClassificationLocalService.deleteVRProductionClassification(vrProductionClassification);
	}

	/**
	* Deletes the vr production classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production classification
	* @return the vr production classification that was removed
	* @throws PortalException if a vr production classification with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification deleteVRProductionClassification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionClassificationLocalService.deleteVRProductionClassification(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductionClassification fetchVRProductionClassification(
		long id) {
		return _vrProductionClassificationLocalService.fetchVRProductionClassification(id);
	}

	/**
	* Returns the vr production classification with the primary key.
	*
	* @param id the primary key of the vr production classification
	* @return the vr production classification
	* @throws PortalException if a vr production classification with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification getVRProductionClassification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionClassificationLocalService.getVRProductionClassification(id);
	}

	/**
	* Updates the vr production classification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionClassification the vr production classification
	* @return the vr production classification that was updated
	* @throws SystemException
	*/
	@Override
	public com.fds.vr.business.model.VRProductionClassification updateVRProductionClassification(
		com.fds.vr.business.model.VRProductionClassification vrProductionClassification)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionClassificationLocalService.updateVRProductionClassification(vrProductionClassification);
	}

	@Override
	public com.fds.vr.business.model.VRProductionClassification updateVRProductionClassification(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return _vrProductionClassificationLocalService.updateVRProductionClassification(mapValues,
			mtCore);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductionClassificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductionClassificationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductionClassificationLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionClassificationLocalService.findData(sql,
			columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionClassificationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductionClassificationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr production classifications.
	*
	* @return the number of vr production classifications
	*/
	@Override
	public int getVRProductionClassificationsCount() {
		return _vrProductionClassificationLocalService.getVRProductionClassificationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductionClassificationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionClassification> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData,
		java.lang.String productionPlantCode) {
		return _vrProductionClassificationLocalService.adminProcessData(arrayData,
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
		return _vrProductionClassificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionClassificationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductionClassificationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionClassification> findByProductionPlantCode(
		java.lang.String productionPlantCode) {
		return _vrProductionClassificationLocalService.findByProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns a range of all the vr production classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @return the range of vr production classifications
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductionClassification> getVRProductionClassifications(
		int start, int end) {
		return _vrProductionClassificationLocalService.getVRProductionClassifications(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductionClassificationLocalService.counData(sql);
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
		return _vrProductionClassificationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductionClassificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductionClassificationLocalService getWrappedService() {
		return _vrProductionClassificationLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductionClassificationLocalService vrProductionClassificationLocalService) {
		_vrProductionClassificationLocalService = vrProductionClassificationLocalService;
	}

	private VRProductionClassificationLocalService _vrProductionClassificationLocalService;
}