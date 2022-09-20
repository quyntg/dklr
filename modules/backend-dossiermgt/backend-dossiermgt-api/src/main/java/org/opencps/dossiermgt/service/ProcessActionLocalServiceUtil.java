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
 * Provides the local service utility for ProcessAction. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.ProcessActionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see ProcessActionLocalService
 * @see org.opencps.dossiermgt.service.base.ProcessActionLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.ProcessActionLocalServiceImpl
 * @generated
 */
@ProviderType
public class ProcessActionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.ProcessActionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	/**
	* Returns the number of process actions.
	*
	* @return the number of process actions
	*/
	public static int getProcessActionsCount() {
		return getService().getProcessActionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getByActionCode(
		long groupId, java.lang.String actionCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getByActionCode(groupId, actionCode);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getByActionCode(
		long groupId, java.lang.String actionCode, long serviceProcessId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getByActionCode(groupId, actionCode, serviceProcessId);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getByGroupAndAutoEvent(
		long groupId, java.lang.String autoEvent, int start, int end) {
		return getService()
				   .getByGroupAndAutoEvent(groupId, autoEvent, start, end);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getProcessActionByG_SPID_PRESC(
		long groupId, long serviceProcessId, java.lang.String preStepCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getProcessActionByG_SPID_PRESC(groupId, serviceProcessId,
			preStepCode);
	}

	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getProcessActionbyServiceProcessId(
		long serviceProcessId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProcessActionbyServiceProcessId(serviceProcessId);
	}

	/**
	* Returns a range of all the process actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process actions
	* @param end the upper bound of the range of process actions (not inclusive)
	* @return the range of process actions
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getProcessActions(
		int start, int end) {
		return getService().getProcessActions(start, end);
	}

	/**
	* Returns all the process actions matching the UUID and company.
	*
	* @param uuid the UUID of the process actions
	* @param companyId the primary key of the company
	* @return the matching process actions, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getProcessActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getProcessActionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of process actions matching the UUID and company.
	*
	* @param uuid the UUID of the process actions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of process actions
	* @param end the upper bound of the range of process actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching process actions, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.ProcessAction> getProcessActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.ProcessAction> orderByComparator) {
		return getService()
				   .getProcessActionsByUuidAndCompanyId(uuid, companyId, start,
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

	public static long searchCount(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService().searchCount(params, searchContext);
	}

	/**
	* Adds the process action to the database. Also notifies the appropriate model listeners.
	*
	* @param processAction the process action
	* @return the process action that was added
	*/
	public static org.opencps.dossiermgt.model.ProcessAction addProcessAction(
		org.opencps.dossiermgt.model.ProcessAction processAction) {
		return getService().addProcessAction(processAction);
	}

	/**
	* Creates a new process action with the primary key. Does not add the process action to the database.
	*
	* @param processActionId the primary key for the new process action
	* @return the new process action
	*/
	public static org.opencps.dossiermgt.model.ProcessAction createProcessAction(
		long processActionId) {
		return getService().createProcessAction(processActionId);
	}

	/**
	* Deletes the process action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processActionId the primary key of the process action
	* @return the process action that was removed
	* @throws PortalException if a process action with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessAction deleteProcessAction(
		long processActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProcessAction(processActionId);
	}

	/**
	* Deletes the process action from the database. Also notifies the appropriate model listeners.
	*
	* @param processAction the process action
	* @return the process action that was removed
	*/
	public static org.opencps.dossiermgt.model.ProcessAction deleteProcessAction(
		org.opencps.dossiermgt.model.ProcessAction processAction) {
		return getService().deleteProcessAction(processAction);
	}

	public static org.opencps.dossiermgt.model.ProcessAction fetchBySPID_AC(
		long serviceProcessId, java.lang.String actionCode) {
		return getService().fetchBySPID_AC(serviceProcessId, actionCode);
	}

	public static org.opencps.dossiermgt.model.ProcessAction fetchBySPI_PRESC_AEV(
		long serviceProcessId, java.lang.String preStepCode,
		java.lang.String autoEvent) {
		return getService()
				   .fetchBySPI_PRESC_AEV(serviceProcessId, preStepCode,
			autoEvent);
	}

	public static org.opencps.dossiermgt.model.ProcessAction fetchProcessAction(
		long processActionId) {
		return getService().fetchProcessAction(processActionId);
	}

	/**
	* Returns the process action matching the UUID and group.
	*
	* @param uuid the process action's UUID
	* @param groupId the primary key of the group
	* @return the matching process action, or <code>null</code> if a matching process action could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessAction fetchProcessActionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchProcessActionByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.ProcessAction getByNameActionNo(
		long serviceProcessId, java.lang.String actionCode,
		java.lang.String actionName) {
		return getService()
				   .getByNameActionNo(serviceProcessId, actionCode, actionName);
	}

	public static org.opencps.dossiermgt.model.ProcessAction getByS_A_PS(
		long serviceProcessId, java.lang.String actionCode,
		java.lang.String postStepCode) {
		return getService()
				   .getByS_A_PS(serviceProcessId, actionCode, postStepCode);
	}

	/**
	* Returns the process action with the primary key.
	*
	* @param processActionId the primary key of the process action
	* @return the process action
	* @throws PortalException if a process action with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessAction getProcessAction(
		long processActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProcessAction(processActionId);
	}

	/**
	* Returns the process action matching the UUID and group.
	*
	* @param uuid the process action's UUID
	* @param groupId the primary key of the group
	* @return the matching process action
	* @throws PortalException if a matching process action could not be found
	*/
	public static org.opencps.dossiermgt.model.ProcessAction getProcessActionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProcessActionByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.ProcessAction removeProcessAction(
		long processActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().removeProcessAction(processActionId);
	}

	@Deprecated
	public static org.opencps.dossiermgt.model.ProcessAction updateProcessAction(
		long groupId, long processActionId, long serviceProcessId,
		java.lang.String preStepCode, java.lang.String postStepCode,
		java.lang.String autoEvent, java.lang.String preCondition,
		java.lang.String actionCode, java.lang.String actionName,
		boolean allowAssignUser, long assignUserId, int requestPayment,
		java.lang.String paymentFee, java.lang.String createDossierFiles,
		java.lang.String returnDossierFiles, java.lang.String makeBriefNote,
		java.lang.String syncActionCode, boolean rollbackable,
		boolean createDossierNo, boolean eSignature,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateProcessAction(groupId, processActionId,
			serviceProcessId, preStepCode, postStepCode, autoEvent,
			preCondition, actionCode, actionName, allowAssignUser,
			assignUserId, requestPayment, paymentFee, createDossierFiles,
			returnDossierFiles, makeBriefNote, syncActionCode, rollbackable,
			createDossierNo, eSignature, context);
	}

	public static org.opencps.dossiermgt.model.ProcessAction updateProcessAction(
		long groupId, long processActionId, long serviceProcessId,
		java.lang.String preStepCode, java.lang.String postStepCode,
		java.lang.String autoEvent, java.lang.String preCondition,
		java.lang.String actionCode, java.lang.String actionName,
		boolean allowAssignUser, long assignUserId, int requestPayment,
		java.lang.String paymentFee, java.lang.String createDossierFiles,
		java.lang.String returnDossierFiles, java.lang.String makeBriefNote,
		java.lang.String syncActionCode, boolean rollbackable,
		boolean createDossierNo, boolean eSignature,
		java.lang.String configNote, java.lang.String dossierTemplateNo,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateProcessAction(groupId, processActionId,
			serviceProcessId, preStepCode, postStepCode, autoEvent,
			preCondition, actionCode, actionName, allowAssignUser,
			assignUserId, requestPayment, paymentFee, createDossierFiles,
			returnDossierFiles, makeBriefNote, syncActionCode, rollbackable,
			createDossierNo, eSignature, configNote, dossierTemplateNo, context);
	}

	@Deprecated
	public static org.opencps.dossiermgt.model.ProcessAction updateProcessAction(
		long groupId, long processActionId, long serviceProcessId,
		java.lang.String preStepCode, java.lang.String postStepCode,
		java.lang.String autoEvent, java.lang.String preCondition,
		java.lang.String actionCode, java.lang.String actionName,
		boolean allowAssignUser, long assignUserId, int requestPayment,
		java.lang.String paymentFee, java.lang.String createDossierFiles,
		java.lang.String returnDossierFiles, java.lang.String makeBriefNote,
		java.lang.String syncActionCode, boolean rollbackable,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateProcessAction(groupId, processActionId,
			serviceProcessId, preStepCode, postStepCode, autoEvent,
			preCondition, actionCode, actionName, allowAssignUser,
			assignUserId, requestPayment, paymentFee, createDossierFiles,
			returnDossierFiles, makeBriefNote, syncActionCode, rollbackable,
			context);
	}

	/**
	* Updates the process action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processAction the process action
	* @return the process action that was updated
	*/
	public static org.opencps.dossiermgt.model.ProcessAction updateProcessAction(
		org.opencps.dossiermgt.model.ProcessAction processAction) {
		return getService().updateProcessAction(processAction);
	}

	public static ProcessActionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProcessActionLocalService, ProcessActionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ProcessActionLocalService.class);
}