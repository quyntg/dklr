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
 * Provides the local service utility for HmacAuthen. This utility wraps
 * {@link org.opencps.usermgt.service.impl.HmacAuthenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author khoavu
 * @see HmacAuthenLocalService
 * @see org.opencps.usermgt.service.base.HmacAuthenLocalServiceBaseImpl
 * @see org.opencps.usermgt.service.impl.HmacAuthenLocalServiceImpl
 * @generated
 */
@ProviderType
public class HmacAuthenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.opencps.usermgt.service.impl.HmacAuthenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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

	/**
	* Returns the number of hmac authens.
	*
	* @return the number of hmac authens
	*/
	public static int getHmacAuthensCount() {
		return getService().getHmacAuthensCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.HmacAuthenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.HmacAuthenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the hmac authens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.usermgt.model.impl.HmacAuthenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hmac authens
	* @param end the upper bound of the range of hmac authens (not inclusive)
	* @return the range of hmac authens
	*/
	public static java.util.List<org.opencps.usermgt.model.HmacAuthen> getHmacAuthens(
		int start, int end) {
		return getService().getHmacAuthens(start, end);
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

	/**
	* Adds the hmac authen to the database. Also notifies the appropriate model listeners.
	*
	* @param hmacAuthen the hmac authen
	* @return the hmac authen that was added
	*/
	public static org.opencps.usermgt.model.HmacAuthen addHmacAuthen(
		org.opencps.usermgt.model.HmacAuthen hmacAuthen) {
		return getService().addHmacAuthen(hmacAuthen);
	}

	/**
	* Creates a new hmac authen with the primary key. Does not add the hmac authen to the database.
	*
	* @param hmacAuthId the primary key for the new hmac authen
	* @return the new hmac authen
	*/
	public static org.opencps.usermgt.model.HmacAuthen createHmacAuthen(
		long hmacAuthId) {
		return getService().createHmacAuthen(hmacAuthId);
	}

	/**
	* Deletes the hmac authen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hmacAuthId the primary key of the hmac authen
	* @return the hmac authen that was removed
	* @throws PortalException if a hmac authen with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.HmacAuthen deleteHmacAuthen(
		long hmacAuthId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHmacAuthen(hmacAuthId);
	}

	/**
	* Deletes the hmac authen from the database. Also notifies the appropriate model listeners.
	*
	* @param hmacAuthen the hmac authen
	* @return the hmac authen that was removed
	*/
	public static org.opencps.usermgt.model.HmacAuthen deleteHmacAuthen(
		org.opencps.usermgt.model.HmacAuthen hmacAuthen) {
		return getService().deleteHmacAuthen(hmacAuthen);
	}

	public static org.opencps.usermgt.model.HmacAuthen fetchHmacAuthen(
		long hmacAuthId) {
		return getService().fetchHmacAuthen(hmacAuthId);
	}

	/**
	* Returns the hmac authen with the primary key.
	*
	* @param hmacAuthId the primary key of the hmac authen
	* @return the hmac authen
	* @throws PortalException if a hmac authen with the primary key could not be found
	*/
	public static org.opencps.usermgt.model.HmacAuthen getHmacAuthen(
		long hmacAuthId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHmacAuthen(hmacAuthId);
	}

	/**
	* Updates the hmac authen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hmacAuthen the hmac authen
	* @return the hmac authen that was updated
	*/
	public static org.opencps.usermgt.model.HmacAuthen updateHmacAuthen(
		org.opencps.usermgt.model.HmacAuthen hmacAuthen) {
		return getService().updateHmacAuthen(hmacAuthen);
	}

	public static HmacAuthenLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HmacAuthenLocalService, HmacAuthenLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HmacAuthenLocalService.class);
}