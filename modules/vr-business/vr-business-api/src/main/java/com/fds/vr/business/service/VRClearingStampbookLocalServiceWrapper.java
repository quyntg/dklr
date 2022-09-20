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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRClearingStampbookLocalService}.
 *
 * @author LamTV
 * @see VRClearingStampbookLocalService
 * @generated
 */
@ProviderType
public class VRClearingStampbookLocalServiceWrapper
	implements VRClearingStampbookLocalService,
		ServiceWrapper<VRClearingStampbookLocalService> {
	public VRClearingStampbookLocalServiceWrapper(
		VRClearingStampbookLocalService vrClearingStampbookLocalService) {
		_vrClearingStampbookLocalService = vrClearingStampbookLocalService;
	}

	/**
	* Adds the vr clearing stampbook to the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was added
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook addVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return _vrClearingStampbookLocalService.addVRClearingStampbook(vrClearingStampbook);
	}

	/**
	* Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	*
	* @param id the primary key for the new vr clearing stampbook
	* @return the new vr clearing stampbook
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook createVRClearingStampbook(
		long id) {
		return _vrClearingStampbookLocalService.createVRClearingStampbook(id);
	}

	/**
	* Deletes the vr clearing stampbook from the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook deleteVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return _vrClearingStampbookLocalService.deleteVRClearingStampbook(vrClearingStampbook);
	}

	/**
	* Deletes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook deleteVRClearingStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrClearingStampbookLocalService.deleteVRClearingStampbook(id);
	}

	@Override
	public com.fds.vr.business.model.VRClearingStampbook fetchVRClearingStampbook(
		long id) {
		return _vrClearingStampbookLocalService.fetchVRClearingStampbook(id);
	}

	/**
	* Returns the vr clearing stampbook with the primary key.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook getVRClearingStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrClearingStampbookLocalService.getVRClearingStampbook(id);
	}

	@Override
	public com.fds.vr.business.model.VRClearingStampbook updateClearingStambook(
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
		return _vrClearingStampbookLocalService.updateClearingStambook(id,
			mtCore, debitNoteId, inputSheetId, outputSheetId, bookId,
			certificateId, certificateNumber, certificateDate, vehicleClass,
			stampType, stampShortNo, serialStartNo, serialEndNo,
			subTotalInDocument, subTotalQuantities, vehiclePrice, unitPrice,
			totalAmount, totalInUse, totalNotUsed, totalLost, totalCancelled,
			totalReturned, remark);
	}

	/**
	* Updates the vr clearing stampbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRClearingStampbook updateVRClearingStampbook(
		com.fds.vr.business.model.VRClearingStampbook vrClearingStampbook) {
		return _vrClearingStampbookLocalService.updateVRClearingStampbook(vrClearingStampbook);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrClearingStampbookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrClearingStampbookLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrClearingStampbookLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrClearingStampbookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrClearingStampbookLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr clearing stampbooks.
	*
	* @return the number of vr clearing stampbooks
	*/
	@Override
	public int getVRClearingStampbooksCount() {
		return _vrClearingStampbookLocalService.getVRClearingStampbooksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrClearingStampbookLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrClearingStampbookLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrClearingStampbookLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrClearingStampbookLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetId(
		long mtCore, long inputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByInputSheetId(mtCore,
			inputSheetId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByInputSheetIdAndBookId(mtCore,
			inputSheetId, bookId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByOutputSheetId(mtCore,
			outputSheetId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByOutputSheetIdAndBookId(mtCore,
			outputSheetId, bookId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findBycertificateId(mtCore,
			certificateId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findBycertificateNumber(mtCore,
			certificateNumber);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> findBydebitNoteId(
		long mtCore, long debitNoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.findBydebitNoteId(mtCore,
			debitNoteId);
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
	@Override
	public java.util.List<com.fds.vr.business.model.VRClearingStampbook> getVRClearingStampbooks(
		int start, int end) {
		return _vrClearingStampbookLocalService.getVRClearingStampbooks(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrClearingStampbookLocalService.counData(sql);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrClearingStampbookLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vrClearingStampbookLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRClearingStampbookLocalService getWrappedService() {
		return _vrClearingStampbookLocalService;
	}

	@Override
	public void setWrappedService(
		VRClearingStampbookLocalService vrClearingStampbookLocalService) {
		_vrClearingStampbookLocalService = vrClearingStampbookLocalService;
	}

	private VRClearingStampbookLocalService _vrClearingStampbookLocalService;
}