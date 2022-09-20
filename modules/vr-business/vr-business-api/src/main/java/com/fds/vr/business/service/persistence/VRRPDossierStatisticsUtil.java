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

import com.fds.vr.business.model.VRRPDossierStatistics;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrrp dossier statistics service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRRPDossierStatisticsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRRPDossierStatisticsPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRRPDossierStatisticsPersistenceImpl
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsUtil {
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
	public static void clearCache(VRRPDossierStatistics vrrpDossierStatistics) {
		getPersistence().clearCache(vrrpDossierStatistics);
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
	public static List<VRRPDossierStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRRPDossierStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRRPDossierStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRRPDossierStatistics update(
		VRRPDossierStatistics vrrpDossierStatistics) {
		return getPersistence().update(vrrpDossierStatistics);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRRPDossierStatistics update(
		VRRPDossierStatistics vrrpDossierStatistics,
		ServiceContext serviceContext) {
		return getPersistence().update(vrrpDossierStatistics, serviceContext);
	}

	/**
	* Returns all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN) {
		return getPersistence().findByDossierIdCTN(dossierid, dossierIdCTN);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end) {
		return getPersistence()
				   .findByDossierIdCTN(dossierid, dossierIdCTN, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByDossierIdCTN(dossierid, dossierIdCTN, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierIdCTN(dossierid, dossierIdCTN, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierIdCTN_First(
		long dossierid, java.lang.String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierIdCTN_First(dossierid, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierIdCTN_First(
		long dossierid, java.lang.String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdCTN_First(dossierid, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierIdCTN_Last(
		long dossierid, java.lang.String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierIdCTN_Last(dossierid, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierIdCTN_Last(
		long dossierid, java.lang.String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierIdCTN_Last(dossierid, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByDossierIdCTN_PrevAndNext(
		long id, long dossierid, java.lang.String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierIdCTN_PrevAndNext(id, dossierid, dossierIdCTN,
			orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63; from the database.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	*/
	public static void removeByDossierIdCTN(long dossierid,
		java.lang.String dossierIdCTN) {
		getPersistence().removeByDossierIdCTN(dossierid, dossierIdCTN);
	}

	/**
	* Returns the number of vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByDossierIdCTN(long dossierid,
		java.lang.String dossierIdCTN) {
		return getPersistence().countByDossierIdCTN(dossierid, dossierIdCTN);
	}

	/**
	* Returns all the vrrp dossier statisticses where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierId(long dossierid) {
		return getPersistence().findByDossierId(dossierid);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where dossierid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end) {
		return getPersistence().findByDossierId(dossierid, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByDossierId(dossierid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierid the dossierid
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierId(dossierid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierId_First(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierId_First(dossierid, orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierId_First(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_First(dossierid, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierId_Last(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierId_Last(dossierid, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierId_Last(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierId_Last(dossierid, orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByDossierId_PrevAndNext(long id,
		long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierId_PrevAndNext(id, dossierid, orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where dossierid = &#63; from the database.
	*
	* @param dossierid the dossierid
	*/
	public static void removeByDossierId(long dossierid) {
		getPersistence().removeByDossierId(dossierid);
	}

	/**
	* Returns the number of vrrp dossier statisticses where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByDossierId(long dossierid) {
		return getPersistence().countByDossierId(dossierid);
	}

	/**
	* Returns all the vrrp dossier statisticses where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno) {
		return getPersistence().findByDossierNo(dossierno);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where dossierno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierno the dossierno
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end) {
		return getPersistence().findByDossierNo(dossierno, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierno the dossierno
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByDossierNo(dossierno, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where dossierno = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierno the dossierno
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDossierNo(dossierno, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierNo_First(
		java.lang.String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierNo_First(dossierno, orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierNo_First(
		java.lang.String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_First(dossierno, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByDossierNo_Last(
		java.lang.String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierNo_Last(dossierno, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByDossierNo_Last(
		java.lang.String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByDossierNo_Last(dossierno, orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByDossierNo_PrevAndNext(long id,
		java.lang.String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByDossierNo_PrevAndNext(id, dossierno, orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where dossierno = &#63; from the database.
	*
	* @param dossierno the dossierno
	*/
	public static void removeByDossierNo(java.lang.String dossierno) {
		getPersistence().removeByDossierNo(dossierno);
	}

	/**
	* Returns the number of vrrp dossier statisticses where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByDossierNo(java.lang.String dossierno) {
		return getPersistence().countByDossierNo(dossierno);
	}

	/**
	* Returns all the vrrp dossier statisticses where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo) {
		return getPersistence().findByApplicantNo(applicantNo);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end) {
		return getPersistence().findByApplicantNo(applicantNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByApplicantNo(applicantNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApplicantNo(applicantNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByApplicantNo_First(
		java.lang.String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByApplicantNo_First(applicantNo, orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByApplicantNo_First(
		java.lang.String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_First(applicantNo, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByApplicantNo_Last(
		java.lang.String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByApplicantNo_Last(applicantNo, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByApplicantNo_Last(
		java.lang.String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByApplicantNo_Last(applicantNo, orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByApplicantNo_PrevAndNext(
		long id, java.lang.String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByApplicantNo_PrevAndNext(id, applicantNo,
			orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where applicantNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	*/
	public static void removeByApplicantNo(java.lang.String applicantNo) {
		getPersistence().removeByApplicantNo(applicantNo);
	}

	/**
	* Returns the number of vrrp dossier statisticses where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByApplicantNo(java.lang.String applicantNo) {
		return getPersistence().countByApplicantNo(applicantNo);
	}

	/**
	* Returns all the vrrp dossier statisticses where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId) {
		return getPersistence().findByCorporationId(corporationId);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end) {
		return getPersistence().findByCorporationId(corporationId, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCorporationId(corporationId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByCorporationId_First(
		java.lang.String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_First(corporationId, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByCorporationId_Last(
		java.lang.String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByCorporationId_Last(corporationId, orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByCorporationId_PrevAndNext(
		long id, java.lang.String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByCorporationId_PrevAndNext(id, corporationId,
			orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public static void removeByCorporationId(java.lang.String corporationId) {
		getPersistence().removeByCorporationId(corporationId);
	}

	/**
	* Returns the number of vrrp dossier statisticses where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByCorporationId(java.lang.String corporationId) {
		return getPersistence().countByCorporationId(corporationId);
	}

	/**
	* Returns all the vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @return the matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode) {
		return getPersistence().findByInspectorcode(inspectorcode);
	}

	/**
	* Returns a range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcode the inspectorcode
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end) {
		return getPersistence().findByInspectorcode(inspectorcode, start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcode the inspectorcode
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .findByInspectorcode(inspectorcode, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorcode the inspectorcode
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByInspectorcode(inspectorcode, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByInspectorcode_First(
		java.lang.String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByInspectorcode_First(inspectorcode, orderByComparator);
	}

	/**
	* Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByInspectorcode_First(
		java.lang.String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorcode_First(inspectorcode, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByInspectorcode_Last(
		java.lang.String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByInspectorcode_Last(inspectorcode, orderByComparator);
	}

	/**
	* Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByInspectorcode_Last(
		java.lang.String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence()
				   .fetchByInspectorcode_Last(inspectorcode, orderByComparator);
	}

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics[] findByInspectorcode_PrevAndNext(
		long id, java.lang.String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence()
				   .findByInspectorcode_PrevAndNext(id, inspectorcode,
			orderByComparator);
	}

	/**
	* Removes all the vrrp dossier statisticses where inspectorcode = &#63; from the database.
	*
	* @param inspectorcode the inspectorcode
	*/
	public static void removeByInspectorcode(java.lang.String inspectorcode) {
		getPersistence().removeByInspectorcode(inspectorcode);
	}

	/**
	* Returns the number of vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByInspectorcode(java.lang.String inspectorcode) {
		return getPersistence().countByInspectorcode(inspectorcode);
	}

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics findByF_dossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence().findByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByF_dossierIdCTN(
		java.lang.String dossierIdCTN) {
		return getPersistence().fetchByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public static VRRPDossierStatistics fetchByF_dossierIdCTN(
		java.lang.String dossierIdCTN, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByF_dossierIdCTN(dossierIdCTN, retrieveFromCache);
	}

	/**
	* Removes the vrrp dossier statistics where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the vrrp dossier statistics that was removed
	*/
	public static VRRPDossierStatistics removeByF_dossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence().removeByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Returns the number of vrrp dossier statisticses where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vrrp dossier statisticses
	*/
	public static int countByF_dossierIdCTN(java.lang.String dossierIdCTN) {
		return getPersistence().countByF_dossierIdCTN(dossierIdCTN);
	}

	/**
	* Caches the vrrp dossier statistics in the entity cache if it is enabled.
	*
	* @param vrrpDossierStatistics the vrrp dossier statistics
	*/
	public static void cacheResult(VRRPDossierStatistics vrrpDossierStatistics) {
		getPersistence().cacheResult(vrrpDossierStatistics);
	}

	/**
	* Caches the vrrp dossier statisticses in the entity cache if it is enabled.
	*
	* @param vrrpDossierStatisticses the vrrp dossier statisticses
	*/
	public static void cacheResult(
		List<VRRPDossierStatistics> vrrpDossierStatisticses) {
		getPersistence().cacheResult(vrrpDossierStatisticses);
	}

	/**
	* Creates a new vrrp dossier statistics with the primary key. Does not add the vrrp dossier statistics to the database.
	*
	* @param id the primary key for the new vrrp dossier statistics
	* @return the new vrrp dossier statistics
	*/
	public static VRRPDossierStatistics create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrrp dossier statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics that was removed
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence().remove(id);
	}

	public static VRRPDossierStatistics updateImpl(
		VRRPDossierStatistics vrrpDossierStatistics) {
		return getPersistence().updateImpl(vrrpDossierStatistics);
	}

	/**
	* Returns the vrrp dossier statistics with the primary key or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrrp dossier statistics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics, or <code>null</code> if a vrrp dossier statistics with the primary key could not be found
	*/
	public static VRRPDossierStatistics fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRRPDossierStatistics> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrrp dossier statisticses.
	*
	* @return the vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrrp dossier statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @return the range of vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findAll(int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrrp dossier statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrrp dossier statisticses
	* @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrrp dossier statisticses
	*/
	public static List<VRRPDossierStatistics> findAll(int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrrp dossier statisticses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrrp dossier statisticses.
	*
	* @return the number of vrrp dossier statisticses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRRPDossierStatisticsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRRPDossierStatisticsPersistence, VRRPDossierStatisticsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRRPDossierStatisticsPersistence.class);
}