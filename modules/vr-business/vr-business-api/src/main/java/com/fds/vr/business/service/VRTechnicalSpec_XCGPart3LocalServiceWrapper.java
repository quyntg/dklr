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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRTechnicalSpec_XCGPart3LocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart3LocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart3LocalServiceWrapper
	implements VRTechnicalSpec_XCGPart3LocalService,
		ServiceWrapper<VRTechnicalSpec_XCGPart3LocalService> {
	public VRTechnicalSpec_XCGPart3LocalServiceWrapper(
		VRTechnicalSpec_XCGPart3LocalService vrTechnicalSpec_XCGPart3LocalService) {
		_vrTechnicalSpec_XCGPart3LocalService = vrTechnicalSpec_XCGPart3LocalService;
	}

	/**
	* Adds the vr technical spec_xcg part3 to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart3 the vr technical spec_xcg part3
	* @return the vr technical spec_xcg part3 that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 addVRTechnicalSpec_XCGPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 vrTechnicalSpec_XCGPart3) {
		return _vrTechnicalSpec_XCGPart3LocalService.addVRTechnicalSpec_XCGPart3(vrTechnicalSpec_XCGPart3);
	}

	/**
	* Creates a new vr technical spec_xcg part3 with the primary key. Does not add the vr technical spec_xcg part3 to the database.
	*
	* @param id the primary key for the new vr technical spec_xcg part3
	* @return the new vr technical spec_xcg part3
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 createVRTechnicalSpec_XCGPart3(
		long id) {
		return _vrTechnicalSpec_XCGPart3LocalService.createVRTechnicalSpec_XCGPart3(id);
	}

	/**
	* Deletes the vr technical spec_xcg part3 from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart3 the vr technical spec_xcg part3
	* @return the vr technical spec_xcg part3 that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 deleteVRTechnicalSpec_XCGPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 vrTechnicalSpec_XCGPart3) {
		return _vrTechnicalSpec_XCGPart3LocalService.deleteVRTechnicalSpec_XCGPart3(vrTechnicalSpec_XCGPart3);
	}

	/**
	* Deletes the vr technical spec_xcg part3 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcg part3
	* @return the vr technical spec_xcg part3 that was removed
	* @throws PortalException if a vr technical spec_xcg part3 with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 deleteVRTechnicalSpec_XCGPart3(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart3LocalService.deleteVRTechnicalSpec_XCGPart3(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 fetchVRTechnicalSpec_XCGPart3(
		long id) {
		return _vrTechnicalSpec_XCGPart3LocalService.fetchVRTechnicalSpec_XCGPart3(id);
	}

	/**
	* Returns the vr technical spec_xcg part3 with the primary key.
	*
	* @param id the primary key of the vr technical spec_xcg part3
	* @return the vr technical spec_xcg part3
	* @throws PortalException if a vr technical spec_xcg part3 with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 getVRTechnicalSpec_XCGPart3(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart3LocalService.getVRTechnicalSpec_XCGPart3(id);
	}

	/**
	* Updates the vr technical spec_xcg part3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart3 the vr technical spec_xcg part3
	* @return the vr technical spec_xcg part3 that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 updateVRTechnicalSpec_XCGPart3(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart3 vrTechnicalSpec_XCGPart3) {
		return _vrTechnicalSpec_XCGPart3LocalService.updateVRTechnicalSpec_XCGPart3(vrTechnicalSpec_XCGPart3);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_XCGPart3LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_XCGPart3LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart3LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart3LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_xcg part3s.
	*
	* @return the number of vr technical spec_xcg part3s
	*/
	@Override
	public int getVRTechnicalSpec_XCGPart3sCount() {
		return _vrTechnicalSpec_XCGPart3LocalService.getVRTechnicalSpec_XCGPart3sCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_XCGPart3LocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByDossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_XCGPart3LocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart3LocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> findByVehicleCertificateId(
		long vehiclerCertificateId, int start, int end) {
		return _vrTechnicalSpec_XCGPart3LocalService.findByVehicleCertificateId(vehiclerCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xcg part3s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart3ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcg part3s
	* @param end the upper bound of the range of vr technical spec_xcg part3s (not inclusive)
	* @return the range of vr technical spec_xcg part3s
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart3> getVRTechnicalSpec_XCGPart3s(
		int start, int end) {
		return _vrTechnicalSpec_XCGPart3LocalService.getVRTechnicalSpec_XCGPart3s(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vrTechnicalSpec_XCGPart3LocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_XCGPart3LocalService getWrappedService() {
		return _vrTechnicalSpec_XCGPart3LocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_XCGPart3LocalService vrTechnicalSpec_XCGPart3LocalService) {
		_vrTechnicalSpec_XCGPart3LocalService = vrTechnicalSpec_XCGPart3LocalService;
	}

	private VRTechnicalSpec_XCGPart3LocalService _vrTechnicalSpec_XCGPart3LocalService;
}