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
 * Provides a wrapper for {@link VRTrackchangesLocalService}.
 *
 * @author LamTV
 * @see VRTrackchangesLocalService
 * @generated
 */
@ProviderType
public class VRTrackchangesLocalServiceWrapper
	implements VRTrackchangesLocalService,
		ServiceWrapper<VRTrackchangesLocalService> {
	public VRTrackchangesLocalServiceWrapper(
		VRTrackchangesLocalService vrTrackchangesLocalService) {
		_vrTrackchangesLocalService = vrTrackchangesLocalService;
	}

	/**
	* Adds the vr trackchanges to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges addVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return _vrTrackchangesLocalService.addVRTrackchanges(vrTrackchanges);
	}

	/**
	* Creates a new vr trackchanges with the primary key. Does not add the vr trackchanges to the database.
	*
	* @param id the primary key for the new vr trackchanges
	* @return the new vr trackchanges
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges createVRTrackchanges(
		long id) {
		return _vrTrackchangesLocalService.createVRTrackchanges(id);
	}

	/**
	* Deletes the vr trackchanges from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges deleteVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return _vrTrackchangesLocalService.deleteVRTrackchanges(vrTrackchanges);
	}

	/**
	* Deletes the vr trackchanges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges that was removed
	* @throws PortalException if a vr trackchanges with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges deleteVRTrackchanges(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTrackchangesLocalService.deleteVRTrackchanges(id);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges fetchVRTrackchanges(long id) {
		return _vrTrackchangesLocalService.fetchVRTrackchanges(id);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges findByApplicantCode(
		java.lang.String applicantCode) {
		return _vrTrackchangesLocalService.findByApplicantCode(applicantCode);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges findByDossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return _vrTrackchangesLocalService.findByDossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges findByDossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate) {
		return _vrTrackchangesLocalService.findByDossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges findByProductionPlantCode(
		java.lang.String productionPlantCode) {
		return _vrTrackchangesLocalService.findByProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr trackchanges with the primary key.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges
	* @throws PortalException if a vr trackchanges with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges getVRTrackchanges(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTrackchangesLocalService.getVRTrackchanges(id);
	}

	/**
	* Updates the vr trackchanges in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTrackchanges updateVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return _vrTrackchangesLocalService.updateVRTrackchanges(vrTrackchanges);
	}

	@Override
	public com.fds.vr.business.model.VRTrackchanges updateVRTrackchanges(
		long id, java.lang.String applicantCode,
		java.lang.String productionPlantCode, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.lang.String contentType, java.lang.String contentFileTemplate,
		long fileEntryId, java.util.Date syncDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _vrTrackchangesLocalService.updateVRTrackchanges(id,
			applicantCode, productionPlantCode, dossierId, dossierIdCTN,
			dossierNo, contentType, contentFileTemplate, fileEntryId, syncDate,
			serviceContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTrackchangesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTrackchangesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTrackchangesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTrackchangesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTrackchangesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr trackchangeses.
	*
	* @return the number of vr trackchangeses
	*/
	@Override
	public int getVRTrackchangesesCount() {
		return _vrTrackchangesLocalService.getVRTrackchangesesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTrackchangesLocalService.getOSGiServiceIdentifier();
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
		return _vrTrackchangesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTrackchangesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTrackchangesLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTrackchanges> findByContentType(
		java.lang.String contentType, int start, int end) {
		return _vrTrackchangesLocalService.findByContentType(contentType,
			start, end);
	}

	/**
	* Returns a range of all the vr trackchangeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @return the range of vr trackchangeses
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTrackchanges> getVRTrackchangeses(
		int start, int end) {
		return _vrTrackchangesLocalService.getVRTrackchangeses(start, end);
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
		return _vrTrackchangesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTrackchangesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTrackchangesLocalService getWrappedService() {
		return _vrTrackchangesLocalService;
	}

	@Override
	public void setWrappedService(
		VRTrackchangesLocalService vrTrackchangesLocalService) {
		_vrTrackchangesLocalService = vrTrackchangesLocalService;
	}

	private VRTrackchangesLocalService _vrTrackchangesLocalService;
}