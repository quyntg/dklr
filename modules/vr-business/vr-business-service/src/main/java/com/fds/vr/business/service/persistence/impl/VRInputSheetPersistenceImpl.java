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

import com.fds.vr.business.exception.NoSuchVRInputSheetException;
import com.fds.vr.business.model.VRInputSheet;
import com.fds.vr.business.model.impl.VRInputSheetImpl;
import com.fds.vr.business.model.impl.VRInputSheetModelImpl;
import com.fds.vr.business.service.persistence.VRInputSheetPersistence;

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
 * The persistence implementation for the vr input sheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRInputSheetPersistence
 * @see com.fds.vr.business.service.persistence.VRInputSheetUtil
 * @generated
 */
@ProviderType
public class VRInputSheetPersistenceImpl extends BasePersistenceImpl<VRInputSheet>
	implements VRInputSheetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRInputSheetUtil} to access the vr input sheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRInputSheetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETNO =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByinputSheetNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByinputSheetNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRInputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputSheetModelImpl.INPUTSHEETNO_COLUMN_BITMASK |
			VRInputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETNO = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinputSheetNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @return the matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetNo(long mtCore,
		String inputSheetNo) {
		return findByinputSheetNo(mtCore, inputSheetNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @return the range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetNo(long mtCore,
		String inputSheetNo, int start, int end) {
		return findByinputSheetNo(mtCore, inputSheetNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetNo(long mtCore,
		String inputSheetNo, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator) {
		return findByinputSheetNo(mtCore, inputSheetNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetNo(long mtCore,
		String inputSheetNo, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO;
			finderArgs = new Object[] { mtCore, inputSheetNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETNO;
			finderArgs = new Object[] {
					mtCore, inputSheetNo,
					
					start, end, orderByComparator
				};
		}

		List<VRInputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputSheet vrInputSheet : list) {
					if ((mtCore != vrInputSheet.getMtCore()) ||
							!Objects.equals(inputSheetNo,
								vrInputSheet.getInputSheetNo())) {
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

			query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

			boolean bindInputSheetNo = false;

			if (inputSheetNo == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_1);
			}
			else if (inputSheetNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_3);
			}
			else {
				bindInputSheetNo = true;

				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindInputSheetNo) {
					qPos.add(inputSheetNo);
				}

				if (!pagination) {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findByinputSheetNo_First(long mtCore,
		String inputSheetNo, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchByinputSheetNo_First(mtCore,
				inputSheetNo, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetNo=");
		msg.append(inputSheetNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchByinputSheetNo_First(long mtCore,
		String inputSheetNo, OrderByComparator<VRInputSheet> orderByComparator) {
		List<VRInputSheet> list = findByinputSheetNo(mtCore, inputSheetNo, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findByinputSheetNo_Last(long mtCore,
		String inputSheetNo, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchByinputSheetNo_Last(mtCore,
				inputSheetNo, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetNo=");
		msg.append(inputSheetNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchByinputSheetNo_Last(long mtCore,
		String inputSheetNo, OrderByComparator<VRInputSheet> orderByComparator) {
		int count = countByinputSheetNo(mtCore, inputSheetNo);

		if (count == 0) {
			return null;
		}

		List<VRInputSheet> list = findByinputSheetNo(mtCore, inputSheetNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param id the primary key of the current vr input sheet
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input sheet
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet[] findByinputSheetNo_PrevAndNext(long id, long mtCore,
		String inputSheetNo, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputSheet[] array = new VRInputSheetImpl[3];

			array[0] = getByinputSheetNo_PrevAndNext(session, vrInputSheet,
					mtCore, inputSheetNo, orderByComparator, true);

			array[1] = vrInputSheet;

			array[2] = getByinputSheetNo_PrevAndNext(session, vrInputSheet,
					mtCore, inputSheetNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInputSheet getByinputSheetNo_PrevAndNext(Session session,
		VRInputSheet vrInputSheet, long mtCore, String inputSheetNo,
		OrderByComparator<VRInputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

		boolean bindInputSheetNo = false;

		if (inputSheetNo == null) {
			query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_1);
		}
		else if (inputSheetNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_3);
		}
		else {
			bindInputSheetNo = true;

			query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_2);
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
			query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindInputSheetNo) {
			qPos.add(inputSheetNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input sheets where mtCore = &#63; and inputSheetNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 */
	@Override
	public void removeByinputSheetNo(long mtCore, String inputSheetNo) {
		for (VRInputSheet vrInputSheet : findByinputSheetNo(mtCore,
				inputSheetNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputSheet);
		}
	}

	/**
	 * Returns the number of vr input sheets where mtCore = &#63; and inputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetNo the input sheet no
	 * @return the number of matching vr input sheets
	 */
	@Override
	public int countByinputSheetNo(long mtCore, String inputSheetNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETNO;

		Object[] finderArgs = new Object[] { mtCore, inputSheetNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

			boolean bindInputSheetNo = false;

			if (inputSheetNo == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_1);
			}
			else if (inputSheetNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_3);
			}
			else {
				bindInputSheetNo = true;

				query.append(_FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindInputSheetNo) {
					qPos.add(inputSheetNo);
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

	private static final String _FINDER_COLUMN_INPUTSHEETNO_MTCORE_2 = "vrInputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_1 = "vrInputSheet.inputSheetNo IS NULL";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_2 = "vrInputSheet.inputSheetNo = ?";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_INPUTSHEETNO_3 = "(vrInputSheet.inputSheetNo IS NULL OR vrInputSheet.inputSheetNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycorporationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputSheetModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRInputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycorporationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId) {
		return findBycorporationId(mtCore, corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @return the range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end) {
		return findBycorporationId(mtCore, corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator) {
		return findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findBycorporationId(long mtCore,
		long corporationId, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { mtCore, corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					mtCore, corporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRInputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputSheet vrInputSheet : list) {
					if ((mtCore != vrInputSheet.getMtCore()) ||
							(corporationId != vrInputSheet.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(corporationId);

				if (!pagination) {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findBycorporationId_First(long mtCore,
		long corporationId, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchBycorporationId_First(mtCore,
				corporationId, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchBycorporationId_First(long mtCore,
		long corporationId, OrderByComparator<VRInputSheet> orderByComparator) {
		List<VRInputSheet> list = findBycorporationId(mtCore, corporationId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findBycorporationId_Last(long mtCore,
		long corporationId, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchBycorporationId_Last(mtCore,
				corporationId, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchBycorporationId_Last(long mtCore,
		long corporationId, OrderByComparator<VRInputSheet> orderByComparator) {
		int count = countBycorporationId(mtCore, corporationId);

		if (count == 0) {
			return null;
		}

		List<VRInputSheet> list = findBycorporationId(mtCore, corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr input sheet
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input sheet
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet[] findBycorporationId_PrevAndNext(long id, long mtCore,
		long corporationId, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputSheet[] array = new VRInputSheetImpl[3];

			array[0] = getBycorporationId_PrevAndNext(session, vrInputSheet,
					mtCore, corporationId, orderByComparator, true);

			array[1] = vrInputSheet;

			array[2] = getBycorporationId_PrevAndNext(session, vrInputSheet,
					mtCore, corporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInputSheet getBycorporationId_PrevAndNext(Session session,
		VRInputSheet vrInputSheet, long mtCore, long corporationId,
		OrderByComparator<VRInputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

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
			query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(corporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input sheets where mtCore = &#63; and corporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeBycorporationId(long mtCore, long corporationId) {
		for (VRInputSheet vrInputSheet : findBycorporationId(mtCore,
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputSheet);
		}
	}

	/**
	 * Returns the number of vr input sheets where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the number of matching vr input sheets
	 */
	@Override
	public int countBycorporationId(long mtCore, long corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_MTCORE_2 = "vrInputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrInputSheet.corporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETTYPE =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByinputSheetType",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETTYPE =
		new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, VRInputSheetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByinputSheetType",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRInputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VRInputSheetModelImpl.INPUTSHEETTYPE_COLUMN_BITMASK |
			VRInputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETTYPE = new FinderPath(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinputSheetType",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @return the matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType) {
		return findByinputSheetType(mtCore, inputSheetType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @return the range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end) {
		return findByinputSheetType(mtCore, inputSheetType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator) {
		return findByinputSheetType(mtCore, inputSheetType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr input sheets
	 */
	@Override
	public List<VRInputSheet> findByinputSheetType(long mtCore,
		long inputSheetType, int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETTYPE;
			finderArgs = new Object[] { mtCore, inputSheetType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETTYPE;
			finderArgs = new Object[] {
					mtCore, inputSheetType,
					
					start, end, orderByComparator
				};
		}

		List<VRInputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRInputSheet vrInputSheet : list) {
					if ((mtCore != vrInputSheet.getMtCore()) ||
							(inputSheetType != vrInputSheet.getInputSheetType())) {
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

			query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETTYPE_INPUTSHEETTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetType);

				if (!pagination) {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findByinputSheetType_First(long mtCore,
		long inputSheetType, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchByinputSheetType_First(mtCore,
				inputSheetType, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetType=");
		msg.append(inputSheetType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchByinputSheetType_First(long mtCore,
		long inputSheetType, OrderByComparator<VRInputSheet> orderByComparator) {
		List<VRInputSheet> list = findByinputSheetType(mtCore, inputSheetType,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet
	 * @throws NoSuchVRInputSheetException if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet findByinputSheetType_Last(long mtCore,
		long inputSheetType, OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchByinputSheetType_Last(mtCore,
				inputSheetType, orderByComparator);

		if (vrInputSheet != null) {
			return vrInputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetType=");
		msg.append(inputSheetType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRInputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr input sheet, or <code>null</code> if a matching vr input sheet could not be found
	 */
	@Override
	public VRInputSheet fetchByinputSheetType_Last(long mtCore,
		long inputSheetType, OrderByComparator<VRInputSheet> orderByComparator) {
		int count = countByinputSheetType(mtCore, inputSheetType);

		if (count == 0) {
			return null;
		}

		List<VRInputSheet> list = findByinputSheetType(mtCore, inputSheetType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr input sheets before and after the current vr input sheet in the ordered set where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param id the primary key of the current vr input sheet
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr input sheet
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet[] findByinputSheetType_PrevAndNext(long id,
		long mtCore, long inputSheetType,
		OrderByComparator<VRInputSheet> orderByComparator)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRInputSheet[] array = new VRInputSheetImpl[3];

			array[0] = getByinputSheetType_PrevAndNext(session, vrInputSheet,
					mtCore, inputSheetType, orderByComparator, true);

			array[1] = vrInputSheet;

			array[2] = getByinputSheetType_PrevAndNext(session, vrInputSheet,
					mtCore, inputSheetType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRInputSheet getByinputSheetType_PrevAndNext(Session session,
		VRInputSheet vrInputSheet, long mtCore, long inputSheetType,
		OrderByComparator<VRInputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRINPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETTYPE_INPUTSHEETTYPE_2);

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
			query.append(VRInputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrInputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRInputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr input sheets where mtCore = &#63; and inputSheetType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 */
	@Override
	public void removeByinputSheetType(long mtCore, long inputSheetType) {
		for (VRInputSheet vrInputSheet : findByinputSheetType(mtCore,
				inputSheetType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrInputSheet);
		}
	}

	/**
	 * Returns the number of vr input sheets where mtCore = &#63; and inputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetType the input sheet type
	 * @return the number of matching vr input sheets
	 */
	@Override
	public int countByinputSheetType(long mtCore, long inputSheetType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETTYPE;

		Object[] finderArgs = new Object[] { mtCore, inputSheetType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRINPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETTYPE_INPUTSHEETTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetType);

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

	private static final String _FINDER_COLUMN_INPUTSHEETTYPE_MTCORE_2 = "vrInputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETTYPE_INPUTSHEETTYPE_2 = "vrInputSheet.inputSheetType = ?";

	public VRInputSheetPersistenceImpl() {
		setModelClass(VRInputSheet.class);
	}

	/**
	 * Caches the vr input sheet in the entity cache if it is enabled.
	 *
	 * @param vrInputSheet the vr input sheet
	 */
	@Override
	public void cacheResult(VRInputSheet vrInputSheet) {
		entityCache.putResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetImpl.class, vrInputSheet.getPrimaryKey(), vrInputSheet);

		vrInputSheet.resetOriginalValues();
	}

	/**
	 * Caches the vr input sheets in the entity cache if it is enabled.
	 *
	 * @param vrInputSheets the vr input sheets
	 */
	@Override
	public void cacheResult(List<VRInputSheet> vrInputSheets) {
		for (VRInputSheet vrInputSheet : vrInputSheets) {
			if (entityCache.getResult(
						VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
						VRInputSheetImpl.class, vrInputSheet.getPrimaryKey()) == null) {
				cacheResult(vrInputSheet);
			}
			else {
				vrInputSheet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr input sheets.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRInputSheetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr input sheet.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRInputSheet vrInputSheet) {
		entityCache.removeResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetImpl.class, vrInputSheet.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRInputSheet> vrInputSheets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRInputSheet vrInputSheet : vrInputSheets) {
			entityCache.removeResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
				VRInputSheetImpl.class, vrInputSheet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr input sheet with the primary key. Does not add the vr input sheet to the database.
	 *
	 * @param id the primary key for the new vr input sheet
	 * @return the new vr input sheet
	 */
	@Override
	public VRInputSheet create(long id) {
		VRInputSheet vrInputSheet = new VRInputSheetImpl();

		vrInputSheet.setNew(true);
		vrInputSheet.setPrimaryKey(id);

		return vrInputSheet;
	}

	/**
	 * Removes the vr input sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr input sheet
	 * @return the vr input sheet that was removed
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet remove(long id) throws NoSuchVRInputSheetException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr input sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr input sheet
	 * @return the vr input sheet that was removed
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet remove(Serializable primaryKey)
		throws NoSuchVRInputSheetException {
		Session session = null;

		try {
			session = openSession();

			VRInputSheet vrInputSheet = (VRInputSheet)session.get(VRInputSheetImpl.class,
					primaryKey);

			if (vrInputSheet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRInputSheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrInputSheet);
		}
		catch (NoSuchVRInputSheetException nsee) {
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
	protected VRInputSheet removeImpl(VRInputSheet vrInputSheet) {
		vrInputSheet = toUnwrappedModel(vrInputSheet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrInputSheet)) {
				vrInputSheet = (VRInputSheet)session.get(VRInputSheetImpl.class,
						vrInputSheet.getPrimaryKeyObj());
			}

			if (vrInputSheet != null) {
				session.delete(vrInputSheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrInputSheet != null) {
			clearCache(vrInputSheet);
		}

		return vrInputSheet;
	}

	@Override
	public VRInputSheet updateImpl(VRInputSheet vrInputSheet) {
		vrInputSheet = toUnwrappedModel(vrInputSheet);

		boolean isNew = vrInputSheet.isNew();

		VRInputSheetModelImpl vrInputSheetModelImpl = (VRInputSheetModelImpl)vrInputSheet;

		Session session = null;

		try {
			session = openSession();

			if (vrInputSheet.isNew()) {
				session.save(vrInputSheet);

				vrInputSheet.setNew(false);
			}
			else {
				vrInputSheet = (VRInputSheet)session.merge(vrInputSheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRInputSheetModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrInputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputSheetModelImpl.getOriginalMtCore(),
						vrInputSheetModelImpl.getOriginalInputSheetNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO,
					args);

				args = new Object[] {
						vrInputSheetModelImpl.getMtCore(),
						vrInputSheetModelImpl.getInputSheetNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO,
					args);
			}

			if ((vrInputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputSheetModelImpl.getOriginalMtCore(),
						vrInputSheetModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrInputSheetModelImpl.getMtCore(),
						vrInputSheetModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrInputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrInputSheetModelImpl.getOriginalMtCore(),
						vrInputSheetModelImpl.getOriginalInputSheetType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETTYPE,
					args);

				args = new Object[] {
						vrInputSheetModelImpl.getMtCore(),
						vrInputSheetModelImpl.getInputSheetType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETTYPE,
					args);
			}
		}

		entityCache.putResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VRInputSheetImpl.class, vrInputSheet.getPrimaryKey(), vrInputSheet,
			false);

		vrInputSheet.resetOriginalValues();

		return vrInputSheet;
	}

	protected VRInputSheet toUnwrappedModel(VRInputSheet vrInputSheet) {
		if (vrInputSheet instanceof VRInputSheetImpl) {
			return vrInputSheet;
		}

		VRInputSheetImpl vrInputSheetImpl = new VRInputSheetImpl();

		vrInputSheetImpl.setNew(vrInputSheet.isNew());
		vrInputSheetImpl.setPrimaryKey(vrInputSheet.getPrimaryKey());

		vrInputSheetImpl.setId(vrInputSheet.getId());
		vrInputSheetImpl.setMtCore(vrInputSheet.getMtCore());
		vrInputSheetImpl.setInputSheetNo(vrInputSheet.getInputSheetNo());
		vrInputSheetImpl.setInputSheetDate(vrInputSheet.getInputSheetDate());
		vrInputSheetImpl.setOriginalDocumentNo(vrInputSheet.getOriginalDocumentNo());
		vrInputSheetImpl.setCorporationId(vrInputSheet.getCorporationId());
		vrInputSheetImpl.setInputSheetType(vrInputSheet.getInputSheetType());
		vrInputSheetImpl.setMaker(vrInputSheet.getMaker());
		vrInputSheetImpl.setChecker(vrInputSheet.getChecker());
		vrInputSheetImpl.setApprover(vrInputSheet.getApprover());
		vrInputSheetImpl.setDeliveryName(vrInputSheet.getDeliveryName());
		vrInputSheetImpl.setInventoryName(vrInputSheet.getInventoryName());
		vrInputSheetImpl.setInventoryPlace(vrInputSheet.getInventoryPlace());
		vrInputSheetImpl.setInventoryDate(vrInputSheet.getInventoryDate());
		vrInputSheetImpl.setBookIDList(vrInputSheet.getBookIDList());
		vrInputSheetImpl.setIsApproval(vrInputSheet.getIsApproval());
		vrInputSheetImpl.setTotalQuantities(vrInputSheet.getTotalQuantities());
		vrInputSheetImpl.setTotalAmount(vrInputSheet.getTotalAmount());
		vrInputSheetImpl.setAmountInWords(vrInputSheet.getAmountInWords());
		vrInputSheetImpl.setRemark(vrInputSheet.getRemark());
		vrInputSheetImpl.setModifyDate(vrInputSheet.getModifyDate());
		vrInputSheetImpl.setSyncDate(vrInputSheet.getSyncDate());

		return vrInputSheetImpl;
	}

	/**
	 * Returns the vr input sheet with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input sheet
	 * @return the vr input sheet
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRInputSheetException {
		VRInputSheet vrInputSheet = fetchByPrimaryKey(primaryKey);

		if (vrInputSheet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRInputSheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrInputSheet;
	}

	/**
	 * Returns the vr input sheet with the primary key or throws a {@link NoSuchVRInputSheetException} if it could not be found.
	 *
	 * @param id the primary key of the vr input sheet
	 * @return the vr input sheet
	 * @throws NoSuchVRInputSheetException if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet findByPrimaryKey(long id)
		throws NoSuchVRInputSheetException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr input sheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr input sheet
	 * @return the vr input sheet, or <code>null</code> if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
				VRInputSheetImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRInputSheet vrInputSheet = (VRInputSheet)serializable;

		if (vrInputSheet == null) {
			Session session = null;

			try {
				session = openSession();

				vrInputSheet = (VRInputSheet)session.get(VRInputSheetImpl.class,
						primaryKey);

				if (vrInputSheet != null) {
					cacheResult(vrInputSheet);
				}
				else {
					entityCache.putResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
						VRInputSheetImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VRInputSheetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrInputSheet;
	}

	/**
	 * Returns the vr input sheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr input sheet
	 * @return the vr input sheet, or <code>null</code> if a vr input sheet with the primary key could not be found
	 */
	@Override
	public VRInputSheet fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRInputSheet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRInputSheet> map = new HashMap<Serializable, VRInputSheet>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRInputSheet vrInputSheet = fetchByPrimaryKey(primaryKey);

			if (vrInputSheet != null) {
				map.put(primaryKey, vrInputSheet);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VRInputSheetImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRInputSheet)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRINPUTSHEET_WHERE_PKS_IN);

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

			for (VRInputSheet vrInputSheet : (List<VRInputSheet>)q.list()) {
				map.put(vrInputSheet.getPrimaryKeyObj(), vrInputSheet);

				cacheResult(vrInputSheet);

				uncachedPrimaryKeys.remove(vrInputSheet.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRInputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VRInputSheetImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr input sheets.
	 *
	 * @return the vr input sheets
	 */
	@Override
	public List<VRInputSheet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr input sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @return the range of vr input sheets
	 */
	@Override
	public List<VRInputSheet> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr input sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr input sheets
	 */
	@Override
	public List<VRInputSheet> findAll(int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr input sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRInputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr input sheets
	 * @param end the upper bound of the range of vr input sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr input sheets
	 */
	@Override
	public List<VRInputSheet> findAll(int start, int end,
		OrderByComparator<VRInputSheet> orderByComparator,
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

		List<VRInputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VRInputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRINPUTSHEET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRINPUTSHEET;

				if (pagination) {
					sql = sql.concat(VRInputSheetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRInputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr input sheets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRInputSheet vrInputSheet : findAll()) {
			remove(vrInputSheet);
		}
	}

	/**
	 * Returns the number of vr input sheets.
	 *
	 * @return the number of vr input sheets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRINPUTSHEET);

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
		return VRInputSheetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr input sheet persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRInputSheetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRINPUTSHEET = "SELECT vrInputSheet FROM VRInputSheet vrInputSheet";
	private static final String _SQL_SELECT_VRINPUTSHEET_WHERE_PKS_IN = "SELECT vrInputSheet FROM VRInputSheet vrInputSheet WHERE id IN (";
	private static final String _SQL_SELECT_VRINPUTSHEET_WHERE = "SELECT vrInputSheet FROM VRInputSheet vrInputSheet WHERE ";
	private static final String _SQL_COUNT_VRINPUTSHEET = "SELECT COUNT(vrInputSheet) FROM VRInputSheet vrInputSheet";
	private static final String _SQL_COUNT_VRINPUTSHEET_WHERE = "SELECT COUNT(vrInputSheet) FROM VRInputSheet vrInputSheet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrInputSheet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRInputSheet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRInputSheet exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRInputSheetPersistenceImpl.class);
}