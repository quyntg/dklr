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

import com.fds.vr.business.exception.NoSuchVRCorporationViewException;
import com.fds.vr.business.model.VRCorporationView;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr corporation view service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationViewPersistenceImpl
 * @see VRCorporationViewUtil
 * @generated
 */
@ProviderType
public interface VRCorporationViewPersistence extends BasePersistence<VRCorporationView> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationViewUtil} to access the vr corporation view persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorId(long inspectorId);

	/**
	* Returns a range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorId(
		long inspectorId, int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorId(
		long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views where inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorId(
		long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByInspectorId_First(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the first vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorId_First(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByInspectorId_Last(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the last vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorId_Last(long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where inspectorId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView[] findByInspectorId_PrevAndNext(long id,
		long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Removes all the vr corporation views where inspectorId = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	*/
	public void removeByInspectorId(long inspectorId);

	/**
	* Returns the number of vr corporation views where inspectorId = &#63;.
	*
	* @param inspectorId the inspector ID
	* @return the number of matching vr corporation views
	*/
	public int countByInspectorId(long inspectorId);

	/**
	* Returns all the vr corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId);

	/**
	* Returns a range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView[] findByCorporationId_PrevAndNext(long id,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Removes all the vr corporation views where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public void removeByCorporationId(java.lang.String corporationId);

	/**
	* Returns the number of vr corporation views where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr corporation views
	*/
	public int countByCorporationId(java.lang.String corporationId);

	/**
	* Returns all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId);

	/**
	* Returns a range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the first vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorIdCorporationId_First(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the last vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorIdCorporationId_Last(
		java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView[] findByInspectorIdCorporationId_PrevAndNext(
		long id, java.lang.String corporationId, long inspectorId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Removes all the vr corporation views where corporationId = &#63; and inspectorId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	*/
	public void removeByInspectorIdCorporationId(
		java.lang.String corporationId, long inspectorId);

	/**
	* Returns the number of vr corporation views where corporationId = &#63; and inspectorId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param inspectorId the inspector ID
	* @return the number of matching vr corporation views
	*/
	public int countByInspectorIdCorporationId(java.lang.String corporationId,
		long inspectorId);

	/**
	* Returns all the vr corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByIsLeader(int isLeader);

	/**
	* Returns a range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views where isLeader = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isLeader the is leader
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation views
	*/
	public java.util.List<VRCorporationView> findByIsLeader(int isLeader,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByIsLeader_First(int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the first vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByIsLeader_First(int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByIsLeader_Last(int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the last vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByIsLeader_Last(int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns the vr corporation views before and after the current vr corporation view in the ordered set where isLeader = &#63;.
	*
	* @param id the primary key of the current vr corporation view
	* @param isLeader the is leader
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView[] findByIsLeader_PrevAndNext(long id,
		int isLeader,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator)
		throws NoSuchVRCorporationViewException;

	/**
	* Removes all the vr corporation views where isLeader = &#63; from the database.
	*
	* @param isLeader the is leader
	*/
	public void removeByIsLeader(int isLeader);

	/**
	* Returns the number of vr corporation views where isLeader = &#63;.
	*
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public int countByIsLeader(int isLeader);

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader);

	/**
	* Returns the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader,
		boolean retrieveFromCache);

	/**
	* Removes the vr corporation view where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the vr corporation view that was removed
	*/
	public VRCorporationView removeByInspectorIdCorporationIdIsLeader(
		long inspectorId, java.lang.String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the number of vr corporation views where inspectorId = &#63; and corporationId = &#63; and isLeader = &#63;.
	*
	* @param inspectorId the inspector ID
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public int countByInspectorIdCorporationIdIsLeader(long inspectorId,
		java.lang.String corporationId, int isLeader);

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view
	* @throws NoSuchVRCorporationViewException if a matching vr corporation view could not be found
	*/
	public VRCorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader);

	/**
	* Returns the vr corporation view where corporationId = &#63; and isLeader = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation view, or <code>null</code> if a matching vr corporation view could not be found
	*/
	public VRCorporationView fetchByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader, boolean retrieveFromCache);

	/**
	* Removes the vr corporation view where corporationId = &#63; and isLeader = &#63; from the database.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the vr corporation view that was removed
	*/
	public VRCorporationView removeByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isLeader)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the number of vr corporation views where corporationId = &#63; and isLeader = &#63;.
	*
	* @param corporationId the corporation ID
	* @param isLeader the is leader
	* @return the number of matching vr corporation views
	*/
	public int countByCorporationIdAndIsLeader(java.lang.String corporationId,
		int isLeader);

	/**
	* Caches the vr corporation view in the entity cache if it is enabled.
	*
	* @param vrCorporationView the vr corporation view
	*/
	public void cacheResult(VRCorporationView vrCorporationView);

	/**
	* Caches the vr corporation views in the entity cache if it is enabled.
	*
	* @param vrCorporationViews the vr corporation views
	*/
	public void cacheResult(
		java.util.List<VRCorporationView> vrCorporationViews);

	/**
	* Creates a new vr corporation view with the primary key. Does not add the vr corporation view to the database.
	*
	* @param id the primary key for the new vr corporation view
	* @return the new vr corporation view
	*/
	public VRCorporationView create(long id);

	/**
	* Removes the vr corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view that was removed
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView remove(long id)
		throws NoSuchVRCorporationViewException;

	public VRCorporationView updateImpl(VRCorporationView vrCorporationView);

	/**
	* Returns the vr corporation view with the primary key or throws a {@link NoSuchVRCorporationViewException} if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view
	* @throws NoSuchVRCorporationViewException if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView findByPrimaryKey(long id)
		throws NoSuchVRCorporationViewException;

	/**
	* Returns the vr corporation view with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation view
	* @return the vr corporation view, or <code>null</code> if a vr corporation view with the primary key could not be found
	*/
	public VRCorporationView fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCorporationView> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr corporation views.
	*
	* @return the vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll();

	/**
	* Returns a range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @return the range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation views
	* @param end the upper bound of the range of vr corporation views (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation views
	*/
	public java.util.List<VRCorporationView> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationView> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr corporation views from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr corporation views.
	*
	* @return the number of vr corporation views
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}