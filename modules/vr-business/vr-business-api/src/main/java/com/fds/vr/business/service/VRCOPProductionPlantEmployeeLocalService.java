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

import com.fds.vr.business.model.VRCOPProductionPlantEmployee;

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

import java.util.List;
import java.util.Map;

/**
 * Provides the local service interface for VRCOPProductionPlantEmployee. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRCOPProductionPlantEmployeeLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRCOPProductionPlantEmployeeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCOPProductionPlantEmployeeLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRCOPProductionPlantEmployeeLocalService
	extends BaseLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductionPlantEmployeeLocalServiceUtil} to access the vrcop production plant employee local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCOPProductionPlantEmployeeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vrcop production plant employee to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCOPProductionPlantEmployee addVRCOPProductionPlantEmployee(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee);

	/**
	* Creates a new vrcop production plant employee with the primary key. Does not add the vrcop production plant employee to the database.
	*
	* @param id the primary key for the new vrcop production plant employee
	* @return the new vrcop production plant employee
	*/
	public VRCOPProductionPlantEmployee createVRCOPProductionPlantEmployee(
		long id);

	/**
	* Deletes the vrcop production plant employee from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCOPProductionPlantEmployee deleteVRCOPProductionPlantEmployee(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee);

	/**
	* Deletes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	* @throws PortalException if a vrcop production plant employee with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCOPProductionPlantEmployee deleteVRCOPProductionPlantEmployee(
		long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCOPProductionPlantEmployee fetchVRCOPProductionPlantEmployee(
		long id);

	/**
	* Returns the vrcop production plant employee with the primary key.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee
	* @throws PortalException if a vrcop production plant employee with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCOPProductionPlantEmployee getVRCOPProductionPlantEmployee(long id)
		throws PortalException;

	public VRCOPProductionPlantEmployee updateCOPProductionPlantEmployee(
		Map<java.lang.String, java.lang.String> mapValues, int mtCore);

	/**
	* Updates the vrcop production plant employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCOPProductionPlantEmployee updateVRCOPProductionPlantEmployee(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray adminProcessData(JSONArray arrayData, long mtCore,
		long vrcopReportRepositoryId, long dossierId,
		java.lang.String dossierIdCTN, java.lang.String dossierNo);

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getByCOPReportNo(long mtCore, java.lang.String COPReportNo)
		throws PortalException, SystemException;

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
	* Returns the number of vrcop production plant employees.
	*
	* @return the number of vrcop production plant employees
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRCOPProductionPlantEmployeesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRCOPProductionPlantEmployee> findBycopReportNo_MtCore(
		long mtCore, java.lang.String copReportNo, int start, int end);

	public List<VRCOPProductionPlantEmployee> findBycopReportRepositoryID_MtCore(
		long mtCore, long copReportRepositoryID, int start, int end);

	/**
	* Returns a range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of vrcop production plant employees
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRCOPProductionPlantEmployee> getVRCOPProductionPlantEmployees(
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
}