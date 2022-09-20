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

import com.fds.vr.business.exception.NoSuchVRInspectionStandardException;
import com.fds.vr.business.model.VRInspectionStandard;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr inspection standard service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRInspectionStandardPersistenceImpl
 * @see VRInspectionStandardUtil
 * @generated
 */
@ProviderType
public interface VRInspectionStandardPersistence extends BasePersistence<VRInspectionStandard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRInspectionStandardUtil} to access the vr inspection standard persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr inspection standards where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findBydossierId(long dossierId);

	/**
	* Returns a range of all the vr inspection standards where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findBydossierId(
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr inspection standards where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vr inspection standards where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findBydossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the first vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchBydossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the last vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the last vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchBydossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Removes all the vr inspection standards where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBydossierId(long dossierId);

	/**
	* Returns the number of vr inspection standards where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr inspection standards
	*/
	public int countBydossierId(long dossierId);

	/**
	* Returns all the vr inspection standards where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode);

	/**
	* Returns a range of all the vr inspection standards where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end);

	/**
	* Returns an ordered range of all the vr inspection standards where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vr inspection standards where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the first vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the last vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the last vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard[] findByDeliverableCode_PrevAndNext(long id,
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Removes all the vr inspection standards where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public void removeByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns the number of vr inspection standards where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr inspection standards
	*/
	public int countByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @return the matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus);

	/**
	* Returns a range of all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end);

	/**
	* Returns an ordered range of all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByvehicleCertificateId_First(
		long vehicleCertificateId, long markupstatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByvehicleCertificateId_First(
		long vehicleCertificateId, long markupstatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByvehicleCertificateId_Last(
		long vehicleCertificateId, long markupstatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByvehicleCertificateId_Last(
		long vehicleCertificateId, long markupstatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard[] findByvehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId, long markupstatus,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Removes all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	*/
	public void removeByvehicleCertificateId(long vehicleCertificateId,
		long markupstatus);

	/**
	* Returns the number of vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @return the number of matching vr inspection standards
	*/
	public int countByvehicleCertificateId(long vehicleCertificateId,
		long markupstatus);

	/**
	* Returns all the vr inspection standards where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId);

	/**
	* Returns a range of all the vr inspection standards where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr inspection standards where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vr inspection standards where vehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByF_vehicleCertificateId_First(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByF_vehicleCertificateId_First(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard findByF_vehicleCertificateId_Last(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public VRInspectionStandard fetchByF_vehicleCertificateId_Last(
		long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard[] findByF_vehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator)
		throws NoSuchVRInspectionStandardException;

	/**
	* Removes all the vr inspection standards where vehicleCertificateId = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	*/
	public void removeByF_vehicleCertificateId(long vehicleCertificateId);

	/**
	* Returns the number of vr inspection standards where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the number of matching vr inspection standards
	*/
	public int countByF_vehicleCertificateId(long vehicleCertificateId);

	/**
	* Caches the vr inspection standard in the entity cache if it is enabled.
	*
	* @param vrInspectionStandard the vr inspection standard
	*/
	public void cacheResult(VRInspectionStandard vrInspectionStandard);

	/**
	* Caches the vr inspection standards in the entity cache if it is enabled.
	*
	* @param vrInspectionStandards the vr inspection standards
	*/
	public void cacheResult(
		java.util.List<VRInspectionStandard> vrInspectionStandards);

	/**
	* Creates a new vr inspection standard with the primary key. Does not add the vr inspection standard to the database.
	*
	* @param id the primary key for the new vr inspection standard
	* @return the new vr inspection standard
	*/
	public VRInspectionStandard create(long id);

	/**
	* Removes the vr inspection standard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard that was removed
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard remove(long id)
		throws NoSuchVRInspectionStandardException;

	public VRInspectionStandard updateImpl(
		VRInspectionStandard vrInspectionStandard);

	/**
	* Returns the vr inspection standard with the primary key or throws a {@link NoSuchVRInspectionStandardException} if it could not be found.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard findByPrimaryKey(long id)
		throws NoSuchVRInspectionStandardException;

	/**
	* Returns the vr inspection standard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard, or <code>null</code> if a vr inspection standard with the primary key could not be found
	*/
	public VRInspectionStandard fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRInspectionStandard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr inspection standards.
	*
	* @return the vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findAll();

	/**
	* Returns a range of all the vr inspection standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @return the range of vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr inspection standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator);

	/**
	* Returns an ordered range of all the vr inspection standards.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInspectionStandardModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr inspection standards
	* @param end the upper bound of the range of vr inspection standards (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr inspection standards
	*/
	public java.util.List<VRInspectionStandard> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr inspection standards from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr inspection standards.
	*
	* @return the number of vr inspection standards
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}