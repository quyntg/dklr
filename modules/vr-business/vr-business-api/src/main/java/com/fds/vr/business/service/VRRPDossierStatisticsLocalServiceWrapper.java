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
 * Provides a wrapper for {@link VRRPDossierStatisticsLocalService}.
 *
 * @author LamTV
 * @see VRRPDossierStatisticsLocalService
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsLocalServiceWrapper
	implements VRRPDossierStatisticsLocalService,
		ServiceWrapper<VRRPDossierStatisticsLocalService> {
	public VRRPDossierStatisticsLocalServiceWrapper(
		VRRPDossierStatisticsLocalService vrrpDossierStatisticsLocalService) {
		_vrrpDossierStatisticsLocalService = vrrpDossierStatisticsLocalService;
	}

	/**
	* Adds the vrrp dossier statistics to the database. Also notifies the appropriate model listeners.
	*
	* @param vrrpDossierStatistics the vrrp dossier statistics
	* @return the vrrp dossier statistics that was added
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics addVRRPDossierStatistics(
		com.fds.vr.business.model.VRRPDossierStatistics vrrpDossierStatistics) {
		return _vrrpDossierStatisticsLocalService.addVRRPDossierStatistics(vrrpDossierStatistics);
	}

	/**
	* Creates a new vrrp dossier statistics with the primary key. Does not add the vrrp dossier statistics to the database.
	*
	* @param id the primary key for the new vrrp dossier statistics
	* @return the new vrrp dossier statistics
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics createVRRPDossierStatistics(
		long id) {
		return _vrrpDossierStatisticsLocalService.createVRRPDossierStatistics(id);
	}

	/**
	* Deletes the vrrp dossier statistics from the database. Also notifies the appropriate model listeners.
	*
	* @param vrrpDossierStatistics the vrrp dossier statistics
	* @return the vrrp dossier statistics that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics deleteVRRPDossierStatistics(
		com.fds.vr.business.model.VRRPDossierStatistics vrrpDossierStatistics) {
		return _vrrpDossierStatisticsLocalService.deleteVRRPDossierStatistics(vrrpDossierStatistics);
	}

	/**
	* Deletes the vrrp dossier statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics that was removed
	* @throws PortalException if a vrrp dossier statistics with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics deleteVRRPDossierStatistics(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrrpDossierStatisticsLocalService.deleteVRRPDossierStatistics(id);
	}

	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics fetchVRRPDossierStatistics(
		long id) {
		return _vrrpDossierStatisticsLocalService.fetchVRRPDossierStatistics(id);
	}

	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics findBydossierIdCTN(
		java.lang.String dossierIdCTN) {
		return _vrrpDossierStatisticsLocalService.findBydossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the vrrp dossier statistics with the primary key.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics
	* @throws PortalException if a vrrp dossier statistics with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics getVRRPDossierStatistics(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrrpDossierStatisticsLocalService.getVRRPDossierStatistics(id);
	}

	/**
	* Updates the vrrp dossier statistics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrrpDossierStatistics the vrrp dossier statistics
	* @return the vrrp dossier statistics that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRRPDossierStatistics updateVRRPDossierStatistics(
		com.fds.vr.business.model.VRRPDossierStatistics vrrpDossierStatistics) {
		return _vrrpDossierStatisticsLocalService.updateVRRPDossierStatistics(vrrpDossierStatistics);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrrpDossierStatisticsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrrpDossierStatisticsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrrpDossierStatisticsLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrrpDossierStatisticsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrrpDossierStatisticsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrrp dossier statisticses.
	*
	* @return the number of vrrp dossier statisticses
	*/
	@Override
	public int getVRRPDossierStatisticsesCount() {
		return _vrrpDossierStatisticsLocalService.getVRRPDossierStatisticsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrrpDossierStatisticsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.Iterator<java.lang.Object[]> findDataReport(
		java.lang.String sqlQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findDataReport(sqlQuery);
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
		return _vrrpDossierStatisticsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrrpDossierStatisticsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrrpDossierStatisticsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findByApplicantNo(applicantNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findByCorporationId(corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByDossierId(
		long dossierid) {
		return _vrrpDossierStatisticsLocalService.findByDossierId(dossierid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findByDossierIdCTN(dossierid,
			dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByDossierNo(
		java.lang.String DossierNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findByDossierNo(DossierNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.findByInspectorcode(inspectorcode);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of vrrp dossier statisticses
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRRPDossierStatistics> getVRRPDossierStatisticses(
		int start, int end) {
		return _vrrpDossierStatisticsLocalService.getVRRPDossierStatisticses(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrrpDossierStatisticsLocalService.counData(sql);
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
		return _vrrpDossierStatisticsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrrpDossierStatisticsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRRPDossierStatisticsLocalService getWrappedService() {
		return _vrrpDossierStatisticsLocalService;
	}

	@Override
	public void setWrappedService(
		VRRPDossierStatisticsLocalService vrrpDossierStatisticsLocalService) {
		_vrrpDossierStatisticsLocalService = vrrpDossierStatisticsLocalService;
	}

	private VRRPDossierStatisticsLocalService _vrrpDossierStatisticsLocalService;
}