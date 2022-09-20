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
 * Provides a wrapper for {@link VRSyncDateLocalService}.
 *
 * @author LamTV
 * @see VRSyncDateLocalService
 * @generated
 */
@ProviderType
public class VRSyncDateLocalServiceWrapper implements VRSyncDateLocalService,
	ServiceWrapper<VRSyncDateLocalService> {
	public VRSyncDateLocalServiceWrapper(
		VRSyncDateLocalService vrSyncDateLocalService) {
		_vrSyncDateLocalService = vrSyncDateLocalService;
	}

	/**
	* Adds the vr sync date to the database. Also notifies the appropriate model listeners.
	*
	* @param vrSyncDate the vr sync date
	* @return the vr sync date that was added
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate addVRSyncDate(
		com.fds.vr.business.model.VRSyncDate vrSyncDate) {
		return _vrSyncDateLocalService.addVRSyncDate(vrSyncDate);
	}

	/**
	* Creates a new vr sync date with the primary key. Does not add the vr sync date to the database.
	*
	* @param id the primary key for the new vr sync date
	* @return the new vr sync date
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate createVRSyncDate(long id) {
		return _vrSyncDateLocalService.createVRSyncDate(id);
	}

	/**
	* Deletes the vr sync date from the database. Also notifies the appropriate model listeners.
	*
	* @param vrSyncDate the vr sync date
	* @return the vr sync date that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate deleteVRSyncDate(
		com.fds.vr.business.model.VRSyncDate vrSyncDate) {
		return _vrSyncDateLocalService.deleteVRSyncDate(vrSyncDate);
	}

	/**
	* Deletes the vr sync date with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date that was removed
	* @throws PortalException if a vr sync date with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate deleteVRSyncDate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrSyncDateLocalService.deleteVRSyncDate(id);
	}

	@Override
	public com.fds.vr.business.model.VRSyncDate fetchVRSyncDate(long id) {
		return _vrSyncDateLocalService.fetchVRSyncDate(id);
	}

	/**
	* Returns the vr sync date with the primary key.
	*
	* @param id the primary key of the vr sync date
	* @return the vr sync date
	* @throws PortalException if a vr sync date with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate getVRSyncDate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrSyncDateLocalService.getVRSyncDate(id);
	}

	@Override
	public com.fds.vr.business.model.VRSyncDate updateSyncDate(
		java.util.Date modifiedDate) {
		return _vrSyncDateLocalService.updateSyncDate(modifiedDate);
	}

	/**
	* Updates the vr sync date in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrSyncDate the vr sync date
	* @return the vr sync date that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRSyncDate updateVRSyncDate(
		com.fds.vr.business.model.VRSyncDate vrSyncDate) {
		return _vrSyncDateLocalService.updateVRSyncDate(vrSyncDate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrSyncDateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrSyncDateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrSyncDateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrSyncDateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrSyncDateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr sync dates.
	*
	* @return the number of vr sync dates
	*/
	@Override
	public int getVRSyncDatesCount() {
		return _vrSyncDateLocalService.getVRSyncDatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrSyncDateLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.Date getSyncDate() {
		return _vrSyncDateLocalService.getSyncDate();
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
		return _vrSyncDateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrSyncDateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrSyncDateLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vr sync dates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRSyncDateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr sync dates
	* @param end the upper bound of the range of vr sync dates (not inclusive)
	* @return the range of vr sync dates
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRSyncDate> getVRSyncDates(
		int start, int end) {
		return _vrSyncDateLocalService.getVRSyncDates(start, end);
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
		return _vrSyncDateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrSyncDateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRSyncDateLocalService getWrappedService() {
		return _vrSyncDateLocalService;
	}

	@Override
	public void setWrappedService(VRSyncDateLocalService vrSyncDateLocalService) {
		_vrSyncDateLocalService = vrSyncDateLocalService;
	}

	private VRSyncDateLocalService _vrSyncDateLocalService;
}