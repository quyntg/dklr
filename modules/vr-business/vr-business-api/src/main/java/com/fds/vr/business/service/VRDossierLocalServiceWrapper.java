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
 * Provides a wrapper for {@link VRDossierLocalService}.
 *
 * @author LamTV
 * @see VRDossierLocalService
 * @generated
 */
@ProviderType
public class VRDossierLocalServiceWrapper implements VRDossierLocalService,
	ServiceWrapper<VRDossierLocalService> {
	public VRDossierLocalServiceWrapper(
		VRDossierLocalService vrDossierLocalService) {
		_vrDossierLocalService = vrDossierLocalService;
	}

	/**
	* Adds the vr dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was added
	*/
	@Override
	public com.fds.vr.business.model.VRDossier addVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return _vrDossierLocalService.addVRDossier(vrDossier);
	}

	/**
	* Creates a new vr dossier with the primary key. Does not add the vr dossier to the database.
	*
	* @param dossierId the primary key for the new vr dossier
	* @return the new vr dossier
	*/
	@Override
	public com.fds.vr.business.model.VRDossier createVRDossier(long dossierId) {
		return _vrDossierLocalService.createVRDossier(dossierId);
	}

	/**
	* Deletes the vr dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRDossier deleteVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return _vrDossierLocalService.deleteVRDossier(vrDossier);
	}

	/**
	* Deletes the vr dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier that was removed
	* @throws PortalException if a vr dossier with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRDossier deleteVRDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrDossierLocalService.deleteVRDossier(dossierId);
	}

	@Override
	public com.fds.vr.business.model.VRDossier fetchVRDossier(long dossierId) {
		return _vrDossierLocalService.fetchVRDossier(dossierId);
	}

	/**
	* Returns the vr dossier matching the UUID and group.
	*
	* @param uuid the vr dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier, or <code>null</code> if a matching vr dossier could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRDossier fetchVRDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _vrDossierLocalService.fetchVRDossierByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.fds.vr.business.model.VRDossier getByRef(long groupId,
		java.lang.String refId) {
		return _vrDossierLocalService.getByRef(groupId, refId);
	}

	/**
	* Returns the vr dossier with the primary key.
	*
	* @param dossierId the primary key of the vr dossier
	* @return the vr dossier
	* @throws PortalException if a vr dossier with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRDossier getVRDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrDossierLocalService.getVRDossier(dossierId);
	}

	/**
	* Returns the vr dossier matching the UUID and group.
	*
	* @param uuid the vr dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching vr dossier
	* @throws PortalException if a matching vr dossier could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRDossier getVRDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrDossierLocalService.getVRDossierByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the vr dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrDossier the vr dossier
	* @return the vr dossier that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRDossier updateVRDossier(
		com.fds.vr.business.model.VRDossier vrDossier) {
		return _vrDossierLocalService.updateVRDossier(vrDossier);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrDossierLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrDossierLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _vrDossierLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrDossierLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrDossierLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrDossierLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr dossiers.
	*
	* @return the number of vr dossiers
	*/
	@Override
	public int getVRDossiersCount() {
		return _vrDossierLocalService.getVRDossiersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrDossierLocalService.getOSGiServiceIdentifier();
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
		return _vrDossierLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrDossierLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrDossierLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiers(
		int start, int end) {
		return _vrDossierLocalService.getVRDossiers(start, end);
	}

	/**
	* Returns all the vr dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the vr dossiers
	* @param companyId the primary key of the company
	* @return the matching vr dossiers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _vrDossierLocalService.getVRDossiersByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.fds.vr.business.model.VRDossier> getVRDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.VRDossier> orderByComparator) {
		return _vrDossierLocalService.getVRDossiersByUuidAndCompanyId(uuid,
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
		return _vrDossierLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrDossierLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public VRDossierLocalService getWrappedService() {
		return _vrDossierLocalService;
	}

	@Override
	public void setWrappedService(VRDossierLocalService vrDossierLocalService) {
		_vrDossierLocalService = vrDossierLocalService;
	}

	private VRDossierLocalService _vrDossierLocalService;
}