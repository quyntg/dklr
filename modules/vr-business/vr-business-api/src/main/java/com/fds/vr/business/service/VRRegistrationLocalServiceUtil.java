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
 * Provides the local service utility for VRRegistration. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRRegistrationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRRegistrationLocalService
 * @see com.fds.vr.business.service.base.VRRegistrationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRRegistrationLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRRegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRRegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr registration to the database. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was added
	*/
	public static com.fds.vr.business.model.VRRegistration addVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return getService().addVRRegistration(vrRegistration);
	}

	/**
	* Creates a new vr registration with the primary key. Does not add the vr registration to the database.
	*
	* @param registrationId the primary key for the new vr registration
	* @return the new vr registration
	*/
	public static com.fds.vr.business.model.VRRegistration createVRRegistration(
		long registrationId) {
		return getService().createVRRegistration(registrationId);
	}

	/**
	* Deletes the vr registration from the database. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was removed
	*/
	public static com.fds.vr.business.model.VRRegistration deleteVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return getService().deleteVRRegistration(vrRegistration);
	}

	/**
	* Deletes the vr registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration that was removed
	* @throws PortalException if a vr registration with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRRegistration deleteVRRegistration(
		long registrationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRRegistration(registrationId);
	}

	public static com.fds.vr.business.model.VRRegistration fetchVRRegistration(
		long registrationId) {
		return getService().fetchVRRegistration(registrationId);
	}

	/**
	* Returns the vr registration matching the UUID and group.
	*
	* @param uuid the vr registration's UUID
	* @param groupId the primary key of the group
	* @return the matching vr registration, or <code>null</code> if a matching vr registration could not be found
	*/
	public static com.fds.vr.business.model.VRRegistration fetchVRRegistrationByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchVRRegistrationByUuidAndGroupId(uuid, groupId);
	}

	public static com.fds.vr.business.model.VRRegistration getByApplicantIdNo(
		java.lang.String applicantIdNo) {
		return getService().getByApplicantIdNo(applicantIdNo);
	}

	/**
	* Returns the vr registration with the primary key.
	*
	* @param registrationId the primary key of the vr registration
	* @return the vr registration
	* @throws PortalException if a vr registration with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRRegistration getVRRegistration(
		long registrationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRRegistration(registrationId);
	}

	/**
	* Returns the vr registration matching the UUID and group.
	*
	* @param uuid the vr registration's UUID
	* @param groupId the primary key of the group
	* @return the matching vr registration
	* @throws PortalException if a matching vr registration could not be found
	*/
	public static com.fds.vr.business.model.VRRegistration getVRRegistrationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRRegistrationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the vr registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrRegistration the vr registration
	* @return the vr registration that was updated
	*/
	public static com.fds.vr.business.model.VRRegistration updateVRRegistration(
		com.fds.vr.business.model.VRRegistration vrRegistration) {
		return getService().updateVRRegistration(vrRegistration);
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
	* Returns the number of vr registrations.
	*
	* @return the number of vr registrations
	*/
	public static int getVRRegistrationsCount() {
		return getService().getVRRegistrationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrations(
		int start, int end) {
		return getService().getVRRegistrations(start, end);
	}

	/**
	* Returns all the vr registrations matching the UUID and company.
	*
	* @param uuid the UUID of the vr registrations
	* @param companyId the primary key of the company
	* @return the matching vr registrations, or an empty list if no matches were found
	*/
	public static java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getVRRegistrationsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.fds.vr.business.model.VRRegistration> getVRRegistrationsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.fds.vr.business.model.VRRegistration> orderByComparator) {
		return getService()
				   .getVRRegistrationsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
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

	public static VRRegistrationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRRegistrationLocalService, VRRegistrationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRRegistrationLocalService.class);
}