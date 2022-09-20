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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ResourceUser. This utility wraps
 * {@link org.opencps.usermgt.service.impl.ResourceUserLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavu
 * @see ResourceUserLocalService
 * @see org.opencps.usermgt.service.base.ResourceUserLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.impl.ResourceUserLocalServiceImpl
 * @generated
 */
@ProviderType
public class ResourceUserLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.usermgt.service.impl.ResourceUserLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.portal.kernel.search.Hits luceneSearchEngine(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.Sort[] sorts, int start, int end,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService()
				   .luceneSearchEngine(params, sorts, start, end, searchContext);
	}

	/**
	* Returns the number of resource users.
	*
	* @return the number of resource users
	*/
	public static int getResourceUsersCount() {
		return getService().getResourceUsersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.ResourceUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.ResourceUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<org.opencps.usermgt.model.ResourceUser> findByF_className_classPK(
		long groupId, java.lang.String className, java.lang.String classPK) {
		return getService()
				   .findByF_className_classPK(groupId, className, classPK);
	}

	/**
	* Returns a range of all the resource users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.ResourceUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resource users
	* @param end the upper bound of the range of resource users (not inclusive)
	* @return the range of resource users
	*/
	public static java.util.List<org.opencps.usermgt.model.ResourceUser> getResourceUsers(
		int start, int end) {
		return getService().getResourceUsers(start, end);
	}

	/**
	* Returns all the resource users matching the UUID and company.
	*
	* @param uuid the UUID of the resource users
	* @param companyId the primary key of the company
	* @return the matching resource users, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.usermgt.model.ResourceUser> getResourceUsersByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getResourceUsersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of resource users matching the UUID and company.
	*
	* @param uuid the UUID of the resource users
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of resource users
	* @param end the upper bound of the range of resource users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching resource users, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.usermgt.model.ResourceUser> getResourceUsersByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.usermgt.model.ResourceUser> orderByComparator) {
		return getService()
				   .getResourceUsersByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	public static long countLuceneSearchEngine(
		java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.search.ParseException,
			com.liferay.portal.kernel.search.SearchException {
		return getService().countLuceneSearchEngine(params, searchContext);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.opencps.usermgt.model.ResourceUser addResourceUser(
		long userId, long groupId, java.lang.String className,
		java.lang.String classPK, long toUserId, java.lang.String fullname,
		java.lang.String email, boolean readonly,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException,
			com.liferay.portal.kernel.exception.NoSuchUserException {
		return getService()
				   .addResourceUser(userId, groupId, className, classPK,
			toUserId, fullname, email, readonly, serviceContext);
	}

	/**
	* Adds the resource user to the database. Also notifies the appropriate model listeners.
	*
	* @param resourceUser the resource user
	* @return the resource user that was added
	*/
	public static org.opencps.usermgt.model.ResourceUser addResourceUser(
		org.opencps.usermgt.model.ResourceUser resourceUser) {
		return getService().addResourceUser(resourceUser);
	}

	/**
	* Creates a new resource user with the primary key. Does not add the resource user to the database.
	*
	* @param resourceUserId the primary key for the new resource user
	* @return the new resource user
	*/
	public static org.opencps.usermgt.model.ResourceUser createResourceUser(
		long resourceUserId) {
		return getService().createResourceUser(resourceUserId);
	}

	/**
	* Deletes the resource user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceUserId the primary key of the resource user
	* @return the resource user that was removed
	* @throws PortalException if a resource user with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.ResourceUser deleteResourceUser(
		long resourceUserId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteResourceUser(resourceUserId);
	}

	/**
	* @param dictCollectionId
	* @param serviceContext
	* @return
	* @throws Exception
	*/
	public static org.opencps.usermgt.model.ResourceUser deleteResourceUser(
		long resourceUserId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException {
		return getService().deleteResourceUser(resourceUserId, serviceContext);
	}

	/**
	* Deletes the resource user from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceUser the resource user
	* @return the resource user that was removed
	*/
	public static org.opencps.usermgt.model.ResourceUser deleteResourceUser(
		org.opencps.usermgt.model.ResourceUser resourceUser) {
		return getService().deleteResourceUser(resourceUser);
	}

	public static org.opencps.usermgt.model.ResourceUser fetchByF_className_classPK_toUserId(
		long groupId, java.lang.String className, java.lang.String classPK,
		long toUserId) {
		return getService()
				   .fetchByF_className_classPK_toUserId(groupId, className,
			classPK, toUserId);
	}

	public static org.opencps.usermgt.model.ResourceUser fetchResourceUser(
		long resourceUserId) {
		return getService().fetchResourceUser(resourceUserId);
	}

	/**
	* Returns the resource user matching the UUID and group.
	*
	* @param uuid the resource user's UUID
	* @param groupId the primary key of the group
	* @return the matching resource user, or <code>null</code> if a matching resource user could not be found
	*/
	public static org.opencps.usermgt.model.ResourceUser fetchResourceUserByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchResourceUserByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the resource user with the primary key.
	*
	* @param resourceUserId the primary key of the resource user
	* @return the resource user
	* @throws PortalException if a resource user with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.ResourceUser getResourceUser(
		long resourceUserId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getResourceUser(resourceUserId);
	}

	/**
	* Returns the resource user matching the UUID and group.
	*
	* @param uuid the resource user's UUID
	* @param groupId the primary key of the group
	* @return the matching resource user
	* @throws PortalException if a matching resource user could not be found
	*/
	public static org.opencps.usermgt.model.ResourceUser getResourceUserByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getResourceUserByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.usermgt.model.ResourceUser updateResourceUser(
		long userId, long resourceUserId, java.lang.String className,
		java.lang.String classPK, long toUserId, java.lang.String fullname,
		java.lang.String email, boolean readonly,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException,
			com.liferay.portal.kernel.exception.NoSuchUserException {
		return getService()
				   .updateResourceUser(userId, resourceUserId, className,
			classPK, toUserId, fullname, email, readonly, serviceContext);
	}

	/**
	* Updates the resource user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resourceUser the resource user
	* @return the resource user that was updated
	*/
	public static org.opencps.usermgt.model.ResourceUser updateResourceUser(
		org.opencps.usermgt.model.ResourceUser resourceUser) {
		return getService().updateResourceUser(resourceUser);
	}

	public static ResourceUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ResourceUserLocalService, ResourceUserLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ResourceUserLocalService.class);
}