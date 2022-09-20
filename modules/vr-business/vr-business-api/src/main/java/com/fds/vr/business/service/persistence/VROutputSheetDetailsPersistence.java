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

import com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException;
import com.fds.vr.business.model.VROutputSheetDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr output sheet details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VROutputSheetDetailsPersistenceImpl
 * @see VROutputSheetDetailsUtil
 * @generated
 */
@ProviderType
public interface VROutputSheetDetailsPersistence extends BasePersistence<VROutputSheetDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VROutputSheetDetailsUtil} to access the vr output sheet details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetId(
		long mtCore, long inputSheetId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetId(
		long mtCore, long inputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	*/
	public void removeByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countByInputSheetId(long mtCore, long inputSheetId);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	*/
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetId(
		long mtCore, long outputSheetId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetId(
		long mtCore, long outputSheetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByOutputSheetId_PrevAndNext(long id,
		long mtCore, long outputSheetId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	*/
	public void removeByOutputSheetId(long mtCore, long outputSheetId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countByOutputSheetId(long mtCore, long outputSheetId);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	*/
	public void removeByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param inputSheetId the input sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr output sheet detailses
	*/
	public int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		java.lang.String stampType,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	*/
	public void removeByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	*
	* @param mtCore the mt core
	* @param outputSheetId the output sheet ID
	* @param bookId the book ID
	* @param stampType the stamp type
	* @return the number of matching vr output sheet detailses
	*/
	public int countByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, java.lang.String stampType);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateId(
		long mtCore, long certificateId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateId(
		long mtCore, long certificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchBycertificateId_First(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchBycertificateId_Last(long mtCore,
		long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public void removeBycertificateId(long mtCore, long certificateId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countBycertificateId(long mtCore, long certificateId);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchBycertificateNumber_First(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchBycertificateNumber_Last(long mtCore,
		java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findBycertificateNumber_PrevAndNext(long id,
		long mtCore, java.lang.String certificateNumber,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	*/
	public void removeBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateNumber the certificate number
	* @return the number of matching vr output sheet detailses
	*/
	public int countBycertificateNumber(long mtCore,
		java.lang.String certificateNumber);

	/**
	* Returns all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId);

	/**
	* Returns a range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails findByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	*/
	public VROutputSheetDetails fetchByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr output sheet details
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Removes all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId);

	/**
	* Returns the number of vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr output sheet detailses
	*/
	public int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId);

	/**
	* Caches the vr output sheet details in the entity cache if it is enabled.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	*/
	public void cacheResult(VROutputSheetDetails vrOutputSheetDetails);

	/**
	* Caches the vr output sheet detailses in the entity cache if it is enabled.
	*
	* @param vrOutputSheetDetailses the vr output sheet detailses
	*/
	public void cacheResult(
		java.util.List<VROutputSheetDetails> vrOutputSheetDetailses);

	/**
	* Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	*
	* @param id the primary key for the new vr output sheet details
	* @return the new vr output sheet details
	*/
	public VROutputSheetDetails create(long id);

	/**
	* Removes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details that was removed
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails remove(long id)
		throws NoSuchVROutputSheetDetailsException;

	public VROutputSheetDetails updateImpl(
		VROutputSheetDetails vrOutputSheetDetails);

	/**
	* Returns the vr output sheet details with the primary key or throws a {@link NoSuchVROutputSheetDetailsException} if it could not be found.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details
	* @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails findByPrimaryKey(long id)
		throws NoSuchVROutputSheetDetailsException;

	/**
	* Returns the vr output sheet details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details, or <code>null</code> if a vr output sheet details with the primary key could not be found
	*/
	public VROutputSheetDetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VROutputSheetDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr output sheet detailses.
	*
	* @return the vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findAll();

	/**
	* Returns a range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator);

	/**
	* Returns an ordered range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr output sheet detailses
	*/
	public java.util.List<VROutputSheetDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr output sheet detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr output sheet detailses.
	*
	* @return the number of vr output sheet detailses
	*/
	public int countAll();
}