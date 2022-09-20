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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VRCorporationView. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRCorporationViewLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRCorporationViewLocalService
 * @see com.fds.vr.business.service.base.VRCorporationViewLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCorporationViewLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCorporationViewLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCorporationViewLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr corporation view to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was added
	*/
	public static com.fds.vr.business.model.VRCorporationView addVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return getService().addVRCorporationView(vrCorporationView);
	}

	/**
	* Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	*
	* @param id the primary key for the new vr corporation view
	* @return the new vr corporation view
	*/
	public static com.fds.vr.business.model.VRCorporationView createVRCorporationView(
		long id) {
		return getService().createVRCorporationView(id);
	}

	/**
	* Deletes the vr corporation view from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was removed
	*/
	public static com.fds.vr.business.model.VRCorporationView deleteVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return getService().deleteVRCorporationView(vrCorporationView);
	}

	/**
	* Deletes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view that was removed
	* @throws PortalException if a vr corporation view with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCorporationView deleteVRCorporationView(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCorporationView(id);
	}

	public static com.fds.vr.business.model.VRCorporationView fetchVRCorporationView(
		long id) {
		return getService().fetchVRCorporationView(id);
	}

	public static com.fds.vr.business.model.VRCorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByCorporationIdAndIsLeader(corporationId, isLeader);
	}

	public static com.fds.vr.business.model.VRCorporationView findByInspectorIdCorporationIdIsLeader(
		java.lang.String corporationId, long inspectorId, int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInspectorIdCorporationIdIsLeader(corporationId,
			inspectorId, isLeader);
	}

	/**
	* Returns the vr corporation view with the primary key.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view
	* @throws PortalException if a vr corporation view with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCorporationView getVRCorporationView(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCorporationView(id);
	}

	/**
	* Updates the vr corporation view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationView the vr corporation view
	* @return the vr corporation view that was updated
	*/
	public static com.fds.vr.business.model.VRCorporationView updateVRCorporationView(
		com.fds.vr.business.model.VRCorporationView vrCorporationView) {
		return getService().updateVRCorporationView(vrCorporationView);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findData(sql, columnNames, dataTypes, modelClazz,
			modelClassName, start, end);
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
	* Returns the number of vr corporation views.
	*
	* @return the number of vr corporation views
	*/
	public static int getVRCorporationViewsCount() {
		return getService().getVRCorporationViewsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRCorporationView> findByCorporationId(
		java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCorporationId(corporationId);
	}

	public static java.util.List<com.fds.vr.business.model.VRCorporationView> findByInspectorId(
		long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByInspectorId(inspectorId);
	}

	public static java.util.List<com.fds.vr.business.model.VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInspectorIdCorporationId(corporationId, inspectorId);
	}

	public static java.util.List<com.fds.vr.business.model.VRCorporationView> findByIsLeader(
		int isLeader)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByIsLeader(isLeader);
	}

	/**
	* Returns a range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of vr corporation views
	*/
	public static java.util.List<com.fds.vr.business.model.VRCorporationView> getVRCorporationViews(
		int start, int end) {
		return getService().getVRCorporationViews(start, end);
	}

	public static long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().counData(sql);
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

	public static VRCorporationViewLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCorporationViewLocalService, VRCorporationViewLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCorporationViewLocalService.class);
}