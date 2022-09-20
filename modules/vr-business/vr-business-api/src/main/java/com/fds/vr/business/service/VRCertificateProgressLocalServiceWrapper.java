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
 * Provides a wrapper for {@link VRCertificateProgressLocalService}.
 *
 * @author LamTV
 * @see VRCertificateProgressLocalService
 * @generated
 */
@ProviderType
public class VRCertificateProgressLocalServiceWrapper
	implements VRCertificateProgressLocalService,
		ServiceWrapper<VRCertificateProgressLocalService> {
	public VRCertificateProgressLocalServiceWrapper(
		VRCertificateProgressLocalService vrCertificateProgressLocalService) {
		_vrCertificateProgressLocalService = vrCertificateProgressLocalService;
	}

	/**
	* Adds the vr certificate progress to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgress the vr certificate progress
	* @return the vr certificate progress that was added
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress addVRCertificateProgress(
		com.fds.vr.business.model.VRCertificateProgress vrCertificateProgress) {
		return _vrCertificateProgressLocalService.addVRCertificateProgress(vrCertificateProgress);
	}

	/**
	* Creates a new vr certificate progress with the primary key. Does not add the vr certificate progress to the database.
	*
	* @param id the primary key for the new vr certificate progress
	* @return the new vr certificate progress
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress createVRCertificateProgress(
		long id) {
		return _vrCertificateProgressLocalService.createVRCertificateProgress(id);
	}

	/**
	* Deletes the vr certificate progress from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgress the vr certificate progress
	* @return the vr certificate progress that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress deleteVRCertificateProgress(
		com.fds.vr.business.model.VRCertificateProgress vrCertificateProgress) {
		return _vrCertificateProgressLocalService.deleteVRCertificateProgress(vrCertificateProgress);
	}

	/**
	* Deletes the vr certificate progress with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress that was removed
	* @throws PortalException if a vr certificate progress with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress deleteVRCertificateProgress(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCertificateProgressLocalService.deleteVRCertificateProgress(id);
	}

	@Override
	public com.fds.vr.business.model.VRCertificateProgress fetchVRCertificateProgress(
		long id) {
		return _vrCertificateProgressLocalService.fetchVRCertificateProgress(id);
	}

	/**
	* Returns the vr certificate progress with the primary key.
	*
	* @param id the primary key of the vr certificate progress
	* @return the vr certificate progress
	* @throws PortalException if a vr certificate progress with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress getVRCertificateProgress(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCertificateProgressLocalService.getVRCertificateProgress(id);
	}

	/**
	* Updates the vr certificate progress in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgress the vr certificate progress
	* @return the vr certificate progress that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRCertificateProgress updateVRCertificateProgress(
		com.fds.vr.business.model.VRCertificateProgress vrCertificateProgress) {
		return _vrCertificateProgressLocalService.updateVRCertificateProgress(vrCertificateProgress);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrCertificateProgressLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrCertificateProgressLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrCertificateProgressLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCertificateProgressLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrCertificateProgressLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr certificate progresses.
	*
	* @return the number of vr certificate progresses
	*/
	@Override
	public int getVRCertificateProgressesCount() {
		return _vrCertificateProgressLocalService.getVRCertificateProgressesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrCertificateProgressLocalService.getOSGiServiceIdentifier();
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
		return _vrCertificateProgressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrCertificateProgressLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrCertificateProgressLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the vr certificate progresses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progresses
	* @param end the upper bound of the range of vr certificate progresses (not inclusive)
	* @return the range of vr certificate progresses
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRCertificateProgress> getVRCertificateProgresses(
		int start, int end) {
		return _vrCertificateProgressLocalService.getVRCertificateProgresses(start,
			end);
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
		return _vrCertificateProgressLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrCertificateProgressLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCertificateProgressLocalService getWrappedService() {
		return _vrCertificateProgressLocalService;
	}

	@Override
	public void setWrappedService(
		VRCertificateProgressLocalService vrCertificateProgressLocalService) {
		_vrCertificateProgressLocalService = vrCertificateProgressLocalService;
	}

	private VRCertificateProgressLocalService _vrCertificateProgressLocalService;
}