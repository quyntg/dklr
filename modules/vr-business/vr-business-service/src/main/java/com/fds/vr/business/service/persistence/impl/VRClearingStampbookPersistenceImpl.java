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

import com.fds.vr.business.exception.NoSuchVRClearingStampbookException;
import com.fds.vr.business.model.VRClearingStampbook;
import com.fds.vr.business.model.impl.VRClearingStampbookImpl;
import com.fds.vr.business.model.impl.VRClearingStampbookModelImpl;
import com.fds.vr.business.service.persistence.VRClearingStampbookPersistence;

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
 * The persistence implementation for the vr clearing stampbook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRClearingStampbookPersistence
 * @see com.fds.vr.business.service.persistence.VRClearingStampbookUtil
 * @generated
 */
@ProviderType
public class VRClearingStampbookPersistenceImpl extends BasePersistenceImpl<VRClearingStampbook>
	implements VRClearingStampbookPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRClearingStampbookUtil} to access the vr clearing stampbook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRClearingStampbookImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return findByInputSheetId(mtCore, inputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return findByInputSheetId(mtCore, inputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] { mtCore, inputSheetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID;
			finderArgs = new Object[] {
					mtCore, inputSheetId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(inputSheetId != vrClearingStampbook.getInputSheetId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetId_First(mtCore,
				inputSheetId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByInputSheetId(mtCore,
				inputSheetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetId_Last(mtCore,
				inputSheetId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByInputSheetId(mtCore, inputSheetId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByInputSheetId(mtCore,
				inputSheetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByInputSheetId_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByInputSheetId_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId,
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

	protected VRClearingStampbook getByInputSheetId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long inputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 */
	@Override
	public void removeByInputSheetId(long mtCore, long inputSheetId) {
		for (VRClearingStampbook vrClearingStampbook : findByInputSheetId(
				mtCore, inputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByInputSheetId(long mtCore, long inputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2 = "vrClearingStampbook.inputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] { mtCore, inputSheetId, bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] {
					mtCore, inputSheetId, bookId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(inputSheetId != vrClearingStampbook.getInputSheetId()) ||
							(bookId != vrClearingStampbook.getBookId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetIdAndBookId_First(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetIdAndBookId_Last(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId, bookId,
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

	protected VRClearingStampbook getByInputSheetIdAndBookId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
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

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		for (VRClearingStampbook vrClearingStampbook : findByInputSheetIdAndBookId(
				mtCore, inputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2 =
		"vrClearingStampbook.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2 = "vrClearingStampbook.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOutputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOutputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOutputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId) {
		return findByOutputSheetId(mtCore, outputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end) {
		return findByOutputSheetId(mtCore, outputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID;
			finderArgs = new Object[] { mtCore, outputSheetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETID;
			finderArgs = new Object[] {
					mtCore, outputSheetId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(outputSheetId != vrClearingStampbook.getOutputSheetId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetId_First(mtCore,
				outputSheetId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByOutputSheetId(mtCore,
				outputSheetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetId_Last(mtCore,
				outputSheetId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByOutputSheetId(mtCore, outputSheetId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByOutputSheetId(mtCore,
				outputSheetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByOutputSheetId_PrevAndNext(long id,
		long mtCore, long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByOutputSheetId_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByOutputSheetId_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId,
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

	protected VRClearingStampbook getByOutputSheetId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long outputSheetId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(outputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 */
	@Override
	public void removeByOutputSheetId(long mtCore, long outputSheetId) {
		for (VRClearingStampbook vrClearingStampbook : findByOutputSheetId(
				mtCore, outputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByOutputSheetId(long mtCore, long outputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, outputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

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

	private static final String _FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2 = "vrClearingStampbook.outputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId, int start, int end) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookId(long mtCore,
		long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] { mtCore, outputSheetId, bookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID;
			finderArgs = new Object[] {
					mtCore, outputSheetId, bookId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(outputSheetId != vrClearingStampbook.getOutputSheetId()) ||
							(bookId != vrClearingStampbook.getBookId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

				qPos.add(bookId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetIdAndBookId_First(long mtCore,
		long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetIdAndBookId_First(mtCore,
				outputSheetId, bookId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByOutputSheetIdAndBookId(mtCore,
				outputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetIdAndBookId_Last(mtCore,
				outputSheetId, bookId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByOutputSheetIdAndBookId(mtCore,
				outputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByOutputSheetIdAndBookId_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByOutputSheetIdAndBookId_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId, bookId,
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

	protected VRClearingStampbook getByOutputSheetIdAndBookId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long outputSheetId, long bookId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
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

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(outputSheetId);

		qPos.add(bookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId) {
		for (VRClearingStampbook vrClearingStampbook : findByOutputSheetIdAndBookId(
				mtCore, outputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, outputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

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

	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2 =
		"vrClearingStampbook.outputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2 = "vrClearingStampbook.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.STAMPTYPE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] { mtCore, inputSheetId, bookId, stampType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] {
					mtCore, inputSheetId, bookId, stampType,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(inputSheetId != vrClearingStampbook.getInputSheetId()) ||
							(bookId != vrClearingStampbook.getBookId()) ||
							!Objects.equals(stampType,
								vrClearingStampbook.getStampType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
				}

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId, bookId,
					stampType, orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrClearingStampbook, mtCore, inputSheetId, bookId,
					stampType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRClearingStampbook getByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long inputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

		query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

		boolean bindStampType = false;

		if (stampType == null) {
			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
		}
		else if (stampType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
		}
		else {
			bindStampType = true;

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		qPos.add(bookId);

		if (bindStampType) {
			qPos.add(stampType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 */
	@Override
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, String stampType) {
		for (VRClearingStampbook vrClearingStampbook : findByInputSheetIdAndBookIdAndStampType(
				mtCore, inputSheetId, bookId, stampType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, String stampType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE;

		Object[] finderArgs = new Object[] {
				mtCore, inputSheetId, bookId, stampType
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(inputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2 =
		"vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2 =
		"vrClearingStampbook.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2 =
		"vrClearingStampbook.bookId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1 =
		"vrClearingStampbook.stampType IS NULL";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2 =
		"vrClearingStampbook.stampType = ?";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3 =
		"(vrClearingStampbook.stampType IS NULL OR vrClearingStampbook.stampType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.BOOKID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.STAMPTYPE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] { mtCore, outputSheetId, bookId, stampType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE;
			finderArgs = new Object[] {
					mtCore, outputSheetId, bookId, stampType,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(outputSheetId != vrClearingStampbook.getOutputSheetId()) ||
							(bookId != vrClearingStampbook.getBookId()) ||
							!Objects.equals(stampType,
								vrClearingStampbook.getStampType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_OUTPUTSHEETID_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
				}

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetIdAndBookIdAndStampType_First(mtCore,
				outputSheetId, bookId, stampType, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
				outputSheetId, bookId, stampType, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(", bookId=");
		msg.append(bookId);

		msg.append(", stampType=");
		msg.append(stampType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId, bookId,
					stampType, orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrClearingStampbook, mtCore, outputSheetId, bookId,
					stampType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRClearingStampbook getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long outputSheetId, long bookId, String stampType,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_OUTPUTSHEETID_2);

		query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

		boolean bindStampType = false;

		if (stampType == null) {
			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
		}
		else if (stampType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
		}
		else {
			bindStampType = true;

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(outputSheetId);

		qPos.add(bookId);

		if (bindStampType) {
			qPos.add(stampType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 */
	@Override
	public void removeByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, String stampType) {
		for (VRClearingStampbook vrClearingStampbook : findByOutputSheetIdAndBookIdAndStampType(
				mtCore, outputSheetId, bookId, stampType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, String stampType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE;

		Object[] finderArgs = new Object[] {
				mtCore, outputSheetId, bookId, stampType
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_OUTPUTSHEETID_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2);

			boolean bindStampType = false;

			if (stampType == null) {
				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1);
			}
			else if (stampType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3);
			}
			else {
				bindStampType = true;

				query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(outputSheetId);

				qPos.add(bookId);

				if (bindStampType) {
					qPos.add(stampType);
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

	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_MTCORE_2 =
		"vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_OUTPUTSHEETID_2 =
		"vrClearingStampbook.outputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2 =
		"vrClearingStampbook.bookId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1 =
		"vrClearingStampbook.stampType IS NULL";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2 =
		"vrClearingStampbook.stampType = ?";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3 =
		"(vrClearingStampbook.stampType IS NULL OR vrClearingStampbook.stampType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId) {
		return findBycertificateId(mtCore, certificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return findBycertificateId(mtCore, certificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] { mtCore, certificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID;
			finderArgs = new Object[] {
					mtCore, certificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(certificateId != vrClearingStampbook.getCertificateId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(certificateId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBycertificateId_First(mtCore,
				certificateId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findBycertificateId(mtCore,
				certificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBycertificateId_Last(mtCore,
				certificateId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countBycertificateId(mtCore, certificateId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findBycertificateId(mtCore,
				certificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session,
					vrClearingStampbook, mtCore, certificateId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getBycertificateId_PrevAndNext(session,
					vrClearingStampbook, mtCore, certificateId,
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

	protected VRClearingStampbook getBycertificateId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long certificateId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

		query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and certificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long mtCore, long certificateId) {
		for (VRClearingStampbook vrClearingStampbook : findBycertificateId(
				mtCore, certificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countBycertificateId(long mtCore, long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(certificateId);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrClearingStampbook.certificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateNumber",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() },
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.CERTIFICATENUMBER_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATENUMBER = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateNumber(long mtCore,
		String certificateNumber) {
		return findBycertificateNumber(mtCore, certificateNumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER;
			finderArgs = new Object[] { mtCore, certificateNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATENUMBER;
			finderArgs = new Object[] {
					mtCore, certificateNumber,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							!Objects.equals(certificateNumber,
								vrClearingStampbook.getCertificateNumber())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
				}

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBycertificateNumber_First(mtCore,
				certificateNumber, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findBycertificateNumber(mtCore,
				certificateNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBycertificateNumber_Last(mtCore,
				certificateNumber, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countBycertificateNumber(mtCore, certificateNumber);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findBycertificateNumber(mtCore,
				certificateNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findBycertificateNumber_PrevAndNext(long id,
		long mtCore, String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getBycertificateNumber_PrevAndNext(session,
					vrClearingStampbook, mtCore, certificateNumber,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getBycertificateNumber_PrevAndNext(session,
					vrClearingStampbook, mtCore, certificateNumber,
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

	protected VRClearingStampbook getBycertificateNumber_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		String certificateNumber,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

		boolean bindCertificateNumber = false;

		if (certificateNumber == null) {
			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
		}
		else if (certificateNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
		}
		else {
			bindCertificateNumber = true;

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCertificateNumber) {
			qPos.add(certificateNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 */
	@Override
	public void removeBycertificateNumber(long mtCore, String certificateNumber) {
		for (VRClearingStampbook vrClearingStampbook : findBycertificateNumber(
				mtCore, certificateNumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countBycertificateNumber(long mtCore, String certificateNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATENUMBER;

		Object[] finderArgs = new Object[] { mtCore, certificateNumber };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
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

	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1 =
		"vrClearingStampbook.certificateNumber IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2 =
		"vrClearingStampbook.certificateNumber = ?";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3 =
		"(vrClearingStampbook.certificateNumber IS NULL OR vrClearingStampbook.certificateNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydebitNoteId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID =
		new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED,
			VRClearingStampbookImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydebitNoteId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRClearingStampbookModelImpl.MTCORE_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.DEBITNOTEID_COLUMN_BITMASK |
			VRClearingStampbookModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEBITNOTEID = new FinderPath(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydebitNoteId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @return the matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId) {
		return findBydebitNoteId(mtCore, debitNoteId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end) {
		return findBydebitNoteId(mtCore, debitNoteId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findBydebitNoteId(mtCore, debitNoteId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findBydebitNoteId(long mtCore,
		long debitNoteId, int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID;
			finderArgs = new Object[] { mtCore, debitNoteId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEBITNOTEID;
			finderArgs = new Object[] {
					mtCore, debitNoteId,
					
					start, end, orderByComparator
				};
		}

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRClearingStampbook vrClearingStampbook : list) {
					if ((mtCore != vrClearingStampbook.getMtCore()) ||
							(debitNoteId != vrClearingStampbook.getDebitNoteId())) {
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

			query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTEID_MTCORE_2);

			query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(debitNoteId);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBydebitNoteId_First(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBydebitNoteId_First(mtCore,
				debitNoteId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the first vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBydebitNoteId_First(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		List<VRClearingStampbook> list = findBydebitNoteId(mtCore, debitNoteId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook findBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchBydebitNoteId_Last(mtCore,
				debitNoteId, orderByComparator);

		if (vrClearingStampbook != null) {
			return vrClearingStampbook;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", debitNoteId=");
		msg.append(debitNoteId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRClearingStampbookException(msg.toString());
	}

	/**
	 * Returns the last vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr clearing stampbook, or <code>null</code> if a matching vr clearing stampbook could not be found
	 */
	@Override
	public VRClearingStampbook fetchBydebitNoteId_Last(long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		int count = countBydebitNoteId(mtCore, debitNoteId);

		if (count == 0) {
			return null;
		}

		List<VRClearingStampbook> list = findBydebitNoteId(mtCore, debitNoteId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr clearing stampbooks before and after the current vr clearing stampbook in the ordered set where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param id the primary key of the current vr clearing stampbook
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook[] findBydebitNoteId_PrevAndNext(long id,
		long mtCore, long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook[] array = new VRClearingStampbookImpl[3];

			array[0] = getBydebitNoteId_PrevAndNext(session,
					vrClearingStampbook, mtCore, debitNoteId,
					orderByComparator, true);

			array[1] = vrClearingStampbook;

			array[2] = getBydebitNoteId_PrevAndNext(session,
					vrClearingStampbook, mtCore, debitNoteId,
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

	protected VRClearingStampbook getBydebitNoteId_PrevAndNext(
		Session session, VRClearingStampbook vrClearingStampbook, long mtCore,
		long debitNoteId,
		OrderByComparator<VRClearingStampbook> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE);

		query.append(_FINDER_COLUMN_DEBITNOTEID_MTCORE_2);

		query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

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
			query.append(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(debitNoteId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrClearingStampbook);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRClearingStampbook> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 */
	@Override
	public void removeBydebitNoteId(long mtCore, long debitNoteId) {
		for (VRClearingStampbook vrClearingStampbook : findBydebitNoteId(
				mtCore, debitNoteId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks where mtCore = &#63; and debitNoteId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param debitNoteId the debit note ID
	 * @return the number of matching vr clearing stampbooks
	 */
	@Override
	public int countBydebitNoteId(long mtCore, long debitNoteId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEBITNOTEID;

		Object[] finderArgs = new Object[] { mtCore, debitNoteId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE);

			query.append(_FINDER_COLUMN_DEBITNOTEID_MTCORE_2);

			query.append(_FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(debitNoteId);

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

	private static final String _FINDER_COLUMN_DEBITNOTEID_MTCORE_2 = "vrClearingStampbook.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DEBITNOTEID_DEBITNOTEID_2 = "vrClearingStampbook.debitNoteId = ?";

	public VRClearingStampbookPersistenceImpl() {
		setModelClass(VRClearingStampbook.class);
	}

	/**
	 * Caches the vr clearing stampbook in the entity cache if it is enabled.
	 *
	 * @param vrClearingStampbook the vr clearing stampbook
	 */
	@Override
	public void cacheResult(VRClearingStampbook vrClearingStampbook) {
		entityCache.putResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookImpl.class, vrClearingStampbook.getPrimaryKey(),
			vrClearingStampbook);

		vrClearingStampbook.resetOriginalValues();
	}

	/**
	 * Caches the vr clearing stampbooks in the entity cache if it is enabled.
	 *
	 * @param vrClearingStampbooks the vr clearing stampbooks
	 */
	@Override
	public void cacheResult(List<VRClearingStampbook> vrClearingStampbooks) {
		for (VRClearingStampbook vrClearingStampbook : vrClearingStampbooks) {
			if (entityCache.getResult(
						VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
						VRClearingStampbookImpl.class,
						vrClearingStampbook.getPrimaryKey()) == null) {
				cacheResult(vrClearingStampbook);
			}
			else {
				vrClearingStampbook.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr clearing stampbooks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRClearingStampbookImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr clearing stampbook.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRClearingStampbook vrClearingStampbook) {
		entityCache.removeResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookImpl.class, vrClearingStampbook.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRClearingStampbook> vrClearingStampbooks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRClearingStampbook vrClearingStampbook : vrClearingStampbooks) {
			entityCache.removeResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
				VRClearingStampbookImpl.class,
				vrClearingStampbook.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr clearing stampbook with the primary key. Does not add the vr clearing stampbook to the database.
	 *
	 * @param id the primary key for the new vr clearing stampbook
	 * @return the new vr clearing stampbook
	 */
	@Override
	public VRClearingStampbook create(long id) {
		VRClearingStampbook vrClearingStampbook = new VRClearingStampbookImpl();

		vrClearingStampbook.setNew(true);
		vrClearingStampbook.setPrimaryKey(id);

		return vrClearingStampbook;
	}

	/**
	 * Removes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook that was removed
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook remove(long id)
		throws NoSuchVRClearingStampbookException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr clearing stampbook with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook that was removed
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook remove(Serializable primaryKey)
		throws NoSuchVRClearingStampbookException {
		Session session = null;

		try {
			session = openSession();

			VRClearingStampbook vrClearingStampbook = (VRClearingStampbook)session.get(VRClearingStampbookImpl.class,
					primaryKey);

			if (vrClearingStampbook == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRClearingStampbookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrClearingStampbook);
		}
		catch (NoSuchVRClearingStampbookException nsee) {
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
	protected VRClearingStampbook removeImpl(
		VRClearingStampbook vrClearingStampbook) {
		vrClearingStampbook = toUnwrappedModel(vrClearingStampbook);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrClearingStampbook)) {
				vrClearingStampbook = (VRClearingStampbook)session.get(VRClearingStampbookImpl.class,
						vrClearingStampbook.getPrimaryKeyObj());
			}

			if (vrClearingStampbook != null) {
				session.delete(vrClearingStampbook);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrClearingStampbook != null) {
			clearCache(vrClearingStampbook);
		}

		return vrClearingStampbook;
	}

	@Override
	public VRClearingStampbook updateImpl(
		VRClearingStampbook vrClearingStampbook) {
		vrClearingStampbook = toUnwrappedModel(vrClearingStampbook);

		boolean isNew = vrClearingStampbook.isNew();

		VRClearingStampbookModelImpl vrClearingStampbookModelImpl = (VRClearingStampbookModelImpl)vrClearingStampbook;

		Session session = null;

		try {
			session = openSession();

			if (vrClearingStampbook.isNew()) {
				session.save(vrClearingStampbook);

				vrClearingStampbook.setNew(false);
			}
			else {
				vrClearingStampbook = (VRClearingStampbook)session.merge(vrClearingStampbook);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRClearingStampbookModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalInputSheetId(),
						vrClearingStampbookModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getInputSheetId(),
						vrClearingStampbookModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalOutputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getOutputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalOutputSheetId(),
						vrClearingStampbookModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getOutputSheetId(),
						vrClearingStampbookModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalInputSheetId(),
						vrClearingStampbookModelImpl.getOriginalBookId(),
						vrClearingStampbookModelImpl.getOriginalStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getInputSheetId(),
						vrClearingStampbookModelImpl.getBookId(),
						vrClearingStampbookModelImpl.getStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalOutputSheetId(),
						vrClearingStampbookModelImpl.getOriginalBookId(),
						vrClearingStampbookModelImpl.getOriginalStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getOutputSheetId(),
						vrClearingStampbookModelImpl.getBookId(),
						vrClearingStampbookModelImpl.getStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);
			}

			if ((vrClearingStampbookModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrClearingStampbookModelImpl.getOriginalMtCore(),
						vrClearingStampbookModelImpl.getOriginalDebitNoteId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);

				args = new Object[] {
						vrClearingStampbookModelImpl.getMtCore(),
						vrClearingStampbookModelImpl.getDebitNoteId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DEBITNOTEID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEBITNOTEID,
					args);
			}
		}

		entityCache.putResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
			VRClearingStampbookImpl.class, vrClearingStampbook.getPrimaryKey(),
			vrClearingStampbook, false);

		vrClearingStampbook.resetOriginalValues();

		return vrClearingStampbook;
	}

	protected VRClearingStampbook toUnwrappedModel(
		VRClearingStampbook vrClearingStampbook) {
		if (vrClearingStampbook instanceof VRClearingStampbookImpl) {
			return vrClearingStampbook;
		}

		VRClearingStampbookImpl vrClearingStampbookImpl = new VRClearingStampbookImpl();

		vrClearingStampbookImpl.setNew(vrClearingStampbook.isNew());
		vrClearingStampbookImpl.setPrimaryKey(vrClearingStampbook.getPrimaryKey());

		vrClearingStampbookImpl.setId(vrClearingStampbook.getId());
		vrClearingStampbookImpl.setMtCore(vrClearingStampbook.getMtCore());
		vrClearingStampbookImpl.setDebitNoteId(vrClearingStampbook.getDebitNoteId());
		vrClearingStampbookImpl.setInputSheetId(vrClearingStampbook.getInputSheetId());
		vrClearingStampbookImpl.setOutputSheetId(vrClearingStampbook.getOutputSheetId());
		vrClearingStampbookImpl.setBookId(vrClearingStampbook.getBookId());
		vrClearingStampbookImpl.setCertificateId(vrClearingStampbook.getCertificateId());
		vrClearingStampbookImpl.setCertificateNumber(vrClearingStampbook.getCertificateNumber());
		vrClearingStampbookImpl.setCertificateDate(vrClearingStampbook.getCertificateDate());
		vrClearingStampbookImpl.setVehicleClass(vrClearingStampbook.getVehicleClass());
		vrClearingStampbookImpl.setStampType(vrClearingStampbook.getStampType());
		vrClearingStampbookImpl.setStampShortNo(vrClearingStampbook.getStampShortNo());
		vrClearingStampbookImpl.setSerialStartNo(vrClearingStampbook.getSerialStartNo());
		vrClearingStampbookImpl.setSerialEndNo(vrClearingStampbook.getSerialEndNo());
		vrClearingStampbookImpl.setSubTotalInDocument(vrClearingStampbook.getSubTotalInDocument());
		vrClearingStampbookImpl.setSubTotalQuantities(vrClearingStampbook.getSubTotalQuantities());
		vrClearingStampbookImpl.setVehiclePrice(vrClearingStampbook.getVehiclePrice());
		vrClearingStampbookImpl.setUnitPrice(vrClearingStampbook.getUnitPrice());
		vrClearingStampbookImpl.setTotalAmount(vrClearingStampbook.getTotalAmount());
		vrClearingStampbookImpl.setTotalInUse(vrClearingStampbook.getTotalInUse());
		vrClearingStampbookImpl.setTotalNotUsed(vrClearingStampbook.getTotalNotUsed());
		vrClearingStampbookImpl.setTotalLost(vrClearingStampbook.getTotalLost());
		vrClearingStampbookImpl.setTotalCancelled(vrClearingStampbook.getTotalCancelled());
		vrClearingStampbookImpl.setTotalReturned(vrClearingStampbook.getTotalReturned());
		vrClearingStampbookImpl.setRemark(vrClearingStampbook.getRemark());
		vrClearingStampbookImpl.setModifyDate(vrClearingStampbook.getModifyDate());
		vrClearingStampbookImpl.setSyncDate(vrClearingStampbook.getSyncDate());

		return vrClearingStampbookImpl;
	}

	/**
	 * Returns the vr clearing stampbook with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRClearingStampbookException {
		VRClearingStampbook vrClearingStampbook = fetchByPrimaryKey(primaryKey);

		if (vrClearingStampbook == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRClearingStampbookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrClearingStampbook;
	}

	/**
	 * Returns the vr clearing stampbook with the primary key or throws a {@link NoSuchVRClearingStampbookException} if it could not be found.
	 *
	 * @param id the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook
	 * @throws NoSuchVRClearingStampbookException if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook findByPrimaryKey(long id)
		throws NoSuchVRClearingStampbookException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr clearing stampbook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook, or <code>null</code> if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
				VRClearingStampbookImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRClearingStampbook vrClearingStampbook = (VRClearingStampbook)serializable;

		if (vrClearingStampbook == null) {
			Session session = null;

			try {
				session = openSession();

				vrClearingStampbook = (VRClearingStampbook)session.get(VRClearingStampbookImpl.class,
						primaryKey);

				if (vrClearingStampbook != null) {
					cacheResult(vrClearingStampbook);
				}
				else {
					entityCache.putResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
						VRClearingStampbookImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRClearingStampbookImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrClearingStampbook;
	}

	/**
	 * Returns the vr clearing stampbook with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr clearing stampbook
	 * @return the vr clearing stampbook, or <code>null</code> if a vr clearing stampbook with the primary key could not be found
	 */
	@Override
	public VRClearingStampbook fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRClearingStampbook> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRClearingStampbook> map = new HashMap<Serializable, VRClearingStampbook>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRClearingStampbook vrClearingStampbook = fetchByPrimaryKey(primaryKey);

			if (vrClearingStampbook != null) {
				map.put(primaryKey, vrClearingStampbook);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRClearingStampbookImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRClearingStampbook)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE_PKS_IN);

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

			for (VRClearingStampbook vrClearingStampbook : (List<VRClearingStampbook>)q.list()) {
				map.put(vrClearingStampbook.getPrimaryKeyObj(),
					vrClearingStampbook);

				cacheResult(vrClearingStampbook);

				uncachedPrimaryKeys.remove(vrClearingStampbook.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRClearingStampbookModelImpl.ENTITY_CACHE_ENABLED,
					VRClearingStampbookImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr clearing stampbooks.
	 *
	 * @return the vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr clearing stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @return the range of vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findAll(int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr clearing stampbooks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRClearingStampbookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr clearing stampbooks
	 * @param end the upper bound of the range of vr clearing stampbooks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr clearing stampbooks
	 */
	@Override
	public List<VRClearingStampbook> findAll(int start, int end,
		OrderByComparator<VRClearingStampbook> orderByComparator,
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

		List<VRClearingStampbook> list = null;

		if (retrieveFromCache) {
			list = (List<VRClearingStampbook>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCLEARINGSTAMPBOOK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCLEARINGSTAMPBOOK;

				if (pagination) {
					sql = sql.concat(VRClearingStampbookModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRClearingStampbook>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the vr clearing stampbooks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRClearingStampbook vrClearingStampbook : findAll()) {
			remove(vrClearingStampbook);
		}
	}

	/**
	 * Returns the number of vr clearing stampbooks.
	 *
	 * @return the number of vr clearing stampbooks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCLEARINGSTAMPBOOK);

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
		return VRClearingStampbookModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr clearing stampbook persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRClearingStampbookImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCLEARINGSTAMPBOOK = "SELECT vrClearingStampbook FROM VRClearingStampbook vrClearingStampbook";
	private static final String _SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE_PKS_IN = "SELECT vrClearingStampbook FROM VRClearingStampbook vrClearingStampbook WHERE id IN (";
	private static final String _SQL_SELECT_VRCLEARINGSTAMPBOOK_WHERE = "SELECT vrClearingStampbook FROM VRClearingStampbook vrClearingStampbook WHERE ";
	private static final String _SQL_COUNT_VRCLEARINGSTAMPBOOK = "SELECT COUNT(vrClearingStampbook) FROM VRClearingStampbook vrClearingStampbook";
	private static final String _SQL_COUNT_VRCLEARINGSTAMPBOOK_WHERE = "SELECT COUNT(vrClearingStampbook) FROM VRClearingStampbook vrClearingStampbook WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrClearingStampbook.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRClearingStampbook exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRClearingStampbook exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRClearingStampbookPersistenceImpl.class);
}