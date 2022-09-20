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
 * Provides a wrapper for {@link VRInspectionStandardLocalService}.
 *
 * @author LamTV
 * @see VRInspectionStandardLocalService
 * @generated
 */
@ProviderType
public class VRInspectionStandardLocalServiceWrapper
	implements VRInspectionStandardLocalService,
		ServiceWrapper<VRInspectionStandardLocalService> {
	public VRInspectionStandardLocalServiceWrapper(
		VRInspectionStandardLocalService vrInspectionStandardLocalService) {
		_vrInspectionStandardLocalService = vrInspectionStandardLocalService;
	}

	/**
	* Adds the vr inspection standard to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInspectionStandard the vr inspection standard
	* @return the vr inspection standard that was added
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard addVRInspectionStandard(
		com.fds.vr.business.model.VRInspectionStandard vrInspectionStandard) {
		return _vrInspectionStandardLocalService.addVRInspectionStandard(vrInspectionStandard);
	}

	/**
	* Creates a new vr inspection standard with the primary key. Does not add the vr inspection standard to the database.
	*
	* @param id the primary key for the new vr inspection standard
	* @return the new vr inspection standard
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard createVRInspectionStandard(
		long id) {
		return _vrInspectionStandardLocalService.createVRInspectionStandard(id);
	}

	/**
	* Deletes the vr inspection standard from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInspectionStandard the vr inspection standard
	* @return the vr inspection standard that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard deleteVRInspectionStandard(
		com.fds.vr.business.model.VRInspectionStandard vrInspectionStandard) {
		return _vrInspectionStandardLocalService.deleteVRInspectionStandard(vrInspectionStandard);
	}

	/**
	* Deletes the vr inspection standard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard that was removed
	* @throws PortalException if a vr inspection standard with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard deleteVRInspectionStandard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInspectionStandardLocalService.deleteVRInspectionStandard(id);
	}

	@Override
	public com.fds.vr.business.model.VRInspectionStandard fetchVRInspectionStandard(
		long id) {
		return _vrInspectionStandardLocalService.fetchVRInspectionStandard(id);
	}

	/**
	* Returns the vr inspection standard with the primary key.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard
	* @throws PortalException if a vr inspection standard with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard getVRInspectionStandard(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInspectionStandardLocalService.getVRInspectionStandard(id);
	}

	@Override
	public com.fds.vr.business.model.VRInspectionStandard updateInspectionStandard(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		long vrVehicleCertificateId, java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile) {
		return _vrInspectionStandardLocalService.updateInspectionStandard(mapValues,
			vrVehicleCertificateId, modifiedDate, registration, dossierFile);
	}

	/**
	* Updates the vr inspection standard in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInspectionStandard the vr inspection standard
	* @return the vr inspection standard that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRInspectionStandard updateVRInspectionStandard(
		com.fds.vr.business.model.VRInspectionStandard vrInspectionStandard) {
		return _vrInspectionStandardLocalService.updateVRInspectionStandard(vrInspectionStandard);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrInspectionStandardLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrInspectionStandardLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrInspectionStandardLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long vehicleTypeCertificateId) {
		return _vrInspectionStandardLocalService.adminProcessData(arrayData,
			dossierId, vehicleTypeCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInspectionStandardLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInspectionStandardLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInspectionStandardLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr inspection standards.
	*
	* @return the number of vr inspection standards
	*/
	@Override
	public int getVRInspectionStandardsCount() {
		return _vrInspectionStandardLocalService.getVRInspectionStandardsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrInspectionStandardLocalService.getOSGiServiceIdentifier();
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
		return _vrInspectionStandardLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInspectionStandardLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInspectionStandardLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInspectionStandardLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInspectionStandard> findByDossierId(
		long dossierId, int start, int end) {
		return _vrInspectionStandardLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInspectionStandard> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrInspectionStandardLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInspectionStandardLocalService.findByvehicleCertificateId(vehicleCertificateId,
			markupstatus);
	}

	/**
	* Returns a range of all the vr inspection standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of vr inspection standards
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRInspectionStandard> getVRInspectionStandards(
		int start, int end) {
		return _vrInspectionStandardLocalService.getVRInspectionStandards(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInspectionStandardLocalService.counData(sql);
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
		return _vrInspectionStandardLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrInspectionStandardLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRInspectionStandardLocalService getWrappedService() {
		return _vrInspectionStandardLocalService;
	}

	@Override
	public void setWrappedService(
		VRInspectionStandardLocalService vrInspectionStandardLocalService) {
		_vrInspectionStandardLocalService = vrInspectionStandardLocalService;
	}

	private VRInspectionStandardLocalService _vrInspectionStandardLocalService;
}