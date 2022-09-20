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
 * Provides a wrapper for {@link VRTechnicalSpec_XDDLocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XDDLocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XDDLocalServiceWrapper
	implements VRTechnicalSpec_XDDLocalService,
		ServiceWrapper<VRTechnicalSpec_XDDLocalService> {
	public VRTechnicalSpec_XDDLocalServiceWrapper(
		VRTechnicalSpec_XDDLocalService vrTechnicalSpec_XDDLocalService) {
		_vrTechnicalSpec_XDDLocalService = vrTechnicalSpec_XDDLocalService;
	}

	/**
	* Adds the vr technical spec_xdd to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD addVRTechnicalSpec_XDD(
		com.fds.vr.business.model.VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		return _vrTechnicalSpec_XDDLocalService.addVRTechnicalSpec_XDD(vrTechnicalSpec_XDD);
	}

	/**
	* Creates a new vr technical spec_xdd with the primary key. Does not add the vr technical spec_xdd to the database.
	*
	* @param id the primary key for the new vr technical spec_xdd
	* @return the new vr technical spec_xdd
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD createVRTechnicalSpec_XDD(
		long id) {
		return _vrTechnicalSpec_XDDLocalService.createVRTechnicalSpec_XDD(id);
	}

	/**
	* Deletes the vr technical spec_xdd from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD deleteVRTechnicalSpec_XDD(
		com.fds.vr.business.model.VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		return _vrTechnicalSpec_XDDLocalService.deleteVRTechnicalSpec_XDD(vrTechnicalSpec_XDD);
	}

	/**
	* Deletes the vr technical spec_xdd with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xdd
	* @return the vr technical spec_xdd that was removed
	* @throws PortalException if a vr technical spec_xdd with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD deleteVRTechnicalSpec_XDD(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XDDLocalService.deleteVRTechnicalSpec_XDD(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD fetchVRTechnicalSpec_XDD(
		long id) {
		return _vrTechnicalSpec_XDDLocalService.fetchVRTechnicalSpec_XDD(id);
	}

	/**
	* Returns the vr technical spec_xdd with the primary key.
	*
	* @param id the primary key of the vr technical spec_xdd
	* @return the vr technical spec_xdd
	* @throws PortalException if a vr technical spec_xdd with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD getVRTechnicalSpec_XDD(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XDDLocalService.getVRTechnicalSpec_XDD(id);
	}

	/**
	* Updates the vr technical spec_xdd in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XDD the vr technical spec_xdd
	* @return the vr technical spec_xdd that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_XDD updateVRTechnicalSpec_XDD(
		com.fds.vr.business.model.VRTechnicalSpec_XDD vrTechnicalSpec_XDD) {
		return _vrTechnicalSpec_XDDLocalService.updateVRTechnicalSpec_XDD(vrTechnicalSpec_XDD);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_XDDLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_XDDLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_XDDLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId) {
		return _vrTechnicalSpec_XDDLocalService.adminProcessData(arrayData,
			dossierId, mtCore, vehicleTypeCertificateId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XDDLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_XDDLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_xdds.
	*
	* @return the number of vr technical spec_xdds
	*/
	@Override
	public int getVRTechnicalSpec_XDDsCount() {
		return _vrTechnicalSpec_XDDLocalService.getVRTechnicalSpec_XDDsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_XDDLocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_XDDLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XDDLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_XDDLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByDossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_XDDLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_XDDLocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrTechnicalSpec_XDDLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xdds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XDDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xdds
	* @param end the upper bound of the range of vr technical spec_xdds (not inclusive)
	* @return the range of vr technical spec_xdds
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XDD> getVRTechnicalSpec_XDDs(
		int start, int end) {
		return _vrTechnicalSpec_XDDLocalService.getVRTechnicalSpec_XDDs(start,
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
		return _vrTechnicalSpec_XDDLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_XDDLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_XDDLocalService getWrappedService() {
		return _vrTechnicalSpec_XDDLocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_XDDLocalService vrTechnicalSpec_XDDLocalService) {
		_vrTechnicalSpec_XDDLocalService = vrTechnicalSpec_XDDLocalService;
	}

	private VRTechnicalSpec_XDDLocalService _vrTechnicalSpec_XDDLocalService;
}