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

import com.fds.vr.business.model.VRProductionPlant;

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

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Provides the local service interface for VRProductionPlant. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRProductionPlantLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRProductionPlantLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRProductionPlantLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRProductionPlantLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionPlantLocalServiceUtil} to access the vr production plant local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRProductionPlantLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr production plant to the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRProductionPlant addVRProductionPlant(
		VRProductionPlant vrProductionPlant);

	public VRProductionPlant adminProcessData(JSONObject objectData,
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode);

	public VRProductionPlant createVRProductionPlant(VRProductionPlant object)
		throws SystemException;

	/**
	* Creates a new vr production plant with the primary key. Does not add the vr production plant to the database.
	*
	* @param id the primary key for the new vr production plant
	* @return the new vr production plant
	*/
	public VRProductionPlant createVRProductionPlant(long id);

	/**
	* Deletes the vr production plant from the database. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRProductionPlant deleteVRProductionPlant(
		VRProductionPlant vrProductionPlant);

	/**
	* Deletes the vr production plant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant that was removed
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRProductionPlant deleteVRProductionPlant(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRProductionPlant fetchVRProductionPlant(long id);

	public VRProductionPlant findByF_MT_APP_FORM_ID(long mtCore,
		long applicantProfileId, long registrationFormId);

	public VRProductionPlant findByproductionPlantCode(
		java.lang.String productionPlantCode);

	/**
	* Returns the vr production plant with the primary key.
	*
	* @param id the primary key of the vr production plant
	* @return the vr production plant
	* @throws PortalException if a vr production plant with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRProductionPlant getVRProductionPlant(long id)
		throws PortalException;

	public VRProductionPlant updateProductionPlant(
		LinkedHashMap<java.lang.String, java.lang.String> mapValues);

	/**
	* Updates the vr production plant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrProductionPlant the vr production plant
	* @return the vr production plant that was updated
	* @throws SystemException
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRProductionPlant updateVRProductionPlant(
		VRProductionPlant vrProductionPlant) throws SystemException;

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
	* Returns the number of vr production plants.
	*
	* @return the number of vr production plants
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRProductionPlantsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRProductionPlant> findByApplicantId(long applicantProfileId,
		int start, int end);

	public List<VRProductionPlant> findByRegistrationFormId(long mtCore,
		long applicantProfileId, long registrationId);

	public List<VRProductionPlant> findBymappingMA_XUONG_LR(long mtCore,
		java.lang.String mappingMA_CTY, java.lang.String mappingMA_XUONG_LR);

	public List<VRProductionPlant> findBymappingStatus(long mtCore,
		java.lang.String mappingStatus);

	public List<VRProductionPlant> findByproductionPlantCode(long mtCore,
		long applicantProfileId, java.lang.String productionPlantCode);

	public List<VRProductionPlant> findByproductionPlantName(long mtCore,
		long applicantProfileId, java.lang.String productionPlantName);

	public List<VRProductionPlant> findByproductionPlantName_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantAddress);

	public List<VRProductionPlant> findByproductionPlantRep_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantRepresentative,
		java.lang.String productionPlantAddress);

	public List<VRProductionPlant> findByproductionPlantStatus(long mtCore,
		java.lang.String productionPlantStatus);

	public List<VRProductionPlant> findByproductionPlantStatus_PPAddress(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantAddress,
		java.lang.String productionPlantStatus);

	public List<VRProductionPlant> findByproductionPlantStatus_PPCode(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantCode,
		java.lang.String productionPlantStatus);

	public List<VRProductionPlant> findByproductionPlantStatus_PPName(
		long mtCore, long applicantProfileId,
		java.lang.String productionPlantName,
		java.lang.String productionPlantStatus);

	public List<VRProductionPlant> findByproductionPlantType(long mtCore,
		java.lang.String productionPlantType);

	/**
	* Returns a range of all the vr production plants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRProductionPlantModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production plants
	* @param end the upper bound of the range of vr production plants (not inclusive)
	* @return the range of vr production plants
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRProductionPlant> getVRProductionPlants(int start, int end);

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