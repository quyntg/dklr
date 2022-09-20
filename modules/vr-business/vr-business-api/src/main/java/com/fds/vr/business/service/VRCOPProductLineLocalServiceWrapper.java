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
 * Provides a wrapper for {@link VRCOPProductLineLocalService}.
 *
 * @author LamTV
 * @see VRCOPProductLineLocalService
 * @generated
 */
@ProviderType
public class VRCOPProductLineLocalServiceWrapper
	implements VRCOPProductLineLocalService,
		ServiceWrapper<VRCOPProductLineLocalService> {
	public VRCOPProductLineLocalServiceWrapper(
		VRCOPProductLineLocalService vrcopProductLineLocalService) {
		_vrcopProductLineLocalService = vrcopProductLineLocalService;
	}

	/**
	* Adds the vrcop product line to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductLine the vrcop product line
	* @return the vrcop product line that was added
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine addVRCOPProductLine(
		com.fds.vr.business.model.VRCOPProductLine vrcopProductLine) {
		return _vrcopProductLineLocalService.addVRCOPProductLine(vrcopProductLine);
	}

	/**
	* Creates a new vrcop product line with the primary key. Does not add the vrcop product line to the database.
	*
	* @param id the primary key for the new vrcop product line
	* @return the new vrcop product line
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine createVRCOPProductLine(
		long id) {
		return _vrcopProductLineLocalService.createVRCOPProductLine(id);
	}

	/**
	* Deletes the vrcop product line from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductLine the vrcop product line
	* @return the vrcop product line that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine deleteVRCOPProductLine(
		com.fds.vr.business.model.VRCOPProductLine vrcopProductLine) {
		return _vrcopProductLineLocalService.deleteVRCOPProductLine(vrcopProductLine);
	}

	/**
	* Deletes the vrcop product line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line that was removed
	* @throws PortalException if a vrcop product line with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine deleteVRCOPProductLine(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductLineLocalService.deleteVRCOPProductLine(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPProductLine fetchVRCOPProductLine(
		long id) {
		return _vrcopProductLineLocalService.fetchVRCOPProductLine(id);
	}

	/**
	* Returns the vrcop product line with the primary key.
	*
	* @param id the primary key of the vrcop product line
	* @return the vrcop product line
	* @throws PortalException if a vrcop product line with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine getVRCOPProductLine(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductLineLocalService.getVRCOPProductLine(id);
	}

	@Override
	public com.fds.vr.business.model.VRCOPProductLine updateCOPProductLine(
		java.util.LinkedHashMap<java.lang.String, java.lang.String> mapValues) {
		return _vrcopProductLineLocalService.updateCOPProductLine(mapValues);
	}

	/**
	* Updates the vrcop product line in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductLine the vrcop product line
	* @return the vrcop product line that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRCOPProductLine updateVRCOPProductLine(
		com.fds.vr.business.model.VRCOPProductLine vrcopProductLine) {
		return _vrcopProductLineLocalService.updateVRCOPProductLine(vrcopProductLine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrcopProductLineLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrcopProductLineLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrcopProductLineLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductLineLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductLineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop product lines.
	*
	* @return the number of vrcop product lines
	*/
	@Override
	public int getVRCOPProductLinesCount() {
		return _vrcopProductLineLocalService.getVRCOPProductLinesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrcopProductLineLocalService.getOSGiServiceIdentifier();
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
		return _vrcopProductLineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProductLineLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrcopProductLineLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductLine> findBycopReportNo(
		long mtCore, java.lang.String copReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopProductLineLocalService.findBycopReportNo(mtCore,
			copReportNo);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductLine> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrcopProductLineLocalService.findBycopReportRepositoryID(mtCore,
			copReportRepositoryID);
	}

	/**
	* Returns a range of all the vrcop product lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product lines
	* @param end the upper bound of the range of vrcop product lines (not inclusive)
	* @return the range of vrcop product lines
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRCOPProductLine> getVRCOPProductLines(
		int start, int end) {
		return _vrcopProductLineLocalService.getVRCOPProductLines(start, end);
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
		return _vrcopProductLineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrcopProductLineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPProductLineLocalService getWrappedService() {
		return _vrcopProductLineLocalService;
	}

	@Override
	public void setWrappedService(
		VRCOPProductLineLocalService vrcopProductLineLocalService) {
		_vrcopProductLineLocalService = vrcopProductLineLocalService;
	}

	private VRCOPProductLineLocalService _vrcopProductLineLocalService;
}