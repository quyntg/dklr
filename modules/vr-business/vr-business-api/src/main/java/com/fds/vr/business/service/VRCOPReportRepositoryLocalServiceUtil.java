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
 * Provides the local service utility for VRCOPReportRepository. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRCOPReportRepositoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRCOPReportRepositoryLocalService
 * @see com.fds.vr.business.service.base.VRCOPReportRepositoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCOPReportRepositoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCOPReportRepositoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vrcop report repository to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was added
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository addVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return getService().addVRCOPReportRepository(vrcopReportRepository);
	}

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository createVRCOPReportRepository(
		long id) {
		return getService().createVRCOPReportRepository(id);
	}

	/**
	* Deletes the vrcop report repository from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was removed
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository deleteVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return getService().deleteVRCOPReportRepository(vrcopReportRepository);
	}

	/**
	* Deletes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository deleteVRCOPReportRepository(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCOPReportRepository(id);
	}

	public static com.fds.vr.business.model.VRCOPReportRepository fetchVRCOPReportRepository(
		long id) {
		return getService().fetchVRCOPReportRepository(id);
	}

	public static com.fds.vr.business.model.VRCOPReportRepository findByDossierId_MTCore(
		long dossierId, long mtCore) {
		return getService().findByDossierId_MTCore(dossierId, mtCore);
	}

	public static com.fds.vr.business.model.VRCOPReportRepository findBycopReportNo(
		long mtCore, java.lang.String copReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the vrcop report repository with the primary key.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository getVRCOPReportRepository(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCOPReportRepository(id);
	}

	public static com.fds.vr.business.model.VRCOPReportRepository updateCOPReportRepository(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return getService().updateCOPReportRepository(mapValues, mtCore);
	}

	/**
	* Updates the vrcop report repository in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was updated
	*/
	public static com.fds.vr.business.model.VRCOPReportRepository updateVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository) {
		return getService().updateVRCOPReportRepository(vrcopReportRepository);
	}

	public static com.fds.vr.business.model.VRCOPReportRepository updateVRCOPReportRepository(
		com.fds.vr.business.model.VRCOPReportRepository vrcopReportRepository,
		com.liferay.portal.kernel.model.Company company) {
		return getService()
				   .updateVRCOPReportRepository(vrcopReportRepository, company);
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

	public static com.liferay.portal.kernel.json.JSONObject adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductionPlantEmployee,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductionPlantEquipment,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProdEquipment,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPProductType,
		com.liferay.portal.kernel.json.JSONArray arrayVRCOPReportAttach) {
		return getService()
				   .adminProcessData(objectData,
			arrayVRCOPProductionPlantEmployee,
			arrayVRCOPProductionPlantEquipment, arrayVRCOPProdEquipment,
			arrayVRCOPProductType, arrayVRCOPReportAttach);
	}

	public static com.liferay.portal.kernel.json.JSONObject getByCOPReportNo(
		long mtCore, java.lang.String COPReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCOPReportNo(mtCore, COPReportNo);
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
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	public static int getVRCOPReportRepositoriesCount() {
		return getService().getVRCOPReportRepositoriesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByMtCore_ProductionPlantCode_COPClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end) {
		return getService()
				   .findByMtCore_ProductionPlantCode_COPClassification(mtCore,
			productionPlantCode, copClassification, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByapplicantProfileId(
		long mtCore, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByapplicantProfileId(mtCore, applicantProfileId);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findBycopReportStatus(
		long mtCore, java.lang.String copReportStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycopReportStatus(mtCore, copReportStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findVRCOPProdEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return getService()
				   .findVRCOPProdEquipmentsByDossierId(dossierId, mtCore,
			start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProductType> findVRCOPProductTypesByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return getService()
				   .findVRCOPProductTypesByDossierId(dossierId, mtCore, start,
			end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEmployee> findVRCOPProductionPlantEmployeesByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return getService()
				   .findVRCOPProductionPlantEmployeesByDossierId(dossierId,
			mtCore, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEquipment> findVRCOPProductionPlantEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return getService()
				   .findVRCOPProductionPlantEquipmentsByDossierId(dossierId,
			mtCore, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPReportAttach> findVRCOPReportAttachsByDossierId(
		long dossierId, long mtCore, int start, int end) {
		return getService()
				   .findVRCOPReportAttachsByDossierId(dossierId, mtCore, start,
			end);
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
	public static java.util.List<com.fds.vr.business.model.VRCOPReportRepository> getVRCOPReportRepositories(
		int start, int end) {
		return getService().getVRCOPReportRepositories(start, end);
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

	public static VRCOPReportRepositoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPReportRepositoryLocalService, VRCOPReportRepositoryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPReportRepositoryLocalService.class);
}