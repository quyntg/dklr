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
 * Provides a wrapper for {@link VRIssueLocalService}.
 *
 * @author LamTV
 * @see VRIssueLocalService
 * @generated
 */
@ProviderType
public class VRIssueLocalServiceWrapper implements VRIssueLocalService,
	ServiceWrapper<VRIssueLocalService> {
	public VRIssueLocalServiceWrapper(VRIssueLocalService vrIssueLocalService) {
		_vrIssueLocalService = vrIssueLocalService;
	}

	/**
	* Adds the vr issue to the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was added
	*/
	@Override
	public com.fds.vr.business.model.VRIssue addVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return _vrIssueLocalService.addVRIssue(vrIssue);
	}

	@Override
	public com.fds.vr.business.model.VRIssue createVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return _vrIssueLocalService.createVRIssue(vrIssue);
	}

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	@Override
	public com.fds.vr.business.model.VRIssue createVRIssue(long id) {
		return _vrIssueLocalService.createVRIssue(id);
	}

	/**
	* Deletes the vr issue from the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRIssue deleteVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return _vrIssueLocalService.deleteVRIssue(vrIssue);
	}

	/**
	* Deletes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRIssue deleteVRIssue(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueLocalService.deleteVRIssue(id);
	}

	@Override
	public com.fds.vr.business.model.VRIssue fetchVRIssue(long id) {
		return _vrIssueLocalService.fetchVRIssue(id);
	}

	@Override
	public com.fds.vr.business.model.VRIssue findByMT_DID(long mtCore,
		long dossierId) {
		return _vrIssueLocalService.findByMT_DID(mtCore, dossierId);
	}

	/**
	* Returns the vr issue with the primary key.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRIssue getVRIssue(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueLocalService.getVRIssue(id);
	}

	@Override
	public com.fds.vr.business.model.VRIssue updateDigitalIssueStatus(long id,
		int digitalIssueStatus, com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueLocalService.updateDigitalIssueStatus(id,
			digitalIssueStatus, company);
	}

	@Override
	public com.fds.vr.business.model.VRIssue updateVRIssue(
		com.fds.vr.business.model.VRIssue object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.updateVRIssue(object, company);
	}

	/**
	* Updates the vr issue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRIssue updateVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return _vrIssueLocalService.updateVRIssue(vrIssue);
	}

	@Override
	public com.fds.vr.business.model.VRIssue updateVRIssue(
		java.util.Map<java.lang.String, java.lang.String> mapValue, int mtCore,
		boolean flagExits)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return _vrIssueLocalService.updateVRIssue(mapValue, mtCore, flagExits);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrIssueLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrIssueLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrIssueLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findData(sql, columnNames, dataTypes,
			modelClazz, modelClassName, start, end);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject adminProcess(
		com.liferay.portal.kernel.json.JSONObject objectData, long dossierId,
		long mtCore) throws java.lang.Exception {
		return _vrIssueLocalService.adminProcess(objectData, dossierId, mtCore);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrIssueLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	@Override
	public int getVRIssuesCount() {
		return _vrIssueLocalService.getVRIssuesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrIssueLocalService.getOSGiServiceIdentifier();
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
		return _vrIssueLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrIssueLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrIssueLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findByIC_IS(
		long issueCorporationId, int digitalIssueStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findByIC_IS(issueCorporationId,
			digitalIssueStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findByapplicantProfileId(
		long mtCore, long dossierId, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findBycopreportno(
		long mtCore, java.lang.String copreportno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findBycopreportno(mtCore, copreportno);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findBycorporationId(
		long mtCore, java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findBycorporationId(mtCore, corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findBydossierId(mtCore, dossierId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findByissueCorporationId(
		long mtCore, long issueCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findByissueCorporationId(mtCore,
			issueCorporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findByproductionPlantId(
		long mtCore, long productionPlantId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findByproductionPlantId(mtCore,
			productionPlantId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findBystampIssueNo(
		long mtCore, java.lang.String stampIssueNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findBystampIssueNo(mtCore, stampIssueNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> findByverifyCorporationId(
		long mtCore, java.lang.String verifyCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.findByverifyCorporationId(mtCore,
			verifyCorporationId);
	}

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRIssue> getVRIssues(
		int start, int end) {
		return _vrIssueLocalService.getVRIssues(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrIssueLocalService.counData(sql);
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
		return _vrIssueLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrIssueLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public VRIssueLocalService getWrappedService() {
		return _vrIssueLocalService;
	}

	@Override
	public void setWrappedService(VRIssueLocalService vrIssueLocalService) {
		_vrIssueLocalService = vrIssueLocalService;
	}

	private VRIssueLocalService _vrIssueLocalService;
}