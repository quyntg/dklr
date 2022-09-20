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
 * Provides the local service utility for DossierAction. This utility wraps
 * {@link org.opencps.dossiermgt.service.impl.DossierActionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author huymq
 * @see DossierActionLocalService
 * @see org.opencps.dossiermgt.service.base.DossierActionLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.DossierActionLocalServiceImpl
 * @generated
 */
@ProviderType
public class DossierActionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.DossierActionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of dossier actions.
	*
	* @return the number of dossier actions
	*/
	public static int getDossierActionsCount() {
		return getService().getDossierActionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.dossiermgt.model.DossierAction> getDossierActionById(
		long dossierId) {
		return getService().getDossierActionById(dossierId);
	}

	/**
	* Returns a range of all the dossier actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DossierActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @return the range of dossier actions
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierAction> getDossierActions(
		int start, int end) {
		return getService().getDossierActions(start, end);
	}

	/**
	* Returns all the dossier actions matching the UUID and company.
	*
	* @param uuid the UUID of the dossier actions
	* @param companyId the primary key of the company
	* @return the matching dossier actions, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierAction> getDossierActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getDossierActionsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of dossier actions matching the UUID and company.
	*
	* @param uuid the UUID of the dossier actions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dossier actions
	* @param end the upper bound of the range of dossier actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dossier actions, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.dossiermgt.model.DossierAction> getDossierActionsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.DossierAction> orderByComparator) {
		return getService()
				   .getDossierActionsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	public static java.util.List<org.opencps.dossiermgt.model.DossierAction> getDossiersPending(
		long groupId, java.lang.String pending) {
		return getService().getDossiersPending(groupId, pending);
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
	* Adds the dossier action to the database. Also notifies the appropriate model listeners.
	*
	* @param dossierAction the dossier action
	* @return the dossier action that was added
	*/
	public static org.opencps.dossiermgt.model.DossierAction addDossierAction(
		org.opencps.dossiermgt.model.DossierAction dossierAction) {
		return getService().addDossierAction(dossierAction);
	}

	/**
	* Creates a new dossier action with the primary key. Does not add the dossier action to the database.
	*
	* @param dossierActionId the primary key for the new dossier action
	* @return the new dossier action
	*/
	public static org.opencps.dossiermgt.model.DossierAction createDossierAction(
		long dossierActionId) {
		return getService().createDossierAction(dossierActionId);
	}

	/**
	* Deletes the dossier action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierActionId the primary key of the dossier action
	* @return the dossier action that was removed
	* @throws PortalException if a dossier action with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierAction deleteDossierAction(
		long dossierActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDossierAction(dossierActionId);
	}

	/**
	* Deletes the dossier action from the database. Also notifies the appropriate model listeners.
	*
	* @param dossierAction the dossier action
	* @return the dossier action that was removed
	*/
	public static org.opencps.dossiermgt.model.DossierAction deleteDossierAction(
		org.opencps.dossiermgt.model.DossierAction dossierAction) {
		return getService().deleteDossierAction(dossierAction);
	}

	public static org.opencps.dossiermgt.model.DossierAction fetchDossierAction(
		long dossierActionId) {
		return getService().fetchDossierAction(dossierActionId);
	}

	/**
	* Returns the dossier action matching the UUID and group.
	*
	* @param uuid the dossier action's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier action, or <code>null</code> if a matching dossier action could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierAction fetchDossierActionByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchDossierActionByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.DossierAction getByNextActionId(
		long dossierId, long nextActionId) {
		return getService().getByNextActionId(dossierId, nextActionId);
	}

	public static org.opencps.dossiermgt.model.DossierAction getByPenddingStatus(
		long dossierId, boolean pending) {
		return getService().getByPenddingStatus(dossierId, pending);
	}

	/**
	* Returns the dossier action with the primary key.
	*
	* @param dossierActionId the primary key of the dossier action
	* @return the dossier action
	* @throws PortalException if a dossier action with the primary key could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierAction getDossierAction(
		long dossierActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierAction(dossierActionId);
	}

	public static org.opencps.dossiermgt.model.DossierAction getDossierActionById(
		long dossierId, long userId) {
		return getService().getDossierActionById(dossierId, userId);
	}

	/**
	* Returns the dossier action matching the UUID and group.
	*
	* @param uuid the dossier action's UUID
	* @param groupId the primary key of the group
	* @return the matching dossier action
	* @throws PortalException if a matching dossier action could not be found
	*/
	public static org.opencps.dossiermgt.model.DossierAction getDossierActionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDossierActionByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.dossiermgt.model.DossierAction getDossierActionbyDossierIdandActionCode(
		long dossierId, java.lang.String actionCode) {
		return getService()
				   .getDossierActionbyDossierIdandActionCode(dossierId,
			actionCode);
	}

	public static org.opencps.dossiermgt.model.DossierAction removeAction(
		long actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().removeAction(actionId);
	}

	public static org.opencps.dossiermgt.model.DossierAction updateDossierAction(
		long groupId, long dossierActionId, long dossierId,
		long serviceProcessId, long previousActionId,
		java.lang.String actionCode, java.lang.String actionUser,
		java.lang.String actionName, java.lang.String actionNote,
		int actionOverdue, java.lang.String syncActionCode, boolean pending,
		boolean rollbackable, java.lang.String stepCode,
		java.lang.String stepName, java.util.Date dueDate, long nextActionId,
		java.lang.String payload, java.lang.String stepInstruction,
		com.liferay.portal.kernel.service.ServiceContext context)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateDossierAction(groupId, dossierActionId, dossierId,
			serviceProcessId, previousActionId, actionCode, actionUser,
			actionName, actionNote, actionOverdue, syncActionCode, pending,
			rollbackable, stepCode, stepName, dueDate, nextActionId, payload,
			stepInstruction, context);
	}

	/**
	* Updates the dossier action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dossierAction the dossier action
	* @return the dossier action that was updated
	*/
	public static org.opencps.dossiermgt.model.DossierAction updateDossierAction(
		org.opencps.dossiermgt.model.DossierAction dossierAction) {
		return getService().updateDossierAction(dossierAction);
	}

	public static org.opencps.dossiermgt.model.DossierAction updateNextActionId(
		long actionId, long nextActionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateNextActionId(actionId, nextActionId);
	}

	public static org.opencps.dossiermgt.model.DossierAction updatePending(
		long actionId, boolean pending)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updatePending(actionId, pending);
	}

	public static DossierActionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DossierActionLocalService, DossierActionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DossierActionLocalService.class);
}