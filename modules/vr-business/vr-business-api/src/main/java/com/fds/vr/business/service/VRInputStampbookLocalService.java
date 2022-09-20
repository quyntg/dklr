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

import com.fds.vr.business.model.VRInputStampbook;

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

/**
 * Provides the local service interface for VRInputStampbook. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRInputStampbookLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRInputStampbookLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRInputStampbookLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRInputStampbookLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputStampbookLocalServiceUtil} to access the vr input stampbook local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRInputStampbookLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr input stampbook to the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRInputStampbook addVRInputStampbook(
		VRInputStampbook vrInputStampbook);

	/**
	* Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	*
	* @param id the primary key for the new vr input stampbook
	* @return the new vr input stampbook
	*/
	public VRInputStampbook createVRInputStampbook(long id);

	public VRInputStampbook deleteInputStampbook(long id);

	/**
	* Deletes the vr input stampbook from the database. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRInputStampbook deleteVRInputStampbook(
		VRInputStampbook vrInputStampbook);

	/**
	* Deletes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook that was removed
	* @throws PortalException if a vr input stampbook with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRInputStampbook deleteVRInputStampbook(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRInputStampbook fetchVRInputStampbook(long id);

	/**
	* Returns the vr input stampbook with the primary key.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook
	* @throws PortalException if a vr input stampbook with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRInputStampbook getVRInputStampbook(long id)
		throws PortalException;

	public VRInputStampbook updateByOutputSheet(long bookId,
		long subTotalInDocument, long serialStartNo, long serialEndNo,
		java.lang.Long purchaserId, java.lang.Long corporationId,
		long outputSheetType) throws PortalException, SystemException;

	public VRInputStampbook updateInputStambook(long id, long mtCore,
		long inputSheetId, java.lang.Long corporationId,
		java.lang.Long inputSheetType, java.lang.String vehicleClass,
		java.lang.String stampType, java.lang.String stampShortNo,
		java.lang.Long serialStartNo, java.lang.Long serialEndNo,
		java.lang.Long subTotalInDocument, java.lang.Long subTotalQuantities,
		java.lang.Long units, java.lang.Long unitPrice,
		java.lang.Long totalAmount, java.lang.Long totalInUse,
		java.lang.Long totalNotUsed, java.lang.Long sum1, java.lang.Long sum2,
		java.lang.Long sum3, java.lang.String remark, java.lang.Long isApproval)
		throws PortalException, SystemException;

	/**
	* Updates the vr input stampbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrInputStampbook the vr input stampbook
	* @return the vr input stampbook that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRInputStampbook updateVRInputStampbook(
		VRInputStampbook vrInputStampbook);

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
	* Returns the number of vr input stampbooks.
	*
	* @return the number of vr input stampbooks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRInputStampbooksCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) throws PortalException, SystemException;

	public List<VRInputStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) throws PortalException, SystemException;

	public List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws PortalException, SystemException;

	public List<VRInputStampbook> findBySum3GreaterThan()
		throws PortalException, SystemException;

	public List<VRInputStampbook> findByVRInputStampBookInventorys(
		java.lang.String vehicleClass, java.lang.String stampType, int start,
		int end);

	/**
	* Returns a range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of vr input stampbooks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRInputStampbook> getVRInputStampbooks(int start, int end);

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

	public long updateJSONArrayInputStambook(long inputSheetId,
		java.lang.Long corporationId, java.lang.Long inputSheetType,
		java.lang.String stampbooks, java.lang.Long isApproval)
		throws PortalException, SystemException;
}