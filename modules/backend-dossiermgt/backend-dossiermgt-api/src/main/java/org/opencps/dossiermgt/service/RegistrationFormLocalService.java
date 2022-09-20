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

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.RegistrationForm;

import java.io.Serializable;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for RegistrationForm. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see RegistrationFormLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.RegistrationFormLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.RegistrationFormLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RegistrationFormLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationFormLocalServiceUtil} to access the registration form local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.RegistrationFormLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Indexable(type = IndexableType.REINDEX)
	public boolean deleteRegistrationForm(java.lang.String referenceUid)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BooleanQuery getQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Hits searchLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params, Sort[] sorts,
		int start, int end, SearchContext searchContext)
		throws ParseException, SearchException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public SearchContext getSearchContext();

	/**
	* Returns the number of registration forms.
	*
	* @return the number of registration forms
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRegistrationFormsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getPattern();

	@Indexable(type = IndexableType.REINDEX)
	public List<RegistrationForm> deleteRegistrationForms(long groupId,
		long registrationId);

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<RegistrationForm> findByG_REGID_ISNEW(long registrationId,
		boolean isNew);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationForm> getFormDataByFormNo(long groupId,
		long registrationId, java.lang.String formNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationForm> getFormsbyRegId(long groupId,
		long registrationId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BooleanClauseOccur> getOccurs();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getParamNames();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Class<?>> getParamTypes();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object> getParams();

	/**
	* Returns a range of all the registration forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.RegistrationFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration forms
	* @param end the upper bound of the range of registration forms (not inclusive)
	* @return the range of registration forms
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationForm> getRegistrationForms(int start, int end);

	/**
	* Returns all the registration forms matching the UUID and company.
	*
	* @param uuid the UUID of the registration forms
	* @param companyId the primary key of the company
	* @return the matching registration forms, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationForm> getRegistrationFormsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of registration forms matching the UUID and company.
	*
	* @param uuid the UUID of the registration forms
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of registration forms
	* @param end the upper bound of the range of registration forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching registration forms, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationForm> getRegistrationFormsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<RegistrationForm> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getSubPatterns();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BooleanQuery> getSubQueries();

	public long countLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params,
		SearchContext searchContext) throws ParseException, SearchException;

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

	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm addRegistrationForm(long groupId, long companyId,
		long registrationId, java.lang.String referenceUid,
		java.lang.String formNo, java.lang.String formName,
		java.lang.String formData, java.lang.String formScript,
		java.lang.String formReport, long fileEntryId, boolean isNew,
		boolean removed, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Adds the registration form to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationForm the registration form
	* @return the registration form that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm addRegistrationForm(
		RegistrationForm registrationForm);

	/**
	* Creates a new registration form with the primary key. Does not add the registration form to the database.
	*
	* @param registrationFormId the primary key for the new registration form
	* @return the new registration form
	*/
	public RegistrationForm createRegistrationForm(long registrationFormId);

	/**
	* Deletes the registration form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationFormId the primary key of the registration form
	* @return the registration form that was removed
	* @throws PortalException if a registration form with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationForm deleteRegistrationForm(long registrationFormId)
		throws PortalException;

	/**
	* Deletes the registration form from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationForm the registration form
	* @return the registration form that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationForm deleteRegistrationForm(
		RegistrationForm registrationForm);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationForm fetchRegistrationForm(long registrationFormId);

	/**
	* Returns the registration form matching the UUID and group.
	*
	* @param uuid the registration form's UUID
	* @param groupId the primary key of the group
	* @return the matching registration form, or <code>null</code> if a matching registration form could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationForm fetchRegistrationFormByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	public RegistrationForm findFormbyRegidRefid(long groupId,
		long registrationId, java.lang.String referenceUid);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationForm getByRegIdAndFormNo(long registrationId,
		java.lang.String formNo);

	/**
	* Returns the registration form with the primary key.
	*
	* @param registrationFormId the primary key of the registration form
	* @return the registration form
	* @throws PortalException if a registration form with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationForm getRegistrationForm(long registrationFormId)
		throws PortalException;

	/**
	* Returns the registration form matching the UUID and group.
	*
	* @param uuid the registration form's UUID
	* @param groupId the primary key of the group
	* @return the matching registration form
	* @throws PortalException if a matching registration form could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationForm getRegistrationFormByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm registrationFormSync(long groupId,
		java.lang.String uuidRegistration, java.lang.String referenceUid,
		java.lang.String formNo, java.lang.String formName,
		java.lang.String formData, java.lang.String formScript,
		java.lang.String formReport, java.lang.Boolean removed,
		ServiceContext serviceContext) throws PortalException, SystemException;

	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm updateFormData(long groupId, long registrationId,
		java.lang.String referenceUid, java.lang.String formData,
		ServiceContext serviceContext) throws PortalException, SystemException;

	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm updateIsNew(long groupId, long registrationId,
		java.lang.String referenceUid, boolean isNew,
		ServiceContext serviceContext) throws PortalException, SystemException;

	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm updateRegistrationForm(long groupId,
		long registrationId, java.lang.String referenceUid,
		java.lang.String formNo, java.lang.String formName,
		java.lang.String formData, java.lang.String formScript,
		java.lang.String formReport, long fileEntryId, boolean isNew,
		boolean removed, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Updates the registration form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationForm the registration form
	* @return the registration form that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationForm updateRegistrationForm(
		RegistrationForm registrationForm);

	public void LuceneQuery(java.lang.String pattern,
		java.lang.String paramValues, java.lang.String paramTypes,
		SearchContext searchContext);

	public void setOccurs(List<BooleanClauseOccur> occurs);

	public void setParamNames(List<java.lang.String> paramNames);

	public void setParamTypes(List<java.lang.Class<?>> paramTypes);

	public void setParams(List<java.lang.Object> params);

	public void setPattern(java.lang.String pattern);

	public void setQuery(BooleanQuery query);

	public void setSearchContext(SearchContext searchContext);

	public void setSubPatterns(List<java.lang.String> subPatterns);

	public void setSubQueries(List<BooleanQuery> subQueries);
}