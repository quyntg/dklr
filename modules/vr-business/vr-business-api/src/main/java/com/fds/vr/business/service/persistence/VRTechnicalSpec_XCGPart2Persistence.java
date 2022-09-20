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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGPart2Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr technical spec_xcg part2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRTechnicalSpec_XCGPart2PersistenceImpl
 * @see VRTechnicalSpec_XCGPart2Util
 * @generated
 */
@ProviderType
public interface VRTechnicalSpec_XCGPart2Persistence extends BasePersistence<VRTechnicalSpec_XCGPart2> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRTechnicalSpec_XCGPart2Util} to access the vr technical spec_xcg part2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierNo(
		java.lang.String dossierNo, long mtCore);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByDossierNo_PrevAndNext(long id,
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	*/
	public void removeByDossierNo(java.lang.String dossierNo, long mtCore);

	/**
	* Returns the number of vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByDossierNo(java.lang.String dossierNo, long mtCore);

	/**
	* Returns all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		java.lang.String dossierIdCTN);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByDossierIdCTN_PrevAndNext(long id,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	*/
	public void removeByDossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns the number of vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByDossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		java.lang.String deliverableCode);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByDeliverableCode_PrevAndNext(
		long id, java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public void removeByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns the number of vr technical spec_xcg part2s where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierId(
		long dossierId, long mtCore);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierId(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierId(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByDossierId(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierId_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierId_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByDossierId_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByDossierId_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public void removeByDossierId(long dossierId, long mtCore);

	/**
	* Returns the number of vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByDossierId(long dossierId, long mtCore);

	/**
	* Returns all the vr technical spec_xcg part2s where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findBy_DossierId(
		long dossierId);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findBy_DossierId(
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findBy_DossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findBy_DossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findBy_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchBy_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findBy_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchBy_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBy_DossierId(long dossierId);

	/**
	* Returns the number of vr technical spec_xcg part2s where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countBy_DossierId(long dossierId);

	/**
	* Returns all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByConvertAssembleId_First(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByConvertAssembleId_First(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByConvertAssembleId_Last(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where convertAssembleId = &#63; from the database.
	*
	* @param convertAssembleId the convert assemble ID
	*/
	public void removeByConvertAssembleId(long convertAssembleId);

	/**
	* Returns the number of vr technical spec_xcg part2s where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByConvertAssembleId(long convertAssembleId);

	/**
	* Returns all the vr technical spec_xcg part2s where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		java.lang.String referenceUid);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		java.lang.String referenceUid, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByReferenceUid_First(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByReferenceUid_First(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByReferenceUid_Last(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByReferenceUid_Last(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByReferenceUid_PrevAndNext(long id,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where referenceUid = &#63; from the database.
	*
	* @param referenceUid the reference uid
	*/
	public void removeByReferenceUid(java.lang.String referenceUid);

	/**
	* Returns the number of vr technical spec_xcg part2s where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByReferenceUid(java.lang.String referenceUid);

	/**
	* Returns all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId);

	/**
	* Returns a range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the first vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the last vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_xcg part2
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Removes all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	*/
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Returns the number of vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr technical spec_xcg part2s
	*/
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Caches the vr technical spec_xcg part2 in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_XCGPart2 the vr technical spec_xcg part2
	*/
	public void cacheResult(VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2);

	/**
	* Caches the vr technical spec_xcg part2s in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_XCGPart2s the vr technical spec_xcg part2s
	*/
	public void cacheResult(
		java.util.List<VRTechnicalSpec_XCGPart2> vrTechnicalSpec_XCGPart2s);

	/**
	* Creates a new vr technical spec_xcg part2 with the primary key. Does not add the vr technical spec_xcg part2 to the database.
	*
	* @param id the primary key for the new vr technical spec_xcg part2
	* @return the new vr technical spec_xcg part2
	*/
	public VRTechnicalSpec_XCGPart2 create(long id);

	/**
	* Removes the vr technical spec_xcg part2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcg part2
	* @return the vr technical spec_xcg part2 that was removed
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2 remove(long id)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	public VRTechnicalSpec_XCGPart2 updateImpl(
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2);

	/**
	* Returns the vr technical spec_xcg part2 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGPart2Exception} if it could not be found.
	*
	* @param id the primary key of the vr technical spec_xcg part2
	* @return the vr technical spec_xcg part2
	* @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception;

	/**
	* Returns the vr technical spec_xcg part2 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr technical spec_xcg part2
	* @return the vr technical spec_xcg part2, or <code>null</code> if a vr technical spec_xcg part2 with the primary key could not be found
	*/
	public VRTechnicalSpec_XCGPart2 fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRTechnicalSpec_XCGPart2> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr technical spec_xcg part2s.
	*
	* @return the vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findAll();

	/**
	* Returns a range of all the vr technical spec_xcg part2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @return the range of vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_xcg part2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcg part2s
	* @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr technical spec_xcg part2s
	*/
	public java.util.List<VRTechnicalSpec_XCGPart2> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr technical spec_xcg part2s from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr technical spec_xcg part2s.
	*
	* @return the number of vr technical spec_xcg part2s
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}