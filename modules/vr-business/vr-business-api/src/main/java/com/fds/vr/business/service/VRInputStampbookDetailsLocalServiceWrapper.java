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
 * Provides a wrapper for {@link VRInputStampbookDetailsLocalService}.
 *
 * @author LamTV
 * @see VRInputStampbookDetailsLocalService
 * @generated
 */
@ProviderType
public class VRInputStampbookDetailsLocalServiceWrapper
	implements VRInputStampbookDetailsLocalService,
		ServiceWrapper<VRInputStampbookDetailsLocalService> {
	public VRInputStampbookDetailsLocalServiceWrapper(
		VRInputStampbookDetailsLocalService vrInputStampbookDetailsLocalService) {
		_vrInputStampbookDetailsLocalService = vrInputStampbookDetailsLocalService;
	}

	/**
	* Adds the vr input stampbook details to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	* @return the vr input stampbook details that was added
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails addVRInputStampbookDetails(
		com.fds.vr.business.model.VRInputStampbookDetails vrInputStampbookDetails) {
		return _vrInputStampbookDetailsLocalService.addVRInputStampbookDetails(vrInputStampbookDetails);
	}

	/**
	* Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	*
	* @param id the primary key for the new vr input stampbook details
	* @return the new vr input stampbook details
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails createVRInputStampbookDetails(
		long id) {
		return _vrInputStampbookDetailsLocalService.createVRInputStampbookDetails(id);
	}

	/**
	* Deletes the vr input stampbook details from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	* @return the vr input stampbook details that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails deleteVRInputStampbookDetails(
		com.fds.vr.business.model.VRInputStampbookDetails vrInputStampbookDetails) {
		return _vrInputStampbookDetailsLocalService.deleteVRInputStampbookDetails(vrInputStampbookDetails);
	}

	/**
	* Deletes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details that was removed
	* @throws PortalException if a vr input stampbook details with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails deleteVRInputStampbookDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookDetailsLocalService.deleteVRInputStampbookDetails(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails fetchVRInputStampbookDetails(
		long id) {
		return _vrInputStampbookDetailsLocalService.fetchVRInputStampbookDetails(id);
	}

	/**
	* Returns the vr input stampbook details with the primary key.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details
	* @throws PortalException if a vr input stampbook details with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails getVRInputStampbookDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookDetailsLocalService.getVRInputStampbookDetails(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails updateByOutputSheet(
		long bookId, long outputSheetType, long sequenceNo,
		java.lang.Long purchaserId, java.lang.Long corporationId,
		long issuingStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.updateByOutputSheet(bookId,
			outputSheetType, sequenceNo, purchaserId, corporationId,
			issuingStatus);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails updateInputStampbookDetails(
		long id, long mtCore, java.lang.String stampSerialNo,
		java.lang.Long sequenceNo, java.lang.Long dossierId,
		java.lang.Long certificateId, java.lang.String certificateNumber,
		java.util.Date certificateDate, java.lang.Long vehicleRecordId,
		java.lang.String frameNo, java.lang.String boxNo,
		java.lang.String vinNo, java.lang.String engineNo,
		java.lang.Long copies, java.lang.Long markupFulfill,
		java.lang.String replacedSerialNo, java.lang.String remark,
		java.lang.Long inputSheetId, java.lang.Long bookId,
		java.lang.Long purchaserId, java.lang.Long corporationId,
		java.lang.Long issuingStatus, java.lang.Long clearingStatus,
		java.lang.Long stampStatus, java.util.Date issuingDate,
		java.util.Date printingDate, java.util.Date noticeofLostDate,
		java.util.Date noticeofCancelDate, java.util.Date noticeofReturnDate,
		java.util.Date clearingDate, java.lang.Long clearingAdvancePaymentID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.updateInputStampbookDetails(id,
			mtCore, stampSerialNo, sequenceNo, dossierId, certificateId,
			certificateNumber, certificateDate, vehicleRecordId, frameNo,
			boxNo, vinNo, engineNo, copies, markupFulfill, replacedSerialNo,
			remark, inputSheetId, bookId, purchaserId, corporationId,
			issuingStatus, clearingStatus, stampStatus, issuingDate,
			printingDate, noticeofLostDate, noticeofCancelDate,
			noticeofReturnDate, clearingDate, clearingAdvancePaymentID);
	}

	/**
	* Updates the vr input stampbook details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	* @return the vr input stampbook details that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbookDetails updateVRInputStampbookDetails(
		com.fds.vr.business.model.VRInputStampbookDetails vrInputStampbookDetails) {
		return _vrInputStampbookDetailsLocalService.updateVRInputStampbookDetails(vrInputStampbookDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrInputStampbookDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrInputStampbookDetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrInputStampbookDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr input stampbook detailses.
	*
	* @return the number of vr input stampbook detailses
	*/
	@Override
	public int getVRInputStampbookDetailsesCount() {
		return _vrInputStampbookDetailsLocalService.getVRInputStampbookDetailsesCount();
	}

	@Override
	public java.lang.Long[] findStartNoEndNoBySequence(long inputStampbookId) {
		return _vrInputStampbookDetailsLocalService.findStartNoEndNoBySequence(inputStampbookId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrInputStampbookDetailsLocalService.getOSGiServiceIdentifier();
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
		return _vrInputStampbookDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInputStampbookDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInputStampbookDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findByInputSheetId(mtCore,
			inputSheetId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findByInputSheetIdAndBookId(mtCore,
			inputSheetId, bookId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findBycertificateId(mtCore,
			certificateId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findBycertificateNumber(mtCore,
			certificateNumber);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findBycorporationId(mtCore,
			corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findBydossierId(mtCore,
			dossierId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.findByvehicleRecordId(mtCore,
			vehicleRecordId);
	}

	@Override
	public java.util.List findStampbookByVehicleClass(
		java.lang.String vehicleClass, long corporationId) {
		return _vrInputStampbookDetailsLocalService.findStampbookByVehicleClass(vehicleClass,
			corporationId);
	}

	/**
	* Returns a range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of vr input stampbook detailses
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbookDetails> getVRInputStampbookDetailses(
		int start, int end) {
		return _vrInputStampbookDetailsLocalService.getVRInputStampbookDetailses(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookDetailsLocalService.counData(sql);
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
		return _vrInputStampbookDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrInputStampbookDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRInputStampbookDetailsLocalService getWrappedService() {
		return _vrInputStampbookDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		VRInputStampbookDetailsLocalService vrInputStampbookDetailsLocalService) {
		_vrInputStampbookDetailsLocalService = vrInputStampbookDetailsLocalService;
	}

	private VRInputStampbookDetailsLocalService _vrInputStampbookDetailsLocalService;
}