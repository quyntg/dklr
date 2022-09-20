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

import com.fds.vr.business.model.VRVehicleRecord;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr vehicle record service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRVehicleRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRVehicleRecordPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRVehicleRecordPersistenceImpl
 * @generated
 */
@ProviderType
public class VRVehicleRecordUtil {
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
	public static void clearCache(VRVehicleRecord vrVehicleRecord) {
		getPersistence().clearCache(vrVehicleRecord);
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
	public static List<VRVehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRVehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRVehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRVehicleRecord update(VRVehicleRecord vrVehicleRecord) {
		return getPersistence().update(vrVehicleRecord);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRVehicleRecord update(VRVehicleRecord vrVehicleRecord,
		ServiceContext serviceContext) {
		return getPersistence().update(vrVehicleRecord, serviceContext);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByissueVehicleCertificateId_First(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByissueVehicleCertificateId_First(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByissueVehicleCertificateId_Last(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByissueVehicleCertificateId_Last(mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByissueVehicleCertificateId_PrevAndNext(id, mtCore,
			issueVehicleCertificateId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public static void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		getPersistence()
			.removeByissueVehicleCertificateId(mtCore, issueVehicleCertificateId);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr vehicle records
	*/
	public static int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		return getPersistence()
				   .countByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId) {
		return getPersistence().findBydossierId(mtCore, dossierId);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end) {
		return getPersistence().findBydossierId(mtCore, dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBydossierId(long mtCore,
		long dossierId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findBydossierId_First(long mtCore,
		long dossierId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchBydossierId_First(long mtCore,
		long dossierId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findBydossierId_Last(long mtCore,
		long dossierId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchBydossierId_Last(long mtCore,
		long dossierId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(mtCore, dossierId, orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and dossierId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findBydossierId_PrevAndNext(long id,
		long mtCore, long dossierId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, mtCore, dossierId,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and dossierId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long mtCore, long dossierId) {
		getPersistence().removeBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and dossierId = &#63;.
	*
	* @param mtCore the mt core
	* @param dossierId the dossier ID
	* @return the number of matching vr vehicle records
	*/
	public static int countBydossierId(long mtCore, long dossierId) {
		return getPersistence().countBydossierId(mtCore, dossierId);
	}

	/**
	* Returns the vr vehicle record where frameNo = &#63; or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	*
	* @param frameNo the frame no
	* @return the matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByframeNo(java.lang.String frameNo)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().findByframeNo(frameNo);
	}

	/**
	* Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param frameNo the frame no
	* @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByframeNo(java.lang.String frameNo) {
		return getPersistence().fetchByframeNo(frameNo);
	}

	/**
	* Returns the vr vehicle record where frameNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param frameNo the frame no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByframeNo(java.lang.String frameNo,
		boolean retrieveFromCache) {
		return getPersistence().fetchByframeNo(frameNo, retrieveFromCache);
	}

	/**
	* Removes the vr vehicle record where frameNo = &#63; from the database.
	*
	* @param frameNo the frame no
	* @return the vr vehicle record that was removed
	*/
	public static VRVehicleRecord removeByframeNo(java.lang.String frameNo)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().removeByframeNo(frameNo);
	}

	/**
	* Returns the number of vr vehicle records where frameNo = &#63;.
	*
	* @param frameNo the frame no
	* @return the number of matching vr vehicle records
	*/
	public static int countByframeNo(java.lang.String frameNo) {
		return getPersistence().countByframeNo(frameNo);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId) {
		return getPersistence().findBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findBycertificateId_First(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchBycertificateId_First(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findBycertificateId_Last(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchBycertificateId_Last(long mtCore,
		long certificateId, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and certificateId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, mtCore, certificateId,
			orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and certificateId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long mtCore, long certificateId) {
		getPersistence().removeBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and certificateId = &#63;.
	*
	* @param mtCore the mt core
	* @param certificateId the certificate ID
	* @return the number of matching vr vehicle records
	*/
	public static int countBycertificateId(long mtCore, long certificateId) {
		return getPersistence().countBycertificateId(mtCore, certificateId);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileId(mtCore, applicantProfileId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileId_First(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_First(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileId_Last(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileId_Last(mtCore, applicantProfileId,
			orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findByapplicantProfileId_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileId_PrevAndNext(id, mtCore,
			applicantProfileId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	*/
	public static void removeByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		getPersistence().removeByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @return the number of matching vr vehicle records
	*/
	public static int countByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		return getPersistence()
				   .countByapplicantProfileId(mtCore, applicantProfileId);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus) {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end) {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus_First(mtCore,
			applicantProfileId, printingStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_First(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileIdAndPrintingStatus_First(mtCore,
			applicantProfileId, printingStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus_Last(mtCore,
			applicantProfileId, printingStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileIdAndPrintingStatus_Last(
		long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileIdAndPrintingStatus_Last(mtCore,
			applicantProfileId, printingStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findByapplicantProfileIdAndPrintingStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId, long printingStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndPrintingStatus_PrevAndNext(id,
			mtCore, applicantProfileId, printingStatus, orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	*/
	public static void removeByapplicantProfileIdAndPrintingStatus(
		long mtCore, long applicantProfileId, long printingStatus) {
		getPersistence()
			.removeByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and printingStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param printingStatus the printing status
	* @return the number of matching vr vehicle records
	*/
	public static int countByapplicantProfileIdAndPrintingStatus(long mtCore,
		long applicantProfileId, long printingStatus) {
		return getPersistence()
				   .countByapplicantProfileIdAndPrintingStatus(mtCore,
			applicantProfileId, printingStatus);
	}

	/**
	* Returns all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus) {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus);
	}

	/**
	* Returns a range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end) {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus_First(mtCore,
			applicantProfileId, vehicleRecordStatus, orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_First(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileIdAndVehicleRecordStatus_First(mtCore,
			applicantProfileId, vehicleRecordStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus_Last(mtCore,
			applicantProfileId, vehicleRecordStatus, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByapplicantProfileIdAndVehicleRecordStatus_Last(
		long mtCore, long applicantProfileId, long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .fetchByapplicantProfileIdAndVehicleRecordStatus_Last(mtCore,
			applicantProfileId, vehicleRecordStatus, orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		long vehicleRecordStatus,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByapplicantProfileIdAndVehicleRecordStatus_PrevAndNext(id,
			mtCore, applicantProfileId, vehicleRecordStatus, orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	*/
	public static void removeByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus) {
		getPersistence()
			.removeByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus);
	}

	/**
	* Returns the number of vr vehicle records where mtCore = &#63; and applicantProfileId = &#63; and vehicleRecordStatus = &#63;.
	*
	* @param mtCore the mt core
	* @param applicantProfileId the applicant profile ID
	* @param vehicleRecordStatus the vehicle record status
	* @return the number of matching vr vehicle records
	*/
	public static int countByapplicantProfileIdAndVehicleRecordStatus(
		long mtCore, long applicantProfileId, long vehicleRecordStatus) {
		return getPersistence()
				   .countByapplicantProfileIdAndVehicleRecordStatus(mtCore,
			applicantProfileId, vehicleRecordStatus);
	}

	/**
	* Returns all the vr vehicle records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueId(long issueId) {
		return getPersistence().findByissueId(issueId);
	}

	/**
	* Returns a range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueId(long issueId, int start,
		int end) {
		return getPersistence().findByissueId(issueId, start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr vehicle records
	*/
	public static List<VRVehicleRecord> findByissueId(long issueId, int start,
		int end, OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByissueId_First(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().findByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the first vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByissueId_First(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence().fetchByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord findByissueId_Last(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().findByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the last vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr vehicle record, or <code>null</code> if a matching vr vehicle record could not be found
	*/
	public static VRVehicleRecord fetchByissueId_Last(long issueId,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence().fetchByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the vr vehicle records before and after the current vr vehicle record in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr vehicle record
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord[] findByissueId_PrevAndNext(long id,
		long issueId, OrderByComparator<VRVehicleRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence()
				   .findByissueId_PrevAndNext(id, issueId, orderByComparator);
	}

	/**
	* Removes all the vr vehicle records where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public static void removeByissueId(long issueId) {
		getPersistence().removeByissueId(issueId);
	}

	/**
	* Returns the number of vr vehicle records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr vehicle records
	*/
	public static int countByissueId(long issueId) {
		return getPersistence().countByissueId(issueId);
	}

	/**
	* Caches the vr vehicle record in the entity cache if it is enabled.
	*
	* @param vrVehicleRecord the vr vehicle record
	*/
	public static void cacheResult(VRVehicleRecord vrVehicleRecord) {
		getPersistence().cacheResult(vrVehicleRecord);
	}

	/**
	* Caches the vr vehicle records in the entity cache if it is enabled.
	*
	* @param vrVehicleRecords the vr vehicle records
	*/
	public static void cacheResult(List<VRVehicleRecord> vrVehicleRecords) {
		getPersistence().cacheResult(vrVehicleRecords);
	}

	/**
	* Creates a new vr vehicle record with the primary key. Does not add the vr vehicle record to the database.
	*
	* @param id the primary key for the new vr vehicle record
	* @return the new vr vehicle record
	*/
	public static VRVehicleRecord create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record that was removed
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().remove(id);
	}

	public static VRVehicleRecord updateImpl(VRVehicleRecord vrVehicleRecord) {
		return getPersistence().updateImpl(vrVehicleRecord);
	}

	/**
	* Returns the vr vehicle record with the primary key or throws a {@link NoSuchVRVehicleRecordException} if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record
	* @throws NoSuchVRVehicleRecordException if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRVehicleRecordException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr vehicle record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr vehicle record
	* @return the vr vehicle record, or <code>null</code> if a vr vehicle record with the primary key could not be found
	*/
	public static VRVehicleRecord fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRVehicleRecord> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr vehicle records.
	*
	* @return the vr vehicle records
	*/
	public static List<VRVehicleRecord> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @return the range of vr vehicle records
	*/
	public static List<VRVehicleRecord> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr vehicle records
	*/
	public static List<VRVehicleRecord> findAll(int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRVehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr vehicle records
	* @param end the upper bound of the range of vr vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr vehicle records
	*/
	public static List<VRVehicleRecord> findAll(int start, int end,
		OrderByComparator<VRVehicleRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr vehicle records from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr vehicle records.
	*
	* @return the number of vr vehicle records
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRVehicleRecordPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRVehicleRecordPersistence, VRVehicleRecordPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRVehicleRecordPersistence.class);
}