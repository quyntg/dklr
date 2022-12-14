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

import org.opencps.dossiermgt.exception.NoSuchDossierFileException;
import org.opencps.dossiermgt.model.DossierFile;

import java.io.InputStream;
import java.io.Serializable;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for DossierFile. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see DossierFileLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.DossierFileLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierFileLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierFileLocalServiceUtil} to access the dossier file local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierFileLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	public Hits searchLucene(
		LinkedHashMap<java.lang.String, java.lang.Object> params, Sort[] sorts,
		int start, int end, SearchContext searchContext)
		throws ParseException, SearchException;

	public int countDossierFileByDID_FTNO_DPT_NOT_NULL_FID(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, long fileEntryId,
		boolean removed);

	/**
	* Returns the number of dossier files.
	*
	* @return the number of dossier files
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossierFilesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<DossierFile> getAllDossierFile(long dossierId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getByDossierIdAndIsNew(long dossierId,
		boolean isNew);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getByReferenceUid(java.lang.String referenceUid);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getByTemplateNoAndIsNew(long dossierId,
		boolean isNew, java.lang.String[] fileTemplateNoArr);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_DPNO(long dossierId,
		java.lang.String dossierPartNo, boolean removed);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTN(long dossierId,
		java.lang.String fileTemplateNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTNO(long dossierId,
		java.lang.String fileTemplateNo, boolean removed);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTNO_DPT(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		int start, int end, OrderByComparator orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFileByDID_FTNO_DPT_NOT_NULL_FID(
		long dossierId, java.lang.String fileTemplateNo, int dossierPartType,
		long fileEntryId, boolean removed, int start, int end,
		OrderByComparator orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFiles(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFilesByD_DP(long dossierId,
		int dossierPartType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFilesByDossierId(long dossierId);

	/**
	* Returns all the dossier files matching the UUID and company.
	*
	* @param uuid the UUID of the dossier files
	* @param companyId the primary key of the company
	* @return the matching dossier files, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierFile> getDossierFilesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<DossierFile> orderByComparator);

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
	* POST /dossiers/{id|referenceUid}/files
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile addDossierFile(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String dossierTemplateNo,
		java.lang.String dossierPartNo, java.lang.String fileTemplateNo,
		java.lang.String displayName, java.lang.String sourceFileName,
		long fileSize, InputStream inputStream, java.lang.String fileType,
		java.lang.String isSync, long dossierActionId,
		ServiceContext serviceContext) throws PortalException, SystemException;

	/**
	* Adds the dossier file to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile addDossierFile(DossierFile dossierFile);

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile addDossierFileBySingleServer(long groupId,
		long dossierId, java.lang.String referenceUid,
		java.lang.String dossierTemplateNo, java.lang.String dossierPartNo,
		java.lang.String fileTemplateNo, java.lang.String displayName,
		java.lang.String sourceFileName, long fileSize, long fileEntryId,
		java.lang.String fileType, java.lang.String isSync,
		long dossierActionId, ServiceContext serviceContext)
		throws PortalException, SystemException;

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
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile cloneDossierFile(long groupId, long dossierId,
		long dossierFileId, java.lang.String dossierTemplateNo,
		java.lang.String dossierPartNo, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	* Creates a new dossier file with the primary key. Does not add the dossier file to the database.
	*
	* @param dossierFileId the primary key for the new dossier file
	* @return the new dossier file
	*/
	public DossierFile createDossierFile(long dossierFileId);

	/**
	* Deletes the dossier file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file that was removed
	* @throws PortalException if a dossier file with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(long dossierFileId)
		throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(long dossierId,
		java.lang.String referenceUid) throws PortalException;

	/**
	* Deletes the dossier file from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was removed
	* @throws PortalException
	*/
	@Indexable(type = IndexableType.DELETE)
	public DossierFile deleteDossierFile(DossierFile dossierFile)
		throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public DossierFile deletePermanentDossierFile(DossierFile dossierFile);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile fetchDossierFile(long dossierFileId);

	/**
	* Returns the dossier file matching the UUID and group.
	*
	* @param uuid the dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier file, or <code>null</code> if a matching dossier file could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile fetchDossierFileByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Get dossierFile by deliverable Code using output DB
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getByDeliverableCode(java.lang.String deliverableCode);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getByF_DID_REF_DAID(long dossierId,
		java.lang.String referenceUid, long dossierActionId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getByFileEntryId(long fileEntryId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getByFileTemplateNo(long id,
		java.lang.String fileTemplateNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getByRefAndGroupId(long groupId,
		java.lang.String referenceUid) throws PortalException;

	/**
	* Returns the dossier file with the primary key.
	*
	* @param dossierFileId the primary key of the dossier file
	* @return the dossier file
	* @throws PortalException if a dossier file with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getDossierFile(long dossierFileId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getDossierFileByDID_FTNO_DPT_First(long dossierId,
		java.lang.String fileTemplateNo, int dossierPartType, boolean removed,
		OrderByComparator orderByComparator) throws NoSuchDossierFileException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getDossierFileByDID_FTNO_First(long dossierId,
		java.lang.String fileTemplateNo, boolean removed,
		OrderByComparator orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getDossierFileByReferenceUid(long dossierId,
		java.lang.String referenceUid);

	/**
	* Returns the dossier file matching the UUID and group.
	*
	* @param uuid the dossier file's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier file
	* @throws PortalException if a matching dossier file could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierFile getDossierFileByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile removeDossierFile(long dossierId,
		java.lang.String referenceUid, ServiceContext serviceContext)
		throws PortalException;

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile resetDossierFile(long dossierFileId);

	/**
	* POST /dossiers/{id|referenceUid}/files/{referenceUid}
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateDossierFile(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String displayName,
		java.lang.String sourceFileName, InputStream inputStream,
		ServiceContext serviceContext) throws PortalException, SystemException;

	/**
	* Updates the dossier file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierFile the dossier file
	* @return the dossier file that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateDossierFile(DossierFile dossierFile);

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateDossierFileBySingleServer(long groupId,
		long dossierId, java.lang.String referenceUid,
		java.lang.String displayName, java.lang.String sourceFileName,
		long fileEntryId, ServiceContext serviceContext)
		throws PortalException, SystemException;

	@Indexable(type = IndexableType.REINDEX)
	public DossierFile updateFormData(long groupId, long dossierId,
		long dossierActionId, java.lang.String referenceUid,
		java.lang.String formData, ServiceContext serviceContext)
		throws PortalException, SystemException;

	public DossierFile updateFormDataPlugin(long groupId, long dossierId,
		java.lang.String referenceUid, java.lang.String formData,
		ServiceContext serviceContext) throws PortalException, SystemException;

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
	public void cloneDossierFilesByDossierId(long groupId, long newDossierId,
		long oldDossierId, int dossierPartType, ServiceContext serviceContext)
		throws PortalException, SystemException;
}