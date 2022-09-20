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

import com.fds.vr.business.exception.NoSuchVRInputStampbookDetailsException;
import com.fds.vr.business.model.VRInputStampbookDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr input stampbook details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInputStampbookDetailsPersistenceImpl
 * @see VRInputStampbookDetailsUtil
 * @generated
 */
@ProviderType
public interface VRInputStampbookDetailsPersistence extends BasePersistence<VRInputStampbookDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInputStampbookDetailsUtil} to access the vr input stampbook details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo);

	/**
	* Returns the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo,
		boolean retrieveFromCache);

	/**
	* Removes the vr input stampbook details where purchaserId = &#63; and stampSerialNo = &#63; from the database.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the vr input stampbook details that was removed
	*/
	public VRInputStampbookDetails removeBystampSerialNo_purchaserId(
		long purchaserId, java.lang.String stampSerialNo)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the number of vr input stampbook detailses where purchaserId = &#63; and stampSerialNo = &#63;.
	*
	* @param purchaserId the purchaser ID
	* @param stampSerialNo the stamp serial no
	* @return the number of matching vr input stampbook detailses
	*/
	public int countBystampSerialNo_purchaserId(long purchaserId,
		java.lang.String stampSerialNo);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public void removeByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByInputSheetIdAndBookId_Last(
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	*/
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycorporationId(
		long mtCore, long corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycorporationId_First(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycorporationId_First(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycorporationId_Last(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycorporationId_Last(long mtCore,
		long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and corporationId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findBycorporationId_PrevAndNext(long id,
		long mtCore, long corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and corporationId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	*/
	public void removeBycorporationId(long mtCore, long corporationId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and corporationId = &#63;.
	*
	* @param mtCore the mt core
	* @param corporationId the corporation ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countBycorporationId(long mtCore, long corporationId);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBydossierId(
		long mtCore, long dossierId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBydossierId(
		long mtCore, long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBydossierId(
		long mtCore, long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBydossierId(
		long mtCore, long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBydossierId_First(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBydossierId_First(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBydossierId_Last(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBydossierId_Last(long mtCore,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long mtCore, long dossierId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countBydossierId(long mtCore, long dossierId);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long mtCore, long certificateId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countBycertificateId(long mtCore, long certificateId);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findBycertificateNumber_PrevAndNext(
		long id, long mtCore, java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr input stampbook detailses
	*/
	public int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @return the matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId);

	/**
	* Returns a range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findByvehicleRecordId(
		long mtCore, long vehicleRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByvehicleRecordId_First(long mtCore,
		long vehicleRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the first vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByvehicleRecordId_First(long mtCore,
		long vehicleRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByvehicleRecordId_Last(long mtCore,
		long vehicleRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the last vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByvehicleRecordId_Last(long mtCore,
		long vehicleRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns the vr input stampbook detailses before and after the current vr input stampbook details in the ordered set where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param id the primary key of the current vr input stampbook details
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails[] findByvehicleRecordId_PrevAndNext(
		long id, long mtCore, long vehicleRecordId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Removes all the vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	*/
	public void removeByvehicleRecordId(long mtCore, long vehicleRecordId);

	/**
	* Returns the number of vr input stampbook detailses where mtCore = &#63; and vehicleRecordId = &#63;.
	*
	* @param mtCore the mt core
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching vr input stampbook detailses
	*/
	public int countByvehicleRecordId(long mtCore, long vehicleRecordId);

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the matching vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails findByBookIdAndSequenceNo(long bookId,
		long sequenceNo) throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByBookIdAndSequenceNo(long bookId,
		long sequenceNo);

	/**
	* Returns the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr input stampbook details, or <code>null</code> if a matching vr input stampbook details could not be found
	*/
	public VRInputStampbookDetails fetchByBookIdAndSequenceNo(long bookId,
		long sequenceNo, boolean retrieveFromCache);

	/**
	* Removes the vr input stampbook details where bookId = &#63; and sequenceNo = &#63; from the database.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the vr input stampbook details that was removed
	*/
	public VRInputStampbookDetails removeByBookIdAndSequenceNo(long bookId,
		long sequenceNo) throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the number of vr input stampbook detailses where bookId = &#63; and sequenceNo = &#63;.
	*
	* @param bookId the book ID
	* @param sequenceNo the sequence no
	* @return the number of matching vr input stampbook detailses
	*/
	public int countByBookIdAndSequenceNo(long bookId, long sequenceNo);

	/**
	* Caches the vr input stampbook details in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetails the vr input stampbook details
	*/
	public void cacheResult(VRInputStampbookDetails vrInputStampbookDetails);

	/**
	* Caches the vr input stampbook detailses in the entity cache if it is enabled.
	*
	* @param vrInputStampbookDetailses the vr input stampbook detailses
	*/
	public void cacheResult(
		java.util.List<VRInputStampbookDetails> vrInputStampbookDetailses);

	/**
	* Creates a new vr input stampbook details with the primary key. Does not add the vr input stampbook details to the database.
	*
	* @param id the primary key for the new vr input stampbook details
	* @return the new vr input stampbook details
	*/
	public VRInputStampbookDetails create(long id);

	/**
	* Removes the vr input stampbook details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details that was removed
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails remove(long id)
		throws NoSuchVRInputStampbookDetailsException;

	public VRInputStampbookDetails updateImpl(
		VRInputStampbookDetails vrInputStampbookDetails);

	/**
	* Returns the vr input stampbook details with the primary key or throws a {@link NoSuchVRInputStampbookDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details
	* @throws NoSuchVRInputStampbookDetailsException if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails findByPrimaryKey(long id)
		throws NoSuchVRInputStampbookDetailsException;

	/**
	* Returns the vr input stampbook details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr input stampbook details
	* @return the vr input stampbook details, or <code>null</code> if a vr input stampbook details with the primary key could not be found
	*/
	public VRInputStampbookDetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInputStampbookDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr input stampbook detailses.
	*
	* @return the vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll();

	/**
	* Returns a range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @return the range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr input stampbook detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputStampbookDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr input stampbook detailses
	* @param end the upper bound of the range of vr input stampbook detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr input stampbook detailses
	*/
	public java.util.List<VRInputStampbookDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInputStampbookDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr input stampbook detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr input stampbook detailses.
	*
	* @return the number of vr input stampbook detailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}