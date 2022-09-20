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
 * Provides the local service utility for VRProductionPlant. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRProductionPlantLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRProductionPlantLocalService
 * @see com.fds.vr.business.service.base.VRProductionPlantLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRProductionPlantLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRProductionPlantLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr production plant to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was added
	*/
	public static com.fds.vr.business.model.VRProductionPlant addVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant) {
		return getService().addVRProductionPlant(vrProductionPlant);
	}

	public static com.fds.vr.business.model.VRProductionPlant adminProcessData(
		com.liferay.portal.kernel.json.JSONObject objectData, long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode) {
		return getService()
				   .adminProcessData(objectData, mtCore, applicantProfileId,
			productionPlantCode);
	}

	public static com.fds.vr.business.model.VRProductionPlant createVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createVRProductionPlant(object);
	}

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public static com.fds.vr.business.model.VRProductionPlant createVRProductionPlant(
		long id) {
		return getService().createVRProductionPlant(id);
	}

	/**
	* Deletes the vr production plant from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was removed
	*/
	public static com.fds.vr.business.model.VRProductionPlant deleteVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant) {
		return getService().deleteVRProductionPlant(vrProductionPlant);
	}

	/**
	* Deletes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRProductionPlant deleteVRProductionPlant(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRProductionPlant(id);
	}

	public static com.fds.vr.business.model.VRProductionPlant fetchVRProductionPlant(
		long id) {
		return getService().fetchVRProductionPlant(id);
	}

	public static com.fds.vr.business.model.VRProductionPlant findByF_MT_APP_FORM_ID(
		long mtCore, long applicantProfileId, long registrationFormId) {
		return getService()
				   .findByF_MT_APP_FORM_ID(mtCore, applicantProfileId,
			registrationFormId);
	}

	public static com.fds.vr.business.model.VRProductionPlant findByproductionPlantCode(
		java.lang.String productionPlantCode) {
		return getService().findByproductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr production plant with the primary key.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRProductionPlant getVRProductionPlant(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRProductionPlant(id);
	}

	public static com.fds.vr.business.model.VRProductionPlant updateProductionPlant(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues) {
		return getService().updateProductionPlant(mapValues);
	}

	/**
	* Updates the vr production plant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was updated
	* @throws SystemException
	*/
	public static com.fds.vr.business.model.VRProductionPlant updateVRProductionPlant(
		com.fds.vr.business.model.VRProductionPlant vrProductionPlant)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVRProductionPlant(vrProductionPlant);
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
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	public static int getVRProductionPlantsCount() {
		return getService().getVRProductionPlantsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByApplicantId(
		long applicantProfileId, int start, int end) {
		return getService().findByApplicantId(applicantProfileId, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByRegistrationFormId(
		long mtCore, long applicantProfileId, long registrationId) {
		return getService()
				   .findByRegistrationFormId(mtCore, applicantProfileId,
			registrationId);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findBymappingMA_XUONG_LR(
		long mtCore, java.lang.String mappingMA_CTY,
		java.lang.String mappingMA_XUONG_LR) {
		return getService()
				   .findBymappingMA_XUONG_LR(mtCore, mappingMA_CTY,
			mappingMA_XUONG_LR);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findBymappingStatus(
		long mtCore, java.lang.String mappingStatus) {
		return getService().findBymappingStatus(mtCore, mappingStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode) {
		return getService()
				   .findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName) {
		return getService()
				   .findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress) {
		return getService()
				   .findByproductionPlantName_PPAddress(mtCore,
			applicantProfileId, productionPlantName, productionPlantAddress);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress) {
		return getService()
				   .findByproductionPlantRep_PPAddress(mtCore,
			applicantProfileId, productionPlantRepresentative,
			productionPlantAddress);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantStatus(
		long mtCore, java.lang.String productionPlantStatus) {
		return getService()
				   .findByproductionPlantStatus(mtCore, productionPlantStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus) {
		return getService()
				   .findByproductionPlantStatus_PPAddress(mtCore,
			applicantProfileId, productionPlantAddress, productionPlantStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus) {
		return getService()
				   .findByproductionPlantStatus_PPCode(mtCore,
			applicantProfileId, productionPlantCode, productionPlantStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus) {
		return getService()
				   .findByproductionPlantStatus_PPName(mtCore,
			applicantProfileId, productionPlantName, productionPlantStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> findByproductionPlantType(
		long mtCore, java.lang.String productionPlantType) {
		return getService()
				   .findByproductionPlantType(mtCore, productionPlantType);
	}

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	public static java.util.List<com.fds.vr.business.model.VRProductionPlant> getVRProductionPlants(
		int start, int end) {
		return getService().getVRProductionPlants(start, end);
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

	public static VRProductionPlantLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantLocalService, VRProductionPlantLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantLocalService.class);
}