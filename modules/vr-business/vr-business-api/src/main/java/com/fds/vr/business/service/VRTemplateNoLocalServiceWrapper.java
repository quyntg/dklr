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
 * Provides a wrapper for {@link VRTemplateNoLocalService}.
 *
 * @author LamTV
 * @see VRTemplateNoLocalService
 * @generated
 */
@ProviderType
public class VRTemplateNoLocalServiceWrapper implements VRTemplateNoLocalService,
	ServiceWrapper<VRTemplateNoLocalService> {
	public VRTemplateNoLocalServiceWrapper(
		VRTemplateNoLocalService vrTemplateNoLocalService) {
		_vrTemplateNoLocalService = vrTemplateNoLocalService;
	}

	/**
	* Adds the vr template no to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTemplateNo the vr template no
	* @return the vr template no that was added
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo addVRTemplateNo(
		com.fds.vr.business.model.VRTemplateNo vrTemplateNo) {
		return _vrTemplateNoLocalService.addVRTemplateNo(vrTemplateNo);
	}

	/**
	* Creates a new vr template no with the primary key. Does not add the vr template no to the database.
	*
	* @param id the primary key for the new vr template no
	* @return the new vr template no
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo createVRTemplateNo(long id) {
		return _vrTemplateNoLocalService.createVRTemplateNo(id);
	}

	/**
	* Deletes the vr template no from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTemplateNo the vr template no
	* @return the vr template no that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo deleteVRTemplateNo(
		com.fds.vr.business.model.VRTemplateNo vrTemplateNo) {
		return _vrTemplateNoLocalService.deleteVRTemplateNo(vrTemplateNo);
	}

	/**
	* Deletes the vr template no with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no that was removed
	* @throws PortalException if a vr template no with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo deleteVRTemplateNo(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTemplateNoLocalService.deleteVRTemplateNo(id);
	}

	@Override
	public com.fds.vr.business.model.VRTemplateNo fetchVRTemplateNo(long id) {
		return _vrTemplateNoLocalService.fetchVRTemplateNo(id);
	}

	@Override
	public com.fds.vr.business.model.VRTemplateNo getByPattern(
		java.lang.String patternNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrTemplateNoLocalService.getByPattern(patternNo);
	}

	@Override
	public com.fds.vr.business.model.VRTemplateNo getByPatternYear(
		java.lang.String patternNo, int year)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vrTemplateNoLocalService.getByPatternYear(patternNo, year);
	}

	/**
	* Returns the vr template no with the primary key.
	*
	* @param id the primary key of the vr template no
	* @return the vr template no
	* @throws PortalException if a vr template no with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo getVRTemplateNo(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTemplateNoLocalService.getVRTemplateNo(id);
	}

	/**
	* Updates the vr template no in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTemplateNo the vr template no
	* @return the vr template no that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRTemplateNo updateVRTemplateNo(
		com.fds.vr.business.model.VRTemplateNo vrTemplateNo) {
		return _vrTemplateNoLocalService.updateVRTemplateNo(vrTemplateNo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrTemplateNoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrTemplateNoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrTemplateNoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTemplateNoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrTemplateNoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr template nos.
	*
	* @return the number of vr template nos
	*/
	@Override
	public int getVRTemplateNosCount() {
		return _vrTemplateNoLocalService.getVRTemplateNosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrTemplateNoLocalService.getOSGiServiceIdentifier();
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
		return _vrTemplateNoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTemplateNoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrTemplateNoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vr template nos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTemplateNoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr template nos
	* @param end the upper bound of the range of vr template nos (not inclusive)
	* @return the range of vr template nos
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRTemplateNo> getVRTemplateNos(
		int start, int end) {
		return _vrTemplateNoLocalService.getVRTemplateNos(start, end);
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
		return _vrTemplateNoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrTemplateNoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRTemplateNoLocalService getWrappedService() {
		return _vrTemplateNoLocalService;
	}

	@Override
	public void setWrappedService(
		VRTemplateNoLocalService vrTemplateNoLocalService) {
		_vrTemplateNoLocalService = vrTemplateNoLocalService;
	}

	private VRTemplateNoLocalService _vrTemplateNoLocalService;
}