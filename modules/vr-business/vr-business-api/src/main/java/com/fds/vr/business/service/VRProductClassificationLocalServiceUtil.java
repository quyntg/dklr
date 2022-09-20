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
 * Provides the local service utility for VRProductClassification. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRProductClassificationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRProductClassificationLocalService
 * @see com.fds.vr.business.service.base.VRProductClassificationLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRProductClassificationLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRProductClassificationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRProductClassificationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr product classification to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductClassification the vr product classification
	* @return the vr product classification that was added
	*/
	public static com.fds.vr.business.model.VRProductClassification addVRProductClassification(
		com.fds.vr.business.model.VRProductClassification vrProductClassification) {
		return getService().addVRProductClassification(vrProductClassification);
	}

	/**
	* Creates a new vr product classification with the primary key. Does not add the vr product classification to the database.
	*
	* @param id the primary key for the new vr product classification
	* @return the new vr product classification
	*/
	public static com.fds.vr.business.model.VRProductClassification createVRProductClassification(
		long id) {
		return getService().createVRProductClassification(id);
	}

	/**
	* Deletes the vr product classification from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductClassification the vr product classification
	* @return the vr product classification that was removed
	*/
	public static com.fds.vr.business.model.VRProductClassification deleteVRProductClassification(
		com.fds.vr.business.model.VRProductClassification vrProductClassification) {
		return getService()
				   .deleteVRProductClassification(vrProductClassification);
	}

	/**
	* Deletes the vr product classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr product classification
	* @return the vr product classification that was removed
	* @throws PortalException if a vr product classification with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRProductClassification deleteVRProductClassification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRProductClassification(id);
	}

	public static com.fds.vr.business.model.VRProductClassification fetchVRProductClassification(
		long id) {
		return getService().fetchVRProductClassification(id);
	}

	/**
	* Returns the vr product classification with the primary key.
	*
	* @param id the primary key of the vr product classification
	* @return the vr product classification
	* @throws PortalException if a vr product classification with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRProductClassification getVRProductClassification(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRProductClassification(id);
	}

	/**
	* Updates the vr product classification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductClassification the vr product classification
	* @return the vr product classification that was updated
	*/
	public static com.fds.vr.business.model.VRProductClassification updateVRProductClassification(
		com.fds.vr.business.model.VRProductClassification vrProductClassification) {
		return getService()
				   .updateVRProductClassification(vrProductClassification);
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
	* Returns the number of vr product classifications.
	*
	* @return the number of vr product classifications
	*/
	public static int getVRProductClassificationsCount() {
		return getService().getVRProductClassificationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRProductClassification> findByproductPlantID(
		long mtCore, long productPlantID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByproductPlantID(mtCore, productPlantID);
	}

	/**
	* Returns a range of all the vr product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr product classifications
	* @param end the upper bound of the range of vr product classifications (not inclusive)
	* @return the range of vr product classifications
	*/
	public static java.util.List<com.fds.vr.business.model.VRProductClassification> getVRProductClassifications(
		int start, int end) {
		return getService().getVRProductClassifications(start, end);
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

	public static VRProductClassificationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRProductClassificationLocalService, VRProductClassificationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRProductClassificationLocalService.class);
}