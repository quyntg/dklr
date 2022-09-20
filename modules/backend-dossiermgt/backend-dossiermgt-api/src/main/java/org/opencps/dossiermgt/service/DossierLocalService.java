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
import com.liferay.portal.kernel.search.Document;
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

import org.opencps.dossiermgt.model.Dossier;

import java.io.Serializable;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for Dossier. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see DossierLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.DossierLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierLocalServiceUtil} to access the dossier local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
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
	public Document getDossierById(long dossierId, long companyId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Hits searchLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params, Sort[] sorts,
		int start, int end, SearchContext searchContext)
		throws ParseException, SearchException;

	public int countByUserId(long userId, long groupId);

	/**
	* Returns the number of dossiers.
	*
	* @return the number of dossiers
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossiersCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<Dossier> findDossierByRequestStatus(
		java.lang.String statusReg, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dossier> getBySubmitting(boolean submitting);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dossier> getDossiers(int start, int end);

	/**
	* Returns all the dossiers matching the UUID and company.
	*
	* @param uuid the UUID of the dossiers
	* @param companyId the primary key of the company
	* @return the matching dossiers, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dossier> getDossiersByUuidAndCompanyId(java.lang.String uuid,
		long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Dossier> getDossiersByUuidAndCompanyId(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Dossier> orderByComparator);

	public long countDossierByG_C_GAC_SC_DTNO_NOTDS(long groupId,
		long companyId, java.lang.String govAgencyCode,
		java.lang.String serviceCode, java.lang.String dossierTemplateNo,
		java.lang.String dossierStatus);

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

	/**
	* Adds the dossier to the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Dossier addDossier(Dossier dossier);

	@Indexable(type = IndexableType.REINDEX)
	public Dossier assignToProcess(long dossierId,
		java.lang.String dossierNote, java.lang.String submissionNote,
		java.lang.String briefNote, java.lang.String dossierNo, long folderId,
		long dossierActionId, java.lang.String serverNo, ServiceContext context);

	/**
	* Creates a new dossier with the primary key. Does not add the dossier to the database.
	*
	* @param dossierId the primary key for the new dossier
	* @return the new dossier
	*/
	public Dossier createDossier(long dossierId);

	/**
	* Deletes the dossier with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier that was removed
	* @throws PortalException if a dossier with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Dossier deleteDossier(long dossierId) throws PortalException;

	/**
	* Deletes the dossier from the database. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Dossier deleteDossier(Dossier dossier);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier fetchDossier(long dossierId);

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier, or <code>null</code> if a matching dossier could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier fetchDossierByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier getByF_GID_SC_DS_First(long groupId,
		java.lang.String serviceCode, java.lang.String dossierStatus,
		OrderByComparator orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier getByRef(long groupId, java.lang.String refId);

	/**
	* Returns the dossier with the primary key.
	*
	* @param dossierId the primary key of the dossier
	* @return the dossier
	* @throws PortalException if a dossier with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier getDossier(long dossierId) throws PortalException;

	/**
	* Returns the dossier matching the UUID and group.
	*
	* @param uuid the dossier's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier
	* @throws PortalException if a matching dossier could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Dossier getDossierByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier initDossier(long groupId, long dossierId,
		java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String password,
		int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, boolean online, boolean notification,
		java.lang.String applicantNote, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public Dossier removeDossier(long groupId, long dossierId,
		java.lang.String refId) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier reset(long groupId, long id, java.lang.String refId,
		ServiceContext context) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier submitting(long groupId, long id, java.lang.String refId,
		ServiceContext context) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier syncDossier(Dossier dossier) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateCancellingDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateCorrectingDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossier(long groupId, long dossierId,
		java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String dossierNote,
		java.lang.String submissionNote, java.lang.String applicantNote,
		java.lang.String briefNote, java.lang.String dossierNo,
		boolean submitting, Date correctingDate,
		java.lang.String dossierStatus, java.lang.String dossierStatusText,
		java.lang.String dossierSubStatus,
		java.lang.String dossierSubStatusText, long folderId,
		long dossierActionId, int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, java.lang.String password,
		boolean notification, boolean online, java.lang.String serverNo,
		ServiceContext context) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossier(long groupId, long dossierId,
		java.lang.String referenceUid, int counter,
		java.lang.String serviceCode, java.lang.String serviceName,
		java.lang.String govAgencyCode, java.lang.String govAgencyName,
		java.lang.String applicantName, java.lang.String applicantIdType,
		java.lang.String applicantIdNo, Date applicantIdDate,
		java.lang.String address, java.lang.String cityCode,
		java.lang.String cityName, java.lang.String districtCode,
		java.lang.String districtName, java.lang.String wardCode,
		java.lang.String wardName, java.lang.String contactName,
		java.lang.String contactTelNo, java.lang.String contactEmail,
		java.lang.String dossierTemplateNo, java.lang.String dossierNote,
		java.lang.String submissionNote, java.lang.String applicantNote,
		java.lang.String briefNote, java.lang.String dossierNo,
		boolean submitting, Date correctingDate,
		java.lang.String dossierStatus, java.lang.String dossierStatusText,
		java.lang.String dossierSubStatus,
		java.lang.String dossierSubStatusText, long folderId,
		long dossierActionId, int viaPostal, java.lang.String postalAddress,
		java.lang.String postalCityCode, java.lang.String postalCityName,
		java.lang.String postalTelNo, java.lang.String password,
		boolean notification, boolean online, java.lang.String serverNo,
		Date submitDate, ServiceContext context) throws PortalException;

	/**
	* Updates the dossier in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossier the dossier
	* @return the dossier that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossier(Dossier dossier);

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossierAction(long groupId, long id,
		java.lang.String refId, long dossierActionId, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDossierBriefNote(long dossierId,
		java.lang.String dossierBriefNote) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateDueDate(long groupId, long id, java.lang.String refId,
		Date date, ServiceContext context) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateEndosementDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateFinishDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateReceivingDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateReleaseDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateStatus(long groupId, long id, java.lang.String refId,
		java.lang.String status, java.lang.String statusText,
		java.lang.String subStatus, java.lang.String subStatusText,
		java.lang.String lockState, ServiceContext context)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public Dossier updateSubmittingDate(long groupId, long id,
		java.lang.String refId, Date date, ServiceContext context)
		throws PortalException;
}