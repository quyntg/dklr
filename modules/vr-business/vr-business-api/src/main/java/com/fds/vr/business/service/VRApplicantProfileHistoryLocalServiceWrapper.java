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
 * Provides a wrapper for {@link VRApplicantProfileHistoryLocalService}.
 *
 * @author LamTV
 * @see VRApplicantProfileHistoryLocalService
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryLocalServiceWrapper
	implements VRApplicantProfileHistoryLocalService,
		ServiceWrapper<VRApplicantProfileHistoryLocalService> {
	public VRApplicantProfileHistoryLocalServiceWrapper(
		VRApplicantProfileHistoryLocalService vrApplicantProfileHistoryLocalService) {
		_vrApplicantProfileHistoryLocalService = vrApplicantProfileHistoryLocalService;
	}

	/**
	* Adds the vr applicant profile history to the database. Also notifies the appropriate model listeners.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	* @return the vr applicant profile history that was added
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory addVRApplicantProfileHistory(
		com.fds.vr.business.model.VRApplicantProfileHistory vrApplicantProfileHistory) {
		return _vrApplicantProfileHistoryLocalService.addVRApplicantProfileHistory(vrApplicantProfileHistory);
	}

	/**
	* Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	*
	* @param id the primary key for the new vr applicant profile history
	* @return the new vr applicant profile history
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory createVRApplicantProfileHistory(
		long id) {
		return _vrApplicantProfileHistoryLocalService.createVRApplicantProfileHistory(id);
	}

	/**
	* Deletes the vr applicant profile history from the database. Also notifies the appropriate model listeners.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	* @return the vr applicant profile history that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory deleteVRApplicantProfileHistory(
		com.fds.vr.business.model.VRApplicantProfileHistory vrApplicantProfileHistory) {
		return _vrApplicantProfileHistoryLocalService.deleteVRApplicantProfileHistory(vrApplicantProfileHistory);
	}

	/**
	* Deletes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history that was removed
	* @throws PortalException if a vr applicant profile history with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory deleteVRApplicantProfileHistory(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrApplicantProfileHistoryLocalService.deleteVRApplicantProfileHistory(id);
	}

	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory fetchVRApplicantProfileHistory(
		long id) {
		return _vrApplicantProfileHistoryLocalService.fetchVRApplicantProfileHistory(id);
	}

	/**
	* Returns the vr applicant profile history with the primary key.
	*
	* @param id the primary key of the vr applicant profile history
	* @return the vr applicant profile history
	* @throws PortalException if a vr applicant profile history with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory getVRApplicantProfileHistory(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrApplicantProfileHistoryLocalService.getVRApplicantProfileHistory(id);
	}

	/**
	* Updates the vr applicant profile history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrApplicantProfileHistory the vr applicant profile history
	* @return the vr applicant profile history that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRApplicantProfileHistory updateVRApplicantProfileHistory(
		com.fds.vr.business.model.VRApplicantProfileHistory vrApplicantProfileHistory) {
		return _vrApplicantProfileHistoryLocalService.updateVRApplicantProfileHistory(vrApplicantProfileHistory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrApplicantProfileHistoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrApplicantProfileHistoryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrApplicantProfileHistoryLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findData(sql,
			columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrApplicantProfileHistoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrApplicantProfileHistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr applicant profile histories.
	*
	* @return the number of vr applicant profile histories
	*/
	@Override
	public int getVRApplicantProfileHistoriesCount() {
		return _vrApplicantProfileHistoryLocalService.getVRApplicantProfileHistoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrApplicantProfileHistoryLocalService.getOSGiServiceIdentifier();
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
		return _vrApplicantProfileHistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrApplicantProfileHistoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrApplicantProfileHistoryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findByapplicantCity(
		long mtCore, java.lang.String applicantCity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findByapplicantCity(mtCore,
			applicantCity);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findByapplicantCode(
		long mtCore, java.lang.String applicantCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findByapplicantCode(mtCore,
			applicantCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findByapplicantRegion(
		long mtCore, java.lang.String applicantRegion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findByapplicantRegion(mtCore,
			applicantRegion);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findByapplicantStatus(
		long mtCore, java.lang.String applicantStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findByapplicantStatus(mtCore,
			applicantStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findBymappingMA_CTY(
		long mtCore, java.lang.String mappingMA_CTY)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findBymappingMA_CTY(mtCore,
			mappingMA_CTY);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findBymappingStatus(mtCore,
			mappingStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> findBymappingTEN_CTY(
		long mtCore, java.lang.String mappingTEN_CTY)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.findBymappingTEN_CTY(mtCore,
			mappingTEN_CTY);
	}

	/**
	* Returns a range of all the vr applicant profile histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr applicant profile histories
	* @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	* @return the range of vr applicant profile histories
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRApplicantProfileHistory> getVRApplicantProfileHistories(
		int start, int end) {
		return _vrApplicantProfileHistoryLocalService.getVRApplicantProfileHistories(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrApplicantProfileHistoryLocalService.counData(sql);
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
		return _vrApplicantProfileHistoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrApplicantProfileHistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRApplicantProfileHistoryLocalService getWrappedService() {
		return _vrApplicantProfileHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		VRApplicantProfileHistoryLocalService vrApplicantProfileHistoryLocalService) {
		_vrApplicantProfileHistoryLocalService = vrApplicantProfileHistoryLocalService;
	}

	private VRApplicantProfileHistoryLocalService _vrApplicantProfileHistoryLocalService;
}