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

import com.fds.vr.business.model.VRIssueVehiclecertificate;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
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

import java.util.List;
import java.util.Map;

/**
 * Provides the local service interface for VRIssueVehiclecertificate. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRIssueVehiclecertificateLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRIssueVehiclecertificateLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRIssueVehiclecertificateLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRIssueVehiclecertificateLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueVehiclecertificateLocalServiceUtil} to access the vr issue vehiclecertificate local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRIssueVehiclecertificateLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr issue vehiclecertificate to the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRIssueVehiclecertificate addVRIssueVehiclecertificate(
		VRIssueVehiclecertificate vrIssueVehiclecertificate);

	/**
	* Creates a new vr issue vehiclecertificate with the primary key. Does not add the vr issue vehiclecertificate to the database.
	*
	* @param id the primary key for the new vr issue vehiclecertificate
	* @return the new vr issue vehiclecertificate
	*/
	public VRIssueVehiclecertificate createVRIssueVehiclecertificate(long id);

	/**
	* Deletes the vr issue vehiclecertificate from the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRIssueVehiclecertificate deleteVRIssueVehiclecertificate(
		VRIssueVehiclecertificate vrIssueVehiclecertificate);

	/**
	* Deletes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	* @throws PortalException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRIssueVehiclecertificate deleteVRIssueVehiclecertificate(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRIssueVehiclecertificate fetchVRIssueVehiclecertificate(long id);

	/**
	* Returns the vr issue vehiclecertificate with the primary key.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate
	* @throws PortalException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRIssueVehiclecertificate getVRIssueVehiclecertificate(long id)
		throws PortalException;

	public VRIssueVehiclecertificate updateVRIssueVehicleCertificate(
		Map<java.lang.String, java.lang.String> mapValue, int mtCore);

	/**
	* Updates the vr issue vehiclecertificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRIssueVehiclecertificate updateVRIssueVehiclecertificate(
		VRIssueVehiclecertificate vrIssueVehiclecertificate);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	public JSONObject adminProcess(JSONArray arrayData, long issueId,
		long dossierId, long mtCore, java.lang.String issueType)
		throws java.lang.Exception;

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
	* Returns the number of vr issue vehiclecertificates.
	*
	* @return the number of vr issue vehiclecertificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRIssueVehiclecertificatesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRIssueVehiclecertificate> findByIssueId(long issueId,
		int start, int end);

	public List<VRIssueVehiclecertificate> findByIssueId_MtCore(long mtCore,
		long issueId, int start, int end)
		throws PortalException, SystemException;

	public List<VRIssueVehiclecertificate> findBycertificateId(long mtCore,
		long dossierId, long certificateId)
		throws PortalException, SystemException;

	public List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId) throws PortalException, SystemException;

	/**
	* Returns a range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of vr issue vehiclecertificates
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRIssueVehiclecertificate> getVRIssueVehiclecertificates(
		int start, int end);

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

	public void deleteBydossierId(long mtCore, long dossierId);
}