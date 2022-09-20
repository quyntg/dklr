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

import com.fds.vr.business.model.VROutputSheetDetails;

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
 * Provides the local service interface for VROutputSheetDetails. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VROutputSheetDetailsLocalServiceUtil
 * @see com.fds.vr.business.service.base.VROutputSheetDetailsLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VROutputSheetDetailsLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VROutputSheetDetailsLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VROutputSheetDetailsLocalServiceUtil} to access the vr output sheet details local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VROutputSheetDetailsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr output sheet details to the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VROutputSheetDetails addVROutputSheetDetails(
		VROutputSheetDetails vrOutputSheetDetails);

	public VROutputSheetDetails createVROutputSheetDetails(
		VROutputSheetDetails object) throws SystemException;

	/**
	* Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	*
	* @param id the primary key for the new vr output sheet details
	* @return the new vr output sheet details
	*/
	public VROutputSheetDetails createVROutputSheetDetails(long id);

	/**
	* Deletes the vr output sheet details from the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VROutputSheetDetails deleteVROutputSheetDetails(
		VROutputSheetDetails vrOutputSheetDetails);

	/**
	* Deletes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details that was removed
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VROutputSheetDetails deleteVROutputSheetDetails(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VROutputSheetDetails fetchVROutputSheetDetails(long id);

	/**
	* Returns the vr output sheet details with the primary key.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VROutputSheetDetails getVROutputSheetDetails(long id)
		throws PortalException;

	public VROutputSheetDetails updateOutputSheetDetails(long id, long mtCore,
		java.lang.Long inputSheetId, java.lang.Long outputSheetId,
		java.lang.Long bookId, java.lang.Long issueVehicleCertificateId,
		java.lang.Long certificateId, java.lang.String certificateNumber,
		Date certificateDate, java.lang.String vehicleClass,
		java.lang.String stampType, java.lang.String stampShortNo,
		java.lang.Long serialStartNo, java.lang.Long serialEndNo,
		java.lang.Long subTotalInDocument, java.lang.Long subTotalQuantities,
		java.lang.Long unitPrice, java.lang.Long totalAmount,
		java.lang.Long totalInUse, java.lang.Long totalNotUsed,
		java.lang.Long totalLost, java.lang.Long totalCancelled,
		java.lang.Long totalReturned, java.lang.String remark)
		throws PortalException, SystemException;

	/**
	* Updates the vr output sheet details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was updated
	* @throws SystemException
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VROutputSheetDetails updateVROutputSheetDetails(
		VROutputSheetDetails vrOutputSheetDetails) throws SystemException;

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
	* Returns the number of vr output sheet detailses.
	*
	* @return the number of vr output sheet detailses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVROutputSheetDetailsesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId) throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId) throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId)
		throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType)
		throws PortalException, SystemException;

	public List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId) throws PortalException, SystemException;

	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore,
		java.lang.String certificateNumber)
		throws PortalException, SystemException;

	public List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId)
		throws PortalException, SystemException;

	/**
	* Returns a range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of vr output sheet detailses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VROutputSheetDetails> getVROutputSheetDetailses(int start,
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

	public void updateJSONArray(long outputSheetId,
		java.lang.Long corporationId, java.lang.Long outputSheetType,
		java.lang.String details, java.lang.Long isApproval)
		throws PortalException, SystemException;
}