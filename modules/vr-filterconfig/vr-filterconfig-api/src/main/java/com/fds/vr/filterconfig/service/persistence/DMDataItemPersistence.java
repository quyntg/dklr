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

package com.fds.vr.filterconfig.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.exception.NoSuchDMDataItemException;
import com.fds.vr.filterconfig.model.DMDataItem;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanHoang
 * @see com.fds.vr.filterconfig.service.persistence.impl.DMDataItemPersistenceImpl
 * @see DMDataItemUtil
 * @generated
 */
@ProviderType
public interface DMDataItemPersistence extends BasePersistence<DMDataItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DMDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long dataGroupId, int level);

	/**
	* Returns a range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long dataGroupId,
		int level, int start, int end);

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long dataGroupId,
		int level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator);

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long dataGroupId,
		int level, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item
	* @throws NoSuchDMDataItemException if a matching dm data item could not be found
	*/
	public DMDataItem findByDGID_LVL_First(long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException;

	/**
	* Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	*/
	public DMDataItem fetchByDGID_LVL_First(long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator);

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item
	* @throws NoSuchDMDataItemException if a matching dm data item could not be found
	*/
	public DMDataItem findByDGID_LVL_Last(long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException;

	/**
	* Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	*/
	public DMDataItem fetchByDGID_LVL_Last(long dataGroupId, int level,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator);

	/**
	* Returns the dm data items before and after the current dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	*
	* @param id the primary key of the current dm data item
	* @param dataGroupId the data group ID
	* @param level the level
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dm data item
	* @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	*/
	public DMDataItem[] findByDGID_LVL_PrevAndNext(long id, long dataGroupId,
		int level,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException;

	/**
	* Returns all the dm data items where dataGroupId = any &#63; and level = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupIds the data group IDs
	* @param levels the levels
	* @return the matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long[] dataGroupIds,
		int[] levels);

	/**
	* Returns a range of all the dm data items where dataGroupId = any &#63; and level = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupIds the data group IDs
	* @param levels the levels
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long[] dataGroupIds,
		int[] levels, int start, int end);

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = any &#63; and level = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupIds the data group IDs
	* @param levels the levels
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long[] dataGroupIds,
		int[] levels, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator);

	/**
	* Returns an ordered range of all the dm data items where dataGroupId = &#63; and level = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dm data items
	*/
	public java.util.List<DMDataItem> findByDGID_LVL(long[] dataGroupIds,
		int[] levels, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dm data items where dataGroupId = &#63; and level = &#63; from the database.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	*/
	public void removeByDGID_LVL(long dataGroupId, int level);

	/**
	* Returns the number of dm data items where dataGroupId = &#63; and level = &#63;.
	*
	* @param dataGroupId the data group ID
	* @param level the level
	* @return the number of matching dm data items
	*/
	public int countByDGID_LVL(long dataGroupId, int level);

	/**
	* Returns the number of dm data items where dataGroupId = any &#63; and level = any &#63;.
	*
	* @param dataGroupIds the data group IDs
	* @param levels the levels
	* @return the number of matching dm data items
	*/
	public int countByDGID_LVL(long[] dataGroupIds, int[] levels);

	/**
	* Caches the dm data item in the entity cache if it is enabled.
	*
	* @param dmDataItem the dm data item
	*/
	public void cacheResult(DMDataItem dmDataItem);

	/**
	* Caches the dm data items in the entity cache if it is enabled.
	*
	* @param dmDataItems the dm data items
	*/
	public void cacheResult(java.util.List<DMDataItem> dmDataItems);

	/**
	* Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	*
	* @param id the primary key for the new dm data item
	* @return the new dm data item
	*/
	public DMDataItem create(long id);

	/**
	* Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item that was removed
	* @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	*/
	public DMDataItem remove(long id) throws NoSuchDMDataItemException;

	public DMDataItem updateImpl(DMDataItem dmDataItem);

	/**
	* Returns the dm data item with the primary key or throws a {@link NoSuchDMDataItemException} if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item
	* @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	*/
	public DMDataItem findByPrimaryKey(long id)
		throws NoSuchDMDataItemException;

	/**
	* Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dm data item
	* @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	*/
	public DMDataItem fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, DMDataItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dm data items.
	*
	* @return the dm data items
	*/
	public java.util.List<DMDataItem> findAll();

	/**
	* Returns a range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @return the range of dm data items
	*/
	public java.util.List<DMDataItem> findAll(int start, int end);

	/**
	* Returns an ordered range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dm data items
	*/
	public java.util.List<DMDataItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator);

	/**
	* Returns an ordered range of all the dm data items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DMDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dm data items
	* @param end the upper bound of the range of dm data items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dm data items
	*/
	public java.util.List<DMDataItem> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dm data items from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dm data items.
	*
	* @return the number of dm data items
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}