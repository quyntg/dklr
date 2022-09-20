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

import com.fds.vr.business.model.VRCorporationAttendee;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VRCorporationAttendee. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRCorporationAttendeeLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRCorporationAttendeeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCorporationAttendeeLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRCorporationAttendeeLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationAttendeeLocalServiceUtil} to access the vr corporation attendee local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCorporationAttendeeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr corporation attendee to the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationAttendee the vr corporation attendee
	* @return the vr corporation attendee that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCorporationAttendee addVRCorporationAttendee(
		VRCorporationAttendee vrCorporationAttendee);

	/**
	* Creates a new vr corporation attendee with the primary key. Does not add the vr corporation attendee to the database.
	*
	* @param id the primary key for the new vr corporation attendee
	* @return the new vr corporation attendee
	*/
	public VRCorporationAttendee createVRCorporationAttendee(long id);

	/**
	* Deletes the vr corporation attendee from the database. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationAttendee the vr corporation attendee
	* @return the vr corporation attendee that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCorporationAttendee deleteVRCorporationAttendee(
		VRCorporationAttendee vrCorporationAttendee);

	/**
	* Deletes the vr corporation attendee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee that was removed
	* @throws PortalException if a vr corporation attendee with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCorporationAttendee deleteVRCorporationAttendee(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCorporationAttendee fetchVRCorporationAttendee(long id);

	/**
	* Returns the vr corporation attendee with the primary key.
	*
	* @param id the primary key of the vr corporation attendee
	* @return the vr corporation attendee
	* @throws PortalException if a vr corporation attendee with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCorporationAttendee getVRCorporationAttendee(long id)
		throws PortalException;

	/**
	* Updates the vr corporation attendee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrCorporationAttendee the vr corporation attendee
	* @return the vr corporation attendee that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCorporationAttendee updateVRCorporationAttendee(
		VRCorporationAttendee vrCorporationAttendee);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of vr corporation attendees.
	*
	* @return the number of vr corporation attendees
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRCorporationAttendeesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<VRCorporationAttendee> findByApplicantIdNo(
		java.lang.String applicantIdNo);

	public List<VRCorporationAttendee> findByApplicantIdNoInspectionDate(
		java.lang.String applicantIdNo, Date inspectionDate);

	public List<VRCorporationAttendee> findByCorporationCode(
		java.lang.String corporationCode);

	public List<VRCorporationAttendee> findByCorporationCodeInspectionDate(
		java.lang.String corporationCode, Date inspectionDate);

	public List<VRCorporationAttendee> findByDossierId(long dossierId);

	public List<VRCorporationAttendee> findByDossierIdActivityCategory(
		long dossierId, java.lang.String activityCatetory);

	public List<VRCorporationAttendee> findByDossierIdAssignType(
		long dossierId, java.lang.String assignType);

	public List<VRCorporationAttendee> findByInspectionDate(
		java.lang.Integer leaderId, Date inspectionDate);

	public List<VRCorporationAttendee> findByLeaderId(
		java.lang.Integer leaderId);

	public List<VRCorporationAttendee> findByManagerId(
		java.lang.Integer managerId);

	public List<VRCorporationAttendee> findByManagerIdInspectionDate(
		java.lang.Integer managerId, Date inspectionDate);

	/**
	* Returns a range of all the vr corporation attendees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCorporationAttendeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation attendees
	* @param end the upper bound of the range of vr corporation attendees (not inclusive)
	* @return the range of vr corporation attendees
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRCorporationAttendee> getVRCorporationAttendees(int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRCorporationAttendee> getVRCorporationByUserId(int mtCore,
		long userId, java.lang.String fromDateConvert,
		java.lang.String toDateConvert);

	public long counData(java.lang.String sql) throws SystemException;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}