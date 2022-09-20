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

import com.fds.vr.business.model.VRClearingStampbook;

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
 * Provides the local service interface for VRClearingStampbook. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author LamTV
 * @see VRClearingStampbookLocalServiceUtil
 * @see com.fds.vr.business.service.base.VRClearingStampbookLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRClearingStampbookLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VRClearingStampbookLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRClearingStampbookLocalServiceUtil} to access the vr clearing stampbook local service. Add custom service methods to {@link com.fds.vr.business.service.impl.VRClearingStampbookLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the vr clearing stampbook to the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRClearingStampbook addVRClearingStampbook(
		VRClearingStampbook vrClearingStampbook);

	/**
	* Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	*
	* @param id the primary key for the new vr clearing stampbook
	* @return the new vr clearing stampbook
	*/
	public VRClearingStampbook createVRClearingStampbook(long id);

	/**
	* Deletes the vr clearing stampbook from the database. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRClearingStampbook deleteVRClearingStampbook(
		VRClearingStampbook vrClearingStampbook);

	/**
	* Deletes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VRClearingStampbook deleteVRClearingStampbook(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRClearingStampbook fetchVRClearingStampbook(long id);

	/**
	* Returns the vr clearing stampbook with the primary key.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook
	* @throws PortalException if a vr clearing stampbook with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VRClearingStampbook getVRClearingStampbook(long id)
		throws PortalException;

	public VRClearingStampbook updateClearingStambook(long id, long mtCore,
		long debitNoteId, long inputSheetId, long outputSheetId, long bookId,
		long certificateId, java.lang.String certificateNumber,
		Date certificateDate, java.lang.String vehicleClass,
		java.lang.String stampType, java.lang.String stampShortNo,
		java.lang.Long serialStartNo, java.lang.Long serialEndNo,
		long subTotalInDocument, long subTotalQuantities, long vehiclePrice,
		long unitPrice, long totalAmount, long totalInUse, long totalNotUsed,
		long totalLost, long totalCancelled, long totalReturned,
		java.lang.String remark) throws PortalException, SystemException;

	/**
	* Updates the vr clearing stampbook in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	* @return the vr clearing stampbook that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VRClearingStampbook updateVRClearingStampbook(
		VRClearingStampbook vrClearingStampbook);

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
	* Returns the number of vr clearing stampbooks.
	*
	* @return the number of vr clearing stampbooks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVRClearingStampbooksCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) throws PortalException, SystemException;

	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) throws PortalException, SystemException;

	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws PortalException, SystemException;

	public List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId) throws PortalException, SystemException;

	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId)
		throws PortalException, SystemException;

	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType)
		throws PortalException, SystemException;

	public List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId) throws PortalException, SystemException;

	public List<VRClearingStampbook> findBycertificateNumber(long mtCore,
		java.lang.String certificateNumber)
		throws PortalException, SystemException;

	public List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId) throws PortalException, SystemException;

	/**
	* Returns a range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of vr clearing stampbooks
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VRClearingStampbook> getVRClearingStampbooks(int start, int end);

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