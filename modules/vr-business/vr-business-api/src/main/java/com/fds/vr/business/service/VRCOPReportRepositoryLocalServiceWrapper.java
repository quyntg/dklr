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
 * Provides a wrapper for {@link VRCOPReportRepositoryLocalService}.
 *
 * @author LamTV
 * @see VRCOPReportRepositoryLocalService
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryLocalServiceWrapper
	implements VRCOPReportRepositoryLocalService,
		ServiceWrapper<VRCOPReportRepositoryLocalService> {
	public VRCOPReportRepositoryLocalServiceWrapper(
		VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService) {
		_vrcopReportRepositoryLocalService = vrcopReportRepositoryLocalService;
	}

	/**
	* Adds the vrcop report repository to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was added
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository addVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return _vrcopReportRepositoryLocalService.addVRCOPReportRepository(vrcopReportRepository);
	}

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository createVRCOPReportRepository(
		long id) {
		return _vrcopReportRepositoryLocalService.createVRCOPReportRepository(id);
	}

	/**
	* Deletes the vrcop report repository from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository deleteVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return _vrcopReportRepositoryLocalService.deleteVRCOPReportRepository(vrcopReportRepository);
	}

	/**
	* Deletes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository deleteVRCOPReportRepository(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopReportRepositoryLocalService.deleteVRCOPReportRepository(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPReportRepository fetchVRCOPReportRepository(
		long id) {
		return _vrcopReportRepositoryLocalService.fetchVRCOPReportRepository(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPReportRepository findByDossierId_MTCore(
		long dossierId, long mtCore) {
		return _vrcopReportRepositoryLocalService.findByDossierId_MTCore(dossierId,
			mtCore);
	}

	@Override
	public com.fds.vr.business.model.VRCOPReportRepository findBycopReportNo(
		long mtCore, java.lang.String copReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findBycopReportNo(mtCore,
			copReportNo);
	}

	/**
	* Returns the vrcop report repository with the primary key.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository getVRCOPReportRepository(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopReportRepositoryLocalService.getVRCOPReportRepository(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPReportRepository updateCOPReportRepository(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return _vrcopReportRepositoryLocalService.updateCOPReportRepository(mapValues,
			mtCore);
	}

	/**
	* Updates the vrcop report repository in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRCOPReportRepository updateVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return _vrcopReportRepositoryLocalService.updateVRCOPReportRepository(vrcopReportRepository);
	}

	@Override
	public com.fds.vr.business.model.VRCOPReportRepository updateVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository,
		com.liferay.portal.kernel.model.Company company) {
		return _vrcopReportRepositoryLocalService.updateVRCOPReportRepository(vrcopReportRepository,
			company);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrcopReportRepositoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrcopReportRepositoryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrcopReportRepositoryLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findData(sql, columnNames,
			dataTypes, modelClazz, modelClassName, start, end);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductionPlantEmployee,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductionPlantEquipment,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProdEquipment,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductType,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPReportAttach) {
		return _vrcopReportRepositoryLocalService.adminProcessData(objectData,
			arrayVRCOPProductionPlantEmployee,
			arrayVRCOPProductionPlantEquipment, arrayVRCOPProdEquipment,
			arrayVRCOPProductType, arrayVRCOPReportAttach);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getByCOPReportNo(
		long mtCore, java.lang.String COPReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.getByCOPReportNo(mtCore,
			COPReportNo);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopReportRepositoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopReportRepositoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	@Override
	public int getVRCOPReportRepositoriesCount() {
		return _vrcopReportRepositoryLocalService.getVRCOPReportRepositoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrcopReportRepositoryLocalService.getOSGiServiceIdentifier();
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
		return _vrcopReportRepositoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopReportRepositoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopReportRepositoryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByMtCore_ProductionPlantCode_COPClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end) {
		return _vrcopReportRepositoryLocalService.findByMtCore_ProductionPlantCode_COPClassification(mtCore,
			productionPlantCode, copClassification, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findByapplicantProfileId(mtCore,
			applicantProfileId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findBycopReportStatus(mtCore,
			copReportStatus);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findByproductionPlantCode(mtCore,
			applicantProfileId, productionPlantCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.findByproductionPlantName(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findVRCOPProdEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return _vrcopReportRepositoryLocalService.findVRCOPProdEquipmentsByDossierId(dossierId,
			mtCore, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductType> findVRCOPProductTypesByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return _vrcopReportRepositoryLocalService.findVRCOPProductTypesByDossierId(dossierId,
			mtCore, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEmployee> findVRCOPProductionPlantEmployeesByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return _vrcopReportRepositoryLocalService.findVRCOPProductionPlantEmployeesByDossierId(dossierId,
			mtCore, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEquipment> findVRCOPProductionPlantEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return _vrcopReportRepositoryLocalService.findVRCOPProductionPlantEquipmentsByDossierId(dossierId,
			mtCore, start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportAttach> findVRCOPReportAttachsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return _vrcopReportRepositoryLocalService.findVRCOPReportAttachsByDossierId(dossierId,
			mtCore, start, end);
	}

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPReportRepository> getVRCOPReportRepositories(
		int start, int end) {
		return _vrcopReportRepositoryLocalService.getVRCOPReportRepositories(start,
			end);
	}

	@Override
	public long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrcopReportRepositoryLocalService.counData(sql);
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
		return _vrcopReportRepositoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrcopReportRepositoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPReportRepositoryLocalService getWrappedService() {
		return _vrcopReportRepositoryLocalService;
	}

	@Override
	public void setWrappedService(
		VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService) {
		_vrcopReportRepositoryLocalService = vrcopReportRepositoryLocalService;
	}

	private VRCOPReportRepositoryLocalService _vrcopReportRepositoryLocalService;
}