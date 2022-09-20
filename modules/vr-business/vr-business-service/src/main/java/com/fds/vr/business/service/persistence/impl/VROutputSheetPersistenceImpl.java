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

import com.fds.vr.business.exception.NoSuchVROutputSheetException;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.model.impl.VROutputSheetImpl;
import com.fds.vr.business.model.impl.VROutputSheetModelImpl;
import com.fds.vr.business.service.persistence.VROutputSheetPersistence;

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
 * The persistence implementation for the vr output sheet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetPersistence
 * @see com.fds.vr.business.service.persistence.VROutputSheetUtil
 * @generated
 */
@ProviderType
public class VROutputSheetPersistenceImpl extends BasePersistenceImpl<VROutputSheet>
	implements VROutputSheetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VROutputSheetUtil} to access the vr output sheet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VROutputSheetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETNO =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByinputSheetNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByinputSheetNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VROutputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetModelImpl.OUTPUTSHEETNO_COLUMN_BITMASK |
			VROutputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETNO = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByinputSheetNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @return the matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByinputSheetNo(long mtCore,
		String outputSheetNo) {
		return findByinputSheetNo(mtCore, outputSheetNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByinputSheetNo(long mtCore,
		String outputSheetNo, int start, int end) {
		return findByinputSheetNo(mtCore, outputSheetNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByinputSheetNo(long mtCore,
		String outputSheetNo, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return findByinputSheetNo(mtCore, outputSheetNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByinputSheetNo(long mtCore,
		String outputSheetNo, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO;
			finderArgs = new Object[] { mtCore, outputSheetNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETNO;
			finderArgs = new Object[] {
					mtCore, outputSheetNo,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheet vrOutputSheet : list) {
					if ((mtCore != vrOutputSheet.getMtCore()) ||
							!Objects.equals(outputSheetNo,
								vrOutputSheet.getOutputSheetNo())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

			boolean bindOutputSheetNo = false;

			if (outputSheetNo == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_1);
			}
			else if (outputSheetNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_3);
			}
			else {
				bindOutputSheetNo = true;

				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindOutputSheetNo) {
					qPos.add(outputSheetNo);
				}

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findByinputSheetNo_First(long mtCore,
		String outputSheetNo, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchByinputSheetNo_First(mtCore,
				outputSheetNo, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetNo=");
		msg.append(outputSheetNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchByinputSheetNo_First(long mtCore,
		String outputSheetNo, OrderByComparator<VROutputSheet> orderByComparator) {
		List<VROutputSheet> list = findByinputSheetNo(mtCore, outputSheetNo, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findByinputSheetNo_Last(long mtCore,
		String outputSheetNo, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchByinputSheetNo_Last(mtCore,
				outputSheetNo, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetNo=");
		msg.append(outputSheetNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchByinputSheetNo_Last(long mtCore,
		String outputSheetNo, OrderByComparator<VROutputSheet> orderByComparator) {
		int count = countByinputSheetNo(mtCore, outputSheetNo);

		if (count == 0) {
			return null;
		}

		List<VROutputSheet> list = findByinputSheetNo(mtCore, outputSheetNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet[] findByinputSheetNo_PrevAndNext(long id, long mtCore,
		String outputSheetNo, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheet[] array = new VROutputSheetImpl[3];

			array[0] = getByinputSheetNo_PrevAndNext(session, vrOutputSheet,
					mtCore, outputSheetNo, orderByComparator, true);

			array[1] = vrOutputSheet;

			array[2] = getByinputSheetNo_PrevAndNext(session, vrOutputSheet,
					mtCore, outputSheetNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VROutputSheet getByinputSheetNo_PrevAndNext(Session session,
		VROutputSheet vrOutputSheet, long mtCore, String outputSheetNo,
		OrderByComparator<VROutputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

		boolean bindOutputSheetNo = false;

		if (outputSheetNo == null) {
			query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_1);
		}
		else if (outputSheetNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_3);
		}
		else {
			bindOutputSheetNo = true;

			query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_2);
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
			query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindOutputSheetNo) {
			qPos.add(outputSheetNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheets where mtCore = &#63; and outputSheetNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 */
	@Override
	public void removeByinputSheetNo(long mtCore, String outputSheetNo) {
		for (VROutputSheet vrOutputSheet : findByinputSheetNo(mtCore,
				outputSheetNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets where mtCore = &#63; and outputSheetNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetNo the output sheet no
	 * @return the number of matching vr output sheets
	 */
	@Override
	public int countByinputSheetNo(long mtCore, String outputSheetNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETNO;

		Object[] finderArgs = new Object[] { mtCore, outputSheetNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETNO_MTCORE_2);

			boolean bindOutputSheetNo = false;

			if (outputSheetNo == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_1);
			}
			else if (outputSheetNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_3);
			}
			else {
				bindOutputSheetNo = true;

				query.append(_FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindOutputSheetNo) {
					qPos.add(outputSheetNo);
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

	private static final String _FINDER_COLUMN_INPUTSHEETNO_MTCORE_2 = "vrOutputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_1 = "vrOutputSheet.outputSheetNo IS NULL";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_2 = "vrOutputSheet.outputSheetNo = ?";
	private static final String _FINDER_COLUMN_INPUTSHEETNO_OUTPUTSHEETNO_3 = "(vrOutputSheet.outputSheetNo IS NULL OR vrOutputSheet.outputSheetNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASERCORPORATIONID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBypurchaserCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASERCORPORATIONID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBypurchaserCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetModelImpl.PURCHASERCORPORATIONID_COLUMN_BITMASK |
			VROutputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PURCHASERCORPORATIONID = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBypurchaserCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @return the matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId) {
		return findBypurchaserCorporationId(mtCore, purchaserCorporationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId, int start, int end) {
		return findBypurchaserCorporationId(mtCore, purchaserCorporationId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return findBypurchaserCorporationId(mtCore, purchaserCorporationId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASERCORPORATIONID;
			finderArgs = new Object[] { mtCore, purchaserCorporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PURCHASERCORPORATIONID;
			finderArgs = new Object[] {
					mtCore, purchaserCorporationId,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheet vrOutputSheet : list) {
					if ((mtCore != vrOutputSheet.getMtCore()) ||
							(purchaserCorporationId != vrOutputSheet.getPurchaserCorporationId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_PURCHASERCORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(purchaserCorporationId);

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBypurchaserCorporationId_First(long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBypurchaserCorporationId_First(mtCore,
				purchaserCorporationId, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", purchaserCorporationId=");
		msg.append(purchaserCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBypurchaserCorporationId_First(long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		List<VROutputSheet> list = findBypurchaserCorporationId(mtCore,
				purchaserCorporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBypurchaserCorporationId_Last(long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBypurchaserCorporationId_Last(mtCore,
				purchaserCorporationId, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", purchaserCorporationId=");
		msg.append(purchaserCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBypurchaserCorporationId_Last(long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		int count = countBypurchaserCorporationId(mtCore, purchaserCorporationId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheet> list = findBypurchaserCorporationId(mtCore,
				purchaserCorporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet[] findBypurchaserCorporationId_PrevAndNext(long id,
		long mtCore, long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheet[] array = new VROutputSheetImpl[3];

			array[0] = getBypurchaserCorporationId_PrevAndNext(session,
					vrOutputSheet, mtCore, purchaserCorporationId,
					orderByComparator, true);

			array[1] = vrOutputSheet;

			array[2] = getBypurchaserCorporationId_PrevAndNext(session,
					vrOutputSheet, mtCore, purchaserCorporationId,
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

	protected VROutputSheet getBypurchaserCorporationId_PrevAndNext(
		Session session, VROutputSheet vrOutputSheet, long mtCore,
		long purchaserCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_PURCHASERCORPORATIONID_2);

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
			query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(purchaserCorporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 */
	@Override
	public void removeBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId) {
		for (VROutputSheet vrOutputSheet : findBypurchaserCorporationId(
				mtCore, purchaserCorporationId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets where mtCore = &#63; and purchaserCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param purchaserCorporationId the purchaser corporation ID
	 * @return the number of matching vr output sheets
	 */
	@Override
	public int countBypurchaserCorporationId(long mtCore,
		long purchaserCorporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PURCHASERCORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, purchaserCorporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_PURCHASERCORPORATIONID_PURCHASERCORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(purchaserCorporationId);

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

	private static final String _FINDER_COLUMN_PURCHASERCORPORATIONID_MTCORE_2 = "vrOutputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PURCHASERCORPORATIONID_PURCHASERCORPORATIONID_2 =
		"vrOutputSheet.purchaserCorporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBysupplierCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBysupplierCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetModelImpl.SUPPLIERCORPORATIONID_COLUMN_BITMASK |
			VROutputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUPPLIERCORPORATIONID = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBysupplierCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @return the matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		return findBysupplierCorporationId(mtCore, supplierCorporationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end) {
		return findBysupplierCorporationId(mtCore, supplierCorporationId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return findBysupplierCorporationId(mtCore, supplierCorporationId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBysupplierCorporationId(long mtCore,
		long supplierCorporationId, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID;
			finderArgs = new Object[] { mtCore, supplierCorporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID;
			finderArgs = new Object[] {
					mtCore, supplierCorporationId,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheet vrOutputSheet : list) {
					if ((mtCore != vrOutputSheet.getMtCore()) ||
							(supplierCorporationId != vrOutputSheet.getSupplierCorporationId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_SUPPLIERCORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(supplierCorporationId);

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBysupplierCorporationId_First(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBysupplierCorporationId_First(mtCore,
				supplierCorporationId, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", supplierCorporationId=");
		msg.append(supplierCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBysupplierCorporationId_First(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		List<VROutputSheet> list = findBysupplierCorporationId(mtCore,
				supplierCorporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBysupplierCorporationId_Last(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBysupplierCorporationId_Last(mtCore,
				supplierCorporationId, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", supplierCorporationId=");
		msg.append(supplierCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBysupplierCorporationId_Last(long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		int count = countBysupplierCorporationId(mtCore, supplierCorporationId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheet> list = findBysupplierCorporationId(mtCore,
				supplierCorporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet[] findBysupplierCorporationId_PrevAndNext(long id,
		long mtCore, long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheet[] array = new VROutputSheetImpl[3];

			array[0] = getBysupplierCorporationId_PrevAndNext(session,
					vrOutputSheet, mtCore, supplierCorporationId,
					orderByComparator, true);

			array[1] = vrOutputSheet;

			array[2] = getBysupplierCorporationId_PrevAndNext(session,
					vrOutputSheet, mtCore, supplierCorporationId,
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

	protected VROutputSheet getBysupplierCorporationId_PrevAndNext(
		Session session, VROutputSheet vrOutputSheet, long mtCore,
		long supplierCorporationId,
		OrderByComparator<VROutputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_SUPPLIERCORPORATIONID_2);

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
			query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(supplierCorporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheets where mtCore = &#63; and supplierCorporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 */
	@Override
	public void removeBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		for (VROutputSheet vrOutputSheet : findBysupplierCorporationId(mtCore,
				supplierCorporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets where mtCore = &#63; and supplierCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param supplierCorporationId the supplier corporation ID
	 * @return the number of matching vr output sheets
	 */
	@Override
	public int countBysupplierCorporationId(long mtCore,
		long supplierCorporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SUPPLIERCORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, supplierCorporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_SUPPLIERCORPORATIONID_SUPPLIERCORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(supplierCorporationId);

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

	private static final String _FINDER_COLUMN_SUPPLIERCORPORATIONID_MTCORE_2 = "vrOutputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_SUPPLIERCORPORATIONID_SUPPLIERCORPORATIONID_2 =
		"vrOutputSheet.supplierCorporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBydossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetModelImpl.DOSSIERID_COLUMN_BITMASK |
			VROutputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId) {
		return findBydossierId(mtCore, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId,
		int start, int end) {
		return findBydossierId(mtCore, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VROutputSheet> orderByComparator) {
		return findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { mtCore, dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					mtCore, dossierId,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheet vrOutputSheet : list) {
					if ((mtCore != vrOutputSheet.getMtCore()) ||
							(dossierId != vrOutputSheet.getDossierId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBydossierId_First(mtCore, dossierId,
				orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		List<VROutputSheet> list = findBydossierId(mtCore, dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchBydossierId_Last(mtCore, dossierId,
				orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator) {
		int count = countBydossierId(mtCore, dossierId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheet> list = findBydossierId(mtCore, dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheet[] array = new VROutputSheetImpl[3];

			array[0] = getBydossierId_PrevAndNext(session, vrOutputSheet,
					mtCore, dossierId, orderByComparator, true);

			array[1] = vrOutputSheet;

			array[2] = getBydossierId_PrevAndNext(session, vrOutputSheet,
					mtCore, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VROutputSheet getBydossierId_PrevAndNext(Session session,
		VROutputSheet vrOutputSheet, long mtCore, long dossierId,
		OrderByComparator<VROutputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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
			query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheets where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long mtCore, long dossierId) {
		for (VROutputSheet vrOutputSheet : findBydossierId(mtCore, dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr output sheets
	 */
	@Override
	public int countBydossierId(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrOutputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrOutputSheet.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETTYPE =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByoutputSheetType",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETTYPE =
		new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByoutputSheetType",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetModelImpl.OUTPUTSHEETTYPE_COLUMN_BITMASK |
			VROutputSheetModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETTYPE = new FinderPath(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByoutputSheetType",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @return the matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType) {
		return findByoutputSheetType(mtCore, outputSheetType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end) {
		return findByoutputSheetType(mtCore, outputSheetType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return findByoutputSheetType(mtCore, outputSheetType, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheets
	 */
	@Override
	public List<VROutputSheet> findByoutputSheetType(long mtCore,
		long outputSheetType, int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETTYPE;
			finderArgs = new Object[] { mtCore, outputSheetType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETTYPE;
			finderArgs = new Object[] {
					mtCore, outputSheetType,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheet vrOutputSheet : list) {
					if ((mtCore != vrOutputSheet.getMtCore()) ||
							(outputSheetType != vrOutputSheet.getOutputSheetType())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_OUTPUTSHEETTYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetType);

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findByoutputSheetType_First(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchByoutputSheetType_First(mtCore,
				outputSheetType, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetType=");
		msg.append(outputSheetType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchByoutputSheetType_First(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator) {
		List<VROutputSheet> list = findByoutputSheetType(mtCore,
				outputSheetType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet
	 * @throws NoSuchVROutputSheetException if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet findByoutputSheetType_Last(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchByoutputSheetType_Last(mtCore,
				outputSheetType, orderByComparator);

		if (vrOutputSheet != null) {
			return vrOutputSheet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetType=");
		msg.append(outputSheetType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet, or <code>null</code> if a matching vr output sheet could not be found
	 */
	@Override
	public VROutputSheet fetchByoutputSheetType_Last(long mtCore,
		long outputSheetType, OrderByComparator<VROutputSheet> orderByComparator) {
		int count = countByoutputSheetType(mtCore, outputSheetType);

		if (count == 0) {
			return null;
		}

		List<VROutputSheet> list = findByoutputSheetType(mtCore,
				outputSheetType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheets before and after the current vr output sheet in the ordered set where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet[] findByoutputSheetType_PrevAndNext(long id,
		long mtCore, long outputSheetType,
		OrderByComparator<VROutputSheet> orderByComparator)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheet[] array = new VROutputSheetImpl[3];

			array[0] = getByoutputSheetType_PrevAndNext(session, vrOutputSheet,
					mtCore, outputSheetType, orderByComparator, true);

			array[1] = vrOutputSheet;

			array[2] = getByoutputSheetType_PrevAndNext(session, vrOutputSheet,
					mtCore, outputSheetType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VROutputSheet getByoutputSheetType_PrevAndNext(Session session,
		VROutputSheet vrOutputSheet, long mtCore, long outputSheetType,
		OrderByComparator<VROutputSheet> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE);

		query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_OUTPUTSHEETTYPE_2);

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
			query.append(VROutputSheetModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(outputSheetType);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheets where mtCore = &#63; and outputSheetType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 */
	@Override
	public void removeByoutputSheetType(long mtCore, long outputSheetType) {
		for (VROutputSheet vrOutputSheet : findByoutputSheetType(mtCore,
				outputSheetType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets where mtCore = &#63; and outputSheetType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetType the output sheet type
	 * @return the number of matching vr output sheets
	 */
	@Override
	public int countByoutputSheetType(long mtCore, long outputSheetType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETTYPE;

		Object[] finderArgs = new Object[] { mtCore, outputSheetType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEET_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETTYPE_OUTPUTSHEETTYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetType);

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

	private static final String _FINDER_COLUMN_OUTPUTSHEETTYPE_MTCORE_2 = "vrOutputSheet.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETTYPE_OUTPUTSHEETTYPE_2 =
		"vrOutputSheet.outputSheetType = ?";

	public VROutputSheetPersistenceImpl() {
		setModelClass(VROutputSheet.class);
	}

	/**
	 * Caches the vr output sheet in the entity cache if it is enabled.
	 *
	 * @param vrOutputSheet the vr output sheet
	 */
	@Override
	public void cacheResult(VROutputSheet vrOutputSheet) {
		entityCache.putResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetImpl.class, vrOutputSheet.getPrimaryKey(),
			vrOutputSheet);

		vrOutputSheet.resetOriginalValues();
	}

	/**
	 * Caches the vr output sheets in the entity cache if it is enabled.
	 *
	 * @param vrOutputSheets the vr output sheets
	 */
	@Override
	public void cacheResult(List<VROutputSheet> vrOutputSheets) {
		for (VROutputSheet vrOutputSheet : vrOutputSheets) {
			if (entityCache.getResult(
						VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
						VROutputSheetImpl.class, vrOutputSheet.getPrimaryKey()) == null) {
				cacheResult(vrOutputSheet);
			}
			else {
				vrOutputSheet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr output sheets.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VROutputSheetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr output sheet.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VROutputSheet vrOutputSheet) {
		entityCache.removeResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetImpl.class, vrOutputSheet.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VROutputSheet> vrOutputSheets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VROutputSheet vrOutputSheet : vrOutputSheets) {
			entityCache.removeResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
				VROutputSheetImpl.class, vrOutputSheet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr output sheet with the primary key. Does not add the vr output sheet to the database.
	 *
	 * @param id the primary key for the new vr output sheet
	 * @return the new vr output sheet
	 */
	@Override
	public VROutputSheet create(long id) {
		VROutputSheet vrOutputSheet = new VROutputSheetImpl();

		vrOutputSheet.setNew(true);
		vrOutputSheet.setPrimaryKey(id);

		return vrOutputSheet;
	}

	/**
	 * Removes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr output sheet
	 * @return the vr output sheet that was removed
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet remove(long id) throws NoSuchVROutputSheetException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr output sheet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr output sheet
	 * @return the vr output sheet that was removed
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet remove(Serializable primaryKey)
		throws NoSuchVROutputSheetException {
		Session session = null;

		try {
			session = openSession();

			VROutputSheet vrOutputSheet = (VROutputSheet)session.get(VROutputSheetImpl.class,
					primaryKey);

			if (vrOutputSheet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVROutputSheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrOutputSheet);
		}
		catch (NoSuchVROutputSheetException nsee) {
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
	protected VROutputSheet removeImpl(VROutputSheet vrOutputSheet) {
		vrOutputSheet = toUnwrappedModel(vrOutputSheet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrOutputSheet)) {
				vrOutputSheet = (VROutputSheet)session.get(VROutputSheetImpl.class,
						vrOutputSheet.getPrimaryKeyObj());
			}

			if (vrOutputSheet != null) {
				session.delete(vrOutputSheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrOutputSheet != null) {
			clearCache(vrOutputSheet);
		}

		return vrOutputSheet;
	}

	@Override
	public VROutputSheet updateImpl(VROutputSheet vrOutputSheet) {
		vrOutputSheet = toUnwrappedModel(vrOutputSheet);

		boolean isNew = vrOutputSheet.isNew();

		VROutputSheetModelImpl vrOutputSheetModelImpl = (VROutputSheetModelImpl)vrOutputSheet;

		Session session = null;

		try {
			session = openSession();

			if (vrOutputSheet.isNew()) {
				session.save(vrOutputSheet);

				vrOutputSheet.setNew(false);
			}
			else {
				vrOutputSheet = (VROutputSheet)session.merge(vrOutputSheet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VROutputSheetModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrOutputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetModelImpl.getOriginalMtCore(),
						vrOutputSheetModelImpl.getOriginalOutputSheetNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO,
					args);

				args = new Object[] {
						vrOutputSheetModelImpl.getMtCore(),
						vrOutputSheetModelImpl.getOutputSheetNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETNO,
					args);
			}

			if ((vrOutputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASERCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetModelImpl.getOriginalMtCore(),
						vrOutputSheetModelImpl.getOriginalPurchaserCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PURCHASERCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASERCORPORATIONID,
					args);

				args = new Object[] {
						vrOutputSheetModelImpl.getMtCore(),
						vrOutputSheetModelImpl.getPurchaserCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PURCHASERCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PURCHASERCORPORATIONID,
					args);
			}

			if ((vrOutputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetModelImpl.getOriginalMtCore(),
						vrOutputSheetModelImpl.getOriginalSupplierCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUPPLIERCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID,
					args);

				args = new Object[] {
						vrOutputSheetModelImpl.getMtCore(),
						vrOutputSheetModelImpl.getSupplierCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUPPLIERCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUPPLIERCORPORATIONID,
					args);
			}

			if ((vrOutputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetModelImpl.getOriginalMtCore(),
						vrOutputSheetModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrOutputSheetModelImpl.getMtCore(),
						vrOutputSheetModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrOutputSheetModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetModelImpl.getOriginalMtCore(),
						vrOutputSheetModelImpl.getOriginalOutputSheetType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETTYPE,
					args);

				args = new Object[] {
						vrOutputSheetModelImpl.getMtCore(),
						vrOutputSheetModelImpl.getOutputSheetType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETTYPE,
					args);
			}
		}

		entityCache.putResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetImpl.class, vrOutputSheet.getPrimaryKey(),
			vrOutputSheet, false);

		vrOutputSheet.resetOriginalValues();

		return vrOutputSheet;
	}

	protected VROutputSheet toUnwrappedModel(VROutputSheet vrOutputSheet) {
		if (vrOutputSheet instanceof VROutputSheetImpl) {
			return vrOutputSheet;
		}

		VROutputSheetImpl vrOutputSheetImpl = new VROutputSheetImpl();

		vrOutputSheetImpl.setNew(vrOutputSheet.isNew());
		vrOutputSheetImpl.setPrimaryKey(vrOutputSheet.getPrimaryKey());

		vrOutputSheetImpl.setId(vrOutputSheet.getId());
		vrOutputSheetImpl.setMtCore(vrOutputSheet.getMtCore());
		vrOutputSheetImpl.setOutputSheetNo(vrOutputSheet.getOutputSheetNo());
		vrOutputSheetImpl.setOutputSheetDate(vrOutputSheet.getOutputSheetDate());
		vrOutputSheetImpl.setOriginalDocumentNo(vrOutputSheet.getOriginalDocumentNo());
		vrOutputSheetImpl.setSupplierCorporationId(vrOutputSheet.getSupplierCorporationId());
		vrOutputSheetImpl.setOutputSheetType(vrOutputSheet.getOutputSheetType());
		vrOutputSheetImpl.setMaker(vrOutputSheet.getMaker());
		vrOutputSheetImpl.setChecker(vrOutputSheet.getChecker());
		vrOutputSheetImpl.setApprover(vrOutputSheet.getApprover());
		vrOutputSheetImpl.setReceiverName(vrOutputSheet.getReceiverName());
		vrOutputSheetImpl.setReceiverPlace(vrOutputSheet.getReceiverPlace());
		vrOutputSheetImpl.setReceiverRequest(vrOutputSheet.getReceiverRequest());
		vrOutputSheetImpl.setInventoryName(vrOutputSheet.getInventoryName());
		vrOutputSheetImpl.setInventoryPlace(vrOutputSheet.getInventoryPlace());
		vrOutputSheetImpl.setInventoryDate(vrOutputSheet.getInventoryDate());
		vrOutputSheetImpl.setDossierId(vrOutputSheet.getDossierId());
		vrOutputSheetImpl.setIssueId(vrOutputSheet.getIssueId());
		vrOutputSheetImpl.setPurchaserId(vrOutputSheet.getPurchaserId());
		vrOutputSheetImpl.setPurchaserCorporationId(vrOutputSheet.getPurchaserCorporationId());
		vrOutputSheetImpl.setBookIDList(vrOutputSheet.getBookIDList());
		vrOutputSheetImpl.setIsApproval(vrOutputSheet.getIsApproval());
		vrOutputSheetImpl.setTotalQuantities(vrOutputSheet.getTotalQuantities());
		vrOutputSheetImpl.setTotalAmount(vrOutputSheet.getTotalAmount());
		vrOutputSheetImpl.setAmountInWords(vrOutputSheet.getAmountInWords());
		vrOutputSheetImpl.setRemark(vrOutputSheet.getRemark());
		vrOutputSheetImpl.setModifyDate(vrOutputSheet.getModifyDate());
		vrOutputSheetImpl.setSyncDate(vrOutputSheet.getSyncDate());

		return vrOutputSheetImpl;
	}

	/**
	 * Returns the vr output sheet with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr output sheet
	 * @return the vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVROutputSheetException {
		VROutputSheet vrOutputSheet = fetchByPrimaryKey(primaryKey);

		if (vrOutputSheet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVROutputSheetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrOutputSheet;
	}

	/**
	 * Returns the vr output sheet with the primary key or throws a {@link NoSuchVROutputSheetException} if it could not be found.
	 *
	 * @param id the primary key of the vr output sheet
	 * @return the vr output sheet
	 * @throws NoSuchVROutputSheetException if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet findByPrimaryKey(long id)
		throws NoSuchVROutputSheetException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr output sheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr output sheet
	 * @return the vr output sheet, or <code>null</code> if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
				VROutputSheetImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VROutputSheet vrOutputSheet = (VROutputSheet)serializable;

		if (vrOutputSheet == null) {
			Session session = null;

			try {
				session = openSession();

				vrOutputSheet = (VROutputSheet)session.get(VROutputSheetImpl.class,
						primaryKey);

				if (vrOutputSheet != null) {
					cacheResult(vrOutputSheet);
				}
				else {
					entityCache.putResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
						VROutputSheetImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrOutputSheet;
	}

	/**
	 * Returns the vr output sheet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr output sheet
	 * @return the vr output sheet, or <code>null</code> if a vr output sheet with the primary key could not be found
	 */
	@Override
	public VROutputSheet fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VROutputSheet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VROutputSheet> map = new HashMap<Serializable, VROutputSheet>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VROutputSheet vrOutputSheet = fetchByPrimaryKey(primaryKey);

			if (vrOutputSheet != null) {
				map.put(primaryKey, vrOutputSheet);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VROutputSheet)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VROUTPUTSHEET_WHERE_PKS_IN);

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

			for (VROutputSheet vrOutputSheet : (List<VROutputSheet>)q.list()) {
				map.put(vrOutputSheet.getPrimaryKeyObj(), vrOutputSheet);

				cacheResult(vrOutputSheet);

				uncachedPrimaryKeys.remove(vrOutputSheet.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VROutputSheetModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr output sheets.
	 *
	 * @return the vr output sheets
	 */
	@Override
	public List<VROutputSheet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @return the range of vr output sheets
	 */
	@Override
	public List<VROutputSheet> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr output sheets
	 */
	@Override
	public List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheets
	 * @param end the upper bound of the range of vr output sheets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr output sheets
	 */
	@Override
	public List<VROutputSheet> findAll(int start, int end,
		OrderByComparator<VROutputSheet> orderByComparator,
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

		List<VROutputSheet> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheet>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VROUTPUTSHEET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VROUTPUTSHEET;

				if (pagination) {
					sql = sql.concat(VROutputSheetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheet>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr output sheets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VROutputSheet vrOutputSheet : findAll()) {
			remove(vrOutputSheet);
		}
	}

	/**
	 * Returns the number of vr output sheets.
	 *
	 * @return the number of vr output sheets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VROUTPUTSHEET);

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
		return VROutputSheetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr output sheet persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VROutputSheetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VROUTPUTSHEET = "SELECT vrOutputSheet FROM VROutputSheet vrOutputSheet";
	private static final String _SQL_SELECT_VROUTPUTSHEET_WHERE_PKS_IN = "SELECT vrOutputSheet FROM VROutputSheet vrOutputSheet WHERE id IN (";
	private static final String _SQL_SELECT_VROUTPUTSHEET_WHERE = "SELECT vrOutputSheet FROM VROutputSheet vrOutputSheet WHERE ";
	private static final String _SQL_COUNT_VROUTPUTSHEET = "SELECT COUNT(vrOutputSheet) FROM VROutputSheet vrOutputSheet";
	private static final String _SQL_COUNT_VROUTPUTSHEET_WHERE = "SELECT COUNT(vrOutputSheet) FROM VROutputSheet vrOutputSheet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrOutputSheet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VROutputSheet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VROutputSheet exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VROutputSheetPersistenceImpl.class);
}