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

import com.fds.vr.business.model.VRInspectionStandard;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr inspection standard service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRInspectionStandardPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInspectionStandardPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRInspectionStandardPersistenceImpl
 * @generated
 */
@ProviderType
public class VRInspectionStandardUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRInspectionStandard vrInspectionStandard) {
		getPersistence().clearCache(vrInspectionStandard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRInspectionStandard> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRInspectionStandard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRInspectionStandard> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRInspectionStandard update(
		VRInspectionStandard vrInspectionStandard) {
		return getPersistence().update(vrInspectionStandard);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRInspectionStandard update(
		VRInspectionStandard vrInspectionStandard, ServiceContext serviceContext) {
		return getPersistence().update(vrInspectionStandard, serviceContext);
	}

	/**
	* Returns all the vr inspection standards where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr inspection standards
	*/
	public static List<VRInspectionStandard> findBydossierId(long dossierId) {
		return getPersistence().findBydossierId(dossierId);
	}

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
	public static List<VRInspectionStandard> findBydossierId(long dossierId,
		int start, int end) {
		return getPersistence().findBydossierId(dossierId, start, end);
	}

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
	public static List<VRInspectionStandard> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator);
	}

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
	public static List<VRInspectionStandard> findBydossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findBydossierId_First(long dossierId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchBydossierId_First(long dossierId,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findBydossierId_Last(long dossierId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchBydossierId_Last(long dossierId,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard[] findBydossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr inspection standards where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long dossierId) {
		getPersistence().removeBydossierId(dossierId);
	}

	/**
	* Returns the number of vr inspection standards where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr inspection standards
	*/
	public static int countBydossierId(long dossierId) {
		return getPersistence().countBydossierId(dossierId);
	}

	/**
	* Returns all the vr inspection standards where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr inspection standards
	*/
	public static List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode) {
		return getPersistence().findByDeliverableCode(deliverableCode);
	}

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
	public static List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end);
	}

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
	public static List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator);
	}

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
	public static List<VRInspectionStandard> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_First(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByDeliverableCode_Last(deliverableCode,
			orderByComparator);
	}

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByDeliverableCode_PrevAndNext(id, deliverableCode,
			orderByComparator);
	}

	/**
	* Removes all the vr inspection standards where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public static void removeByDeliverableCode(java.lang.String deliverableCode) {
		getPersistence().removeByDeliverableCode(deliverableCode);
	}

	/**
	* Returns the number of vr inspection standards where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr inspection standards
	*/
	public static int countByDeliverableCode(java.lang.String deliverableCode) {
		return getPersistence().countByDeliverableCode(deliverableCode);
	}

	/**
	* Returns all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @return the matching vr inspection standards
	*/
	public static List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus) {
		return getPersistence()
				   .findByvehicleCertificateId(vehicleCertificateId,
			markupstatus);
	}

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
	public static List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end) {
		return getPersistence()
				   .findByvehicleCertificateId(vehicleCertificateId,
			markupstatus, start, end);
	}

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
	public static List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .findByvehicleCertificateId(vehicleCertificateId,
			markupstatus, start, end, orderByComparator);
	}

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
	public static List<VRInspectionStandard> findByvehicleCertificateId(
		long vehicleCertificateId, long markupstatus, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByvehicleCertificateId(vehicleCertificateId,
			markupstatus, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByvehicleCertificateId_First(
		long vehicleCertificateId, long markupstatus,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByvehicleCertificateId_First(vehicleCertificateId,
			markupstatus, orderByComparator);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByvehicleCertificateId_First(
		long vehicleCertificateId, long markupstatus,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleCertificateId_First(vehicleCertificateId,
			markupstatus, orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByvehicleCertificateId_Last(
		long vehicleCertificateId, long markupstatus,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByvehicleCertificateId_Last(vehicleCertificateId,
			markupstatus, orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByvehicleCertificateId_Last(
		long vehicleCertificateId, long markupstatus,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByvehicleCertificateId_Last(vehicleCertificateId,
			markupstatus, orderByComparator);
	}

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
	public static VRInspectionStandard[] findByvehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId, long markupstatus,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByvehicleCertificateId_PrevAndNext(id,
			vehicleCertificateId, markupstatus, orderByComparator);
	}

	/**
	* Removes all the vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	*/
	public static void removeByvehicleCertificateId(long vehicleCertificateId,
		long markupstatus) {
		getPersistence()
			.removeByvehicleCertificateId(vehicleCertificateId, markupstatus);
	}

	/**
	* Returns the number of vr inspection standards where vehicleCertificateId = &#63; and markupstatus = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param markupstatus the markupstatus
	* @return the number of matching vr inspection standards
	*/
	public static int countByvehicleCertificateId(long vehicleCertificateId,
		long markupstatus) {
		return getPersistence()
				   .countByvehicleCertificateId(vehicleCertificateId,
			markupstatus);
	}

	/**
	* Returns all the vr inspection standards where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the matching vr inspection standards
	*/
	public static List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId) {
		return getPersistence()
				   .findByF_vehicleCertificateId(vehicleCertificateId);
	}

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
	public static List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end) {
		return getPersistence()
				   .findByF_vehicleCertificateId(vehicleCertificateId, start,
			end);
	}

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
	public static List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .findByF_vehicleCertificateId(vehicleCertificateId, start,
			end, orderByComparator);
	}

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
	public static List<VRInspectionStandard> findByF_vehicleCertificateId(
		long vehicleCertificateId, int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByF_vehicleCertificateId(vehicleCertificateId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByF_vehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByF_vehicleCertificateId_First(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByF_vehicleCertificateId_First(
		long vehicleCertificateId,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByF_vehicleCertificateId_First(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard findByF_vehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByF_vehicleCertificateId_Last(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr inspection standard, or <code>null</code> if a matching vr inspection standard could not be found
	*/
	public static VRInspectionStandard fetchByF_vehicleCertificateId_Last(
		long vehicleCertificateId,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence()
				   .fetchByF_vehicleCertificateId_Last(vehicleCertificateId,
			orderByComparator);
	}

	/**
	* Returns the vr inspection standards before and after the current vr inspection standard in the ordered set where vehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr inspection standard
	* @param vehicleCertificateId the vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard[] findByF_vehicleCertificateId_PrevAndNext(
		long id, long vehicleCertificateId,
		OrderByComparator<VRInspectionStandard> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence()
				   .findByF_vehicleCertificateId_PrevAndNext(id,
			vehicleCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr inspection standards where vehicleCertificateId = &#63; from the database.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	*/
	public static void removeByF_vehicleCertificateId(long vehicleCertificateId) {
		getPersistence().removeByF_vehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Returns the number of vr inspection standards where vehicleCertificateId = &#63;.
	*
	* @param vehicleCertificateId the vehicle certificate ID
	* @return the number of matching vr inspection standards
	*/
	public static int countByF_vehicleCertificateId(long vehicleCertificateId) {
		return getPersistence()
				   .countByF_vehicleCertificateId(vehicleCertificateId);
	}

	/**
	* Caches the vr inspection standard in the entity cache if it is enabled.
	*
	* @param vrInspectionStandard the vr inspection standard
	*/
	public static void cacheResult(VRInspectionStandard vrInspectionStandard) {
		getPersistence().cacheResult(vrInspectionStandard);
	}

	/**
	* Caches the vr inspection standards in the entity cache if it is enabled.
	*
	* @param vrInspectionStandards the vr inspection standards
	*/
	public static void cacheResult(
		List<VRInspectionStandard> vrInspectionStandards) {
		getPersistence().cacheResult(vrInspectionStandards);
	}

	/**
	* Creates a new vr inspection standard with the primary key. Does not add the vr inspection standard to the database.
	*
	* @param id the primary key for the new vr inspection standard
	* @return the new vr inspection standard
	*/
	public static VRInspectionStandard create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr inspection standard with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard that was removed
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence().remove(id);
	}

	public static VRInspectionStandard updateImpl(
		VRInspectionStandard vrInspectionStandard) {
		return getPersistence().updateImpl(vrInspectionStandard);
	}

	/**
	* Returns the vr inspection standard with the primary key or throws a {@link NoSuchVRInspectionStandardException} if it could not be found.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard
	* @throws NoSuchVRInspectionStandardException if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRInspectionStandardException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr inspection standard with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr inspection standard
	* @return the vr inspection standard, or <code>null</code> if a vr inspection standard with the primary key could not be found
	*/
	public static VRInspectionStandard fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRInspectionStandard> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr inspection standards.
	*
	* @return the vr inspection standards
	*/
	public static List<VRInspectionStandard> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VRInspectionStandard> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VRInspectionStandard> findAll(int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VRInspectionStandard> findAll(int start, int end,
		OrderByComparator<VRInspectionStandard> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr inspection standards from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr inspection standards.
	*
	* @return the number of vr inspection standards
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRInspectionStandardPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRInspectionStandardPersistence, VRInspectionStandardPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRInspectionStandardPersistence.class);
}