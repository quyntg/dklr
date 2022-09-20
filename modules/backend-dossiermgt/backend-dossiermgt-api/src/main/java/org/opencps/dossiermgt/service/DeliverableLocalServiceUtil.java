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
 * Provides the local service utility for Deliverable. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DeliverableLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DeliverableLocalService
 * @see org.opencps.dossiermgt.service.base.DeliverableLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DeliverableLocalServiceImpl
 * @generated
 */
@ProviderType
public class DeliverableLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DeliverableLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.liferay.portal.kernel.search.BooleanQuery getQuery() {
		return getService().getQuery();
	}

	public static com.liferay.portal.kernel.search.Hits searchLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService()
				   .searchLucene(params, sorts, start, end, searchContext);
	}

	public static com.liferay.portal.kernel.search.SearchContext getSearchContext() {
		return getService().getSearchContext();
	}

	/**
	* Returns the number of deliverables.
	*
	* @return the number of deliverables
	*/
	public static int getDeliverablesCount() {
		return getService().getDeliverablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String getPattern() {
		return getService().getPattern();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> findDeliverableByDateAndState(
		java.lang.String syncDate, long deliverableState) {
		return getService()
				   .findDeliverableByDateAndState(syncDate, deliverableState);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> findDeliverableByState(
		java.lang.String strDeliverableCode, java.lang.String state) {
		return getService().findDeliverableByState(strDeliverableCode, state);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverableByModifiedDate(
		java.lang.String synsDate, java.lang.String deliverableType,
		long deliverableState) {
		return getService()
				   .getDeliverableByModifiedDate(synsDate, deliverableType,
			deliverableState);
	}

	/**
	* Returns a range of all the deliverables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of deliverables
	* @param end the upper bound of the range of deliverables (not inclusive)
	* @return the range of deliverables
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverables(
		int start, int end) {
		return getService().getDeliverables(start, end);
	}

	/**
	* Returns all the deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the deliverables
	* @param companyId the primary key of the company
	* @return the matching deliverables, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDeliverablesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the deliverables
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of deliverables
	* @param end the upper bound of the range of deliverables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching deliverables, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.Deliverable> orderByComparator) {
		return getService()
				   .getDeliverablesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	public static java.util.List<org.opencps.dossiermgt.model.Deliverable> getListDeliverable(
		java.lang.String deliverableState, java.lang.String govAgencyCode,
		java.lang.String deliverableType, java.lang.String applicant) {
		return getService()
				   .getListDeliverable(deliverableState, govAgencyCode,
			deliverableType, applicant);
	}

	public static java.util.List<com.liferay.portal.kernel.search.BooleanClauseOccur> getOccurs() {
		return getService().getOccurs();
	}

	public static java.util.List<java.lang.String> getParamNames() {
		return getService().getParamNames();
	}

	public static java.util.List<java.lang.Class<?>> getParamTypes() {
		return getService().getParamTypes();
	}

	public static java.util.List<java.lang.Object> getParams() {
		return getService().getParams();
	}

	public static java.util.List<java.lang.String> getSubPatterns() {
		return getService().getSubPatterns();
	}

	public static java.util.List<com.liferay.portal.kernel.search.BooleanQuery> getSubQueries() {
		return getService().getSubQueries();
	}

	public static long countLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService().countLucene(params, searchContext);
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

	public static org.opencps.dossiermgt.model.Deliverable addDeliverable(
		long groupId, java.lang.String deliverableType,
		java.lang.String deliverableCode, java.lang.String govAgencyCode,
		java.lang.String applicationIdNo, java.lang.String applicationName,
		java.lang.String subject, java.lang.String issueDate,
		java.lang.String expireDate, java.lang.String revalidate,
		java.lang.String deliverableState,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .addDeliverable(groupId, deliverableType, deliverableCode,
			govAgencyCode, applicationIdNo, applicationName, subject,
			issueDate, expireDate, revalidate, deliverableState, serviceContext);
	}

	/**
	* Adds the deliverable to the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was added
	*/
	public static org.opencps.dossiermgt.model.Deliverable addDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return getService().addDeliverable(deliverable);
	}

	/**
	* Creates a new deliverable with the primary key. Does not add the deliverable to the database.
	*
	* @param deliverableId the primary key for the new deliverable
	* @return the new deliverable
	*/
	public static org.opencps.dossiermgt.model.Deliverable createDeliverable(
		long deliverableId) {
		return getService().createDeliverable(deliverableId);
	}

	/**
	* Deletes the deliverable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable that was removed
	* @throws PortalException if a deliverable with the primary key could not be found
	* @throws NoSuchDeliverableException
	*/
	public static org.opencps.dossiermgt.model.Deliverable deleteDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException,
			org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return getService().deleteDeliverable(deliverableId);
	}

	/**
	* Deletes the deliverable from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was removed
	*/
	public static org.opencps.dossiermgt.model.Deliverable deleteDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return getService().deleteDeliverable(deliverable);
	}

	public static org.opencps.dossiermgt.model.Deliverable fetchDeliverable(
		long deliverableId) {
		return getService().fetchDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable, or <code>null</code> if a matching deliverable could not be found
	*/
	public static org.opencps.dossiermgt.model.Deliverable fetchDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDeliverableByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.Deliverable getByCode(
		java.lang.String deliverableCode) {
		return getService().getByCode(deliverableCode);
	}

	public static org.opencps.dossiermgt.model.Deliverable getByCodeAndState(
		java.lang.String deliverableCode, java.lang.String state) {
		return getService().getByCodeAndState(deliverableCode, state);
	}

	/**
	* Returns the deliverable with the primary key.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable
	* @throws PortalException if a deliverable with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.Deliverable getDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable
	* @throws PortalException if a matching deliverable could not be found
	*/
	public static org.opencps.dossiermgt.model.Deliverable getDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDeliverableByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.Deliverable getDeliverableDetail(
		long id)
		throws org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return getService().getDeliverableDetail(id);
	}

	public static org.opencps.dossiermgt.model.Deliverable getDetailById(
		long id) {
		return getService().getDetailById(id);
	}

	public static org.opencps.dossiermgt.model.Deliverable updateDeliverable(
		long groupId, long id, java.lang.String subject,
		java.lang.String issueDate, java.lang.String expireDate,
		java.lang.String revalidate, java.lang.String deliverableState,
		java.lang.String deliverableAction,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .updateDeliverable(groupId, id, subject, issueDate,
			expireDate, revalidate, deliverableState, deliverableAction,
			serviceContext);
	}

	/**
	* Updates the deliverable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was updated
	*/
	public static org.opencps.dossiermgt.model.Deliverable updateDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return getService().updateDeliverable(deliverable);
	}

	public static org.opencps.dossiermgt.model.Deliverable updateFormData(
		long groupId, long id, java.lang.String formData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return getService().updateFormData(groupId, id, formData, serviceContext);
	}

	public static void LuceneQuery(java.lang.String pattern,
		java.lang.String paramValues, java.lang.String paramTypes,
		com.liferay.portal.kernel.search.SearchContext searchContext) {
		getService().LuceneQuery(pattern, paramValues, paramTypes, searchContext);
	}

	public static void setOccurs(
		java.util.List<com.liferay.portal.kernel.search.BooleanClauseOccur> occurs) {
		getService().setOccurs(occurs);
	}

	public static void setParamNames(
		java.util.List<java.lang.String> paramNames) {
		getService().setParamNames(paramNames);
	}

	public static void setParamTypes(
		java.util.List<java.lang.Class<?>> paramTypes) {
		getService().setParamTypes(paramTypes);
	}

	public static void setParams(java.util.List<java.lang.Object> params) {
		getService().setParams(params);
	}

	public static void setPattern(java.lang.String pattern) {
		getService().setPattern(pattern);
	}

	public static void setQuery(
		com.liferay.portal.kernel.search.BooleanQuery query) {
		getService().setQuery(query);
	}

	public static void setSearchContext(
		com.liferay.portal.kernel.search.SearchContext searchContext) {
		getService().setSearchContext(searchContext);
	}

	public static void setSubPatterns(
		java.util.List<java.lang.String> subPatterns) {
		getService().setSubPatterns(subPatterns);
	}

	public static void setSubQueries(
		java.util.List<com.liferay.portal.kernel.search.BooleanQuery> subQueries) {
		getService().setSubQueries(subQueries);
	}

	public static DeliverableLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DeliverableLocalService, DeliverableLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DeliverableLocalService.class);
}