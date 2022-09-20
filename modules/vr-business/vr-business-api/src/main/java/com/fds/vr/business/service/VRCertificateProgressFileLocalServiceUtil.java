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
 * Provides the local service utility for VRCertificateProgressFile. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRCertificateProgressFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRCertificateProgressFileLocalService
 * @see com.fds.vr.business.service.base.VRCertificateProgressFileLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCertificateProgressFileLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCertificateProgressFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCertificateProgressFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr certificate progress file to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgressFile the vr certificate progress file
	* @return the vr certificate progress file that was added
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile addVRCertificateProgressFile(
		com.fds.vr.business.model.VRCertificateProgressFile vrCertificateProgressFile) {
		return getService()
				   .addVRCertificateProgressFile(vrCertificateProgressFile);
	}

	/**
	* Creates a new vr certificate progress file with the primary key. Does not add the vr certificate progress file to the database.
	*
	* @param id the primary key for the new vr certificate progress file
	* @return the new vr certificate progress file
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile createVRCertificateProgressFile(
		long id) {
		return getService().createVRCertificateProgressFile(id);
	}

	/**
	* Deletes the vr certificate progress file from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgressFile the vr certificate progress file
	* @return the vr certificate progress file that was removed
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile deleteVRCertificateProgressFile(
		com.fds.vr.business.model.VRCertificateProgressFile vrCertificateProgressFile) {
		return getService()
				   .deleteVRCertificateProgressFile(vrCertificateProgressFile);
	}

	/**
	* Deletes the vr certificate progress file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file that was removed
	* @throws PortalException if a vr certificate progress file with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile deleteVRCertificateProgressFile(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCertificateProgressFile(id);
	}

	public static com.fds.vr.business.model.VRCertificateProgressFile fetchVRCertificateProgressFile(
		long id) {
		return getService().fetchVRCertificateProgressFile(id);
	}

	/**
	* Returns the vr certificate progress file with the primary key.
	*
	* @param id the primary key of the vr certificate progress file
	* @return the vr certificate progress file
	* @throws PortalException if a vr certificate progress file with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile getVRCertificateProgressFile(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCertificateProgressFile(id);
	}

	/**
	* Updates the vr certificate progress file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCertificateProgressFile the vr certificate progress file
	* @return the vr certificate progress file that was updated
	*/
	public static com.fds.vr.business.model.VRCertificateProgressFile updateVRCertificateProgressFile(
		com.fds.vr.business.model.VRCertificateProgressFile vrCertificateProgressFile) {
		return getService()
				   .updateVRCertificateProgressFile(vrCertificateProgressFile);
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
	* Returns the number of vr certificate progress files.
	*
	* @return the number of vr certificate progress files
	*/
	public static int getVRCertificateProgressFilesCount() {
		return getService().getVRCertificateProgressFilesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the vr certificate progress files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCertificateProgressFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr certificate progress files
	* @param end the upper bound of the range of vr certificate progress files (not inclusive)
	* @return the range of vr certificate progress files
	*/
	public static java.util.List<com.fds.vr.business.model.VRCertificateProgressFile> getVRCertificateProgressFiles(
		int start, int end) {
		return getService().getVRCertificateProgressFiles(start, end);
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

	public static VRCertificateProgressFileLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCertificateProgressFileLocalService, VRCertificateProgressFileLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCertificateProgressFileLocalService.class);
}