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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException;
import com.fds.vr.business.model.VRCOPProductClassification;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop product classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductClassificationPersistenceImpl
 * @see VRCOPProductClassificationUtil
 * @generated
 */
@ProviderType
public interface VRCOPProductClassificationPersistence extends BasePersistence<VRCOPProductClassification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductClassificationUtil} to access the vrcop product classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID);

	/**
	* Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end);

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop product classification
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public VRCOPProductClassification[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Removes all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	*/
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns the number of vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop product classifications
	*/
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo);

	/**
	* Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end);

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findBycopReportNo(
		long mtCore, java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	*/
	public VRCOPProductClassification fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop product classification
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public VRCOPProductClassification[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Removes all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public void removeBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns the number of vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop product classifications
	*/
	public int countBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Caches the vrcop product classification in the entity cache if it is enabled.
	*
	* @param vrcopProductClassification the vrcop product classification
	*/
	public void cacheResult(
		VRCOPProductClassification vrcopProductClassification);

	/**
	* Caches the vrcop product classifications in the entity cache if it is enabled.
	*
	* @param vrcopProductClassifications the vrcop product classifications
	*/
	public void cacheResult(
		java.util.List<VRCOPProductClassification> vrcopProductClassifications);

	/**
	* Creates a new vrcop product classification with the primary key. Does not add the vrcop product classification to the database.
	*
	* @param id the primary key for the new vrcop product classification
	* @return the new vrcop product classification
	*/
	public VRCOPProductClassification create(long id);

	/**
	* Removes the vrcop product classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification that was removed
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public VRCOPProductClassification remove(long id)
		throws NoSuchVRCOPProductClassificationException;

	public VRCOPProductClassification updateImpl(
		VRCOPProductClassification vrcopProductClassification);

	/**
	* Returns the vrcop product classification with the primary key or throws a {@link NoSuchVRCOPProductClassificationException} if it could not be found.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification
	* @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	*/
	public VRCOPProductClassification findByPrimaryKey(long id)
		throws NoSuchVRCOPProductClassificationException;

	/**
	* Returns the vrcop product classification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product classification
	* @return the vrcop product classification, or <code>null</code> if a vrcop product classification with the primary key could not be found
	*/
	public VRCOPProductClassification fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProductClassification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop product classifications.
	*
	* @return the vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findAll();

	/**
	* Returns a range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @return the range of vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product classifications
	* @param end the upper bound of the range of vrcop product classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop product classifications
	*/
	public java.util.List<VRCOPProductClassification> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductClassification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop product classifications from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop product classifications.
	*
	* @return the number of vrcop product classifications
	*/
	public int countAll();
}