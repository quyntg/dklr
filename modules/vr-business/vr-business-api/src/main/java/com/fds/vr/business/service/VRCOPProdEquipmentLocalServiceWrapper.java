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
 * Provides a wrapper for {@link VRCOPProdEquipmentLocalService}.
 *
 * @author LamTV
 * @see VRCOPProdEquipmentLocalService
 * @generated
 */
@ProviderType
public class VRCOPProdEquipmentLocalServiceWrapper
	implements VRCOPProdEquipmentLocalService,
		ServiceWrapper<VRCOPProdEquipmentLocalService> {
	public VRCOPProdEquipmentLocalServiceWrapper(
		VRCOPProdEquipmentLocalService vrcopProdEquipmentLocalService) {
		_vrcopProdEquipmentLocalService = vrcopProdEquipmentLocalService;
	}

	/**
	* Adds the vrcop prod equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was added
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment addVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return _vrcopProdEquipmentLocalService.addVRCOPProdEquipment(vrcopProdEquipment);
	}

	/**
	* Creates a new vrcop prod equipment with the primary key. Does not add the vrcop prod equipment to the database.
	*
	* @param id the primary key for the new vrcop prod equipment
	* @return the new vrcop prod equipment
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment createVRCOPProdEquipment(
		long id) {
		return _vrcopProdEquipmentLocalService.createVRCOPProdEquipment(id);
	}

	/**
	* Deletes the vrcop prod equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment deleteVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return _vrcopProdEquipmentLocalService.deleteVRCOPProdEquipment(vrcopProdEquipment);
	}

	/**
	* Deletes the vrcop prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment that was removed
	* @throws PortalException if a vrcop prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment deleteVRCOPProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProdEquipmentLocalService.deleteVRCOPProdEquipment(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment fetchVRCOPProdEquipment(
		long id) {
		return _vrcopProdEquipmentLocalService.fetchVRCOPProdEquipment(id);
	}

	/**
	* Returns the vrcop prod equipment with the primary key.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment
	* @throws PortalException if a vrcop prod equipment with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment getVRCOPProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProdEquipmentLocalService.getVRCOPProdEquipment(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment updateCOPProdEquipment(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return _vrcopProdEquipmentLocalService.updateCOPProdEquipment(mapValues,
			mtCore);
	}

	/**
	* Updates the vrcop prod equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProdEquipment updateVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return _vrcopProdEquipmentLocalService.updateVRCOPProdEquipment(vrcopProdEquipment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrcopProdEquipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrcopProdEquipmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrcopProdEquipmentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long mtCore,
		long vrcopReportRepositoryId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo) {
		return _vrcopProdEquipmentLocalService.adminProcessData(arrayData,
			mtCore, vrcopReportRepositoryId, dossierId, dossierIdCTN, dossierNo);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrcopProdEquipmentLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getByCOPReportNo(
		long mtCore, java.lang.String COPReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopProdEquipmentLocalService.getByCOPReportNo(mtCore,
			COPReportNo);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProdEquipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProdEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop prod equipments.
	*
	* @return the number of vrcop prod equipments
	*/
	@Override
	public int getVRCOPProdEquipmentsCount() {
		return _vrcopProdEquipmentLocalService.getVRCOPProdEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrcopProdEquipmentLocalService.getOSGiServiceIdentifier();
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
		return _vrcopProdEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProdEquipmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findBycopReportNo_MtCore(
		long mtCore, java.lang.String copReportNo, int start, int end) {
		return _vrcopProdEquipmentLocalService.findBycopReportNo_MtCore(mtCore,
			copReportNo, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findBycopReportRepositoryID_MtCore(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return _vrcopProdEquipmentLocalService.findBycopReportRepositoryID_MtCore(mtCore,
			copReportRepositoryID, start, end);
	}

	/**
	* Returns a range of all the vrcop prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of vrcop prod equipments
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> getVRCOPProdEquipments(
		int start, int end) {
		return _vrcopProdEquipmentLocalService.getVRCOPProdEquipments(start, end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrcopProdEquipmentLocalService.counData(sql);
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
		return _vrcopProdEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrcopProdEquipmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPProdEquipmentLocalService getWrappedService() {
		return _vrcopProdEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		VRCOPProdEquipmentLocalService vrcopProdEquipmentLocalService) {
		_vrcopProdEquipmentLocalService = vrcopProdEquipmentLocalService;
	}

	private VRCOPProdEquipmentLocalService _vrcopProdEquipmentLocalService;
}