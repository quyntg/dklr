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

import com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException;
import com.fds.vr.business.model.VRRPDossierStatistics;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrrp dossier statistics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRRPDossierStatisticsPersistenceImpl
 * @see VRRPDossierStatisticsUtil
 * @generated
 */
@ProviderType
public interface VRRPDossierStatisticsPersistence extends BasePersistence<VRRPDossierStatistics> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRRPDossierStatisticsUtil} to access the vrrp dossier statistics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN);

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
	public java.util.List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByDossierIdCTN(
		long dossierid, java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierIdCTN_First(long dossierid,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierIdCTN_First(long dossierid,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierIdCTN_Last(long dossierid,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierIdCTN_Last(long dossierid,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public VRRPDossierStatistics[] findByDossierIdCTN_PrevAndNext(long id,
		long dossierid, java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63; from the database.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	*/
	public void removeByDossierIdCTN(long dossierid,
		java.lang.String dossierIdCTN);

	/**
	* Returns the number of vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	*
	* @param dossierid the dossierid
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByDossierIdCTN(long dossierid, java.lang.String dossierIdCTN);

	/**
	* Returns all the vrrp dossier statisticses where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByDossierId(long dossierid);

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
	public java.util.List<VRRPDossierStatistics> findByDossierId(
		long dossierid, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByDossierId(
		long dossierid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByDossierId(
		long dossierid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierId_First(long dossierid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierId_First(long dossierid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierId_Last(long dossierid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierId_Last(long dossierid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierid = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param dossierid the dossierid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics[] findByDossierId_PrevAndNext(long id,
		long dossierid,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where dossierid = &#63; from the database.
	*
	* @param dossierid the dossierid
	*/
	public void removeByDossierId(long dossierid);

	/**
	* Returns the number of vrrp dossier statisticses where dossierid = &#63;.
	*
	* @param dossierid the dossierid
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByDossierId(long dossierid);

	/**
	* Returns all the vrrp dossier statisticses where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno);

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
	public java.util.List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByDossierNo(
		java.lang.String dossierno, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierNo_First(
		java.lang.String dossierno,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierNo_First(
		java.lang.String dossierno,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByDossierNo_Last(
		java.lang.String dossierno,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByDossierNo_Last(
		java.lang.String dossierno,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierno = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param dossierno the dossierno
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics[] findByDossierNo_PrevAndNext(long id,
		java.lang.String dossierno,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where dossierno = &#63; from the database.
	*
	* @param dossierno the dossierno
	*/
	public void removeByDossierNo(java.lang.String dossierno);

	/**
	* Returns the number of vrrp dossier statisticses where dossierno = &#63;.
	*
	* @param dossierno the dossierno
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByDossierNo(java.lang.String dossierno);

	/**
	* Returns all the vrrp dossier statisticses where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo);

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
	public java.util.List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByApplicantNo_First(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByApplicantNo_First(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByApplicantNo_Last(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByApplicantNo_Last(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics[] findByApplicantNo_PrevAndNext(long id,
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where applicantNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	*/
	public void removeByApplicantNo(java.lang.String applicantNo);

	/**
	* Returns the number of vrrp dossier statisticses where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByApplicantNo(java.lang.String applicantNo);

	/**
	* Returns all the vrrp dossier statisticses where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId);

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
	public java.util.List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics[] findByCorporationId_PrevAndNext(long id,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public void removeByCorporationId(java.lang.String corporationId);

	/**
	* Returns the number of vrrp dossier statisticses where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByCorporationId(java.lang.String corporationId);

	/**
	* Returns all the vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @return the matching vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode);

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
	public java.util.List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findByInspectorcode(
		java.lang.String inspectorcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByInspectorcode_First(
		java.lang.String inspectorcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByInspectorcode_First(
		java.lang.String inspectorcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByInspectorcode_Last(
		java.lang.String inspectorcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByInspectorcode_Last(
		java.lang.String inspectorcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

	/**
	* Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	*
	* @param id the primary key of the current vrrp dossier statistics
	* @param inspectorcode the inspectorcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics[] findByInspectorcode_PrevAndNext(long id,
		java.lang.String inspectorcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Removes all the vrrp dossier statisticses where inspectorcode = &#63; from the database.
	*
	* @param inspectorcode the inspectorcode
	*/
	public void removeByInspectorcode(java.lang.String inspectorcode);

	/**
	* Returns the number of vrrp dossier statisticses where inspectorcode = &#63;.
	*
	* @param inspectorcode the inspectorcode
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByInspectorcode(java.lang.String inspectorcode);

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics findByF_dossierIdCTN(
		java.lang.String dossierIdCTN)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByF_dossierIdCTN(
		java.lang.String dossierIdCTN);

	/**
	* Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	*/
	public VRRPDossierStatistics fetchByF_dossierIdCTN(
		java.lang.String dossierIdCTN, boolean retrieveFromCache);

	/**
	* Removes the vrrp dossier statistics where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the vrrp dossier statistics that was removed
	*/
	public VRRPDossierStatistics removeByF_dossierIdCTN(
		java.lang.String dossierIdCTN)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the number of vrrp dossier statisticses where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vrrp dossier statisticses
	*/
	public int countByF_dossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Caches the vrrp dossier statistics in the entity cache if it is enabled.
	*
	* @param vrrpDossierStatistics the vrrp dossier statistics
	*/
	public void cacheResult(VRRPDossierStatistics vrrpDossierStatistics);

	/**
	* Caches the vrrp dossier statisticses in the entity cache if it is enabled.
	*
	* @param vrrpDossierStatisticses the vrrp dossier statisticses
	*/
	public void cacheResult(
		java.util.List<VRRPDossierStatistics> vrrpDossierStatisticses);

	/**
	* Creates a new vrrp dossier statistics with the primary key. Does not add the vrrp dossier statistics to the database.
	*
	* @param id the primary key for the new vrrp dossier statistics
	* @return the new vrrp dossier statistics
	*/
	public VRRPDossierStatistics create(long id);

	/**
	* Removes the vrrp dossier statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics that was removed
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics remove(long id)
		throws NoSuchVRRPDossierStatisticsException;

	public VRRPDossierStatistics updateImpl(
		VRRPDossierStatistics vrrpDossierStatistics);

	/**
	* Returns the vrrp dossier statistics with the primary key or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics
	* @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics findByPrimaryKey(long id)
		throws NoSuchVRRPDossierStatisticsException;

	/**
	* Returns the vrrp dossier statistics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrrp dossier statistics
	* @return the vrrp dossier statistics, or <code>null</code> if a vrrp dossier statistics with the primary key could not be found
	*/
	public VRRPDossierStatistics fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRRPDossierStatistics> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrrp dossier statisticses.
	*
	* @return the vrrp dossier statisticses
	*/
	public java.util.List<VRRPDossierStatistics> findAll();

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
	public java.util.List<VRRPDossierStatistics> findAll(int start, int end);

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
	public java.util.List<VRRPDossierStatistics> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator);

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
	public java.util.List<VRRPDossierStatistics> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrrp dossier statisticses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrrp dossier statisticses.
	*
	* @return the number of vrrp dossier statisticses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}