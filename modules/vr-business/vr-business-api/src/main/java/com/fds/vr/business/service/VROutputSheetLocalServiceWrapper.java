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
 * Provides a wrapper for {@link VROutputSheetLocalService}.
 *
 * @author LamTV
 * @see VROutputSheetLocalService
 * @generated
 */
@ProviderType
public class VROutputSheetLocalServiceWrapper
	implements VROutputSheetLocalService,
		ServiceWrapper<VROutputSheetLocalService> {
	public VROutputSheetLocalServiceWrapper(
		VROutputSheetLocalService vrOutputSheetLocalService) {
		_vrOutputSheetLocalService = vrOutputSheetLocalService;
	}

	/**
	* Adds the vr output sheet to the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was added
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet addVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return _vrOutputSheetLocalService.addVROutputSheet(vrOutputSheet);
	}

	@Override
	public com.fds.vr.business.model.VROutputSheet createVROutputSheet(
		com.fds.vr.business.model.VROutputSheet object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.createVROutputSheet(object);
	}

	/**
	* Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	*
	* @param id the primary key for the new vr output sheet
	* @return the new vr output sheet
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet createVROutputSheet(long id) {
		return _vrOutputSheetLocalService.createVROutputSheet(id);
	}

	/**
	* Deletes the vr output sheet from the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was removed
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet deleteVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return _vrOutputSheetLocalService.deleteVROutputSheet(vrOutputSheet);
	}

	/**
	* Deletes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet that was removed
	* @throws PortalException if a vr output sheet with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet deleteVROutputSheet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetLocalService.deleteVROutputSheet(id);
	}

	@Override
	public com.fds.vr.business.model.VROutputSheet fetchVROutputSheet(long id) {
		return _vrOutputSheetLocalService.fetchVROutputSheet(id);
	}

	/**
	* Returns the vr output sheet with the primary key.
	*
	* @param id the primary key of the vr output sheet
	* @return the vr output sheet
	* @throws PortalException if a vr output sheet with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet getVROutputSheet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetLocalService.getVROutputSheet(id);
	}

	@Override
	public com.fds.vr.business.model.VROutputSheet updateOutputSheet(long id,
		long mtCore, java.lang.String outputSheetNo,
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
		return _vrOutputSheetLocalService.updateOutputSheet(id, mtCore,
			outputSheetNo, outputSheetDate, originalDocumentNo,
			supplierCorporationId, outputSheetType, maker, checker, approver,
			receiverName, receiverPlace, receiverRequest, inventoryName,
			inventoryPlace, inventoryDate, dossierId, issueId, purchaserId,
			purchaserCorporationId, bookIDList, isApproval, totalQuantities,
			totalAmount, amountInWords, remark, details, company);
	}

	@Override
	public com.fds.vr.business.model.VROutputSheet updateVROutputSheet(
		com.fds.vr.business.model.VROutputSheet object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.updateVROutputSheet(object, company);
	}

	/**
	* Updates the vr output sheet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheet the vr output sheet
	* @return the vr output sheet that was updated
	*/
	@Override
	public com.fds.vr.business.model.VROutputSheet updateVROutputSheet(
		com.fds.vr.business.model.VROutputSheet vrOutputSheet) {
		return _vrOutputSheetLocalService.updateVROutputSheet(vrOutputSheet);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrOutputSheetLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrOutputSheetLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrOutputSheetLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findData(sql, columnNames, dataTypes,
			modelClazz, modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrOutputSheetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr output sheets.
	*
	* @return the number of vr output sheets
	*/
	@Override
	public int getVROutputSheetsCount() {
		return _vrOutputSheetLocalService.getVROutputSheetsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrOutputSheetLocalService.getOSGiServiceIdentifier();
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
		return _vrOutputSheetLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrOutputSheetLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrOutputSheetLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findBydossierId(mtCore, dossierId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> findByinputSheetNo(
		long mtCore, java.lang.String outputSheetNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findByinputSheetNo(mtCore,
			outputSheetNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> findByoutputSheetType(
		long mtCore, long outputSheetType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findByoutputSheetType(mtCore,
			outputSheetType);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> findBypurchaserCorporationId(
		long mtCore, long purchaserCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findBypurchaserCorporationId(mtCore,
			purchaserCorporationId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> findBysupplierCorporationId(
		long mtCore, long supplierCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.findBysupplierCorporationId(mtCore,
			supplierCorporationId);
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
	@Override
	public java.util.List<com.fds.vr.business.model.VROutputSheet> getVROutputSheets(
		int start, int end) {
		return _vrOutputSheetLocalService.getVROutputSheets(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrOutputSheetLocalService.counData(sql);
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
		return _vrOutputSheetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrOutputSheetLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VROutputSheetLocalService getWrappedService() {
		return _vrOutputSheetLocalService;
	}

	@Override
	public void setWrappedService(
		VROutputSheetLocalService vrOutputSheetLocalService) {
		_vrOutputSheetLocalService = vrOutputSheetLocalService;
	}

	private VROutputSheetLocalService _vrOutputSheetLocalService;
}