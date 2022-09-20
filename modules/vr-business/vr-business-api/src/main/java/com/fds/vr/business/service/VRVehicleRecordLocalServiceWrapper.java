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
 * Provides a wrapper for {@link VRVehicleRecordLocalService}.
 *
 * @author LamTV
 * @see VRVehicleRecordLocalService
 * @generated
 */
@ProviderType
public class VRVehicleRecordLocalServiceWrapper
	implements VRVehicleRecordLocalService,
		ServiceWrapper<VRVehicleRecordLocalService> {
	public VRVehicleRecordLocalServiceWrapper(
		VRVehicleRecordLocalService vrVehicleRecordLocalService) {
		_vrVehicleRecordLocalService = vrVehicleRecordLocalService;
	}

	/**
	* Adds the vr vehicle record to the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was added
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord addVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return _vrVehicleRecordLocalService.addVRVehicleRecord(vrVehicleRecord);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleRecord createVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return _vrVehicleRecordLocalService.createVRVehicleRecord(vrVehicleRecord);
	}

	/**
	* Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	*
	* @param id the primary key for the new vr vehicle record
	* @return the new vr vehicle record
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord createVRVehicleRecord(
		long id) {
		return _vrVehicleRecordLocalService.createVRVehicleRecord(id);
	}

	/**
	* Deletes the vr vehicle record from the database. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord deleteVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return _vrVehicleRecordLocalService.deleteVRVehicleRecord(vrVehicleRecord);
	}

	/**
	* Deletes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record that was removed
	* @throws PortalException if a vr vehicle record with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord deleteVRVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleRecordLocalService.deleteVRVehicleRecord(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleRecord fetchVRVehicleRecord(
		long id) {
		return _vrVehicleRecordLocalService.fetchVRVehicleRecord(id);
	}

	/**
	* Returns the vr vehicle record with the primary key.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record
	* @throws PortalException if a vr vehicle record with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord getVRVehicleRecord(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleRecordLocalService.getVRVehicleRecord(id);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.updateVRVehicleRecord(object,
			company);
	}

	/**
	* Updates the vr vehicle record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrVehicleRecord the vr vehicle record
	* @return the vr vehicle record that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		com.fds.vr.business.model.VRVehicleRecord vrVehicleRecord) {
		return _vrVehicleRecordLocalService.updateVRVehicleRecord(vrVehicleRecord);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		java.util.Map<java.lang.String, java.lang.String> mapValue, int mtCore) {
		return _vrVehicleRecordLocalService.updateVRVehicleRecord(mapValue,
			mtCore);
	}

	@Override
	public com.fds.vr.business.model.VRVehicleRecord updateVRVehicleRecord(
		long vehicleRecordId, int printingStatus, int postPrintingStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.updateVRVehicleRecord(vehicleRecordId,
			printingStatus, postPrintingStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrVehicleRecordLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrVehicleRecordLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrVehicleRecordLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleRecordLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrVehicleRecordLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr vehicle records.
	*
	* @return the number of vr vehicle records
	*/
	@Override
	public int getVRVehicleRecordsCount() {
		return _vrVehicleRecordLocalService.getVRVehicleRecordsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrVehicleRecordLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> adminProcess(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long issueId, long mtCore, long issueVehicleCertificateId,
		java.lang.String issueType) throws java.lang.Exception {
		return _vrVehicleRecordLocalService.adminProcess(arrayData, dossierId,
			issueId, mtCore, issueVehicleCertificateId, issueType);
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
		return _vrVehicleRecordLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrVehicleRecordLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrVehicleRecordLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByIssueId(
		long issueId, int start, int end) {
		return _vrVehicleRecordLocalService.findByIssueId(issueId, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileId(
		long mtCore, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findByapplicantProfileId(mtCore,
			applicantProfileId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findBycertificateId(mtCore,
			certificateId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findBydossierId(mtCore, dossierId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.findByissueVehicleCertificateId(mtCore,
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
	@Override
	public java.util.List<com.fds.vr.business.model.VRVehicleRecord> getVRVehicleRecords(
		int start, int end) {
		return _vrVehicleRecordLocalService.getVRVehicleRecords(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrVehicleRecordLocalService.counData(sql);
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
		return _vrVehicleRecordLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrVehicleRecordLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void deleteBydossierId(long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vrVehicleRecordLocalService.deleteBydossierId(mtCore, dossierId);
	}

	@Override
	public VRVehicleRecordLocalService getWrappedService() {
		return _vrVehicleRecordLocalService;
	}

	@Override
	public void setWrappedService(
		VRVehicleRecordLocalService vrVehicleRecordLocalService) {
		_vrVehicleRecordLocalService = vrVehicleRecordLocalService;
	}

	private VRVehicleRecordLocalService _vrVehicleRecordLocalService;
}