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

import com.fds.vr.business.exception.NoSuchVRCorporationInspectorException;
import com.fds.vr.business.model.VRCorporationInspector;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr corporation inspector service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRCorporationInspectorPersistenceImpl
 * @see VRCorporationInspectorUtil
 * @generated
 */
@ProviderType
public interface VRCorporationInspectorPersistence extends BasePersistence<VRCorporationInspector> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCorporationInspectorUtil} to access the vr corporation inspector persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	*
	* @param inspectorid the inspectorid
	* @return the matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByInspectorId(long inspectorid)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectorid the inspectorid
	* @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByInspectorId(long inspectorid);

	/**
	* Returns the vr corporation inspector where inspectorid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectorid the inspectorid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByInspectorId(long inspectorid,
		boolean retrieveFromCache);

	/**
	* Removes the vr corporation inspector where inspectorid = &#63; from the database.
	*
	* @param inspectorid the inspectorid
	* @return the vr corporation inspector that was removed
	*/
	public VRCorporationInspector removeByInspectorId(long inspectorid)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the number of vr corporation inspectors where inspectorid = &#63;.
	*
	* @param inspectorid the inspectorid
	* @return the number of matching vr corporation inspectors
	*/
	public int countByInspectorId(long inspectorid);

	/**
	* Returns all the vr corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByTeamId(long teamId);

	/**
	* Returns a range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end);

	/**
	* Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation inspectors where teamId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param teamId the team ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByTeamId(long teamId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByTeamId_First(long teamId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the first vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByTeamId_First(long teamId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByTeamId_Last(long teamId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the last vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByTeamId_Last(long teamId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where teamId = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param teamId the team ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector[] findByTeamId_PrevAndNext(long id,
		long teamId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Removes all the vr corporation inspectors where teamId = &#63; from the database.
	*
	* @param teamId the team ID
	*/
	public void removeByTeamId(long teamId);

	/**
	* Returns the number of vr corporation inspectors where teamId = &#63;.
	*
	* @param teamId the team ID
	* @return the number of matching vr corporation inspectors
	*/
	public int countByTeamId(long teamId);

	/**
	* Returns all the vr corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId);

	/**
	* Returns a range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end);

	/**
	* Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation inspectors where corporationId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporationId the corporation ID
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByCorporationId(
		java.lang.String corporationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the first vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByCorporationId_First(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the last vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByCorporationId_Last(
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where corporationId = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param corporationId the corporation ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector[] findByCorporationId_PrevAndNext(long id,
		java.lang.String corporationId,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Removes all the vr corporation inspectors where corporationId = &#63; from the database.
	*
	* @param corporationId the corporation ID
	*/
	public void removeByCorporationId(java.lang.String corporationId);

	/**
	* Returns the number of vr corporation inspectors where corporationId = &#63;.
	*
	* @param corporationId the corporation ID
	* @return the number of matching vr corporation inspectors
	*/
	public int countByCorporationId(java.lang.String corporationId);

	/**
	* Returns all the vr corporation inspectors where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode);

	/**
	* Returns a range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end);

	/**
	* Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation inspectors where contactcode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contactcode the contactcode
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findByInspectorcode(
		java.lang.String contactcode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByInspectorcode_First(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the first vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByInspectorcode_First(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector findByInspectorcode_Last(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the last vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr corporation inspector, or <code>null</code> if a matching vr corporation inspector could not be found
	*/
	public VRCorporationInspector fetchByInspectorcode_Last(
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns the vr corporation inspectors before and after the current vr corporation inspector in the ordered set where contactcode = &#63;.
	*
	* @param id the primary key of the current vr corporation inspector
	* @param contactcode the contactcode
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector[] findByInspectorcode_PrevAndNext(long id,
		java.lang.String contactcode,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Removes all the vr corporation inspectors where contactcode = &#63; from the database.
	*
	* @param contactcode the contactcode
	*/
	public void removeByInspectorcode(java.lang.String contactcode);

	/**
	* Returns the number of vr corporation inspectors where contactcode = &#63;.
	*
	* @param contactcode the contactcode
	* @return the number of matching vr corporation inspectors
	*/
	public int countByInspectorcode(java.lang.String contactcode);

	/**
	* Caches the vr corporation inspector in the entity cache if it is enabled.
	*
	* @param vrCorporationInspector the vr corporation inspector
	*/
	public void cacheResult(VRCorporationInspector vrCorporationInspector);

	/**
	* Caches the vr corporation inspectors in the entity cache if it is enabled.
	*
	* @param vrCorporationInspectors the vr corporation inspectors
	*/
	public void cacheResult(
		java.util.List<VRCorporationInspector> vrCorporationInspectors);

	/**
	* Creates a new vr corporation inspector with the primary key. Does not add the vr corporation inspector to the database.
	*
	* @param id the primary key for the new vr corporation inspector
	* @return the new vr corporation inspector
	*/
	public VRCorporationInspector create(long id);

	/**
	* Removes the vr corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector that was removed
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector remove(long id)
		throws NoSuchVRCorporationInspectorException;

	public VRCorporationInspector updateImpl(
		VRCorporationInspector vrCorporationInspector);

	/**
	* Returns the vr corporation inspector with the primary key or throws a {@link NoSuchVRCorporationInspectorException} if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector
	* @throws NoSuchVRCorporationInspectorException if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector findByPrimaryKey(long id)
		throws NoSuchVRCorporationInspectorException;

	/**
	* Returns the vr corporation inspector with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr corporation inspector
	* @return the vr corporation inspector, or <code>null</code> if a vr corporation inspector with the primary key could not be found
	*/
	public VRCorporationInspector fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCorporationInspector> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr corporation inspectors.
	*
	* @return the vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll();

	/**
	* Returns a range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @return the range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator);

	/**
	* Returns an ordered range of all the vr corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr corporation inspectors
	* @param end the upper bound of the range of vr corporation inspectors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr corporation inspectors
	*/
	public java.util.List<VRCorporationInspector> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCorporationInspector> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr corporation inspectors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr corporation inspectors.
	*
	* @return the number of vr corporation inspectors
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}