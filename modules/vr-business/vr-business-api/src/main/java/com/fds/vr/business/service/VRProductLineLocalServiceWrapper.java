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
 * Provides a wrapper for {@link VRProductLineLocalService}.
 *
 * @author LamTV
 * @see VRProductLineLocalService
 * @generated
 */
@ProviderType
public class VRProductLineLocalServiceWrapper
	implements VRProductLineLocalService,
		ServiceWrapper<VRProductLineLocalService> {
	public VRProductLineLocalServiceWrapper(
		VRProductLineLocalService vrProductLineLocalService) {
		_vrProductLineLocalService = vrProductLineLocalService;
	}

	/**
	* Adds the vr product line to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductLine the vr product line
	* @return the vr product line that was added
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine addVRProductLine(
		com.fds.vr.business.model.VRProductLine vrProductLine) {
		return _vrProductLineLocalService.addVRProductLine(vrProductLine);
	}

	/**
	* Creates a new vr product line with the primary key. Does not add the vr product line to the database.
	*
	* @param id the primary key for the new vr product line
	* @return the new vr product line
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine createVRProductLine(long id) {
		return _vrProductLineLocalService.createVRProductLine(id);
	}

	/**
	* Deletes the vr product line from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductLine the vr product line
	* @return the vr product line that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine deleteVRProductLine(
		com.fds.vr.business.model.VRProductLine vrProductLine) {
		return _vrProductLineLocalService.deleteVRProductLine(vrProductLine);
	}

	/**
	* Deletes the vr product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line that was removed
	* @throws PortalException if a vr product line with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine deleteVRProductLine(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductLineLocalService.deleteVRProductLine(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductLine fetchVRProductLine(long id) {
		return _vrProductLineLocalService.fetchVRProductLine(id);
	}

	/**
	* Returns the vr product line with the primary key.
	*
	* @param id the primary key of the vr product line
	* @return the vr product line
	* @throws PortalException if a vr product line with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine getVRProductLine(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductLineLocalService.getVRProductLine(id);
	}

	@Override
	public com.fds.vr.business.model.VRProductLine updateProductLine(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues) {
		return _vrProductLineLocalService.updateProductLine(mapValues);
	}

	/**
	* Updates the vr product line in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductLine the vr product line
	* @return the vr product line that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRProductLine updateVRProductLine(
		com.fds.vr.business.model.VRProductLine vrProductLine) {
		return _vrProductLineLocalService.updateVRProductLine(vrProductLine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrProductLineLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrProductLineLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrProductLineLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductLineLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrProductLineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr product lines.
	*
	* @return the number of vr product lines
	*/
	@Override
	public int getVRProductLinesCount() {
		return _vrProductLineLocalService.getVRProductLinesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrProductLineLocalService.getOSGiServiceIdentifier();
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
		return _vrProductLineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductLineLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrProductLineLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRProductLine> findByproductPlantID(
		long mtCore, long productPlantID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrProductLineLocalService.findByproductPlantID(mtCore,
			productPlantID);
	}

	/**
	* Returns a range of all the vr product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product lines
	* @param end the upper bound of the range of vr product lines (not inclusive)
	* @return the range of vr product lines
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRProductLine> getVRProductLines(
		int start, int end) {
		return _vrProductLineLocalService.getVRProductLines(start, end);
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
		return _vrProductLineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrProductLineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRProductLineLocalService getWrappedService() {
		return _vrProductLineLocalService;
	}

	@Override
	public void setWrappedService(
		VRProductLineLocalService vrProductLineLocalService) {
		_vrProductLineLocalService = vrProductLineLocalService;
	}

	private VRProductLineLocalService _vrProductLineLocalService;
}