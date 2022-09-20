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

import com.fds.vr.business.exception.NoSuchVRLimitConfigTechSpecException;
import com.fds.vr.business.model.VRLimitConfigTechSpec;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr limit config tech spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRLimitConfigTechSpecPersistenceImpl
 * @see VRLimitConfigTechSpecUtil
 * @generated
 */
@ProviderType
public interface VRLimitConfigTechSpecPersistence extends BasePersistence<VRLimitConfigTechSpec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRLimitConfigTechSpecUtil} to access the vr limit config tech spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @return the matching vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig);

	/**
	* Returns a range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @return the range of matching vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end);

	/**
	* Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findByVT_MU_DC(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	*/
	public VRLimitConfigTechSpec findByVT_MU_DC_First(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException;

	/**
	* Returns the first vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	*/
	public VRLimitConfigTechSpec fetchByVT_MU_DC_First(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator);

	/**
	* Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a matching vr limit config tech spec could not be found
	*/
	public VRLimitConfigTechSpec findByVT_MU_DC_Last(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException;

	/**
	* Returns the last vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr limit config tech spec, or <code>null</code> if a matching vr limit config tech spec could not be found
	*/
	public VRLimitConfigTechSpec fetchByVT_MU_DC_Last(
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator);

	/**
	* Returns the vr limit config tech specs before and after the current vr limit config tech spec in the ordered set where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param id the primary key of the current vr limit config tech spec
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public VRLimitConfigTechSpec[] findByVT_MU_DC_PrevAndNext(long id,
		java.lang.String vehicleType, java.lang.String markupSMRM,
		long searchingDriveConfig,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator)
		throws NoSuchVRLimitConfigTechSpecException;

	/**
	* Removes all the vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63; from the database.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	*/
	public void removeByVT_MU_DC(java.lang.String vehicleType,
		java.lang.String markupSMRM, long searchingDriveConfig);

	/**
	* Returns the number of vr limit config tech specs where vehicleType = &#63; and markupSMRM = &#63; and searchingDriveConfig = &#63;.
	*
	* @param vehicleType the vehicle type
	* @param markupSMRM the markup smrm
	* @param searchingDriveConfig the searching drive config
	* @return the number of matching vr limit config tech specs
	*/
	public int countByVT_MU_DC(java.lang.String vehicleType,
		java.lang.String markupSMRM, long searchingDriveConfig);

	/**
	* Caches the vr limit config tech spec in the entity cache if it is enabled.
	*
	* @param vrLimitConfigTechSpec the vr limit config tech spec
	*/
	public void cacheResult(VRLimitConfigTechSpec vrLimitConfigTechSpec);

	/**
	* Caches the vr limit config tech specs in the entity cache if it is enabled.
	*
	* @param vrLimitConfigTechSpecs the vr limit config tech specs
	*/
	public void cacheResult(
		java.util.List<VRLimitConfigTechSpec> vrLimitConfigTechSpecs);

	/**
	* Creates a new vr limit config tech spec with the primary key. Does not add the vr limit config tech spec to the database.
	*
	* @param id the primary key for the new vr limit config tech spec
	* @return the new vr limit config tech spec
	*/
	public VRLimitConfigTechSpec create(long id);

	/**
	* Removes the vr limit config tech spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec that was removed
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public VRLimitConfigTechSpec remove(long id)
		throws NoSuchVRLimitConfigTechSpecException;

	public VRLimitConfigTechSpec updateImpl(
		VRLimitConfigTechSpec vrLimitConfigTechSpec);

	/**
	* Returns the vr limit config tech spec with the primary key or throws a {@link NoSuchVRLimitConfigTechSpecException} if it could not be found.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec
	* @throws NoSuchVRLimitConfigTechSpecException if a vr limit config tech spec with the primary key could not be found
	*/
	public VRLimitConfigTechSpec findByPrimaryKey(long id)
		throws NoSuchVRLimitConfigTechSpecException;

	/**
	* Returns the vr limit config tech spec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr limit config tech spec
	* @return the vr limit config tech spec, or <code>null</code> if a vr limit config tech spec with the primary key could not be found
	*/
	public VRLimitConfigTechSpec fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRLimitConfigTechSpec> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr limit config tech specs.
	*
	* @return the vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findAll();

	/**
	* Returns a range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @return the range of vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator);

	/**
	* Returns an ordered range of all the vr limit config tech specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRLimitConfigTechSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr limit config tech specs
	* @param end the upper bound of the range of vr limit config tech specs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr limit config tech specs
	*/
	public java.util.List<VRLimitConfigTechSpec> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRLimitConfigTechSpec> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr limit config tech specs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr limit config tech specs.
	*
	* @return the number of vr limit config tech specs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}