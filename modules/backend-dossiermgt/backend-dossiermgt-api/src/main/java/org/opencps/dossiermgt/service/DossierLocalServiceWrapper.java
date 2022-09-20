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
 * Provides a wrapper for {@link DossierLocalService}.
 *
 * @author huymq
 * @see DossierLocalService
 * @generated
 */
@ProviderType
public class DossierLocalServiceWrapper implements DossierLocalService,
	ServiceWrapper<DossierLocalService> {
	public DossierLocalServiceWrapper(DossierLocalService dossierLocalService) {
		_dossierLocalService = dossierLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _dossierLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dossierLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _dossierLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _dossierLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.search.Document getDossierById(
		long dossierId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.getDossierById(dossierId, companyId);
	}

	@Override
	public com.liferay.portal.kernel.search.Hits searchLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _dossierLocalService.searchLucene(params, sorts, start, end,
			searchContext);
	}

	@Override
	public int countByUserId(long userId, long groupId) {
		return _dossierLocalService.countByUserId(userId, groupId);
	}

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	*/
	@Override
	public int getDossiersCount() {
		return _dossierLocalService.getDossiersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _dossierLocalService.getOSGiServiceIdentifier();
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
		return _dossierLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dossierLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Dossier> findDossierByRequestStatus(
		java.lang.String statusReg, int start, int end) {
		return _dossierLocalService.findDossierByRequestStatus(statusReg,
			start, end);
	}

	@Override
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getBySubmitting(
		boolean submitting) {
		return _dossierLocalService.getBySubmitting(submitting);
	}

	/**
	* Returns a range of all the dossiers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @return the range of dossiers
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiers(
		int start, int end) {
		return _dossierLocalService.getDossiers(start, end);
	}

	/**
	* Returns all the dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the dossiers
	* @param companyId the primary key of the company
	* @return the matching dossiers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _dossierLocalService.getDossiersByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the dossiers
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossiers
	* @param end the upper bound of the range of dossiers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossiers, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.Dossier> getDossiersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.Dossier> orderByComparator) {
		return _dossierLocalService.getDossiersByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	@Override
	public long countDossierByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus) {
		return _dossierLocalService.countDossierByG_C_GAC_SC_DTNO_NOTDS(groupId,
			companyId, govAgencyCode, serviceCode, dossierTemplateNo,
			dossierStatus);
	}

	@Override
	public long countLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return _dossierLocalService.countLucene(params, searchContext);
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
		return _dossierLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dossierLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier addDossier(
		org.opencps.dossiermgt.model.Dossier dossier) {
		return _dossierLocalService.addDossier(dossier);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier assignToProcess(
		long dossierId, java.lang.String dossierNote,
		java.lang.String submissionNote, java.lang.String briefNote,
		java.lang.String dossierNo, long folderId, long dossierActionId,
		java.lang.String serverNo,
		com.liferay.portal.kernel.service.ServiceContext context) {
		return _dossierLocalService.assignToProcess(dossierId, dossierNote,
			submissionNote, briefNote, dossierNo, folderId, dossierActionId,
			serverNo, context);
	}

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier createDossier(long dossierId) {
		return _dossierLocalService.createDossier(dossierId);
	}

	/**
	* Deletes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws PortalException if a dossier with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier deleteDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.deleteDossier(dossierId);
	}

	/**
	* Deletes the dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier deleteDossier(
		org.opencps.dossiermgt.model.Dossier dossier) {
		return _dossierLocalService.deleteDossier(dossier);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier fetchDossier(long dossierId) {
		return _dossierLocalService.fetchDossier(dossierId);
	}

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier fetchDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _dossierLocalService.fetchDossierByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier getByF_GID_SC_DS_First(
		long groupId, java.lang.String serviceCode,
		java.lang.String dossierStatus,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return _dossierLocalService.getByF_GID_SC_DS_First(groupId,
			serviceCode, dossierStatus, orderByComparator);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier getByRef(long groupId,
		java.lang.String refId) {
		return _dossierLocalService.getByRef(groupId, refId);
	}

	/**
	* Returns the dossier with the primary key.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws PortalException if a dossier with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier getDossier(long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.getDossier(dossierId);
	}

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier
	* @throws PortalException if a matching dossier could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier getDossierByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.getDossierByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier initDossier(long groupId,
		long dossierId, java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, java.util.Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String password,
		int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, boolean online, boolean notification,
		java.lang.String applicantNote,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.initDossier(groupId, dossierId,
			referenceUid, counter, serviceCode, serviceName, govAgencyCode,
			govAgencyName, applicantName, applicantIdType, applicantIdNo,
			applicantIdDate, address, cityCode, cityName, districtCode,
			districtName, wardCode, wardName, contactName, contactTelNo,
			contactEmail, dossierTemplateNo, password, viaPostal,
			postalAddress, postalCityCode, postalCityName, postalTelNo, online,
			notification, applicantNote, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier removeDossier(long groupId,
		long dossierId, java.lang.String refId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.removeDossier(groupId, dossierId, refId);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier reset(long groupId, long id,
		java.lang.String refId,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.reset(groupId, id, refId, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier submitting(long groupId,
		long id, java.lang.String refId,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.submitting(groupId, id, refId, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier syncDossier(
		org.opencps.dossiermgt.model.Dossier dossier)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.syncDossier(dossier);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateCancellingDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateCancellingDate(groupId, id, refId,
			date, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateCorrectingDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateCorrectingDate(groupId, id, refId,
			date, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateDossier(long groupId,
		long dossierId, java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, java.util.Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String dossierNote,
		java.lang.String submissionNote, java.lang.String applicantNote,
		java.lang.String briefNote, java.lang.String dossierNo,
		boolean submitting, java.util.Date correctingDate,
		java.lang.String dossierStatus, java.lang.String dossierStatusText,
		java.lang.String dossierSubStatus,
		java.lang.String dossierSubStatusText, long folderId,
		long dossierActionId, int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, java.lang.String password,
		boolean notification, boolean online, java.lang.String serverNo,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateDossier(groupId, dossierId,
			referenceUid, counter, serviceCode, serviceName, govAgencyCode,
			govAgencyName, applicantName, applicantIdType, applicantIdNo,
			applicantIdDate, address, cityCode, cityName, districtCode,
			districtName, wardCode, wardName, contactName, contactTelNo,
			contactEmail, dossierTemplateNo, dossierNote, submissionNote,
			applicantNote, briefNote, dossierNo, submitting, correctingDate,
			dossierStatus, dossierStatusText, dossierSubStatus,
			dossierSubStatusText, folderId, dossierActionId, viaPostal,
			postalAddress, postalCityCode, postalCityName, postalTelNo,
			password, notification, online, serverNo, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateDossier(long groupId,
		long dossierId, java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, java.util.Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String dossierNote,
		java.lang.String submissionNote, java.lang.String applicantNote,
		java.lang.String briefNote, java.lang.String dossierNo,
		boolean submitting, java.util.Date correctingDate,
		java.lang.String dossierStatus, java.lang.String dossierStatusText,
		java.lang.String dossierSubStatus,
		java.lang.String dossierSubStatusText, long folderId,
		long dossierActionId, int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, java.lang.String password,
		boolean notification, boolean online, java.lang.String serverNo,
		java.util.Date submitDate,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateDossier(groupId, dossierId,
			referenceUid, counter, serviceCode, serviceName, govAgencyCode,
			govAgencyName, applicantName, applicantIdType, applicantIdNo,
			applicantIdDate, address, cityCode, cityName, districtCode,
			districtName, wardCode, wardName, contactName, contactTelNo,
			contactEmail, dossierTemplateNo, dossierNote, submissionNote,
			applicantNote, briefNote, dossierNo, submitting, correctingDate,
			dossierStatus, dossierStatusText, dossierSubStatus,
			dossierSubStatusText, folderId, dossierActionId, viaPostal,
			postalAddress, postalCityCode, postalCityName, postalTelNo,
			password, notification, online, serverNo, submitDate, context);
	}

	/**
	* Updates the dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.Dossier updateDossier(
		org.opencps.dossiermgt.model.Dossier dossier) {
		return _dossierLocalService.updateDossier(dossier);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateDossierAction(
		long groupId, long id, java.lang.String refId, long dossierActionId,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateDossierAction(groupId, id, refId,
			dossierActionId, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateDossierBriefNote(
		long dossierId, java.lang.String dossierBriefNote)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateDossierBriefNote(dossierId,
			dossierBriefNote);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateDueDate(long groupId,
		long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateDueDate(groupId, id, refId, date,
			context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateEndosementDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateEndosementDate(groupId, id, refId,
			date, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateFinishDate(long groupId,
		long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateFinishDate(groupId, id, refId, date,
			context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateReceivingDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateReceivingDate(groupId, id, refId,
			date, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateReleaseDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateReleaseDate(groupId, id, refId, date,
			context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateStatus(long groupId,
		long id, java.lang.String refId, java.lang.String status,
		java.lang.String statusText, java.lang.String subStatus,
		java.lang.String subStatusText, java.lang.String lockState,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateStatus(groupId, id, refId, status,
			statusText, subStatus, subStatusText, lockState, context);
	}

	@Override
	public org.opencps.dossiermgt.model.Dossier updateSubmittingDate(
		long groupId, long id, java.lang.String refId, java.util.Date date,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _dossierLocalService.updateSubmittingDate(groupId, id, refId,
			date, context);
	}

	@Override
	public DossierLocalService getWrappedService() {
		return _dossierLocalService;
	}

	@Override
	public void setWrappedService(DossierLocalService dossierLocalService) {
		_dossierLocalService = dossierLocalService;
	}

	private DossierLocalService _dossierLocalService;
}