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
 * Provides a wrapper for {@link VRTechnicalSpec_XCHLocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHLocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHLocalServiceWrapper
	implements VRTechnicalSpec_XCHLocalService,
		ServiceWrapper<VRTechnicalSpec_XCHLocalService> {
	public VRTechnicalSpec_XCHLocalServiceWrapper(
		VRTechnicalSpec_XCHLocalService vrTechnicalSpec_XCHLocalService) {
		_vrTechnicalSpec_XCHLocalService = vrTechnicalSpec_XCHLocalService;
	}

	/**
	* Adds the vr technical spec_xch to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCH the vr technical spec_xch
	* @return the vr technical spec_xch that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH addVRTechnicalSpec_XCH(
		com.fds.vr.business.model.VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		return _vrTechnicalSpec_XCHLocalService.addVRTechnicalSpec_XCH(vrTechnicalSpec_XCH);
	}

	/**
	* Creates a new vr technical spec_xch with the primary key. Does not add the vr technical spec_xch to the database.
	*
	* @param id the primary key for the new vr technical spec_xch
	* @return the new vr technical spec_xch
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH createVRTechnicalSpec_XCH(
		long id) {
		return _vrTechnicalSpec_XCHLocalService.createVRTechnicalSpec_XCH(id);
	}

	/**
	* Deletes the vr technical spec_xch from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCH the vr technical spec_xch
	* @return the vr technical spec_xch that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH deleteVRTechnicalSpec_XCH(
		com.fds.vr.business.model.VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		return _vrTechnicalSpec_XCHLocalService.deleteVRTechnicalSpec_XCH(vrTechnicalSpec_XCH);
	}

	/**
	* Deletes the vr technical spec_xch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xch
	* @return the vr technical spec_xch that was removed
	* @throws PortalException if a vr technical spec_xch with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH deleteVRTechnicalSpec_XCH(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCHLocalService.deleteVRTechnicalSpec_XCH(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH fetchVRTechnicalSpec_XCH(
		long id) {
		return _vrTechnicalSpec_XCHLocalService.fetchVRTechnicalSpec_XCH(id);
	}

	/**
	* Returns the vr technical spec_xch with the primary key.
	*
	* @param id the primary key of the vr technical spec_xch
	* @return the vr technical spec_xch
	* @throws PortalException if a vr technical spec_xch with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH getVRTechnicalSpec_XCH(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCHLocalService.getVRTechnicalSpec_XCH(id);
	}

	/**
	* Updates the vr technical spec_xch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCH the vr technical spec_xch
	* @return the vr technical spec_xch that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCH updateVRTechnicalSpec_XCH(
		com.fds.vr.business.model.VRTechnicalSpec_XCH vrTechnicalSpec_XCH) {
		return _vrTechnicalSpec_XCHLocalService.updateVRTechnicalSpec_XCH(vrTechnicalSpec_XCH);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_XCHLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_XCHLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_XCHLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId) {
		return _vrTechnicalSpec_XCHLocalService.adminProcessData(arrayData,
			dossierId, mtCore, vehicleTypeCertificateId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCHLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCHLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_xchs.
	*
	* @return the number of vr technical spec_xchs
	*/
	@Override
	public int getVRTechnicalSpec_XCHsCount() {
		return _vrTechnicalSpec_XCHLocalService.getVRTechnicalSpec_XCHsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_XCHLocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_XCHLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCHLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCHLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByDossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_XCHLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCHLocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrTechnicalSpec_XCHLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCHModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xchs
	* @param end the upper bound of the range of vr technical spec_xchs (not inclusive)
	* @return the range of vr technical spec_xchs
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCH> getVRTechnicalSpec_XCHs(
		int start, int end) {
		return _vrTechnicalSpec_XCHLocalService.getVRTechnicalSpec_XCHs(start,
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
		return _vrTechnicalSpec_XCHLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_XCHLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_XCHLocalService getWrappedService() {
		return _vrTechnicalSpec_XCHLocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_XCHLocalService vrTechnicalSpec_XCHLocalService) {
		_vrTechnicalSpec_XCHLocalService = vrTechnicalSpec_XCHLocalService;
	}

	private VRTechnicalSpec_XCHLocalService _vrTechnicalSpec_XCHLocalService;
}