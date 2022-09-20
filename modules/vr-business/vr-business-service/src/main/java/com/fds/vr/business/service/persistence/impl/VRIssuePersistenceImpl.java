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

import com.fds.vr.business.exception.NoSuchVRIssueException;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.impl.VRIssueImpl;
import com.fds.vr.business.model.impl.VRIssueModelImpl;
import com.fds.vr.business.service.persistence.VRIssuePersistence;

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
import com.liferay.portal.kernel.util.StringUtil;
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
 * The persistence implementation for the vr issue service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRIssuePersistence
 * @see com.fds.vr.business.service.persistence.VRIssueUtil
 * @generated
 */
@ProviderType
public class VRIssuePersistenceImpl extends BasePersistenceImpl<VRIssue>
	implements VRIssuePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRIssueUtil} to access the vr issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRIssueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findBydossierId(long mtCore, long dossierId) {
		return findBydossierId(mtCore, dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end) {
		return findBydossierId(mtCore, dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator) {
		return findBydossierId(mtCore, dossierId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBydossierId(long mtCore, long dossierId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator,
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

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							(dossierId != vrIssue.getDossierId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBydossierId_First(mtCore, dossierId,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBydossierId_First(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findBydossierId(mtCore, dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBydossierId_Last(mtCore, dossierId,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBydossierId_Last(long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator) {
		int count = countBydossierId(mtCore, dossierId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findBydossierId(mtCore, dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findBydossierId_PrevAndNext(long id, long mtCore,
		long dossierId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getBydossierId_PrevAndNext(session, vrIssue, mtCore,
					dossierId, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getBydossierId_PrevAndNext(session, vrIssue, mtCore,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getBydossierId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, long dossierId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBydossierId(long mtCore, long dossierId) {
		for (VRIssue vrIssue : findBydossierId(mtCore, dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countBydossierId(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrIssue.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STAMPISSUENO =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystampIssueNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STAMPISSUENO =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystampIssueNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.STAMPISSUENO_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STAMPISSUENO = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystampIssueNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findBystampIssueNo(long mtCore, String stampIssueNo) {
		return findBystampIssueNo(mtCore, stampIssueNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBystampIssueNo(long mtCore, String stampIssueNo,
		int start, int end) {
		return findBystampIssueNo(mtCore, stampIssueNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBystampIssueNo(long mtCore, String stampIssueNo,
		int start, int end, OrderByComparator<VRIssue> orderByComparator) {
		return findBystampIssueNo(mtCore, stampIssueNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBystampIssueNo(long mtCore, String stampIssueNo,
		int start, int end, OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STAMPISSUENO;
			finderArgs = new Object[] { mtCore, stampIssueNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STAMPISSUENO;
			finderArgs = new Object[] {
					mtCore, stampIssueNo,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							!Objects.equals(stampIssueNo,
								vrIssue.getStampIssueNo())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_STAMPISSUENO_MTCORE_2);

			boolean bindStampIssueNo = false;

			if (stampIssueNo == null) {
				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_1);
			}
			else if (stampIssueNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_3);
			}
			else {
				bindStampIssueNo = true;

				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindStampIssueNo) {
					qPos.add(stampIssueNo);
				}

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBystampIssueNo_First(long mtCore, String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBystampIssueNo_First(mtCore, stampIssueNo,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", stampIssueNo=");
		msg.append(stampIssueNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBystampIssueNo_First(long mtCore, String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findBystampIssueNo(mtCore, stampIssueNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBystampIssueNo_Last(long mtCore, String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBystampIssueNo_Last(mtCore, stampIssueNo,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", stampIssueNo=");
		msg.append(stampIssueNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBystampIssueNo_Last(long mtCore, String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator) {
		int count = countBystampIssueNo(mtCore, stampIssueNo);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findBystampIssueNo(mtCore, stampIssueNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findBystampIssueNo_PrevAndNext(long id, long mtCore,
		String stampIssueNo, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getBystampIssueNo_PrevAndNext(session, vrIssue, mtCore,
					stampIssueNo, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getBystampIssueNo_PrevAndNext(session, vrIssue, mtCore,
					stampIssueNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getBystampIssueNo_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, String stampIssueNo,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_STAMPISSUENO_MTCORE_2);

		boolean bindStampIssueNo = false;

		if (stampIssueNo == null) {
			query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_1);
		}
		else if (stampIssueNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_3);
		}
		else {
			bindStampIssueNo = true;

			query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_2);
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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindStampIssueNo) {
			qPos.add(stampIssueNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and stampIssueNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 */
	@Override
	public void removeBystampIssueNo(long mtCore, String stampIssueNo) {
		for (VRIssue vrIssue : findBystampIssueNo(mtCore, stampIssueNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and stampIssueNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param stampIssueNo the stamp issue no
	 * @return the number of matching vr issues
	 */
	@Override
	public int countBystampIssueNo(long mtCore, String stampIssueNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STAMPISSUENO;

		Object[] finderArgs = new Object[] { mtCore, stampIssueNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_STAMPISSUENO_MTCORE_2);

			boolean bindStampIssueNo = false;

			if (stampIssueNo == null) {
				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_1);
			}
			else if (stampIssueNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_3);
			}
			else {
				bindStampIssueNo = true;

				query.append(_FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindStampIssueNo) {
					qPos.add(stampIssueNo);
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

	private static final String _FINDER_COLUMN_STAMPISSUENO_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_1 = "vrIssue.stampIssueNo IS NULL";
	private static final String _FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_2 = "vrIssue.stampIssueNo = ?";
	private static final String _FINDER_COLUMN_STAMPISSUENO_STAMPISSUENO_3 = "(vrIssue.stampIssueNo IS NULL OR vrIssue.stampIssueNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantProfileId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRIssueModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) {
		return findByapplicantProfileId(mtCore, dossierId, applicantProfileId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId, int start, int end) {
		return findByapplicantProfileId(mtCore, dossierId, applicantProfileId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findByapplicantProfileId(mtCore, dossierId, applicantProfileId,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] { mtCore, dossierId, applicantProfileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] {
					mtCore, dossierId, applicantProfileId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							(dossierId != vrIssue.getDossierId()) ||
							(applicantProfileId != vrIssue.getApplicantProfileId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				qPos.add(applicantProfileId);

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByapplicantProfileId_First(long mtCore, long dossierId,
		long applicantProfileId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByapplicantProfileId_First(mtCore, dossierId,
				applicantProfileId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByapplicantProfileId_First(long mtCore, long dossierId,
		long applicantProfileId, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findByapplicantProfileId(mtCore, dossierId,
				applicantProfileId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByapplicantProfileId_Last(long mtCore, long dossierId,
		long applicantProfileId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByapplicantProfileId_Last(mtCore, dossierId,
				applicantProfileId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", dossierId=");
		msg.append(dossierId);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByapplicantProfileId_Last(long mtCore, long dossierId,
		long applicantProfileId, OrderByComparator<VRIssue> orderByComparator) {
		int count = countByapplicantProfileId(mtCore, dossierId,
				applicantProfileId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findByapplicantProfileId(mtCore, dossierId,
				applicantProfileId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findByapplicantProfileId_PrevAndNext(long id, long mtCore,
		long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getByapplicantProfileId_PrevAndNext(session, vrIssue,
					mtCore, dossierId, applicantProfileId, orderByComparator,
					true);

			array[1] = vrIssue;

			array[2] = getByapplicantProfileId_PrevAndNext(session, vrIssue,
					mtCore, dossierId, applicantProfileId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getByapplicantProfileId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, long dossierId, long applicantProfileId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(dossierId);

		qPos.add(applicantProfileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 */
	@Override
	public void removeByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) {
		for (VRIssue vrIssue : findByapplicantProfileId(mtCore, dossierId,
				applicantProfileId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and dossierId = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByapplicantProfileId(long mtCore, long dossierId,
		long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] { mtCore, dossierId, applicantProfileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				qPos.add(applicantProfileId);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_DOSSIERID_2 = "vrIssue.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrIssue.applicantProfileId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycorporationId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycorporationId",
			new String[] { Long.class.getName(), String.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycorporationId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findBycorporationId(long mtCore, String corporationId) {
		return findBycorporationId(mtCore, corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycorporationId(long mtCore, String corporationId,
		int start, int end) {
		return findBycorporationId(mtCore, corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycorporationId(long mtCore, String corporationId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator) {
		return findBycorporationId(mtCore, corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycorporationId(long mtCore, String corporationId,
		int start, int end, OrderByComparator<VRIssue> orderByComparator,
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

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							!Objects.equals(corporationId,
								vrIssue.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBycorporationId_First(long mtCore, String corporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBycorporationId_First(mtCore, corporationId,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBycorporationId_First(long mtCore,
		String corporationId, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findBycorporationId(mtCore, corporationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBycorporationId_Last(long mtCore, String corporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBycorporationId_Last(mtCore, corporationId,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBycorporationId_Last(long mtCore, String corporationId,
		OrderByComparator<VRIssue> orderByComparator) {
		int count = countBycorporationId(mtCore, corporationId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findBycorporationId(mtCore, corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findBycorporationId_PrevAndNext(long id, long mtCore,
		String corporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getBycorporationId_PrevAndNext(session, vrIssue, mtCore,
					corporationId, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getBycorporationId_PrevAndNext(session, vrIssue, mtCore,
					corporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getBycorporationId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, String corporationId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and corporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeBycorporationId(long mtCore, String corporationId) {
		for (VRIssue vrIssue : findBycorporationId(mtCore, corporationId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and corporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param corporationId the corporation ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countBycorporationId(long mtCore, String corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_CORPORATIONID_MTCORE_2);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCorporationId) {
					qPos.add(corporationId);
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

	private static final String _FINDER_COLUMN_CORPORATIONID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "vrIssue.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrIssue.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(vrIssue.corporationId IS NULL OR vrIssue.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUECORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByissueCorporationId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUECORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissueCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.ISSUECORPORATIONID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUECORPORATIONID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissueCorporationId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId) {
		return findByissueCorporationId(mtCore, issueCorporationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end) {
		return findByissueCorporationId(mtCore, issueCorporationId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findByissueCorporationId(mtCore, issueCorporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByissueCorporationId(long mtCore,
		long issueCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUECORPORATIONID;
			finderArgs = new Object[] { mtCore, issueCorporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUECORPORATIONID;
			finderArgs = new Object[] {
					mtCore, issueCorporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							(issueCorporationId != vrIssue.getIssueCorporationId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_ISSUECORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUECORPORATIONID_ISSUECORPORATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueCorporationId);

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByissueCorporationId_First(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByissueCorporationId_First(mtCore,
				issueCorporationId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueCorporationId=");
		msg.append(issueCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByissueCorporationId_First(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findByissueCorporationId(mtCore,
				issueCorporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByissueCorporationId_Last(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByissueCorporationId_Last(mtCore,
				issueCorporationId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", issueCorporationId=");
		msg.append(issueCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByissueCorporationId_Last(long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		int count = countByissueCorporationId(mtCore, issueCorporationId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findByissueCorporationId(mtCore,
				issueCorporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findByissueCorporationId_PrevAndNext(long id, long mtCore,
		long issueCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getByissueCorporationId_PrevAndNext(session, vrIssue,
					mtCore, issueCorporationId, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getByissueCorporationId_PrevAndNext(session, vrIssue,
					mtCore, issueCorporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getByissueCorporationId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, long issueCorporationId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_ISSUECORPORATIONID_MTCORE_2);

		query.append(_FINDER_COLUMN_ISSUECORPORATIONID_ISSUECORPORATIONID_2);

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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(issueCorporationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and issueCorporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 */
	@Override
	public void removeByissueCorporationId(long mtCore, long issueCorporationId) {
		for (VRIssue vrIssue : findByissueCorporationId(mtCore,
				issueCorporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and issueCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param issueCorporationId the issue corporation ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByissueCorporationId(long mtCore, long issueCorporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUECORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, issueCorporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_ISSUECORPORATIONID_MTCORE_2);

			query.append(_FINDER_COLUMN_ISSUECORPORATIONID_ISSUECORPORATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(issueCorporationId);

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

	private static final String _FINDER_COLUMN_ISSUECORPORATIONID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_ISSUECORPORATIONID_ISSUECORPORATIONID_2 =
		"vrIssue.issueCorporationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VERIFYCORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByverifyCorporationId",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFYCORPORATIONID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByverifyCorporationId",
			new String[] { Long.class.getName(), String.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.VERIFYCORPORATIONID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VERIFYCORPORATIONID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByverifyCorporationId",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findByverifyCorporationId(long mtCore,
		String verifyCorporationId) {
		return findByverifyCorporationId(mtCore, verifyCorporationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByverifyCorporationId(long mtCore,
		String verifyCorporationId, int start, int end) {
		return findByverifyCorporationId(mtCore, verifyCorporationId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByverifyCorporationId(long mtCore,
		String verifyCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findByverifyCorporationId(mtCore, verifyCorporationId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByverifyCorporationId(long mtCore,
		String verifyCorporationId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFYCORPORATIONID;
			finderArgs = new Object[] { mtCore, verifyCorporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VERIFYCORPORATIONID;
			finderArgs = new Object[] {
					mtCore, verifyCorporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							!Objects.equals(verifyCorporationId,
								vrIssue.getVerifyCorporationId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_MTCORE_2);

			boolean bindVerifyCorporationId = false;

			if (verifyCorporationId == null) {
				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_1);
			}
			else if (verifyCorporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_3);
			}
			else {
				bindVerifyCorporationId = true;

				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindVerifyCorporationId) {
					qPos.add(verifyCorporationId);
				}

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByverifyCorporationId_First(long mtCore,
		String verifyCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByverifyCorporationId_First(mtCore,
				verifyCorporationId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", verifyCorporationId=");
		msg.append(verifyCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByverifyCorporationId_First(long mtCore,
		String verifyCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findByverifyCorporationId(mtCore,
				verifyCorporationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByverifyCorporationId_Last(long mtCore,
		String verifyCorporationId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByverifyCorporationId_Last(mtCore,
				verifyCorporationId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", verifyCorporationId=");
		msg.append(verifyCorporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByverifyCorporationId_Last(long mtCore,
		String verifyCorporationId, OrderByComparator<VRIssue> orderByComparator) {
		int count = countByverifyCorporationId(mtCore, verifyCorporationId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findByverifyCorporationId(mtCore,
				verifyCorporationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findByverifyCorporationId_PrevAndNext(long id,
		long mtCore, String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getByverifyCorporationId_PrevAndNext(session, vrIssue,
					mtCore, verifyCorporationId, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getByverifyCorporationId_PrevAndNext(session, vrIssue,
					mtCore, verifyCorporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getByverifyCorporationId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, String verifyCorporationId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_MTCORE_2);

		boolean bindVerifyCorporationId = false;

		if (verifyCorporationId == null) {
			query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_1);
		}
		else if (verifyCorporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_3);
		}
		else {
			bindVerifyCorporationId = true;

			query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_2);
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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindVerifyCorporationId) {
			qPos.add(verifyCorporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and verifyCorporationId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 */
	@Override
	public void removeByverifyCorporationId(long mtCore,
		String verifyCorporationId) {
		for (VRIssue vrIssue : findByverifyCorporationId(mtCore,
				verifyCorporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and verifyCorporationId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param verifyCorporationId the verify corporation ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByverifyCorporationId(long mtCore,
		String verifyCorporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VERIFYCORPORATIONID;

		Object[] finderArgs = new Object[] { mtCore, verifyCorporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_MTCORE_2);

			boolean bindVerifyCorporationId = false;

			if (verifyCorporationId == null) {
				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_1);
			}
			else if (verifyCorporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_3);
			}
			else {
				bindVerifyCorporationId = true;

				query.append(_FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindVerifyCorporationId) {
					qPos.add(verifyCorporationId);
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

	private static final String _FINDER_COLUMN_VERIFYCORPORATIONID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_1 =
		"vrIssue.verifyCorporationId IS NULL";
	private static final String _FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_2 =
		"vrIssue.verifyCorporationId = ?";
	private static final String _FINDER_COLUMN_VERIFYCORPORATIONID_VERIFYCORPORATIONID_3 =
		"(vrIssue.verifyCorporationId IS NULL OR vrIssue.verifyCorporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByproductionPlantId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTID =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.PRODUCTIONPLANTID_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId) {
		return findByproductionPlantId(mtCore, productionPlantId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end) {
		return findByproductionPlantId(mtCore, productionPlantId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findByproductionPlantId(mtCore, productionPlantId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByproductionPlantId(long mtCore,
		long productionPlantId, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTID;
			finderArgs = new Object[] { mtCore, productionPlantId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTID;
			finderArgs = new Object[] {
					mtCore, productionPlantId,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							(productionPlantId != vrIssue.getProductionPlantId())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_PRODUCTIONPLANTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(productionPlantId);

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByproductionPlantId_First(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByproductionPlantId_First(mtCore,
				productionPlantId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantId=");
		msg.append(productionPlantId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByproductionPlantId_First(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findByproductionPlantId(mtCore, productionPlantId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByproductionPlantId_Last(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByproductionPlantId_Last(mtCore,
				productionPlantId, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantId=");
		msg.append(productionPlantId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByproductionPlantId_Last(long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator) {
		int count = countByproductionPlantId(mtCore, productionPlantId);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findByproductionPlantId(mtCore, productionPlantId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findByproductionPlantId_PrevAndNext(long id, long mtCore,
		long productionPlantId, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getByproductionPlantId_PrevAndNext(session, vrIssue,
					mtCore, productionPlantId, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getByproductionPlantId_PrevAndNext(session, vrIssue,
					mtCore, productionPlantId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getByproductionPlantId_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, long productionPlantId,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_PRODUCTIONPLANTID_2);

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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(productionPlantId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and productionPlantId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 */
	@Override
	public void removeByproductionPlantId(long mtCore, long productionPlantId) {
		for (VRIssue vrIssue : findByproductionPlantId(mtCore,
				productionPlantId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and productionPlantId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantId the production plant ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByproductionPlantId(long mtCore, long productionPlantId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTID;

		Object[] finderArgs = new Object[] { mtCore, productionPlantId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTID_PRODUCTIONPLANTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(productionPlantId);

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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTID_PRODUCTIONPLANTID_2 =
		"vrIssue.productionPlantId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findBycopReportNo(long mtCore, String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycopReportNo(long mtCore, String copReportNo,
		int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycopReportNo(long mtCore, String copReportNo,
		int start, int end, OrderByComparator<VRIssue> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findBycopReportNo(long mtCore, String copReportNo,
		int start, int end, OrderByComparator<VRIssue> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] { mtCore, copReportNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO;
			finderArgs = new Object[] {
					mtCore, copReportNo,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((mtCore != vrIssue.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrIssue.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

			boolean bindCopReportNo = false;

			if (copReportNo == null) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
			}
			else if (copReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
			}
			else {
				bindCopReportNo = true;

				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportNo) {
					qPos.add(copReportNo);
				}

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBycopReportNo_First(long mtCore, String copReportNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBycopReportNo_First(mtCore, copReportNo,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBycopReportNo_First(long mtCore, String copReportNo,
		OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findBycopReportNo(mtCore, copReportNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findBycopReportNo_Last(long mtCore, String copReportNo,
		OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchBycopReportNo_Last(mtCore, copReportNo,
				orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchBycopReportNo_Last(long mtCore, String copReportNo,
		OrderByComparator<VRIssue> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findBycopReportNo(mtCore, copReportNo, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findBycopReportNo_PrevAndNext(long id, long mtCore,
		String copReportNo, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session, vrIssue, mtCore,
					copReportNo, orderByComparator, true);

			array[1] = vrIssue;

			array[2] = getBycopReportNo_PrevAndNext(session, vrIssue, mtCore,
					copReportNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getBycopReportNo_PrevAndNext(Session session,
		VRIssue vrIssue, long mtCore, String copReportNo,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

		boolean bindCopReportNo = false;

		if (copReportNo == null) {
			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
		}
		else if (copReportNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
		}
		else {
			bindCopReportNo = true;

			query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCopReportNo) {
			qPos.add(copReportNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRIssue vrIssue : findBycopReportNo(mtCore, copReportNo,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vr issues
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTNO_MTCORE_2);

			boolean bindCopReportNo = false;

			if (copReportNo == null) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1);
			}
			else if (copReportNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3);
			}
			else {
				bindCopReportNo = true;

				query.append(_FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportNo) {
					qPos.add(copReportNo);
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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrIssue.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrIssue.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrIssue.copReportNo IS NULL OR vrIssue.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IC_IS = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIC_IS",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IC_IS = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIC_IS",
			new String[] { Long.class.getName(), Integer.class.getName() },
			VRIssueModelImpl.ISSUECORPORATIONID_COLUMN_BITMASK |
			VRIssueModelImpl.DIGITALISSUESTATUS_COLUMN_BITMASK |
			VRIssueModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IC_IS = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIC_IS",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @return the matching vr issues
	 */
	@Override
	public List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus) {
		return findByIC_IS(issueCorporationId, digitalIssueStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end) {
		return findByIC_IS(issueCorporationId, digitalIssueStatus, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findByIC_IS(issueCorporationId, digitalIssueStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr issues
	 */
	@Override
	public List<VRIssue> findByIC_IS(long issueCorporationId,
		int digitalIssueStatus, int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IC_IS;
			finderArgs = new Object[] { issueCorporationId, digitalIssueStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IC_IS;
			finderArgs = new Object[] {
					issueCorporationId, digitalIssueStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (VRIssue vrIssue : list) {
					if ((issueCorporationId != vrIssue.getIssueCorporationId()) ||
							(digitalIssueStatus != vrIssue.getDigitalIssueStatus())) {
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

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_IC_IS_ISSUECORPORATIONID_2);

			query.append(_FINDER_COLUMN_IC_IS_DIGITALISSUESTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueCorporationId);

				qPos.add(digitalIssueStatus);

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByIC_IS_First(issueCorporationId,
				digitalIssueStatus, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueCorporationId=");
		msg.append(issueCorporationId);

		msg.append(", digitalIssueStatus=");
		msg.append(digitalIssueStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the first vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByIC_IS_First(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator) {
		List<VRIssue> list = findByIC_IS(issueCorporationId,
				digitalIssueStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByIC_IS_Last(issueCorporationId,
				digitalIssueStatus, orderByComparator);

		if (vrIssue != null) {
			return vrIssue;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueCorporationId=");
		msg.append(issueCorporationId);

		msg.append(", digitalIssueStatus=");
		msg.append(digitalIssueStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRIssueException(msg.toString());
	}

	/**
	 * Returns the last vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByIC_IS_Last(long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator) {
		int count = countByIC_IS(issueCorporationId, digitalIssueStatus);

		if (count == 0) {
			return null;
		}

		List<VRIssue> list = findByIC_IS(issueCorporationId,
				digitalIssueStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr issues before and after the current vr issue in the ordered set where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param id the primary key of the current vr issue
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue[] findByIC_IS_PrevAndNext(long id, long issueCorporationId,
		int digitalIssueStatus, OrderByComparator<VRIssue> orderByComparator)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRIssue[] array = new VRIssueImpl[3];

			array[0] = getByIC_IS_PrevAndNext(session, vrIssue,
					issueCorporationId, digitalIssueStatus, orderByComparator,
					true);

			array[1] = vrIssue;

			array[2] = getByIC_IS_PrevAndNext(session, vrIssue,
					issueCorporationId, digitalIssueStatus, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRIssue getByIC_IS_PrevAndNext(Session session, VRIssue vrIssue,
		long issueCorporationId, int digitalIssueStatus,
		OrderByComparator<VRIssue> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRISSUE_WHERE);

		query.append(_FINDER_COLUMN_IC_IS_ISSUECORPORATIONID_2);

		query.append(_FINDER_COLUMN_IC_IS_DIGITALISSUESTATUS_2);

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
			query.append(VRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issueCorporationId);

		qPos.add(digitalIssueStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63; from the database.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 */
	@Override
	public void removeByIC_IS(long issueCorporationId, int digitalIssueStatus) {
		for (VRIssue vrIssue : findByIC_IS(issueCorporationId,
				digitalIssueStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues where issueCorporationId = &#63; and digitalIssueStatus = &#63;.
	 *
	 * @param issueCorporationId the issue corporation ID
	 * @param digitalIssueStatus the digital issue status
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByIC_IS(long issueCorporationId, int digitalIssueStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IC_IS;

		Object[] finderArgs = new Object[] {
				issueCorporationId, digitalIssueStatus
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_IC_IS_ISSUECORPORATIONID_2);

			query.append(_FINDER_COLUMN_IC_IS_DIGITALISSUESTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issueCorporationId);

				qPos.add(digitalIssueStatus);

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

	private static final String _FINDER_COLUMN_IC_IS_ISSUECORPORATIONID_2 = "vrIssue.issueCorporationId = ? AND ";
	private static final String _FINDER_COLUMN_IC_IS_DIGITALISSUESTATUS_2 = "vrIssue.digitalIssueStatus = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_MT_DID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, VRIssueImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByF_MT_DID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRIssueModelImpl.MTCORE_COLUMN_BITMASK |
			VRIssueModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_MT_DID = new FinderPath(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_MT_DID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the vr issue where mtCore = &#63; and dossierId = &#63; or throws a {@link NoSuchVRIssueException} if it could not be found.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr issue
	 * @throws NoSuchVRIssueException if a matching vr issue could not be found
	 */
	@Override
	public VRIssue findByF_MT_DID(long mtCore, long dossierId)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByF_MT_DID(mtCore, dossierId);

		if (vrIssue == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mtCore=");
			msg.append(mtCore);

			msg.append(", dossierId=");
			msg.append(dossierId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRIssueException(msg.toString());
		}

		return vrIssue;
	}

	/**
	 * Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByF_MT_DID(long mtCore, long dossierId) {
		return fetchByF_MT_DID(mtCore, dossierId, true);
	}

	/**
	 * Returns the vr issue where mtCore = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vr issue, or <code>null</code> if a matching vr issue could not be found
	 */
	@Override
	public VRIssue fetchByF_MT_DID(long mtCore, long dossierId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_MT_DID,
					finderArgs, this);
		}

		if (result instanceof VRIssue) {
			VRIssue vrIssue = (VRIssue)result;

			if ((mtCore != vrIssue.getMtCore()) ||
					(dossierId != vrIssue.getDossierId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_F_MT_DID_MTCORE_2);

			query.append(_FINDER_COLUMN_F_MT_DID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(dossierId);

				List<VRIssue> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_DID,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRIssuePersistenceImpl.fetchByF_MT_DID(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRIssue vrIssue = list.get(0);

					result = vrIssue;

					cacheResult(vrIssue);

					if ((vrIssue.getMtCore() != mtCore) ||
							(vrIssue.getDossierId() != dossierId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_DID,
							finderArgs, vrIssue);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_DID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (VRIssue)result;
		}
	}

	/**
	 * Removes the vr issue where mtCore = &#63; and dossierId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the vr issue that was removed
	 */
	@Override
	public VRIssue removeByF_MT_DID(long mtCore, long dossierId)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = findByF_MT_DID(mtCore, dossierId);

		return remove(vrIssue);
	}

	/**
	 * Returns the number of vr issues where mtCore = &#63; and dossierId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param dossierId the dossier ID
	 * @return the number of matching vr issues
	 */
	@Override
	public int countByF_MT_DID(long mtCore, long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_MT_DID;

		Object[] finderArgs = new Object[] { mtCore, dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRISSUE_WHERE);

			query.append(_FINDER_COLUMN_F_MT_DID_MTCORE_2);

			query.append(_FINDER_COLUMN_F_MT_DID_DOSSIERID_2);

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

	private static final String _FINDER_COLUMN_F_MT_DID_MTCORE_2 = "vrIssue.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_F_MT_DID_DOSSIERID_2 = "vrIssue.dossierId = ?";

	public VRIssuePersistenceImpl() {
		setModelClass(VRIssue.class);
	}

	/**
	 * Caches the vr issue in the entity cache if it is enabled.
	 *
	 * @param vrIssue the vr issue
	 */
	@Override
	public void cacheResult(VRIssue vrIssue) {
		entityCache.putResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueImpl.class, vrIssue.getPrimaryKey(), vrIssue);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_DID,
			new Object[] { vrIssue.getMtCore(), vrIssue.getDossierId() },
			vrIssue);

		vrIssue.resetOriginalValues();
	}

	/**
	 * Caches the vr issues in the entity cache if it is enabled.
	 *
	 * @param vrIssues the vr issues
	 */
	@Override
	public void cacheResult(List<VRIssue> vrIssues) {
		for (VRIssue vrIssue : vrIssues) {
			if (entityCache.getResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueImpl.class, vrIssue.getPrimaryKey()) == null) {
				cacheResult(vrIssue);
			}
			else {
				vrIssue.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr issues.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRIssueImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr issue.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRIssue vrIssue) {
		entityCache.removeResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueImpl.class, vrIssue.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRIssueModelImpl)vrIssue, true);
	}

	@Override
	public void clearCache(List<VRIssue> vrIssues) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRIssue vrIssue : vrIssues) {
			entityCache.removeResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueImpl.class, vrIssue.getPrimaryKey());

			clearUniqueFindersCache((VRIssueModelImpl)vrIssue, true);
		}
	}

	protected void cacheUniqueFindersCache(VRIssueModelImpl vrIssueModelImpl) {
		Object[] args = new Object[] {
				vrIssueModelImpl.getMtCore(), vrIssueModelImpl.getDossierId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_MT_DID, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_MT_DID, args,
			vrIssueModelImpl, false);
	}

	protected void clearUniqueFindersCache(VRIssueModelImpl vrIssueModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrIssueModelImpl.getMtCore(),
					vrIssueModelImpl.getDossierId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_MT_DID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_DID, args);
		}

		if ((vrIssueModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_MT_DID.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrIssueModelImpl.getOriginalMtCore(),
					vrIssueModelImpl.getOriginalDossierId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_MT_DID, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_MT_DID, args);
		}
	}

	/**
	 * Creates a new vr issue with the primary key. Does not add the vr issue to the database.
	 *
	 * @param id the primary key for the new vr issue
	 * @return the new vr issue
	 */
	@Override
	public VRIssue create(long id) {
		VRIssue vrIssue = new VRIssueImpl();

		vrIssue.setNew(true);
		vrIssue.setPrimaryKey(id);

		return vrIssue;
	}

	/**
	 * Removes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr issue
	 * @return the vr issue that was removed
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue remove(long id) throws NoSuchVRIssueException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr issue
	 * @return the vr issue that was removed
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue remove(Serializable primaryKey)
		throws NoSuchVRIssueException {
		Session session = null;

		try {
			session = openSession();

			VRIssue vrIssue = (VRIssue)session.get(VRIssueImpl.class, primaryKey);

			if (vrIssue == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrIssue);
		}
		catch (NoSuchVRIssueException nsee) {
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
	protected VRIssue removeImpl(VRIssue vrIssue) {
		vrIssue = toUnwrappedModel(vrIssue);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrIssue)) {
				vrIssue = (VRIssue)session.get(VRIssueImpl.class,
						vrIssue.getPrimaryKeyObj());
			}

			if (vrIssue != null) {
				session.delete(vrIssue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrIssue != null) {
			clearCache(vrIssue);
		}

		return vrIssue;
	}

	@Override
	public VRIssue updateImpl(VRIssue vrIssue) {
		vrIssue = toUnwrappedModel(vrIssue);

		boolean isNew = vrIssue.isNew();

		VRIssueModelImpl vrIssueModelImpl = (VRIssueModelImpl)vrIssue;

		Session session = null;

		try {
			session = openSession();

			if (vrIssue.isNew()) {
				session.save(vrIssue);

				vrIssue.setNew(false);
			}
			else {
				vrIssue = (VRIssue)session.merge(vrIssue);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRIssueModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STAMPISSUENO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalStampIssueNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STAMPISSUENO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STAMPISSUENO,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getStampIssueNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STAMPISSUENO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STAMPISSUENO,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalDossierId(),
						vrIssueModelImpl.getOriginalApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getDossierId(),
						vrIssueModelImpl.getApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUECORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalIssueCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUECORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUECORPORATIONID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getIssueCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUECORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUECORPORATIONID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFYCORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalVerifyCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VERIFYCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFYCORPORATIONID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getVerifyCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VERIFYCORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VERIFYCORPORATIONID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalProductionPlantId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTID,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getProductionPlantId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTID,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalMtCore(),
						vrIssueModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrIssueModelImpl.getMtCore(),
						vrIssueModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrIssueModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IC_IS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrIssueModelImpl.getOriginalIssueCorporationId(),
						vrIssueModelImpl.getOriginalDigitalIssueStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IC_IS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IC_IS,
					args);

				args = new Object[] {
						vrIssueModelImpl.getIssueCorporationId(),
						vrIssueModelImpl.getDigitalIssueStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_IC_IS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IC_IS,
					args);
			}
		}

		entityCache.putResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
			VRIssueImpl.class, vrIssue.getPrimaryKey(), vrIssue, false);

		clearUniqueFindersCache(vrIssueModelImpl, false);
		cacheUniqueFindersCache(vrIssueModelImpl);

		vrIssue.resetOriginalValues();

		return vrIssue;
	}

	protected VRIssue toUnwrappedModel(VRIssue vrIssue) {
		if (vrIssue instanceof VRIssueImpl) {
			return vrIssue;
		}

		VRIssueImpl vrIssueImpl = new VRIssueImpl();

		vrIssueImpl.setNew(vrIssue.isNew());
		vrIssueImpl.setPrimaryKey(vrIssue.getPrimaryKey());

		vrIssueImpl.setId(vrIssue.getId());
		vrIssueImpl.setMtCore(vrIssue.getMtCore());
		vrIssueImpl.setDossierId(vrIssue.getDossierId());
		vrIssueImpl.setStampIssueNo(vrIssue.getStampIssueNo());
		vrIssueImpl.setAppliedDate(vrIssue.getAppliedDate());
		vrIssueImpl.setApprovedDate(vrIssue.getApprovedDate());
		vrIssueImpl.setVehicleClass(vrIssue.getVehicleClass());
		vrIssueImpl.setApplicantProfileId(vrIssue.getApplicantProfileId());
		vrIssueImpl.setApplicantName(vrIssue.getApplicantName());
		vrIssueImpl.setApplicantAddress(vrIssue.getApplicantAddress());
		vrIssueImpl.setApplicantRepresentative(vrIssue.getApplicantRepresentative());
		vrIssueImpl.setApplicantRepresentativeTitle(vrIssue.getApplicantRepresentativeTitle());
		vrIssueImpl.setApplicantEmail(vrIssue.getApplicantEmail());
		vrIssueImpl.setApplicantPhone(vrIssue.getApplicantPhone());
		vrIssueImpl.setApplicantFax(vrIssue.getApplicantFax());
		vrIssueImpl.setApplicantContactName(vrIssue.getApplicantContactName());
		vrIssueImpl.setApplicantContactEmail(vrIssue.getApplicantContactEmail());
		vrIssueImpl.setApplicantContactPhone(vrIssue.getApplicantContactPhone());
		vrIssueImpl.setProductionPlantId(vrIssue.getProductionPlantId());
		vrIssueImpl.setProductionPlantCode(vrIssue.getProductionPlantCode());
		vrIssueImpl.setProductionPlantName(vrIssue.getProductionPlantName());
		vrIssueImpl.setProductionPlantAddress(vrIssue.getProductionPlantAddress());
		vrIssueImpl.setRemarks(vrIssue.getRemarks());
		vrIssueImpl.setMethodOfIssue(vrIssue.getMethodOfIssue());
		vrIssueImpl.setTotalInDocument(vrIssue.getTotalInDocument());
		vrIssueImpl.setIssueCorporationId(vrIssue.getIssueCorporationId());
		vrIssueImpl.setVerifyCorporationId(vrIssue.getVerifyCorporationId());
		vrIssueImpl.setDigitalIssueStatus(vrIssue.getDigitalIssueStatus());
		vrIssueImpl.setIssueType(vrIssue.getIssueType());
		vrIssueImpl.setAverageSTBQuantity(vrIssue.getAverageSTBQuantity());
		vrIssueImpl.setMaxMonthQuantity(vrIssue.getMaxMonthQuantity());
		vrIssueImpl.setAverageSTMQuantity(vrIssue.getAverageSTMQuantity());
		vrIssueImpl.setAccumulatedMonthQuantity(vrIssue.getAccumulatedMonthQuantity());
		vrIssueImpl.setTotalInUse(vrIssue.getTotalInUse());
		vrIssueImpl.setTotalCancelled(vrIssue.getTotalCancelled());
		vrIssueImpl.setTotalLost(vrIssue.getTotalLost());
		vrIssueImpl.setTotalNotUsed(vrIssue.getTotalNotUsed());
		vrIssueImpl.setTotalReturned(vrIssue.getTotalReturned());
		vrIssueImpl.setFlow(vrIssue.getFlow());
		vrIssueImpl.setExaminationRequired(vrIssue.getExaminationRequired());
		vrIssueImpl.setExaminationPeriod(vrIssue.getExaminationPeriod());
		vrIssueImpl.setExaminationLastTime(vrIssue.getExaminationLastTime());
		vrIssueImpl.setCopResult(vrIssue.getCopResult());
		vrIssueImpl.setCopReportNo(vrIssue.getCopReportNo());
		vrIssueImpl.setCopReportDate(vrIssue.getCopReportDate());
		vrIssueImpl.setPostReview(vrIssue.getPostReview());
		vrIssueImpl.setPostReviewRecordNo(vrIssue.getPostReviewRecordNo());
		vrIssueImpl.setPostReviewRecordDate(vrIssue.getPostReviewRecordDate());
		vrIssueImpl.setCorporationId(vrIssue.getCorporationId());
		vrIssueImpl.setInspectorCode(vrIssue.getInspectorCode());
		vrIssueImpl.setInspectorName(vrIssue.getInspectorName());
		vrIssueImpl.setLeaderName(vrIssue.getLeaderName());
		vrIssueImpl.setApplicantMaker(vrIssue.getApplicantMaker());
		vrIssueImpl.setApplicantChecker(vrIssue.getApplicantChecker());
		vrIssueImpl.setInspectorId(vrIssue.getInspectorId());
		vrIssueImpl.setIssueInspectorId(vrIssue.getIssueInspectorId());
		vrIssueImpl.setVerifyInspectorId(vrIssue.getVerifyInspectorId());
		vrIssueImpl.setModifyDate(vrIssue.getModifyDate());
		vrIssueImpl.setSyncDate(vrIssue.getSyncDate());
		vrIssueImpl.setCertifiedAssemblyType(vrIssue.getCertifiedAssemblyType());
		vrIssueImpl.setCertifiedAssemblyTypeDescription(vrIssue.getCertifiedAssemblyTypeDescription());

		return vrIssueImpl;
	}

	/**
	 * Returns the vr issue with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue
	 * @return the vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRIssueException {
		VRIssue vrIssue = fetchByPrimaryKey(primaryKey);

		if (vrIssue == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrIssue;
	}

	/**
	 * Returns the vr issue with the primary key or throws a {@link NoSuchVRIssueException} if it could not be found.
	 *
	 * @param id the primary key of the vr issue
	 * @return the vr issue
	 * @throws NoSuchVRIssueException if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue findByPrimaryKey(long id) throws NoSuchVRIssueException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr issue
	 * @return the vr issue, or <code>null</code> if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
				VRIssueImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRIssue vrIssue = (VRIssue)serializable;

		if (vrIssue == null) {
			Session session = null;

			try {
				session = openSession();

				vrIssue = (VRIssue)session.get(VRIssueImpl.class, primaryKey);

				if (vrIssue != null) {
					cacheResult(vrIssue);
				}
				else {
					entityCache.putResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
						VRIssueImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrIssue;
	}

	/**
	 * Returns the vr issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr issue
	 * @return the vr issue, or <code>null</code> if a vr issue with the primary key could not be found
	 */
	@Override
	public VRIssue fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRIssue> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRIssue> map = new HashMap<Serializable, VRIssue>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRIssue vrIssue = fetchByPrimaryKey(primaryKey);

			if (vrIssue != null) {
				map.put(primaryKey, vrIssue);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRIssue)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRISSUE_WHERE_PKS_IN);

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

			for (VRIssue vrIssue : (List<VRIssue>)q.list()) {
				map.put(vrIssue.getPrimaryKeyObj(), vrIssue);

				cacheResult(vrIssue);

				uncachedPrimaryKeys.remove(vrIssue.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRIssueModelImpl.ENTITY_CACHE_ENABLED,
					VRIssueImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr issues.
	 *
	 * @return the vr issues
	 */
	@Override
	public List<VRIssue> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @return the range of vr issues
	 */
	@Override
	public List<VRIssue> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr issues
	 */
	@Override
	public List<VRIssue> findAll(int start, int end,
		OrderByComparator<VRIssue> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr issues
	 * @param end the upper bound of the range of vr issues (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr issues
	 */
	@Override
	public List<VRIssue> findAll(int start, int end,
		OrderByComparator<VRIssue> orderByComparator, boolean retrieveFromCache) {
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

		List<VRIssue> list = null;

		if (retrieveFromCache) {
			list = (List<VRIssue>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRISSUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRISSUE;

				if (pagination) {
					sql = sql.concat(VRIssueModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRIssue>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vr issues from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRIssue vrIssue : findAll()) {
			remove(vrIssue);
		}
	}

	/**
	 * Returns the number of vr issues.
	 *
	 * @return the number of vr issues
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRISSUE);

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
		return VRIssueModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr issue persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRIssueImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRISSUE = "SELECT vrIssue FROM VRIssue vrIssue";
	private static final String _SQL_SELECT_VRISSUE_WHERE_PKS_IN = "SELECT vrIssue FROM VRIssue vrIssue WHERE id IN (";
	private static final String _SQL_SELECT_VRISSUE_WHERE = "SELECT vrIssue FROM VRIssue vrIssue WHERE ";
	private static final String _SQL_COUNT_VRISSUE = "SELECT COUNT(vrIssue) FROM VRIssue vrIssue";
	private static final String _SQL_COUNT_VRISSUE_WHERE = "SELECT COUNT(vrIssue) FROM VRIssue vrIssue WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrIssue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRIssue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRIssue exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRIssuePersistenceImpl.class);
}