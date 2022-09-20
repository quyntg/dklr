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
 * Provides a wrapper for {@link VRTechnicalSpec_XCNLocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCNLocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCNLocalServiceWrapper
	implements VRTechnicalSpec_XCNLocalService,
		ServiceWrapper<VRTechnicalSpec_XCNLocalService> {
	public VRTechnicalSpec_XCNLocalServiceWrapper(
		VRTechnicalSpec_XCNLocalService vrTechnicalSpec_XCNLocalService) {
		_vrTechnicalSpec_XCNLocalService = vrTechnicalSpec_XCNLocalService;
	}

	/**
	* Adds the vr technical spec_xcn to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCN the vr technical spec_xcn
	* @return the vr technical spec_xcn that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN addVRTechnicalSpec_XCN(
		com.fds.vr.business.model.VRTechnicalSpec_XCN vrTechnicalSpec_XCN) {
		return _vrTechnicalSpec_XCNLocalService.addVRTechnicalSpec_XCN(vrTechnicalSpec_XCN);
	}

	/**
	* Creates a new vr technical spec_xcn with the primary key. Does not add the vr technical spec_xcn to the database.
	*
	* @param id the primary key for the new vr technical spec_xcn
	* @return the new vr technical spec_xcn
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN createVRTechnicalSpec_XCN(
		long id) {
		return _vrTechnicalSpec_XCNLocalService.createVRTechnicalSpec_XCN(id);
	}

	/**
	* Deletes the vr technical spec_xcn from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCN the vr technical spec_xcn
	* @return the vr technical spec_xcn that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN deleteVRTechnicalSpec_XCN(
		com.fds.vr.business.model.VRTechnicalSpec_XCN vrTechnicalSpec_XCN) {
		return _vrTechnicalSpec_XCNLocalService.deleteVRTechnicalSpec_XCN(vrTechnicalSpec_XCN);
	}

	/**
	* Deletes the vr technical spec_xcn with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcn
	* @return the vr technical spec_xcn that was removed
	* @throws PortalException if a vr technical spec_xcn with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN deleteVRTechnicalSpec_XCN(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCNLocalService.deleteVRTechnicalSpec_XCN(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN fetchVRTechnicalSpec_XCN(
		long id) {
		return _vrTechnicalSpec_XCNLocalService.fetchVRTechnicalSpec_XCN(id);
	}

	/**
	* Returns the vr technical spec_xcn with the primary key.
	*
	* @param id the primary key of the vr technical spec_xcn
	* @return the vr technical spec_xcn
	* @throws PortalException if a vr technical spec_xcn with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN getVRTechnicalSpec_XCN(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCNLocalService.getVRTechnicalSpec_XCN(id);
	}

	/**
	* Updates the vr technical spec_xcn in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCN the vr technical spec_xcn
	* @return the vr technical spec_xcn that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XCN updateVRTechnicalSpec_XCN(
		com.fds.vr.business.model.VRTechnicalSpec_XCN vrTechnicalSpec_XCN) {
		return _vrTechnicalSpec_XCNLocalService.updateVRTechnicalSpec_XCN(vrTechnicalSpec_XCN);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_XCNLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_XCNLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_XCNLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId) {
		return _vrTechnicalSpec_XCNLocalService.adminProcessData(arrayData,
			dossierId, mtCore, vehicleTypeCertificateId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCNLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XCNLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_xcns.
	*
	* @return the number of vr technical spec_xcns
	*/
	@Override
	public int getVRTechnicalSpec_XCNsCount() {
		return _vrTechnicalSpec_XCNLocalService.getVRTechnicalSpec_XCNsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_XCNLocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_XCNLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCNLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XCNLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XCNLocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrTechnicalSpec_XCNLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> findBy_DossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_XCNLocalService.findBy_DossierId(dossierId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xcns.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCNModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcns
	* @param end the upper bound of the range of vr technical spec_xcns (not inclusive)
	* @return the range of vr technical spec_xcns
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCN> getVRTechnicalSpec_XCNs(
		int start, int end) {
		return _vrTechnicalSpec_XCNLocalService.getVRTechnicalSpec_XCNs(start,
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
		return _vrTechnicalSpec_XCNLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_XCNLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_XCNLocalService getWrappedService() {
		return _vrTechnicalSpec_XCNLocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_XCNLocalService vrTechnicalSpec_XCNLocalService) {
		_vrTechnicalSpec_XCNLocalService = vrTechnicalSpec_XCNLocalService;
	}

	private VRTechnicalSpec_XCNLocalService _vrTechnicalSpec_XCNLocalService;
}