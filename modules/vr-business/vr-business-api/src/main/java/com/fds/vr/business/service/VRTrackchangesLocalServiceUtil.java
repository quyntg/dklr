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
 * Provides the local service utility for VRTrackchanges. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRTrackchangesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRTrackchangesLocalService
 * @see com.fds.vr.business.service.base.VRTrackchangesLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRTrackchangesLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRTrackchangesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRTrackchangesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr trackchanges to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was added
	*/
	public static com.fds.vr.business.model.VRTrackchanges addVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return getService().addVRTrackchanges(vrTrackchanges);
	}

	/**
	* Creates a new vr trackchanges with the primary key. Does not add the vr trackchanges to the database.
	*
	* @param id the primary key for the new vr trackchanges
	* @return the new vr trackchanges
	*/
	public static com.fds.vr.business.model.VRTrackchanges createVRTrackchanges(
		long id) {
		return getService().createVRTrackchanges(id);
	}

	/**
	* Deletes the vr trackchanges from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was removed
	*/
	public static com.fds.vr.business.model.VRTrackchanges deleteVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return getService().deleteVRTrackchanges(vrTrackchanges);
	}

	/**
	* Deletes the vr trackchanges with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges that was removed
	* @throws PortalException if a vr trackchanges with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTrackchanges deleteVRTrackchanges(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRTrackchanges(id);
	}

	public static com.fds.vr.business.model.VRTrackchanges fetchVRTrackchanges(
		long id) {
		return getService().fetchVRTrackchanges(id);
	}

	public static com.fds.vr.business.model.VRTrackchanges findByApplicantCode(
		java.lang.String applicantCode) {
		return getService().findByApplicantCode(applicantCode);
	}

	public static com.fds.vr.business.model.VRTrackchanges findByDossierIdCTN_ContentFileTemplate(
		java.lang.String dossierIdCTN, java.lang.String contentFileTemplate) {
		return getService()
				   .findByDossierIdCTN_ContentFileTemplate(dossierIdCTN,
			contentFileTemplate);
	}

	public static com.fds.vr.business.model.VRTrackchanges findByDossierId_ContentFileTemplate(
		long dossierId, java.lang.String contentFileTemplate) {
		return getService()
				   .findByDossierId_ContentFileTemplate(dossierId,
			contentFileTemplate);
	}

	public static com.fds.vr.business.model.VRTrackchanges findByProductionPlantCode(
		java.lang.String productionPlantCode) {
		return getService().findByProductionPlantCode(productionPlantCode);
	}

	/**
	* Returns the vr trackchanges with the primary key.
	*
	* @param id the primary key of the vr trackchanges
	* @return the vr trackchanges
	* @throws PortalException if a vr trackchanges with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTrackchanges getVRTrackchanges(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRTrackchanges(id);
	}

	/**
	* Updates the vr trackchanges in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTrackchanges the vr trackchanges
	* @return the vr trackchanges that was updated
	*/
	public static com.fds.vr.business.model.VRTrackchanges updateVRTrackchanges(
		com.fds.vr.business.model.VRTrackchanges vrTrackchanges) {
		return getService().updateVRTrackchanges(vrTrackchanges);
	}

	public static com.fds.vr.business.model.VRTrackchanges updateVRTrackchanges(
		long id, java.lang.String applicantCode,
		java.lang.String productionPlantCode, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo,
		java.lang.String contentType, java.lang.String contentFileTemplate,
		long fileEntryId, java.util.Date syncDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService()
				   .updateVRTrackchanges(id, applicantCode,
			productionPlantCode, dossierId, dossierIdCTN, dossierNo,
			contentType, contentFileTemplate, fileEntryId, syncDate,
			serviceContext);
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
	* Returns the number of vr trackchangeses.
	*
	* @return the number of vr trackchangeses
	*/
	public static int getVRTrackchangesesCount() {
		return getService().getVRTrackchangesesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRTrackchanges> findByContentType(
		java.lang.String contentType, int start, int end) {
		return getService().findByContentType(contentType, start, end);
	}

	/**
	* Returns a range of all the vr trackchangeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTrackchangesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr trackchangeses
	* @param end the upper bound of the range of vr trackchangeses (not inclusive)
	* @return the range of vr trackchangeses
	*/
	public static java.util.List<com.fds.vr.business.model.VRTrackchanges> getVRTrackchangeses(
		int start, int end) {
		return getService().getVRTrackchangeses(start, end);
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

	public static VRTrackchangesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTrackchangesLocalService, VRTrackchangesLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRTrackchangesLocalService.class);
}