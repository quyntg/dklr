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
 * Provides the local service utility for VRExpireCertificate. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRExpireCertificateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRExpireCertificateLocalService
 * @see com.fds.vr.business.service.base.VRExpireCertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRExpireCertificateLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRExpireCertificateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRExpireCertificateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr expire certificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was added
	*/
	public static com.fds.vr.business.model.VRExpireCertificate addVRExpireCertificate(
		com.fds.vr.business.model.VRExpireCertificate vrExpireCertificate) {
		return getService().addVRExpireCertificate(vrExpireCertificate);
	}

	/**
	* Creates a new vr expire certificate with the primary key. Does not add the vr expire certificate to the database.
	*
	* @param id the primary key for the new vr expire certificate
	* @return the new vr expire certificate
	*/
	public static com.fds.vr.business.model.VRExpireCertificate createVRExpireCertificate(
		long id) {
		return getService().createVRExpireCertificate(id);
	}

	/**
	* Deletes the vr expire certificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was removed
	*/
	public static com.fds.vr.business.model.VRExpireCertificate deleteVRExpireCertificate(
		com.fds.vr.business.model.VRExpireCertificate vrExpireCertificate) {
		return getService().deleteVRExpireCertificate(vrExpireCertificate);
	}

	/**
	* Deletes the vr expire certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate that was removed
	* @throws PortalException if a vr expire certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRExpireCertificate deleteVRExpireCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRExpireCertificate(id);
	}

	public static com.fds.vr.business.model.VRExpireCertificate fetchVRExpireCertificate(
		long id) {
		return getService().fetchVRExpireCertificate(id);
	}

	public static com.fds.vr.business.model.VRExpireCertificate findByDossierId(
		long dossierId) {
		return getService().findByDossierId(dossierId);
	}

	public static com.fds.vr.business.model.VRExpireCertificate findByVehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return getService()
				   .findByVehicleTypeCertificateId(vehicleTypeCertificateId);
	}

	/**
	* Returns the vr expire certificate with the primary key.
	*
	* @param id the primary key of the vr expire certificate
	* @return the vr expire certificate
	* @throws PortalException if a vr expire certificate with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRExpireCertificate getVRExpireCertificate(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRExpireCertificate(id);
	}

	/**
	* Updates the vr expire certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrExpireCertificate the vr expire certificate
	* @return the vr expire certificate that was updated
	*/
	public static com.fds.vr.business.model.VRExpireCertificate updateVRExpireCertificate(
		com.fds.vr.business.model.VRExpireCertificate vrExpireCertificate) {
		return getService().updateVRExpireCertificate(vrExpireCertificate);
	}

	public static com.fds.vr.business.model.VRExpireCertificate updateVRExpireCertificate(
		long id, long mtCore, long convertAssembleId, long validDossierId,
		java.lang.String validDossierIdCTN, java.lang.String validDossierNo,
		long vehicleTypeCertificateId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.lang.String dossierStatus, java.util.Date previousExpireDate,
		java.lang.String certificateRecordNo,
		java.util.Date certificateRecordDate,
		java.util.Date certificateRecordExpireDate, int expiredStatus,
		java.lang.String vehicleClass, java.lang.String certifiedVehicleType,
		java.lang.String certifiedVehicleTypeDescription,
		java.lang.String certifiedTrademark,
		java.lang.String certifiedTrademarkName,
		java.lang.String certifiedCommercialName,
		java.lang.String certifiedModelCode,
		java.lang.String productionCountry,
		java.lang.String safetytestReportNo,
		java.util.Date safetytestReportDate,
		java.lang.String emissionTestReportNo,
		java.util.Date emissionTestReportDate,
		java.lang.String commonSafetyStandard,
		java.lang.String commonSafetyDescription,
		java.lang.String emissionStandard,
		java.lang.String emissionDescription,
		java.lang.String othertestReportNo, java.util.Date othertestReportDate,
		java.lang.String copReportNo, java.util.Date copReportDate,
		java.util.Date copReportExpireDate, java.lang.String validRequestNo,
		java.util.Date validRequestDate,
		java.lang.String validInspectionRecordNo,
		java.util.Date validInspectionRecordDate, long validCorporationId,
		long validInspectorId, java.lang.String validInspectorName,
		java.lang.String validRemarks, java.lang.String validInspectionNote,
		long deliverableFileEntryId, long documentFileEntryId,
		java.util.Date syncDate, java.lang.String typeUpdate,
		com.liferay.portal.kernel.model.Company company) {
		return getService()
				   .updateVRExpireCertificate(id, mtCore, convertAssembleId,
			validDossierId, validDossierIdCTN, validDossierNo,
			vehicleTypeCertificateId, dossierId, dossierIdCTN, dossierNo,
			dossierStatus, previousExpireDate, certificateRecordNo,
			certificateRecordDate, certificateRecordExpireDate, expiredStatus,
			vehicleClass, certifiedVehicleType,
			certifiedVehicleTypeDescription, certifiedTrademark,
			certifiedTrademarkName, certifiedCommercialName,
			certifiedModelCode, productionCountry, safetytestReportNo,
			safetytestReportDate, emissionTestReportNo, emissionTestReportDate,
			commonSafetyStandard, commonSafetyDescription, emissionStandard,
			emissionDescription, othertestReportNo, othertestReportDate,
			copReportNo, copReportDate, copReportExpireDate, validRequestNo,
			validRequestDate, validInspectionRecordNo,
			validInspectionRecordDate, validCorporationId, validInspectorId,
			validInspectorName, validRemarks, validInspectionNote,
			deliverableFileEntryId, documentFileEntryId, syncDate, typeUpdate,
			company);
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
	* Returns the number of vr expire certificates.
	*
	* @return the number of vr expire certificates
	*/
	public static int getVRExpireCertificatesCount() {
		return getService().getVRExpireCertificatesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRExpireCertificate> findByDossierStatus(
		java.lang.String dossierStatus, int start, int end) {
		return getService().findByDossierStatus(dossierStatus, start, end);
	}

	/**
	* Returns a range of all the vr expire certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRExpireCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr expire certificates
	* @param end the upper bound of the range of vr expire certificates (not inclusive)
	* @return the range of vr expire certificates
	*/
	public static java.util.List<com.fds.vr.business.model.VRExpireCertificate> getVRExpireCertificates(
		int start, int end) {
		return getService().getVRExpireCertificates(start, end);
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

	public static VRExpireCertificateLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRExpireCertificateLocalService, VRExpireCertificateLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRExpireCertificateLocalService.class);
}