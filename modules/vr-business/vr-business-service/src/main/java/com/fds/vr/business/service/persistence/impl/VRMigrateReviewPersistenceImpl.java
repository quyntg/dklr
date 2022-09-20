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

import com.fds.vr.business.exception.NoSuchVRMigrateReviewException;
import com.fds.vr.business.model.VRMigrateReview;
import com.fds.vr.business.model.impl.VRMigrateReviewImpl;
import com.fds.vr.business.model.impl.VRMigrateReviewModelImpl;
import com.fds.vr.business.service.persistence.VRMigrateReviewPersistence;

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
import java.util.Set;

/**
 * The persistence implementation for the vr migrate review service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRMigrateReviewPersistence
 * @see com.fds.vr.business.service.persistence.VRMigrateReviewUtil
 * @generated
 */
@ProviderType
public class VRMigrateReviewPersistenceImpl extends BasePersistenceImpl<VRMigrateReview>
	implements VRMigrateReviewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRMigrateReviewUtil} to access the vr migrate review persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRMigrateReviewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateReviewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateReviewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TASKMIGRATIONID =
		new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateReviewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBytaskMigrationID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TASKMIGRATIONID =
		new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED,
			VRMigrateReviewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytaskMigrationID",
			new String[] { Integer.class.getName() },
			VRMigrateReviewModelImpl.TASKMIGRATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TASKMIGRATIONID = new FinderPath(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBytaskMigrationID", new String[] { Integer.class.getName() });

	/**
	 * Returns all the vr migrate reviews where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @return the matching vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findBytaskMigrationID(int taskMigrationID) {
		return findBytaskMigrationID(taskMigrationID, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr migrate reviews where taskMigrationID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @return the range of matching vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findBytaskMigrationID(int taskMigrationID,
		int start, int end) {
		return findBytaskMigrationID(taskMigrationID, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr migrate reviews where taskMigrationID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findBytaskMigrationID(int taskMigrationID,
		int start, int end, OrderByComparator<VRMigrateReview> orderByComparator) {
		return findBytaskMigrationID(taskMigrationID, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr migrate reviews where taskMigrationID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param taskMigrationID the task migration ID
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findBytaskMigrationID(int taskMigrationID,
		int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TASKMIGRATIONID;
			finderArgs = new Object[] { taskMigrationID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TASKMIGRATIONID;
			finderArgs = new Object[] {
					taskMigrationID,
					
					start, end, orderByComparator
				};
		}

		List<VRMigrateReview> list = null;

		if (retrieveFromCache) {
			list = (List<VRMigrateReview>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRMigrateReview vrMigrateReview : list) {
					if ((taskMigrationID != vrMigrateReview.getTaskMigrationID())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VRMIGRATEREVIEW_WHERE);

			query.append(_FINDER_COLUMN_TASKMIGRATIONID_TASKMIGRATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRMigrateReviewModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taskMigrationID);

				if (!pagination) {
					list = (List<VRMigrateReview>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMigrateReview>)QueryUtil.list(q,
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
	 * Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr migrate review
	 * @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	 */
	@Override
	public VRMigrateReview findBytaskMigrationID_First(int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException {
		VRMigrateReview vrMigrateReview = fetchBytaskMigrationID_First(taskMigrationID,
				orderByComparator);

		if (vrMigrateReview != null) {
			return vrMigrateReview;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taskMigrationID=");
		msg.append(taskMigrationID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRMigrateReviewException(msg.toString());
	}

	/**
	 * Returns the first vr migrate review in the ordered set where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	 */
	@Override
	public VRMigrateReview fetchBytaskMigrationID_First(int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		List<VRMigrateReview> list = findBytaskMigrationID(taskMigrationID, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr migrate review
	 * @throws NoSuchVRMigrateReviewException if a matching vr migrate review could not be found
	 */
	@Override
	public VRMigrateReview findBytaskMigrationID_Last(int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException {
		VRMigrateReview vrMigrateReview = fetchBytaskMigrationID_Last(taskMigrationID,
				orderByComparator);

		if (vrMigrateReview != null) {
			return vrMigrateReview;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("taskMigrationID=");
		msg.append(taskMigrationID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRMigrateReviewException(msg.toString());
	}

	/**
	 * Returns the last vr migrate review in the ordered set where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr migrate review, or <code>null</code> if a matching vr migrate review could not be found
	 */
	@Override
	public VRMigrateReview fetchBytaskMigrationID_Last(int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		int count = countBytaskMigrationID(taskMigrationID);

		if (count == 0) {
			return null;
		}

		List<VRMigrateReview> list = findBytaskMigrationID(taskMigrationID,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr migrate reviews before and after the current vr migrate review in the ordered set where taskMigrationID = &#63;.
	 *
	 * @param id the primary key of the current vr migrate review
	 * @param taskMigrationID the task migration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr migrate review
	 * @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview[] findBytaskMigrationID_PrevAndNext(long id,
		int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator)
		throws NoSuchVRMigrateReviewException {
		VRMigrateReview vrMigrateReview = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRMigrateReview[] array = new VRMigrateReviewImpl[3];

			array[0] = getBytaskMigrationID_PrevAndNext(session,
					vrMigrateReview, taskMigrationID, orderByComparator, true);

			array[1] = vrMigrateReview;

			array[2] = getBytaskMigrationID_PrevAndNext(session,
					vrMigrateReview, taskMigrationID, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRMigrateReview getBytaskMigrationID_PrevAndNext(
		Session session, VRMigrateReview vrMigrateReview, int taskMigrationID,
		OrderByComparator<VRMigrateReview> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRMIGRATEREVIEW_WHERE);

		query.append(_FINDER_COLUMN_TASKMIGRATIONID_TASKMIGRATIONID_2);

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
			query.append(VRMigrateReviewModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(taskMigrationID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrMigrateReview);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRMigrateReview> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr migrate reviews where taskMigrationID = &#63; from the database.
	 *
	 * @param taskMigrationID the task migration ID
	 */
	@Override
	public void removeBytaskMigrationID(int taskMigrationID) {
		for (VRMigrateReview vrMigrateReview : findBytaskMigrationID(
				taskMigrationID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrMigrateReview);
		}
	}

	/**
	 * Returns the number of vr migrate reviews where taskMigrationID = &#63;.
	 *
	 * @param taskMigrationID the task migration ID
	 * @return the number of matching vr migrate reviews
	 */
	@Override
	public int countBytaskMigrationID(int taskMigrationID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TASKMIGRATIONID;

		Object[] finderArgs = new Object[] { taskMigrationID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRMIGRATEREVIEW_WHERE);

			query.append(_FINDER_COLUMN_TASKMIGRATIONID_TASKMIGRATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(taskMigrationID);

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

	private static final String _FINDER_COLUMN_TASKMIGRATIONID_TASKMIGRATIONID_2 =
		"vrMigrateReview.taskMigrationID = ?";

	public VRMigrateReviewPersistenceImpl() {
		setModelClass(VRMigrateReview.class);
	}

	/**
	 * Caches the vr migrate review in the entity cache if it is enabled.
	 *
	 * @param vrMigrateReview the vr migrate review
	 */
	@Override
	public void cacheResult(VRMigrateReview vrMigrateReview) {
		entityCache.putResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewImpl.class, vrMigrateReview.getPrimaryKey(),
			vrMigrateReview);

		vrMigrateReview.resetOriginalValues();
	}

	/**
	 * Caches the vr migrate reviews in the entity cache if it is enabled.
	 *
	 * @param vrMigrateReviews the vr migrate reviews
	 */
	@Override
	public void cacheResult(List<VRMigrateReview> vrMigrateReviews) {
		for (VRMigrateReview vrMigrateReview : vrMigrateReviews) {
			if (entityCache.getResult(
						VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateReviewImpl.class,
						vrMigrateReview.getPrimaryKey()) == null) {
				cacheResult(vrMigrateReview);
			}
			else {
				vrMigrateReview.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr migrate reviews.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRMigrateReviewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr migrate review.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRMigrateReview vrMigrateReview) {
		entityCache.removeResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewImpl.class, vrMigrateReview.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRMigrateReview> vrMigrateReviews) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRMigrateReview vrMigrateReview : vrMigrateReviews) {
			entityCache.removeResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateReviewImpl.class, vrMigrateReview.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr migrate review with the primary key. Does not add the vr migrate review to the database.
	 *
	 * @param id the primary key for the new vr migrate review
	 * @return the new vr migrate review
	 */
	@Override
	public VRMigrateReview create(long id) {
		VRMigrateReview vrMigrateReview = new VRMigrateReviewImpl();

		vrMigrateReview.setNew(true);
		vrMigrateReview.setPrimaryKey(id);

		return vrMigrateReview;
	}

	/**
	 * Removes the vr migrate review with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr migrate review
	 * @return the vr migrate review that was removed
	 * @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview remove(long id)
		throws NoSuchVRMigrateReviewException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr migrate review with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr migrate review
	 * @return the vr migrate review that was removed
	 * @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview remove(Serializable primaryKey)
		throws NoSuchVRMigrateReviewException {
		Session session = null;

		try {
			session = openSession();

			VRMigrateReview vrMigrateReview = (VRMigrateReview)session.get(VRMigrateReviewImpl.class,
					primaryKey);

			if (vrMigrateReview == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRMigrateReviewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrMigrateReview);
		}
		catch (NoSuchVRMigrateReviewException nsee) {
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
	protected VRMigrateReview removeImpl(VRMigrateReview vrMigrateReview) {
		vrMigrateReview = toUnwrappedModel(vrMigrateReview);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrMigrateReview)) {
				vrMigrateReview = (VRMigrateReview)session.get(VRMigrateReviewImpl.class,
						vrMigrateReview.getPrimaryKeyObj());
			}

			if (vrMigrateReview != null) {
				session.delete(vrMigrateReview);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrMigrateReview != null) {
			clearCache(vrMigrateReview);
		}

		return vrMigrateReview;
	}

	@Override
	public VRMigrateReview updateImpl(VRMigrateReview vrMigrateReview) {
		vrMigrateReview = toUnwrappedModel(vrMigrateReview);

		boolean isNew = vrMigrateReview.isNew();

		VRMigrateReviewModelImpl vrMigrateReviewModelImpl = (VRMigrateReviewModelImpl)vrMigrateReview;

		Session session = null;

		try {
			session = openSession();

			if (vrMigrateReview.isNew()) {
				session.save(vrMigrateReview);

				vrMigrateReview.setNew(false);
			}
			else {
				vrMigrateReview = (VRMigrateReview)session.merge(vrMigrateReview);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRMigrateReviewModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrMigrateReviewModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TASKMIGRATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrMigrateReviewModelImpl.getOriginalTaskMigrationID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TASKMIGRATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TASKMIGRATIONID,
					args);

				args = new Object[] {
						vrMigrateReviewModelImpl.getTaskMigrationID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TASKMIGRATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TASKMIGRATIONID,
					args);
			}
		}

		entityCache.putResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
			VRMigrateReviewImpl.class, vrMigrateReview.getPrimaryKey(),
			vrMigrateReview, false);

		vrMigrateReview.resetOriginalValues();

		return vrMigrateReview;
	}

	protected VRMigrateReview toUnwrappedModel(VRMigrateReview vrMigrateReview) {
		if (vrMigrateReview instanceof VRMigrateReviewImpl) {
			return vrMigrateReview;
		}

		VRMigrateReviewImpl vrMigrateReviewImpl = new VRMigrateReviewImpl();

		vrMigrateReviewImpl.setNew(vrMigrateReview.isNew());
		vrMigrateReviewImpl.setPrimaryKey(vrMigrateReview.getPrimaryKey());

		vrMigrateReviewImpl.setId(vrMigrateReview.getId());
		vrMigrateReviewImpl.setDataGroupID(vrMigrateReview.getDataGroupID());
		vrMigrateReviewImpl.setMigrateTableName(vrMigrateReview.getMigrateTableName());
		vrMigrateReviewImpl.setMigrationConfiguration(vrMigrateReview.getMigrationConfiguration());
		vrMigrateReviewImpl.setSequenceNo(vrMigrateReview.getSequenceNo());
		vrMigrateReviewImpl.setTaskMigrationID(vrMigrateReview.getTaskMigrationID());
		vrMigrateReviewImpl.setMigrateRows(vrMigrateReview.getMigrateRows());
		vrMigrateReviewImpl.setMigrateRemarks(vrMigrateReview.getMigrateRemarks());

		return vrMigrateReviewImpl;
	}

	/**
	 * Returns the vr migrate review with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate review
	 * @return the vr migrate review
	 * @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRMigrateReviewException {
		VRMigrateReview vrMigrateReview = fetchByPrimaryKey(primaryKey);

		if (vrMigrateReview == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRMigrateReviewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrMigrateReview;
	}

	/**
	 * Returns the vr migrate review with the primary key or throws a {@link NoSuchVRMigrateReviewException} if it could not be found.
	 *
	 * @param id the primary key of the vr migrate review
	 * @return the vr migrate review
	 * @throws NoSuchVRMigrateReviewException if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview findByPrimaryKey(long id)
		throws NoSuchVRMigrateReviewException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr migrate review with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr migrate review
	 * @return the vr migrate review, or <code>null</code> if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
				VRMigrateReviewImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRMigrateReview vrMigrateReview = (VRMigrateReview)serializable;

		if (vrMigrateReview == null) {
			Session session = null;

			try {
				session = openSession();

				vrMigrateReview = (VRMigrateReview)session.get(VRMigrateReviewImpl.class,
						primaryKey);

				if (vrMigrateReview != null) {
					cacheResult(vrMigrateReview);
				}
				else {
					entityCache.putResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
						VRMigrateReviewImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateReviewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrMigrateReview;
	}

	/**
	 * Returns the vr migrate review with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr migrate review
	 * @return the vr migrate review, or <code>null</code> if a vr migrate review with the primary key could not be found
	 */
	@Override
	public VRMigrateReview fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRMigrateReview> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRMigrateReview> map = new HashMap<Serializable, VRMigrateReview>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRMigrateReview vrMigrateReview = fetchByPrimaryKey(primaryKey);

			if (vrMigrateReview != null) {
				map.put(primaryKey, vrMigrateReview);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateReviewImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRMigrateReview)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRMIGRATEREVIEW_WHERE_PKS_IN);

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

			for (VRMigrateReview vrMigrateReview : (List<VRMigrateReview>)q.list()) {
				map.put(vrMigrateReview.getPrimaryKeyObj(), vrMigrateReview);

				cacheResult(vrMigrateReview);

				uncachedPrimaryKeys.remove(vrMigrateReview.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRMigrateReviewModelImpl.ENTITY_CACHE_ENABLED,
					VRMigrateReviewImpl.class, primaryKey, nullModel);
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
	 * Returns all the vr migrate reviews.
	 *
	 * @return the vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr migrate reviews.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @return the range of vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr migrate reviews.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findAll(int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr migrate reviews.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRMigrateReviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr migrate reviews
	 * @param end the upper bound of the range of vr migrate reviews (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr migrate reviews
	 */
	@Override
	public List<VRMigrateReview> findAll(int start, int end,
		OrderByComparator<VRMigrateReview> orderByComparator,
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

		List<VRMigrateReview> list = null;

		if (retrieveFromCache) {
			list = (List<VRMigrateReview>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRMIGRATEREVIEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRMIGRATEREVIEW;

				if (pagination) {
					sql = sql.concat(VRMigrateReviewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRMigrateReview>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRMigrateReview>)QueryUtil.list(q,
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
	 * Removes all the vr migrate reviews from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRMigrateReview vrMigrateReview : findAll()) {
			remove(vrMigrateReview);
		}
	}

	/**
	 * Returns the number of vr migrate reviews.
	 *
	 * @return the number of vr migrate reviews
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRMIGRATEREVIEW);

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
		return VRMigrateReviewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr migrate review persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRMigrateReviewImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRMIGRATEREVIEW = "SELECT vrMigrateReview FROM VRMigrateReview vrMigrateReview";
	private static final String _SQL_SELECT_VRMIGRATEREVIEW_WHERE_PKS_IN = "SELECT vrMigrateReview FROM VRMigrateReview vrMigrateReview WHERE id IN (";
	private static final String _SQL_SELECT_VRMIGRATEREVIEW_WHERE = "SELECT vrMigrateReview FROM VRMigrateReview vrMigrateReview WHERE ";
	private static final String _SQL_COUNT_VRMIGRATEREVIEW = "SELECT COUNT(vrMigrateReview) FROM VRMigrateReview vrMigrateReview";
	private static final String _SQL_COUNT_VRMIGRATEREVIEW_WHERE = "SELECT COUNT(vrMigrateReview) FROM VRMigrateReview vrMigrateReview WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrMigrateReview.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRMigrateReview exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRMigrateReview exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRMigrateReviewPersistenceImpl.class);
}