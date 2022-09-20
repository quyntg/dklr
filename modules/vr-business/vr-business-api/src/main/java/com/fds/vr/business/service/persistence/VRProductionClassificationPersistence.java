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

import com.fds.vr.business.exception.NoSuchVRProductionClassificationException;
import com.fds.vr.business.model.VRProductionClassification;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr production classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRProductionClassificationPersistenceImpl
 * @see VRProductionClassificationUtil
 * @generated
 */
@ProviderType
public interface VRProductionClassificationPersistence extends BasePersistence<VRProductionClassification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRProductionClassificationUtil} to access the vr production classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr production classifications where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the matching vr production classifications
	*/
	public java.util.List<VRProductionClassification> findByPPC(
		java.lang.String productionPlantCode);

	/**
	* Returns a range of all the vr production classifications where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @return the range of matching vr production classifications
	*/
	public java.util.List<VRProductionClassification> findByPPC(
		java.lang.String productionPlantCode, int start, int end);

	/**
	* Returns an ordered range of all the vr production classifications where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr production classifications
	*/
	public java.util.List<VRProductionClassification> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator);

	/**
	* Returns an ordered range of all the vr production classifications where productionPlantCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productionPlantCode the production plant code
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr production classifications
	*/
	public java.util.List<VRProductionClassification> findByPPC(
		java.lang.String productionPlantCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr production classification in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production classification
	* @throws NoSuchVRProductionClassificationException if a matching vr production classification could not be found
	*/
	public VRProductionClassification findByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException;

	/**
	* Returns the first vr production classification in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr production classification, or <code>null</code> if a matching vr production classification could not be found
	*/
	public VRProductionClassification fetchByPPC_First(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator);

	/**
	* Returns the last vr production classification in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production classification
	* @throws NoSuchVRProductionClassificationException if a matching vr production classification could not be found
	*/
	public VRProductionClassification findByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException;

	/**
	* Returns the last vr production classification in the ordered set where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr production classification, or <code>null</code> if a matching vr production classification could not be found
	*/
	public VRProductionClassification fetchByPPC_Last(
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator);

	/**
	* Returns the vr production classifications before and after the current vr production classification in the ordered set where productionPlantCode = &#63;.
	*
	* @param id the primary key of the current vr production classification
	* @param productionPlantCode the production plant code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr production classification
	* @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	*/
	public VRProductionClassification[] findByPPC_PrevAndNext(long id,
		java.lang.String productionPlantCode,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator)
		throws NoSuchVRProductionClassificationException;

	/**
	* Removes all the vr production classifications where productionPlantCode = &#63; from the database.
	*
	* @param productionPlantCode the production plant code
	*/
	public void removeByPPC(java.lang.String productionPlantCode);

	/**
	* Returns the number of vr production classifications where productionPlantCode = &#63;.
	*
	* @param productionPlantCode the production plant code
	* @return the number of matching vr production classifications
	*/
	public int countByPPC(java.lang.String productionPlantCode);

	/**
	* Caches the vr production classification in the entity cache if it is enabled.
	*
	* @param vrProductionClassification the vr production classification
	*/
	public void cacheResult(
		VRProductionClassification vrProductionClassification);

	/**
	* Caches the vr production classifications in the entity cache if it is enabled.
	*
	* @param vrProductionClassifications the vr production classifications
	*/
	public void cacheResult(
		java.util.List<VRProductionClassification> vrProductionClassifications);

	/**
	* Creates a new vr production classification with the primary key. Does not add the vr production classification to the database.
	*
	* @param id the primary key for the new vr production classification
	* @return the new vr production classification
	*/
	public VRProductionClassification create(long id);

	/**
	* Removes the vr production classification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr production classification
	* @return the vr production classification that was removed
	* @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	*/
	public VRProductionClassification remove(long id)
		throws NoSuchVRProductionClassificationException;

	public VRProductionClassification updateImpl(
		VRProductionClassification vrProductionClassification);

	/**
	* Returns the vr production classification with the primary key or throws a {@link NoSuchVRProductionClassificationException} if it could not be found.
	*
	* @param id the primary key of the vr production classification
	* @return the vr production classification
	* @throws NoSuchVRProductionClassificationException if a vr production classification with the primary key could not be found
	*/
	public VRProductionClassification findByPrimaryKey(long id)
		throws NoSuchVRProductionClassificationException;

	/**
	* Returns the vr production classification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr production classification
	* @return the vr production classification, or <code>null</code> if a vr production classification with the primary key could not be found
	*/
	public VRProductionClassification fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRProductionClassification> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr production classifications.
	*
	* @return the vr production classifications
	*/
	public java.util.List<VRProductionClassification> findAll();

	/**
	* Returns a range of all the vr production classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @return the range of vr production classifications
	*/
	public java.util.List<VRProductionClassification> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr production classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr production classifications
	*/
	public java.util.List<VRProductionClassification> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator);

	/**
	* Returns an ordered range of all the vr production classifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRProductionClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr production classifications
	* @param end the upper bound of the range of vr production classifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr production classifications
	*/
	public java.util.List<VRProductionClassification> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRProductionClassification> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr production classifications from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr production classifications.
	*
	* @return the number of vr production classifications
	*/
	public int countAll();
}