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

import com.fds.vr.business.exception.NoSuchVRInputStampbookException;
import com.fds.vr.business.model.VRInputStampbook;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr input stampbook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookPersistenceImpl
 * @see VRInputStampbookUtil
 * @generated
 */
@ProviderType
public interface VRInputStampbookPersistence extends BasePersistence<VRInputStampbook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputStampbookUtil} to access the vr input stampbook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @return the matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3);

	/**
	* Returns a range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByvehicleClass_stampType_sum3_First(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the first vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByvehicleClass_stampType_sum3_First(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByvehicleClass_stampType_sum3_Last(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the last vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByvehicleClass_stampType_sum3_Last(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook[] findByvehicleClass_stampType_sum3_PrevAndNext(
		long id, java.lang.String vehicleClass, java.lang.String stampType,
		long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Removes all the vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	*/
	public void removeByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3);

	/**
	* Returns the number of vr input stampbooks where vehicleClass = &#63; and stampType = &#63; and sum3 &gt; &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param stampType the stamp type
	* @param sum3 the sum3
	* @return the number of matching vr input stampbooks
	*/
	public int countByvehicleClass_stampType_sum3(
		java.lang.String vehicleClass, java.lang.String stampType, long sum3);

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId);

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public void removeByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr input stampbooks
	*/
	public int countByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId);

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook[] findByInputSheetIdAndBookId_PrevAndNext(long id,
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	*/
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr input stampbooks
	*/
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns a range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the first vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the last vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Removes all the vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns the number of vr input stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr input stampbooks
	*/
	public int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @return the matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findBySum3GreaterThan(long sum3);

	/**
	* Returns a range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks where sum3 &gt; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sum3 the sum3
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findBySum3GreaterThan(long sum3,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findBySum3GreaterThan_First(long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the first vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchBySum3GreaterThan_First(long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook
	* @throws NoSuchVRInputStampbookException if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook findBySum3GreaterThan_Last(long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the last vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook, or <code>null</code> if a matching vr input stampbook could not be found
	*/
	public VRInputStampbook fetchBySum3GreaterThan_Last(long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns the vr input stampbooks before and after the current vr input stampbook in the ordered set where sum3 &gt; &#63;.
	*
	* @param id the primary key of the current vr input stampbook
	* @param sum3 the sum3
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook[] findBySum3GreaterThan_PrevAndNext(long id,
		long sum3,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator)
		throws NoSuchVRInputStampbookException;

	/**
	* Removes all the vr input stampbooks where sum3 &gt; &#63; from the database.
	*
	* @param sum3 the sum3
	*/
	public void removeBySum3GreaterThan(long sum3);

	/**
	* Returns the number of vr input stampbooks where sum3 &gt; &#63;.
	*
	* @param sum3 the sum3
	* @return the number of matching vr input stampbooks
	*/
	public int countBySum3GreaterThan(long sum3);

	/**
	* Caches the vr input stampbook in the entity cache if it is enabled.
	*
	* @param vrInputStampbook the vr input stampbook
	*/
	public void cacheResult(VRInputStampbook vrInputStampbook);

	/**
	* Caches the vr input stampbooks in the entity cache if it is enabled.
	*
	* @param vrInputStampbooks the vr input stampbooks
	*/
	public void cacheResult(java.util.List<VRInputStampbook> vrInputStampbooks);

	/**
	* Creates a new vr input stampbook with the primary key. Does not add the vr input stampbook to the database.
	*
	* @param id the primary key for the new vr input stampbook
	* @return the new vr input stampbook
	*/
	public VRInputStampbook create(long id);

	/**
	* Removes the vr input stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook that was removed
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook remove(long id)
		throws NoSuchVRInputStampbookException;

	public VRInputStampbook updateImpl(VRInputStampbook vrInputStampbook);

	/**
	* Returns the vr input stampbook with the primary key or throws a {@link NoSuchVRInputStampbookException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook
	* @throws NoSuchVRInputStampbookException if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookException;

	/**
	* Returns the vr input stampbook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook
	* @return the vr input stampbook, or <code>null</code> if a vr input stampbook with the primary key could not be found
	*/
	public VRInputStampbook fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInputStampbook> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr input stampbooks.
	*
	* @return the vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll();

	/**
	* Returns a range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @return the range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbooks
	* @param end the upper bound of the range of vr input stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbooks
	*/
	public java.util.List<VRInputStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr input stampbooks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr input stampbooks.
	*
	* @return the number of vr input stampbooks
	*/
	public int countAll();
}