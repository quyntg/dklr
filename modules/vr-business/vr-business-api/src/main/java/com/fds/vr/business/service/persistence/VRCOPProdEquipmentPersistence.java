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

import com.fds.vr.business.exception.NoSuchVRCOPProdEquipmentException;
import com.fds.vr.business.model.VRCOPProdEquipment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop prod equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCOPProdEquipmentPersistenceImpl
 * @see VRCOPProdEquipmentUtil
 * @generated
 */
@ProviderType
public interface VRCOPProdEquipmentPersistence extends BasePersistence<VRCOPProdEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProdEquipmentUtil} to access the vrcop prod equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID);

	/**
	* Returns a range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end);

	/**
	* Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop prod equipment
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Removes all the vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	*/
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns the number of vrcop prod equipments where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop prod equipments
	*/
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID);

	/**
	* Returns all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		java.lang.String copReportNo);

	/**
	* Returns a range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end);

	/**
	* Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the first vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the last vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop prod equipment
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, java.lang.String copReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Removes all the vrcop prod equipments where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public void removeBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns the number of vrcop prod equipments where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop prod equipments
	*/
	public int countBycopReportNo(long mtCore, java.lang.String copReportNo);

	/**
	* Returns all the vrcop prod equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopDossierId(long dossierId);

	/**
	* Returns a range of all the vrcop prod equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopDossierId(
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vrcop prod equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop prod equipments where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findBycopDossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop prod equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the first vrcop prod equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the last vrcop prod equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findBycopDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the last vrcop prod equipment in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchBycopDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vrcop prod equipment
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment[] findBycopDossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Removes all the vrcop prod equipments where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBycopDossierId(long dossierId);

	/**
	* Returns the number of vrcop prod equipments where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vrcop prod equipments
	*/
	public int countBycopDossierId(long dossierId);

	/**
	* Returns all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore);

	/**
	* Returns a range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findByDossierId_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findByDossierId_MtCore_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the first vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchByDossierId_MtCore_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the last vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment findByDossierId_MtCore_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the last vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop prod equipment, or <code>null</code> if a matching vrcop prod equipment could not be found
	*/
	public VRCOPProdEquipment fetchByDossierId_MtCore_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns the vrcop prod equipments before and after the current vrcop prod equipment in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vrcop prod equipment
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment[] findByDossierId_MtCore_PrevAndNext(long id,
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Removes all the vrcop prod equipments where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public void removeByDossierId_MtCore(long dossierId, long mtCore);

	/**
	* Returns the number of vrcop prod equipments where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vrcop prod equipments
	*/
	public int countByDossierId_MtCore(long dossierId, long mtCore);

	/**
	* Caches the vrcop prod equipment in the entity cache if it is enabled.
	*
	* @param vrcopProdEquipment the vrcop prod equipment
	*/
	public void cacheResult(VRCOPProdEquipment vrcopProdEquipment);

	/**
	* Caches the vrcop prod equipments in the entity cache if it is enabled.
	*
	* @param vrcopProdEquipments the vrcop prod equipments
	*/
	public void cacheResult(
		java.util.List<VRCOPProdEquipment> vrcopProdEquipments);

	/**
	* Creates a new vrcop prod equipment with the primary key. Does not add the vrcop prod equipment to the database.
	*
	* @param id the primary key for the new vrcop prod equipment
	* @return the new vrcop prod equipment
	*/
	public VRCOPProdEquipment create(long id);

	/**
	* Removes the vrcop prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment that was removed
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment remove(long id)
		throws NoSuchVRCOPProdEquipmentException;

	public VRCOPProdEquipment updateImpl(VRCOPProdEquipment vrcopProdEquipment);

	/**
	* Returns the vrcop prod equipment with the primary key or throws a {@link NoSuchVRCOPProdEquipmentException} if it could not be found.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment
	* @throws NoSuchVRCOPProdEquipmentException if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment findByPrimaryKey(long id)
		throws NoSuchVRCOPProdEquipmentException;

	/**
	* Returns the vrcop prod equipment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop prod equipment
	* @return the vrcop prod equipment, or <code>null</code> if a vrcop prod equipment with the primary key could not be found
	*/
	public VRCOPProdEquipment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProdEquipment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop prod equipments.
	*
	* @return the vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findAll();

	/**
	* Returns a range of all the vrcop prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @return the range of vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vrcop prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop prod equipments
	* @param end the upper bound of the range of vrcop prod equipments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop prod equipments
	*/
	public java.util.List<VRCOPProdEquipment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProdEquipment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop prod equipments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop prod equipments.
	*
	* @return the number of vrcop prod equipments
	*/
	public int countAll();
}