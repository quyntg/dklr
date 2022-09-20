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
 * Provides the local service utility for VRIssue. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRIssueLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRIssueLocalService
 * @see com.fds.vr.business.service.base.VRIssueLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRIssueLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRIssueLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRIssueLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr issue to the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was added
	*/
	public static com.fds.vr.business.model.VRIssue addVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return getService().addVRIssue(vrIssue);
	}

	public static com.fds.vr.business.model.VRIssue createVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return getService().createVRIssue(vrIssue);
	}

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	public static com.fds.vr.business.model.VRIssue createVRIssue(long id) {
		return getService().createVRIssue(id);
	}

	/**
	* Deletes the vr issue from the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was removed
	*/
	public static com.fds.vr.business.model.VRIssue deleteVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return getService().deleteVRIssue(vrIssue);
	}

	/**
	* Deletes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRIssue deleteVRIssue(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRIssue(id);
	}

	public static com.fds.vr.business.model.VRIssue fetchVRIssue(long id) {
		return getService().fetchVRIssue(id);
	}

	public static com.fds.vr.business.model.VRIssue findByMT_DID(long mtCore,
		long dossierId) {
		return getService().findByMT_DID(mtCore, dossierId);
	}

	/**
	* Returns the vr issue with the primary key.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRIssue getVRIssue(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRIssue(id);
	}

	public static com.fds.vr.business.model.VRIssue updateDigitalIssueStatus(
		long id, int digitalIssueStatus,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateDigitalIssueStatus(id, digitalIssueStatus, company);
	}

	public static com.fds.vr.business.model.VRIssue updateVRIssue(
		com.fds.vr.business.model.VRIssue object,
		com.liferay.portal.kernel.model.Company company)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVRIssue(object, company);
	}

	/**
	* Updates the vr issue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was updated
	*/
	public static com.fds.vr.business.model.VRIssue updateVRIssue(
		com.fds.vr.business.model.VRIssue vrIssue) {
		return getService().updateVRIssue(vrIssue);
	}

	public static com.fds.vr.business.model.VRIssue updateVRIssue(
		java.util.Map<java.lang.String, java.lang.String> mapValue, int mtCore,
		boolean flagExits)
		throws com.fds.vr.business.exception.NoSuchVRIssueException {
		return getService().updateVRIssue(mapValue, mtCore, flagExits);
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

	public static com.liferay.portal.kernel.json.JSONObject adminProcess(
		com.liferay.portal.kernel.json.JSONObject objectData, long dossierId,
		long mtCore) throws java.lang.Exception {
		return getService().adminProcess(objectData, dossierId, mtCore);
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
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	public static int getVRIssuesCount() {
		return getService().getVRIssuesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRIssue> findByIC_IS(
		long issueCorporationId, int digitalIssueStatus)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByIC_IS(issueCorporationId, digitalIssueStatus);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findByapplicantProfileId(
		long mtCore, long dossierId, long applicantProfileId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByapplicantProfileId(mtCore, dossierId,
			applicantProfileId);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findBycopreportno(
		long mtCore, java.lang.String copreportno)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycopreportno(mtCore, copreportno);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findBycorporationId(
		long mtCore, java.lang.String corporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycorporationId(mtCore, corporationId);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findBydossierId(
		long mtCore, long dossierId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBydossierId(mtCore, dossierId);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findByissueCorporationId(
		long mtCore, long issueCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByissueCorporationId(mtCore, issueCorporationId);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findByproductionPlantId(
		long mtCore, long productionPlantId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByproductionPlantId(mtCore, productionPlantId);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findBystampIssueNo(
		long mtCore, java.lang.String stampIssueNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBystampIssueNo(mtCore, stampIssueNo);
	}

	public static java.util.List<com.fds.vr.business.model.VRIssue> findByverifyCorporationId(
		long mtCore, java.lang.String verifyCorporationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByverifyCorporationId(mtCore, verifyCorporationId);
	}

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	public static java.util.List<com.fds.vr.business.model.VRIssue> getVRIssues(
		int start, int end) {
		return getService().getVRIssues(start, end);
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

	public static VRIssueLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRIssueLocalService, VRIssueLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRIssueLocalService.class);
}