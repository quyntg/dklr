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
 * Provides a wrapper for {@link VRTechnicalSpec_LKXCGLocalService}.
 *
 * @author LamTV
 * @see VRTechnicalSpec_LKXCGLocalService
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_LKXCGLocalServiceWrapper
	implements VRTechnicalSpec_LKXCGLocalService,
		ServiceWrapper<VRTechnicalSpec_LKXCGLocalService> {
	public VRTechnicalSpec_LKXCGLocalServiceWrapper(
		VRTechnicalSpec_LKXCGLocalService vrTechnicalSpec_LKXCGLocalService) {
		_vrTechnicalSpec_LKXCGLocalService = vrTechnicalSpec_LKXCGLocalService;
	}

	/**
	* Adds the vr technical spec_lkxcg to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG addVRTechnicalSpec_LKXCG(
		com.fds.vr.business.model.VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return _vrTechnicalSpec_LKXCGLocalService.addVRTechnicalSpec_LKXCG(vrTechnicalSpec_LKXCG);
	}

	/**
	* Creates a new vr technical spec_lkxcg with the primary key. Does not add the vr technical spec_lkxcg to the database.
	*
	* @param id the primary key for the new vr technical spec_lkxcg
	* @return the new vr technical spec_lkxcg
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG createVRTechnicalSpec_LKXCG(
		long id) {
		return _vrTechnicalSpec_LKXCGLocalService.createVRTechnicalSpec_LKXCG(id);
	}

	/**
	* Deletes the vr technical spec_lkxcg from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG deleteVRTechnicalSpec_LKXCG(
		com.fds.vr.business.model.VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return _vrTechnicalSpec_LKXCGLocalService.deleteVRTechnicalSpec_LKXCG(vrTechnicalSpec_LKXCG);
	}

	/**
	* Deletes the vr technical spec_lkxcg with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was removed
	* @throws PortalException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG deleteVRTechnicalSpec_LKXCG(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXCGLocalService.deleteVRTechnicalSpec_LKXCG(id);
	}

	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG fetchVRTechnicalSpec_LKXCG(
		long id) {
		return _vrTechnicalSpec_LKXCGLocalService.fetchVRTechnicalSpec_LKXCG(id);
	}

	/**
	* Returns the vr technical spec_lkxcg with the primary key.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg
	* @throws PortalException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG getVRTechnicalSpec_LKXCG(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXCGLocalService.getVRTechnicalSpec_LKXCG(id);
	}

	/**
	* Updates the vr technical spec_lkxcg in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTechnicalSpec_LKXCG updateVRTechnicalSpec_LKXCG(
		com.fds.vr.business.model.VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG) {
		return _vrTechnicalSpec_LKXCGLocalService.updateVRTechnicalSpec_LKXCG(vrTechnicalSpec_LKXCG);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTechnicalSpec_LKXCGLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTechnicalSpec_LKXCGLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId) {
		return _vrTechnicalSpec_LKXCGLocalService.adminProcessData(arrayData,
			dossierId, mtCore, vehicleTypeCertificateId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXCGLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTechnicalSpec_LKXCGLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr technical spec_lkxcgs.
	*
	* @return the number of vr technical spec_lkxcgs
	*/
	@Override
	public int getVRTechnicalSpec_LKXCGsCount() {
		return _vrTechnicalSpec_LKXCGLocalService.getVRTechnicalSpec_LKXCGsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTechnicalSpec_LKXCGLocalService.getOSGiServiceIdentifier();
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
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByConvertAssembleId(convertAssembleId);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByDeliverableCode(deliverableCode);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, int start, int end) {
		return _vrTechnicalSpec_LKXCGLocalService.findByDossierId(dossierId,
			start, end);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByDossierId(dossierId,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByDossierIdCTN(dossierIdCTN);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByDossierNo(dossierNo,
			mtCore);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vrTechnicalSpec_LKXCGLocalService.findByReferenceUid(referenceUid);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> findByVehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return _vrTechnicalSpec_LKXCGLocalService.findByVehicleCertificateId(vehicleCertificateId,
			start, end);
	}

	/**
	* Returns a range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of vr technical spec_lkxcgs
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTechnicalSpec_LKXCG> getVRTechnicalSpec_LKXCGs(
		int start, int end) {
		return _vrTechnicalSpec_LKXCGLocalService.getVRTechnicalSpec_LKXCGs(start,
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
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTechnicalSpec_LKXCGLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTechnicalSpec_LKXCGLocalService getWrappedService() {
		return _vrTechnicalSpec_LKXCGLocalService;
	}

	@Override
	public void setWrappedService(
		VRTechnicalSpec_LKXCGLocalService vrTechnicalSpec_LKXCGLocalService) {
		_vrTechnicalSpec_LKXCGLocalService = vrTechnicalSpec_LKXCGLocalService;
	}

	private VRTechnicalSpec_LKXCGLocalService _vrTechnicalSpec_LKXCGLocalService;
}