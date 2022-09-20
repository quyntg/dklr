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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_LKXCGException;
import com.fds.vr.business.model.VRTechnicalSpec_LKXCG;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr technical spec_lkxcg service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRTechnicalSpec_LKXCGPersistenceImpl
 * @see VRTechnicalSpec_LKXCGUtil
 * @generated
 */
@ProviderType
public interface VRTechnicalSpec_LKXCGPersistence extends BasePersistence<VRTechnicalSpec_LKXCG> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRTechnicalSpec_LKXCGUtil} to access the vr technical spec_lkxcg persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierNo_First(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierNo_Last(
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByDossierNo_PrevAndNext(long id,
		java.lang.String dossierNo, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	*/
	public void removeByDossierNo(java.lang.String dossierNo, long mtCore);

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierNo = &#63; and mtCore = &#63;.
	*
	* @param dossierNo the dossier no
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByDossierNo(java.lang.String dossierNo, long mtCore);

	/**
	* Returns all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierIdCTN_First(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierIdCTN_Last(
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierIdCTN = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierIdCTN the dossier ID ctn
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByDossierIdCTN_PrevAndNext(long id,
		java.lang.String dossierIdCTN,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where dossierIdCTN = &#63; from the database.
	*
	* @param dossierIdCTN the dossier ID ctn
	*/
	public void removeByDossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierIdCTN = &#63;.
	*
	* @param dossierIdCTN the dossier ID ctn
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByDossierIdCTN(java.lang.String dossierIdCTN);

	/**
	* Returns all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deliverableCode the deliverable code
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDeliverableCode(
		java.lang.String deliverableCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDeliverableCode_First(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDeliverableCode_Last(
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where deliverableCode = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param deliverableCode the deliverable code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByDeliverableCode_PrevAndNext(long id,
		java.lang.String deliverableCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where deliverableCode = &#63; from the database.
	*
	* @param deliverableCode the deliverable code
	*/
	public void removeByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns the number of vr technical spec_lkxcgs where deliverableCode = &#63;.
	*
	* @param deliverableCode the deliverable code
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByDeliverableCode(java.lang.String deliverableCode);

	/**
	* Returns all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, long mtCore);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByDossierId(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierId_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierId_First(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByDossierId_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByDossierId_Last(long dossierId,
		long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public void removeByDossierId(long dossierId, long mtCore);

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByDossierId(long dossierId, long mtCore);

	/**
	* Returns all the vr technical spec_lkxcgs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findBy_DossierId(
		long dossierId);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findBy_DossierId(
		long dossierId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findBy_DossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findBy_DossierId(
		long dossierId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findBy_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchBy_DossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findBy_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchBy_DossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where dossierId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeBy_DossierId(long dossierId);

	/**
	* Returns the number of vr technical spec_lkxcgs where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countBy_DossierId(long dossierId);

	/**
	* Returns all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param convertAssembleId the convert assemble ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByConvertAssembleId_First(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByConvertAssembleId_First(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByConvertAssembleId_Last(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByConvertAssembleId_Last(
		long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where convertAssembleId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param convertAssembleId the convert assemble ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where convertAssembleId = &#63; from the database.
	*
	* @param convertAssembleId the convert assemble ID
	*/
	public void removeByConvertAssembleId(long convertAssembleId);

	/**
	* Returns the number of vr technical spec_lkxcgs where convertAssembleId = &#63;.
	*
	* @param convertAssembleId the convert assemble ID
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByConvertAssembleId(long convertAssembleId);

	/**
	* Returns all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByReferenceUid(
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByReferenceUid_First(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByReferenceUid_First(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByReferenceUid_Last(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByReferenceUid_Last(
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where referenceUid = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByReferenceUid_PrevAndNext(long id,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where referenceUid = &#63; from the database.
	*
	* @param referenceUid the reference uid
	*/
	public void removeByReferenceUid(java.lang.String referenceUid);

	/**
	* Returns the number of vr technical spec_lkxcgs where referenceUid = &#63;.
	*
	* @param referenceUid the reference uid
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByReferenceUid(java.lang.String referenceUid);

	/**
	* Returns all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId);

	/**
	* Returns a range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the first vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the last vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr technical spec_lkxcg, or <code>null</code> if a matching vr technical spec_lkxcg could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns the vr technical spec_lkxcgs before and after the current vr technical spec_lkxcg in the ordered set where vehicleTypeCertificateId = &#63;.
	*
	* @param id the primary key of the current vr technical spec_lkxcg
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Removes all the vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63; from the database.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	*/
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Returns the number of vr technical spec_lkxcgs where vehicleTypeCertificateId = &#63;.
	*
	* @param vehicleTypeCertificateId the vehicle type certificate ID
	* @return the number of matching vr technical spec_lkxcgs
	*/
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId);

	/**
	* Caches the vr technical spec_lkxcg in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_LKXCG the vr technical spec_lkxcg
	*/
	public void cacheResult(VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG);

	/**
	* Caches the vr technical spec_lkxcgs in the entity cache if it is enabled.
	*
	* @param vrTechnicalSpec_LKXCGs the vr technical spec_lkxcgs
	*/
	public void cacheResult(
		java.util.List<VRTechnicalSpec_LKXCG> vrTechnicalSpec_LKXCGs);

	/**
	* Creates a new vr technical spec_lkxcg with the primary key. Does not add the vr technical spec_lkxcg to the database.
	*
	* @param id the primary key for the new vr technical spec_lkxcg
	* @return the new vr technical spec_lkxcg
	*/
	public VRTechnicalSpec_LKXCG create(long id);

	/**
	* Removes the vr technical spec_lkxcg with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg that was removed
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG remove(long id)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	public VRTechnicalSpec_LKXCG updateImpl(
		VRTechnicalSpec_LKXCG vrTechnicalSpec_LKXCG);

	/**
	* Returns the vr technical spec_lkxcg with the primary key or throws a {@link NoSuchVRTechnicalSpec_LKXCGException} if it could not be found.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg
	* @throws NoSuchVRTechnicalSpec_LKXCGException if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_LKXCGException;

	/**
	* Returns the vr technical spec_lkxcg with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr technical spec_lkxcg
	* @return the vr technical spec_lkxcg, or <code>null</code> if a vr technical spec_lkxcg with the primary key could not be found
	*/
	public VRTechnicalSpec_LKXCG fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRTechnicalSpec_LKXCG> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr technical spec_lkxcgs.
	*
	* @return the vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findAll();

	/**
	* Returns a range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @return the range of vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator);

	/**
	* Returns an ordered range of all the vr technical spec_lkxcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_LKXCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_lkxcgs
	* @param end the upper bound of the range of vr technical spec_lkxcgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr technical spec_lkxcgs
	*/
	public java.util.List<VRTechnicalSpec_LKXCG> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRTechnicalSpec_LKXCG> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr technical spec_lkxcgs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr technical spec_lkxcgs.
	*
	* @return the number of vr technical spec_lkxcgs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}