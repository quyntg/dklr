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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DossierSyncLocalService}.
 *
 * @author huymq
 * @see DossierSyncLocalService
 * @generated
 */
@ProviderType
public class DossierSyncLocalServiceWrapper implements DossierSyncLocalService,
	ServiceWrapper<DossierSyncLocalService> {
	public DossierSyncLocalServiceWrapper(
		DossierSyncLocalService dossierSyncLocalService) {
		_dossierSyncLocalService = dossierSyncLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _dossierSyncLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierSyncLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _dossierSyncLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _dossierSyncLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierSyncLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierSyncLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByDossierId(long dossierId) {
		return _dossierSyncLocalService.countByDossierId(dossierId);
	}

	@Override
	public int countByGroupDossierId(long groupId, long dossierId) {
		return _dossierSyncLocalService.countByGroupDossierId(groupId, dossierId);
	}

	@Override
	public int countByGroupDossierRef(long groupId, java.lang.String dossierRef) {
		return _dossierSyncLocalService.countByGroupDossierRef(groupId,
			dossierRef);
	}

	/**
	* Returns the number of dossier syncs.
	*
	* @return the number of dossier syncs
	*/
	@Override
	public int getDossierSyncsCount() {
		return _dossierSyncLocalService.getDossierSyncsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dossierSyncLocalService.getOSGiServiceIdentifier();
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
		return _dossierSyncLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _dossierSyncLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _dossierSyncLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupDossierId(
		long groupId, long dossierId, int start, int end) {
		return _dossierSyncLocalService.fetchByGroupDossierId(groupId,
			dossierId, start, end);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupDossierRef(
		long groupId, java.lang.String dossierRef, int start, int end) {
		return _dossierSyncLocalService.fetchByGroupDossierRef(groupId,
			dossierRef, start, end);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByGroupId(
		long groupId, int start, int end) {
		return _dossierSyncLocalService.fetchByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByServerNo(
		java.lang.String serverNo, int start, int end) {
		return _dossierSyncLocalService.fetchByServerNo(serverNo, start, end);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> fetchByServerNo(
		java.lang.String serverNo, int state, int start, int end) {
		return _dossierSyncLocalService.fetchByServerNo(serverNo, state, start,
			end);
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
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncs(
		int start, int end) {
		return _dossierSyncLocalService.getDossierSyncs(start, end);
	}

	/**
	* Returns all the dossier syncs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier syncs
	* @param companyId the primary key of the company
	* @return the matching dossier syncs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _dossierSyncLocalService.getDossierSyncsByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.DossierSync> orderByComparator) {
		return _dossierSyncLocalService.getDossierSyncsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _dossierSyncLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierSyncLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the dossier sync to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync addDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return _dossierSyncLocalService.addDossierSync(dossierSync);
	}

	/**
	* Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	*
	* @param dossierSyncId the primary key for the new dossier sync
	* @return the new dossier sync
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync createDossierSync(
		long dossierSyncId) {
		return _dossierSyncLocalService.createDossierSync(dossierSyncId);
	}

	/**
	* Deletes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync that was removed
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync deleteDossierSync(
		long dossierSyncId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierSyncLocalService.deleteDossierSync(dossierSyncId);
	}

	/**
	* Deletes the dossier sync from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync deleteDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return _dossierSyncLocalService.deleteDossierSync(dossierSync);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierSync fetchDossierSync(
		long dossierSyncId) {
		return _dossierSyncLocalService.fetchDossierSync(dossierSyncId);
	}

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync fetchDossierSyncByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _dossierSyncLocalService.fetchDossierSyncByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the dossier sync with the primary key.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync getDossierSync(
		long dossierSyncId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierSyncLocalService.getDossierSync(dossierSyncId);
	}

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync
	* @throws PortalException if a matching dossier sync could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync getDossierSyncByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierSyncLocalService.getDossierSyncByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierSync shiftCreateDossierStatus(
		long dossierSyncId) {
		return _dossierSyncLocalService.shiftCreateDossierStatus(dossierSyncId);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierSync updateCreateDossierStatus(
		long dossierSyncId, boolean status) {
		return _dossierSyncLocalService.updateCreateDossierStatus(dossierSyncId,
			status);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		long groupId, long userId, long dossierId,
		java.lang.String dossierReferenceUid, boolean createDossier,
		int method, long classPK, java.lang.String fileReferenceUid,
		java.lang.String serverNo) {
		return _dossierSyncLocalService.updateDossierSync(groupId, userId,
			dossierId, dossierReferenceUid, createDossier, method, classPK,
			fileReferenceUid, serverNo);
	}

	@Override
	public org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		long groupId, long userId, long dossierId,
		java.lang.String dossierReferenceUid, boolean createDossier,
		int method, long classPK, java.lang.String fileReferenceUid,
		java.lang.String serverNo, java.lang.String payload, int retry,
		int state) throws com.liferay.portal.kernel.json.JSONException {
		return _dossierSyncLocalService.updateDossierSync(groupId, userId,
			dossierId, dossierReferenceUid, createDossier, method, classPK,
			fileReferenceUid, serverNo, payload, retry, state);
	}

	/**
	* Updates the dossier sync in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.DossierSync updateDossierSync(
		org.opencps.dossiermgt.model.DossierSync dossierSync) {
		return _dossierSyncLocalService.updateDossierSync(dossierSync);
	}

	@Override
	public DossierSyncLocalService getWrappedService() {
		return _dossierSyncLocalService;
	}

	@Override
	public void setWrappedService(
		DossierSyncLocalService dossierSyncLocalService) {
		_dossierSyncLocalService = dossierSyncLocalService;
	}

	private DossierSyncLocalService _dossierSyncLocalService;
}