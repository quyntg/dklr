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
 * Provides a wrapper for {@link DeliverableLocalService}.
 *
 * @author huymq
 * @see DeliverableLocalService
 * @generated
 */
@ProviderType
public class DeliverableLocalServiceWrapper implements DeliverableLocalService,
	ServiceWrapper<DeliverableLocalService> {
	public DeliverableLocalServiceWrapper(
		DeliverableLocalService deliverableLocalService) {
		_deliverableLocalService = deliverableLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _deliverableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deliverableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _deliverableLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _deliverableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.search.BooleanQuery getQuery() {
		return _deliverableLocalService.getQuery();
	}

	@Override
	public com.liferay.portal.kernel.search.Hits searchLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _deliverableLocalService.searchLucene(params, sorts, start, end,
			searchContext);
	}

	@Override
	public com.liferay.portal.kernel.search.SearchContext getSearchContext() {
		return _deliverableLocalService.getSearchContext();
	}

	/**
	* Returns the number of deliverables.
	*
	* @return the number of deliverables
	*/
	@Override
	public int getDeliverablesCount() {
		return _deliverableLocalService.getDeliverablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _deliverableLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getPattern() {
		return _deliverableLocalService.getPattern();
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
		return _deliverableLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _deliverableLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _deliverableLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> findDeliverableByDateAndState(
		java.lang.String syncDate, long deliverableState) {
		return _deliverableLocalService.findDeliverableByDateAndState(syncDate,
			deliverableState);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> findDeliverableByState(
		java.lang.String strDeliverableCode, java.lang.String state) {
		return _deliverableLocalService.findDeliverableByState(strDeliverableCode,
			state);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverableByModifiedDate(
		java.lang.String synsDate, java.lang.String deliverableType,
		long deliverableState) {
		return _deliverableLocalService.getDeliverableByModifiedDate(synsDate,
			deliverableType, deliverableState);
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
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverables(
		int start, int end) {
		return _deliverableLocalService.getDeliverables(start, end);
	}

	/**
	* Returns all the deliverables matching the UUID and company.
	*
	* @param uuid the UUID of the deliverables
	* @param companyId the primary key of the company
	* @return the matching deliverables, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _deliverableLocalService.getDeliverablesByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> getDeliverablesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.Deliverable> orderByComparator) {
		return _deliverableLocalService.getDeliverablesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Deliverable> getListDeliverable(
		java.lang.String deliverableState, java.lang.String govAgencyCode,
		java.lang.String deliverableType, java.lang.String applicant) {
		return _deliverableLocalService.getListDeliverable(deliverableState,
			govAgencyCode, deliverableType, applicant);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.search.BooleanClauseOccur> getOccurs() {
		return _deliverableLocalService.getOccurs();
	}

	@Override
	public java.util.List<java.lang.String> getParamNames() {
		return _deliverableLocalService.getParamNames();
	}

	@Override
	public java.util.List<java.lang.Class<?>> getParamTypes() {
		return _deliverableLocalService.getParamTypes();
	}

	@Override
	public java.util.List<java.lang.Object> getParams() {
		return _deliverableLocalService.getParams();
	}

	@Override
	public java.util.List<java.lang.String> getSubPatterns() {
		return _deliverableLocalService.getSubPatterns();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.search.BooleanQuery> getSubQueries() {
		return _deliverableLocalService.getSubQueries();
	}

	@Override
	public long countLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _deliverableLocalService.countLucene(params, searchContext);
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
		return _deliverableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _deliverableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable addDeliverable(
		long groupId, java.lang.String deliverableType,
		java.lang.String deliverableCode, java.lang.String govAgencyCode,
		java.lang.String applicationIdNo, java.lang.String applicationName,
		java.lang.String subject, java.lang.String issueDate,
		java.lang.String expireDate, java.lang.String revalidate,
		java.lang.String deliverableState,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _deliverableLocalService.addDeliverable(groupId,
			deliverableType, deliverableCode, govAgencyCode, applicationIdNo,
			applicationName, subject, issueDate, expireDate, revalidate,
			deliverableState, serviceContext);
	}

	/**
	* Adds the deliverable to the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable addDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return _deliverableLocalService.addDeliverable(deliverable);
	}

	/**
	* Creates a new deliverable with the primary key. Does not add the deliverable to the database.
	*
	* @param deliverableId the primary key for the new deliverable
	* @return the new deliverable
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable createDeliverable(
		long deliverableId) {
		return _deliverableLocalService.createDeliverable(deliverableId);
	}

	/**
	* Deletes the deliverable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable that was removed
	* @throws PortalException if a deliverable with the primary key could not be found
	* @throws NoSuchDeliverableException
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable deleteDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException,
			org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return _deliverableLocalService.deleteDeliverable(deliverableId);
	}

	/**
	* Deletes the deliverable from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable deleteDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return _deliverableLocalService.deleteDeliverable(deliverable);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable fetchDeliverable(
		long deliverableId) {
		return _deliverableLocalService.fetchDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable, or <code>null</code> if a matching deliverable could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable fetchDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _deliverableLocalService.fetchDeliverableByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable getByCode(
		java.lang.String deliverableCode) {
		return _deliverableLocalService.getByCode(deliverableCode);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable getByCodeAndState(
		java.lang.String deliverableCode, java.lang.String state) {
		return _deliverableLocalService.getByCodeAndState(deliverableCode, state);
	}

	/**
	* Returns the deliverable with the primary key.
	*
	* @param deliverableId the primary key of the deliverable
	* @return the deliverable
	* @throws PortalException if a deliverable with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable getDeliverable(
		long deliverableId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getDeliverable(deliverableId);
	}

	/**
	* Returns the deliverable matching the UUID and group.
	*
	* @param uuid the deliverable's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable
	* @throws PortalException if a matching deliverable could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable getDeliverableByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLocalService.getDeliverableByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable getDeliverableDetail(
		long id)
		throws org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return _deliverableLocalService.getDeliverableDetail(id);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable getDetailById(long id) {
		return _deliverableLocalService.getDetailById(id);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable updateDeliverable(
		long groupId, long id, java.lang.String subject,
		java.lang.String issueDate, java.lang.String expireDate,
		java.lang.String revalidate, java.lang.String deliverableState,
		java.lang.String deliverableAction,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _deliverableLocalService.updateDeliverable(groupId, id, subject,
			issueDate, expireDate, revalidate, deliverableState,
			deliverableAction, serviceContext);
	}

	/**
	* Updates the deliverable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param deliverable the deliverable
	* @return the deliverable that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.Deliverable updateDeliverable(
		org.opencps.dossiermgt.model.Deliverable deliverable) {
		return _deliverableLocalService.updateDeliverable(deliverable);
	}

	@Override
	public org.opencps.dossiermgt.model.Deliverable updateFormData(
		long groupId, long id, java.lang.String formData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws org.opencps.dossiermgt.exception.NoSuchDeliverableException {
		return _deliverableLocalService.updateFormData(groupId, id, formData,
			serviceContext);
	}

	@Override
	public void LuceneQuery(java.lang.String pattern,
		java.lang.String paramValues, java.lang.String paramTypes,
		com.liferay.portal.kernel.search.SearchContext searchContext) {
		_deliverableLocalService.LuceneQuery(pattern, paramValues, paramTypes,
			searchContext);
	}

	@Override
	public void setOccurs(
		java.util.List<com.liferay.portal.kernel.search.BooleanClauseOccur> occurs) {
		_deliverableLocalService.setOccurs(occurs);
	}

	@Override
	public void setParamNames(java.util.List<java.lang.String> paramNames) {
		_deliverableLocalService.setParamNames(paramNames);
	}

	@Override
	public void setParamTypes(java.util.List<java.lang.Class<?>> paramTypes) {
		_deliverableLocalService.setParamTypes(paramTypes);
	}

	@Override
	public void setParams(java.util.List<java.lang.Object> params) {
		_deliverableLocalService.setParams(params);
	}

	@Override
	public void setPattern(java.lang.String pattern) {
		_deliverableLocalService.setPattern(pattern);
	}

	@Override
	public void setQuery(com.liferay.portal.kernel.search.BooleanQuery query) {
		_deliverableLocalService.setQuery(query);
	}

	@Override
	public void setSearchContext(
		com.liferay.portal.kernel.search.SearchContext searchContext) {
		_deliverableLocalService.setSearchContext(searchContext);
	}

	@Override
	public void setSubPatterns(java.util.List<java.lang.String> subPatterns) {
		_deliverableLocalService.setSubPatterns(subPatterns);
	}

	@Override
	public void setSubQueries(
		java.util.List<com.liferay.portal.kernel.search.BooleanQuery> subQueries) {
		_deliverableLocalService.setSubQueries(subQueries);
	}

	@Override
	public DeliverableLocalService getWrappedService() {
		return _deliverableLocalService;
	}

	@Override
	public void setWrappedService(
		DeliverableLocalService deliverableLocalService) {
		_deliverableLocalService = deliverableLocalService;
	}

	private DeliverableLocalService _deliverableLocalService;
}