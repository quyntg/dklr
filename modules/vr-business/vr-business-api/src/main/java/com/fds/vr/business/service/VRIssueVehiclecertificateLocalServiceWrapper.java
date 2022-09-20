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
 * Provides a wrapper for {@link VRIssueVehiclecertificateLocalService}.
 *
 * @author LamTV
 * @see VRIssueVehiclecertificateLocalService
 * @generated
 */
@ProviderType
public class VRIssueVehiclecertificateLocalServiceWrapper
	implements VRIssueVehiclecertificateLocalService,
		ServiceWrapper<VRIssueVehiclecertificateLocalService> {
	public VRIssueVehiclecertificateLocalServiceWrapper(
		VRIssueVehiclecertificateLocalService vrIssueVehiclecertificateLocalService) {
		_vrIssueVehiclecertificateLocalService = vrIssueVehiclecertificateLocalService;
	}

	/**
	* Adds the vr issue vehiclecertificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was added
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate addVRIssueVehiclecertificate(
		com.fds.vr.business.model.VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return _vrIssueVehiclecertificateLocalService.addVRIssueVehiclecertificate(vrIssueVehiclecertificate);
	}

	/**
	* Creates a new vr issue vehiclecertificate with the primary key. Does not add the vr issue vehiclecertificate to the database.
	*
	* @param id the primary key for the new vr issue vehiclecertificate
	* @return the new vr issue vehiclecertificate
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate createVRIssueVehiclecertificate(
		long id) {
		return _vrIssueVehiclecertificateLocalService.createVRIssueVehiclecertificate(id);
	}

	/**
	* Deletes the vr issue vehiclecertificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate deleteVRIssueVehiclecertificate(
		com.fds.vr.business.model.VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return _vrIssueVehiclecertificateLocalService.deleteVRIssueVehiclecertificate(vrIssueVehiclecertificate);
	}

	/**
	* Deletes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	* @throws PortalException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate deleteVRIssueVehiclecertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueVehiclecertificateLocalService.deleteVRIssueVehiclecertificate(id);
	}

	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate fetchVRIssueVehiclecertificate(
		long id) {
		return _vrIssueVehiclecertificateLocalService.fetchVRIssueVehiclecertificate(id);
	}

	/**
	* Returns the vr issue vehiclecertificate with the primary key.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate
	* @throws PortalException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate getVRIssueVehiclecertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueVehiclecertificateLocalService.getVRIssueVehiclecertificate(id);
	}

	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate updateVRIssueVehicleCertificate(
		java.util.Map<java.lang.String, java.lang.String> mapValue, int mtCore) {
		return _vrIssueVehiclecertificateLocalService.updateVRIssueVehicleCertificate(mapValue,
			mtCore);
	}

	/**
	* Updates the vr issue vehiclecertificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRIssueVehiclecertificate updateVRIssueVehiclecertificate(
		com.fds.vr.business.model.VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return _vrIssueVehiclecertificateLocalService.updateVRIssueVehiclecertificate(vrIssueVehiclecertificate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrIssueVehiclecertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrIssueVehiclecertificateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrIssueVehiclecertificateLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueVehiclecertificateLocalService.findData(sql,
			columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject adminProcess(
		com.liferay.portal.kernel.json.JSONArray arrayData, long issueId,
		long dossierId, long mtCore, java.lang.String issueType)
		throws java.lang.Exception {
		return _vrIssueVehiclecertificateLocalService.adminProcess(arrayData,
			issueId, dossierId, mtCore, issueType);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueVehiclecertificateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueVehiclecertificateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr issue vehiclecertificates.
	*
	* @return the number of vr issue vehiclecertificates
	*/
	@Override
	public int getVRIssueVehiclecertificatesCount() {
		return _vrIssueVehiclecertificateLocalService.getVRIssueVehiclecertificatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrIssueVehiclecertificateLocalService.getOSGiServiceIdentifier();
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
		return _vrIssueVehiclecertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrIssueVehiclecertificateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrIssueVehiclecertificateLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssueVehiclecertificate> findByIssueId(
		long issueId, int start, int end) {
		return _vrIssueVehiclecertificateLocalService.findByIssueId(issueId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssueVehiclecertificate> findByIssueId_MtCore(
		long mtCore, long issueId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueVehiclecertificateLocalService.findByIssueId_MtCore(mtCore,
			issueId, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueVehiclecertificateLocalService.findBycertificateId(mtCore,
			dossierId, certificateId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssueVehiclecertificate> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueVehiclecertificateLocalService.findBydossierId(mtCore,
			dossierId);
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of vr issue vehiclecertificates
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRIssueVehiclecertificate> getVRIssueVehiclecertificates(
		int start, int end) {
		return _vrIssueVehiclecertificateLocalService.getVRIssueVehiclecertificates(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueVehiclecertificateLocalService.counData(sql);
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
		return _vrIssueVehiclecertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrIssueVehiclecertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void deleteBydossierId(long mtCore, long dossierId) {
		_vrIssueVehiclecertificateLocalService.deleteBydossierId(mtCore,
			dossierId);
	}

	@Override
	public VRIssueVehiclecertificateLocalService getWrappedService() {
		return _vrIssueVehiclecertificateLocalService;
	}

	@Override
	public void setWrappedService(
		VRIssueVehiclecertificateLocalService vrIssueVehiclecertificateLocalService) {
		_vrIssueVehiclecertificateLocalService = vrIssueVehiclecertificateLocalService;
	}

	private VRIssueVehiclecertificateLocalService _vrIssueVehiclecertificateLocalService;
}