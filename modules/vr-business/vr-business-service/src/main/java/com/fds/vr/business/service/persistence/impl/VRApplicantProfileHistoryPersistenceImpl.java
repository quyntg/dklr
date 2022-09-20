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

import com.fds.vr.business.exception.NoSuchVRApplicantProfileHistoryException;
import com.fds.vr.business.model.VRApplicantProfileHistory;
import com.fds.vr.business.model.impl.VRApplicantProfileHistoryImpl;
import com.fds.vr.business.model.impl.VRApplicantProfileHistoryModelImpl;
import com.fds.vr.business.service.persistence.VRApplicantProfileHistoryPersistence;

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
 * The persistence implementation for the vr applicant profile history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRApplicantProfileHistoryPersistence
 * @see com.fds.vr.business.service.persistence.VRApplicantProfileHistoryUtil
 * @generated
 */
@ProviderType
public class VRApplicantProfileHistoryPersistenceImpl
	extends BasePersistenceImpl<VRApplicantProfileHistory>
	implements VRApplicantProfileHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRApplicantProfileHistoryUtil} to access the vr applicant profile history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRApplicantProfileHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGSTATUS =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymappingStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymappingStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MAPPINGSTATUS_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MAPPINGSTATUS = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBymappingStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore,
		String mappingStatus) {
		return findBymappingStatus(mtCore, mappingStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end) {
		return findBymappingStatus(mtCore, mappingStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findBymappingStatus(mtCore, mappingStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingStatus(long mtCore,
		String mappingStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS;
			finderArgs = new Object[] { mtCore, mappingStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGSTATUS;
			finderArgs = new Object[] {
					mtCore, mappingStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(mappingStatus,
								vrApplicantProfileHistory.getMappingStatus())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

			boolean bindMappingStatus = false;

			if (mappingStatus == null) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
			}
			else if (mappingStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
			}
			else {
				bindMappingStatus = true;

				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingStatus) {
					qPos.add(mappingStatus);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingStatus_First(long mtCore,
		String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingStatus_First(mtCore,
				mappingStatus, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingStatus=");
		msg.append(mappingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingStatus_First(long mtCore,
		String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findBymappingStatus(mtCore,
				mappingStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingStatus_Last(long mtCore,
		String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingStatus_Last(mtCore,
				mappingStatus, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingStatus=");
		msg.append(mappingStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingStatus_Last(long mtCore,
		String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countBymappingStatus(mtCore, mappingStatus);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findBymappingStatus(mtCore,
				mappingStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findBymappingStatus_PrevAndNext(
		long id, long mtCore, String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getBymappingStatus_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingStatus,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getBymappingStatus_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingStatus,
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

	protected VRApplicantProfileHistory getBymappingStatus_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String mappingStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

		boolean bindMappingStatus = false;

		if (mappingStatus == null) {
			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
		}
		else if (mappingStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
		}
		else {
			bindMappingStatus = true;

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindMappingStatus) {
			qPos.add(mappingStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 */
	@Override
	public void removeBymappingStatus(long mtCore, String mappingStatus) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findBymappingStatus(
				mtCore, mappingStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and mappingStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingStatus the mapping status
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countBymappingStatus(long mtCore, String mappingStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MAPPINGSTATUS;

		Object[] finderArgs = new Object[] { mtCore, mappingStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2);

			boolean bindMappingStatus = false;

			if (mappingStatus == null) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1);
			}
			else if (mappingStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3);
			}
			else {
				bindMappingStatus = true;

				query.append(_FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingStatus) {
					qPos.add(mappingStatus);
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

	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_1 = "vrApplicantProfileHistory.mappingStatus IS NULL";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_2 = "vrApplicantProfileHistory.mappingStatus = ?";
	private static final String _FINDER_COLUMN_MAPPINGSTATUS_MAPPINGSTATUS_3 = "(vrApplicantProfileHistory.mappingStatus IS NULL OR vrApplicantProfileHistory.mappingStatus = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCODE =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantCode",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapplicantCode",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.APPLICANTCODE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTCODE = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantCode",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore,
		String applicantCode) {
		return findByapplicantCode(mtCore, applicantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end) {
		return findByapplicantCode(mtCore, applicantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findByapplicantCode(mtCore, applicantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCode(long mtCore,
		String applicantCode, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE;
			finderArgs = new Object[] { mtCore, applicantCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(applicantCode,
								vrApplicantProfileHistory.getApplicantCode())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantCode_First(long mtCore,
		String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantCode_First(mtCore,
				applicantCode, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantCode_First(long mtCore,
		String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findByapplicantCode(mtCore,
				applicantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantCode_Last(long mtCore,
		String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantCode_Last(mtCore,
				applicantCode, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCode=");
		msg.append(applicantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantCode_Last(long mtCore,
		String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countByapplicantCode(mtCore, applicantCode);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findByapplicantCode(mtCore,
				applicantCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findByapplicantCode_PrevAndNext(
		long id, long mtCore, String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getByapplicantCode_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantCode,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getByapplicantCode_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantCode,
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

	protected VRApplicantProfileHistory getByapplicantCode_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String applicantCode,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

		boolean bindApplicantCode = false;

		if (applicantCode == null) {
			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
		}
		else if (applicantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
		}
		else {
			bindApplicantCode = true;

			query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindApplicantCode) {
			qPos.add(applicantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and applicantCode = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 */
	@Override
	public void removeByapplicantCode(long mtCore, String applicantCode) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findByapplicantCode(
				mtCore, applicantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCode the applicant code
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countByapplicantCode(long mtCore, String applicantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTCODE;

		Object[] finderArgs = new Object[] { mtCore, applicantCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCODE_MTCORE_2);

			boolean bindApplicantCode = false;

			if (applicantCode == null) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1);
			}
			else if (applicantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3);
			}
			else {
				bindApplicantCode = true;

				query.append(_FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCode) {
					qPos.add(applicantCode);
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

	private static final String _FINDER_COLUMN_APPLICANTCODE_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_1 = "vrApplicantProfileHistory.applicantCode IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_2 = "vrApplicantProfileHistory.applicantCode = ?";
	private static final String _FINDER_COLUMN_APPLICANTCODE_APPLICANTCODE_3 = "(vrApplicantProfileHistory.applicantCode IS NULL OR vrApplicantProfileHistory.applicantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGMA_CTY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymappingMA_CTY",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_CTY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymappingMA_CTY",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MAPPINGMA_CTY_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MAPPINGMA_CTY = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBymappingMA_CTY",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore,
		String mappingMA_CTY) {
		return findBymappingMA_CTY(mtCore, mappingMA_CTY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore,
		String mappingMA_CTY, int start, int end) {
		return findBymappingMA_CTY(mtCore, mappingMA_CTY, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore,
		String mappingMA_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findBymappingMA_CTY(mtCore, mappingMA_CTY, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingMA_CTY(long mtCore,
		String mappingMA_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_CTY;
			finderArgs = new Object[] { mtCore, mappingMA_CTY };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGMA_CTY;
			finderArgs = new Object[] {
					mtCore, mappingMA_CTY,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(mappingMA_CTY,
								vrApplicantProfileHistory.getMappingMA_CTY())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MTCORE_2);

			boolean bindMappingMA_CTY = false;

			if (mappingMA_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_1);
			}
			else if (mappingMA_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_3);
			}
			else {
				bindMappingMA_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingMA_CTY) {
					qPos.add(mappingMA_CTY);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingMA_CTY_First(long mtCore,
		String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingMA_CTY_First(mtCore,
				mappingMA_CTY, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingMA_CTY=");
		msg.append(mappingMA_CTY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingMA_CTY_First(long mtCore,
		String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findBymappingMA_CTY(mtCore,
				mappingMA_CTY, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingMA_CTY_Last(long mtCore,
		String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingMA_CTY_Last(mtCore,
				mappingMA_CTY, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingMA_CTY=");
		msg.append(mappingMA_CTY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingMA_CTY_Last(long mtCore,
		String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countBymappingMA_CTY(mtCore, mappingMA_CTY);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findBymappingMA_CTY(mtCore,
				mappingMA_CTY, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findBymappingMA_CTY_PrevAndNext(
		long id, long mtCore, String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getBymappingMA_CTY_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingMA_CTY,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getBymappingMA_CTY_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingMA_CTY,
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

	protected VRApplicantProfileHistory getBymappingMA_CTY_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String mappingMA_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MTCORE_2);

		boolean bindMappingMA_CTY = false;

		if (mappingMA_CTY == null) {
			query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_1);
		}
		else if (mappingMA_CTY.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_3);
		}
		else {
			bindMappingMA_CTY = true;

			query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindMappingMA_CTY) {
			qPos.add(mappingMA_CTY);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 */
	@Override
	public void removeBymappingMA_CTY(long mtCore, String mappingMA_CTY) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findBymappingMA_CTY(
				mtCore, mappingMA_CTY, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and mappingMA_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingMA_CTY the mapping ma_cty
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countBymappingMA_CTY(long mtCore, String mappingMA_CTY) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MAPPINGMA_CTY;

		Object[] finderArgs = new Object[] { mtCore, mappingMA_CTY };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MTCORE_2);

			boolean bindMappingMA_CTY = false;

			if (mappingMA_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_1);
			}
			else if (mappingMA_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_3);
			}
			else {
				bindMappingMA_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingMA_CTY) {
					qPos.add(mappingMA_CTY);
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

	private static final String _FINDER_COLUMN_MAPPINGMA_CTY_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_1 = "vrApplicantProfileHistory.mappingMA_CTY IS NULL";
	private static final String _FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_2 = "vrApplicantProfileHistory.mappingMA_CTY = ?";
	private static final String _FINDER_COLUMN_MAPPINGMA_CTY_MAPPINGMA_CTY_3 = "(vrApplicantProfileHistory.mappingMA_CTY IS NULL OR vrApplicantProfileHistory.mappingMA_CTY = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGTEN_CTY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBymappingTEN_CTY",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGTEN_CTY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBymappingTEN_CTY",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MAPPINGTEN_CTY_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MAPPINGTEN_CTY = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBymappingTEN_CTY",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore,
		String mappingTEN_CTY) {
		return findBymappingTEN_CTY(mtCore, mappingTEN_CTY, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore,
		String mappingTEN_CTY, int start, int end) {
		return findBymappingTEN_CTY(mtCore, mappingTEN_CTY, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore,
		String mappingTEN_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findBymappingTEN_CTY(mtCore, mappingTEN_CTY, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findBymappingTEN_CTY(long mtCore,
		String mappingTEN_CTY, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGTEN_CTY;
			finderArgs = new Object[] { mtCore, mappingTEN_CTY };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MAPPINGTEN_CTY;
			finderArgs = new Object[] {
					mtCore, mappingTEN_CTY,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(mappingTEN_CTY,
								vrApplicantProfileHistory.getMappingTEN_CTY())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MTCORE_2);

			boolean bindMappingTEN_CTY = false;

			if (mappingTEN_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_1);
			}
			else if (mappingTEN_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_3);
			}
			else {
				bindMappingTEN_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingTEN_CTY) {
					qPos.add(mappingTEN_CTY);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingTEN_CTY_First(long mtCore,
		String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingTEN_CTY_First(mtCore,
				mappingTEN_CTY, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingTEN_CTY=");
		msg.append(mappingTEN_CTY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingTEN_CTY_First(long mtCore,
		String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findBymappingTEN_CTY(mtCore,
				mappingTEN_CTY, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findBymappingTEN_CTY_Last(long mtCore,
		String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchBymappingTEN_CTY_Last(mtCore,
				mappingTEN_CTY, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", mappingTEN_CTY=");
		msg.append(mappingTEN_CTY);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchBymappingTEN_CTY_Last(long mtCore,
		String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countBymappingTEN_CTY(mtCore, mappingTEN_CTY);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findBymappingTEN_CTY(mtCore,
				mappingTEN_CTY, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findBymappingTEN_CTY_PrevAndNext(
		long id, long mtCore, String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getBymappingTEN_CTY_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingTEN_CTY,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getBymappingTEN_CTY_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, mappingTEN_CTY,
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

	protected VRApplicantProfileHistory getBymappingTEN_CTY_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String mappingTEN_CTY,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MTCORE_2);

		boolean bindMappingTEN_CTY = false;

		if (mappingTEN_CTY == null) {
			query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_1);
		}
		else if (mappingTEN_CTY.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_3);
		}
		else {
			bindMappingTEN_CTY = true;

			query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindMappingTEN_CTY) {
			qPos.add(mappingTEN_CTY);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 */
	@Override
	public void removeBymappingTEN_CTY(long mtCore, String mappingTEN_CTY) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findBymappingTEN_CTY(
				mtCore, mappingTEN_CTY, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and mappingTEN_CTY = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param mappingTEN_CTY the mapping ten_cty
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countBymappingTEN_CTY(long mtCore, String mappingTEN_CTY) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MAPPINGTEN_CTY;

		Object[] finderArgs = new Object[] { mtCore, mappingTEN_CTY };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MTCORE_2);

			boolean bindMappingTEN_CTY = false;

			if (mappingTEN_CTY == null) {
				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_1);
			}
			else if (mappingTEN_CTY.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_3);
			}
			else {
				bindMappingTEN_CTY = true;

				query.append(_FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindMappingTEN_CTY) {
					qPos.add(mappingTEN_CTY);
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

	private static final String _FINDER_COLUMN_MAPPINGTEN_CTY_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_1 = "vrApplicantProfileHistory.mappingTEN_CTY IS NULL";
	private static final String _FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_2 = "vrApplicantProfileHistory.mappingTEN_CTY = ?";
	private static final String _FINDER_COLUMN_MAPPINGTEN_CTY_MAPPINGTEN_CTY_3 = "(vrApplicantProfileHistory.mappingTEN_CTY IS NULL OR vrApplicantProfileHistory.mappingTEN_CTY = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTREGION =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantRegion",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTREGION =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapplicantRegion",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.APPLICANTREGION_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTREGION = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantRegion",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore,
		String applicantRegion) {
		return findByapplicantRegion(mtCore, applicantRegion,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore,
		String applicantRegion, int start, int end) {
		return findByapplicantRegion(mtCore, applicantRegion, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore,
		String applicantRegion, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findByapplicantRegion(mtCore, applicantRegion, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantRegion(long mtCore,
		String applicantRegion, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTREGION;
			finderArgs = new Object[] { mtCore, applicantRegion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTREGION;
			finderArgs = new Object[] {
					mtCore, applicantRegion,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(applicantRegion,
								vrApplicantProfileHistory.getApplicantRegion())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTREGION_MTCORE_2);

			boolean bindApplicantRegion = false;

			if (applicantRegion == null) {
				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_1);
			}
			else if (applicantRegion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_3);
			}
			else {
				bindApplicantRegion = true;

				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantRegion) {
					qPos.add(applicantRegion);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantRegion_First(long mtCore,
		String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantRegion_First(mtCore,
				applicantRegion, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantRegion=");
		msg.append(applicantRegion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantRegion_First(long mtCore,
		String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findByapplicantRegion(mtCore,
				applicantRegion, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantRegion_Last(long mtCore,
		String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantRegion_Last(mtCore,
				applicantRegion, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantRegion=");
		msg.append(applicantRegion);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantRegion_Last(long mtCore,
		String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countByapplicantRegion(mtCore, applicantRegion);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findByapplicantRegion(mtCore,
				applicantRegion, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findByapplicantRegion_PrevAndNext(
		long id, long mtCore, String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getByapplicantRegion_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantRegion,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getByapplicantRegion_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantRegion,
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

	protected VRApplicantProfileHistory getByapplicantRegion_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String applicantRegion,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTREGION_MTCORE_2);

		boolean bindApplicantRegion = false;

		if (applicantRegion == null) {
			query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_1);
		}
		else if (applicantRegion.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_3);
		}
		else {
			bindApplicantRegion = true;

			query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindApplicantRegion) {
			qPos.add(applicantRegion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 */
	@Override
	public void removeByapplicantRegion(long mtCore, String applicantRegion) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findByapplicantRegion(
				mtCore, applicantRegion, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and applicantRegion = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantRegion the applicant region
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countByapplicantRegion(long mtCore, String applicantRegion) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTREGION;

		Object[] finderArgs = new Object[] { mtCore, applicantRegion };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTREGION_MTCORE_2);

			boolean bindApplicantRegion = false;

			if (applicantRegion == null) {
				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_1);
			}
			else if (applicantRegion.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_3);
			}
			else {
				bindApplicantRegion = true;

				query.append(_FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantRegion) {
					qPos.add(applicantRegion);
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

	private static final String _FINDER_COLUMN_APPLICANTREGION_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_1 =
		"vrApplicantProfileHistory.applicantRegion IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_2 =
		"vrApplicantProfileHistory.applicantRegion = ?";
	private static final String _FINDER_COLUMN_APPLICANTREGION_APPLICANTREGION_3 =
		"(vrApplicantProfileHistory.applicantRegion IS NULL OR vrApplicantProfileHistory.applicantRegion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCITY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantCity",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCITY =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapplicantCity",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.APPLICANTCITY_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTCITY = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantCity",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore,
		String applicantCity) {
		return findByapplicantCity(mtCore, applicantCity, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore,
		String applicantCity, int start, int end) {
		return findByapplicantCity(mtCore, applicantCity, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore,
		String applicantCity, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findByapplicantCity(mtCore, applicantCity, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantCity(long mtCore,
		String applicantCity, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCITY;
			finderArgs = new Object[] { mtCore, applicantCity };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTCITY;
			finderArgs = new Object[] {
					mtCore, applicantCity,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(applicantCity,
								vrApplicantProfileHistory.getApplicantCity())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCITY_MTCORE_2);

			boolean bindApplicantCity = false;

			if (applicantCity == null) {
				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_1);
			}
			else if (applicantCity.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_3);
			}
			else {
				bindApplicantCity = true;

				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCity) {
					qPos.add(applicantCity);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantCity_First(long mtCore,
		String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantCity_First(mtCore,
				applicantCity, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCity=");
		msg.append(applicantCity);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantCity_First(long mtCore,
		String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findByapplicantCity(mtCore,
				applicantCity, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantCity_Last(long mtCore,
		String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantCity_Last(mtCore,
				applicantCity, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantCity=");
		msg.append(applicantCity);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantCity_Last(long mtCore,
		String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countByapplicantCity(mtCore, applicantCity);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findByapplicantCity(mtCore,
				applicantCity, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findByapplicantCity_PrevAndNext(
		long id, long mtCore, String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getByapplicantCity_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantCity,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getByapplicantCity_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantCity,
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

	protected VRApplicantProfileHistory getByapplicantCity_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String applicantCity,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTCITY_MTCORE_2);

		boolean bindApplicantCity = false;

		if (applicantCity == null) {
			query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_1);
		}
		else if (applicantCity.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_3);
		}
		else {
			bindApplicantCity = true;

			query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindApplicantCity) {
			qPos.add(applicantCity);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and applicantCity = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 */
	@Override
	public void removeByapplicantCity(long mtCore, String applicantCity) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findByapplicantCity(
				mtCore, applicantCity, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and applicantCity = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantCity the applicant city
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countByapplicantCity(long mtCore, String applicantCity) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTCITY;

		Object[] finderArgs = new Object[] { mtCore, applicantCity };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTCITY_MTCORE_2);

			boolean bindApplicantCity = false;

			if (applicantCity == null) {
				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_1);
			}
			else if (applicantCity.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_3);
			}
			else {
				bindApplicantCity = true;

				query.append(_FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantCity) {
					qPos.add(applicantCity);
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

	private static final String _FINDER_COLUMN_APPLICANTCITY_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_1 = "vrApplicantProfileHistory.applicantCity IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_2 = "vrApplicantProfileHistory.applicantCity = ?";
	private static final String _FINDER_COLUMN_APPLICANTCITY_APPLICANTCITY_3 = "(vrApplicantProfileHistory.applicantCity IS NULL OR vrApplicantProfileHistory.applicantCity = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTSTATUS =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTSTATUS =
		new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByapplicantStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			VRApplicantProfileHistoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.APPLICANTSTATUS_COLUMN_BITMASK |
			VRApplicantProfileHistoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTSTATUS = new FinderPath(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @return the matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore,
		String applicantStatus) {
		return findByapplicantStatus(mtCore, applicantStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore,
		String applicantStatus, int start, int end) {
		return findByapplicantStatus(mtCore, applicantStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore,
		String applicantStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findByapplicantStatus(mtCore, applicantStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findByapplicantStatus(long mtCore,
		String applicantStatus, int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTSTATUS;
			finderArgs = new Object[] { mtCore, applicantStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTSTATUS;
			finderArgs = new Object[] {
					mtCore, applicantStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRApplicantProfileHistory vrApplicantProfileHistory : list) {
					if ((mtCore != vrApplicantProfileHistory.getMtCore()) ||
							!Objects.equals(applicantStatus,
								vrApplicantProfileHistory.getApplicantStatus())) {
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

			query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTSTATUS_MTCORE_2);

			boolean bindApplicantStatus = false;

			if (applicantStatus == null) {
				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_1);
			}
			else if (applicantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_3);
			}
			else {
				bindApplicantStatus = true;

				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantStatus) {
					qPos.add(applicantStatus);
				}

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantStatus_First(long mtCore,
		String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantStatus_First(mtCore,
				applicantStatus, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantStatus=");
		msg.append(applicantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the first vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantStatus_First(long mtCore,
		String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		List<VRApplicantProfileHistory> list = findByapplicantStatus(mtCore,
				applicantStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByapplicantStatus_Last(long mtCore,
		String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByapplicantStatus_Last(mtCore,
				applicantStatus, orderByComparator);

		if (vrApplicantProfileHistory != null) {
			return vrApplicantProfileHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantStatus=");
		msg.append(applicantStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRApplicantProfileHistoryException(msg.toString());
	}

	/**
	 * Returns the last vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr applicant profile history, or <code>null</code> if a matching vr applicant profile history could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByapplicantStatus_Last(long mtCore,
		String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		int count = countByapplicantStatus(mtCore, applicantStatus);

		if (count == 0) {
			return null;
		}

		List<VRApplicantProfileHistory> list = findByapplicantStatus(mtCore,
				applicantStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr applicant profile histories before and after the current vr applicant profile history in the ordered set where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param id the primary key of the current vr applicant profile history
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory[] findByapplicantStatus_PrevAndNext(
		long id, long mtCore, String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory[] array = new VRApplicantProfileHistoryImpl[3];

			array[0] = getByapplicantStatus_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantStatus,
					orderByComparator, true);

			array[1] = vrApplicantProfileHistory;

			array[2] = getByapplicantStatus_PrevAndNext(session,
					vrApplicantProfileHistory, mtCore, applicantStatus,
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

	protected VRApplicantProfileHistory getByapplicantStatus_PrevAndNext(
		Session session, VRApplicantProfileHistory vrApplicantProfileHistory,
		long mtCore, String applicantStatus,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTSTATUS_MTCORE_2);

		boolean bindApplicantStatus = false;

		if (applicantStatus == null) {
			query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_1);
		}
		else if (applicantStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_3);
		}
		else {
			bindApplicantStatus = true;

			query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_2);
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
			query.append(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindApplicantStatus) {
			qPos.add(applicantStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrApplicantProfileHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRApplicantProfileHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 */
	@Override
	public void removeByapplicantStatus(long mtCore, String applicantStatus) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findByapplicantStatus(
				mtCore, applicantStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories where mtCore = &#63; and applicantStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantStatus the applicant status
	 * @return the number of matching vr applicant profile histories
	 */
	@Override
	public int countByapplicantStatus(long mtCore, String applicantStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTSTATUS;

		Object[] finderArgs = new Object[] { mtCore, applicantStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTSTATUS_MTCORE_2);

			boolean bindApplicantStatus = false;

			if (applicantStatus == null) {
				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_1);
			}
			else if (applicantStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_3);
			}
			else {
				bindApplicantStatus = true;

				query.append(_FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindApplicantStatus) {
					qPos.add(applicantStatus);
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

	private static final String _FINDER_COLUMN_APPLICANTSTATUS_MTCORE_2 = "vrApplicantProfileHistory.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_1 =
		"vrApplicantProfileHistory.applicantStatus IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_2 =
		"vrApplicantProfileHistory.applicantStatus = ?";
	private static final String _FINDER_COLUMN_APPLICANTSTATUS_APPLICANTSTATUS_3 =
		"(vrApplicantProfileHistory.applicantStatus IS NULL OR vrApplicantProfileHistory.applicantStatus = '')";

	public VRApplicantProfileHistoryPersistenceImpl() {
		setModelClass(VRApplicantProfileHistory.class);
	}

	/**
	 * Caches the vr applicant profile history in the entity cache if it is enabled.
	 *
	 * @param vrApplicantProfileHistory the vr applicant profile history
	 */
	@Override
	public void cacheResult(VRApplicantProfileHistory vrApplicantProfileHistory) {
		entityCache.putResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			vrApplicantProfileHistory.getPrimaryKey(), vrApplicantProfileHistory);

		vrApplicantProfileHistory.resetOriginalValues();
	}

	/**
	 * Caches the vr applicant profile histories in the entity cache if it is enabled.
	 *
	 * @param vrApplicantProfileHistories the vr applicant profile histories
	 */
	@Override
	public void cacheResult(
		List<VRApplicantProfileHistory> vrApplicantProfileHistories) {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : vrApplicantProfileHistories) {
			if (entityCache.getResult(
						VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
						VRApplicantProfileHistoryImpl.class,
						vrApplicantProfileHistory.getPrimaryKey()) == null) {
				cacheResult(vrApplicantProfileHistory);
			}
			else {
				vrApplicantProfileHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr applicant profile histories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRApplicantProfileHistoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr applicant profile history.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRApplicantProfileHistory vrApplicantProfileHistory) {
		entityCache.removeResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			vrApplicantProfileHistory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRApplicantProfileHistory> vrApplicantProfileHistories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRApplicantProfileHistory vrApplicantProfileHistory : vrApplicantProfileHistories) {
			entityCache.removeResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
				VRApplicantProfileHistoryImpl.class,
				vrApplicantProfileHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr applicant profile history with the primary key. Does not add the vr applicant profile history to the database.
	 *
	 * @param id the primary key for the new vr applicant profile history
	 * @return the new vr applicant profile history
	 */
	@Override
	public VRApplicantProfileHistory create(long id) {
		VRApplicantProfileHistory vrApplicantProfileHistory = new VRApplicantProfileHistoryImpl();

		vrApplicantProfileHistory.setNew(true);
		vrApplicantProfileHistory.setPrimaryKey(id);

		return vrApplicantProfileHistory;
	}

	/**
	 * Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr applicant profile history
	 * @return the vr applicant profile history that was removed
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory remove(long id)
		throws NoSuchVRApplicantProfileHistoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr applicant profile history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr applicant profile history
	 * @return the vr applicant profile history that was removed
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory remove(Serializable primaryKey)
		throws NoSuchVRApplicantProfileHistoryException {
		Session session = null;

		try {
			session = openSession();

			VRApplicantProfileHistory vrApplicantProfileHistory = (VRApplicantProfileHistory)session.get(VRApplicantProfileHistoryImpl.class,
					primaryKey);

			if (vrApplicantProfileHistory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRApplicantProfileHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrApplicantProfileHistory);
		}
		catch (NoSuchVRApplicantProfileHistoryException nsee) {
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
	protected VRApplicantProfileHistory removeImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		vrApplicantProfileHistory = toUnwrappedModel(vrApplicantProfileHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrApplicantProfileHistory)) {
				vrApplicantProfileHistory = (VRApplicantProfileHistory)session.get(VRApplicantProfileHistoryImpl.class,
						vrApplicantProfileHistory.getPrimaryKeyObj());
			}

			if (vrApplicantProfileHistory != null) {
				session.delete(vrApplicantProfileHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrApplicantProfileHistory != null) {
			clearCache(vrApplicantProfileHistory);
		}

		return vrApplicantProfileHistory;
	}

	@Override
	public VRApplicantProfileHistory updateImpl(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		vrApplicantProfileHistory = toUnwrappedModel(vrApplicantProfileHistory);

		boolean isNew = vrApplicantProfileHistory.isNew();

		VRApplicantProfileHistoryModelImpl vrApplicantProfileHistoryModelImpl = (VRApplicantProfileHistoryModelImpl)vrApplicantProfileHistory;

		Session session = null;

		try {
			session = openSession();

			if (vrApplicantProfileHistory.isNew()) {
				session.save(vrApplicantProfileHistory);

				vrApplicantProfileHistory.setNew(false);
			}
			else {
				vrApplicantProfileHistory = (VRApplicantProfileHistory)session.merge(vrApplicantProfileHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!VRApplicantProfileHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalMappingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getMappingStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGSTATUS,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalApplicantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getApplicantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCODE,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_CTY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalMappingMA_CTY()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGMA_CTY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_CTY,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getMappingMA_CTY()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGMA_CTY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGMA_CTY,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGTEN_CTY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalMappingTEN_CTY()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGTEN_CTY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGTEN_CTY,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getMappingTEN_CTY()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MAPPINGTEN_CTY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MAPPINGTEN_CTY,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTREGION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalApplicantRegion()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTREGION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTREGION,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getApplicantRegion()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTREGION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTREGION,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalApplicantCity()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCITY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCITY,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getApplicantCity()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTCITY,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTCITY,
					args);
			}

			if ((vrApplicantProfileHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getOriginalMtCore(),
						vrApplicantProfileHistoryModelImpl.getOriginalApplicantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTSTATUS,
					args);

				args = new Object[] {
						vrApplicantProfileHistoryModelImpl.getMtCore(),
						vrApplicantProfileHistoryModelImpl.getApplicantStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTSTATUS,
					args);
			}
		}

		entityCache.putResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
			VRApplicantProfileHistoryImpl.class,
			vrApplicantProfileHistory.getPrimaryKey(),
			vrApplicantProfileHistory, false);

		vrApplicantProfileHistory.resetOriginalValues();

		return vrApplicantProfileHistory;
	}

	protected VRApplicantProfileHistory toUnwrappedModel(
		VRApplicantProfileHistory vrApplicantProfileHistory) {
		if (vrApplicantProfileHistory instanceof VRApplicantProfileHistoryImpl) {
			return vrApplicantProfileHistory;
		}

		VRApplicantProfileHistoryImpl vrApplicantProfileHistoryImpl = new VRApplicantProfileHistoryImpl();

		vrApplicantProfileHistoryImpl.setNew(vrApplicantProfileHistory.isNew());
		vrApplicantProfileHistoryImpl.setPrimaryKey(vrApplicantProfileHistory.getPrimaryKey());

		vrApplicantProfileHistoryImpl.setId(vrApplicantProfileHistory.getId());
		vrApplicantProfileHistoryImpl.setMtCore(vrApplicantProfileHistory.getMtCore());
		vrApplicantProfileHistoryImpl.setMappingMA_CTY(vrApplicantProfileHistory.getMappingMA_CTY());
		vrApplicantProfileHistoryImpl.setMappingTEN_CTY(vrApplicantProfileHistory.getMappingTEN_CTY());
		vrApplicantProfileHistoryImpl.setMappingDIA_CHI_CTY(vrApplicantProfileHistory.getMappingDIA_CHI_CTY());
		vrApplicantProfileHistoryImpl.setMappingNote(vrApplicantProfileHistory.getMappingNote());
		vrApplicantProfileHistoryImpl.setMappingStatus(vrApplicantProfileHistory.getMappingStatus());
		vrApplicantProfileHistoryImpl.setApplicantCode(vrApplicantProfileHistory.getApplicantCode());
		vrApplicantProfileHistoryImpl.setApplicantName(vrApplicantProfileHistory.getApplicantName());
		vrApplicantProfileHistoryImpl.setApplicantAddress(vrApplicantProfileHistory.getApplicantAddress());
		vrApplicantProfileHistoryImpl.setApplicantRepresentative(vrApplicantProfileHistory.getApplicantRepresentative());
		vrApplicantProfileHistoryImpl.setApplicantRepresentativeTitle(vrApplicantProfileHistory.getApplicantRepresentativeTitle());
		vrApplicantProfileHistoryImpl.setApplicantPhone(vrApplicantProfileHistory.getApplicantPhone());
		vrApplicantProfileHistoryImpl.setApplicantEmail(vrApplicantProfileHistory.getApplicantEmail());
		vrApplicantProfileHistoryImpl.setApplicantFax(vrApplicantProfileHistory.getApplicantFax());
		vrApplicantProfileHistoryImpl.setApplicantContactName(vrApplicantProfileHistory.getApplicantContactName());
		vrApplicantProfileHistoryImpl.setApplicantContactEmail(vrApplicantProfileHistory.getApplicantContactEmail());
		vrApplicantProfileHistoryImpl.setApplicantContactPhone(vrApplicantProfileHistory.getApplicantContactPhone());
		vrApplicantProfileHistoryImpl.setApplicantNationality(vrApplicantProfileHistory.getApplicantNationality());
		vrApplicantProfileHistoryImpl.setApplicantRegion(vrApplicantProfileHistory.getApplicantRegion());
		vrApplicantProfileHistoryImpl.setApplicantCity(vrApplicantProfileHistory.getApplicantCity());
		vrApplicantProfileHistoryImpl.setMarkupCorporation(vrApplicantProfileHistory.getMarkupCorporation());
		vrApplicantProfileHistoryImpl.setCorporationId(vrApplicantProfileHistory.getCorporationId());
		vrApplicantProfileHistoryImpl.setMarkupDesigner(vrApplicantProfileHistory.getMarkupDesigner());
		vrApplicantProfileHistoryImpl.setMarkupOverseasManufacturer(vrApplicantProfileHistory.getMarkupOverseasManufacturer());
		vrApplicantProfileHistoryImpl.setMarkupDomesticsManufacturer(vrApplicantProfileHistory.getMarkupDomesticsManufacturer());
		vrApplicantProfileHistoryImpl.setMarkupImporter(vrApplicantProfileHistory.getMarkupImporter());
		vrApplicantProfileHistoryImpl.setMarkupComponentXCG(vrApplicantProfileHistory.getMarkupComponentXCG());
		vrApplicantProfileHistoryImpl.setMarkupComponentXMY(vrApplicantProfileHistory.getMarkupComponentXMY());
		vrApplicantProfileHistoryImpl.setMarkupComponentXCD(vrApplicantProfileHistory.getMarkupComponentXCD());
		vrApplicantProfileHistoryImpl.setMarkupComponentXDD(vrApplicantProfileHistory.getMarkupComponentXDD());
		vrApplicantProfileHistoryImpl.setMarkupComponentXCN(vrApplicantProfileHistory.getMarkupComponentXCN());
		vrApplicantProfileHistoryImpl.setMarkupComponentXCH(vrApplicantProfileHistory.getMarkupComponentXCH());
		vrApplicantProfileHistoryImpl.setMarkupXCG(vrApplicantProfileHistory.getMarkupXCG());
		vrApplicantProfileHistoryImpl.setMarkupXMY(vrApplicantProfileHistory.getMarkupXMY());
		vrApplicantProfileHistoryImpl.setMarkupXCD(vrApplicantProfileHistory.getMarkupXCD());
		vrApplicantProfileHistoryImpl.setMarkupXDD(vrApplicantProfileHistory.getMarkupXDD());
		vrApplicantProfileHistoryImpl.setMarkupXCN(vrApplicantProfileHistory.getMarkupXCN());
		vrApplicantProfileHistoryImpl.setMarkupXCH(vrApplicantProfileHistory.getMarkupXCH());
		vrApplicantProfileHistoryImpl.setIssueTypeXCG(vrApplicantProfileHistory.getIssueTypeXCG());
		vrApplicantProfileHistoryImpl.setIssueTypeXMY(vrApplicantProfileHistory.getIssueTypeXMY());
		vrApplicantProfileHistoryImpl.setIssueTypeXCD(vrApplicantProfileHistory.getIssueTypeXCD());
		vrApplicantProfileHistoryImpl.setIssueTypeXDD(vrApplicantProfileHistory.getIssueTypeXDD());
		vrApplicantProfileHistoryImpl.setIssueTypeXCN(vrApplicantProfileHistory.getIssueTypeXCN());
		vrApplicantProfileHistoryImpl.setIssueTypeXCH(vrApplicantProfileHistory.getIssueTypeXCH());
		vrApplicantProfileHistoryImpl.setIssueTypeDescription(vrApplicantProfileHistory.getIssueTypeDescription());
		vrApplicantProfileHistoryImpl.setApplicantCeremonyDate(vrApplicantProfileHistory.getApplicantCeremonyDate());
		vrApplicantProfileHistoryImpl.setApplicantOperationPeriod(vrApplicantProfileHistory.getApplicantOperationPeriod());
		vrApplicantProfileHistoryImpl.setApplicantBusinessType(vrApplicantProfileHistory.getApplicantBusinessType());
		vrApplicantProfileHistoryImpl.setApplicantMetadata(vrApplicantProfileHistory.getApplicantMetadata());
		vrApplicantProfileHistoryImpl.setApplicantStatus(vrApplicantProfileHistory.getApplicantStatus());
		vrApplicantProfileHistoryImpl.setModifyDate(vrApplicantProfileHistory.getModifyDate());
		vrApplicantProfileHistoryImpl.setSyncDate(vrApplicantProfileHistory.getSyncDate());

		return vrApplicantProfileHistoryImpl;
	}

	/**
	 * Returns the vr applicant profile history with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr applicant profile history
	 * @return the vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRApplicantProfileHistoryException {
		VRApplicantProfileHistory vrApplicantProfileHistory = fetchByPrimaryKey(primaryKey);

		if (vrApplicantProfileHistory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRApplicantProfileHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrApplicantProfileHistory;
	}

	/**
	 * Returns the vr applicant profile history with the primary key or throws a {@link NoSuchVRApplicantProfileHistoryException} if it could not be found.
	 *
	 * @param id the primary key of the vr applicant profile history
	 * @return the vr applicant profile history
	 * @throws NoSuchVRApplicantProfileHistoryException if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory findByPrimaryKey(long id)
		throws NoSuchVRApplicantProfileHistoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr applicant profile history
	 * @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
				VRApplicantProfileHistoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRApplicantProfileHistory vrApplicantProfileHistory = (VRApplicantProfileHistory)serializable;

		if (vrApplicantProfileHistory == null) {
			Session session = null;

			try {
				session = openSession();

				vrApplicantProfileHistory = (VRApplicantProfileHistory)session.get(VRApplicantProfileHistoryImpl.class,
						primaryKey);

				if (vrApplicantProfileHistory != null) {
					cacheResult(vrApplicantProfileHistory);
				}
				else {
					entityCache.putResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
						VRApplicantProfileHistoryImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrApplicantProfileHistory;
	}

	/**
	 * Returns the vr applicant profile history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr applicant profile history
	 * @return the vr applicant profile history, or <code>null</code> if a vr applicant profile history with the primary key could not be found
	 */
	@Override
	public VRApplicantProfileHistory fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRApplicantProfileHistory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRApplicantProfileHistory> map = new HashMap<Serializable, VRApplicantProfileHistory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRApplicantProfileHistory vrApplicantProfileHistory = fetchByPrimaryKey(primaryKey);

			if (vrApplicantProfileHistory != null) {
				map.put(primaryKey, vrApplicantProfileHistory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileHistoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRApplicantProfileHistory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE_PKS_IN);

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

			for (VRApplicantProfileHistory vrApplicantProfileHistory : (List<VRApplicantProfileHistory>)q.list()) {
				map.put(vrApplicantProfileHistory.getPrimaryKeyObj(),
					vrApplicantProfileHistory);

				cacheResult(vrApplicantProfileHistory);

				uncachedPrimaryKeys.remove(vrApplicantProfileHistory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRApplicantProfileHistoryModelImpl.ENTITY_CACHE_ENABLED,
					VRApplicantProfileHistoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr applicant profile histories.
	 *
	 * @return the vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr applicant profile histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @return the range of vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr applicant profile histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRApplicantProfileHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr applicant profile histories
	 * @param end the upper bound of the range of vr applicant profile histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr applicant profile histories
	 */
	@Override
	public List<VRApplicantProfileHistory> findAll(int start, int end,
		OrderByComparator<VRApplicantProfileHistory> orderByComparator,
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

		List<VRApplicantProfileHistory> list = null;

		if (retrieveFromCache) {
			list = (List<VRApplicantProfileHistory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRAPPLICANTPROFILEHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRAPPLICANTPROFILEHISTORY;

				if (pagination) {
					sql = sql.concat(VRApplicantProfileHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRApplicantProfileHistory>)QueryUtil.list(q,
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
	 * Removes all the vr applicant profile histories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRApplicantProfileHistory vrApplicantProfileHistory : findAll()) {
			remove(vrApplicantProfileHistory);
		}
	}

	/**
	 * Returns the number of vr applicant profile histories.
	 *
	 * @return the number of vr applicant profile histories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRAPPLICANTPROFILEHISTORY);

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
		return VRApplicantProfileHistoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr applicant profile history persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRApplicantProfileHistoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRAPPLICANTPROFILEHISTORY = "SELECT vrApplicantProfileHistory FROM VRApplicantProfileHistory vrApplicantProfileHistory";
	private static final String _SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE_PKS_IN =
		"SELECT vrApplicantProfileHistory FROM VRApplicantProfileHistory vrApplicantProfileHistory WHERE id IN (";
	private static final String _SQL_SELECT_VRAPPLICANTPROFILEHISTORY_WHERE = "SELECT vrApplicantProfileHistory FROM VRApplicantProfileHistory vrApplicantProfileHistory WHERE ";
	private static final String _SQL_COUNT_VRAPPLICANTPROFILEHISTORY = "SELECT COUNT(vrApplicantProfileHistory) FROM VRApplicantProfileHistory vrApplicantProfileHistory";
	private static final String _SQL_COUNT_VRAPPLICANTPROFILEHISTORY_WHERE = "SELECT COUNT(vrApplicantProfileHistory) FROM VRApplicantProfileHistory vrApplicantProfileHistory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrApplicantProfileHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRApplicantProfileHistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRApplicantProfileHistory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRApplicantProfileHistoryPersistenceImpl.class);
}