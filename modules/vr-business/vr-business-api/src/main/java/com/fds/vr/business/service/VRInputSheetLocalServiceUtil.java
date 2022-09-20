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
 * Provides the local service utility for VRInputSheet. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRInputSheetLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRInputSheetLocalService
 * @see com.fds.vr.business.service.base.VRInputSheetLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRInputSheetLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRInputSheetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRInputSheetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr input sheet to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was added
	*/
	public static com.fds.vr.business.model.VRInputSheet addVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return getService().addVRInputSheet(vrInputSheet);
	}

	/**
	* Creates a new vr input sheet with the primary key. Does not add the vr input sheet to the database.
	*
	* @param id the primary key for the new vr input sheet
	* @return the new vr input sheet
	*/
	public static com.fds.vr.business.model.VRInputSheet createVRInputSheet(
		long id) {
		return getService().createVRInputSheet(id);
	}

	/**
	* Deletes the vr input sheet from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was removed
	*/
	public static com.fds.vr.business.model.VRInputSheet deleteVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return getService().deleteVRInputSheet(vrInputSheet);
	}

	/**
	* Deletes the vr input sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet that was removed
	* @throws PortalException if a vr input sheet with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRInputSheet deleteVRInputSheet(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRInputSheet(id);
	}

	public static com.fds.vr.business.model.VRInputSheet fetchVRInputSheet(
		long id) {
		return getService().fetchVRInputSheet(id);
	}

	/**
	* Returns the vr input sheet with the primary key.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet
	* @throws PortalException if a vr input sheet with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRInputSheet getVRInputSheet(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRInputSheet(id);
	}

	public static com.fds.vr.business.model.VRInputSheet updateInputSheet(
		long id, long mtCore, java.lang.String inputSheetNo,
		java.util.Date inputSheetDate, java.lang.String originalDocumentNo,
		java.lang.Long corporationId, java.lang.Long inputSheetType,
		java.lang.String maker, java.lang.String checker,
		java.lang.String approver, java.lang.String deliveryName,
		java.lang.String inventoryName, java.lang.String inventoryPlace,
		java.util.Date inventoryDate, java.lang.String bookIDList,
		java.lang.Long isApproval, java.lang.Long totalQuantities,
		java.lang.Long totalAmount, java.lang.String amountInWords,
		java.lang.String remark, java.lang.String stampbooks,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateInputSheet(id, mtCore, inputSheetNo, inputSheetDate,
			originalDocumentNo, corporationId, inputSheetType, maker, checker,
			approver, deliveryName, inventoryName, inventoryPlace,
			inventoryDate, bookIDList, isApproval, totalQuantities,
			totalAmount, amountInWords, remark, stampbooks, company);
	}

	/**
	* Updates the vr input sheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was updated
	*/
	public static com.fds.vr.business.model.VRInputSheet updateVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return getService().updateVRInputSheet(vrInputSheet);
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
	* Returns the number of vr input sheets.
	*
	* @return the number of vr input sheets
	*/
	public static int getVRInputSheetsCount() {
		return getService().getVRInputSheetsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRInputSheet> findBycorporationId(
		long mtCore, long corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycorporationId(mtCore, corporationId);
	}

	public static java.util.List<com.fds.vr.business.model.VRInputSheet> findByinputSheetNo(
		long mtCore, java.lang.String inputSheetNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByinputSheetNo(mtCore, inputSheetNo);
	}

	public static java.util.List<com.fds.vr.business.model.VRInputSheet> findByinputSheetType(
		long mtCore, long inputSheetType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByinputSheetType(mtCore, inputSheetType);
	}

	/**
	* Returns a range of all the vr input sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @return the range of vr input sheets
	*/
	public static java.util.List<com.fds.vr.business.model.VRInputSheet> getVRInputSheets(
		int start, int end) {
		return getService().getVRInputSheets(start, end);
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

	public static VRInputSheetLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInputSheetLocalService, VRInputSheetLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRInputSheetLocalService.class);
}