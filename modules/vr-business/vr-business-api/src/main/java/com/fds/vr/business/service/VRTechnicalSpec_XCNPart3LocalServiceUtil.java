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
 * Provides the local service utility for VRTechnicalSpec_XCNPart3. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRTechnicalSpec_XCNPart3LocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNPart3LocalService
 * @see com.fds.vr.business.service.base.VRTechnicalSpec_XCNPart3LocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRTechnicalSpec_XCNPart3LocalServiceImpl
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNPart3LocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRTechnicalSpec_XCNPart3LocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr technical spec_xcn part3 to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCNPart3 the vr technical spec_xcn part3
	* @return the vr technical spec_xcn part3 that was added
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 addVRTechnicalSpec_XCNPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		return getService().addVRTechnicalSpec_XCNPart3(vrTechnicalSpec_XCNPart3);
	}

	/**
	* Creates a new vr technical spec_xcn part3 with the primary key. Does not add the vr technical spec_xcn part3 to the database.
	*
	* @param id the primary key for the new vr technical spec_xcn part3
	* @return the new vr technical spec_xcn part3
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 createVRTechnicalSpec_XCNPart3(
		long id) {
		return getService().createVRTechnicalSpec_XCNPart3(id);
	}

	/**
	* Deletes the vr technical spec_xcn part3 from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCNPart3 the vr technical spec_xcn part3
	* @return the vr technical spec_xcn part3 that was removed
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 deleteVRTechnicalSpec_XCNPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		return getService()
				   .deleteVRTechnicalSpec_XCNPart3(vrTechnicalSpec_XCNPart3);
	}

	/**
	* Deletes the vr technical spec_xcn part3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcn part3
	* @return the vr technical spec_xcn part3 that was removed
	* @throws PortalException if a vr technical spec_xcn part3 with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 deleteVRTechnicalSpec_XCNPart3(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRTechnicalSpec_XCNPart3(id);
	}

	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 fetchVRTechnicalSpec_XCNPart3(
		long id) {
		return getService().fetchVRTechnicalSpec_XCNPart3(id);
	}

	/**
	* Returns the vr technical spec_xcn part3 with the primary key.
	*
	* @param id the primary key of the vr technical spec_xcn part3
	* @return the vr technical spec_xcn part3
	* @throws PortalException if a vr technical spec_xcn part3 with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 getVRTechnicalSpec_XCNPart3(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRTechnicalSpec_XCNPart3(id);
	}

	/**
	* Updates the vr technical spec_xcn part3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCNPart3 the vr technical spec_xcn part3
	* @return the vr technical spec_xcn part3 that was updated
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 updateVRTechnicalSpec_XCNPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCNPart3 vrTechnicalSpec_XCNPart3) {
		return getService()
				   .updateVRTechnicalSpec_XCNPart3(vrTechnicalSpec_XCNPart3);
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
	* Returns the number of vr technical spec_xcn part3s.
	*
	* @return the number of vr technical spec_xcn part3s
	*/
	public static int getVRTechnicalSpec_XCNPart3sCount() {
		return getService().getVRTechnicalSpec_XCNPart3sCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByConvertAssembleId(convertAssembleId);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDeliverableCode(deliverableCode);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierId(dossierId, mtCore);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierIdCTN(dossierIdCTN);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierNo(dossierNo, mtCore);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByReferenceUid(referenceUid);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return getService()
				   .findByVehicleCertificateId(vehicleCertificateId, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> findBy_DossierId(
		long dossierId, int start, int end) {
		return getService().findBy_DossierId(dossierId, start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xcn part3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcn part3s
	* @param end the upper bound of the range of vr technical spec_xcn part3s (not inclusive)
	* @return the range of vr technical spec_xcn part3s
	*/
	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCNPart3> getVRTechnicalSpec_XCNPart3s(
		int start, int end) {
		return getService().getVRTechnicalSpec_XCNPart3s(start, end);
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

	public static VRTechnicalSpec_XCNPart3LocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTechnicalSpec_XCNPart3LocalService, VRTechnicalSpec_XCNPart3LocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRTechnicalSpec_XCNPart3LocalService.class);
}