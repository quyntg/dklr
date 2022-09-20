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
 * Provides a wrapper for {@link VRLimitConfigTechSpecLocalService}.
 *
 * @author LamTV
 * @see VRLimitConfigTechSpecLocalService
 * @generated
 */
@ProviderType
public class VRLimitConfigTechSpecLocalServiceWrapper
	implements VRLimitConfigTechSpecLocalService,
		ServiceWrapper<VRLimitConfigTechSpecLocalService> {
	public VRLimitConfigTechSpecLocalServiceWrapper(
		VRLimitConfigTechSpecLocalService vrLimitConfigTechSpecLocalService) {
		_vrLimitConfigTechSpecLocalService = vrLimitConfigTechSpecLocalService;
	}

	/**
	* Adds the vr limit config tech spec to the database. Also notifies the appropriate model listeners.
	*
	* @param vrLimitConfigTechSpec the vr limit config tech spec
	* @return the vr limit config tech spec that was added
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec addVRLimitConfigTechSpec(
		com.fds.vr.business.model.VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return _vrLimitConfigTechSpecLocalService.addVRLimitConfigTechSpec(vrLimitConfigTechSpec);
	}

	/**
	* Creates a new vr limit config tech spec with the primary key. Does not add the vr limit config tech spec to the database.
	*
	* @param id the primary key for the new vr limit config tech spec
	* @return the new vr limit config tech spec
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec createVRLimitConfigTechSpec(
		long id) {
		return _vrLimitConfigTechSpecLocalService.createVRLimitConfigTechSpec(id);
	}

	/**
	* Deletes the vr limit config tech spec from the database. Also notifies the appropriate model listeners.
	*
	* @param vrLimitConfigTechSpec the vr limit config tech spec
	* @return the vr limit config tech spec that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec deleteVRLimitConfigTechSpec(
		com.fds.vr.business.model.VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return _vrLimitConfigTechSpecLocalService.deleteVRLimitConfigTechSpec(vrLimitConfigTechSpec);
	}

	/**
	* Deletes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec that was removed
	* @throws PortalException if a vr limit config tech spec with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec deleteVRLimitConfigTechSpec(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrLimitConfigTechSpecLocalService.deleteVRLimitConfigTechSpec(id);
	}

	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec fetchVRLimitConfigTechSpec(
		long id) {
		return _vrLimitConfigTechSpecLocalService.fetchVRLimitConfigTechSpec(id);
	}

	/**
	* Returns the vr limit config tech spec with the primary key.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec
	* @throws PortalException if a vr limit config tech spec with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec getVRLimitConfigTechSpec(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrLimitConfigTechSpecLocalService.getVRLimitConfigTechSpec(id);
	}

	/**
	* Updates the vr limit config tech spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrLimitConfigTechSpec the vr limit config tech spec
	* @return the vr limit config tech spec that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRLimitConfigTechSpec updateVRLimitConfigTechSpec(
		com.fds.vr.business.model.VRLimitConfigTechSpec vrLimitConfigTechSpec) {
		return _vrLimitConfigTechSpecLocalService.updateVRLimitConfigTechSpec(vrLimitConfigTechSpec);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrLimitConfigTechSpecLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrLimitConfigTechSpecLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrLimitConfigTechSpecLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrLimitConfigTechSpecLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrLimitConfigTechSpecLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr limit config tech specs.
	*
	* @return the number of vr limit config tech specs
	*/
	@Override
	public int getVRLimitConfigTechSpecsCount() {
		return _vrLimitConfigTechSpecLocalService.getVRLimitConfigTechSpecsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrLimitConfigTechSpecLocalService.getOSGiServiceIdentifier();
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
		return _vrLimitConfigTechSpecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrLimitConfigTechSpecLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrLimitConfigTechSpecLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRLimitConfigTechSpec> getLimitConfigs(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrLimitConfigTechSpecLocalService.getLimitConfigs(vehicleType,
			markupSMRM, searchingDriveConfig);
	}

	/**
	* Returns a range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @return the range of vr limit config tech specs
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRLimitConfigTechSpec> getVRLimitConfigTechSpecs(
		int start, int end) {
		return _vrLimitConfigTechSpecLocalService.getVRLimitConfigTechSpecs(start,
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
		return _vrLimitConfigTechSpecLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrLimitConfigTechSpecLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRLimitConfigTechSpecLocalService getWrappedService() {
		return _vrLimitConfigTechSpecLocalService;
	}

	@Override
	public void setWrappedService(
		VRLimitConfigTechSpecLocalService vrLimitConfigTechSpecLocalService) {
		_vrLimitConfigTechSpecLocalService = vrLimitConfigTechSpecLocalService;
	}

	private VRLimitConfigTechSpecLocalService _vrLimitConfigTechSpecLocalService;
}