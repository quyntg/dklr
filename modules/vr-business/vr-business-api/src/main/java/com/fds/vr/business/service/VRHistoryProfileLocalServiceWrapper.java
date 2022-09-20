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
 * Provides a wrapper for {@link VRHistoryProfileLocalService}.
 *
 * @author LamTV
 * @see VRHistoryProfileLocalService
 * @generated
 */
@ProviderType
public class VRHistoryProfileLocalServiceWrapper
	implements VRHistoryProfileLocalService,
		ServiceWrapper<VRHistoryProfileLocalService> {
	public VRHistoryProfileLocalServiceWrapper(
		VRHistoryProfileLocalService vrHistoryProfileLocalService) {
		_vrHistoryProfileLocalService = vrHistoryProfileLocalService;
	}

	/**
	* Adds the vr history profile to the database. Also notifies the appropriate model listeners.
	*
	* @param vrHistoryProfile the vr history profile
	* @return the vr history profile that was added
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile addVRHistoryProfile(
		com.fds.vr.business.model.VRHistoryProfile vrHistoryProfile) {
		return _vrHistoryProfileLocalService.addVRHistoryProfile(vrHistoryProfile);
	}

	/**
	* Creates a new vr history profile with the primary key. Does not add the vr history profile to the database.
	*
	* @param id the primary key for the new vr history profile
	* @return the new vr history profile
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile createVRHistoryProfile(
		long id) {
		return _vrHistoryProfileLocalService.createVRHistoryProfile(id);
	}

	/**
	* Deletes the vr history profile from the database. Also notifies the appropriate model listeners.
	*
	* @param vrHistoryProfile the vr history profile
	* @return the vr history profile that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile deleteVRHistoryProfile(
		com.fds.vr.business.model.VRHistoryProfile vrHistoryProfile) {
		return _vrHistoryProfileLocalService.deleteVRHistoryProfile(vrHistoryProfile);
	}

	/**
	* Deletes the vr history profile with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile that was removed
	* @throws PortalException if a vr history profile with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile deleteVRHistoryProfile(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrHistoryProfileLocalService.deleteVRHistoryProfile(id);
	}

	@Override
	public com.fds.vr.business.model.VRHistoryProfile fetchVRHistoryProfile(
		long id) {
		return _vrHistoryProfileLocalService.fetchVRHistoryProfile(id);
	}

	/**
	* Returns the vr history profile with the primary key.
	*
	* @param id the primary key of the vr history profile
	* @return the vr history profile
	* @throws PortalException if a vr history profile with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile getVRHistoryProfile(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrHistoryProfileLocalService.getVRHistoryProfile(id);
	}

	/**
	* Updates the vr history profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrHistoryProfile the vr history profile
	* @return the vr history profile that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRHistoryProfile updateVRHistoryProfile(
		com.fds.vr.business.model.VRHistoryProfile vrHistoryProfile) {
		return _vrHistoryProfileLocalService.updateVRHistoryProfile(vrHistoryProfile);
	}

	@Override
	public com.fds.vr.business.model.VRHistoryProfile updateVRHistoryProfile(
		long id, java.lang.String applicantCode,
		java.lang.String productionPlantCode, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.lang.String contentType, java.lang.String contentFileTemplate,
		long jsonFileEntryId, long pdfFileEntryId, java.util.Date syncDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _vrHistoryProfileLocalService.updateVRHistoryProfile(id,
			applicantCode, productionPlantCode, dossierId, dossierIdCTN,
			dossierNo, contentType, contentFileTemplate, jsonFileEntryId,
			pdfFileEntryId, syncDate, serviceContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrHistoryProfileLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrHistoryProfileLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrHistoryProfileLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrHistoryProfileLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrHistoryProfileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr history profiles.
	*
	* @return the number of vr history profiles
	*/
	@Override
	public int getVRHistoryProfilesCount() {
		return _vrHistoryProfileLocalService.getVRHistoryProfilesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrHistoryProfileLocalService.getOSGiServiceIdentifier();
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
		return _vrHistoryProfileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrHistoryProfileLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrHistoryProfileLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findByApplicantCode(
		java.lang.String applicantCode, int start, int end) {
		return _vrHistoryProfileLocalService.findByApplicantCode(applicantCode,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findByContentType(
		java.lang.String contentType, int start, int end) {
		return _vrHistoryProfileLocalService.findByContentType(contentType,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findByDossierId(
		long dossierId, int start, int end) {
		return _vrHistoryProfileLocalService.findByDossierId(dossierId, start,
			end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end) {
		return _vrHistoryProfileLocalService.findByDossierIdCTN(dossierIdCTN,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findByProductionPlantCode(
		java.lang.String productionPlantCode, int start, int end) {
		return _vrHistoryProfileLocalService.findByProductionPlantCode(productionPlantCode,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> findVRHitoryProfiles(
		java.lang.String applicantCode, java.lang.String productionPlantCode,
		long dossierId, java.lang.String dossierIdCTN,
		java.lang.String dossierNo, java.lang.String contentType,
		java.lang.String contentFileTemplate, int start, int end) {
		return _vrHistoryProfileLocalService.findVRHitoryProfiles(applicantCode,
			productionPlantCode, dossierId, dossierIdCTN, dossierNo,
			contentType, contentFileTemplate, start, end);
	}

	/**
	* Returns a range of all the vr history profiles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRHistoryProfileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr history profiles
	* @param end the upper bound of the range of vr history profiles (not inclusive)
	* @return the range of vr history profiles
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRHistoryProfile> getVRHistoryProfiles(
		int start, int end) {
		return _vrHistoryProfileLocalService.getVRHistoryProfiles(start, end);
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
		return _vrHistoryProfileLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrHistoryProfileLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void deleteByDossierIdCTN_contentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		_vrHistoryProfileLocalService.deleteByDossierIdCTN_contentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	@Override
	public VRHistoryProfileLocalService getWrappedService() {
		return _vrHistoryProfileLocalService;
	}

	@Override
	public void setWrappedService(
		VRHistoryProfileLocalService vrHistoryProfileLocalService) {
		_vrHistoryProfileLocalService = vrHistoryProfileLocalService;
	}

	private VRHistoryProfileLocalService _vrHistoryProfileLocalService;
}