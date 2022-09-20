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

import com.fds.vr.business.exception.NoSuchVRClearingStampbookException;
import com.fds.vr.business.model.VRClearingStampbook;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr clearing stampbook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRClearingStampbookPersistenceImpl
 * @see VRClearingStampbookUtil
 * @generated
 */
@ProviderType
public interface VRClearingStampbookPersistence extends BasePersistence<VRClearingStampbook> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRClearingStampbookUtil} to access the vr clearing stampbook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public void removeByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	*/
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByOutputSheetId_PrevAndNext(long id,
		long mtCore, long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	*/
	public void removeByOutputSheetId(long mtCore, long outputSheetId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByOutputSheetId(long mtCore, long outputSheetId);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetIdAndBookId_First(long mtCore,
		long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	*/
	public void removeByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public void removeByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr clearing stampbooks
	*/
	public int countByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long mtCore, long certificateId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countBycertificateId(long mtCore, long certificateId);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findBycertificateNumber_PrevAndNext(long id,
		long mtCore, java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr clearing stampbooks
	*/
	public int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @return the matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId);

	/**
	* Returns a range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBydebitNoteId_First(long mtCore,
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBydebitNoteId_First(long mtCore,
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook findBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	*/
	public VRClearingStampbook fetchBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param id the primary key of the current vr clearing stampbook
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook[] findBydebitNoteId_PrevAndNext(long id,
		long mtCore, long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException;

	/**
	* Removes all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	*/
	public void removeBydebitNoteId(long mtCore, long debitNoteId);

	/**
	* Returns the number of vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	*
	* @param mtCore the mt core
	* @param debitNoteId the debit note ID
	* @return the number of matching vr clearing stampbooks
	*/
	public int countBydebitNoteId(long mtCore, long debitNoteId);

	/**
	* Caches the vr clearing stampbook in the entity cache if it is enabled.
	*
	* @param vrClearingStampbook the vr clearing stampbook
	*/
	public void cacheResult(VRClearingStampbook vrClearingStampbook);

	/**
	* Caches the vr clearing stampbooks in the entity cache if it is enabled.
	*
	* @param vrClearingStampbooks the vr clearing stampbooks
	*/
	public void cacheResult(
		java.util.List<VRClearingStampbook> vrClearingStampbooks);

	/**
	* Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	*
	* @param id the primary key for the new vr clearing stampbook
	* @return the new vr clearing stampbook
	*/
	public VRClearingStampbook create(long id);

	/**
	* Removes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook that was removed
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook remove(long id)
		throws NoSuchVRClearingStampbookException;

	public VRClearingStampbook updateImpl(
		VRClearingStampbook vrClearingStampbook);

	/**
	* Returns the vr clearing stampbook with the primary key or throws a {@link NoSuchVRClearingStampbookException} if it could not be found.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook
	* @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook findByPrimaryKey(long id)
		throws NoSuchVRClearingStampbookException;

	/**
	* Returns the vr clearing stampbook with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr clearing stampbook
	* @return the vr clearing stampbook, or <code>null</code> if a vr clearing stampbook with the primary key could not be found
	*/
	public VRClearingStampbook fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRClearingStampbook> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr clearing stampbooks.
	*
	* @return the vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findAll();

	/**
	* Returns a range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @return the range of vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator);

	/**
	* Returns an ordered range of all the vr clearing stampbooks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr clearing stampbooks
	* @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr clearing stampbooks
	*/
	public java.util.List<VRClearingStampbook> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr clearing stampbooks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr clearing stampbooks.
	*
	* @return the number of vr clearing stampbooks
	*/
	public int countAll();
}