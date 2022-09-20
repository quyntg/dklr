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
 * Provides a wrapper for {@link VRMethodOfIssueLocalService}.
 *
 * @author LamTV
 * @see VRMethodOfIssueLocalService
 * @generated
 */
@ProviderType
public class VRMethodOfIssueLocalServiceWrapper
	implements VRMethodOfIssueLocalService,
		ServiceWrapper<VRMethodOfIssueLocalService> {
	public VRMethodOfIssueLocalServiceWrapper(
		VRMethodOfIssueLocalService vrMethodOfIssueLocalService) {
		_vrMethodOfIssueLocalService = vrMethodOfIssueLocalService;
	}

	/**
	* Adds the vr method of issue to the database. Also notifies the appropriate model listeners.
	*
	* @param vrMethodOfIssue the vr method of issue
	* @return the vr method of issue that was added
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue addVRMethodOfIssue(
		com.fds.vr.business.model.VRMethodOfIssue vrMethodOfIssue) {
		return _vrMethodOfIssueLocalService.addVRMethodOfIssue(vrMethodOfIssue);
	}

	/**
	* Creates a new vr method of issue with the primary key. Does not add the vr method of issue to the database.
	*
	* @param id the primary key for the new vr method of issue
	* @return the new vr method of issue
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue createVRMethodOfIssue(
		long id) {
		return _vrMethodOfIssueLocalService.createVRMethodOfIssue(id);
	}

	/**
	* Deletes the vr method of issue from the database. Also notifies the appropriate model listeners.
	*
	* @param vrMethodOfIssue the vr method of issue
	* @return the vr method of issue that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue deleteVRMethodOfIssue(
		com.fds.vr.business.model.VRMethodOfIssue vrMethodOfIssue) {
		return _vrMethodOfIssueLocalService.deleteVRMethodOfIssue(vrMethodOfIssue);
	}

	/**
	* Deletes the vr method of issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue that was removed
	* @throws PortalException if a vr method of issue with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue deleteVRMethodOfIssue(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMethodOfIssueLocalService.deleteVRMethodOfIssue(id);
	}

	@Override
	public com.fds.vr.business.model.VRMethodOfIssue fetchByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) {
		return _vrMethodOfIssueLocalService.fetchByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

	@Override
	public com.fds.vr.business.model.VRMethodOfIssue fetchByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId) {
		return _vrMethodOfIssueLocalService.fetchByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
	}

	@Override
	public com.fds.vr.business.model.VRMethodOfIssue fetchVRMethodOfIssue(
		long id) {
		return _vrMethodOfIssueLocalService.fetchVRMethodOfIssue(id);
	}

	/**
	* Returns the vr method of issue with the primary key.
	*
	* @param id the primary key of the vr method of issue
	* @return the vr method of issue
	* @throws PortalException if a vr method of issue with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue getVRMethodOfIssue(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMethodOfIssueLocalService.getVRMethodOfIssue(id);
	}

	/**
	* Updates the vr method of issue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrMethodOfIssue the vr method of issue
	* @return the vr method of issue that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRMethodOfIssue updateVRMethodOfIssue(
		com.fds.vr.business.model.VRMethodOfIssue vrMethodOfIssue) {
		return _vrMethodOfIssueLocalService.updateVRMethodOfIssue(vrMethodOfIssue);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrMethodOfIssueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrMethodOfIssueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrMethodOfIssueLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMethodOfIssueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMethodOfIssueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr method of issues.
	*
	* @return the number of vr method of issues
	*/
	@Override
	public int getVRMethodOfIssuesCount() {
		return _vrMethodOfIssueLocalService.getVRMethodOfIssuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrMethodOfIssueLocalService.getOSGiServiceIdentifier();
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
		return _vrMethodOfIssueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrMethodOfIssueLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrMethodOfIssueLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the vr method of issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMethodOfIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr method of issues
	* @param end the upper bound of the range of vr method of issues (not inclusive)
	* @return the range of vr method of issues
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRMethodOfIssue> getVRMethodOfIssues(
		int start, int end) {
		return _vrMethodOfIssueLocalService.getVRMethodOfIssues(start, end);
	}

	@Override
	public long countByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(
		java.lang.String certifiedAssemblyType,
		java.lang.String productionPlantCode, java.lang.String vehicleClass,
		long applicantProfileId) {
		return _vrMethodOfIssueLocalService.countByCertifiedAssemblyTypeProductionPlantCodeVehicleClassApplicantProfileId(certifiedAssemblyType,
			productionPlantCode, vehicleClass, applicantProfileId);
	}

	@Override
	public long countByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(
		java.lang.String certifiedAssemblyType, long productionPlantId,
		java.lang.String vehicleClass, long applicantProfileId) {
		return _vrMethodOfIssueLocalService.countByCertifiedAssemblyTypeProductionPlantIdVehicleClassApplicantProfileId(certifiedAssemblyType,
			productionPlantId, vehicleClass, applicantProfileId);
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
		return _vrMethodOfIssueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrMethodOfIssueLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRMethodOfIssueLocalService getWrappedService() {
		return _vrMethodOfIssueLocalService;
	}

	@Override
	public void setWrappedService(
		VRMethodOfIssueLocalService vrMethodOfIssueLocalService) {
		_vrMethodOfIssueLocalService = vrMethodOfIssueLocalService;
	}

	private VRMethodOfIssueLocalService _vrMethodOfIssueLocalService;
}