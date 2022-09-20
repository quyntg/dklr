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
 * Provides a wrapper for {@link VRMigrateReviewLocalService}.
 *
 * @author LamTV
 * @see VRMigrateReviewLocalService
 * @generated
 */
@ProviderType
public class VRMigrateReviewLocalServiceWrapper
	implements VRMigrateReviewLocalService,
		ServiceWrapper<VRMigrateReviewLocalService> {
	public VRMigrateReviewLocalServiceWrapper(
		VRMigrateReviewLocalService vrMigrateReviewLocalService) {
		_vrMigrateReviewLocalService = vrMigrateReviewLocalService;
	}

	/**
	* Adds the vr migrate review to the database. Also notifies the appropriate model listeners.
	*
	* @param vrMigrateReview the vr migrate review
	* @return the vr migrate review that was added
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview addVRMigrateReview(
		com.fds.vr.business.model.VRMigrateReview vrMigrateReview) {
		return _vrMigrateReviewLocalService.addVRMigrateReview(vrMigrateReview);
	}

	/**
	* Creates a new vr migrate review with the primary key. Does not add the vr migrate review to the database.
	*
	* @param id the primary key for the new vr migrate review
	* @return the new vr migrate review
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview createVRMigrateReview(
		long id) {
		return _vrMigrateReviewLocalService.createVRMigrateReview(id);
	}

	/**
	* Deletes the vr migrate review from the database. Also notifies the appropriate model listeners.
	*
	* @param vrMigrateReview the vr migrate review
	* @return the vr migrate review that was removed
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview deleteVRMigrateReview(
		com.fds.vr.business.model.VRMigrateReview vrMigrateReview) {
		return _vrMigrateReviewLocalService.deleteVRMigrateReview(vrMigrateReview);
	}

	/**
	* Deletes the vr migrate review with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review that was removed
	* @throws PortalException if a vr migrate review with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview deleteVRMigrateReview(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMigrateReviewLocalService.deleteVRMigrateReview(id);
	}

	@Override
	public com.fds.vr.business.model.VRMigrateReview fetchVRMigrateReview(
		long id) {
		return _vrMigrateReviewLocalService.fetchVRMigrateReview(id);
	}

	/**
	* Returns the vr migrate review with the primary key.
	*
	* @param id the primary key of the vr migrate review
	* @return the vr migrate review
	* @throws PortalException if a vr migrate review with the primary key could not be found
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview getVRMigrateReview(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMigrateReviewLocalService.getVRMigrateReview(id);
	}

	/**
	* Updates the vr migrate review in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrMigrateReview the vr migrate review
	* @return the vr migrate review that was updated
	*/
	@Override
	public com.fds.vr.business.model.VRMigrateReview updateVRMigrateReview(
		com.fds.vr.business.model.VRMigrateReview vrMigrateReview) {
		return _vrMigrateReviewLocalService.updateVRMigrateReview(vrMigrateReview);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrMigrateReviewLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrMigrateReviewLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrMigrateReviewLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMigrateReviewLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrMigrateReviewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr migrate reviews.
	*
	* @return the number of vr migrate reviews
	*/
	@Override
	public int getVRMigrateReviewsCount() {
		return _vrMigrateReviewLocalService.getVRMigrateReviewsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrMigrateReviewLocalService.getOSGiServiceIdentifier();
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
		return _vrMigrateReviewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrMigrateReviewLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vrMigrateReviewLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.business.model.VRMigrateReview> findByTaskMigrateId(
		int taskMigrationID, int start, int end) {
		return _vrMigrateReviewLocalService.findByTaskMigrateId(taskMigrationID,
			start, end);
	}

	/**
	* Returns a range of all the vr migrate reviews.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr migrate reviews
	* @param end the upper bound of the range of vr migrate reviews (not inclusive)
	* @return the range of vr migrate reviews
	*/
	@Override
	public java.util.List<com.fds.vr.business.model.VRMigrateReview> getVRMigrateReviews(
		int start, int end) {
		return _vrMigrateReviewLocalService.getVRMigrateReviews(start, end);
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
		return _vrMigrateReviewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vrMigrateReviewLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRMigrateReviewLocalService getWrappedService() {
		return _vrMigrateReviewLocalService;
	}

	@Override
	public void setWrappedService(
		VRMigrateReviewLocalService vrMigrateReviewLocalService) {
		_vrMigrateReviewLocalService = vrMigrateReviewLocalService;
	}

	private VRMigrateReviewLocalService _vrMigrateReviewLocalService;
}