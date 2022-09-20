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
 * Provides the local service utility for JobPosWork. This utility wraps
 * {@link org.opencps.usermgt.service.impl.JobPosWorkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavu
 * @see JobPosWorkLocalService
 * @see org.opencps.usermgt.service.base.JobPosWorkLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.impl.JobPosWorkLocalServiceImpl
 * @generated
 */
@ProviderType
public class JobPosWorkLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.usermgt.service.impl.JobPosWorkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of job pos works.
	*
	* @return the number of job pos works
	*/
	public static int getJobPosWorksCount() {
		return getService().getJobPosWorksCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.JobPosWorkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.JobPosWorkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<org.opencps.usermgt.model.JobPosWork> findByF_JobPostId(
		long groupId, long jobPostId) {
		return getService().findByF_JobPostId(groupId, jobPostId);
	}

	/**
	* Returns a range of all the job pos works.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.JobPosWorkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job pos works
	* @param end the upper bound of the range of job pos works (not inclusive)
	* @return the range of job pos works
	*/
	public static java.util.List<org.opencps.usermgt.model.JobPosWork> getJobPosWorks(
		int start, int end) {
		return getService().getJobPosWorks(start, end);
	}

	/**
	* Returns all the job pos works matching the UUID and company.
	*
	* @param uuid the UUID of the job pos works
	* @param companyId the primary key of the company
	* @return the matching job pos works, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.usermgt.model.JobPosWork> getJobPosWorksByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getJobPosWorksByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of job pos works matching the UUID and company.
	*
	* @param uuid the UUID of the job pos works
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of job pos works
	* @param end the upper bound of the range of job pos works (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching job pos works, or an empty list if no matches were found
	*/
	public static java.util.List<org.opencps.usermgt.model.JobPosWork> getJobPosWorksByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.usermgt.model.JobPosWork> orderByComparator) {
		return getService()
				   .getJobPosWorksByUuidAndCompanyId(uuid, companyId, start,
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

	public static org.opencps.usermgt.model.JobPosWork addJobPosWork(
		long userId, long groupId, long jobPostId,
		java.lang.String checklistCat,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException,
			com.liferay.portal.kernel.exception.NoSuchUserException {
		return getService()
				   .addJobPosWork(userId, groupId, jobPostId, checklistCat,
			serviceContext);
	}

	/**
	* Adds the job pos work to the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosWork the job pos work
	* @return the job pos work that was added
	*/
	public static org.opencps.usermgt.model.JobPosWork addJobPosWork(
		org.opencps.usermgt.model.JobPosWork jobPosWork) {
		return getService().addJobPosWork(jobPosWork);
	}

	/**
	* Creates a new job pos work with the primary key. Does not add the job pos work to the database.
	*
	* @param jobPosWorkId the primary key for the new job pos work
	* @return the new job pos work
	*/
	public static org.opencps.usermgt.model.JobPosWork createJobPosWork(
		long jobPosWorkId) {
		return getService().createJobPosWork(jobPosWorkId);
	}

	/**
	* Deletes the job pos work with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosWorkId the primary key of the job pos work
	* @return the job pos work that was removed
	* @throws PortalException if a job pos work with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.JobPosWork deleteJobPosWork(
		long jobPosWorkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteJobPosWork(jobPosWorkId);
	}

	public static org.opencps.usermgt.model.JobPosWork deleteJobPosWork(
		long jobPosWorkId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException {
		return getService().deleteJobPosWork(jobPosWorkId, serviceContext);
	}

	/**
	* Deletes the job pos work from the database. Also notifies the appropriate model listeners.
	*
	* @param jobPosWork the job pos work
	* @return the job pos work that was removed
	*/
	public static org.opencps.usermgt.model.JobPosWork deleteJobPosWork(
		org.opencps.usermgt.model.JobPosWork jobPosWork) {
		return getService().deleteJobPosWork(jobPosWork);
	}

	public static org.opencps.usermgt.model.JobPosWork fetchByF_ChecklistCat(
		long groupId, long jobPostId, java.lang.String checklistCat) {
		return getService()
				   .fetchByF_ChecklistCat(groupId, jobPostId, checklistCat);
	}

	public static org.opencps.usermgt.model.JobPosWork fetchJobPosWork(
		long jobPosWorkId) {
		return getService().fetchJobPosWork(jobPosWorkId);
	}

	/**
	* Returns the job pos work matching the UUID and group.
	*
	* @param uuid the job pos work's UUID
	* @param groupId the primary key of the group
	* @return the matching job pos work, or <code>null</code> if a matching job pos work could not be found
	*/
	public static org.opencps.usermgt.model.JobPosWork fetchJobPosWorkByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchJobPosWorkByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the job pos work with the primary key.
	*
	* @param jobPosWorkId the primary key of the job pos work
	* @return the job pos work
	* @throws PortalException if a job pos work with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.JobPosWork getJobPosWork(
		long jobPosWorkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJobPosWork(jobPosWorkId);
	}

	/**
	* Returns the job pos work matching the UUID and group.
	*
	* @param uuid the job pos work's UUID
	* @param groupId the primary key of the group
	* @return the matching job pos work
	* @throws PortalException if a matching job pos work could not be found
	*/
	public static org.opencps.usermgt.model.JobPosWork getJobPosWorkByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJobPosWorkByUuidAndGroupId(uuid, groupId);
	}

	public static org.opencps.usermgt.model.JobPosWork updateJobPosWork(
		long userId, long jobPosWorkId, long jobPostId,
		java.lang.String checklistCat,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws backend.auth.api.exception.NotFoundException,
			backend.auth.api.exception.UnauthenticationException,
			backend.auth.api.exception.UnauthorizationException,
			com.liferay.portal.kernel.exception.NoSuchUserException {
		return getService()
				   .updateJobPosWork(userId, jobPosWorkId, jobPostId,
			checklistCat, serviceContext);
	}

	/**
	* Updates the job pos work in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobPosWork the job pos work
	* @return the job pos work that was updated
	*/
	public static org.opencps.usermgt.model.JobPosWork updateJobPosWork(
		org.opencps.usermgt.model.JobPosWork jobPosWork) {
		return getService().updateJobPosWork(jobPosWork);
	}

	public static JobPosWorkLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobPosWorkLocalService, JobPosWorkLocalService> _serviceTracker =
		ServiceTrackerFactory.open(JobPosWorkLocalService.class);
}