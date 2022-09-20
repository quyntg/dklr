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
 * Provides the local service utility for VRVehicleRecord. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRVehicleRecordLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRVehicleRecordLocalService
 * @see com.fds.vr.business.service.base.VRVehicleRecordLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRVehicleRecordLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRVehicleRecordLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRVehicleRecordLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr vehicle record to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was added
	*/
	public static com.fds.vr.business.model.VRVehicleRecord addVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return getService().addVRVehicleRecord(vrVehicleRecord);
	}

	public static com.fds.vr.business.model.VRVehicleRecord createVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return getService().createVRVehicleRecord(vrVehicleRecord);
	}

	/**
	* Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	*
	* @param id the primary key for the new vr vehicle record
	* @return the new vr vehicle record
	*/
	public static com.fds.vr.business.model.VRVehicleRecord createVRVehicleRecord(
		long id) {
		return getService().createVRVehicleRecord(id);
	}

	/**
	* Deletes the vr vehicle record from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was removed
	*/
	public static com.fds.vr.business.model.VRVehicleRecord deleteVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return getService().deleteVRVehicleRecord(vrVehicleRecord);
	}

	/**
	* Deletes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record that was removed
	* @throws PortalException if a vr vehicle record with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleRecord deleteVRVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRVehicleRecord(id);
	}

	public static com.fds.vr.business.model.VRVehicleRecord fetchVRVehicleRecord(
		long id) {
		return getService().fetchVRVehicleRecord(id);
	}

	/**
	* Returns the vr vehicle record with the primary key.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record
	* @throws PortalException if a vr vehicle record with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRVehicleRecord getVRVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRVehicleRecord(id);
	}

	public static com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVRVehicleRecord(object, company);
	}

	/**
	* Updates the vr vehicle record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was updated
	*/
	public static com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return getService().updateVRVehicleRecord(vrVehicleRecord);
	}

	public static com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		java.util.Map<java.lang.String, java.lang.String> mapValue, int mtCore) {
		return getService().updateVRVehicleRecord(mapValue, mtCore);
	}

	public static com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		long vehicleRecordId, int printingStatus, int postPrintingStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateVRVehicleRecord(vehicleRecordId, printingStatus,
			postPrintingStatus);
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
	* Returns the number of vr vehicle records.
	*
	* @return the number of vr vehicle records
	*/
	public static int getVRVehicleRecordsCount() {
		return getService().getVRVehicleRecordsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> adminProcess(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long issueId, long mtCore, long issueVehicleCertificateId,
		java.lang.String issueType) throws java.lang.Exception {
		return getService()
				   .adminProcess(arrayData, dossierId, issueId, mtCore,
			issueVehicleCertificateId, issueType);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByIssueId(
		long issueId, int start, int end) {
		return getService().findByIssueId(issueId, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByapplicantProfileId(mtCore, applicantProfileId);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycertificateId(mtCore, certificateId);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBydossierId(mtCore, dossierId);
	}

	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Returns a range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of vr vehicle records
	*/
	public static java.util.List<com.fds.vr.business.model.VRVehicleRecord> getVRVehicleRecords(
		int start, int end) {
		return getService().getVRVehicleRecords(start, end);
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

	public static void deleteBydossierId(long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteBydossierId(mtCore, dossierId);
	}

	public static VRVehicleRecordLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleRecordLocalService, VRVehicleRecordLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleRecordLocalService.class);
}