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
 * Provides the local service utility for VROutputSheet. This utility wraps
 * {@link com.fds.vr.business.service.impl.VROutputSheetLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VROutputSheetLocalService
 * @see com.fds.vr.business.service.base.VROutputSheetLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VROutputSheetLocalServiceImpl
 * @generated
 */
@ProviderType
public class VROutputSheetLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VROutputSheetLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr output sheet to the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was added
	*/
	public static com.fds.vr.business.model.VROutputSheet addVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return getService().addVROutputSheet(vrOutputSheet);
	}

	public static com.fds.vr.business.model.VROutputSheet createVROutputSheet(
		com.fds.vr.business.model.VROutputSheet object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createVROutputSheet(object);
	}

	/**
	* Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	*
	* @param id the primary key for the new vr output sheet
	* @return the new vr output sheet
	*/
	public static com.fds.vr.business.model.VROutputSheet createVROutputSheet(
		long id) {
		return getService().createVROutputSheet(id);
	}

	/**
	* Deletes the vr output sheet from the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was removed
	*/
	public static com.fds.vr.business.model.VROutputSheet deleteVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return getService().deleteVROutputSheet(vrOutputSheet);
	}

	/**
	* Deletes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet that was removed
	* @throws PortalException if a vr output sheet with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VROutputSheet deleteVROutputSheet(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVROutputSheet(id);
	}

	public static com.fds.vr.business.model.VROutputSheet fetchVROutputSheet(
		long id) {
		return getService().fetchVROutputSheet(id);
	}

	/**
	* Returns the vr output sheet with the primary key.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet
	* @throws PortalException if a vr output sheet with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VROutputSheet getVROutputSheet(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVROutputSheet(id);
	}

	public static com.fds.vr.business.model.VROutputSheet updateOutputSheet(
		long id, long mtCore, java.lang.String outputSheetNo,
		java.util.Date outputSheetDate, java.lang.String originalDocumentNo,
		java.lang.Long supplierCorporationId, java.lang.Long outputSheetType,
		java.lang.String maker, java.lang.String checker,
		java.lang.String approver, java.lang.String receiverName,
		java.lang.String receiverPlace, java.lang.String receiverRequest,
		java.lang.String inventoryName, java.lang.String inventoryPlace,
		java.util.Date inventoryDate, java.lang.Long dossierId,
		java.lang.Long issueId, java.lang.Long purchaserId,
		java.lang.Long purchaserCorporationId, java.lang.String bookIDList,
		java.lang.Long isApproval, java.lang.Long totalQuantities,
		java.lang.Long totalAmount, java.lang.String amountInWords,
		java.lang.String remark, java.lang.String details,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOutputSheet(id, mtCore, outputSheetNo,
			outputSheetDate, originalDocumentNo, supplierCorporationId,
			outputSheetType, maker, checker, approver, receiverName,
			receiverPlace, receiverRequest, inventoryName, inventoryPlace,
			inventoryDate, dossierId, issueId, purchaserId,
			purchaserCorporationId, bookIDList, isApproval, totalQuantities,
			totalAmount, amountInWords, remark, details, company);
	}

	public static com.fds.vr.business.model.VROutputSheet updateVROutputSheet(
		com.fds.vr.business.model.VROutputSheet object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVROutputSheet(object, company);
	}

	/**
	* Updates the vr output sheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was updated
	*/
	public static com.fds.vr.business.model.VROutputSheet updateVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return getService().updateVROutputSheet(vrOutputSheet);
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
	* Returns the number of vr output sheets.
	*
	* @return the number of vr output sheets
	*/
	public static int getVROutputSheetsCount() {
		return getService().getVROutputSheetsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VROutputSheet> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBydossierId(mtCore, dossierId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheet> findByinputSheetNo(
		long mtCore, java.lang.String outputSheetNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByinputSheetNo(mtCore, outputSheetNo);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheet> findByoutputSheetType(
		long mtCore, long outputSheetType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByoutputSheetType(mtCore, outputSheetType);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBypurchaserCorporationId(mtCore, purchaserCorporationId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheet> findBysupplierCorporationId(
		long mtCore, long supplierCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBysupplierCorporationId(mtCore, supplierCorporationId);
	}

	/**
	* Returns a range of all the vr output sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheets
	* @param end the upper bound of the range of vr output sheets (not inclusive)
	* @return the range of vr output sheets
	*/
	public static java.util.List<com.fds.vr.business.model.VROutputSheet> getVROutputSheets(
		int start, int end) {
		return getService().getVROutputSheets(start, end);
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

	public static VROutputSheetLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VROutputSheetLocalService, VROutputSheetLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VROutputSheetLocalService.class);
}