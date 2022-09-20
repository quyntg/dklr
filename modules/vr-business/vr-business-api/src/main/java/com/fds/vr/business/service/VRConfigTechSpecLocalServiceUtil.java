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
 * Provides the local service utility for VRConfigTechSpec. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRConfigTechSpecLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRConfigTechSpecLocalService
 * @see com.fds.vr.business.service.base.VRConfigTechSpecLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRConfigTechSpecLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRConfigTechSpecLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRConfigTechSpecLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr config tech spec to the database. Also notifies the appropriate model listeners.
	*
	* @param vrConfigTechSpec the vr config tech spec
	* @return the vr config tech spec that was added
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec addVRConfigTechSpec(
		com.fds.vr.business.model.VRConfigTechSpec vrConfigTechSpec) {
		return getService().addVRConfigTechSpec(vrConfigTechSpec);
	}

	/**
	* Creates a new vr config tech spec with the primary key. Does not add the vr config tech spec to the database.
	*
	* @param id the primary key for the new vr config tech spec
	* @return the new vr config tech spec
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec createVRConfigTechSpec(
		long id) {
		return getService().createVRConfigTechSpec(id);
	}

	/**
	* Deletes the vr config tech spec from the database. Also notifies the appropriate model listeners.
	*
	* @param vrConfigTechSpec the vr config tech spec
	* @return the vr config tech spec that was removed
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec deleteVRConfigTechSpec(
		com.fds.vr.business.model.VRConfigTechSpec vrConfigTechSpec) {
		return getService().deleteVRConfigTechSpec(vrConfigTechSpec);
	}

	/**
	* Deletes the vr config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec that was removed
	* @throws PortalException if a vr config tech spec with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec deleteVRConfigTechSpec(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRConfigTechSpec(id);
	}

	public static com.fds.vr.business.model.VRConfigTechSpec fetchVRConfigTechSpec(
		long id) {
		return getService().fetchVRConfigTechSpec(id);
	}

	/**
	* Returns the vr config tech spec with the primary key.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec
	* @throws PortalException if a vr config tech spec with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec getVRConfigTechSpec(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRConfigTechSpec(id);
	}

	/**
	* Updates the vr config tech spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrConfigTechSpec the vr config tech spec
	* @return the vr config tech spec that was updated
	*/
	public static com.fds.vr.business.model.VRConfigTechSpec updateVRConfigTechSpec(
		com.fds.vr.business.model.VRConfigTechSpec vrConfigTechSpec) {
		return getService().updateVRConfigTechSpec(vrConfigTechSpec);
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
	* Returns the number of vr config tech specs.
	*
	* @return the number of vr config tech specs
	*/
	public static int getVRConfigTechSpecsCount() {
		return getService().getVRConfigTechSpecsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCCTSC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByVCCTSC(vehicleClass, vehicleType, specCategory);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCCTSC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByVCCTSC(vehicleClass, vehicleTypes, specCategory);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCCTSCMD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getByVCCTSCMD(vehicleClass, vehicleType, specCategory,
			module);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCMD(
		java.lang.String vehicleClass, java.lang.String module) {
		return getService().getByVCMD(vehicleClass, module);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCSC(
		java.lang.String vehicleClass, java.lang.String specCategory)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByVCSC(vehicleClass, specCategory);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCSC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByVCSC(vehicleClass, specCategory, module);
	}

	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getByVCSC_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByVCSC_(vehicleClass, specCategory, module);
	}

	/**
	* Returns a range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of vr config tech specs
	*/
	public static java.util.List<com.fds.vr.business.model.VRConfigTechSpec> getVRConfigTechSpecs(
		int start, int end) {
		return getService().getVRConfigTechSpecs(start, end);
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

	public static VRConfigTechSpecLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRConfigTechSpecLocalService, VRConfigTechSpecLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRConfigTechSpecLocalService.class);
}