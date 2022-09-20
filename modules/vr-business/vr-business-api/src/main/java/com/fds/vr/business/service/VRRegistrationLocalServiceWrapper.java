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
 * Provides a wrapper for {@link VRRegistrationLocalService}.
 *
 * @author LamTV
 * @see VRRegistrationLocalService
 * @generated
 */
@ProviderType
public class VRRegistrationLocalServiceWrapper
	implements VRRegistrationLocalService,
		ServiceWrapper<VRRegistrationLocalService> {
	public VRRegistrationLocalServiceWrapper(
		VRRegistrationLocalService vrRegistrationLocalService) {
		_vrRegistrationLocalService = vrRegistrationLocalService;
	}

	/**
	* Adds the vr registration to the database. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was added
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration addVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return _vrRegistrationLocalService.addVRRegistration(vrRegistration);
	}

	/**
	* Creates a new vr registration with the primary key. Does not add the vr registration to the database.
	*
	* @param registrationId the primary key for the new vr registration
	* @return the new vr registration
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration createVRRegistration(
		long registrationId) {
		return _vrRegistrationLocalService.createVRRegistration(registrationId);
	}

	/**
	* Deletes the vr registration from the database. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration deleteVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return _vrRegistrationLocalService.deleteVRRegistration(vrRegistration);
	}

	/**
	* Deletes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration that was removed
	* @throws PortalException if a vr registration with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration deleteVRRegistration(
		long registrationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrRegistrationLocalService.deleteVRRegistration(registrationId);
	}

	@Override
	public com.fds.vr.business.model.VRRegistration fetchVRRegistration(
		long registrationId) {
		return _vrRegistrationLocalService.fetchVRRegistration(registrationId);
	}

	/**
	* Returns the vr registration matching the UUID and group.
	*
	* @param uuid the vr registration's UUID
	* @param groupId the primary key of the group
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration fetchVRRegistrationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _vrRegistrationLocalService.fetchVRRegistrationByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.fds.vr.business.model.VRRegistration getByApplicantIdNo(
		java.lang.String applicantIdNo) {
		return _vrRegistrationLocalService.getByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns the vr registration with the primary key.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration
	* @throws PortalException if a vr registration with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration getVRRegistration(
		long registrationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrRegistrationLocalService.getVRRegistration(registrationId);
	}

	/**
	* Returns the vr registration matching the UUID and group.
	*
	* @param uuid the vr registration's UUID
	* @param groupId the primary key of the group
	* @return the matching vr registration
	* @throws PortalException if a matching vr registration could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration getVRRegistrationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrRegistrationLocalService.getVRRegistrationByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the vr registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRRegistration updateVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return _vrRegistrationLocalService.updateVRRegistration(vrRegistration);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrRegistrationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrRegistrationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _vrRegistrationLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrRegistrationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrRegistrationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrRegistrationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr registrations.
	*
	* @return the number of vr registrations
	*/
	@Override
	public int getVRRegistrationsCount() {
		return _vrRegistrationLocalService.getVRRegistrationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrRegistrationLocalService.getOSGiServiceIdentifier();
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
		return _vrRegistrationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrRegistrationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrRegistrationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the vr registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @return the range of vr registrations
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrations(
		int start, int end) {
		return _vrRegistrationLocalService.getVRRegistrations(start, end);
	}

	/**
	* Returns all the vr registrations matching the UUID and company.
	*
	* @param uuid the UUID of the vr registrations
	* @param companyId the primary key of the company
	* @return the matching vr registrations, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _vrRegistrationLocalService.getVRRegistrationsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of vr registrations matching the UUID and company.
	*
	* @param uuid the UUID of the vr registrations
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of vr registrations
	* @param end the upper bound of the range of vr registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching vr registrations, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.VRRegistration> orderByComparator) {
		return _vrRegistrationLocalService.getVRRegistrationsByUuidAndCompanyId(uuid,
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
		return _vrRegistrationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrRegistrationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRRegistrationLocalService getWrappedService() {
		return _vrRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		VRRegistrationLocalService vrRegistrationLocalService) {
		_vrRegistrationLocalService = vrRegistrationLocalService;
	}

	private VRRegistrationLocalService _vrRegistrationLocalService;
}