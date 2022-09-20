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
 * Provides the local service utility for VRCOPProdEquipment. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRCOPProdEquipmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRCOPProdEquipmentLocalService
 * @see com.fds.vr.business.service.base.VRCOPProdEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCOPProdEquipmentLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCOPProdEquipmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCOPProdEquipmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vrcop prod equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was added
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment addVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return getService().addVRCOPProdEquipment(vrcopProdEquipment);
	}

	/**
	* Creates a new vrcop prod equipment with the primary key. Does not add the vrcop prod equipment to the database.
	*
	* @param id the primary key for the new vrcop prod equipment
	* @return the new vrcop prod equipment
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment createVRCOPProdEquipment(
		long id) {
		return getService().createVRCOPProdEquipment(id);
	}

	/**
	* Deletes the vrcop prod equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was removed
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment deleteVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return getService().deleteVRCOPProdEquipment(vrcopProdEquipment);
	}

	/**
	* Deletes the vrcop prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment that was removed
	* @throws PortalException if a vrcop prod equipment with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment deleteVRCOPProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCOPProdEquipment(id);
	}

	public static com.fds.vr.business.model.VRCOPProdEquipment fetchVRCOPProdEquipment(
		long id) {
		return getService().fetchVRCOPProdEquipment(id);
	}

	/**
	* Returns the vrcop prod equipment with the primary key.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment
	* @throws PortalException if a vrcop prod equipment with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment getVRCOPProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCOPProdEquipment(id);
	}

	public static com.fds.vr.business.model.VRCOPProdEquipment updateCOPProdEquipment(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return getService().updateCOPProdEquipment(mapValues, mtCore);
	}

	/**
	* Updates the vrcop prod equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	* @return the vrcop prod equipment that was updated
	*/
	public static com.fds.vr.business.model.VRCOPProdEquipment updateVRCOPProdEquipment(
		com.fds.vr.business.model.VRCOPProdEquipment vrcopProdEquipment) {
		return getService().updateVRCOPProdEquipment(vrcopProdEquipment);
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

	public static com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long mtCore,
		long vrcopReportRepositoryId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo) {
		return getService()
				   .adminProcessData(arrayData, mtCore,
			vrcopReportRepositoryId, dossierId, dossierIdCTN, dossierNo);
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

	public static com.liferay.portal.kernel.json.JSONArray getByCOPReportNo(
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
	* Returns the number of vrcop prod equipments.
	*
	* @return the number of vrcop prod equipments
	*/
	public static int getVRCOPProdEquipmentsCount() {
		return getService().getVRCOPProdEquipmentsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findBycopReportNo_MtCore(
		long mtCore, java.lang.String copReportNo, int start, int end) {
		return getService()
				   .findBycopReportNo_MtCore(mtCore, copReportNo, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> findBycopReportRepositoryID_MtCore(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return getService()
				   .findBycopReportRepositoryID_MtCore(mtCore,
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
	public static java.util.List<com.fds.vr.business.model.VRCOPProdEquipment> getVRCOPProdEquipments(
		int start, int end) {
		return getService().getVRCOPProdEquipments(start, end);
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

	public static VRCOPProdEquipmentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProdEquipmentLocalService, VRCOPProdEquipmentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProdEquipmentLocalService.class);
}