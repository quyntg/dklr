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
 * Provides the local service utility for VRDossierFile. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRDossierFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRDossierFileLocalService
 * @see com.fds.vr.business.service.base.VRDossierFileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRDossierFileLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRDossierFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRDossierFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr dossier file to the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossierFile the vr dossier file
	* @return the vr dossier file that was added
	*/
	public static com.fds.vr.business.model.VRDossierFile addVRDossierFile(
		com.fds.vr.business.model.VRDossierFile vrDossierFile) {
		return getService().addVRDossierFile(vrDossierFile);
	}

	/**
	* Creates a new vr dossier file with the primary key. Does not add the vr dossier file to the database.
	*
	* @param dossierFileId the primary key for the new vr dossier file
	* @return the new vr dossier file
	*/
	public static com.fds.vr.business.model.VRDossierFile createVRDossierFile(
		long dossierFileId) {
		return getService().createVRDossierFile(dossierFileId);
	}

	/**
	* Deletes the vr dossier file from the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossierFile the vr dossier file
	* @return the vr dossier file that was removed
	*/
	public static com.fds.vr.business.model.VRDossierFile deleteVRDossierFile(
		com.fds.vr.business.model.VRDossierFile vrDossierFile) {
		return getService().deleteVRDossierFile(vrDossierFile);
	}

	/**
	* Deletes the vr dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file that was removed
	* @throws PortalException if a vr dossier file with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRDossierFile deleteVRDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRDossierFile(dossierFileId);
	}

	public static com.fds.vr.business.model.VRDossierFile fetchVRDossierFile(
		long dossierFileId) {
		return getService().fetchVRDossierFile(dossierFileId);
	}

	/**
	* Returns the vr dossier file matching the UUID and group.
	*
	* @param uuid the vr dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier file, or <code>null</code> if a matching vr dossier file could not be found
	*/
	public static com.fds.vr.business.model.VRDossierFile fetchVRDossierFileByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchVRDossierFileByUuidAndGroupId(uuid, groupId);
	}

	public static com.fds.vr.business.model.VRDossierFile getByDeliverableCode(
		java.lang.String deliverableCode) {
		return getService().getByDeliverableCode(deliverableCode);
	}

	public static com.fds.vr.business.model.VRDossierFile getByDossierFileId(
		long dossierFileId) {
		return getService().getByDossierFileId(dossierFileId);
	}

	public static com.fds.vr.business.model.VRDossierFile getDossierFileByDID_DPNO(
		long dossierId, java.lang.String dossierPartNo, boolean removed) {
		return getService()
				   .getDossierFileByDID_DPNO(dossierId, dossierPartNo, removed);
	}

	public static com.fds.vr.business.model.VRDossierFile getDossierFileByDID_FTNO_First(
		long dossierId, java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .getDossierFileByDID_FTNO_First(dossierId, fileTemplateNo,
			removed, orderByComparator);
	}

	/**
	* Returns the vr dossier file with the primary key.
	*
	* @param dossierFileId the primary key of the vr dossier file
	* @return the vr dossier file
	* @throws PortalException if a vr dossier file with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRDossierFile getVRDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRDossierFile(dossierFileId);
	}

	/**
	* Returns the vr dossier file matching the UUID and group.
	*
	* @param uuid the vr dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier file
	* @throws PortalException if a matching vr dossier file could not be found
	*/
	public static com.fds.vr.business.model.VRDossierFile getVRDossierFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRDossierFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the vr dossier file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrDossierFile the vr dossier file
	* @return the vr dossier file that was updated
	*/
	public static com.fds.vr.business.model.VRDossierFile updateVRDossierFile(
		com.fds.vr.business.model.VRDossierFile vrDossierFile) {
		return getService().updateVRDossierFile(vrDossierFile);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	* Returns the number of vr dossier files.
	*
	* @return the number of vr dossier files
	*/
	public static int getVRDossierFilesCount() {
		return getService().getVRDossierFilesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the vr dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @return the range of vr dossier files
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossierFile> getVRDossierFiles(
		int start, int end) {
		return getService().getVRDossierFiles(start, end);
	}

	/**
	* Returns all the vr dossier files matching the UUID and company.
	*
	* @param uuid the UUID of the vr dossier files
	* @param companyId the primary key of the company
	* @return the matching vr dossier files, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossierFile> getVRDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getVRDossierFilesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of vr dossier files matching the UUID and company.
	*
	* @param uuid the UUID of the vr dossier files
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of vr dossier files
	* @param end the upper bound of the range of vr dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching vr dossier files, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossierFile> getVRDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.VRDossierFile> orderByComparator) {
		return getService()
				   .getVRDossierFilesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
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

	public static VRDossierFileLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRDossierFileLocalService, VRDossierFileLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRDossierFileLocalService.class);
}