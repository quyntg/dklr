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

package org.opencps.usermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VisibilityLocalService}.
 *
 * @author khoavu
 * @see VisibilityLocalService
 * @generated
 */
@ProviderType
public class VisibilityLocalServiceWrapper implements VisibilityLocalService,
	ServiceWrapper<VisibilityLocalService> {
	public VisibilityLocalServiceWrapper(
		VisibilityLocalService visibilityLocalService) {
		_visibilityLocalService = visibilityLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _visibilityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _visibilityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _visibilityLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _visibilityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _visibilityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _visibilityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of visibilities.
	*
	* @return the number of visibilities
	*/
	@Override
	public int getVisibilitiesCount() {
		return _visibilityLocalService.getVisibilitiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _visibilityLocalService.getOSGiServiceIdentifier();
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
		return _visibilityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.VisibilityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _visibilityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.VisibilityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _visibilityLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the visibilities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.VisibilityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visibilities
	* @param end the upper bound of the range of visibilities (not inclusive)
	* @return the range of visibilities
	*/
	@Override
	public java.util.List<org.opencps.usermgt.model.Visibility> getVisibilities(
		int start, int end) {
		return _visibilityLocalService.getVisibilities(start, end);
	}

	/**
	* Returns all the visibilities matching the UUID and company.
	*
	* @param uuid the UUID of the visibilities
	* @param companyId the primary key of the company
	* @return the matching visibilities, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.usermgt.model.Visibility> getVisibilitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _visibilityLocalService.getVisibilitiesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of visibilities matching the UUID and company.
	*
	* @param uuid the UUID of the visibilities
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of visibilities
	* @param end the upper bound of the range of visibilities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching visibilities, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.usermgt.model.Visibility> getVisibilitiesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.usermgt.model.Visibility> orderByComparator) {
		return _visibilityLocalService.getVisibilitiesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _visibilityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _visibilityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the visibility to the database. Also notifies the appropriate model listeners.
	*
	* @param visibility the visibility
	* @return the visibility that was added
	*/
	@Override
	public org.opencps.usermgt.model.Visibility addVisibility(
		org.opencps.usermgt.model.Visibility visibility) {
		return _visibilityLocalService.addVisibility(visibility);
	}

	/**
	* Creates a new visibility with the primary key. Does not add the visibility to the database.
	*
	* @param visibilityId the primary key for the new visibility
	* @return the new visibility
	*/
	@Override
	public org.opencps.usermgt.model.Visibility createVisibility(
		long visibilityId) {
		return _visibilityLocalService.createVisibility(visibilityId);
	}

	/**
	* Deletes the visibility with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visibilityId the primary key of the visibility
	* @return the visibility that was removed
	* @throws PortalException if a visibility with the primary key could not be found
	*/
	@Override
	public org.opencps.usermgt.model.Visibility deleteVisibility(
		long visibilityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _visibilityLocalService.deleteVisibility(visibilityId);
	}

	/**
	* Deletes the visibility from the database. Also notifies the appropriate model listeners.
	*
	* @param visibility the visibility
	* @return the visibility that was removed
	*/
	@Override
	public org.opencps.usermgt.model.Visibility deleteVisibility(
		org.opencps.usermgt.model.Visibility visibility) {
		return _visibilityLocalService.deleteVisibility(visibility);
	}

	@Override
	public org.opencps.usermgt.model.Visibility fetchVisibility(
		long visibilityId) {
		return _visibilityLocalService.fetchVisibility(visibilityId);
	}

	/**
	* Returns the visibility matching the UUID and group.
	*
	* @param uuid the visibility's UUID
	* @param groupId the primary key of the group
	* @return the matching visibility, or <code>null</code> if a matching visibility could not be found
	*/
	@Override
	public org.opencps.usermgt.model.Visibility fetchVisibilityByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _visibilityLocalService.fetchVisibilityByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the visibility with the primary key.
	*
	* @param visibilityId the primary key of the visibility
	* @return the visibility
	* @throws PortalException if a visibility with the primary key could not be found
	*/
	@Override
	public org.opencps.usermgt.model.Visibility getVisibility(long visibilityId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _visibilityLocalService.getVisibility(visibilityId);
	}

	/**
	* Returns the visibility matching the UUID and group.
	*
	* @param uuid the visibility's UUID
	* @param groupId the primary key of the group
	* @return the matching visibility
	* @throws PortalException if a matching visibility could not be found
	*/
	@Override
	public org.opencps.usermgt.model.Visibility getVisibilityByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _visibilityLocalService.getVisibilityByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the visibility in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param visibility the visibility
	* @return the visibility that was updated
	*/
	@Override
	public org.opencps.usermgt.model.Visibility updateVisibility(
		org.opencps.usermgt.model.Visibility visibility) {
		return _visibilityLocalService.updateVisibility(visibility);
	}

	@Override
	public VisibilityLocalService getWrappedService() {
		return _visibilityLocalService;
	}

	@Override
	public void setWrappedService(VisibilityLocalService visibilityLocalService) {
		_visibilityLocalService = visibilityLocalService;
	}

	private VisibilityLocalService _visibilityLocalService;
}