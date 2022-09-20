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
 * Provides the local service utility for ProcessPlugin. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.ProcessPluginLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see ProcessPluginLocalService
 * @see org.opencps.dossiermgt.service.base.ProcessPluginLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.ProcessPluginLocalServiceImpl
 * @generated
 */
@ProviderType
public class ProcessPluginLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.ProcessPluginLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	/**
	* Returns the number of process plugins.
	*
	* @return the number of process plugins
	*/
	public static int getProcessPluginsCount() {
		return getService().getProcessPluginsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessPluginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.ProcessPlugin> getBySC_SPID_ARUN(
		long serviceProcessId, java.lang.String stepCode, boolean autoRun) {
		return getService()
				   .getBySC_SPID_ARUN(serviceProcessId, stepCode, autoRun);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.ProcessPlugin> getProcessPlugins(
		int start, int end) {
		return getService().getProcessPlugins(start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ProcessPlugin> getProcessPlugins(
		long serviceProcessId, java.lang.String stepCode) {
		return getService().getProcessPlugins(serviceProcessId, stepCode);
	}

	/**
	* Returns all the process plugins matching the UUID and company.
	*
	* @param uuid the UUID of the process plugins
	* @param companyId the primary key of the company
	* @return the matching process plugins, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ProcessPlugin> getProcessPluginsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getProcessPluginsByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<org.opencps.dossiermgt.model.ProcessPlugin> getProcessPluginsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.ProcessPlugin> orderByComparator) {
		return getService()
				   .getProcessPluginsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
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
	* Adds the process plugin to the database. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was added
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin addProcessPlugin(
		org.opencps.dossiermgt.model.ProcessPlugin processPlugin) {
		return getService().addProcessPlugin(processPlugin);
	}

	/**
	* Creates a new process plugin with the primary key. Does not add the process plugin to the database.
	*
	* @param processPluginId the primary key for the new process plugin
	* @return the new process plugin
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin createProcessPlugin(
		long processPluginId) {
		return getService().createProcessPlugin(processPluginId);
	}

	/**
	* Deletes the process plugin with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processPluginId the primary key of the process plugin
	* @return the process plugin that was removed
	* @throws PortalException if a process plugin with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin deleteProcessPlugin(
		long processPluginId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProcessPlugin(processPluginId);
	}

	/**
	* Deletes the process plugin from the database. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was removed
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin deleteProcessPlugin(
		org.opencps.dossiermgt.model.ProcessPlugin processPlugin) {
		return getService().deleteProcessPlugin(processPlugin);
	}

	public static org.opencps.dossiermgt.model.ProcessPlugin fetchProcessPlugin(
		long processPluginId) {
		return getService().fetchProcessPlugin(processPluginId);
	}

	/**
	* Returns the process plugin matching the UUID and group.
	*
	* @param uuid the process plugin's UUID
	* @param groupId the primary key of the group
	* @return the matching process plugin, or <code>null</code> if a matching process plugin could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin fetchProcessPluginByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchProcessPluginByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the process plugin with the primary key.
	*
	* @param processPluginId the primary key of the process plugin
	* @return the process plugin
	* @throws PortalException if a process plugin with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin getProcessPlugin(
		long processPluginId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProcessPlugin(processPluginId);
	}

	/**
	* Returns the process plugin matching the UUID and group.
	*
	* @param uuid the process plugin's UUID
	* @param groupId the primary key of the group
	* @return the matching process plugin
	* @throws PortalException if a matching process plugin could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin getProcessPluginByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProcessPluginByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the process plugin in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processPlugin the process plugin
	* @return the process plugin that was updated
	*/
	public static org.opencps.dossiermgt.model.ProcessPlugin updateProcessPlugin(
		org.opencps.dossiermgt.model.ProcessPlugin processPlugin) {
		return getService().updateProcessPlugin(processPlugin);
	}

	public static ProcessPluginLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProcessPluginLocalService, ProcessPluginLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ProcessPluginLocalService.class);
}