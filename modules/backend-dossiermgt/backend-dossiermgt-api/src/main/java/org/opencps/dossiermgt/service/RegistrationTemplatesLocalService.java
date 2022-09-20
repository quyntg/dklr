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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.RegistrationTemplates;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for RegistrationTemplates. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see RegistrationTemplatesLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.RegistrationTemplatesLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.RegistrationTemplatesLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RegistrationTemplatesLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationTemplatesLocalServiceUtil} to access the registration templates local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.RegistrationTemplatesLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of registration templateses.
	*
	* @return the number of registration templateses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRegistrationTemplatesesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationTemplates> getRegistrationTemplatesbyFormNo(
		long groupId, java.lang.String formNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationTemplates> getRegistrationTemplatesbyGOVCODE(
		long groupId, java.lang.String govAgencyCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationTemplates> getRegistrationTemplatesbyGroupId(
		long groupId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationTemplates> getRegistrationTemplateses(int start,
		int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public RegistrationTemplates addRegistrationTemplates(long groupId,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String formNo, java.lang.String formName, boolean multiple,
		java.lang.String formScript, java.lang.String formReport,
		java.lang.String sampleData, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	* Adds the registration templates to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationTemplates addRegistrationTemplates(
		RegistrationTemplates registrationTemplates);

	/**
	* Creates a new registration templates with the primary key. Does not add the registration templates to the database.
	*
	* @param registrationTemplateId the primary key for the new registration templates
	* @return the new registration templates
	*/
	public RegistrationTemplates createRegistrationTemplates(
		long registrationTemplateId);

	/**
	* Deletes the registration templates with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplateId the primary key of the registration templates
	* @return the registration templates that was removed
	* @throws PortalException if a registration templates with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationTemplates deleteRegistrationTemplates(
		long registrationTemplateId) throws PortalException;

	/**
	* Deletes the registration templates from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationTemplates deleteRegistrationTemplates(
		RegistrationTemplates registrationTemplates);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates fetchRegistrationTemplates(
		long registrationTemplateId);

	/**
	* Returns the registration templates matching the UUID and group.
	*
	* @param uuid the registration templates's UUID
	* @param groupId the primary key of the group
	* @return the matching registration templates, or <code>null</code> if a matching registration templates could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates fetchRegistrationTemplatesByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates getRegTempbyFormNoGovCode(long groupId,
		java.lang.String formNo, java.lang.String govAgencyCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates getRegTempbyRegId(long groupId,
		long registrationTemplatesId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates getRegistrationTemplatebyId(long groupId,
		java.lang.String registrationTemplateId) throws PortalException;

	/**
	* Returns the registration templates with the primary key.
	*
	* @param registrationTemplateId the primary key of the registration templates
	* @return the registration templates
	* @throws PortalException if a registration templates with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates getRegistrationTemplates(
		long registrationTemplateId) throws PortalException;

	/**
	* Returns the registration templates matching the UUID and group.
	*
	* @param uuid the registration templates's UUID
	* @param groupId the primary key of the group
	* @return the matching registration templates
	* @throws PortalException if a matching registration templates could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationTemplates getRegistrationTemplatesByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	public RegistrationTemplates removeRegistrationTemplate(long groupId,
		java.lang.String registrationTemplateId) throws PortalException;

	public RegistrationTemplates updateFormReport(long groupId,
		long registrationTemplatesId, java.lang.String formReport,
		ServiceContext serviceContext) throws PortalException, SystemException;

	public RegistrationTemplates updateFormScript(long groupId,
		long registrationTemplateId, java.lang.String formScript,
		ServiceContext serviceContext) throws PortalException, SystemException;

	public RegistrationTemplates updateRegistrationTemplates(long groupId,
		long registrationTemplateId, java.lang.String govAgencyCode,
		java.lang.String govAgencyName, java.lang.String formNo,
		java.lang.String formName, boolean multiple,
		java.lang.String formScript, java.lang.String formReport,
		java.lang.String sampleData, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Updates the registration templates in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationTemplates the registration templates
	* @return the registration templates that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationTemplates updateRegistrationTemplates(
		RegistrationTemplates registrationTemplates);

	public RegistrationTemplates updateSampledata(long groupId,
		long registrationTemplatesId, java.lang.String sampleData,
		ServiceContext serviceContext) throws PortalException, SystemException;
}