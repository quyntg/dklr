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
 * Provides a wrapper for {@link VRInputStampbookLocalService}.
 *
 * @author LamTV
 * @see VRInputStampbookLocalService
 * @generated
 */
@ProviderType
public class VRInputStampbookLocalServiceWrapper
	implements VRInputStampbookLocalService,
		ServiceWrapper<VRInputStampbookLocalService> {
	public VRInputStampbookLocalServiceWrapper(
		VRInputStampbookLocalService vrInputStampbookLocalService) {
		_vrInputStampbookLocalService = vrInputStampbookLocalService;
	}

	/**
	* Adds the vr input stampbook to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was added
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook addVRInputStampbook(
		com.fds.vr.business.model.VRInputStampbook vrInputStampbook) {
		return _vrInputStampbookLocalService.addVRInputStampbook(vrInputStampbook);
	}

	/**
	* Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	*
	* @param id the primary key for the new vr input stampbook
	* @return the new vr input stampbook
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook createVRInputStampbook(
		long id) {
		return _vrInputStampbookLocalService.createVRInputStampbook(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbook deleteInputStampbook(
		long id) {
		return _vrInputStampbookLocalService.deleteInputStampbook(id);
	}

	/**
	* Deletes the vr input stampbook from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook deleteVRInputStampbook(
		com.fds.vr.business.model.VRInputStampbook vrInputStampbook) {
		return _vrInputStampbookLocalService.deleteVRInputStampbook(vrInputStampbook);
	}

	/**
	* Deletes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook that was removed
	* @throws PortalException if a vr input stampbook with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook deleteVRInputStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookLocalService.deleteVRInputStampbook(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbook fetchVRInputStampbook(
		long id) {
		return _vrInputStampbookLocalService.fetchVRInputStampbook(id);
	}

	/**
	* Returns the vr input stampbook with the primary key.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook
	* @throws PortalException if a vr input stampbook with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook getVRInputStampbook(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookLocalService.getVRInputStampbook(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbook updateByOutputSheet(
		long bookId, long subTotalInDocument, long serialStartNo,
		long serialEndNo, java.lang.Long purchaserId,
		java.lang.Long corporationId, long outputSheetType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.updateByOutputSheet(bookId,
			subTotalInDocument, serialStartNo, serialEndNo, purchaserId,
			corporationId, outputSheetType);
	}

	@Override
	public com.fds.vr.business.model.VRInputStampbook updateInputStambook(
		long id, long mtCore, long inputSheetId, java.lang.Long corporationId,
		java.lang.Long inputSheetType, java.lang.String vehicleClass,
		java.lang.String stampType, java.lang.String stampShortNo,
		java.lang.Long serialStartNo, java.lang.Long serialEndNo,
		java.lang.Long subTotalInDocument, java.lang.Long subTotalQuantities,
		java.lang.Long units, java.lang.Long unitPrice,
		java.lang.Long totalAmount, java.lang.Long totalInUse,
		java.lang.Long totalNotUsed, java.lang.Long sum1, java.lang.Long sum2,
		java.lang.Long sum3, java.lang.String remark, java.lang.Long isApproval)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.updateInputStambook(id, mtCore,
			inputSheetId, corporationId, inputSheetType, vehicleClass,
			stampType, stampShortNo, serialStartNo, serialEndNo,
			subTotalInDocument, subTotalQuantities, units, unitPrice,
			totalAmount, totalInUse, totalNotUsed, sum1, sum2, sum3, remark,
			isApproval);
	}

	/**
	* Updates the vr input stampbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRInputStampbook updateVRInputStampbook(
		com.fds.vr.business.model.VRInputStampbook vrInputStampbook) {
		return _vrInputStampbookLocalService.updateVRInputStampbook(vrInputStampbook);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrInputStampbookLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrInputStampbookLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrInputStampbookLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputStampbookLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr input stampbooks.
	*
	* @return the number of vr input stampbooks
	*/
	@Override
	public int getVRInputStampbooksCount() {
		return _vrInputStampbookLocalService.getVRInputStampbooksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrInputStampbookLocalService.getOSGiServiceIdentifier();
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
		return _vrInputStampbookLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInputStampbookLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrInputStampbookLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> findByInputSheetId(
		long mtCore, long inputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.findByInputSheetId(mtCore,
			inputSheetId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.findByInputSheetIdAndBookId(mtCore,
			inputSheetId, bookId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> findBySum3GreaterThan()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.findBySum3GreaterThan();
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> findByVRInputStampBookInventorys(
		java.lang.String vehicleClass, java.lang.String stampType, int start,
		int end) {
		return _vrInputStampbookLocalService.findByVRInputStampBookInventorys(vehicleClass,
			stampType, start, end);
	}

	/**
	* Returns a range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of vr input stampbooks
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRInputStampbook> getVRInputStampbooks(
		int start, int end) {
		return _vrInputStampbookLocalService.getVRInputStampbooks(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.counData(sql);
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
		return _vrInputStampbookLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrInputStampbookLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public long updateJSONArrayInputStambook(long inputSheetId,
		java.lang.Long corporationId, java.lang.Long inputSheetType,
		java.lang.String stampbooks, java.lang.Long isApproval)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputStampbookLocalService.updateJSONArrayInputStambook(inputSheetId,
			corporationId, inputSheetType, stampbooks, isApproval);
	}

	@Override
	public VRInputStampbookLocalService getWrappedService() {
		return _vrInputStampbookLocalService;
	}

	@Override
	public void setWrappedService(
		VRInputStampbookLocalService vrInputStampbookLocalService) {
		_vrInputStampbookLocalService = vrInputStampbookLocalService;
	}

	private VRInputStampbookLocalService _vrInputStampbookLocalService;
}