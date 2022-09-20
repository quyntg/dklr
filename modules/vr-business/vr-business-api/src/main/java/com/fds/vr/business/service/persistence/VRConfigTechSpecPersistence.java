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

import com.fds.vr.business.exception.NoSuchVRConfigTechSpecException;
import com.fds.vr.business.model.VRConfigTechSpec;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr config tech spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRConfigTechSpecPersistenceImpl
 * @see VRConfigTechSpecUtil
 * @generated
 */
@ProviderType
public interface VRConfigTechSpecPersistence extends BasePersistence<VRConfigTechSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRConfigTechSpecUtil} to access the vr config tech spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_VT_SC_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_VT_SC_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_VT_SC_Last(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_VT_SC_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_VT_SC_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	*/
	public void removeByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory);

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory);

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_VT_SC(java.lang.String vehicleClass,
		java.lang.String[] vehicleTypes, java.lang.String specCategory);

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_VT_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_VT_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_VT_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_VT_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_VT_SC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String vehicleType,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_VT_SC_MD(
		java.lang.String vehicleClass, java.lang.String[] vehicleTypes,
		java.lang.String specCategory, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	*/
	public void removeByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory,
		java.lang.String module);

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleType the vehicle type
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String vehicleType, java.lang.String specCategory,
		java.lang.String module);

	/**
	* Returns the number of vr config tech specs where vehicleClass LIKE &#63; and vehicleType = any &#63; and specCategory LIKE &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param vehicleTypes the vehicle types
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_VT_SC_MD(java.lang.String vehicleClass,
		java.lang.String[] vehicleTypes, java.lang.String specCategory,
		java.lang.String module);

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC(
		java.lang.String vehicleClass, java.lang.String specCategory,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_First(java.lang.String vehicleClass,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_First(java.lang.String vehicleClass,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_Last(java.lang.String vehicleClass,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_Last(java.lang.String vehicleClass,
		java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_SC_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	*/
	public void removeByVC_SC(java.lang.String vehicleClass,
		java.lang.String specCategory);

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_SC(java.lang.String vehicleClass,
		java.lang.String specCategory);

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_MD_First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_MD_Last(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_MD_Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_SC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	*/
	public void removeByVC_SC_MD(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_SC_MD(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_SC_MD_(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_MD__First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_MD__First(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_SC_MD__Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_SC_MD__Last(
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_SC_MD__PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String specCategory,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	*/
	public void removeByVC_SC_MD_(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and specCategory = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param specCategory the spec category
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_SC_MD_(java.lang.String vehicleClass,
		java.lang.String specCategory, java.lang.String module);

	/**
	* Returns all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @return the matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module);

	/**
	* Returns a range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findByVC_MD(
		java.lang.String vehicleClass, java.lang.String module, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_MD_First(java.lang.String vehicleClass,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the first vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_MD_First(java.lang.String vehicleClass,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec findByVC_MD_Last(java.lang.String vehicleClass,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the last vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr config tech spec, or <code>null</code> if a matching vr config tech spec could not be found
	*/
	public VRConfigTechSpec fetchByVC_MD_Last(java.lang.String vehicleClass,
		java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns the vr config tech specs before and after the current vr config tech spec in the ordered set where vehicleClass = &#63; and module = &#63;.
	*
	* @param id the primary key of the current vr config tech spec
	* @param vehicleClass the vehicle class
	* @param module the module
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec[] findByVC_MD_PrevAndNext(long id,
		java.lang.String vehicleClass, java.lang.String module,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Removes all the vr config tech specs where vehicleClass = &#63; and module = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	*/
	public void removeByVC_MD(java.lang.String vehicleClass,
		java.lang.String module);

	/**
	* Returns the number of vr config tech specs where vehicleClass = &#63; and module = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param module the module
	* @return the number of matching vr config tech specs
	*/
	public int countByVC_MD(java.lang.String vehicleClass,
		java.lang.String module);

	/**
	* Caches the vr config tech spec in the entity cache if it is enabled.
	*
	* @param vrConfigTechSpec the vr config tech spec
	*/
	public void cacheResult(VRConfigTechSpec vrConfigTechSpec);

	/**
	* Caches the vr config tech specs in the entity cache if it is enabled.
	*
	* @param vrConfigTechSpecs the vr config tech specs
	*/
	public void cacheResult(java.util.List<VRConfigTechSpec> vrConfigTechSpecs);

	/**
	* Creates a new vr config tech spec with the primary key. Does not add the vr config tech spec to the database.
	*
	* @param id the primary key for the new vr config tech spec
	* @return the new vr config tech spec
	*/
	public VRConfigTechSpec create(long id);

	/**
	* Removes the vr config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec that was removed
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec remove(long id)
		throws NoSuchVRConfigTechSpecException;

	public VRConfigTechSpec updateImpl(VRConfigTechSpec vrConfigTechSpec);

	/**
	* Returns the vr config tech spec with the primary key or throws a {@link NoSuchVRConfigTechSpecException} if it could not be found.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec
	* @throws NoSuchVRConfigTechSpecException if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec findByPrimaryKey(long id)
		throws NoSuchVRConfigTechSpecException;

	/**
	* Returns the vr config tech spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr config tech spec
	* @return the vr config tech spec, or <code>null</code> if a vr config tech spec with the primary key could not be found
	*/
	public VRConfigTechSpec fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRConfigTechSpec> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr config tech specs.
	*
	* @return the vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findAll();

	/**
	* Returns a range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @return the range of vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr config tech specs
	* @param end the upper bound of the range of vr config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr config tech specs
	*/
	public java.util.List<VRConfigTechSpec> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr config tech specs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr config tech specs.
	*
	* @return the number of vr config tech specs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}