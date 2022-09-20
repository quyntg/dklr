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
 * Provides a wrapper for {@link VRVehicleSpecificationLocalService}.
 *
 * @author LamTV
 * @see VRVehicleSpecificationLocalService
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationLocalServiceWrapper
	implements VRVehicleSpecificationLocalService,
		ServiceWrapper<VRVehicleSpecificationLocalService> {
	public VRVehicleSpecificationLocalServiceWrapper(
		VRVehicleSpecificationLocalService vrVehicleSpecificationLocalService) {
		_vrVehicleSpecificationLocalService = vrVehicleSpecificationLocalService;
	}

	/**
	* Adds the vr vehicle specification to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was added
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification addVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return _vrVehicleSpecificationLocalService.addVRVehicleSpecification(vrVehicleSpecification);
	}

	/**
	* Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	*
	* @param id the primary key for the new vr vehicle specification
	* @return the new vr vehicle specification
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification createVRVehicleSpecification(
		long id) {
		return _vrVehicleSpecificationLocalService.createVRVehicleSpecification(id);
	}

	/**
	* Deletes the vr vehicle specification from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification deleteVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return _vrVehicleSpecificationLocalService.deleteVRVehicleSpecification(vrVehicleSpecification);
	}

	/**
	* Deletes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification that was removed
	* @throws PortalException if a vr vehicle specification with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification deleteVRVehicleSpecification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleSpecificationLocalService.deleteVRVehicleSpecification(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleSpecification fetchVRVehicleSpecification(
		long id) {
		return _vrVehicleSpecificationLocalService.fetchVRVehicleSpecification(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleSpecification findByCode(
		long vehiceTypeId, java.lang.String specificationCode) {
		return _vrVehicleSpecificationLocalService.findByCode(vehiceTypeId,
			specificationCode);
	}

	/**
	* Returns the vr vehicle specification with the primary key.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification
	* @throws PortalException if a vr vehicle specification with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification getVRVehicleSpecification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleSpecificationLocalService.getVRVehicleSpecification(id);
	}

	/**
	* Updates the vr vehicle specification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleSpecification updateVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return _vrVehicleSpecificationLocalService.updateVRVehicleSpecification(vrVehicleSpecification);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleSpecification updateVehicleSpecification(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		long vrVehicleTypeCertificateId, java.util.Date modifiedDate,
		com.fds.vr.business.model.VRDossierFile dossierFile) {
		return _vrVehicleSpecificationLocalService.updateVehicleSpecification(mapValues,
			vrVehicleTypeCertificateId, modifiedDate, dossierFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrVehicleSpecificationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrVehicleSpecificationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrVehicleSpecificationLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long vehicleTypeCertificateId) {
		return _vrVehicleSpecificationLocalService.adminProcessData(arrayData,
			dossierId, vehicleTypeCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleSpecificationLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleSpecificationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleSpecificationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle specifications.
	*
	* @return the number of vr vehicle specifications
	*/
	@Override
	public int getVRVehicleSpecificationsCount() {
		return _vrVehicleSpecificationLocalService.getVRVehicleSpecificationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrVehicleSpecificationLocalService.getOSGiServiceIdentifier();
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
		return _vrVehicleSpecificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleSpecificationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleSpecificationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleSpecificationLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByDossierId(
		long dossierId, int start, int end) {
		return _vrVehicleSpecificationLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId) {
		return _vrVehicleSpecificationLocalService.findByVehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Returns a range of all the vr vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle specifications
	* @param end the upper bound of the range of vr vehicle specifications (not inclusive)
	* @return the range of vr vehicle specifications
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleSpecification> getVRVehicleSpecifications(
		int start, int end) {
		return _vrVehicleSpecificationLocalService.getVRVehicleSpecifications(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleSpecificationLocalService.counData(sql);
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
		return _vrVehicleSpecificationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrVehicleSpecificationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void updateVRTechnicalSpec_LKXCG(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_LKXCG(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_LKXMY(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_LKXMY(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_XCG(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_XCG(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_XCH(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_XCH(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_XCN(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_XCN(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_XDD(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_XDD(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public void updateVRTechnicalSpec_XMY(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		_vrVehicleSpecificationLocalService.updateVRTechnicalSpec_XMY(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	@Override
	public VRVehicleSpecificationLocalService getWrappedService() {
		return _vrVehicleSpecificationLocalService;
	}

	@Override
	public void setWrappedService(
		VRVehicleSpecificationLocalService vrVehicleSpecificationLocalService) {
		_vrVehicleSpecificationLocalService = vrVehicleSpecificationLocalService;
	}

	private VRVehicleSpecificationLocalService _vrVehicleSpecificationLocalService;
}