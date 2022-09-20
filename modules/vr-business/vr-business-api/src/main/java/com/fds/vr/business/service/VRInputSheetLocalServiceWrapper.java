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
 * Provides a wrapper for {@link VRInputSheetLocalService}.
 *
 * @author LamTV
 * @see VRInputSheetLocalService
 * @generated
 */
@ProviderType
public class VRInputSheetLocalServiceWrapper implements VRInputSheetLocalService,
	ServiceWrapper<VRInputSheetLocalService> {
	public VRInputSheetLocalServiceWrapper(
		VRInputSheetLocalService vrInputSheetLocalService) {
		_vrInputSheetLocalService = vrInputSheetLocalService;
	}

	/**
	* Adds the vr input sheet to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was added
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet addVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return _vrInputSheetLocalService.addVRInputSheet(vrInputSheet);
	}

	/**
	* Creates a new vr input sheet with the primary key. Does not add the vr input sheet to the database.
	*
	* @param id the primary key for the new vr input sheet
	* @return the new vr input sheet
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet createVRInputSheet(long id) {
		return _vrInputSheetLocalService.createVRInputSheet(id);
	}

	/**
	* Deletes the vr input sheet from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet deleteVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return _vrInputSheetLocalService.deleteVRInputSheet(vrInputSheet);
	}

	/**
	* Deletes the vr input sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet that was removed
	* @throws PortalException if a vr input sheet with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet deleteVRInputSheet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputSheetLocalService.deleteVRInputSheet(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputSheet fetchVRInputSheet(long id) {
		return _vrInputSheetLocalService.fetchVRInputSheet(id);
	}

	/**
	* Returns the vr input sheet with the primary key.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet
	* @throws PortalException if a vr input sheet with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet getVRInputSheet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputSheetLocalService.getVRInputSheet(id);
	}

	@Override
	public com.fds.vr.business.model.VRInputSheet updateInputSheet(long id,
		long mtCore, java.lang.String inputSheetNo,
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
		return _vrInputSheetLocalService.updateInputSheet(id, mtCore,
			inputSheetNo, inputSheetDate, originalDocumentNo, corporationId,
			inputSheetType, maker, checker, approver, deliveryName,
			inventoryName, inventoryPlace, inventoryDate, bookIDList,
			isApproval, totalQuantities, totalAmount, amountInWords, remark,
			stampbooks, company);
	}

	/**
	* Updates the vr input sheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInputSheet the vr input sheet
	* @return the vr input sheet that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRInputSheet updateVRInputSheet(
		com.fds.vr.business.model.VRInputSheet vrInputSheet) {
		return _vrInputSheetLocalService.updateVRInputSheet(vrInputSheet);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrInputSheetLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrInputSheetLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrInputSheetLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputSheetLocalService.findData(sql, columnNames, dataTypes,
			modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputSheetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrInputSheetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr input sheets.
	*
	* @return the number of vr input sheets
	*/
	@Override
	public int getVRInputSheetsCount() {
		return _vrInputSheetLocalService.getVRInputSheetsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrInputSheetLocalService.getOSGiServiceIdentifier();
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
		return _vrInputSheetLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrInputSheetLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrInputSheetLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputSheet> findBycorporationId(
		long mtCore, long corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputSheetLocalService.findBycorporationId(mtCore,
			corporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputSheet> findByinputSheetNo(
		long mtCore, java.lang.String inputSheetNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputSheetLocalService.findByinputSheetNo(mtCore, inputSheetNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRInputSheet> findByinputSheetType(
		long mtCore, long inputSheetType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrInputSheetLocalService.findByinputSheetType(mtCore,
			inputSheetType);
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
	@Override
	public java.util.List<com.fds.vr.business.model.VRInputSheet> getVRInputSheets(
		int start, int end) {
		return _vrInputSheetLocalService.getVRInputSheets(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrInputSheetLocalService.counData(sql);
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
		return _vrInputSheetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrInputSheetLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRInputSheetLocalService getWrappedService() {
		return _vrInputSheetLocalService;
	}

	@Override
	public void setWrappedService(
		VRInputSheetLocalService vrInputSheetLocalService) {
		_vrInputSheetLocalService = vrInputSheetLocalService;
	}

	private VRInputSheetLocalService _vrInputSheetLocalService;
}