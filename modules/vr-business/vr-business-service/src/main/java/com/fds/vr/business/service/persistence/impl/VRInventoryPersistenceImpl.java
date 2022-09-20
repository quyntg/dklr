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

package com.fds.vr.business.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchVRInventoryException;
import com.fds.vr.business.model.VRInventory;
import com.fds.vr.business.model.impl.VRInventoryImpl;
import com.fds.vr.business.model.impl.VRInventoryModelImpl;
import com.fds.vr.business.service.persistence.VRInventoryPersistence;

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
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the vr inventory service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInventoryPersistence
 * @see com.fds.vr.business.service.persistence.VRInventoryUtil
 * @generated
 */
@ProviderType
public class VRInventoryPersistenceImpl extends BasePersistenceImpl<VRInventory>
	implements VRInventoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRInventoryUtil} to access the vr inventory persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRInventoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIOD =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByYearofPeriod",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIOD =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByYearofPeriod",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.YEAROFPERIOD_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_YEAROFPERIOD = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByYearofPeriod",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriod(long mtCore, long yearofPeriod) {
		return findByYearofPeriod(mtCore, yearofPeriod, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriod(long mtCore, long yearofPeriod,
		int start, int end) {
		return findByYearofPeriod(mtCore, yearofPeriod, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriod(long mtCore, long yearofPeriod,
		int start, int end, OrderByComparator<VRInventory> orderByComparator) {
		return findByYearofPeriod(mtCore, yearofPeriod, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriod(long mtCore, long yearofPeriod,
		int start, int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIOD;
			finderArgs = new Object[] { mtCore, yearofPeriod };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIOD;
			finderArgs = new Object[] {
					mtCore, yearofPeriod,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(yearofPeriod != vrInventory.getYearofPeriod())) {
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

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIOD_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIOD_YEAROFPERIOD_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriod_First(long mtCore, long yearofPeriod,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriod_First(mtCore,
				yearofPeriod, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriod_First(long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findByYearofPeriod(mtCore, yearofPeriod, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriod_Last(long mtCore, long yearofPeriod,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriod_Last(mtCore,
				yearofPeriod, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriod_Last(long mtCore, long yearofPeriod,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countByYearofPeriod(mtCore, yearofPeriod);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findByYearofPeriod(mtCore, yearofPeriod,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findByYearofPeriod_PrevAndNext(long id, long mtCore,
		long yearofPeriod, OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getByYearofPeriod_PrevAndNext(session, vrInventory,
					mtCore, yearofPeriod, orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getByYearofPeriod_PrevAndNext(session, vrInventory,
					mtCore, yearofPeriod, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getByYearofPeriod_PrevAndNext(Session session,
		VRInventory vrInventory, long mtCore, long yearofPeriod,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_YEAROFPERIOD_MTCORE_2);

		query.append(_FINDER_COLUMN_YEAROFPERIOD_YEAROFPERIOD_2);

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(yearofPeriod);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 */
	@Override
	public void removeByYearofPeriod(long mtCore, long yearofPeriod) {
		for (VRInventory vrInventory : findByYearofPeriod(mtCore, yearofPeriod,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countByYearofPeriod(long mtCore, long yearofPeriod) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_YEAROFPERIOD;

		Object[] finderArgs = new Object[] { mtCore, yearofPeriod };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIOD_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIOD_YEAROFPERIOD_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

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

	private static final String _FINDER_COLUMN_YEAROFPERIOD_MTCORE_2 = "vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_YEAROFPERIOD_YEAROFPERIOD_2 = "vrInventory.yearofPeriod = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByYearofPeriodAndCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByYearofPeriodAndCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.YEAROFPERIOD_COLUMN_BITMASK |
			VRInventoryModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_YEAROFPERIODANDCORPORATIONID =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByYearofPeriodAndCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId) {
		return findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId, int start, int end) {
		return findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return findByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
			corporationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID;
			finderArgs = new Object[] { mtCore, yearofPeriod, corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID;
			finderArgs = new Object[] {
					mtCore, yearofPeriod, corporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(yearofPeriod != vrInventory.getYearofPeriod()) ||
							(corporationId != vrInventory.getCorporationId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_YEAROFPERIOD_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_CORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

				qPos.add(corporationId);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriodAndCorporationId_First(long mtCore,
		long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriodAndCorporationId_First(mtCore,
				yearofPeriod, corporationId, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriodAndCorporationId_First(long mtCore,
		long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findByYearofPeriodAndCorporationId(mtCore,
				yearofPeriod, corporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriodAndCorporationId_Last(long mtCore,
		long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriodAndCorporationId_Last(mtCore,
				yearofPeriod, corporationId, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriodAndCorporationId_Last(long mtCore,
		long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countByYearofPeriodAndCorporationId(mtCore, yearofPeriod,
				corporationId);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findByYearofPeriodAndCorporationId(mtCore,
				yearofPeriod, corporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findByYearofPeriodAndCorporationId_PrevAndNext(
		long id, long mtCore, long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getByYearofPeriodAndCorporationId_PrevAndNext(session,
					vrInventory, mtCore, yearofPeriod, corporationId,
					orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getByYearofPeriodAndCorporationId_PrevAndNext(session,
					vrInventory, mtCore, yearofPeriod, corporationId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getByYearofPeriodAndCorporationId_PrevAndNext(
		Session session, VRInventory vrInventory, long mtCore,
		long yearofPeriod, long corporationId,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_YEAROFPERIOD_2);

		query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_CORPORATIONID_2);

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(yearofPeriod);

		qPos.add(corporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId) {
		for (VRInventory vrInventory : findByYearofPeriodAndCorporationId(
				mtCore, yearofPeriod, corporationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param corporationId the corporation ID
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countByYearofPeriodAndCorporationId(long mtCore,
		long yearofPeriod, long corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_YEAROFPERIODANDCORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, yearofPeriod, corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_YEAROFPERIOD_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_CORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

				qPos.add(corporationId);

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

	private static final String _FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_MTCORE_2 =
		"vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_YEAROFPERIOD_2 =
		"vrInventory.yearofPeriod = ? AND ";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDCORPORATIONID_CORPORATIONID_2 =
		"vrInventory.corporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByYearofPeriodAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByYearofPeriodAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.YEAROFPERIOD_COLUMN_BITMASK |
			VRInventoryModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_YEAROFPERIODANDVEHICLECLASS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByYearofPeriodAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass) {
		return findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass, int start, int end) {
		return findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return findByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
			vehicleClass, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS;
			finderArgs = new Object[] { mtCore, yearofPeriod, vehicleClass };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS;
			finderArgs = new Object[] {
					mtCore, yearofPeriod, vehicleClass,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(yearofPeriod != vrInventory.getYearofPeriod()) ||
							!Objects.equals(vehicleClass,
								vrInventory.getVehicleClass())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_YEAROFPERIOD_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriodAndVehicleClass_First(long mtCore,
		long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriodAndVehicleClass_First(mtCore,
				yearofPeriod, vehicleClass, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriodAndVehicleClass_First(long mtCore,
		long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findByYearofPeriodAndVehicleClass(mtCore,
				yearofPeriod, vehicleClass, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByYearofPeriodAndVehicleClass_Last(long mtCore,
		long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByYearofPeriodAndVehicleClass_Last(mtCore,
				yearofPeriod, vehicleClass, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", yearofPeriod=");
		msg.append(yearofPeriod);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByYearofPeriodAndVehicleClass_Last(long mtCore,
		long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countByYearofPeriodAndVehicleClass(mtCore, yearofPeriod,
				vehicleClass);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findByYearofPeriodAndVehicleClass(mtCore,
				yearofPeriod, vehicleClass, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findByYearofPeriodAndVehicleClass_PrevAndNext(
		long id, long mtCore, long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getByYearofPeriodAndVehicleClass_PrevAndNext(session,
					vrInventory, mtCore, yearofPeriod, vehicleClass,
					orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getByYearofPeriodAndVehicleClass_PrevAndNext(session,
					vrInventory, mtCore, yearofPeriod, vehicleClass,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getByYearofPeriodAndVehicleClass_PrevAndNext(
		Session session, VRInventory vrInventory, long mtCore,
		long yearofPeriod, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_MTCORE_2);

		query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_YEAROFPERIOD_2);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_2);
		}

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(yearofPeriod);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 */
	@Override
	public void removeByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass) {
		for (VRInventory vrInventory : findByYearofPeriodAndVehicleClass(
				mtCore, yearofPeriod, vehicleClass, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and yearofPeriod = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param yearofPeriod the yearof period
	 * @param vehicleClass the vehicle class
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countByYearofPeriodAndVehicleClass(long mtCore,
		long yearofPeriod, String vehicleClass) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_YEAROFPERIODANDVEHICLECLASS;

		Object[] finderArgs = new Object[] { mtCore, yearofPeriod, vehicleClass };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_MTCORE_2);

			query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_YEAROFPERIOD_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(yearofPeriod);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

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

	private static final String _FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_MTCORE_2 =
		"vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_YEAROFPERIOD_2 =
		"vrInventory.yearofPeriod = ? AND ";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_1 =
		"vrInventory.vehicleClass IS NULL";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_2 =
		"vrInventory.vehicleClass = ?";
	private static final String _FINDER_COLUMN_YEAROFPERIODANDVEHICLECLASS_VEHICLECLASS_3 =
		"(vrInventory.vehicleClass IS NULL OR vrInventory.vehicleClass = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBookIdAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByBookIdAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.BOOKID_COLUMN_BITMASK |
			VRInventoryModelImpl.VEHICLECLASS_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKIDANDVEHICLECLASS = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByBookIdAndVehicleClass",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, String vehicleClass) {
		return findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, String vehicleClass, int start, int end) {
		return findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return findByBookIdAndVehicleClass(mtCore, bookId, vehicleClass, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookIdAndVehicleClass(long mtCore,
		long bookId, String vehicleClass, int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS;
			finderArgs = new Object[] { mtCore, bookId, vehicleClass };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS;
			finderArgs = new Object[] {
					mtCore, bookId, vehicleClass,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(bookId != vrInventory.getBookId()) ||
							!Objects.equals(vehicleClass,
								vrInventory.getVehicleClass())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_MTCORE_2);

			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_BOOKID_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(bookId);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByBookIdAndVehicleClass_First(long mtCore,
		long bookId, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByBookIdAndVehicleClass_First(mtCore,
				bookId, vehicleClass, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByBookIdAndVehicleClass_First(long mtCore,
		long bookId, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findByBookIdAndVehicleClass(mtCore, bookId,
				vehicleClass, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByBookIdAndVehicleClass_Last(mtCore,
				bookId, vehicleClass, orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", vehicleClass=");
		msg.append(vehicleClass);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByBookIdAndVehicleClass_Last(long mtCore,
		long bookId, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countByBookIdAndVehicleClass(mtCore, bookId, vehicleClass);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findByBookIdAndVehicleClass(mtCore, bookId,
				vehicleClass, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findByBookIdAndVehicleClass_PrevAndNext(long id,
		long mtCore, long bookId, String vehicleClass,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getByBookIdAndVehicleClass_PrevAndNext(session,
					vrInventory, mtCore, bookId, vehicleClass,
					orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getByBookIdAndVehicleClass_PrevAndNext(session,
					vrInventory, mtCore, bookId, vehicleClass,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getByBookIdAndVehicleClass_PrevAndNext(
		Session session, VRInventory vrInventory, long mtCore, long bookId,
		String vehicleClass, OrderByComparator<VRInventory> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_MTCORE_2);

		query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_BOOKID_2);

		boolean bindVehicleClass = false;

		if (vehicleClass == null) {
			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_1);
		}
		else if (vehicleClass.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_3);
		}
		else {
			bindVehicleClass = true;

			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_2);
		}

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(bookId);

		if (bindVehicleClass) {
			qPos.add(vehicleClass);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 */
	@Override
	public void removeByBookIdAndVehicleClass(long mtCore, long bookId,
		String vehicleClass) {
		for (VRInventory vrInventory : findByBookIdAndVehicleClass(mtCore,
				bookId, vehicleClass, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and bookId = &#63; and vehicleClass = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param vehicleClass the vehicle class
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countByBookIdAndVehicleClass(long mtCore, long bookId,
		String vehicleClass) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKIDANDVEHICLECLASS;

		Object[] finderArgs = new Object[] { mtCore, bookId, vehicleClass };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_MTCORE_2);

			query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_BOOKID_2);

			boolean bindVehicleClass = false;

			if (vehicleClass == null) {
				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_1);
			}
			else if (vehicleClass.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_3);
			}
			else {
				bindVehicleClass = true;

				query.append(_FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(bookId);

				if (bindVehicleClass) {
					qPos.add(vehicleClass);
				}

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

	private static final String _FINDER_COLUMN_BOOKIDANDVEHICLECLASS_MTCORE_2 = "vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_BOOKIDANDVEHICLECLASS_BOOKID_2 = "vrInventory.bookId = ? AND ";
	private static final String _FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_1 =
		"vrInventory.vehicleClass IS NULL";
	private static final String _FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_2 =
		"vrInventory.vehicleClass = ?";
	private static final String _FINDER_COLUMN_BOOKIDANDVEHICLECLASS_VEHICLECLASS_3 =
		"(vrInventory.vehicleClass IS NULL OR vrInventory.vehicleClass = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKID = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBookId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.BOOKID_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOKID = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBookId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr inventories where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookId(long mtCore, long bookId) {
		return findByBookId(mtCore, bookId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookId(long mtCore, long bookId, int start,
		int end) {
		return findByBookId(mtCore, bookId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookId(long mtCore, long bookId, int start,
		int end, OrderByComparator<VRInventory> orderByComparator) {
		return findByBookId(mtCore, bookId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findByBookId(long mtCore, long bookId, int start,
		int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID;
			finderArgs = new Object[] { mtCore, bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOKID;
			finderArgs = new Object[] {
					mtCore, bookId,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(bookId != vrInventory.getBookId())) {
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

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_BOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByBookId_First(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByBookId_First(mtCore, bookId,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByBookId_First(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findByBookId(mtCore, bookId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findByBookId_Last(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByBookId_Last(mtCore, bookId,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchByBookId_Last(long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countByBookId(mtCore, bookId);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findByBookId(mtCore, bookId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findByBookId_PrevAndNext(long id, long mtCore,
		long bookId, OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getByBookId_PrevAndNext(session, vrInventory, mtCore,
					bookId, orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getByBookId_PrevAndNext(session, vrInventory, mtCore,
					bookId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getByBookId_PrevAndNext(Session session,
		VRInventory vrInventory, long mtCore, long bookId,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_BOOKID_MTCORE_2);

		query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 */
	@Override
	public void removeByBookId(long mtCore, long bookId) {
		for (VRInventory vrInventory : findByBookId(mtCore, bookId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param bookId the book ID
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countByBookId(long mtCore, long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOKID;

		Object[] finderArgs = new Object[] { mtCore, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_BOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_BOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(bookId);

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

	private static final String _FINDER_COLUMN_BOOKID_MTCORE_2 = "vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_BOOKID_BOOKID_2 = "vrInventory.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKTYPE =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycheckType",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKTYPE =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycheckType",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.CHECKTYPE_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CHECKTYPE = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycheckType",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr inventories where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckType(long mtCore, long checkType) {
		return findBycheckType(mtCore, checkType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckType(long mtCore, long checkType,
		int start, int end) {
		return findBycheckType(mtCore, checkType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckType(long mtCore, long checkType,
		int start, int end, OrderByComparator<VRInventory> orderByComparator) {
		return findBycheckType(mtCore, checkType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and checkType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckType(long mtCore, long checkType,
		int start, int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKTYPE;
			finderArgs = new Object[] { mtCore, checkType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKTYPE;
			finderArgs = new Object[] {
					mtCore, checkType,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(checkType != vrInventory.getCheckType())) {
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

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_CHECKTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_CHECKTYPE_CHECKTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(checkType);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findBycheckType_First(long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchBycheckType_First(mtCore, checkType,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", checkType=");
		msg.append(checkType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchBycheckType_First(long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findBycheckType(mtCore, checkType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findBycheckType_Last(long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchBycheckType_Last(mtCore, checkType,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", checkType=");
		msg.append(checkType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchBycheckType_Last(long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countBycheckType(mtCore, checkType);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findBycheckType(mtCore, checkType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findBycheckType_PrevAndNext(long id, long mtCore,
		long checkType, OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getBycheckType_PrevAndNext(session, vrInventory, mtCore,
					checkType, orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getBycheckType_PrevAndNext(session, vrInventory, mtCore,
					checkType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getBycheckType_PrevAndNext(Session session,
		VRInventory vrInventory, long mtCore, long checkType,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_CHECKTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_CHECKTYPE_CHECKTYPE_2);

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(checkType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and checkType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 */
	@Override
	public void removeBycheckType(long mtCore, long checkType) {
		for (VRInventory vrInventory : findBycheckType(mtCore, checkType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and checkType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkType the check type
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countBycheckType(long mtCore, long checkType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CHECKTYPE;

		Object[] finderArgs = new Object[] { mtCore, checkType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_CHECKTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_CHECKTYPE_CHECKTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(checkType);

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

	private static final String _FINDER_COLUMN_CHECKTYPE_MTCORE_2 = "vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CHECKTYPE_CHECKTYPE_2 = "vrInventory.checkType = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKSTATUS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycheckStatus",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKSTATUS =
		new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, VRInventoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycheckStatus",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInventoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRInventoryModelImpl.CHECKSTATUS_COLUMN_BITMASK |
			VRInventoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CHECKSTATUS = new FinderPath(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycheckStatus",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @return the matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckStatus(long mtCore, long checkStatus) {
		return findBycheckStatus(mtCore, checkStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckStatus(long mtCore, long checkStatus,
		int start, int end) {
		return findBycheckStatus(mtCore, checkStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckStatus(long mtCore, long checkStatus,
		int start, int end, OrderByComparator<VRInventory> orderByComparator) {
		return findBycheckStatus(mtCore, checkStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr inventories
	 */
	@Override
	public List<VRInventory> findBycheckStatus(long mtCore, long checkStatus,
		int start, int end, OrderByComparator<VRInventory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKSTATUS;
			finderArgs = new Object[] { mtCore, checkStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHECKSTATUS;
			finderArgs = new Object[] {
					mtCore, checkStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInventory vrInventory : list) {
					if ((mtCore != vrInventory.getMtCore()) ||
							(checkStatus != vrInventory.getCheckStatus())) {
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

			query.append(_SQL_SELECT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_CHECKSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_CHECKSTATUS_CHECKSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(checkStatus);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findBycheckStatus_First(long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchBycheckStatus_First(mtCore, checkStatus,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", checkStatus=");
		msg.append(checkStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the first vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchBycheckStatus_First(long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator) {
		List<VRInventory> list = findBycheckStatus(mtCore, checkStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory
	 * @throws NoSuchVRInventoryException if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory findBycheckStatus_Last(long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchBycheckStatus_Last(mtCore, checkStatus,
				orderByComparator);

		if (vrInventory != null) {
			return vrInventory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", checkStatus=");
		msg.append(checkStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInventoryException(msg.toString());
	}

	/**
	 * Returns the last vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr inventory, or <code>null</code> if a matching vr inventory could not be found
	 */
	@Override
	public VRInventory fetchBycheckStatus_Last(long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator) {
		int count = countBycheckStatus(mtCore, checkStatus);

		if (count == 0) {
			return null;
		}

		List<VRInventory> list = findBycheckStatus(mtCore, checkStatus,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr inventories before and after the current vr inventory in the ordered set where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param id the primary key of the current vr inventory
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory[] findBycheckStatus_PrevAndNext(long id, long mtCore,
		long checkStatus, OrderByComparator<VRInventory> orderByComparator)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInventory[] array = new VRInventoryImpl[3];

			array[0] = getBycheckStatus_PrevAndNext(session, vrInventory,
					mtCore, checkStatus, orderByComparator, true);

			array[1] = vrInventory;

			array[2] = getBycheckStatus_PrevAndNext(session, vrInventory,
					mtCore, checkStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInventory getBycheckStatus_PrevAndNext(Session session,
		VRInventory vrInventory, long mtCore, long checkStatus,
		OrderByComparator<VRInventory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINVENTORY_WHERE);

		query.append(_FINDER_COLUMN_CHECKSTATUS_MTCORE_2);

		query.append(_FINDER_COLUMN_CHECKSTATUS_CHECKSTATUS_2);

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
			query.append(VRInventoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(checkStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInventory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInventory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr inventories where mtCore = &#63; and checkStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 */
	@Override
	public void removeBycheckStatus(long mtCore, long checkStatus) {
		for (VRInventory vrInventory : findBycheckStatus(mtCore, checkStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories where mtCore = &#63; and checkStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param checkStatus the check status
	 * @return the number of matching vr inventories
	 */
	@Override
	public int countBycheckStatus(long mtCore, long checkStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CHECKSTATUS;

		Object[] finderArgs = new Object[] { mtCore, checkStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINVENTORY_WHERE);

			query.append(_FINDER_COLUMN_CHECKSTATUS_MTCORE_2);

			query.append(_FINDER_COLUMN_CHECKSTATUS_CHECKSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(checkStatus);

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

	private static final String _FINDER_COLUMN_CHECKSTATUS_MTCORE_2 = "vrInventory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CHECKSTATUS_CHECKSTATUS_2 = "vrInventory.checkStatus = ?";

	public VRInventoryPersistenceImpl() {
		setModelClass(VRInventory.class);
	}

	/**
	 * Caches the vr inventory in the entity cache if it is enabled.
	 *
	 * @param vrInventory the vr inventory
	 */
	@Override
	public void cacheResult(VRInventory vrInventory) {
		entityCache.putResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryImpl.class, vrInventory.getPrimaryKey(), vrInventory);

		vrInventory.resetOriginalValues();
	}

	/**
	 * Caches the vr inventories in the entity cache if it is enabled.
	 *
	 * @param vrInventories the vr inventories
	 */
	@Override
	public void cacheResult(List<VRInventory> vrInventories) {
		for (VRInventory vrInventory : vrInventories) {
			if (entityCache.getResult(
						VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
						VRInventoryImpl.class, vrInventory.getPrimaryKey()) == null) {
				cacheResult(vrInventory);
			}
			else {
				vrInventory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr inventories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRInventoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr inventory.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRInventory vrInventory) {
		entityCache.removeResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryImpl.class, vrInventory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRInventory> vrInventories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRInventory vrInventory : vrInventories) {
			entityCache.removeResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
				VRInventoryImpl.class, vrInventory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr inventory with the primary key. Does not add the vr inventory to the database.
	 *
	 * @param id the primary key for the new vr inventory
	 * @return the new vr inventory
	 */
	@Override
	public VRInventory create(long id) {
		VRInventory vrInventory = new VRInventoryImpl();

		vrInventory.setNew(true);
		vrInventory.setPrimaryKey(id);

		return vrInventory;
	}

	/**
	 * Removes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr inventory
	 * @return the vr inventory that was removed
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory remove(long id) throws NoSuchVRInventoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr inventory with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr inventory
	 * @return the vr inventory that was removed
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory remove(Serializable primaryKey)
		throws NoSuchVRInventoryException {
		Session session = null;

		try {
			session = openSession();

			VRInventory vrInventory = (VRInventory)session.get(VRInventoryImpl.class,
					primaryKey);

			if (vrInventory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRInventoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrInventory);
		}
		catch (NoSuchVRInventoryException nsee) {
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
	protected VRInventory removeImpl(VRInventory vrInventory) {
		vrInventory = toUnwrappedModel(vrInventory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrInventory)) {
				vrInventory = (VRInventory)session.get(VRInventoryImpl.class,
						vrInventory.getPrimaryKeyObj());
			}

			if (vrInventory != null) {
				session.delete(vrInventory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrInventory != null) {
			clearCache(vrInventory);
		}

		return vrInventory;
	}

	@Override
	public VRInventory updateImpl(VRInventory vrInventory) {
		vrInventory = toUnwrappedModel(vrInventory);

		boolean isNew = vrInventory.isNew();

		VRInventoryModelImpl vrInventoryModelImpl = (VRInventoryModelImpl)vrInventory;

		Session session = null;

		try {
			session = openSession();

			if (vrInventory.isNew()) {
				session.save(vrInventory);

				vrInventory.setNew(false);
			}
			else {
				vrInventory = (VRInventory)session.merge(vrInventory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRInventoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIOD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalYearofPeriod()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIOD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIOD,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getYearofPeriod()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIOD, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIOD,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalYearofPeriod(),
						vrInventoryModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIODANDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getYearofPeriod(),
						vrInventoryModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIODANDCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDCORPORATIONID,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalYearofPeriod(),
						vrInventoryModelImpl.getOriginalVehicleClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIODANDVEHICLECLASS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getYearofPeriod(),
						vrInventoryModelImpl.getVehicleClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_YEAROFPERIODANDVEHICLECLASS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAROFPERIODANDVEHICLECLASS,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalBookId(),
						vrInventoryModelImpl.getOriginalVehicleClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKIDANDVEHICLECLASS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getBookId(),
						vrInventoryModelImpl.getVehicleClass()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKIDANDVEHICLECLASS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKIDANDVEHICLECLASS,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOKID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOKID,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalCheckType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHECKTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKTYPE,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getCheckType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHECKTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKTYPE,
					args);
			}

			if ((vrInventoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInventoryModelImpl.getOriginalMtCore(),
						vrInventoryModelImpl.getOriginalCheckStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHECKSTATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKSTATUS,
					args);

				args = new Object[] {
						vrInventoryModelImpl.getMtCore(),
						vrInventoryModelImpl.getCheckStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHECKSTATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHECKSTATUS,
					args);
			}
		}

		entityCache.putResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
			VRInventoryImpl.class, vrInventory.getPrimaryKey(), vrInventory,
			false);

		vrInventory.resetOriginalValues();

		return vrInventory;
	}

	protected VRInventory toUnwrappedModel(VRInventory vrInventory) {
		if (vrInventory instanceof VRInventoryImpl) {
			return vrInventory;
		}

		VRInventoryImpl vrInventoryImpl = new VRInventoryImpl();

		vrInventoryImpl.setNew(vrInventory.isNew());
		vrInventoryImpl.setPrimaryKey(vrInventory.getPrimaryKey());

		vrInventoryImpl.setId(vrInventory.getId());
		vrInventoryImpl.setMtCore(vrInventory.getMtCore());
		vrInventoryImpl.setYearofPeriod(vrInventory.getYearofPeriod());
		vrInventoryImpl.setPreviousPeriod(vrInventory.getPreviousPeriod());
		vrInventoryImpl.setPreviousPeriodCode(vrInventory.getPreviousPeriodCode());
		vrInventoryImpl.setBookId(vrInventory.getBookId());
		vrInventoryImpl.setVehicleClass(vrInventory.getVehicleClass());
		vrInventoryImpl.setStampType(vrInventory.getStampType());
		vrInventoryImpl.setStampShortNo(vrInventory.getStampShortNo());
		vrInventoryImpl.setSerialStartNo(vrInventory.getSerialStartNo());
		vrInventoryImpl.setSerialEndNo(vrInventory.getSerialEndNo());
		vrInventoryImpl.setTotalQuantities(vrInventory.getTotalQuantities());
		vrInventoryImpl.setTotalInUse(vrInventory.getTotalInUse());
		vrInventoryImpl.setTotalNotUsed(vrInventory.getTotalNotUsed());
		vrInventoryImpl.setRemark(vrInventory.getRemark());
		vrInventoryImpl.setCorporationId(vrInventory.getCorporationId());
		vrInventoryImpl.setCheckType(vrInventory.getCheckType());
		vrInventoryImpl.setCheckStatus(vrInventory.getCheckStatus());
		vrInventoryImpl.setModifyDate(vrInventory.getModifyDate());
		vrInventoryImpl.setSyncDate(vrInventory.getSyncDate());

		return vrInventoryImpl;
	}

	/**
	 * Returns the vr inventory with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr inventory
	 * @return the vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRInventoryException {
		VRInventory vrInventory = fetchByPrimaryKey(primaryKey);

		if (vrInventory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRInventoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrInventory;
	}

	/**
	 * Returns the vr inventory with the primary key or throws a {@link NoSuchVRInventoryException} if it could not be found.
	 *
	 * @param id the primary key of the vr inventory
	 * @return the vr inventory
	 * @throws NoSuchVRInventoryException if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory findByPrimaryKey(long id)
		throws NoSuchVRInventoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr inventory
	 * @return the vr inventory, or <code>null</code> if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
				VRInventoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRInventory vrInventory = (VRInventory)serializable;

		if (vrInventory == null) {
			Session session = null;

			try {
				session = openSession();

				vrInventory = (VRInventory)session.get(VRInventoryImpl.class,
						primaryKey);

				if (vrInventory != null) {
					cacheResult(vrInventory);
				}
				else {
					entityCache.putResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
						VRInventoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
					VRInventoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrInventory;
	}

	/**
	 * Returns the vr inventory with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr inventory
	 * @return the vr inventory, or <code>null</code> if a vr inventory with the primary key could not be found
	 */
	@Override
	public VRInventory fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRInventory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRInventory> map = new HashMap<Serializable, VRInventory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRInventory vrInventory = fetchByPrimaryKey(primaryKey);

			if (vrInventory != null) {
				map.put(primaryKey, vrInventory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
					VRInventoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRInventory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRINVENTORY_WHERE_PKS_IN);

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

			for (VRInventory vrInventory : (List<VRInventory>)q.list()) {
				map.put(vrInventory.getPrimaryKeyObj(), vrInventory);

				cacheResult(vrInventory);

				uncachedPrimaryKeys.remove(vrInventory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRInventoryModelImpl.ENTITY_CACHE_ENABLED,
					VRInventoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr inventories.
	 *
	 * @return the vr inventories
	 */
	@Override
	public List<VRInventory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @return the range of vr inventories
	 */
	@Override
	public List<VRInventory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr inventories
	 */
	@Override
	public List<VRInventory> findAll(int start, int end,
		OrderByComparator<VRInventory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr inventories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInventoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr inventories
	 * @param end the upper bound of the range of vr inventories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr inventories
	 */
	@Override
	public List<VRInventory> findAll(int start, int end,
		OrderByComparator<VRInventory> orderByComparator,
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

		List<VRInventory> list = null;

		if (retrieveFromCache) {
			list = (List<VRInventory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRINVENTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRINVENTORY;

				if (pagination) {
					sql = sql.concat(VRInventoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInventory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr inventories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRInventory vrInventory : findAll()) {
			remove(vrInventory);
		}
	}

	/**
	 * Returns the number of vr inventories.
	 *
	 * @return the number of vr inventories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRINVENTORY);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return VRInventoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr inventory persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRInventoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRINVENTORY = "SELECT vrInventory FROM VRInventory vrInventory";
	private static final String _SQL_SELECT_VRINVENTORY_WHERE_PKS_IN = "SELECT vrInventory FROM VRInventory vrInventory WHERE id IN (";
	private static final String _SQL_SELECT_VRINVENTORY_WHERE = "SELECT vrInventory FROM VRInventory vrInventory WHERE ";
	private static final String _SQL_COUNT_VRINVENTORY = "SELECT COUNT(vrInventory) FROM VRInventory vrInventory";
	private static final String _SQL_COUNT_VRINVENTORY_WHERE = "SELECT COUNT(vrInventory) FROM VRInventory vrInventory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrInventory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRInventory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRInventory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRInventoryPersistenceImpl.class);
}