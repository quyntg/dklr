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
 * Provides a wrapper for {@link VRProductTypeLocalService}.
 *
 * @author LamTV
 * @see VRProductTypeLocalService
 * @generated
 */
@ProviderType
public class VRProductTypeLocalServiceWrapper
	implements VRProductTypeLocalService,
		ServiceWrapper<VRProductTypeLocalService> {
	public VRProductTypeLocalServiceWrapper(
		VRProductTypeLocalService vrProductTypeLocalService) {
		_vrProductTypeLocalService = vrProductTypeLocalService;
	}

	/**
	* Adds the vr product type to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductType the vr product type
	* @return the vr product type that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductType addVRProductType(
		com.fds.vr.business.model.VRProductType vrProductType) {
		return _vrProductTypeLocalService.addVRProductType(vrProductType);
	}

	@Override
	public com.fds.vr.business.model.VRProductType createVRProductType(
		com.fds.vr.business.model.VRProductType object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductTypeLocalService.createVRProductType(object);
	}

	/**
	* Creates a new vr product type with the primary key. Does not add the vr product type to the database.
	*
	* @param id the primary key for the new vr product type
	* @return the new vr product type
	*/
	@Override
	public com.fds.vr.business.model.VRProductType createVRProductType(long id) {
		return _vrProductTypeLocalService.createVRProductType(id);
	}

	/**
	* Deletes the vr product type from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductType the vr product type
	* @return the vr product type that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductType deleteVRProductType(
		com.fds.vr.business.model.VRProductType vrProductType) {
		return _vrProductTypeLocalService.deleteVRProductType(vrProductType);
	}

	/**
	* Deletes the vr product type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type that was removed
	* @throws PortalException if a vr product type with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductType deleteVRProductType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductTypeLocalService.deleteVRProductType(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductType fetchVRProductType(long id) {
		return _vrProductTypeLocalService.fetchVRProductType(id);
	}

	/**
	* Returns the vr product type with the primary key.
	*
	* @param id the primary key of the vr product type
	* @return the vr product type
	* @throws PortalException if a vr product type with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductType getVRProductType(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductTypeLocalService.getVRProductType(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductType updateProductType(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return _vrProductTypeLocalService.updateProductType(mapValues, mtCore);
	}

	/**
	* Updates the vr product type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductType the vr product type
	* @return the vr product type that was updated
	* @throws SystemException
	*/
	@Override
	public com.fds.vr.business.model.VRProductType updateVRProductType(
		com.fds.vr.business.model.VRProductType vrProductType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrProductTypeLocalService.updateVRProductType(vrProductType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr product types.
	*
	* @return the number of vr product types
	*/
	@Override
	public int getVRProductTypesCount() {
		return _vrProductTypeLocalService.getVRProductTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductTypeLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductType> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData,
		java.lang.String productionPlantCode) {
		return _vrProductTypeLocalService.adminProcessData(arrayData,
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
		return _vrProductTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductTypeLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductType> findByProductionPlantCode_ProductClassificationCode(
		java.lang.String productionPlantCode,
		java.lang.String productClassificationCode) {
		return _vrProductTypeLocalService.findByProductionPlantCode_ProductClassificationCode(productionPlantCode,
			productClassificationCode);
	}

	/**
	* Returns a range of all the vr product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product types
	* @param end the upper bound of the range of vr product types (not inclusive)
	* @return the range of vr product types
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductType> getVRProductTypes(
		int start, int end) {
		return _vrProductTypeLocalService.getVRProductTypes(start, end);
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
		return _vrProductTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductTypeLocalService getWrappedService() {
		return _vrProductTypeLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductTypeLocalService vrProductTypeLocalService) {
		_vrProductTypeLocalService = vrProductTypeLocalService;
	}

	private VRProductTypeLocalService _vrProductTypeLocalService;
}