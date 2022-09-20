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
 * Provides a wrapper for {@link VRTechnicalSpec_XCGPart5LocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart5LocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart5LocalServiceWrapper
	implements VRTechnicalSpec_XCGPart5LocalService,
		ServiceWrapper<VRTechnicalSpec_XCGPart5LocalService> {
	public VRTechnicalSpec_XCGPart5LocalServiceWrapper(
		VRTechnicalSpec_XCGPart5LocalService vrTechnicalSpec_XCGPart5LocalService) {
		_vrTechnicalSpec_XCGPart5LocalService = vrTechnicalSpec_XCGPart5LocalService;
	}

	/**
	* Adds the vr technical spec_xcg part5 to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart5 the vr technical spec_xcg part5
	* @return the vr technical spec_xcg part5 that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 addVRTechnicalSpec_XCGPart5(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
		return _vrTechnicalSpec_XCGPart5LocalService.addVRTechnicalSpec_XCGPart5(vrTechnicalSpec_XCGPart5);
	}

	/**
	* Creates a new vr technical spec_xcg part5 with the primary key. Does not add the vr technical spec_xcg part5 to the database.
	*
	* @param id the primary key for the new vr technical spec_xcg part5
	* @return the new vr technical spec_xcg part5
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 createVRTechnicalSpec_XCGPart5(
		long id) {
		return _vrTechnicalSpec_XCGPart5LocalService.createVRTechnicalSpec_XCGPart5(id);
	}

	/**
	* Deletes the vr technical spec_xcg part5 from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart5 the vr technical spec_xcg part5
	* @return the vr technical spec_xcg part5 that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 deleteVRTechnicalSpec_XCGPart5(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
		return _vrTechnicalSpec_XCGPart5LocalService.deleteVRTechnicalSpec_XCGPart5(vrTechnicalSpec_XCGPart5);
	}

	/**
	* Deletes the vr technical spec_xcg part5 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcg part5
	* @return the vr technical spec_xcg part5 that was removed
	* @throws PortalException if a vr technical spec_xcg part5 with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 deleteVRTechnicalSpec_XCGPart5(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart5LocalService.deleteVRTechnicalSpec_XCGPart5(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 fetchVRTechnicalSpec_XCGPart5(
		long id) {
		return _vrTechnicalSpec_XCGPart5LocalService.fetchVRTechnicalSpec_XCGPart5(id);
	}

	/**
	* Returns the vr technical spec_xcg part5 with the primary key.
	*
	* @param id the primary key of the vr technical spec_xcg part5
	* @return the vr technical spec_xcg part5
	* @throws PortalException if a vr technical spec_xcg part5 with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 getVRTechnicalSpec_XCGPart5(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart5LocalService.getVRTechnicalSpec_XCGPart5(id);
	}

	/**
	* Updates the vr technical spec_xcg part5 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCGPart5 the vr technical spec_xcg part5
	* @return the vr technical spec_xcg part5 that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 updateVRTechnicalSpec_XCGPart5(
		com.fds.vr.business.model.VRTechnicalSpec_XCGPart5 vrTechnicalSpec_XCGPart5) {
		return _vrTechnicalSpec_XCGPart5LocalService.updateVRTechnicalSpec_XCGPart5(vrTechnicalSpec_XCGPart5);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_XCGPart5LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_XCGPart5LocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart5LocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCGPart5LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_xcg part5s.
	*
	* @return the number of vr technical spec_xcg part5s
	*/
	@Override
	public int getVRTechnicalSpec_XCGPart5sCount() {
		return _vrTechnicalSpec_XCGPart5LocalService.getVRTechnicalSpec_XCGPart5sCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_XCGPart5LocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByDossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_XCGPart5LocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCGPart5LocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> findByVehicleCertificateId(
		long vehiclerCertificateId, int start, int end) {
		return _vrTechnicalSpec_XCGPart5LocalService.findByVehicleCertificateId(vehiclerCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xcg part5s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart5ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcg part5s
	* @param end the upper bound of the range of vr technical spec_xcg part5s (not inclusive)
	* @return the range of vr technical spec_xcg part5s
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCGPart5> getVRTechnicalSpec_XCGPart5s(
		int start, int end) {
		return _vrTechnicalSpec_XCGPart5LocalService.getVRTechnicalSpec_XCGPart5s(start,
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
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_XCGPart5LocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_XCGPart5LocalService getWrappedService() {
		return _vrTechnicalSpec_XCGPart5LocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_XCGPart5LocalService vrTechnicalSpec_XCGPart5LocalService) {
		_vrTechnicalSpec_XCGPart5LocalService = vrTechnicalSpec_XCGPart5LocalService;
	}

	private VRTechnicalSpec_XCGPart5LocalService _vrTechnicalSpec_XCGPart5LocalService;
}