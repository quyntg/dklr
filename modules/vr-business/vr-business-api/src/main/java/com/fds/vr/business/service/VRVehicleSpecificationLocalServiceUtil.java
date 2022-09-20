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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VRVehicleSpecification. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRVehicleSpecificationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRVehicleSpecificationLocalService
 * @see com.fds.vr.business.service.base.VRVehicleSpecificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRVehicleSpecificationLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRVehicleSpecificationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRVehicleSpecificationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr vehicle specification to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was added
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification addVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return getService().addVRVehicleSpecification(vrVehicleSpecification);
	}

	/**
	* Creates a new vr vehicle specification with the primary key. Does not add the vr vehicle specification to the database.
	*
	* @param id the primary key for the new vr vehicle specification
	* @return the new vr vehicle specification
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification createVRVehicleSpecification(
		long id) {
		return getService().createVRVehicleSpecification(id);
	}

	/**
	* Deletes the vr vehicle specification from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was removed
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification deleteVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return getService().deleteVRVehicleSpecification(vrVehicleSpecification);
	}

	/**
	* Deletes the vr vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification that was removed
	* @throws PortalException if a vr vehicle specification with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification deleteVRVehicleSpecification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRVehicleSpecification(id);
	}

	public static com.fds.vr.business.model.VRVehicleSpecification fetchVRVehicleSpecification(
		long id) {
		return getService().fetchVRVehicleSpecification(id);
	}

	public static com.fds.vr.business.model.VRVehicleSpecification findByCode(
		long vehiceTypeId, java.lang.String specificationCode) {
		return getService().findByCode(vehiceTypeId, specificationCode);
	}

	/**
	* Returns the vr vehicle specification with the primary key.
	*
	* @param id the primary key of the vr vehicle specification
	* @return the vr vehicle specification
	* @throws PortalException if a vr vehicle specification with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification getVRVehicleSpecification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRVehicleSpecification(id);
	}

	/**
	* Updates the vr vehicle specification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleSpecification the vr vehicle specification
	* @return the vr vehicle specification that was updated
	*/
	public static com.fds.vr.business.model.VRVehicleSpecification updateVRVehicleSpecification(
		com.fds.vr.business.model.VRVehicleSpecification vrVehicleSpecification) {
		return getService().updateVRVehicleSpecification(vrVehicleSpecification);
	}

	public static com.fds.vr.business.model.VRVehicleSpecification updateVehicleSpecification(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		long vrVehicleTypeCertificateId, java.util.Date modifiedDate,
		com.fds.vr.business.model.VRDossierFile dossierFile) {
		return getService()
				   .updateVehicleSpecification(mapValues,
			vrVehicleTypeCertificateId, modifiedDate, dossierFile);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long vehicleTypeCertificateId) {
		return getService()
				   .adminProcessData(arrayData, dossierId,
			vehicleTypeCertificateId);
	}

	public static com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findData(sql, columnNames, dataTypes, modelClazz,
			modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle specifications.
	*
	* @return the number of vr vehicle specifications
	*/
	public static int getVRVehicleSpecificationsCount() {
		return getService().getVRVehicleSpecificationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDeliverableCode(deliverableCode);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByDossierId(
		long dossierId, int start, int end) {
		return getService().findByDossierId(dossierId, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleSpecification> findByVehicleCertificateId(
		long vehicleCertificateId) {
		return getService().findByVehicleCertificateId(vehicleCertificateId);
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
	public static java.util.List<com.fds.vr.business.model.VRVehicleSpecification> getVRVehicleSpecifications(
		int start, int end) {
		return getService().getVRVehicleSpecifications(start, end);
	}

	public static long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().counData(sql);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void updateVRTechnicalSpec_LKXCG(
		java.lang.String strChungChi, long vrVehicleTypeCertificateId,
		long dossierId, java.lang.String dossierIdCTN,
		java.lang.String dossierNo, java.util.Date modifyDate,
		java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_LKXCG(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_LKXMY(
		java.lang.String strChungChi, long vrVehicleTypeCertificateId,
		long dossierId, java.lang.String dossierIdCTN,
		java.lang.String dossierNo, java.util.Date modifyDate,
		java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_LKXMY(strChungChi,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_XCG(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_XCG(strChungChi, vrVehicleTypeCertificateId,
			dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_XCH(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_XCH(strChungChi, vrVehicleTypeCertificateId,
			dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_XCN(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_XCN(strChungChi, vrVehicleTypeCertificateId,
			dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_XDD(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_XDD(strChungChi, vrVehicleTypeCertificateId,
			dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
	}

	public static void updateVRTechnicalSpec_XMY(java.lang.String strChungChi,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String deliverableCode) {
		getService()
			.updateVRTechnicalSpec_XMY(strChungChi, vrVehicleTypeCertificateId,
			dossierId, dossierIdCTN, dossierNo, modifyDate, deliverableCode);
	}

	public static VRVehicleSpecificationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleSpecificationLocalService, VRVehicleSpecificationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleSpecificationLocalService.class);
}