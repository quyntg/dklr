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
 * Provides a wrapper for {@link VRVehicleTypeCertificateLocalService}.
 *
 * @author LamTV
 * @see VRVehicleTypeCertificateLocalService
 * @generated
 */
@ProviderType
public class VRVehicleTypeCertificateLocalServiceWrapper
	implements VRVehicleTypeCertificateLocalService,
		ServiceWrapper<VRVehicleTypeCertificateLocalService> {
	public VRVehicleTypeCertificateLocalServiceWrapper(
		VRVehicleTypeCertificateLocalService vrVehicleTypeCertificateLocalService) {
		_vrVehicleTypeCertificateLocalService = vrVehicleTypeCertificateLocalService;
	}

	@Override
	public boolean updateVRTechnicalSpec_ALL(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		long vrVehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.util.Date modifyDate, java.lang.String VehicleClass,
		java.lang.String deliverableCode) {
		return _vrVehicleTypeCertificateLocalService.updateVRTechnicalSpec_ALL(mapValues,
			vrVehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			modifyDate, VehicleClass, deliverableCode);
	}

	/**
	* Adds the vr vehicle type certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was added
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate addVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return _vrVehicleTypeCertificateLocalService.addVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate createVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.createVRVehicleTypeCertificate(object);
	}

	/**
	* Creates a new vr vehicle type certificate with the primary key. Does not add the vr vehicle type certificate to the database.
	*
	* @param id the primary key for the new vr vehicle type certificate
	* @return the new vr vehicle type certificate
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate createVRVehicleTypeCertificate(
		long id) {
		return _vrVehicleTypeCertificateLocalService.createVRVehicleTypeCertificate(id);
	}

	/**
	* Deletes the vr vehicle type certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return _vrVehicleTypeCertificateLocalService.deleteVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	/**
	* Deletes the vr vehicle type certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate that was removed
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate deleteVRVehicleTypeCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleTypeCertificateLocalService.deleteVRVehicleTypeCertificate(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate fetchVRVehicleTypeCertificate(
		long id) {
		return _vrVehicleTypeCertificateLocalService.fetchVRVehicleTypeCertificate(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate findByDossierId_MtCore(
		long dossierId, long mtCore) {
		return _vrVehicleTypeCertificateLocalService.findByDossierId_MtCore(dossierId,
			mtCore);
	}

	/**
	* Returns the vr vehicle type certificate with the primary key.
	*
	* @param id the primary key of the vr vehicle type certificate
	* @return the vr vehicle type certificate
	* @throws PortalException if a vr vehicle type certificate with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate getVRVehicleTypeCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleTypeCertificateLocalService.getVRVehicleTypeCertificate(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLNK_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.update432014TTLTBGTVTBCTTTNLNK_VehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate update432014TTLTBGTVTBCTTTNLSXLR_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.update432014TTLTBGTVTBCTTTNLSXLR_VehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT192012TTBGTVTDGLD_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT192012TTBGTVTDGLD_VehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLLKXCG_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLLKXM_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLTXXBBCH_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLTXXBBCN_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLTXXCG_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLTXXDD_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCNCLKLTXXMTGM_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTCOP_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTCOP_VehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTKTSPMXBBCN_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTKTSPMXCG_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTKTTBLANDAU_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTKTTBLANDAU_VehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTTDTKXMCD_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTTDTKXMCD_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date applicantIdDate,
		com.fds.vr.business.model.VRApplicantProfile appProfile,
		com.fds.vr.business.model.VRDossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.updateTT302011BGTVTTTKXCG_VehicleTypeCertificate(mapValues,
			applicantIdDate, appProfile, dossierFile);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate object,
		com.liferay.portal.kernel.model.Company company) {
		return _vrVehicleTypeCertificateLocalService.updateVRVehicleTypeCertificate(object,
			company);
	}

	/**
	* Updates the vr vehicle type certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleTypeCertificate the vr vehicle type certificate
	* @return the vr vehicle type certificate that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateVRVehicleTypeCertificate(
		com.fds.vr.business.model.VRVehicleTypeCertificate vrVehicleTypeCertificate) {
		return _vrVehicleTypeCertificateLocalService.updateVRVehicleTypeCertificate(vrVehicleTypeCertificate);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleTypeCertificate updateVehicleTypeCertificate(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues,
		java.util.Date modifiedDate,
		com.fds.vr.business.model.VRRegistration registration,
		com.fds.vr.business.model.VRDossierFile dossierFile) {
		return _vrVehicleTypeCertificateLocalService.updateVehicleTypeCertificate(mapValues,
			modifiedDate, registration, dossierFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrVehicleTypeCertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrVehicleTypeCertificateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrVehicleTypeCertificateLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData,
		com.liferay.portal.kernel.json.JSONArray arrayVRVehicleSpecification,
		com.liferay.portal.kernel.json.JSONArray arrayVRInspectionStandard,
		com.liferay.portal.kernel.json.JSONArray arrayLKXCG,
		com.liferay.portal.kernel.json.JSONArray arrayXCG,
		com.liferay.portal.kernel.json.JSONArray arrayLKXMY,
		com.liferay.portal.kernel.json.JSONArray arrayXMY,
		com.liferay.portal.kernel.json.JSONArray arrayXCH,
		com.liferay.portal.kernel.json.JSONArray arrayXCN,
		com.liferay.portal.kernel.json.JSONArray arrayXDD) {
		return _vrVehicleTypeCertificateLocalService.adminProcessData(objectData,
			arrayVRVehicleSpecification, arrayVRInspectionStandard, arrayLKXCG,
			arrayXCG, arrayLKXMY, arrayXMY, arrayXCH, arrayXCN, arrayXDD);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleTypeCertificateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleTypeCertificateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle type certificates.
	*
	* @return the number of vr vehicle type certificates
	*/
	@Override
	public int getVRVehicleTypeCertificatesCount() {
		return _vrVehicleTypeCertificateLocalService.getVRVehicleTypeCertificatesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrVehicleTypeCertificateLocalService.getOSGiServiceIdentifier();
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
		return _vrVehicleTypeCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleTypeCertificateLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrVehicleTypeCertificateLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> finByF_APP_VH_EXP(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus) {
		return _vrVehicleTypeCertificateLocalService.finByF_APP_VH_EXP(applicantIdNo,
			vehicleClass, expiredStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> finByF_APP_VH_EXP_CERTNO(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String certNo) {
		return _vrVehicleTypeCertificateLocalService.finByF_APP_VH_EXP_CERTNO(applicantIdNo,
			vehicleClass, expiredStatus, certNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByApplicantAndProductionPlant(
		java.lang.String applicantIdNo, java.lang.String productionPlantCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByApplicantAndProductionPlant(applicantIdNo,
			productionPlantCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByApplicantAndService(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		long mtCore)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByApplicantAndService(serviceCode,
			applicantIdNo, mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByApplicantIdNo(
		java.lang.String applicantIdNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByApplicantIdNo(applicantIdNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByCertificaterecordno(
		java.lang.String certificateRecordNo, java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByCertificaterecordno(certificateRecordNo,
			serviceCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByCommonsafetystandard(
		java.lang.String commonSafetyStandard)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByCommonsafetystandard(commonSafetyStandard);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByCopReportNo(
		java.lang.String copReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByCopReportNo(copReportNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByCorporationId(corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByDesignerCode(
		java.lang.String designerCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByDesignerCode(designerCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByDesignsymbol(
		java.lang.String designSymbol)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByDesignsymbol(designSymbol);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByDossierNo_MtCore(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByDossierNo_MtCore(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByEmissionstandard(
		java.lang.String emissionStandard)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByEmissionstandard(emissionStandard);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByExpiredstatus(
		java.lang.String expiredStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByExpiredstatus(expiredStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByExpiredstatusAndServiceCode(
		java.lang.String expiredStatus, java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByExpiredstatusAndServiceCode(expiredStatus,
			serviceCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String expiredStatus) {
		return _vrVehicleTypeCertificateLocalService.findByF_APPNO_EXP_STATUS(applicantIdNo,
			expiredStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByF_APPNO_EXP_STATUS(
		java.lang.String applicantIdNo, java.lang.String[] expiredStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByF_APPNO_EXP_STATUS(applicantIdNo,
			expiredStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByF_EXP_STATUS(
		java.lang.String[] expiredStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByF_EXP_STATUS(expiredStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByInspectionRecordNo(inspectionRecordNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByInspectorId(inspectorId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByInspectorIdCorporationId(corporationId,
			inspectorId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByManufacturerForeignCode(
		java.lang.String manufacturerForeignCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByManufacturerForeignCode(manufacturerForeignCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByServiceCode(
		java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByServiceCode(serviceCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByServiceCodeAndProductionPlant(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByServiceCodeAndProductionPlant(serviceCode,
			applicantIdNo, productionPlantName, productionPlantAddress);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByServiceCodeAndProductionPlantCode(
		java.lang.String serviceCode, java.lang.String applicantIdNo,
		java.lang.String productionPlantCode, long mtCore)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByServiceCodeAndProductionPlantCode(serviceCode,
			applicantIdNo, productionPlantCode, mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByServiceCodeVehicleClassAndApplicantIdNo(
		java.lang.String applicantIdNo, java.lang.String vehicleClass,
		java.lang.String expiredStatus, java.lang.String serviceCode) {
		return _vrVehicleTypeCertificateLocalService.findByServiceCodeVehicleClassAndApplicantIdNo(applicantIdNo,
			vehicleClass, expiredStatus, serviceCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByVehicletypeAndServiceCode(
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode, java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByVehicletypeAndServiceCode(vehicleClass,
			certifiedVehicleType, certifiedTrademarkName,
			certifiedCommercialName, certifiedModelCode, serviceCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findByVerificationCertificateNo(
		java.lang.String verificationCertificateNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.findByVerificationCertificateNo(verificationCertificateNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> findExpiredCertificates(
		int day, java.lang.String expiredStatus) {
		return _vrVehicleTypeCertificateLocalService.findExpiredCertificates(day,
			expiredStatus);
	}

	/**
	* Returns a range of all the vr vehicle type certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleTypeCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle type certificates
	* @param end the upper bound of the range of vr vehicle type certificates (not inclusive)
	* @return the range of vr vehicle type certificates
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleTypeCertificate> getVRVehicleTypeCertificates(
		int start, int end) {
		return _vrVehicleTypeCertificateLocalService.getVRVehicleTypeCertificates(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleTypeCertificateLocalService.counData(sql);
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
		return _vrVehicleTypeCertificateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrVehicleTypeCertificateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRVehicleTypeCertificateLocalService getWrappedService() {
		return _vrVehicleTypeCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		VRVehicleTypeCertificateLocalService vrVehicleTypeCertificateLocalService) {
		_vrVehicleTypeCertificateLocalService = vrVehicleTypeCertificateLocalService;
	}

	private VRVehicleTypeCertificateLocalService _vrVehicleTypeCertificateLocalService;
}