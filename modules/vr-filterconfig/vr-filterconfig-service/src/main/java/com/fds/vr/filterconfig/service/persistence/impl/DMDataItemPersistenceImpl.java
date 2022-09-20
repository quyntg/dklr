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

package com.fds.vr.filterconfig.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.filterconfig.exception.NoSuchDMDataItemException;
import com.fds.vr.filterconfig.model.DMDataItem;
import com.fds.vr.filterconfig.model.impl.DMDataItemImpl;
import com.fds.vr.filterconfig.model.impl.DMDataItemModelImpl;
import com.fds.vr.filterconfig.service.persistence.DMDataItemPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NhanHoang
 * @see DMDataItemPersistence
 * @see com.fds.vr.filterconfig.service.persistence.DMDataItemUtil
 * @generated
 */
@ProviderType
public class DMDataItemPersistenceImpl extends BasePersistenceImpl<DMDataItem>
	implements DMDataItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DMDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DMDataItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, DMDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, DMDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DGID_LVL = new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, DMDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDGID_LVL",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DGID_LVL =
		new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, DMDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDGID_LVL",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DMDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DMDataItemModelImpl.LEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DGID_LVL = new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDGID_LVL",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_DGID_LVL =
		new FinderPath(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByDGID_LVL",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @return the matching dm data items
	 */
	@Override
	public List<DMDataItem> findByDGID_LVL(long dataGroupId, int level) {
		return findByDGID_LVL(dataGroupId, level, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long dataGroupId, int level,
		int start, int end) {
		return findByDGID_LVL(dataGroupId, level, start, end, null);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long dataGroupId, int level,
		int start, int end, OrderByComparator<DMDataItem> orderByComparator) {
		return findByDGID_LVL(dataGroupId, level, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long dataGroupId, int level,
		int start, int end, OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DGID_LVL;
			finderArgs = new Object[] { dataGroupId, level };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DGID_LVL;
			finderArgs = new Object[] {
					dataGroupId, level,
					
					start, end, orderByComparator
				};
		}

		List<DMDataItem> list = null;

		if (retrieveFromCache) {
			list = (List<DMDataItem>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DMDataItem dmDataItem : list) {
					if ((dataGroupId != dmDataItem.getDataGroupId()) ||
							(level != dmDataItem.getLevel())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DGID_LVL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DGID_LVL_LEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DMDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(level);

				if (!pagination) {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws NoSuchDMDataItemException if a matching dm data item could not be found
	 */
	@Override
	public DMDataItem findByDGID_LVL_First(long dataGroupId, int level,
		OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException {
		DMDataItem dmDataItem = fetchByDGID_LVL_First(dataGroupId, level,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", level=");
		msg.append(level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDMDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 */
	@Override
	public DMDataItem fetchByDGID_LVL_First(long dataGroupId, int level,
		OrderByComparator<DMDataItem> orderByComparator) {
		List<DMDataItem> list = findByDGID_LVL(dataGroupId, level, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws NoSuchDMDataItemException if a matching dm data item could not be found
	 */
	@Override
	public DMDataItem findByDGID_LVL_Last(long dataGroupId, int level,
		OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException {
		DMDataItem dmDataItem = fetchByDGID_LVL_Last(dataGroupId, level,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dataGroupId=");
		msg.append(dataGroupId);

		msg.append(", level=");
		msg.append(level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDMDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 */
	@Override
	public DMDataItem fetchByDGID_LVL_Last(long dataGroupId, int level,
		OrderByComparator<DMDataItem> orderByComparator) {
		int count = countByDGID_LVL(dataGroupId, level);

		if (count == 0) {
			return null;
		}

		List<DMDataItem> list = findByDGID_LVL(dataGroupId, level, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public DMDataItem[] findByDGID_LVL_PrevAndNext(long id, long dataGroupId,
		int level, OrderByComparator<DMDataItem> orderByComparator)
		throws NoSuchDMDataItemException {
		DMDataItem dmDataItem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DMDataItem[] array = new DMDataItemImpl[3];

			array[0] = getByDGID_LVL_PrevAndNext(session, dmDataItem,
					dataGroupId, level, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDGID_LVL_PrevAndNext(session, dmDataItem,
					dataGroupId, level, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DMDataItem getByDGID_LVL_PrevAndNext(Session session,
		DMDataItem dmDataItem, long dataGroupId, int level,
		OrderByComparator<DMDataItem> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DGID_LVL_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DGID_LVL_LEVEL_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DMDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dataGroupId);

		qPos.add(level);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DMDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long[] dataGroupIds, int[] levels) {
		return findByDGID_LVL(dataGroupIds, levels, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long[] dataGroupIds, int[] levels,
		int start, int end) {
		return findByDGID_LVL(dataGroupIds, levels, start, end, null);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long[] dataGroupIds, int[] levels,
		int start, int end, OrderByComparator<DMDataItem> orderByComparator) {
		return findByDGID_LVL(dataGroupIds, levels, start, end,
			orderByComparator, true);
	}

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
	@Override
	public List<DMDataItem> findByDGID_LVL(long[] dataGroupIds, int[] levels,
		int start, int end, OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache) {
		if (dataGroupIds == null) {
			dataGroupIds = new long[0];
		}
		else if (dataGroupIds.length > 1) {
			dataGroupIds = ArrayUtil.unique(dataGroupIds);

			Arrays.sort(dataGroupIds);
		}

		if (levels == null) {
			levels = new int[0];
		}
		else if (levels.length > 1) {
			levels = ArrayUtil.unique(levels);

			Arrays.sort(levels);
		}

		if ((dataGroupIds.length == 1) && (levels.length == 1)) {
			return findByDGID_LVL(dataGroupIds[0], levels[0], start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] {
					StringUtil.merge(dataGroupIds), StringUtil.merge(levels)
				};
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(dataGroupIds), StringUtil.merge(levels),
					
					start, end, orderByComparator
				};
		}

		List<DMDataItem> list = null;

		if (retrieveFromCache) {
			list = (List<DMDataItem>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DGID_LVL,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (DMDataItem dmDataItem : list) {
					if (!ArrayUtil.contains(dataGroupIds,
								dmDataItem.getDataGroupId()) ||
							!ArrayUtil.contains(levels, dmDataItem.getLevel())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			if (dataGroupIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DGID_LVL_DATAGROUPID_7);

				query.append(StringUtil.merge(dataGroupIds));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			if (levels.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DGID_LVL_LEVEL_7);

				query.append(StringUtil.merge(levels));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DMDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DGID_LVL,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_DGID_LVL,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dm data items where dataGroupId = &#63; and level = &#63; from the database.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 */
	@Override
	public void removeByDGID_LVL(long dataGroupId, int level) {
		for (DMDataItem dmDataItem : findByDGID_LVL(dataGroupId, level,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where dataGroupId = &#63; and level = &#63;.
	 *
	 * @param dataGroupId the data group ID
	 * @param level the level
	 * @return the number of matching dm data items
	 */
	@Override
	public int countByDGID_LVL(long dataGroupId, int level) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DGID_LVL;

		Object[] finderArgs = new Object[] { dataGroupId, level };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DGID_LVL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DGID_LVL_LEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dataGroupId);

				qPos.add(level);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of dm data items where dataGroupId = any &#63; and level = any &#63;.
	 *
	 * @param dataGroupIds the data group IDs
	 * @param levels the levels
	 * @return the number of matching dm data items
	 */
	@Override
	public int countByDGID_LVL(long[] dataGroupIds, int[] levels) {
		if (dataGroupIds == null) {
			dataGroupIds = new long[0];
		}
		else if (dataGroupIds.length > 1) {
			dataGroupIds = ArrayUtil.unique(dataGroupIds);

			Arrays.sort(dataGroupIds);
		}

		if (levels == null) {
			levels = new int[0];
		}
		else if (levels.length > 1) {
			levels = ArrayUtil.unique(levels);

			Arrays.sort(levels);
		}

		Object[] finderArgs = new Object[] {
				StringUtil.merge(dataGroupIds), StringUtil.merge(levels)
			};

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DGID_LVL,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			if (dataGroupIds.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DGID_LVL_DATAGROUPID_7);

				query.append(StringUtil.merge(dataGroupIds));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			if (levels.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				query.append(_FINDER_COLUMN_DGID_LVL_LEVEL_7);

				query.append(StringUtil.merge(levels));

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DGID_LVL,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_DGID_LVL,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DGID_LVL_DATAGROUPID_2 = "dmDataItem.dataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DGID_LVL_DATAGROUPID_7 = "dmDataItem.dataGroupId IN (";
	private static final String _FINDER_COLUMN_DGID_LVL_LEVEL_2 = "dmDataItem.level = ?";
	private static final String _FINDER_COLUMN_DGID_LVL_LEVEL_7 = "dmDataItem.level IN (";

	public DMDataItemPersistenceImpl() {
		setModelClass(DMDataItem.class);
	}

	/**
	 * Caches the dm data item in the entity cache if it is enabled.
	 *
	 * @param dmDataItem the dm data item
	 */
	@Override
	public void cacheResult(DMDataItem dmDataItem) {
		entityCache.putResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		dmDataItem.resetOriginalValues();
	}

	/**
	 * Caches the dm data items in the entity cache if it is enabled.
	 *
	 * @param dmDataItems the dm data items
	 */
	@Override
	public void cacheResult(List<DMDataItem> dmDataItems) {
		for (DMDataItem dmDataItem : dmDataItems) {
			if (entityCache.getResult(
						DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DMDataItemImpl.class, dmDataItem.getPrimaryKey()) == null) {
				cacheResult(dmDataItem);
			}
			else {
				dmDataItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data items.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DMDataItemImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data item.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DMDataItem dmDataItem) {
		entityCache.removeResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemImpl.class, dmDataItem.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DMDataItem> dmDataItems) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DMDataItem dmDataItem : dmDataItems) {
			entityCache.removeResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DMDataItemImpl.class, dmDataItem.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	 *
	 * @param id the primary key for the new dm data item
	 * @return the new dm data item
	 */
	@Override
	public DMDataItem create(long id) {
		DMDataItem dmDataItem = new DMDataItemImpl();

		dmDataItem.setNew(true);
		dmDataItem.setPrimaryKey(id);

		return dmDataItem;
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem remove(long id) throws NoSuchDMDataItemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem remove(Serializable primaryKey)
		throws NoSuchDMDataItemException {
		Session session = null;

		try {
			session = openSession();

			DMDataItem dmDataItem = (DMDataItem)session.get(DMDataItemImpl.class,
					primaryKey);

			if (dmDataItem == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDMDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataItem);
		}
		catch (NoSuchDMDataItemException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DMDataItem removeImpl(DMDataItem dmDataItem) {
		dmDataItem = toUnwrappedModel(dmDataItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmDataItem)) {
				dmDataItem = (DMDataItem)session.get(DMDataItemImpl.class,
						dmDataItem.getPrimaryKeyObj());
			}

			if (dmDataItem != null) {
				session.delete(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmDataItem != null) {
			clearCache(dmDataItem);
		}

		return dmDataItem;
	}

	@Override
	public DMDataItem updateImpl(DMDataItem dmDataItem) {
		dmDataItem = toUnwrappedModel(dmDataItem);

		boolean isNew = dmDataItem.isNew();

		DMDataItemModelImpl dmDataItemModelImpl = (DMDataItemModelImpl)dmDataItem;

		Session session = null;

		try {
			session = openSession();

			if (dmDataItem.isNew()) {
				session.save(dmDataItem);

				dmDataItem.setNew(false);
			}
			else {
				dmDataItem = (DMDataItem)session.merge(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DMDataItemModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DGID_LVL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalLevel()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DGID_LVL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DGID_LVL,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getLevel()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DGID_LVL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DGID_LVL,
					args);
			}
		}

		entityCache.putResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DMDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem, false);

		dmDataItem.resetOriginalValues();

		return dmDataItem;
	}

	protected DMDataItem toUnwrappedModel(DMDataItem dmDataItem) {
		if (dmDataItem instanceof DMDataItemImpl) {
			return dmDataItem;
		}

		DMDataItemImpl dmDataItemImpl = new DMDataItemImpl();

		dmDataItemImpl.setNew(dmDataItem.isNew());
		dmDataItemImpl.setPrimaryKey(dmDataItem.getPrimaryKey());

		dmDataItemImpl.setId(dmDataItem.getId());
		dmDataItemImpl.setDataGroupId(dmDataItem.getDataGroupId());
		dmDataItemImpl.setCode_0(dmDataItem.getCode_0());
		dmDataItemImpl.setCode_1(dmDataItem.getCode_1());
		dmDataItemImpl.setCode_2(dmDataItem.getCode_2());
		dmDataItemImpl.setCode_3(dmDataItem.getCode_3());
		dmDataItemImpl.setLevel(dmDataItem.getLevel());
		dmDataItemImpl.setName(dmDataItem.getName());
		dmDataItemImpl.setAltername(dmDataItem.getAltername());
		dmDataItemImpl.setDescription(dmDataItem.getDescription());
		dmDataItemImpl.setValidatedFrom(dmDataItem.getValidatedFrom());
		dmDataItemImpl.setValidatedTo(dmDataItem.getValidatedTo());
		dmDataItemImpl.setStatus(dmDataItem.getStatus());
		dmDataItemImpl.setSyncDate(dmDataItem.getSyncDate());

		return dmDataItemImpl;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item
	 * @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDMDataItemException {
		DMDataItem dmDataItem = fetchByPrimaryKey(primaryKey);

		if (dmDataItem == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDMDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link NoSuchDMDataItemException} if it could not be found.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item
	 * @throws NoSuchDMDataItemException if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem findByPrimaryKey(long id)
		throws NoSuchDMDataItemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DMDataItemImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DMDataItem dmDataItem = (DMDataItem)serializable;

		if (dmDataItem == null) {
			Session session = null;

			try {
				session = openSession();

				dmDataItem = (DMDataItem)session.get(DMDataItemImpl.class,
						primaryKey);

				if (dmDataItem != null) {
					cacheResult(dmDataItem);
				}
				else {
					entityCache.putResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DMDataItemImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
					DMDataItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 */
	@Override
	public DMDataItem fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, DMDataItem> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DMDataItem> map = new HashMap<Serializable, DMDataItem>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DMDataItem dmDataItem = fetchByPrimaryKey(primaryKey);

			if (dmDataItem != null) {
				map.put(primaryKey, dmDataItem);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
					DMDataItemImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DMDataItem)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DMDATAITEM_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (DMDataItem dmDataItem : (List<DMDataItem>)q.list()) {
				map.put(dmDataItem.getPrimaryKeyObj(), dmDataItem);

				cacheResult(dmDataItem);

				uncachedPrimaryKeys.remove(dmDataItem.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DMDataItemModelImpl.ENTITY_CACHE_ENABLED,
					DMDataItemImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the dm data items.
	 *
	 * @return the dm data items
	 */
	@Override
	public List<DMDataItem> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<DMDataItem> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<DMDataItem> findAll(int start, int end,
		OrderByComparator<DMDataItem> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<DMDataItem> findAll(int start, int end,
		OrderByComparator<DMDataItem> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DMDataItem> list = null;

		if (retrieveFromCache) {
			list = (List<DMDataItem>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DMDATAITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAITEM;

				if (pagination) {
					sql = sql.concat(DMDataItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DMDataItem>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dm data items from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DMDataItem dmDataItem : findAll()) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items.
	 *
	 * @return the number of dm data items
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMDATAITEM);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DMDataItemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dm data item persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DMDataItemImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DMDATAITEM = "SELECT dmDataItem FROM DMDataItem dmDataItem";
	private static final String _SQL_SELECT_DMDATAITEM_WHERE_PKS_IN = "SELECT dmDataItem FROM DMDataItem dmDataItem WHERE id IN (";
	private static final String _SQL_SELECT_DMDATAITEM_WHERE = "SELECT dmDataItem FROM DMDataItem dmDataItem WHERE ";
	private static final String _SQL_COUNT_DMDATAITEM = "SELECT COUNT(dmDataItem) FROM DMDataItem dmDataItem";
	private static final String _SQL_COUNT_DMDATAITEM_WHERE = "SELECT COUNT(dmDataItem) FROM DMDataItem dmDataItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DMDataItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DMDataItem exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DMDataItemPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"syncDate"
			});
}