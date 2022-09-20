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

import com.fds.vr.business.model.VRIssueInspectionRecord;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vr issue inspection record service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRIssueInspectionRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssueInspectionRecordPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRIssueInspectionRecordPersistenceImpl
 * @generated
 */
@ProviderType
public class VRIssueInspectionRecordUtil {
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
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		getPersistence().clearCache(vrIssueInspectionRecord);
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
	public static List<VRIssueInspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRIssueInspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRIssueInspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRIssueInspectionRecord update(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		return getPersistence().update(vrIssueInspectionRecord);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRIssueInspectionRecord update(
		VRIssueInspectionRecord vrIssueInspectionRecord,
		ServiceContext serviceContext) {
		return getPersistence().update(vrIssueInspectionRecord, serviceContext);
	}

	/**
	* Returns all the vr issue inspection records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBydossierId(long dossierId) {
		return getPersistence().findBydossierId(dossierId);
	}

	/**
	* Returns a range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end) {
		return getPersistence().findBydossierId(dossierId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBydossierId(
		long dossierId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydossierId(dossierId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findBydossierId_First(
		long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchBydossierId_First(
		long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_First(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findBydossierId_Last(long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchBydossierId_Last(
		long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .fetchBydossierId_Last(dossierId, orderByComparator);
	}

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord[] findBydossierId_PrevAndNext(
		long id, long dossierId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBydossierId_PrevAndNext(id, dossierId, orderByComparator);
	}

	/**
	* Removes all the vr issue inspection records where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public static void removeBydossierId(long dossierId) {
		getPersistence().removeBydossierId(dossierId);
	}

	/**
	* Returns the number of vr issue inspection records where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr issue inspection records
	*/
	public static int countBydossierId(long dossierId) {
		return getPersistence().countBydossierId(dossierId);
	}

	/**
	* Returns all the vr issue inspection records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findByissueId(long issueId) {
		return getPersistence().findByissueId(issueId);
	}

	/**
	* Returns a range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end) {
		return getPersistence().findByissueId(issueId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findByissueId(long issueId,
		int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissueId(issueId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findByissueId_First(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence().findByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchByissueId_First(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence().fetchByissueId_First(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findByissueId_Last(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence().findByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchByissueId_Last(long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence().fetchByissueId_Last(issueId, orderByComparator);
	}

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord[] findByissueId_PrevAndNext(long id,
		long issueId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findByissueId_PrevAndNext(id, issueId, orderByComparator);
	}

	/**
	* Removes all the vr issue inspection records where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public static void removeByissueId(long issueId) {
		getPersistence().removeByissueId(issueId);
	}

	/**
	* Returns the number of vr issue inspection records where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue inspection records
	*/
	public static int countByissueId(long issueId) {
		return getPersistence().countByissueId(issueId);
	}

	/**
	* Returns all the vr issue inspection records where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @return the matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId) {
		return getPersistence().findBycertificateId(certificateId);
	}

	/**
	* Returns a range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end) {
		return getPersistence().findBycertificateId(certificateId, start, end);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .findBycertificateId(certificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records where certificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateId the certificate ID
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findBycertificateId(
		long certificateId, int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycertificateId(certificateId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findBycertificateId_First(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBycertificateId_First(certificateId, orderByComparator);
	}

	/**
	* Returns the first vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchBycertificateId_First(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_First(certificateId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord findBycertificateId_Last(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBycertificateId_Last(certificateId, orderByComparator);
	}

	/**
	* Returns the last vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue inspection record, or <code>null</code> if a matching vr issue inspection record could not be found
	*/
	public static VRIssueInspectionRecord fetchBycertificateId_Last(
		long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence()
				   .fetchBycertificateId_Last(certificateId, orderByComparator);
	}

	/**
	* Returns the vr issue inspection records before and after the current vr issue inspection record in the ordered set where certificateId = &#63;.
	*
	* @param id the primary key of the current vr issue inspection record
	* @param certificateId the certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord[] findBycertificateId_PrevAndNext(
		long id, long certificateId,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence()
				   .findBycertificateId_PrevAndNext(id, certificateId,
			orderByComparator);
	}

	/**
	* Removes all the vr issue inspection records where certificateId = &#63; from the database.
	*
	* @param certificateId the certificate ID
	*/
	public static void removeBycertificateId(long certificateId) {
		getPersistence().removeBycertificateId(certificateId);
	}

	/**
	* Returns the number of vr issue inspection records where certificateId = &#63;.
	*
	* @param certificateId the certificate ID
	* @return the number of matching vr issue inspection records
	*/
	public static int countBycertificateId(long certificateId) {
		return getPersistence().countBycertificateId(certificateId);
	}

	/**
	* Caches the vr issue inspection record in the entity cache if it is enabled.
	*
	* @param vrIssueInspectionRecord the vr issue inspection record
	*/
	public static void cacheResult(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		getPersistence().cacheResult(vrIssueInspectionRecord);
	}

	/**
	* Caches the vr issue inspection records in the entity cache if it is enabled.
	*
	* @param vrIssueInspectionRecords the vr issue inspection records
	*/
	public static void cacheResult(
		List<VRIssueInspectionRecord> vrIssueInspectionRecords) {
		getPersistence().cacheResult(vrIssueInspectionRecords);
	}

	/**
	* Creates a new vr issue inspection record with the primary key. Does not add the vr issue inspection record to the database.
	*
	* @param id the primary key for the new vr issue inspection record
	* @return the new vr issue inspection record
	*/
	public static VRIssueInspectionRecord create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vr issue inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record that was removed
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence().remove(id);
	}

	public static VRIssueInspectionRecord updateImpl(
		VRIssueInspectionRecord vrIssueInspectionRecord) {
		return getPersistence().updateImpl(vrIssueInspectionRecord);
	}

	/**
	* Returns the vr issue inspection record with the primary key or throws a {@link NoSuchVRIssueInspectionRecordException} if it could not be found.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record
	* @throws NoSuchVRIssueInspectionRecordException if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRIssueInspectionRecordException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vr issue inspection record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue inspection record
	* @return the vr issue inspection record, or <code>null</code> if a vr issue inspection record with the primary key could not be found
	*/
	public static VRIssueInspectionRecord fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRIssueInspectionRecord> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vr issue inspection records.
	*
	* @return the vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @return the range of vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findAll(int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vr issue inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueInspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue inspection records
	* @param end the upper bound of the range of vr issue inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue inspection records
	*/
	public static List<VRIssueInspectionRecord> findAll(int start, int end,
		OrderByComparator<VRIssueInspectionRecord> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vr issue inspection records from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vr issue inspection records.
	*
	* @return the number of vr issue inspection records
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRIssueInspectionRecordPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRIssueInspectionRecordPersistence, VRIssueInspectionRecordPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRIssueInspectionRecordPersistence.class);
}