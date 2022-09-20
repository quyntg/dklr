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
 * Provides the local service utility for RegistrationTemplates. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.RegistrationTemplatesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see RegistrationTemplatesLocalService
 * @see org.opencps.dossiermgt.service.base.RegistrationTemplatesLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.RegistrationTemplatesLocalServiceImpl
 * @generated
 */
@ProviderType
public class RegistrationTemplatesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.RegistrationTemplatesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Returns the number of registration templateses.
	*
	* @return the number of registration templateses
	*/
	public static int getRegistrationTemplatesesCount() {
		return getService().getRegistrationTemplatesesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationTemplatesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationTemplatesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.RegistrationTemplates> getRegistrationTemplatesbyFormNo(
		long groupId, java.lang.String formNo) {
		return getService().getRegistrationTemplatesbyFormNo(groupId, formNo);
	}

	public static java.util.List<org.opencps.dossiermgt.model.RegistrationTemplates> getRegistrationTemplatesbyGOVCODE(
		long groupId, java.lang.String govAgencyCode) {
		return getService()
				   .getRegistrationTemplatesbyGOVCODE(groupId, govAgencyCode);
	}

	public static java.util.List<org.opencps.dossiermgt.model.RegistrationTemplates> getRegistrationTemplatesbyGroupId(
		long groupId) {
		return getService().getRegistrationTemplatesbyGroupId(groupId);
	}

	/**
	* Returns a range of all the registration templateses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationTemplatesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration templateses
	* @param end the upper bound of the range of registration templateses (not inclusive)
	* @return the range of registration templateses
	*/
	public static java.util.List<org.opencps.dossiermgt.model.RegistrationTemplates> getRegistrationTemplateses(
		int start, int end) {
		return getService().getRegistrationTemplateses(start, end);
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

	public static org.opencps.dossiermgt.model.RegistrationTemplates addRegistrationTemplates(
		long groupId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, java.lang.String formNo,
		java.lang.String formName, boolean multiple,
		java.lang.String formScript, java.lang.String formReport,
		java.lang.String sampleData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRegistrationTemplates(groupId, govAgencyCode,
			govAgencyName, formNo, formName, multiple, formScript, formReport,
			sampleData, serviceContext);
	}

	/**
	* Adds the registration templates to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was added
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates addRegistrationTemplates(
		org.opencps.dossiermgt.model.RegistrationTemplates registrationTemplates) {
		return getService().addRegistrationTemplates(registrationTemplates);
	}

	/**
	* Creates a new registration templates with the primary key. Does not add the registration templates to the database.
	*
	* @param registrationTemplateId the primary key for the new registration templates
	* @return the new registration templates
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates createRegistrationTemplates(
		long registrationTemplateId) {
		return getService().createRegistrationTemplates(registrationTemplateId);
	}

	/**
	* Deletes the registration templates with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplateId the primary key of the registration templates
	* @return the registration templates that was removed
	* @throws PortalException if a registration templates with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates deleteRegistrationTemplates(
		long registrationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRegistrationTemplates(registrationTemplateId);
	}

	/**
	* Deletes the registration templates from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was removed
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates deleteRegistrationTemplates(
		org.opencps.dossiermgt.model.RegistrationTemplates registrationTemplates) {
		return getService().deleteRegistrationTemplates(registrationTemplates);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates fetchRegistrationTemplates(
		long registrationTemplateId) {
		return getService().fetchRegistrationTemplates(registrationTemplateId);
	}

	/**
	* Returns the registration templates matching the UUID and group.
	*
	* @param uuid the registration templates's UUID
	* @param groupId the primary key of the group
	* @return the matching registration templates, or <code>null</code> if a matching registration templates could not be found
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates fetchRegistrationTemplatesByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService()
				   .fetchRegistrationTemplatesByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates getRegTempbyFormNoGovCode(
		long groupId, java.lang.String formNo, java.lang.String govAgencyCode) {
		return getService()
				   .getRegTempbyFormNoGovCode(groupId, formNo, govAgencyCode);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates getRegTempbyRegId(
		long groupId, long registrationTemplatesId) {
		return getService().getRegTempbyRegId(groupId, registrationTemplatesId);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates getRegistrationTemplatebyId(
		long groupId, java.lang.String registrationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getRegistrationTemplatebyId(groupId, registrationTemplateId);
	}

	/**
	* Returns the registration templates with the primary key.
	*
	* @param registrationTemplateId the primary key of the registration templates
	* @return the registration templates
	* @throws PortalException if a registration templates with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates getRegistrationTemplates(
		long registrationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRegistrationTemplates(registrationTemplateId);
	}

	/**
	* Returns the registration templates matching the UUID and group.
	*
	* @param uuid the registration templates's UUID
	* @param groupId the primary key of the group
	* @return the matching registration templates
	* @throws PortalException if a matching registration templates could not be found
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates getRegistrationTemplatesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getRegistrationTemplatesByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates removeRegistrationTemplate(
		long groupId, java.lang.String registrationTemplateId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .removeRegistrationTemplate(groupId, registrationTemplateId);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates updateFormReport(
		long groupId, long registrationTemplatesId,
		java.lang.String formReport,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFormReport(groupId, registrationTemplatesId,
			formReport, serviceContext);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates updateFormScript(
		long groupId, long registrationTemplateId, java.lang.String formScript,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFormScript(groupId, registrationTemplateId,
			formScript, serviceContext);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates updateRegistrationTemplates(
		long groupId, long registrationTemplateId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String formNo, java.lang.String formName, boolean multiple,
		java.lang.String formScript, java.lang.String formReport,
		java.lang.String sampleData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateRegistrationTemplates(groupId,
			registrationTemplateId, govAgencyCode, govAgencyName, formNo,
			formName, multiple, formScript, formReport, sampleData,
			serviceContext);
	}

	/**
	* Updates the registration templates in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was updated
	*/
	public static org.opencps.dossiermgt.model.RegistrationTemplates updateRegistrationTemplates(
		org.opencps.dossiermgt.model.RegistrationTemplates registrationTemplates) {
		return getService().updateRegistrationTemplates(registrationTemplates);
	}

	public static org.opencps.dossiermgt.model.RegistrationTemplates updateSampledata(
		long groupId, long registrationTemplatesId,
		java.lang.String sampleData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateSampledata(groupId, registrationTemplatesId,
			sampleData, serviceContext);
	}

	public static RegistrationTemplatesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RegistrationTemplatesLocalService, RegistrationTemplatesLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RegistrationTemplatesLocalService.class);
}