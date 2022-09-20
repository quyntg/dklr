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

import com.fds.vr.business.model.VRIssueVehiclecertificate;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr issue vehiclecertificate service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRIssueVehiclecertificatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueVehiclecertificatePersistence
 * @see com.fds.vr.business.service.persistence.impl.VRIssueVehiclecertificatePersistenceImpl
 * @generated
 */
@ProviderType
public class VRIssueVehiclecertificateUtil {
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
	public static void clearCache(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		getPersistence().clearCache(vrIssueVehiclecertificate);
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
	public static List<VRIssueVehiclecertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRIssueVehiclecertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRIssueVehiclecertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRIssueVehiclecertificate update(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return getPersistence().update(vrIssueVehiclecertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRIssueVehiclecertificate update(
		VRIssueVehiclecertificate vrIssueVehiclecertificate,
		ServiceContext serviceContext) {
		return getPersistence().update(vrIssueVehiclecertificate, serviceContext);
	}

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId) {
		return getPersistence().findBydossierId(mtCore, dossierId);
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return getPersistence().findBydossierId(mtCore, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findBydossierId_First(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchBydossierId_First(
		long mtCore, long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchBydossierId_Last(long mtCore,
		long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate[] findBydossierId_PrevAndNext(
		long id, long mtCore, long dossierId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, mtCore, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long mtCore, long dossierId) {
		getPersistence().removeBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public static int countBydossierId(long mtCore, long dossierId) {
		return getPersistence().countBydossierId(mtCore, dossierId);
	}

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @return the matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId) {
		return getPersistence().findByissueId_MtCore(mtCore, issueId);
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end) {
		return getPersistence().findByissueId_MtCore(mtCore, issueId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .findByissueId_MtCore(mtCore, issueId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId_MtCore(
		long mtCore, long issueId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueId_MtCore(mtCore, issueId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findByissueId_MtCore_First(
		long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findByissueId_MtCore_First(mtCore, issueId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchByissueId_MtCore_First(
		long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchByissueId_MtCore_First(mtCore, issueId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findByissueId_MtCore_Last(
		long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findByissueId_MtCore_Last(mtCore, issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchByissueId_MtCore_Last(
		long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchByissueId_MtCore_Last(mtCore, issueId,
			orderByComparator);
	}

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and issueId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate[] findByissueId_MtCore_PrevAndNext(
		long id, long mtCore, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findByissueId_MtCore_PrevAndNext(id, mtCore, issueId,
			orderByComparator);
	}

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	*/
	public static void removeByissueId_MtCore(long mtCore, long issueId) {
		getPersistence().removeByissueId_MtCore(mtCore, issueId);
	}

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and issueId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueId the issue ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public static int countByissueId_MtCore(long mtCore, long issueId) {
		return getPersistence().countByissueId_MtCore(mtCore, issueId);
	}

	/**
	* Returns all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @return the matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId) {
		return getPersistence()
				   .findBycertificateId(mtCore, dossierId, certificateId);
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end) {
		return getPersistence()
				   .findBycertificateId(mtCore, dossierId, certificateId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(mtCore, dossierId, certificateId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findBycertificateId(
		long mtCore, long dossierId, long certificateId, int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(mtCore, dossierId, certificateId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findBycertificateId_First(
		long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBycertificateId_First(mtCore, dossierId, certificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchBycertificateId_First(
		long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(mtCore, dossierId,
			certificateId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findBycertificateId_Last(
		long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBycertificateId_Last(mtCore, dossierId, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchBycertificateId_Last(
		long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(mtCore, dossierId, certificateId,
			orderByComparator);
	}

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate[] findBycertificateId_PrevAndNext(
		long id, long mtCore, long dossierId, long certificateId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, mtCore, dossierId,
			certificateId, orderByComparator);
	}

	/**
	* Removes all the vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long mtCore, long dossierId,
		long certificateId) {
		getPersistence().removeBycertificateId(mtCore, dossierId, certificateId);
	}

	/**
	* Returns the number of vr issue vehiclecertificates where mtCore = &#63; and dossierId = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param certificateId the certificate ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public static int countBycertificateId(long mtCore, long dossierId,
		long certificateId) {
		return getPersistence()
				   .countBycertificateId(mtCore, dossierId, certificateId);
	}

	/**
	* Returns all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId(long issueId) {
		return getPersistence().findByissueId(issueId);
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end) {
		return getPersistence().findByissueId(issueId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findByissueId_First(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence().findByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the first vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchByissueId_First(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence().fetchByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate findByissueId_Last(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence().findByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue vehiclecertificate, or <code>null</code> if a matching vr issue vehiclecertificate could not be found
	*/
	public static VRIssueVehiclecertificate fetchByissueId_Last(long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence().fetchByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the vr issue vehiclecertificates before and after the current vr issue vehiclecertificate in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue vehiclecertificate
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate[] findByissueId_PrevAndNext(
		long id, long issueId,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence()
				   .findByissueId_PrevAndNext(id, issueId, orderByComparator);
	}

	/**
	* Removes all the vr issue vehiclecertificates where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public static void removeByissueId(long issueId) {
		getPersistence().removeByissueId(issueId);
	}

	/**
	* Returns the number of vr issue vehiclecertificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue vehiclecertificates
	*/
	public static int countByissueId(long issueId) {
		return getPersistence().countByissueId(issueId);
	}

	/**
	* Caches the vr issue vehiclecertificate in the entity cache if it is enabled.
	*
	* @param vrIssueVehiclecertificate the vr issue vehiclecertificate
	*/
	public static void cacheResult(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		getPersistence().cacheResult(vrIssueVehiclecertificate);
	}

	/**
	* Caches the vr issue vehiclecertificates in the entity cache if it is enabled.
	*
	* @param vrIssueVehiclecertificates the vr issue vehiclecertificates
	*/
	public static void cacheResult(
		List<VRIssueVehiclecertificate> vrIssueVehiclecertificates) {
		getPersistence().cacheResult(vrIssueVehiclecertificates);
	}

	/**
	* Creates a new vr issue vehiclecertificate with the primary key. Does not add the vr issue vehiclecertificate to the database.
	*
	* @param id the primary key for the new vr issue vehiclecertificate
	* @return the new vr issue vehiclecertificate
	*/
	public static VRIssueVehiclecertificate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr issue vehiclecertificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate that was removed
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence().remove(id);
	}

	public static VRIssueVehiclecertificate updateImpl(
		VRIssueVehiclecertificate vrIssueVehiclecertificate) {
		return getPersistence().updateImpl(vrIssueVehiclecertificate);
	}

	/**
	* Returns the vr issue vehiclecertificate with the primary key or throws a {@link NoSuchVRIssueVehiclecertificateException} if it could not be found.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate
	* @throws NoSuchVRIssueVehiclecertificateException if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueVehiclecertificateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr issue vehiclecertificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue vehiclecertificate
	* @return the vr issue vehiclecertificate, or <code>null</code> if a vr issue vehiclecertificate with the primary key could not be found
	*/
	public static VRIssueVehiclecertificate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRIssueVehiclecertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr issue vehiclecertificates.
	*
	* @return the vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @return the range of vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findAll(int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue vehiclecertificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueVehiclecertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue vehiclecertificates
	* @param end the upper bound of the range of vr issue vehiclecertificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue vehiclecertificates
	*/
	public static List<VRIssueVehiclecertificate> findAll(int start, int end,
		OrderByComparator<VRIssueVehiclecertificate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr issue vehiclecertificates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr issue vehiclecertificates.
	*
	* @return the number of vr issue vehiclecertificates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRIssueVehiclecertificatePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRIssueVehiclecertificatePersistence, VRIssueVehiclecertificatePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRIssueVehiclecertificatePersistence.class);
}