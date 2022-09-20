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

import com.fds.vr.business.model.VRCOPProdEquipment;
import com.fds.vr.business.model.VRCOPProductType;
import com.fds.vr.business.model.VRCOPProductionPlantEmployee;
import com.fds.vr.business.model.VRCOPProductionPlantEquipment;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.model.VRCOPReportRepository;

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
 * Provides the local service interface for VRCOPReportRepository. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRCOPReportRepositoryLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRCOPReportRepositoryLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCOPReportRepositoryLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRCOPReportRepositoryLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPReportRepositoryLocalServiceUtil} to access the vrcop report repository local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCOPReportRepositoryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vrcop report repository to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCOPReportRepository addVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository);

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public VRCOPReportRepository createVRCOPReportRepository(long id);

	/**
	* Deletes the vrcop report repository from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCOPReportRepository deleteVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository);

	/**
	* Deletes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRCOPReportRepository deleteVRCOPReportRepository(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCOPReportRepository fetchVRCOPReportRepository(long id);

	public VRCOPReportRepository findByDossierId_MTCore(long dossierId,
		long mtCore);

	public VRCOPReportRepository findBycopReportNo(long mtCore,
		java.lang.String copReportNo) throws PortalException, SystemException;

	/**
	* Returns the vrcop report repository with the primary key.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws PortalException if a vrcop report repository with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRCOPReportRepository getVRCOPReportRepository(long id)
		throws PortalException;

	public VRCOPReportRepository updateCOPReportRepository(
		Map<java.lang.String, java.lang.String> mapValues, int mtCore);

	/**
	* Updates the vrcop report repository in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopReportRepository the vrcop report repository
	* @return the vrcop report repository that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRCOPReportRepository updateVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository);

	public VRCOPReportRepository updateVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository, Company company);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	public JSONArray findData(java.lang.String sql,
		List<java.lang.String> columnNames, List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end) throws SystemException;

	public JSONObject adminProcessData(JSONObject objectData,
		JSONArray arrayVRCOPProductionPlantEmployee,
		JSONArray arrayVRCOPProductionPlantEquipment,
		JSONArray arrayVRCOPProdEquipment, JSONArray arrayVRCOPProductType,
		JSONArray arrayVRCOPReportAttach);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONObject getByCOPReportNo(long mtCore, java.lang.String COPReportNo)
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
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRCOPReportRepositoriesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRCOPReportRepository> findByMtCore_ProductionPlantCode_COPClassification(
		long mtCore, java.lang.String productionPlantCode,
		java.lang.String copClassification, int start, int end);

	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore,
		long applicantProfileId) throws PortalException, SystemException;

	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore,
		java.lang.String copReportStatus)
		throws PortalException, SystemException;

	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode)
		throws PortalException, SystemException;

	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName,
		java.lang.String productionPlantAddress)
		throws PortalException, SystemException;

	public List<VRCOPProdEquipment> findVRCOPProdEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end);

	public List<VRCOPProductType> findVRCOPProductTypesByDossierId(
		long dossierId, long mtCore, int start, int end);

	public List<VRCOPProductionPlantEmployee> findVRCOPProductionPlantEmployeesByDossierId(
		long dossierId, long mtCore, int start, int end);

	public List<VRCOPProductionPlantEquipment> findVRCOPProductionPlantEquipmentsByDossierId(
		long dossierId, long mtCore, int start, int end);

	public List<VRCOPReportAttach> findVRCOPReportAttachsByDossierId(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRCOPReportRepository> getVRCOPReportRepositories(int start,
		int end);

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