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

import com.fds.vr.business.exception.NoSuchVRCOPProductTypeException;
import com.fds.vr.business.model.VRCOPProductType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop product type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProductTypePersistenceImpl
 * @see VRCOPProductTypeUtil
 * @generated
 */
@ProviderType
public interface VRCOPProductTypePersistence extends BasePersistence<VRCOPProductType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductTypeUtil} to access the vrcop product type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID);

	/**
	* Returns a range of all the vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end);

	/**
	* Returns an ordered range of all the vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product type in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the first vrcop product type in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the last vrcop product type in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the last vrcop product type in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the vrcop product types before and after the current vrcop product type in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop product type
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType[] findBycopReportRepositoryID_PrevAndNext(long id,
		long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Removes all the vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	*/
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns the number of vrcop product types where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop product types
	*/
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns all the vrcop product types where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportNo(long mtCore,
		java.lang.String copReportNo);

	/**
	* Returns a range of all the vrcop product types where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end);

	/**
	* Returns an ordered range of all the vrcop product types where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product types where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product type in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the first vrcop product type in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the last vrcop product type in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the last vrcop product type in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the vrcop product types before and after the current vrcop product type in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop product type
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Removes all the vrcop product types where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public void removeBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns the number of vrcop product types where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop product types
	*/
	public int countBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns all the vrcop product types where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopDossierId(long dossierId);

	/**
	* Returns a range of all the vrcop product types where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopDossierId(long dossierId,
		int start, int end);

	/**
	* Returns an ordered range of all the vrcop product types where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product types where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findBycopDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product type in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the first vrcop product type in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the last vrcop product type in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findBycopDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the last vrcop product type in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchBycopDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the vrcop product types before and after the current vrcop product type in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vrcop product type
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType[] findBycopDossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Removes all the vrcop product types where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBycopDossierId(long dossierId);

	/**
	* Returns the number of vrcop product types where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vrcop product types
	*/
	public int countBycopDossierId(long dossierId);

	/**
	* Returns all the vrcop product types where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findByDossierId_MtCore(
		long dossierId, long mtCore);

	/**
	* Returns a range of all the vrcop product types where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vrcop product types where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product types where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product types
	*/
	public java.util.List<VRCOPProductType> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop product type in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findByDossierId_MtCore_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the first vrcop product type in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchByDossierId_MtCore_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the last vrcop product type in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public VRCOPProductType findByDossierId_MtCore_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the last vrcop product type in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public VRCOPProductType fetchByDossierId_MtCore_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns the vrcop product types before and after the current vrcop product type in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vrcop product type
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType[] findByDossierId_MtCore_PrevAndNext(long id,
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Removes all the vrcop product types where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public void removeByDossierId_MtCore(long dossierId, long mtCore);

	/**
	* Returns the number of vrcop product types where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vrcop product types
	*/
	public int countByDossierId_MtCore(long dossierId, long mtCore);

	/**
	* Caches the vrcop product type in the entity cache if it is enabled.
	*
	* @param vrcopProductType the vrcop product type
	*/
	public void cacheResult(VRCOPProductType vrcopProductType);

	/**
	* Caches the vrcop product types in the entity cache if it is enabled.
	*
	* @param vrcopProductTypes the vrcop product types
	*/
	public void cacheResult(java.util.List<VRCOPProductType> vrcopProductTypes);

	/**
	* Creates a new vrcop product type with the primary key. Does not add the vrcop product type to the database.
	*
	* @param id the primary key for the new vrcop product type
	* @return the new vrcop product type
	*/
	public VRCOPProductType create(long id);

	/**
	* Removes the vrcop product type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type that was removed
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType remove(long id)
		throws NoSuchVRCOPProductTypeException;

	public VRCOPProductType updateImpl(VRCOPProductType vrcopProductType);

	/**
	* Returns the vrcop product type with the primary key or throws a {@link NoSuchVRCOPProductTypeException} if it could not be found.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType findByPrimaryKey(long id)
		throws NoSuchVRCOPProductTypeException;

	/**
	* Returns the vrcop product type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type, or <code>null</code> if a vrcop product type with the primary key could not be found
	*/
	public VRCOPProductType fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProductType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop product types.
	*
	* @return the vrcop product types
	*/
	public java.util.List<VRCOPProductType> findAll();

	/**
	* Returns a range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of vrcop product types
	*/
	public java.util.List<VRCOPProductType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop product types
	*/
	public java.util.List<VRCOPProductType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop product types
	*/
	public java.util.List<VRCOPProductType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop product types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop product types.
	*
	* @return the number of vrcop product types
	*/
	public int countAll();
}