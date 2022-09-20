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
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.DossierSync;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for DossierSync. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see DossierSyncLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.DossierSyncLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierSyncLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DossierSyncLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DossierSyncLocalServiceUtil} to access the dossier sync local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierSyncLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countByDossierId(long dossierId);

	public int countByGroupDossierId(long groupId, long dossierId);

	public int countByGroupDossierRef(long groupId, java.lang.String dossierRef);

	/**
	* Returns the number of dossier syncs.
	*
	* @return the number of dossier syncs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDossierSyncsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<DossierSync> fetchByGroupDossierId(long groupId,
		long dossierId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> fetchByGroupDossierRef(long groupId,
		java.lang.String dossierRef, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> fetchByGroupId(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> fetchByServerNo(java.lang.String serverNo,
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> fetchByServerNo(java.lang.String serverNo,
		int state, int start, int end);

	/**
	* Returns a range of all the dossier syncs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierSyncModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @return the range of dossier syncs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> getDossierSyncs(int start, int end);

	/**
	* Returns all the dossier syncs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier syncs
	* @param companyId the primary key of the company
	* @return the matching dossier syncs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of dossier syncs matching the UUID and company.
	*
	* @param uuid the UUID of the dossier syncs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossier syncs
	* @param end the upper bound of the range of dossier syncs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossier syncs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DossierSync> getDossierSyncsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<DossierSync> orderByComparator);

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
	* Adds the dossier sync to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierSync addDossierSync(DossierSync dossierSync);

	/**
	* Creates a new dossier sync with the primary key. Does not add the dossier sync to the database.
	*
	* @param dossierSyncId the primary key for the new dossier sync
	* @return the new dossier sync
	*/
	public DossierSync createDossierSync(long dossierSyncId);

	/**
	* Deletes the dossier sync with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync that was removed
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public DossierSync deleteDossierSync(long dossierSyncId)
		throws PortalException;

	/**
	* Deletes the dossier sync from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public DossierSync deleteDossierSync(DossierSync dossierSync);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierSync fetchDossierSync(long dossierSyncId);

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync, or <code>null</code> if a matching dossier sync could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierSync fetchDossierSyncByUuidAndGroupId(java.lang.String uuid,
		long groupId);

	/**
	* Returns the dossier sync with the primary key.
	*
	* @param dossierSyncId the primary key of the dossier sync
	* @return the dossier sync
	* @throws PortalException if a dossier sync with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierSync getDossierSync(long dossierSyncId)
		throws PortalException;

	/**
	* Returns the dossier sync matching the UUID and group.
	*
	* @param uuid the dossier sync's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier sync
	* @throws PortalException if a matching dossier sync could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DossierSync getDossierSyncByUuidAndGroupId(java.lang.String uuid,
		long groupId) throws PortalException;

	public DossierSync shiftCreateDossierStatus(long dossierSyncId);

	public DossierSync updateCreateDossierStatus(long dossierSyncId,
		boolean status);

	public DossierSync updateDossierSync(long groupId, long userId,
		long dossierId, java.lang.String dossierReferenceUid,
		boolean createDossier, int method, long classPK,
		java.lang.String fileReferenceUid, java.lang.String serverNo);

	public DossierSync updateDossierSync(long groupId, long userId,
		long dossierId, java.lang.String dossierReferenceUid,
		boolean createDossier, int method, long classPK,
		java.lang.String fileReferenceUid, java.lang.String serverNo,
		java.lang.String payload, int retry, int state)
		throws JSONException;

	/**
	* Updates the dossier sync in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierSync the dossier sync
	* @return the dossier sync that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DossierSync updateDossierSync(DossierSync dossierSync);
}