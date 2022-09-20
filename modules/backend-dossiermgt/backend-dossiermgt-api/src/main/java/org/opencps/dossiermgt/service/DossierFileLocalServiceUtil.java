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
 * Provides the local service utility for DossierFile. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DossierFileLocalService
 * @see org.opencps.dossiermgt.service.base.DossierFileLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl
 * @generated
 */
@ProviderType
public class DossierFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static com.liferay.portal.kernel.search.Hits searchLucene(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService()
				   .searchLucene(params, sorts, start, end, searchContext);
	}

	public static int countDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed) {
		return getService()
				   .countDossierFileByDID_FTNO_DPT_NOT_NULL_FID(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed);
	}

	/**
	* Returns the number of dossier files.
	*
	* @return the number of dossier files
	*/
	public static int getDossierFilesCount() {
		return getService().getDossierFilesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getAllDossierFile(
		long dossierId) {
		return getService().getAllDossierFile(dossierId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getByDossierIdAndIsNew(
		long dossierId, boolean isNew) {
		return getService().getByDossierIdAndIsNew(dossierId, isNew);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getByReferenceUid(
		java.lang.String referenceUid) {
		return getService().getByReferenceUid(referenceUid);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getByTemplateNoAndIsNew(
		long dossierId, boolean isNew, java.lang.String[] fileTemplateNoArr) {
		return getService()
				   .getByTemplateNoAndIsNew(dossierId, isNew, fileTemplateNoArr);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_DPNO(
		long dossierId, java.lang.String dossierPartNo, boolean removed) {
		return getService()
				   .getDossierFileByDID_DPNO(dossierId, dossierPartNo, removed);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTN(
		long dossierId, java.lang.String fileTemplateNo) {
		return getService().getDossierFileByDID_FTN(dossierId, fileTemplateNo);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTNO(
		long dossierId, java.lang.String fileTemplateNo, boolean removed) {
		return getService()
				   .getDossierFileByDID_FTNO(dossierId, fileTemplateNo, removed);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTNO_DPT(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		boolean removed) {
		return getService()
				   .getDossierFileByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTNO_DPT(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .getDossierFileByDID_FTNO_DPT(dossierId, fileTemplateNo,
			dossierPartType, removed, start, end, orderByComparator);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed) {
		return getService()
				   .getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(dossierId,
			fileTemplateNo, dossierPartType, fileEntryId, removed, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the dossier files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @return the range of dossier files
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFiles(
		int start, int end) {
		return getService().getDossierFiles(start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFilesByD_DP(
		long dossierId, int dossierPartType) {
		return getService().getDossierFilesByD_DP(dossierId, dossierPartType);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFilesByDossierId(
		long dossierId) {
		return getService().getDossierFilesByDossierId(dossierId);
	}

	/**
	* Returns all the dossier files matching the UUID and company.
	*
	* @param uuid the UUID of the dossier files
	* @param companyId the primary key of the company
	* @return the matching dossier files, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDossierFilesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of dossier files matching the UUID and company.
	*
	* @param uuid the UUID of the dossier files
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossier files
	* @param end the upper bound of the range of dossier files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossier files, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierFile> getDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.DossierFile> orderByComparator) {
		return getService()
				   .getDossierFilesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
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

	/**
	* POST /dossiers/{id|referenceUid}/files
	*/
	public static org.opencps.dossiermgt.model.DossierFile addDossierFile(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		java.lang.String fileTemplateNo, java.lang.String displayName,
		java.lang.String sourceFileName, long fileSize,
		java.io.InputStream inputStream, java.lang.String fileType,
		java.lang.String isSync, long dossierActionId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierFile(groupId, dossierId, referenceUid,
			dossierTemplateNo, dossierPartNo, fileTemplateNo, displayName,
			sourceFileName, fileSize, inputStream, fileType, isSync,
			dossierActionId, serviceContext);
	}

	/**
	* Adds the dossier file to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was added
	*/
	public static org.opencps.dossiermgt.model.DossierFile addDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile) {
		return getService().addDossierFile(dossierFile);
	}

	public static org.opencps.dossiermgt.model.DossierFile addDossierFileBySingleServer(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		java.lang.String fileTemplateNo, java.lang.String displayName,
		java.lang.String sourceFileName, long fileSize, long fileEntryId,
		java.lang.String fileType, java.lang.String isSync,
		long dossierActionId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addDossierFileBySingleServer(groupId, dossierId,
			referenceUid, dossierTemplateNo, dossierPartNo, fileTemplateNo,
			displayName, sourceFileName, fileSize, fileEntryId, fileType,
			isSync, dossierActionId, serviceContext);
	}

	/**
	* POST /dossiers/{id}/files/copyfile
	*
	* @param groupId
	* @param dossierId
	* @param dossierFileId
	* @param dossierTemplateNo
	* @param dossierPartNo
	* @param serviceContext
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static org.opencps.dossiermgt.model.DossierFile cloneDossierFile(
		long groupId, long dossierId, long dossierFileId,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .cloneDossierFile(groupId, dossierId, dossierFileId,
			dossierTemplateNo, dossierPartNo, serviceContext);
	}

	/**
	* Creates a new dossier file with the primary key. Does not add the dossier file to the database.
	*
	* @param dossierFileId the primary key for the new dossier file
	* @return the new dossier file
	*/
	public static org.opencps.dossiermgt.model.DossierFile createDossierFile(
		long dossierFileId) {
		return getService().createDossierFile(dossierFileId);
	}

	/**
	* Deletes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file that was removed
	* @throws PortalException if a dossier file with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierFile(dossierFileId);
	}

	public static org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		long dossierId, java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierFile(dossierId, referenceUid);
	}

	/**
	* Deletes the dossier file from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was removed
	* @throws PortalException
	*/
	public static org.opencps.dossiermgt.model.DossierFile deleteDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierFile(dossierFile);
	}

	public static org.opencps.dossiermgt.model.DossierFile deletePermanentDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile) {
		return getService().deletePermanentDossierFile(dossierFile);
	}

	public static org.opencps.dossiermgt.model.DossierFile fetchDossierFile(
		long dossierFileId) {
		return getService().fetchDossierFile(dossierFileId);
	}

	/**
	* Returns the dossier file matching the UUID and group.
	*
	* @param uuid the dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierFile fetchDossierFileByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDossierFileByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Get dossierFile by deliverable Code using output DB
	*/
	public static org.opencps.dossiermgt.model.DossierFile getByDeliverableCode(
		java.lang.String deliverableCode) {
		return getService().getByDeliverableCode(deliverableCode);
	}

	public static org.opencps.dossiermgt.model.DossierFile getByF_DID_REF_DAID(
		long dossierId, java.lang.String referenceUid, long dossierActionId) {
		return getService()
				   .getByF_DID_REF_DAID(dossierId, referenceUid, dossierActionId);
	}

	public static org.opencps.dossiermgt.model.DossierFile getByFileEntryId(
		long fileEntryId) {
		return getService().getByFileEntryId(fileEntryId);
	}

	public static org.opencps.dossiermgt.model.DossierFile getByFileTemplateNo(
		long id, java.lang.String fileTemplateNo) {
		return getService().getByFileTemplateNo(id, fileTemplateNo);
	}

	public static org.opencps.dossiermgt.model.DossierFile getByRefAndGroupId(
		long groupId, java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getByRefAndGroupId(groupId, referenceUid);
	}

	/**
	* Returns the dossier file with the primary key.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file
	* @throws PortalException if a dossier file with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierFile getDossierFile(
		long dossierFileId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierFile(dossierFileId);
	}

	public static org.opencps.dossiermgt.model.DossierFile getDossierFileByDID_FTNO_DPT_First(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws org.opencps.dossiermgt.exception.NoSuchDossierFileException {
		return getService()
				   .getDossierFileByDID_FTNO_DPT_First(dossierId,
			fileTemplateNo, dossierPartType, removed, orderByComparator);
	}

	public static org.opencps.dossiermgt.model.DossierFile getDossierFileByDID_FTNO_First(
		long dossierId, java.lang.String fileTemplateNo, boolean removed,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return getService()
				   .getDossierFileByDID_FTNO_First(dossierId, fileTemplateNo,
			removed, orderByComparator);
	}

	public static org.opencps.dossiermgt.model.DossierFile getDossierFileByReferenceUid(
		long dossierId, java.lang.String referenceUid) {
		return getService().getDossierFileByReferenceUid(dossierId, referenceUid);
	}

	/**
	* Returns the dossier file matching the UUID and group.
	*
	* @param uuid the dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier file
	* @throws PortalException if a matching dossier file could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierFile getDossierFileByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierFileByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.DossierFile removeDossierFile(
		long dossierId, java.lang.String referenceUid,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .removeDossierFile(dossierId, referenceUid, serviceContext);
	}

	public static org.opencps.dossiermgt.model.DossierFile resetDossierFile(
		long dossierFileId) {
		return getService().resetDossierFile(dossierFileId);
	}

	/**
	* POST /dossiers/{id|referenceUid}/files/{referenceUid}
	*/
	public static org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String displayName, java.lang.String sourceFileName,
		java.io.InputStream inputStream,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierFile(groupId, dossierId, referenceUid,
			displayName, sourceFileName, inputStream, serviceContext);
	}

	/**
	* Updates the dossier file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was updated
	*/
	public static org.opencps.dossiermgt.model.DossierFile updateDossierFile(
		org.opencps.dossiermgt.model.DossierFile dossierFile) {
		return getService().updateDossierFile(dossierFile);
	}

	public static org.opencps.dossiermgt.model.DossierFile updateDossierFileBySingleServer(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String displayName, java.lang.String sourceFileName,
		long fileEntryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateDossierFileBySingleServer(groupId, dossierId,
			referenceUid, displayName, sourceFileName, fileEntryId,
			serviceContext);
	}

	public static org.opencps.dossiermgt.model.DossierFile updateFormData(
		long groupId, long dossierId, long dossierActionId,
		java.lang.String referenceUid, java.lang.String formData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFormData(groupId, dossierId, dossierActionId,
			referenceUid, formData, serviceContext);
	}

	public static org.opencps.dossiermgt.model.DossierFile updateFormDataPlugin(
		long groupId, long dossierId, java.lang.String referenceUid,
		java.lang.String formData,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateFormDataPlugin(groupId, dossierId, referenceUid,
			formData, serviceContext);
	}

	/**
	* for POST /dossiers/{id}/cloning
	*
	* @param groupId
	* @param newDossierId
	* @param oldDossierId
	* @param dossierPartType
	* @param serviceContext
	* @throws PortalException
	* @throws SystemException
	*/
	public static void cloneDossierFilesByDossierId(long groupId,
		long newDossierId, long oldDossierId, int dossierPartType,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.cloneDossierFilesByDossierId(groupId, newDossierId, oldDossierId,
			dossierPartType, serviceContext);
	}

	public static DossierFileLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DossierFileLocalService, DossierFileLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DossierFileLocalService.class);
}