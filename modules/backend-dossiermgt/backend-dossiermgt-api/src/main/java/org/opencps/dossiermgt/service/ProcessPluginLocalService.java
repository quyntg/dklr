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
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.ProcessPlugin;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for ProcessPlugin. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see ProcessPluginLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.ProcessPluginLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.ProcessPluginLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ProcessPluginLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcessPluginLocalServiceUtil} to access the process plugin local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.ProcessPluginLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	/**
	* Returns the number of process plugins.
	*
	* @return the number of process plugins
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getProcessPluginsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<ProcessPlugin> getBySC_SPID_ARUN(long serviceProcessId,
		java.lang.String stepCode, boolean autoRun);

	/**
	* Returns a range of all the process plugins.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process plugins
	* @param end the upper bound of the range of process plugins (not inclusive)
	* @return the range of process plugins
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessPlugin> getProcessPlugins(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessPlugin> getProcessPlugins(long serviceProcessId,
		java.lang.String stepCode);

	/**
	* Returns all the process plugins matching the UUID and company.
	*
	* @param uuid the UUID of the process plugins
	* @param companyId the primary key of the company
	* @return the matching process plugins, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessPlugin> getProcessPluginsByUuidAndCompanyId(
		java.lang.String uuid, long companyId);

	/**
	* Returns a range of process plugins matching the UUID and company.
	*
	* @param uuid the UUID of the process plugins
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of process plugins
	* @param end the upper bound of the range of process plugins (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching process plugins, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessPlugin> getProcessPluginsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<ProcessPlugin> orderByComparator);

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
	* Adds the process plugin to the database. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ProcessPlugin addProcessPlugin(ProcessPlugin processPlugin);

	/**
	* Creates a new process plugin with the primary key. Does not add the process plugin to the database.
	*
	* @param processPluginId the primary key for the new process plugin
	* @return the new process plugin
	*/
	public ProcessPlugin createProcessPlugin(long processPluginId);

	/**
	* Deletes the process plugin with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processPluginId the primary key of the process plugin
	* @return the process plugin that was removed
	* @throws PortalException if a process plugin with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ProcessPlugin deleteProcessPlugin(long processPluginId)
		throws PortalException;

	/**
	* Deletes the process plugin from the database. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ProcessPlugin deleteProcessPlugin(ProcessPlugin processPlugin);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessPlugin fetchProcessPlugin(long processPluginId);

	/**
	* Returns the process plugin matching the UUID and group.
	*
	* @param uuid the process plugin's UUID
	* @param groupId the primary key of the group
	* @return the matching process plugin, or <code>null</code> if a matching process plugin could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessPlugin fetchProcessPluginByUuidAndGroupId(
		java.lang.String uuid, long groupId);

	/**
	* Returns the process plugin with the primary key.
	*
	* @param processPluginId the primary key of the process plugin
	* @return the process plugin
	* @throws PortalException if a process plugin with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessPlugin getProcessPlugin(long processPluginId)
		throws PortalException;

	/**
	* Returns the process plugin matching the UUID and group.
	*
	* @param uuid the process plugin's UUID
	* @param groupId the primary key of the group
	* @return the matching process plugin
	* @throws PortalException if a matching process plugin could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessPlugin getProcessPluginByUuidAndGroupId(
		java.lang.String uuid, long groupId) throws PortalException;

	/**
	* Updates the process plugin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ProcessPlugin updateProcessPlugin(ProcessPlugin processPlugin);
}