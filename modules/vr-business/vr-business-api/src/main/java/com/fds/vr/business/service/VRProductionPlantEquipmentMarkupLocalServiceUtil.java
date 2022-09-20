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
 * Provides the local service utility for VRProductionPlantEquipmentMarkup. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRProductionPlantEquipmentMarkupLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRProductionPlantEquipmentMarkupLocalService
 * @see com.fds.vr.business.service.base.VRProductionPlantEquipmentMarkupLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRProductionPlantEquipmentMarkupLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRProductionPlantEquipmentMarkupLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRProductionPlantEquipmentMarkupLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr production plant equipment markup to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	* @return the vr production plant equipment markup that was added
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup addVRProductionPlantEquipmentMarkup(
		com.fds.vr.business.model.VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		return getService()
				   .addVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup);
	}

	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup createVRProductionPlantEquipmentMarkup(
		com.fds.vr.business.model.VRProductionPlantEquipmentMarkup object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createVRProductionPlantEquipmentMarkup(object);
	}

	/**
	* Creates a new vr production plant equipment markup with the primary key. Does not add the vr production plant equipment markup to the database.
	*
	* @param id the primary key for the new vr production plant equipment markup
	* @return the new vr production plant equipment markup
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup createVRProductionPlantEquipmentMarkup(
		long id) {
		return getService().createVRProductionPlantEquipmentMarkup(id);
	}

	/**
	* Deletes the vr production plant equipment markup from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	* @return the vr production plant equipment markup that was removed
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup deleteVRProductionPlantEquipmentMarkup(
		com.fds.vr.business.model.VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup) {
		return getService()
				   .deleteVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup);
	}

	/**
	* Deletes the vr production plant equipment markup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup that was removed
	* @throws PortalException if a vr production plant equipment markup with the primary key could not be found
	* @throws NoSuchVRProductionPlantEquipmentMarkupException
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup deleteVRProductionPlantEquipmentMarkup(
		long id)
		throws com.fds.vr.business.exception.NoSuchVRProductionPlantEquipmentMarkupException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRProductionPlantEquipmentMarkup(id);
	}

	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup fetchVRProductionPlantEquipmentMarkup(
		long id) {
		return getService().fetchVRProductionPlantEquipmentMarkup(id);
	}

	/**
	* Returns the vr production plant equipment markup with the primary key.
	*
	* @param id the primary key of the vr production plant equipment markup
	* @return the vr production plant equipment markup
	* @throws PortalException if a vr production plant equipment markup with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup getVRProductionPlantEquipmentMarkup(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRProductionPlantEquipmentMarkup(id);
	}

	/**
	* Updates the vr production plant equipment markup in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlantEquipmentMarkup the vr production plant equipment markup
	* @return the vr production plant equipment markup that was updated
	* @throws SystemException
	*/
	public static com.fds.vr.business.model.VRProductionPlantEquipmentMarkup updateVRProductionPlantEquipmentMarkup(
		com.fds.vr.business.model.VRProductionPlantEquipmentMarkup vrProductionPlantEquipmentMarkup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateVRProductionPlantEquipmentMarkup(vrProductionPlantEquipmentMarkup);
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
	* Returns the number of vr production plant equipment markups.
	*
	* @return the number of vr production plant equipment markups
	*/
	public static int getVRProductionPlantEquipmentMarkupsCount() {
		return getService().getVRProductionPlantEquipmentMarkupsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRProductionPlantEquipmentMarkup> findByproductionPlantEquipmentId(
		long productionPlantEquipmentId) {
		return getService()
				   .findByproductionPlantEquipmentId(productionPlantEquipmentId);
	}

	/**
	* Returns a range of all the vr production plant equipment markups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantEquipmentMarkupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plant equipment markups
	* @param end the upper bound of the range of vr production plant equipment markups (not inclusive)
	* @return the range of vr production plant equipment markups
	*/
	public static java.util.List<com.fds.vr.business.model.VRProductionPlantEquipmentMarkup> getVRProductionPlantEquipmentMarkups(
		int start, int end) {
		return getService().getVRProductionPlantEquipmentMarkups(start, end);
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

	public static VRProductionPlantEquipmentMarkupLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductionPlantEquipmentMarkupLocalService, VRProductionPlantEquipmentMarkupLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRProductionPlantEquipmentMarkupLocalService.class);
}