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
 * Provides the local service utility for VRDossier. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRDossierLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRDossierLocalService
 * @see com.fds.vr.business.service.base.VRDossierLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRDossierLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRDossierLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRDossierLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was added
	*/
	public static com.fds.vr.business.model.VRDossier addVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return getService().addVRDossier(vrDossier);
	}

	/**
	* Creates a new vr dossier with the primary key. Does not add the vr dossier to the database.
	*
	* @param dossierId the primary key for the new vr dossier
	* @return the new vr dossier
	*/
	public static com.fds.vr.business.model.VRDossier createVRDossier(
		long dossierId) {
		return getService().createVRDossier(dossierId);
	}

	/**
	* Deletes the vr dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was removed
	*/
	public static com.fds.vr.business.model.VRDossier deleteVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return getService().deleteVRDossier(vrDossier);
	}

	/**
	* Deletes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier that was removed
	* @throws PortalException if a vr dossier with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRDossier deleteVRDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRDossier(dossierId);
	}

	public static com.fds.vr.business.model.VRDossier fetchVRDossier(
		long dossierId) {
		return getService().fetchVRDossier(dossierId);
	}

	/**
	* Returns the vr dossier matching the UUID and group.
	*
	* @param uuid the vr dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	public static com.fds.vr.business.model.VRDossier fetchVRDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchVRDossierByUuidAndGroupId(uuid, groupId);
	}

	public static com.fds.vr.business.model.VRDossier getByRef(long groupId,
		java.lang.String refId) {
		return getService().getByRef(groupId, refId);
	}

	/**
	* Returns the vr dossier with the primary key.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier
	* @throws PortalException if a vr dossier with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRDossier getVRDossier(
		long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRDossier(dossierId);
	}

	/**
	* Returns the vr dossier matching the UUID and group.
	*
	* @param uuid the vr dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier
	* @throws PortalException if a matching vr dossier could not be found
	*/
	public static com.fds.vr.business.model.VRDossier getVRDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRDossierByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the vr dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was updated
	*/
	public static com.fds.vr.business.model.VRDossier updateVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return getService().updateVRDossier(vrDossier);
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
	* Returns the number of vr dossiers.
	*
	* @return the number of vr dossiers
	*/
	public static int getVRDossiersCount() {
		return getService().getVRDossiersCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the vr dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRDossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @return the range of vr dossiers
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiers(
		int start, int end) {
		return getService().getVRDossiers(start, end);
	}

	/**
	* Returns all the vr dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the vr dossiers
	* @param companyId the primary key of the company
	* @return the matching vr dossiers, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getVRDossiersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of vr dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the vr dossiers
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of vr dossiers
	* @param end the upper bound of the range of vr dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching vr dossiers, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.VRDossier> orderByComparator) {
		return getService()
				   .getVRDossiersByUuidAndCompanyId(uuid, companyId, start,
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

	public static VRDossierLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRDossierLocalService, VRDossierLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRDossierLocalService.class);
}