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
 * Provides the local service utility for VRClearingStampbook. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRClearingStampbookLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRClearingStampbookLocalService
 * @see com.fds.vr.business.service.base.VRClearingStampbookLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRClearingStampbookLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRClearingStampbookLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRClearingStampbookLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr clearing stampbook to the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was added
	*/
	public static com.fds.vr.business.model.VRClearingStampbook addVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return getService().addVRClearingStampbook(vrClearingStampbook);
	}

	/**
	* Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	*
	* @param id the primary key for the new vr clearing stampbook
	* @return the new vr clearing stampbook
	*/
	public static com.fds.vr.business.model.VRClearingStampbook createVRClearingStampbook(
		long id) {
		return getService().createVRClearingStampbook(id);
	}

	/**
	* Deletes the vr clearing stampbook from the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	*/
	public static com.fds.vr.business.model.VRClearingStampbook deleteVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return getService().deleteVRClearingStampbook(vrClearingStampbook);
	}

	/**
	* Deletes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRClearingStampbook deleteVRClearingStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRClearingStampbook(id);
	}

	public static com.fds.vr.business.model.VRClearingStampbook fetchVRClearingStampbook(
		long id) {
		return getService().fetchVRClearingStampbook(id);
	}

	/**
	* Returns the vr clearing stampbook with the primary key.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRClearingStampbook getVRClearingStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRClearingStampbook(id);
	}

	public static com.fds.vr.business.model.VRClearingStampbook updateClearingStambook(
		long id, long mtCore, long debitNoteId, long inputSheetId,
		long outputSheetId, long bookId, long certificateId,
		java.lang.String certificateNumber, java.util.Date certificateDate,
		java.lang.String vehicleClass, java.lang.String stampType,
		java.lang.String stampShortNo, java.lang.Long serialStartNo,
		java.lang.Long serialEndNo, long subTotalInDocument,
		long subTotalQuantities, long vehiclePrice, long unitPrice,
		long totalAmount, long totalInUse, long totalNotUsed, long totalLost,
		long totalCancelled, long totalReturned, java.lang.String remark)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateClearingStambook(id, mtCore, debitNoteId,
			inputSheetId, outputSheetId, bookId, certificateId,
			certificateNumber, certificateDate, vehicleClass, stampType,
			stampShortNo, serialStartNo, serialEndNo, subTotalInDocument,
			subTotalQuantities, vehiclePrice, unitPrice, totalAmount,
			totalInUse, totalNotUsed, totalLost, totalCancelled, totalReturned,
			remark);
	}

	/**
	* Updates the vr clearing stampbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was updated
	*/
	public static com.fds.vr.business.model.VRClearingStampbook updateVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return getService().updateVRClearingStampbook(vrClearingStampbook);
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
	* Returns the number of vr clearing stampbooks.
	*
	* @return the number of vr clearing stampbooks
	*/
	public static int getVRClearingStampbooksCount() {
		return getService().getVRClearingStampbooksCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetId(
		long mtCore, long inputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByInputSheetId(mtCore, inputSheetId);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByOutputSheetId(mtCore, outputSheetId);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycertificateId(mtCore, certificateId);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycertificateNumber(mtCore, certificateNumber);
	}

	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBydebitNoteId(
		long mtCore, long debitNoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBydebitNoteId(mtCore, debitNoteId);
	}

	/**
	* Returns a range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of vr clearing stampbooks
	*/
	public static java.util.List<com.fds.vr.business.model.VRClearingStampbook> getVRClearingStampbooks(
		int start, int end) {
		return getService().getVRClearingStampbooks(start, end);
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

	public static VRClearingStampbookLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRClearingStampbookLocalService, VRClearingStampbookLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRClearingStampbookLocalService.class);
}