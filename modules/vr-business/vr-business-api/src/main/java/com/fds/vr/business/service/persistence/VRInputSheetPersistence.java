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

import com.fds.vr.business.exception.NoSuchVRInputSheetException;
import com.fds.vr.business.model.VRInputSheet;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr input sheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInputSheetPersistenceImpl
 * @see VRInputSheetUtil
 * @generated
 */
@ProviderType
public interface VRInputSheetPersistence extends BasePersistence<VRInputSheet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputSheetUtil} to access the vr input sheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @return the matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetNo(long mtCore,
		java.lang.String inputSheetNo);

	/**
	* Returns a range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @return the range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetNo(long mtCore,
		java.lang.String inputSheetNo, int start, int end);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetNo(long mtCore,
		java.lang.String inputSheetNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetNo(long mtCore,
		java.lang.String inputSheetNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findByinputSheetNo_First(long mtCore,
		java.lang.String inputSheetNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchByinputSheetNo_First(long mtCore,
		java.lang.String inputSheetNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findByinputSheetNo_Last(long mtCore,
		java.lang.String inputSheetNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchByinputSheetNo_Last(long mtCore,
		java.lang.String inputSheetNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param id the primary key of the current vr input sheet
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input sheet
	* @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet[] findByinputSheetNo_PrevAndNext(long id, long mtCore,
		java.lang.String inputSheetNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Removes all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	*/
	public void removeByinputSheetNo(long mtCore, java.lang.String inputSheetNo);

	/**
	* Returns the number of vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetNo the input sheet no
	* @return the number of matching vr input sheets
	*/
	public int countByinputSheetNo(long mtCore, java.lang.String inputSheetNo);

	/**
	* Returns all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId);

	/**
	* Returns a range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @return the range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findBycorporationId_First(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchBycorporationId_First(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findBycorporationId_Last(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchBycorporationId_Last(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr input sheet
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input sheet
	* @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet[] findBycorporationId_PrevAndNext(long id, long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Removes all the vr input sheets where mtCore = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	*/
	public void removeBycorporationId(long mtCore, long corporationId);

	/**
	* Returns the number of vr input sheets where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the number of matching vr input sheets
	*/
	public int countBycorporationId(long mtCore, long corporationId);

	/**
	* Returns all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @return the matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType);

	/**
	* Returns a range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @return the range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input sheets
	*/
	public java.util.List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findByinputSheetType_First(long mtCore,
		long inputSheetType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchByinputSheetType_First(long mtCore,
		long inputSheetType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet
	* @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	*/
	public VRInputSheet findByinputSheetType_Last(long mtCore,
		long inputSheetType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	*/
	public VRInputSheet fetchByinputSheetType_Last(long mtCore,
		long inputSheetType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param id the primary key of the current vr input sheet
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input sheet
	* @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet[] findByinputSheetType_PrevAndNext(long id,
		long mtCore, long inputSheetType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException;

	/**
	* Removes all the vr input sheets where mtCore = &#63; and inputSheetType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	*/
	public void removeByinputSheetType(long mtCore, long inputSheetType);

	/**
	* Returns the number of vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetType the input sheet type
	* @return the number of matching vr input sheets
	*/
	public int countByinputSheetType(long mtCore, long inputSheetType);

	/**
	* Caches the vr input sheet in the entity cache if it is enabled.
	*
	* @param vrInputSheet the vr input sheet
	*/
	public void cacheResult(VRInputSheet vrInputSheet);

	/**
	* Caches the vr input sheets in the entity cache if it is enabled.
	*
	* @param vrInputSheets the vr input sheets
	*/
	public void cacheResult(java.util.List<VRInputSheet> vrInputSheets);

	/**
	* Creates a new vr input sheet with the primary key. Does not add the vr input sheet to the database.
	*
	* @param id the primary key for the new vr input sheet
	* @return the new vr input sheet
	*/
	public VRInputSheet create(long id);

	/**
	* Removes the vr input sheet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet that was removed
	* @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet remove(long id) throws NoSuchVRInputSheetException;

	public VRInputSheet updateImpl(VRInputSheet vrInputSheet);

	/**
	* Returns the vr input sheet with the primary key or throws a {@link NoSuchVRInputSheetException} if it could not be found.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet
	* @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet findByPrimaryKey(long id)
		throws NoSuchVRInputSheetException;

	/**
	* Returns the vr input sheet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input sheet
	* @return the vr input sheet, or <code>null</code> if a vr input sheet with the primary key could not be found
	*/
	public VRInputSheet fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInputSheet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr input sheets.
	*
	* @return the vr input sheets
	*/
	public java.util.List<VRInputSheet> findAll();

	/**
	* Returns a range of all the vr input sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @return the range of vr input sheets
	*/
	public java.util.List<VRInputSheet> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr input sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input sheets
	*/
	public java.util.List<VRInputSheet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator);

	/**
	* Returns an ordered range of all the vr input sheets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input sheets
	* @param end the upper bound of the range of vr input sheets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input sheets
	*/
	public java.util.List<VRInputSheet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr input sheets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr input sheets.
	*
	* @return the number of vr input sheets
	*/
	public int countAll();
}