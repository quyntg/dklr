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

import com.fds.vr.business.exception.NoSuchVRIssueException;
import com.fds.vr.business.model.VRIssue;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Company;
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
 * Provides the local service interface for VRIssue. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRIssueLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRIssueLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRIssueLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRIssueLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueLocalServiceUtil} to access the vr issue local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRIssueLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr issue to the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRIssue addVRIssue(VRIssue vrIssue);

	public VRIssue createVRIssue(VRIssue vrIssue);

	/**
	* Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	*
	* @param id the primary key for the new vr issue
	* @return the new vr issue
	*/
	public VRIssue createVRIssue(long id);

	/**
	* Deletes the vr issue from the database. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRIssue deleteVRIssue(VRIssue vrIssue);

	/**
	* Deletes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue that was removed
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRIssue deleteVRIssue(long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRIssue fetchVRIssue(long id);

	public VRIssue findByMT_DID(long mtCore, long dossierId);

	/**
	* Returns the vr issue with the primary key.
	*
	* @param id the primary key of the vr issue
	* @return the vr issue
	* @throws PortalException if a vr issue with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRIssue getVRIssue(long id) throws PortalException;

	public VRIssue updateDigitalIssueStatus(long id, int digitalIssueStatus,
		Company company) throws PortalException;

	public VRIssue updateVRIssue(VRIssue object, Company company)
		throws PortalException, SystemException;

	/**
	* Updates the vr issue in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrIssue the vr issue
	* @return the vr issue that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRIssue updateVRIssue(VRIssue vrIssue);

	public VRIssue updateVRIssue(
		Map<java.lang.String, java.lang.String> mapValue, int mtCore,
		boolean flagExits) throws NoSuchVRIssueException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	public JSONObject adminProcess(JSONObject objectData, long dossierId,
		long mtCore) throws java.lang.Exception;

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
	* Returns the number of vr issues.
	*
	* @return the number of vr issues
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRIssuesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus) throws PortalException, SystemException;

	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) throws PortalException, SystemException;

	public List<VRIssue> findBycopreportno(long mtCore,
		java.lang.String copreportno) throws PortalException, SystemException;

	public List<VRIssue> findBycorporationId(long mtCore,
		java.lang.String corporationId) throws PortalException, SystemException;

	public List<VRIssue> findBydossierId(long mtCore, long dossierId)
		throws PortalException, SystemException;

	public List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId) throws PortalException, SystemException;

	public List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId) throws PortalException, SystemException;

	public List<VRIssue> findBystampIssueNo(long mtCore,
		java.lang.String stampIssueNo) throws PortalException, SystemException;

	public List<VRIssue> findByverifyCorporationId(long mtCore,
		java.lang.String verifyCorporationId)
		throws PortalException, SystemException;

	/**
	* Returns a range of all the vr issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issues
	* @param end the upper bound of the range of vr issues (not inclusive)
	* @return the range of vr issues
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRIssue> getVRIssues(int start, int end);

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