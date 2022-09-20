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

import com.fds.vr.business.exception.NoSuchVROutputSheetDetailsException;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.model.impl.VROutputSheetDetailsImpl;
import com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl;
import com.fds.vr.business.service.persistence.VROutputSheetDetailsPersistence;

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
 * The persistence implementation for the vr output sheet details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VROutputSheetDetailsPersistence
 * @see com.fds.vr.business.service.persistence.VROutputSheetDetailsUtil
 * @generated
 */
@ProviderType
public class VROutputSheetDetailsPersistenceImpl extends BasePersistenceImpl<VROutputSheetDetails>
	implements VROutputSheetDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VROutputSheetDetailsUtil} to access the vr output sheet details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VROutputSheetDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETID = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId) {
		return findByInputSheetId(mtCore, inputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end) {
		return findByInputSheetId(mtCore, inputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByInputSheetId(mtCore, inputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetId(long mtCore,
		long inputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(inputSheetId != vrOutputSheetDetails.getInputSheetId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetId_First(mtCore,
				inputSheetId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetId_First(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByInputSheetId(mtCore,
				inputSheetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetId_Last(mtCore,
				inputSheetId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", inputSheetId=");
		msg.append(inputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetId_Last(long mtCore,
		long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByInputSheetId(mtCore, inputSheetId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByInputSheetId(mtCore,
				inputSheetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByInputSheetId_PrevAndNext(long id,
		long mtCore, long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByInputSheetId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByInputSheetId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId,
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

	protected VROutputSheetDetails getByInputSheetId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long inputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(inputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 */
	@Override
	public void removeByInputSheetId(long mtCore, long inputSheetId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByInputSheetId(
				mtCore, inputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countByInputSheetId(long mtCore, long inputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_INPUTSHEETID_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETID_INPUTSHEETID_2 = "vrOutputSheetDetails.inputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookId(long mtCore,
		long inputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(inputSheetId != vrOutputSheetDetails.getInputSheetId()) ||
							(bookId != vrOutputSheetDetails.getBookId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2);

			query.append(_FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetIdAndBookId_First(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetIdAndBookId_First(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetIdAndBookId_First(
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetIdAndBookId_Last(mtCore,
				inputSheetId, bookId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetIdAndBookId_Last(long mtCore,
		long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByInputSheetIdAndBookId(mtCore,
				inputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByInputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByInputSheetIdAndBookId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId, bookId,
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

	protected VROutputSheetDetails getByInputSheetIdAndBookId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long inputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByInputSheetIdAndBookId(
				mtCore, inputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countByInputSheetIdAndBookId(long mtCore, long inputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, inputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_INPUTSHEETID_2 =
		"vrOutputSheetDetails.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKID_BOOKID_2 = "vrOutputSheetDetails.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOutputSheetId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOutputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETID = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOutputSheetId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId) {
		return findByOutputSheetId(mtCore, outputSheetId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end) {
		return findByOutputSheetId(mtCore, outputSheetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByOutputSheetId(mtCore, outputSheetId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetId(long mtCore,
		long outputSheetId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(outputSheetId != vrOutputSheetDetails.getOutputSheetId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetId_First(mtCore,
				outputSheetId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetId_First(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByOutputSheetId(mtCore,
				outputSheetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetId_Last(mtCore,
				outputSheetId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", outputSheetId=");
		msg.append(outputSheetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetId_Last(long mtCore,
		long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByOutputSheetId(mtCore, outputSheetId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByOutputSheetId(mtCore,
				outputSheetId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByOutputSheetId_PrevAndNext(long id,
		long mtCore, long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByOutputSheetId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByOutputSheetId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId,
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

	protected VROutputSheetDetails getByOutputSheetId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long outputSheetId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(outputSheetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 */
	@Override
	public void removeByOutputSheetId(long mtCore, long outputSheetId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByOutputSheetId(
				mtCore, outputSheetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countByOutputSheetId(long mtCore, long outputSheetId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETID;

		Object[] finderArgs = new Object[] { mtCore, outputSheetId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_OUTPUTSHEETID_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETID_OUTPUTSHEETID_2 = "vrOutputSheetDetails.outputSheetId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOutputSheetIdAndBookId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(outputSheetId != vrOutputSheetDetails.getOutputSheetId()) ||
							(bookId != vrOutputSheetDetails.getBookId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2);

			query.append(_FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetIdAndBookId_First(mtCore,
				outputSheetId, bookId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetIdAndBookId_First(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByOutputSheetIdAndBookId(mtCore,
				outputSheetId, bookId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetIdAndBookId_Last(long mtCore,
		long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetIdAndBookId_Last(mtCore,
				outputSheetId, bookId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetIdAndBookId_Last(
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByOutputSheetIdAndBookId(mtCore,
				outputSheetId, bookId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByOutputSheetIdAndBookId_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByOutputSheetIdAndBookId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId, bookId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByOutputSheetIdAndBookId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId, bookId,
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

	protected VROutputSheetDetails getByOutputSheetIdAndBookId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long outputSheetId, long bookId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 */
	@Override
	public void removeByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByOutputSheetIdAndBookId(
				mtCore, outputSheetId, bookId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countByOutputSheetIdAndBookId(long mtCore, long outputSheetId,
		long bookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID;

		Object[] finderArgs = new Object[] { mtCore, outputSheetId, bookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_OUTPUTSHEETID_2 =
		"vrOutputSheetDetails.outputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKID_BOOKID_2 = "vrOutputSheetDetails.bookId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.INPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.STAMPTYPE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByInputSheetIdAndBookIdAndStampType(mtCore, inputSheetId,
			bookId, stampType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(inputSheetId != vrOutputSheetDetails.getInputSheetId()) ||
							(bookId != vrOutputSheetDetails.getBookId()) ||
							!Objects.equals(stampType,
								vrOutputSheetDetails.getStampType())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetIdAndBookIdAndStampType_First(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_First(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByInputSheetIdAndBookIdAndStampType_Last(mtCore,
				inputSheetId, bookId, stampType, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByInputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByInputSheetIdAndBookIdAndStampType(mtCore,
				inputSheetId, bookId, stampType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId, bookId,
					stampType, orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByInputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, inputSheetId, bookId,
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

	protected VROutputSheetDetails getByInputSheetIdAndBookIdAndStampType_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long inputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 */
	@Override
	public void removeByInputSheetIdAndBookIdAndStampType(long mtCore,
		long inputSheetId, long bookId, String stampType) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByInputSheetIdAndBookIdAndStampType(
				mtCore, inputSheetId, bookId, stampType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and inputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param inputSheetId the input sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the number of matching vr output sheet detailses
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

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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
		"vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_INPUTSHEETID_2 =
		"vrOutputSheetDetails.inputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2 =
		"vrOutputSheetDetails.bookId = ? AND ";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1 =
		"vrOutputSheetDetails.stampType IS NULL";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2 =
		"vrOutputSheetDetails.stampType = ?";
	private static final String _FINDER_COLUMN_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3 =
		"(vrOutputSheetDetails.stampType IS NULL OR vrOutputSheetDetails.stampType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.OUTPUTSHEETID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.BOOKID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.STAMPTYPE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByOutputSheetIdAndBookIdAndStampType",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByOutputSheetIdAndBookIdAndStampType(mtCore, outputSheetId,
			bookId, stampType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, String stampType,
		int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(outputSheetId != vrOutputSheetDetails.getOutputSheetId()) ||
							(bookId != vrOutputSheetDetails.getBookId()) ||
							!Objects.equals(stampType,
								vrOutputSheetDetails.getStampType())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetIdAndBookIdAndStampType_First(mtCore,
				outputSheetId, bookId, stampType, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_First(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByOutputSheetIdAndBookIdAndStampType_Last(mtCore,
				outputSheetId, bookId, stampType, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
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

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByOutputSheetIdAndBookIdAndStampType_Last(
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByOutputSheetIdAndBookIdAndStampType(mtCore,
				outputSheetId, bookId, stampType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		long id, long mtCore, long outputSheetId, long bookId,
		String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId, bookId,
					stampType, orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, outputSheetId, bookId,
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

	protected VROutputSheetDetails getByOutputSheetIdAndBookIdAndStampType_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long outputSheetId, long bookId, String stampType,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 */
	@Override
	public void removeByOutputSheetIdAndBookIdAndStampType(long mtCore,
		long outputSheetId, long bookId, String stampType) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByOutputSheetIdAndBookIdAndStampType(
				mtCore, outputSheetId, bookId, stampType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and outputSheetId = &#63; and bookId = &#63; and stampType = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param outputSheetId the output sheet ID
	 * @param bookId the book ID
	 * @param stampType the stamp type
	 * @return the number of matching vr output sheet detailses
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

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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
		"vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_OUTPUTSHEETID_2 =
		"vrOutputSheetDetails.outputSheetId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_BOOKID_2 =
		"vrOutputSheetDetails.bookId = ? AND ";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_1 =
		"vrOutputSheetDetails.stampType IS NULL";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_2 =
		"vrOutputSheetDetails.stampType = ?";
	private static final String _FINDER_COLUMN_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE_STAMPTYPE_3 =
		"(vrOutputSheetDetails.stampType IS NULL OR vrOutputSheetDetails.stampType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.CERTIFICATEID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATEID = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId) {
		return findBycertificateId(mtCore, certificateId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end) {
		return findBycertificateId(mtCore, certificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findBycertificateId(mtCore, certificateId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateId(long mtCore,
		long certificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(certificateId != vrOutputSheetDetails.getCertificateId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchBycertificateId_First(mtCore,
				certificateId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchBycertificateId_First(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findBycertificateId(mtCore,
				certificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchBycertificateId_Last(mtCore,
				certificateId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateId=");
		msg.append(certificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchBycertificateId_Last(long mtCore,
		long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countBycertificateId(mtCore, certificateId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findBycertificateId(mtCore,
				certificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findBycertificateId_PrevAndNext(long id,
		long mtCore, long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getBycertificateId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, certificateId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getBycertificateId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, certificateId,
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

	protected VROutputSheetDetails getBycertificateId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long certificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(certificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and certificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 */
	@Override
	public void removeBycertificateId(long mtCore, long certificateId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findBycertificateId(
				mtCore, certificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and certificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateId the certificate ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countBycertificateId(long mtCore, long certificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, certificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CERTIFICATEID_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATEID_CERTIFICATEID_2 = "vrOutputSheetDetails.certificateId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycertificateNumber",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() },
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.CERTIFICATENUMBER_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATENUMBER = new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycertificateNumber",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore,
		String certificateNumber) {
		return findBycertificateNumber(mtCore, certificateNumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findBycertificateNumber(mtCore, certificateNumber, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findBycertificateNumber(long mtCore,
		String certificateNumber, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							!Objects.equals(certificateNumber,
								vrOutputSheetDetails.getCertificateNumber())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchBycertificateNumber_First(mtCore,
				certificateNumber, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchBycertificateNumber_First(long mtCore,
		String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findBycertificateNumber(mtCore,
				certificateNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchBycertificateNumber_Last(mtCore,
				certificateNumber, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", certificateNumber=");
		msg.append(certificateNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchBycertificateNumber_Last(long mtCore,
		String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countBycertificateNumber(mtCore, certificateNumber);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findBycertificateNumber(mtCore,
				certificateNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findBycertificateNumber_PrevAndNext(long id,
		long mtCore, String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getBycertificateNumber_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, certificateNumber,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getBycertificateNumber_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, certificateNumber,
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

	protected VROutputSheetDetails getBycertificateNumber_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, String certificateNumber,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 */
	@Override
	public void removeBycertificateNumber(long mtCore, String certificateNumber) {
		for (VROutputSheetDetails vrOutputSheetDetails : findBycertificateNumber(
				mtCore, certificateNumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and certificateNumber = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param certificateNumber the certificate number
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countBycertificateNumber(long mtCore, String certificateNumber) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATENUMBER;

		Object[] finderArgs = new Object[] { mtCore, certificateNumber };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_MTCORE_2 = "vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1 =
		"vrOutputSheetDetails.certificateNumber IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2 =
		"vrOutputSheetDetails.certificateNumber = ?";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3 =
		"(vrOutputSheetDetails.certificateNumber IS NULL OR vrOutputSheetDetails.certificateNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissueVehicleCertificateId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissueVehicleCertificateId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VROutputSheetDetailsModelImpl.MTCORE_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.ISSUEVEHICLECERTIFICATEID_COLUMN_BITMASK |
			VROutputSheetDetailsModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID =
		new FinderPath(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueVehicleCertificateId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId, int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] { mtCore, issueVehicleCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID;
			finderArgs = new Object[] {
					mtCore, issueVehicleCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VROutputSheetDetails vrOutputSheetDetails : list) {
					if ((mtCore != vrOutputSheetDetails.getMtCore()) ||
							(issueVehicleCertificateId != vrOutputSheetDetails.getIssueVehicleCertificateId())) {
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

			query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueVehicleCertificateId);

				if (!pagination) {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByissueVehicleCertificateId_First(mtCore,
				issueVehicleCertificateId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the first vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByissueVehicleCertificateId_First(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		List<VROutputSheetDetails> list = findByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails findByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByissueVehicleCertificateId_Last(mtCore,
				issueVehicleCertificateId, orderByComparator);

		if (vrOutputSheetDetails != null) {
			return vrOutputSheetDetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueVehicleCertificateId=");
		msg.append(issueVehicleCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVROutputSheetDetailsException(msg.toString());
	}

	/**
	 * Returns the last vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr output sheet details, or <code>null</code> if a matching vr output sheet details could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByissueVehicleCertificateId_Last(
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		int count = countByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId);

		if (count == 0) {
			return null;
		}

		List<VROutputSheetDetails> list = findByissueVehicleCertificateId(mtCore,
				issueVehicleCertificateId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr output sheet detailses before and after the current vr output sheet details in the ordered set where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr output sheet details
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails[] findByissueVehicleCertificateId_PrevAndNext(
		long id, long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails[] array = new VROutputSheetDetailsImpl[3];

			array[0] = getByissueVehicleCertificateId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, issueVehicleCertificateId,
					orderByComparator, true);

			array[1] = vrOutputSheetDetails;

			array[2] = getByissueVehicleCertificateId_PrevAndNext(session,
					vrOutputSheetDetails, mtCore, issueVehicleCertificateId,
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

	protected VROutputSheetDetails getByissueVehicleCertificateId_PrevAndNext(
		Session session, VROutputSheetDetails vrOutputSheetDetails,
		long mtCore, long issueVehicleCertificateId,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE);

		query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

		query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

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
			query.append(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(issueVehicleCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrOutputSheetDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VROutputSheetDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 */
	@Override
	public void removeByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		for (VROutputSheetDetails vrOutputSheetDetails : findByissueVehicleCertificateId(
				mtCore, issueVehicleCertificateId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses where mtCore = &#63; and issueVehicleCertificateId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueVehicleCertificateId the issue vehicle certificate ID
	 * @return the number of matching vr output sheet detailses
	 */
	@Override
	public int countByissueVehicleCertificateId(long mtCore,
		long issueVehicleCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID;

		Object[] finderArgs = new Object[] { mtCore, issueVehicleCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueVehicleCertificateId);

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

	private static final String _FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_MTCORE_2 =
		"vrOutputSheetDetails.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_ISSUEVEHICLECERTIFICATEID_ISSUEVEHICLECERTIFICATEID_2 =
		"vrOutputSheetDetails.issueVehicleCertificateId = ?";

	public VROutputSheetDetailsPersistenceImpl() {
		setModelClass(VROutputSheetDetails.class);
	}

	/**
	 * Caches the vr output sheet details in the entity cache if it is enabled.
	 *
	 * @param vrOutputSheetDetails the vr output sheet details
	 */
	@Override
	public void cacheResult(VROutputSheetDetails vrOutputSheetDetails) {
		entityCache.putResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			vrOutputSheetDetails.getPrimaryKey(), vrOutputSheetDetails);

		vrOutputSheetDetails.resetOriginalValues();
	}

	/**
	 * Caches the vr output sheet detailses in the entity cache if it is enabled.
	 *
	 * @param vrOutputSheetDetailses the vr output sheet detailses
	 */
	@Override
	public void cacheResult(List<VROutputSheetDetails> vrOutputSheetDetailses) {
		for (VROutputSheetDetails vrOutputSheetDetails : vrOutputSheetDetailses) {
			if (entityCache.getResult(
						VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
						VROutputSheetDetailsImpl.class,
						vrOutputSheetDetails.getPrimaryKey()) == null) {
				cacheResult(vrOutputSheetDetails);
			}
			else {
				vrOutputSheetDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr output sheet detailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VROutputSheetDetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr output sheet details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VROutputSheetDetails vrOutputSheetDetails) {
		entityCache.removeResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class, vrOutputSheetDetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VROutputSheetDetails> vrOutputSheetDetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VROutputSheetDetails vrOutputSheetDetails : vrOutputSheetDetailses) {
			entityCache.removeResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
				VROutputSheetDetailsImpl.class,
				vrOutputSheetDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	 *
	 * @param id the primary key for the new vr output sheet details
	 * @return the new vr output sheet details
	 */
	@Override
	public VROutputSheetDetails create(long id) {
		VROutputSheetDetails vrOutputSheetDetails = new VROutputSheetDetailsImpl();

		vrOutputSheetDetails.setNew(true);
		vrOutputSheetDetails.setPrimaryKey(id);

		return vrOutputSheetDetails;
	}

	/**
	 * Removes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr output sheet details
	 * @return the vr output sheet details that was removed
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails remove(long id)
		throws NoSuchVROutputSheetDetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr output sheet details
	 * @return the vr output sheet details that was removed
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails remove(Serializable primaryKey)
		throws NoSuchVROutputSheetDetailsException {
		Session session = null;

		try {
			session = openSession();

			VROutputSheetDetails vrOutputSheetDetails = (VROutputSheetDetails)session.get(VROutputSheetDetailsImpl.class,
					primaryKey);

			if (vrOutputSheetDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVROutputSheetDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrOutputSheetDetails);
		}
		catch (NoSuchVROutputSheetDetailsException nsee) {
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
	protected VROutputSheetDetails removeImpl(
		VROutputSheetDetails vrOutputSheetDetails) {
		vrOutputSheetDetails = toUnwrappedModel(vrOutputSheetDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrOutputSheetDetails)) {
				vrOutputSheetDetails = (VROutputSheetDetails)session.get(VROutputSheetDetailsImpl.class,
						vrOutputSheetDetails.getPrimaryKeyObj());
			}

			if (vrOutputSheetDetails != null) {
				session.delete(vrOutputSheetDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrOutputSheetDetails != null) {
			clearCache(vrOutputSheetDetails);
		}

		return vrOutputSheetDetails;
	}

	@Override
	public VROutputSheetDetails updateImpl(
		VROutputSheetDetails vrOutputSheetDetails) {
		vrOutputSheetDetails = toUnwrappedModel(vrOutputSheetDetails);

		boolean isNew = vrOutputSheetDetails.isNew();

		VROutputSheetDetailsModelImpl vrOutputSheetDetailsModelImpl = (VROutputSheetDetailsModelImpl)vrOutputSheetDetails;

		Session session = null;

		try {
			session = openSession();

			if (vrOutputSheetDetails.isNew()) {
				session.save(vrOutputSheetDetails);

				vrOutputSheetDetails.setNew(false);
			}
			else {
				vrOutputSheetDetails = (VROutputSheetDetails)session.merge(vrOutputSheetDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VROutputSheetDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getInputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETID,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalInputSheetId(),
						vrOutputSheetDetailsModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getInputSheetId(),
						vrOutputSheetDetailsModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalOutputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getOutputSheetId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETID,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalOutputSheetId(),
						vrOutputSheetDetailsModelImpl.getOriginalBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getOutputSheetId(),
						vrOutputSheetDetailsModelImpl.getBookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKID,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalInputSheetId(),
						vrOutputSheetDetailsModelImpl.getOriginalBookId(),
						vrOutputSheetDetailsModelImpl.getOriginalStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getInputSheetId(),
						vrOutputSheetDetailsModelImpl.getBookId(),
						vrOutputSheetDetailsModelImpl.getStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalOutputSheetId(),
						vrOutputSheetDetailsModelImpl.getOriginalBookId(),
						vrOutputSheetDetailsModelImpl.getOriginalStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getOutputSheetId(),
						vrOutputSheetDetailsModelImpl.getBookId(),
						vrOutputSheetDetailsModelImpl.getStampType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OUTPUTSHEETIDANDBOOKIDANDSTAMPTYPE,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATEID,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getCertificateNumber()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATENUMBER,
					args);
			}

			if ((vrOutputSheetDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrOutputSheetDetailsModelImpl.getOriginalMtCore(),
						vrOutputSheetDetailsModelImpl.getOriginalIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);

				args = new Object[] {
						vrOutputSheetDetailsModelImpl.getMtCore(),
						vrOutputSheetDetailsModelImpl.getIssueVehicleCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUEVEHICLECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUEVEHICLECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
			VROutputSheetDetailsImpl.class,
			vrOutputSheetDetails.getPrimaryKey(), vrOutputSheetDetails, false);

		vrOutputSheetDetails.resetOriginalValues();

		return vrOutputSheetDetails;
	}

	protected VROutputSheetDetails toUnwrappedModel(
		VROutputSheetDetails vrOutputSheetDetails) {
		if (vrOutputSheetDetails instanceof VROutputSheetDetailsImpl) {
			return vrOutputSheetDetails;
		}

		VROutputSheetDetailsImpl vrOutputSheetDetailsImpl = new VROutputSheetDetailsImpl();

		vrOutputSheetDetailsImpl.setNew(vrOutputSheetDetails.isNew());
		vrOutputSheetDetailsImpl.setPrimaryKey(vrOutputSheetDetails.getPrimaryKey());

		vrOutputSheetDetailsImpl.setId(vrOutputSheetDetails.getId());
		vrOutputSheetDetailsImpl.setMtCore(vrOutputSheetDetails.getMtCore());
		vrOutputSheetDetailsImpl.setInputSheetId(vrOutputSheetDetails.getInputSheetId());
		vrOutputSheetDetailsImpl.setOutputSheetId(vrOutputSheetDetails.getOutputSheetId());
		vrOutputSheetDetailsImpl.setBookId(vrOutputSheetDetails.getBookId());
		vrOutputSheetDetailsImpl.setIssueVehicleCertificateId(vrOutputSheetDetails.getIssueVehicleCertificateId());
		vrOutputSheetDetailsImpl.setCertificateId(vrOutputSheetDetails.getCertificateId());
		vrOutputSheetDetailsImpl.setCertificateNumber(vrOutputSheetDetails.getCertificateNumber());
		vrOutputSheetDetailsImpl.setCertificateDate(vrOutputSheetDetails.getCertificateDate());
		vrOutputSheetDetailsImpl.setVehicleClass(vrOutputSheetDetails.getVehicleClass());
		vrOutputSheetDetailsImpl.setStampType(vrOutputSheetDetails.getStampType());
		vrOutputSheetDetailsImpl.setStampShortNo(vrOutputSheetDetails.getStampShortNo());
		vrOutputSheetDetailsImpl.setSerialStartNo(vrOutputSheetDetails.getSerialStartNo());
		vrOutputSheetDetailsImpl.setSerialEndNo(vrOutputSheetDetails.getSerialEndNo());
		vrOutputSheetDetailsImpl.setSubTotalInDocument(vrOutputSheetDetails.getSubTotalInDocument());
		vrOutputSheetDetailsImpl.setSubTotalQuantities(vrOutputSheetDetails.getSubTotalQuantities());
		vrOutputSheetDetailsImpl.setUnitPrice(vrOutputSheetDetails.getUnitPrice());
		vrOutputSheetDetailsImpl.setTotalAmount(vrOutputSheetDetails.getTotalAmount());
		vrOutputSheetDetailsImpl.setTotalInUse(vrOutputSheetDetails.getTotalInUse());
		vrOutputSheetDetailsImpl.setTotalNotUsed(vrOutputSheetDetails.getTotalNotUsed());
		vrOutputSheetDetailsImpl.setTotalLost(vrOutputSheetDetails.getTotalLost());
		vrOutputSheetDetailsImpl.setTotalCancelled(vrOutputSheetDetails.getTotalCancelled());
		vrOutputSheetDetailsImpl.setTotalReturned(vrOutputSheetDetails.getTotalReturned());
		vrOutputSheetDetailsImpl.setRemark(vrOutputSheetDetails.getRemark());
		vrOutputSheetDetailsImpl.setModifyDate(vrOutputSheetDetails.getModifyDate());
		vrOutputSheetDetailsImpl.setSyncDate(vrOutputSheetDetails.getSyncDate());

		return vrOutputSheetDetailsImpl;
	}

	/**
	 * Returns the vr output sheet details with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr output sheet details
	 * @return the vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVROutputSheetDetailsException {
		VROutputSheetDetails vrOutputSheetDetails = fetchByPrimaryKey(primaryKey);

		if (vrOutputSheetDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVROutputSheetDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrOutputSheetDetails;
	}

	/**
	 * Returns the vr output sheet details with the primary key or throws a {@link NoSuchVROutputSheetDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the vr output sheet details
	 * @return the vr output sheet details
	 * @throws NoSuchVROutputSheetDetailsException if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails findByPrimaryKey(long id)
		throws NoSuchVROutputSheetDetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr output sheet details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr output sheet details
	 * @return the vr output sheet details, or <code>null</code> if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
				VROutputSheetDetailsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VROutputSheetDetails vrOutputSheetDetails = (VROutputSheetDetails)serializable;

		if (vrOutputSheetDetails == null) {
			Session session = null;

			try {
				session = openSession();

				vrOutputSheetDetails = (VROutputSheetDetails)session.get(VROutputSheetDetailsImpl.class,
						primaryKey);

				if (vrOutputSheetDetails != null) {
					cacheResult(vrOutputSheetDetails);
				}
				else {
					entityCache.putResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
						VROutputSheetDetailsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrOutputSheetDetails;
	}

	/**
	 * Returns the vr output sheet details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr output sheet details
	 * @return the vr output sheet details, or <code>null</code> if a vr output sheet details with the primary key could not be found
	 */
	@Override
	public VROutputSheetDetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VROutputSheetDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VROutputSheetDetails> map = new HashMap<Serializable, VROutputSheetDetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VROutputSheetDetails vrOutputSheetDetails = fetchByPrimaryKey(primaryKey);

			if (vrOutputSheetDetails != null) {
				map.put(primaryKey, vrOutputSheetDetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetDetailsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VROutputSheetDetails)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE_PKS_IN);

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

			for (VROutputSheetDetails vrOutputSheetDetails : (List<VROutputSheetDetails>)q.list()) {
				map.put(vrOutputSheetDetails.getPrimaryKeyObj(),
					vrOutputSheetDetails);

				cacheResult(vrOutputSheetDetails);

				uncachedPrimaryKeys.remove(vrOutputSheetDetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VROutputSheetDetailsModelImpl.ENTITY_CACHE_ENABLED,
					VROutputSheetDetailsImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr output sheet detailses.
	 *
	 * @return the vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr output sheet detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @return the range of vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findAll(int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr output sheet detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr output sheet detailses
	 * @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr output sheet detailses
	 */
	@Override
	public List<VROutputSheetDetails> findAll(int start, int end,
		OrderByComparator<VROutputSheetDetails> orderByComparator,
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

		List<VROutputSheetDetails> list = null;

		if (retrieveFromCache) {
			list = (List<VROutputSheetDetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VROUTPUTSHEETDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VROUTPUTSHEETDETAILS;

				if (pagination) {
					sql = sql.concat(VROutputSheetDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VROutputSheetDetails>)QueryUtil.list(q,
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
	 * Removes all the vr output sheet detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VROutputSheetDetails vrOutputSheetDetails : findAll()) {
			remove(vrOutputSheetDetails);
		}
	}

	/**
	 * Returns the number of vr output sheet detailses.
	 *
	 * @return the number of vr output sheet detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VROUTPUTSHEETDETAILS);

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
		return VROutputSheetDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr output sheet details persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VROutputSheetDetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VROUTPUTSHEETDETAILS = "SELECT vrOutputSheetDetails FROM VROutputSheetDetails vrOutputSheetDetails";
	private static final String _SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE_PKS_IN = "SELECT vrOutputSheetDetails FROM VROutputSheetDetails vrOutputSheetDetails WHERE id IN (";
	private static final String _SQL_SELECT_VROUTPUTSHEETDETAILS_WHERE = "SELECT vrOutputSheetDetails FROM VROutputSheetDetails vrOutputSheetDetails WHERE ";
	private static final String _SQL_COUNT_VROUTPUTSHEETDETAILS = "SELECT COUNT(vrOutputSheetDetails) FROM VROutputSheetDetails vrOutputSheetDetails";
	private static final String _SQL_COUNT_VROUTPUTSHEETDETAILS_WHERE = "SELECT COUNT(vrOutputSheetDetails) FROM VROutputSheetDetails vrOutputSheetDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrOutputSheetDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VROutputSheetDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VROutputSheetDetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VROutputSheetDetailsPersistenceImpl.class);
}