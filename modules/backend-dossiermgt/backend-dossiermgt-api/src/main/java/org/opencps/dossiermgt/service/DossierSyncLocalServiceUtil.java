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

package org.opencps.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DossierSync. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierSyncLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DossierSyncLocalService
 * @see org.opencps.dossiermgt.service.base.DossierSyncLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierSyncLocalServiceImpl
 * @generated
 */
@ProviderType
public class DossierSyncLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierSyncLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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

	public static int countByDossierId(long dossierId) {
		return getService().countByDossierId(dossierId);
	}

	public static int countByGroupDossierId(long groupId, long dossierId) {
		return getService().countByGroupDossierId(groupId, dossierId);
	}

	public static int countByGroupDossierRef(long groupId,
		java.lang.String dossierRef) {
		return getService().countByGroupDossierRef(groupId, dossierRef);
	}

	/**
	* Returns the number of dossier syncs.
	*
	* @return the number of dossier syncs
	*/
	public static int getDossierSyncsCount() {
		return getService().getDossierSyncsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupDossierId(
		long groupId, long dossierId, int start, int end) {
		return getService().fetchByGroupDossierId(groupId, dossierId, start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupDossierRef(
		long groupId, java.lang.String dossierRef, int start, int end) {
		return getService()
				   .fetchByGroupDossierRef(groupId, dossierRef, start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupId(
		long groupId, int start, int end) {
		return getService().fetchByGroupId(groupId, start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByServerNo(
		java.lang.String serverNo, int start, int end) {
		return getService().fetchByServerNo(serverNo, start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByServerNo(
		java.lang.String serverNo, int state, int start, int end) {
		return getService().fetchByServerNo(serverNo, state, start, end);
	}

	/**
	* Returns a range of all the dossier syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of dossier syncs
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncs(
		int start, int end) {
		return getService().getDossierSyncs(start, end);
	}

	/**
	* Returns all the dossier syncs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier syncs
	* @param companyId the primary key of the company
	* @return the matching dossier syncs, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDossierSyncsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of dossier syncs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier syncs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossier syncs, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.DossierSync> orderByComparator) {
		return getService()
				   .getDossierSyncsByUuidAndCompanyId(uuid, companyId, start,
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

	/**
	* Adds the dossier sync to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was added
	*/
	public static org.opencps.dossiermgt.model.DossierSync addDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return getService().addDossierSync(dossierSync);
	}

	/**
	* Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	*
	* @param dossierSyncId the primary key for the new dossier sync
	* @return the new dossier sync
	*/
	public static org.opencps.dossiermgt.model.DossierSync createDossierSync(
		long dossierSyncId) {
		return getService().createDossierSync(dossierSyncId);
	}

	/**
	* Deletes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync that was removed
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierSync deleteDossierSync(
		long dossierSyncId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierSync(dossierSyncId);
	}

	/**
	* Deletes the dossier sync from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was removed
	*/
	public static org.opencps.dossiermgt.model.DossierSync deleteDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return getService().deleteDossierSync(dossierSync);
	}

	public static org.opencps.dossiermgt.model.DossierSync fetchDossierSync(
		long dossierSyncId) {
		return getService().fetchDossierSync(dossierSyncId);
	}

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierSync fetchDossierSyncByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDossierSyncByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the dossier sync with the primary key.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierSync getDossierSync(
		long dossierSyncId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierSync(dossierSyncId);
	}

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync
	* @throws PortalException if a matching dossier sync could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierSync getDossierSyncByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierSyncByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.DossierSync shiftCreateDossierStatus(
		long dossierSyncId) {
		return getService().shiftCreateDossierStatus(dossierSyncId);
	}

	public static org.opencps.dossiermgt.model.DossierSync updateCreateDossierStatus(
		long dossierSyncId, boolean status) {
		return getService().updateCreateDossierStatus(dossierSyncId, status);
	}

	public static org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		long groupId, long userId, long dossierId,
		java.lang.String dossierReferenceUid, boolean createDossier,
		int method, long classPK, java.lang.String fileReferenceUid,
		java.lang.String serverNo) {
		return getService()
				   .updateDossierSync(groupId, userId, dossierId,
			dossierReferenceUid, createDossier, method, classPK,
			fileReferenceUid, serverNo);
	}

	public static org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		long groupId, long userId, long dossierId,
		java.lang.String dossierReferenceUid, boolean createDossier,
		int method, long classPK, java.lang.String fileReferenceUid,
		java.lang.String serverNo, java.lang.String payload, int retry,
		int state) throws com.liferay.portal.kernel.json.JSONException {
		return getService()
				   .updateDossierSync(groupId, userId, dossierId,
			dossierReferenceUid, createDossier, method, classPK,
			fileReferenceUid, serverNo, payload, retry, state);
	}

	/**
	* Updates the dossier sync in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was updated
	*/
	public static org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return getService().updateDossierSync(dossierSync);
	}

	public static DossierSyncLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DossierSyncLocalService, DossierSyncLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DossierSyncLocalService.class);
}