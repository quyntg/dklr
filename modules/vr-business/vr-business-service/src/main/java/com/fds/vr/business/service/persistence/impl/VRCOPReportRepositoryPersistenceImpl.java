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

import com.fds.vr.business.exception.NoSuchVRCOPReportRepositoryException;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryImpl;
import com.fds.vr.business.model.impl.VRCOPReportRepositoryModelImpl;
import com.fds.vr.business.service.persistence.VRCOPReportRepositoryPersistence;

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
 * The persistence implementation for the vrcop report repository service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportRepositoryPersistence
 * @see com.fds.vr.business.service.persistence.VRCOPReportRepositoryUtil
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryPersistenceImpl extends BasePersistenceImpl<VRCOPReportRepository>
	implements VRCOPReportRepositoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPReportRepositoryUtil} to access the vrcop report repository persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPReportRepositoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTSTATUS =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportStatus",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTSTATUS =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportStatus",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.COPREPORTSTATUS_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTSTATUS = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportStatus",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore,
		String copReportStatus) {
		return findBycopReportStatus(mtCore, copReportStatus,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore,
		String copReportStatus, int start, int end) {
		return findBycopReportStatus(mtCore, copReportStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore,
		String copReportStatus, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findBycopReportStatus(mtCore, copReportStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBycopReportStatus(long mtCore,
		String copReportStatus, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTSTATUS;
			finderArgs = new Object[] { mtCore, copReportStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTSTATUS;
			finderArgs = new Object[] {
					mtCore, copReportStatus,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							!Objects.equals(copReportStatus,
								vrcopReportRepository.getCopReportStatus())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTSTATUS_MTCORE_2);

			boolean bindCopReportStatus = false;

			if (copReportStatus == null) {
				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_1);
			}
			else if (copReportStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_3);
			}
			else {
				bindCopReportStatus = true;

				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportStatus) {
					qPos.add(copReportStatus);
				}

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findBycopReportStatus_First(long mtCore,
		String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchBycopReportStatus_First(mtCore,
				copReportStatus, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportStatus=");
		msg.append(copReportStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBycopReportStatus_First(long mtCore,
		String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findBycopReportStatus(mtCore,
				copReportStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findBycopReportStatus_Last(long mtCore,
		String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchBycopReportStatus_Last(mtCore,
				copReportStatus, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportStatus=");
		msg.append(copReportStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBycopReportStatus_Last(long mtCore,
		String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countBycopReportStatus(mtCore, copReportStatus);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findBycopReportStatus(mtCore,
				copReportStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findBycopReportStatus_PrevAndNext(long id,
		long mtCore, String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getBycopReportStatus_PrevAndNext(session,
					vrcopReportRepository, mtCore, copReportStatus,
					orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getBycopReportStatus_PrevAndNext(session,
					vrcopReportRepository, mtCore, copReportStatus,
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

	protected VRCOPReportRepository getBycopReportStatus_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, String copReportStatus,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTSTATUS_MTCORE_2);

		boolean bindCopReportStatus = false;

		if (copReportStatus == null) {
			query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_1);
		}
		else if (copReportStatus.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_3);
		}
		else {
			bindCopReportStatus = true;

			query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_2);
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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindCopReportStatus) {
			qPos.add(copReportStatus);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and copReportStatus = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 */
	@Override
	public void removeBycopReportStatus(long mtCore, String copReportStatus) {
		for (VRCOPReportRepository vrcopReportRepository : findBycopReportStatus(
				mtCore, copReportStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and copReportStatus = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportStatus the cop report status
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countBycopReportStatus(long mtCore, String copReportStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTSTATUS;

		Object[] finderArgs = new Object[] { mtCore, copReportStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTSTATUS_MTCORE_2);

			boolean bindCopReportStatus = false;

			if (copReportStatus == null) {
				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_1);
			}
			else if (copReportStatus.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_3);
			}
			else {
				bindCopReportStatus = true;

				query.append(_FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindCopReportStatus) {
					qPos.add(copReportStatus);
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

	private static final String _FINDER_COLUMN_COPREPORTSTATUS_MTCORE_2 = "vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_1 =
		"vrcopReportRepository.copReportStatus IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_2 =
		"vrcopReportRepository.copReportStatus = ?";
	private static final String _FINDER_COLUMN_COPREPORTSTATUS_COPREPORTSTATUS_3 =
		"(vrcopReportRepository.copReportStatus IS NULL OR vrcopReportRepository.copReportStatus = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_COPREPORTNO = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.COPREPORTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findBycopReportNo(long mtCore,
		String copReportNo) throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchBycopReportNo(mtCore,
				copReportNo);

		if (vrcopReportRepository == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("mtCore=");
			msg.append(mtCore);

			msg.append(", copReportNo=");
			msg.append(copReportNo);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCOPReportRepositoryException(msg.toString());
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBycopReportNo(long mtCore,
		String copReportNo) {
		return fetchBycopReportNo(mtCore, copReportNo, true);
	}

	/**
	 * Returns the vrcop report repository where mtCore = &#63; and copReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBycopReportNo(long mtCore,
		String copReportNo, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_COPREPORTNO,
					finderArgs, this);
		}

		if (result instanceof VRCOPReportRepository) {
			VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)result;

			if ((mtCore != vrcopReportRepository.getMtCore()) ||
					!Objects.equals(copReportNo,
						vrcopReportRepository.getCopReportNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

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

				List<VRCOPReportRepository> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_COPREPORTNO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCOPReportRepositoryPersistenceImpl.fetchBycopReportNo(long, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCOPReportRepository vrcopReportRepository = list.get(0);

					result = vrcopReportRepository;

					cacheResult(vrcopReportRepository);

					if ((vrcopReportRepository.getMtCore() != mtCore) ||
							(vrcopReportRepository.getCopReportNo() == null) ||
							!vrcopReportRepository.getCopReportNo()
													  .equals(copReportNo)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_COPREPORTNO,
							finderArgs, vrcopReportRepository);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_COPREPORTNO,
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
			return (VRCOPReportRepository)result;
		}
	}

	/**
	 * Removes the vrcop report repository where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the vrcop report repository that was removed
	 */
	@Override
	public VRCOPReportRepository removeBycopReportNo(long mtCore,
		String copReportNo) throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findBycopReportNo(mtCore,
				copReportNo);

		return remove(vrcopReportRepository);
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopReportRepository.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopReportRepository.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopReportRepository.copReportNo IS NULL OR vrcopReportRepository.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByapplicantProfileId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByapplicantProfileId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTPROFILEID = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByapplicantProfileId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore,
		long applicantProfileId) {
		return findByapplicantProfileId(mtCore, applicantProfileId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end) {
		return findByapplicantProfileId(mtCore, applicantProfileId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findByapplicantProfileId(mtCore, applicantProfileId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByapplicantProfileId(long mtCore,
		long applicantProfileId, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] { mtCore, applicantProfileId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTPROFILEID;
			finderArgs = new Object[] {
					mtCore, applicantProfileId,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							(applicantProfileId != vrcopReportRepository.getApplicantProfileId())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByapplicantProfileId_First(mtCore,
				applicantProfileId, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByapplicantProfileId_First(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findByapplicantProfileId(mtCore,
				applicantProfileId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByapplicantProfileId_Last(mtCore,
				applicantProfileId, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByapplicantProfileId_Last(long mtCore,
		long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countByapplicantProfileId(mtCore, applicantProfileId);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findByapplicantProfileId(mtCore,
				applicantProfileId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findByapplicantProfileId_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getByapplicantProfileId_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getByapplicantProfileId_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
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

	protected VRCOPReportRepository getByapplicantProfileId_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, long applicantProfileId,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 */
	@Override
	public void removeByapplicantProfileId(long mtCore, long applicantProfileId) {
		for (VRCOPReportRepository vrcopReportRepository : findByapplicantProfileId(
				mtCore, applicantProfileId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByapplicantProfileId(long mtCore, long applicantProfileId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTPROFILEID;

		Object[] finderArgs = new Object[] { mtCore, applicantProfileId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2);

			query.append(_FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_MTCORE_2 = "vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_APPLICANTPROFILEID_APPLICANTPROFILEID_2 =
		"vrcopReportRepository.applicantProfileId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantCode_copClassification",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantCode_copClassification",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			},
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.COPCLASSIFICATION_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantCode_copClassification",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, String productionPlantCode, String copClassification) {
		return findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, String productionPlantCode, String copClassification,
		int start, int end) {
		return findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, String productionPlantCode, String copClassification,
		int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findByproductionPlantCode_copClassification(mtCore,
			productionPlantCode, copClassification, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode_copClassification(
		long mtCore, String productionPlantCode, String copClassification,
		int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION;
			finderArgs = new Object[] {
					mtCore, productionPlantCode, copClassification
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION;
			finderArgs = new Object[] {
					mtCore, productionPlantCode, copClassification,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							!Objects.equals(productionPlantCode,
								vrcopReportRepository.getProductionPlantCode()) ||
							!Objects.equals(copClassification,
								vrcopReportRepository.getCopClassification())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_MTCORE_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_2);
			}

			boolean bindCopClassification = false;

			if (copClassification == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_1);
			}
			else if (copClassification.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_3);
			}
			else {
				bindCopClassification = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindCopClassification) {
					qPos.add(copClassification);
				}

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantCode_copClassification_First(
		long mtCore, String productionPlantCode, String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantCode_copClassification_First(mtCore,
				productionPlantCode, copClassification, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", copClassification=");
		msg.append(copClassification);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantCode_copClassification_First(
		long mtCore, String productionPlantCode, String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findByproductionPlantCode_copClassification(mtCore,
				productionPlantCode, copClassification, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantCode_copClassification_Last(
		long mtCore, String productionPlantCode, String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantCode_copClassification_Last(mtCore,
				productionPlantCode, copClassification, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(", copClassification=");
		msg.append(copClassification);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantCode_copClassification_Last(
		long mtCore, String productionPlantCode, String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countByproductionPlantCode_copClassification(mtCore,
				productionPlantCode, copClassification);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findByproductionPlantCode_copClassification(mtCore,
				productionPlantCode, copClassification, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findByproductionPlantCode_copClassification_PrevAndNext(
		long id, long mtCore, String productionPlantCode,
		String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getByproductionPlantCode_copClassification_PrevAndNext(session,
					vrcopReportRepository, mtCore, productionPlantCode,
					copClassification, orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getByproductionPlantCode_copClassification_PrevAndNext(session,
					vrcopReportRepository, mtCore, productionPlantCode,
					copClassification, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPReportRepository getByproductionPlantCode_copClassification_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, String productionPlantCode, String copClassification,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_MTCORE_2);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_2);
		}

		boolean bindCopClassification = false;

		if (copClassification == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_1);
		}
		else if (copClassification.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_3);
		}
		else {
			bindCopClassification = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_2);
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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (bindCopClassification) {
			qPos.add(copClassification);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 */
	@Override
	public void removeByproductionPlantCode_copClassification(long mtCore,
		String productionPlantCode, String copClassification) {
		for (VRCOPReportRepository vrcopReportRepository : findByproductionPlantCode_copClassification(
				mtCore, productionPlantCode, copClassification,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and productionPlantCode = &#63; and copClassification = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param productionPlantCode the production plant code
	 * @param copClassification the cop classification
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByproductionPlantCode_copClassification(long mtCore,
		String productionPlantCode, String copClassification) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION;

		Object[] finderArgs = new Object[] {
				mtCore, productionPlantCode, copClassification
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_MTCORE_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_2);
			}

			boolean bindCopClassification = false;

			if (copClassification == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_1);
			}
			else if (copClassification.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_3);
			}
			else {
				bindCopClassification = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (bindCopClassification) {
					qPos.add(copClassification);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_MTCORE_2 =
		"vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_1 =
		"vrcopReportRepository.productionPlantCode IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_2 =
		"vrcopReportRepository.productionPlantCode = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_PRODUCTIONPLANTCODE_3 =
		"(vrcopReportRepository.productionPlantCode IS NULL OR vrcopReportRepository.productionPlantCode = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_1 =
		"vrcopReportRepository.copClassification IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_2 =
		"vrcopReportRepository.copClassification = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_COPCLASSIFICATION_COPCLASSIFICATION_3 =
		"(vrcopReportRepository.copClassification IS NULL OR vrcopReportRepository.copClassification = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start, int end) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start,
		int end, OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findByproductionPlantCode(mtCore, applicantProfileId,
			productionPlantCode, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode, int start,
		int end, OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							(applicantProfileId != vrcopReportRepository.getApplicantProfileId()) ||
							!Objects.equals(productionPlantCode,
								vrcopReportRepository.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantCode_First(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantCode_First(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantCode_First(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findByproductionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantCode_Last(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantCode_Last(long mtCore,
		long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countByproductionPlantCode(mtCore, applicantProfileId,
				productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findByproductionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findByproductionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getByproductionPlantCode_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantCode, orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getByproductionPlantCode_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPReportRepository getByproductionPlantCode_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeByproductionPlantCode(long mtCore,
		long applicantProfileId, String productionPlantCode) {
		for (VRCOPReportRepository vrcopReportRepository : findByproductionPlantCode(
				mtCore, applicantProfileId, productionPlantCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByproductionPlantCode(long mtCore, long applicantProfileId,
		String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_MTCORE_2 = "vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2 =
		"vrcopReportRepository.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrcopReportRepository.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrcopReportRepository.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrcopReportRepository.productionPlantCode IS NULL OR vrcopReportRepository.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			},
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.PRODUCTIONPLANTNAME_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.PRODUCTIONPLANTADDRESS_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByproductionPlantName",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findByproductionPlantName(mtCore, applicantProfileId,
			productionPlantName, productionPlantAddress, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantAddress
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantName,
					productionPlantAddress,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							(applicantProfileId != vrcopReportRepository.getApplicantProfileId()) ||
							!Objects.equals(productionPlantName,
								vrcopReportRepository.getProductionPlantName()) ||
							!Objects.equals(productionPlantAddress,
								vrcopReportRepository.getProductionPlantAddress())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
				}

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantName_First(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantName_First(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantName_First(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findByproductionPlantName(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByproductionPlantName_Last(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByproductionPlantName_Last(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantName=");
		msg.append(productionPlantName);

		msg.append(", productionPlantAddress=");
		msg.append(productionPlantAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByproductionPlantName_Last(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countByproductionPlantName(mtCore, applicantProfileId,
				productionPlantName, productionPlantAddress);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findByproductionPlantName(mtCore,
				applicantProfileId, productionPlantName,
				productionPlantAddress, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findByproductionPlantName_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantName, String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getByproductionPlantName_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantName, productionPlantAddress,
					orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getByproductionPlantName_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantName, productionPlantAddress,
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

	protected VRCOPReportRepository getByproductionPlantName_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, long applicantProfileId, String productionPlantName,
		String productionPlantAddress,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

		query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

		boolean bindProductionPlantName = false;

		if (productionPlantName == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
		}
		else if (productionPlantName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
		}
		else {
			bindProductionPlantName = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
		}

		boolean bindProductionPlantAddress = false;

		if (productionPlantAddress == null) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_1);
		}
		else if (productionPlantAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_3);
		}
		else {
			bindProductionPlantAddress = true;

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_2);
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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantName) {
			qPos.add(productionPlantName);
		}

		if (bindProductionPlantAddress) {
			qPos.add(productionPlantAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 */
	@Override
	public void removeByproductionPlantName(long mtCore,
		long applicantProfileId, String productionPlantName,
		String productionPlantAddress) {
		for (VRCOPReportRepository vrcopReportRepository : findByproductionPlantName(
				mtCore, applicantProfileId, productionPlantName,
				productionPlantAddress, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantName = &#63; and productionPlantAddress = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantName the production plant name
	 * @param productionPlantAddress the production plant address
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByproductionPlantName(long mtCore, long applicantProfileId,
		String productionPlantName, String productionPlantAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantName,
				productionPlantAddress
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2);

			query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2);

			boolean bindProductionPlantName = false;

			if (productionPlantName == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1);
			}
			else if (productionPlantName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3);
			}
			else {
				bindProductionPlantName = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2);
			}

			boolean bindProductionPlantAddress = false;

			if (productionPlantAddress == null) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_1);
			}
			else if (productionPlantAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_3);
			}
			else {
				bindProductionPlantAddress = true;

				query.append(_FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantName) {
					qPos.add(productionPlantName);
				}

				if (bindProductionPlantAddress) {
					qPos.add(productionPlantAddress);
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

	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_MTCORE_2 = "vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_APPLICANTPROFILEID_2 =
		"vrcopReportRepository.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_1 =
		"vrcopReportRepository.productionPlantName IS NULL AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_2 =
		"vrcopReportRepository.productionPlantName = ? AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTNAME_3 =
		"(vrcopReportRepository.productionPlantName IS NULL OR vrcopReportRepository.productionPlantName = '') AND ";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_1 =
		"vrcopReportRepository.productionPlantAddress IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_2 =
		"vrcopReportRepository.productionPlantAddress = ?";
	private static final String _FINDER_COLUMN_PRODUCTIONPLANTNAME_PRODUCTIONPLANTADDRESS_3 =
		"(vrcopReportRepository.productionPlantAddress IS NULL OR vrcopReportRepository.productionPlantAddress = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBymtCore_applicantProfileId_productionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBymtCore_applicantProfileId_productionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.APPLICANTPROFILEID_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.PRODUCTIONPLANTCODE_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE =
		new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBymtCore_applicantProfileId_productionPlantCode",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode) {
		return findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		int start, int end) {
		return findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findBymtCore_applicantProfileId_productionPlantCode(mtCore,
			applicantProfileId, productionPlantCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode,
		int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE;
			finderArgs = new Object[] {
					mtCore, applicantProfileId, productionPlantCode,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportRepository vrcopReportRepository : list) {
					if ((mtCore != vrcopReportRepository.getMtCore()) ||
							(applicantProfileId != vrcopReportRepository.getApplicantProfileId()) ||
							!Objects.equals(productionPlantCode,
								vrcopReportRepository.getProductionPlantCode())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
				}

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchBymtCore_applicantProfileId_productionPlantCode_First(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the first vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_First(
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		List<VRCOPReportRepository> list = findBymtCore_applicantProfileId_productionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchBymtCore_applicantProfileId_productionPlantCode_Last(mtCore,
				applicantProfileId, productionPlantCode, orderByComparator);

		if (vrcopReportRepository != null) {
			return vrcopReportRepository;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", applicantProfileId=");
		msg.append(applicantProfileId);

		msg.append(", productionPlantCode=");
		msg.append(productionPlantCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportRepositoryException(msg.toString());
	}

	/**
	 * Returns the last vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchBymtCore_applicantProfileId_productionPlantCode_Last(
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		int count = countBymtCore_applicantProfileId_productionPlantCode(mtCore,
				applicantProfileId, productionPlantCode);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportRepository> list = findBymtCore_applicantProfileId_productionPlantCode(mtCore,
				applicantProfileId, productionPlantCode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report repositories before and after the current vrcop report repository in the ordered set where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param id the primary key of the current vrcop report repository
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository[] findBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(
		long id, long mtCore, long applicantProfileId,
		String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository[] array = new VRCOPReportRepositoryImpl[3];

			array[0] = getBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantCode, orderByComparator, true);

			array[1] = vrcopReportRepository;

			array[2] = getBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(session,
					vrcopReportRepository, mtCore, applicantProfileId,
					productionPlantCode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPReportRepository getBymtCore_applicantProfileId_productionPlantCode_PrevAndNext(
		Session session, VRCOPReportRepository vrcopReportRepository,
		long mtCore, long applicantProfileId, String productionPlantCode,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

		query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_MTCORE_2);

		query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

		boolean bindProductionPlantCode = false;

		if (productionPlantCode == null) {
			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
		}
		else if (productionPlantCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
		}
		else {
			bindProductionPlantCode = true;

			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
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
			query.append(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(applicantProfileId);

		if (bindProductionPlantCode) {
			qPos.add(productionPlantCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportRepository);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportRepository> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 */
	@Override
	public void removeBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode) {
		for (VRCOPReportRepository vrcopReportRepository : findBymtCore_applicantProfileId_productionPlantCode(
				mtCore, applicantProfileId, productionPlantCode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories where mtCore = &#63; and applicantProfileId = &#63; and productionPlantCode = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param applicantProfileId the applicant profile ID
	 * @param productionPlantCode the production plant code
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countBymtCore_applicantProfileId_productionPlantCode(
		long mtCore, long applicantProfileId, String productionPlantCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE;

		Object[] finderArgs = new Object[] {
				mtCore, applicantProfileId, productionPlantCode
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_MTCORE_2);

			query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2);

			boolean bindProductionPlantCode = false;

			if (productionPlantCode == null) {
				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1);
			}
			else if (productionPlantCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3);
			}
			else {
				bindProductionPlantCode = true;

				query.append(_FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(applicantProfileId);

				if (bindProductionPlantCode) {
					qPos.add(productionPlantCode);
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

	private static final String _FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_MTCORE_2 =
		"vrcopReportRepository.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_APPLICANTPROFILEID_2 =
		"vrcopReportRepository.applicantProfileId = ? AND ";
	private static final String _FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_1 =
		"vrcopReportRepository.productionPlantCode IS NULL";
	private static final String _FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_2 =
		"vrcopReportRepository.productionPlantCode = ?";
	private static final String _FINDER_COLUMN_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE_PRODUCTIONPLANTCODE_3 =
		"(vrcopReportRepository.productionPlantCode IS NULL OR vrcopReportRepository.productionPlantCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DOSIERID_MTCORE = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDosierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPReportRepositoryModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPReportRepositoryModelImpl.MTCORE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSIERID_MTCORE = new FinderPath(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDosierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository findByDosierId_MtCore(long dossierId,
		long mtCore) throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByDosierId_MtCore(dossierId,
				mtCore);

		if (vrcopReportRepository == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierId=");
			msg.append(dossierId);

			msg.append(", mtCore=");
			msg.append(mtCore);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRCOPReportRepositoryException(msg.toString());
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore) {
		return fetchByDosierId_MtCore(dossierId, mtCore, true);
	}

	/**
	 * Returns the vrcop report repository where dossierId = &#63; and mtCore = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByDosierId_MtCore(long dossierId,
		long mtCore, boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE,
					finderArgs, this);
		}

		if (result instanceof VRCOPReportRepository) {
			VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)result;

			if ((dossierId != vrcopReportRepository.getDossierId()) ||
					(mtCore != vrcopReportRepository.getMtCore())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_DOSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSIERID_MTCORE_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

				List<VRCOPReportRepository> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRCOPReportRepositoryPersistenceImpl.fetchByDosierId_MtCore(long, long, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRCOPReportRepository vrcopReportRepository = list.get(0);

					result = vrcopReportRepository;

					cacheResult(vrcopReportRepository);

					if ((vrcopReportRepository.getDossierId() != dossierId) ||
							(vrcopReportRepository.getMtCore() != mtCore)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE,
							finderArgs, vrcopReportRepository);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE,
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
			return (VRCOPReportRepository)result;
		}
	}

	/**
	 * Removes the vrcop report repository where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the vrcop report repository that was removed
	 */
	@Override
	public VRCOPReportRepository removeByDosierId_MtCore(long dossierId,
		long mtCore) throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = findByDosierId_MtCore(dossierId,
				mtCore);

		return remove(vrcopReportRepository);
	}

	/**
	 * Returns the number of vrcop report repositories where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vrcop report repositories
	 */
	@Override
	public int countByDosierId_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE);

			query.append(_FINDER_COLUMN_DOSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSIERID_MTCORE_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

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

	private static final String _FINDER_COLUMN_DOSIERID_MTCORE_DOSSIERID_2 = "vrcopReportRepository.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSIERID_MTCORE_MTCORE_2 = "vrcopReportRepository.mtCore = ?";

	public VRCOPReportRepositoryPersistenceImpl() {
		setModelClass(VRCOPReportRepository.class);
	}

	/**
	 * Caches the vrcop report repository in the entity cache if it is enabled.
	 *
	 * @param vrcopReportRepository the vrcop report repository
	 */
	@Override
	public void cacheResult(VRCOPReportRepository vrcopReportRepository) {
		entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey(), vrcopReportRepository);

		finderCache.putResult(FINDER_PATH_FETCH_BY_COPREPORTNO,
			new Object[] {
				vrcopReportRepository.getMtCore(),
				vrcopReportRepository.getCopReportNo()
			}, vrcopReportRepository);

		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE,
			new Object[] {
				vrcopReportRepository.getDossierId(),
				vrcopReportRepository.getMtCore()
			}, vrcopReportRepository);

		vrcopReportRepository.resetOriginalValues();
	}

	/**
	 * Caches the vrcop report repositories in the entity cache if it is enabled.
	 *
	 * @param vrcopReportRepositories the vrcop report repositories
	 */
	@Override
	public void cacheResult(List<VRCOPReportRepository> vrcopReportRepositories) {
		for (VRCOPReportRepository vrcopReportRepository : vrcopReportRepositories) {
			if (entityCache.getResult(
						VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportRepositoryImpl.class,
						vrcopReportRepository.getPrimaryKey()) == null) {
				cacheResult(vrcopReportRepository);
			}
			else {
				vrcopReportRepository.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop report repositories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPReportRepositoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop report repository.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCOPReportRepository vrcopReportRepository) {
		entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRCOPReportRepositoryModelImpl)vrcopReportRepository,
			true);
	}

	@Override
	public void clearCache(List<VRCOPReportRepository> vrcopReportRepositories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPReportRepository vrcopReportRepository : vrcopReportRepositories) {
			entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportRepositoryImpl.class,
				vrcopReportRepository.getPrimaryKey());

			clearUniqueFindersCache((VRCOPReportRepositoryModelImpl)vrcopReportRepository,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl) {
		Object[] args = new Object[] {
				vrcopReportRepositoryModelImpl.getMtCore(),
				vrcopReportRepositoryModelImpl.getCopReportNo()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_COPREPORTNO, args,
			vrcopReportRepositoryModelImpl, false);

		args = new Object[] {
				vrcopReportRepositoryModelImpl.getDossierId(),
				vrcopReportRepositoryModelImpl.getMtCore()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_DOSIERID_MTCORE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE, args,
			vrcopReportRepositoryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getMtCore(),
					vrcopReportRepositoryModelImpl.getCopReportNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_COPREPORTNO, args);
		}

		if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_COPREPORTNO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getOriginalMtCore(),
					vrcopReportRepositoryModelImpl.getOriginalCopReportNo()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_COPREPORTNO, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getDossierId(),
					vrcopReportRepositoryModelImpl.getMtCore()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSIERID_MTCORE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE, args);
		}

		if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DOSIERID_MTCORE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrcopReportRepositoryModelImpl.getOriginalDossierId(),
					vrcopReportRepositoryModelImpl.getOriginalMtCore()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSIERID_MTCORE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_DOSIERID_MTCORE, args);
		}
	}

	/**
	 * Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	 *
	 * @param id the primary key for the new vrcop report repository
	 * @return the new vrcop report repository
	 */
	@Override
	public VRCOPReportRepository create(long id) {
		VRCOPReportRepository vrcopReportRepository = new VRCOPReportRepositoryImpl();

		vrcopReportRepository.setNew(true);
		vrcopReportRepository.setPrimaryKey(id);

		return vrcopReportRepository;
	}

	/**
	 * Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository that was removed
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository remove(long id)
		throws NoSuchVRCOPReportRepositoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository that was removed
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository remove(Serializable primaryKey)
		throws NoSuchVRCOPReportRepositoryException {
		Session session = null;

		try {
			session = openSession();

			VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
					primaryKey);

			if (vrcopReportRepository == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPReportRepositoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopReportRepository);
		}
		catch (NoSuchVRCOPReportRepositoryException nsee) {
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
	protected VRCOPReportRepository removeImpl(
		VRCOPReportRepository vrcopReportRepository) {
		vrcopReportRepository = toUnwrappedModel(vrcopReportRepository);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopReportRepository)) {
				vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
						vrcopReportRepository.getPrimaryKeyObj());
			}

			if (vrcopReportRepository != null) {
				session.delete(vrcopReportRepository);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopReportRepository != null) {
			clearCache(vrcopReportRepository);
		}

		return vrcopReportRepository;
	}

	@Override
	public VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository) {
		vrcopReportRepository = toUnwrappedModel(vrcopReportRepository);

		boolean isNew = vrcopReportRepository.isNew();

		VRCOPReportRepositoryModelImpl vrcopReportRepositoryModelImpl = (VRCOPReportRepositoryModelImpl)vrcopReportRepository;

		Session session = null;

		try {
			session = openSession();

			if (vrcopReportRepository.isNew()) {
				session.save(vrcopReportRepository);

				vrcopReportRepository.setNew(false);
			}
			else {
				vrcopReportRepository = (VRCOPReportRepository)session.merge(vrcopReportRepository);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCOPReportRepositoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalCopReportStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTSTATUS,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getCopReportStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTSTATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTSTATUS,
					args);
			}

			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getApplicantProfileId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTPROFILEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTPROFILEID,
					args);
			}

			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalProductionPlantCode(),
						vrcopReportRepositoryModelImpl.getOriginalCopClassification()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getProductionPlantCode(),
						vrcopReportRepositoryModelImpl.getCopClassification()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE_COPCLASSIFICATION,
					args);
			}

			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTCODE,
					args);
			}

			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getOriginalProductionPlantName(),
						vrcopReportRepositoryModelImpl.getOriginalProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getProductionPlantName(),
						vrcopReportRepositoryModelImpl.getProductionPlantAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRODUCTIONPLANTNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTIONPLANTNAME,
					args);
			}

			if ((vrcopReportRepositoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportRepositoryModelImpl.getOriginalMtCore(),
						vrcopReportRepositoryModelImpl.getOriginalApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getOriginalProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE,
					args);

				args = new Object[] {
						vrcopReportRepositoryModelImpl.getMtCore(),
						vrcopReportRepositoryModelImpl.getApplicantProfileId(),
						vrcopReportRepositoryModelImpl.getProductionPlantCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MTCORE_APPLICANTPROFILEID_PRODUCTIONPLANTCODE,
					args);
			}
		}

		entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportRepositoryImpl.class,
			vrcopReportRepository.getPrimaryKey(), vrcopReportRepository, false);

		clearUniqueFindersCache(vrcopReportRepositoryModelImpl, false);
		cacheUniqueFindersCache(vrcopReportRepositoryModelImpl);

		vrcopReportRepository.resetOriginalValues();

		return vrcopReportRepository;
	}

	protected VRCOPReportRepository toUnwrappedModel(
		VRCOPReportRepository vrcopReportRepository) {
		if (vrcopReportRepository instanceof VRCOPReportRepositoryImpl) {
			return vrcopReportRepository;
		}

		VRCOPReportRepositoryImpl vrcopReportRepositoryImpl = new VRCOPReportRepositoryImpl();

		vrcopReportRepositoryImpl.setNew(vrcopReportRepository.isNew());
		vrcopReportRepositoryImpl.setPrimaryKey(vrcopReportRepository.getPrimaryKey());

		vrcopReportRepositoryImpl.setId(vrcopReportRepository.getId());
		vrcopReportRepositoryImpl.setMtCore(vrcopReportRepository.getMtCore());
		vrcopReportRepositoryImpl.setApplicantProfileId(vrcopReportRepository.getApplicantProfileId());
		vrcopReportRepositoryImpl.setApplicantCode(vrcopReportRepository.getApplicantCode());
		vrcopReportRepositoryImpl.setApplicantName(vrcopReportRepository.getApplicantName());
		vrcopReportRepositoryImpl.setApplicantAddress(vrcopReportRepository.getApplicantAddress());
		vrcopReportRepositoryImpl.setOverseasManufacturerCode(vrcopReportRepository.getOverseasManufacturerCode());
		vrcopReportRepositoryImpl.setOverseasManufacturerName(vrcopReportRepository.getOverseasManufacturerName());
		vrcopReportRepositoryImpl.setOverseasManufacturerAddress(vrcopReportRepository.getOverseasManufacturerAddress());
		vrcopReportRepositoryImpl.setProductionPlantId(vrcopReportRepository.getProductionPlantId());
		vrcopReportRepositoryImpl.setProductionPlantCode(vrcopReportRepository.getProductionPlantCode());
		vrcopReportRepositoryImpl.setProductionPlantName(vrcopReportRepository.getProductionPlantName());
		vrcopReportRepositoryImpl.setProductionPlantAddress(vrcopReportRepository.getProductionPlantAddress());
		vrcopReportRepositoryImpl.setCopReportNo(vrcopReportRepository.getCopReportNo());
		vrcopReportRepositoryImpl.setCopReportStatus(vrcopReportRepository.getCopReportStatus());
		vrcopReportRepositoryImpl.setCopReportType(vrcopReportRepository.getCopReportType());
		vrcopReportRepositoryImpl.setCopReportMetadata(vrcopReportRepository.getCopReportMetadata());
		vrcopReportRepositoryImpl.setCopReportSignName(vrcopReportRepository.getCopReportSignName());
		vrcopReportRepositoryImpl.setCopReportSignTitle(vrcopReportRepository.getCopReportSignTitle());
		vrcopReportRepositoryImpl.setCopReportSignPlace(vrcopReportRepository.getCopReportSignPlace());
		vrcopReportRepositoryImpl.setCopReportDate(vrcopReportRepository.getCopReportDate());
		vrcopReportRepositoryImpl.setCopReportApprovedDate(vrcopReportRepository.getCopReportApprovedDate());
		vrcopReportRepositoryImpl.setCopReportExpiredDate(vrcopReportRepository.getCopReportExpiredDate());
		vrcopReportRepositoryImpl.setCOPFileEntryId(vrcopReportRepository.getCOPFileEntryId());
		vrcopReportRepositoryImpl.setModifyDate(vrcopReportRepository.getModifyDate());
		vrcopReportRepositoryImpl.setSyncDate(vrcopReportRepository.getSyncDate());
		vrcopReportRepositoryImpl.setImporterManufacturerCode(vrcopReportRepository.getImporterManufacturerCode());
		vrcopReportRepositoryImpl.setImporterManufacturerName(vrcopReportRepository.getImporterManufacturerName());
		vrcopReportRepositoryImpl.setImporterManufacturerAddress(vrcopReportRepository.getImporterManufacturerAddress());
		vrcopReportRepositoryImpl.setMarkupDomesticsManufacturer(vrcopReportRepository.getMarkupDomesticsManufacturer());
		vrcopReportRepositoryImpl.setMarkupImporter(vrcopReportRepository.getMarkupImporter());
		vrcopReportRepositoryImpl.setCopClassification(vrcopReportRepository.getCopClassification());
		vrcopReportRepositoryImpl.setProductClassificationDescription(vrcopReportRepository.getProductClassificationDescription());
		vrcopReportRepositoryImpl.setTotalPointA(vrcopReportRepository.getTotalPointA());
		vrcopReportRepositoryImpl.setTotalPointB(vrcopReportRepository.getTotalPointB());
		vrcopReportRepositoryImpl.setTotalPointC(vrcopReportRepository.getTotalPointC());
		vrcopReportRepositoryImpl.setCopNonConformity(vrcopReportRepository.getCopNonConformity());
		vrcopReportRepositoryImpl.setInspectionRecordNo(vrcopReportRepository.getInspectionRecordNo());
		vrcopReportRepositoryImpl.setInspectionRecordDate(vrcopReportRepository.getInspectionRecordDate());
		vrcopReportRepositoryImpl.setCorporationId(vrcopReportRepository.getCorporationId());
		vrcopReportRepositoryImpl.setInspectorId(vrcopReportRepository.getInspectorId());
		vrcopReportRepositoryImpl.setInspectionSite(vrcopReportRepository.getInspectionSite());
		vrcopReportRepositoryImpl.setInspectionDateFrom(vrcopReportRepository.getInspectionDateFrom());
		vrcopReportRepositoryImpl.setInspectionDateTo(vrcopReportRepository.getInspectionDateTo());
		vrcopReportRepositoryImpl.setSubInspector(vrcopReportRepository.getSubInspector());
		vrcopReportRepositoryImpl.setDescription(vrcopReportRepository.getDescription());
		vrcopReportRepositoryImpl.setApplicantRepresentative(vrcopReportRepository.getApplicantRepresentative());
		vrcopReportRepositoryImpl.setApplicantRepresentativeTitle(vrcopReportRepository.getApplicantRepresentativeTitle());
		vrcopReportRepositoryImpl.setInspectionRecordFileEntryId(vrcopReportRepository.getInspectionRecordFileEntryId());
		vrcopReportRepositoryImpl.setCopReportRefNo(vrcopReportRepository.getCopReportRefNo());
		vrcopReportRepositoryImpl.setCopReportRefDate(vrcopReportRepository.getCopReportRefDate());
		vrcopReportRepositoryImpl.setCopReportPreviousNo(vrcopReportRepository.getCopReportPreviousNo());
		vrcopReportRepositoryImpl.setCopReportPreviousDate(vrcopReportRepository.getCopReportPreviousDate());
		vrcopReportRepositoryImpl.setExpiredStatus(vrcopReportRepository.getExpiredStatus());
		vrcopReportRepositoryImpl.setDossierId(vrcopReportRepository.getDossierId());
		vrcopReportRepositoryImpl.setDossierIdCTN(vrcopReportRepository.getDossierIdCTN());
		vrcopReportRepositoryImpl.setDossierNo(vrcopReportRepository.getDossierNo());
		vrcopReportRepositoryImpl.setApplicantEmail(vrcopReportRepository.getApplicantEmail());
		vrcopReportRepositoryImpl.setApplicantPhone(vrcopReportRepository.getApplicantPhone());
		vrcopReportRepositoryImpl.setApplicantTelNo(vrcopReportRepository.getApplicantTelNo());
		vrcopReportRepositoryImpl.setApplicantFax(vrcopReportRepository.getApplicantFax());
		vrcopReportRepositoryImpl.setApplicantContactName(vrcopReportRepository.getApplicantContactName());
		vrcopReportRepositoryImpl.setApplicantContactEmail(vrcopReportRepository.getApplicantContactEmail());
		vrcopReportRepositoryImpl.setApplicantContactPhone(vrcopReportRepository.getApplicantContactPhone());
		vrcopReportRepositoryImpl.setApplicantContactTelNo(vrcopReportRepository.getApplicantContactTelNo());
		vrcopReportRepositoryImpl.setApplicantBusinessType(vrcopReportRepository.getApplicantBusinessType());
		vrcopReportRepositoryImpl.setMarkupDesigner(vrcopReportRepository.getMarkupDesigner());
		vrcopReportRepositoryImpl.setMarkupOverseasManufacturer(vrcopReportRepository.getMarkupOverseasManufacturer());
		vrcopReportRepositoryImpl.setMarkupMaintainer(vrcopReportRepository.getMarkupMaintainer());
		vrcopReportRepositoryImpl.setImporterDomesticSite(vrcopReportRepository.getImporterDomesticSite());
		vrcopReportRepositoryImpl.setSiteOfNationality(vrcopReportRepository.getSiteOfNationality());
		vrcopReportRepositoryImpl.setSiteOfNationalityCode(vrcopReportRepository.getSiteOfNationalityCode());
		vrcopReportRepositoryImpl.setSiteOfRegion(vrcopReportRepository.getSiteOfRegion());
		vrcopReportRepositoryImpl.setSiteOfRegionCode(vrcopReportRepository.getSiteOfRegionCode());
		vrcopReportRepositoryImpl.setSiteOfCity(vrcopReportRepository.getSiteOfCity());
		vrcopReportRepositoryImpl.setSiteOfCityCode(vrcopReportRepository.getSiteOfCityCode());
		vrcopReportRepositoryImpl.setManufacturerRepresentative(vrcopReportRepository.getManufacturerRepresentative());
		vrcopReportRepositoryImpl.setManufacturerRepresentativeTitle(vrcopReportRepository.getManufacturerRepresentativeTitle());
		vrcopReportRepositoryImpl.setManufacturerEmail(vrcopReportRepository.getManufacturerEmail());
		vrcopReportRepositoryImpl.setManufacturerPhone(vrcopReportRepository.getManufacturerPhone());
		vrcopReportRepositoryImpl.setManufacturerFax(vrcopReportRepository.getManufacturerFax());
		vrcopReportRepositoryImpl.setProductionPlantEmail(vrcopReportRepository.getProductionPlantEmail());
		vrcopReportRepositoryImpl.setProductionPlantWebsite(vrcopReportRepository.getProductionPlantWebsite());
		vrcopReportRepositoryImpl.setProductionPlantRepresentative(vrcopReportRepository.getProductionPlantRepresentative());
		vrcopReportRepositoryImpl.setProductionPlantRepresentativeTitle(vrcopReportRepository.getProductionPlantRepresentativeTitle());
		vrcopReportRepositoryImpl.setCorporationName(vrcopReportRepository.getCorporationName());
		vrcopReportRepositoryImpl.setInspectorContactCode(vrcopReportRepository.getInspectorContactCode());
		vrcopReportRepositoryImpl.setInspectorName(vrcopReportRepository.getInspectorName());
		vrcopReportRepositoryImpl.setInspectoRendorSementDate(vrcopReportRepository.getInspectoRendorSementDate());
		vrcopReportRepositoryImpl.setInspectorDeadline(vrcopReportRepository.getInspectorDeadline());
		vrcopReportRepositoryImpl.setResolvedStatus(vrcopReportRepository.getResolvedStatus());
		vrcopReportRepositoryImpl.setNumberOfNonConformity(vrcopReportRepository.getNumberOfNonConformity());
		vrcopReportRepositoryImpl.setNumberOfResolved(vrcopReportRepository.getNumberOfResolved());
		vrcopReportRepositoryImpl.setObservationDescription(vrcopReportRepository.getObservationDescription());
		vrcopReportRepositoryImpl.setInspectionAuditCycle(vrcopReportRepository.getInspectionAuditCycle());
		vrcopReportRepositoryImpl.setInspectionNote(vrcopReportRepository.getInspectionNote());
		vrcopReportRepositoryImpl.setProductionConformityChecking(vrcopReportRepository.getProductionConformityChecking());
		vrcopReportRepositoryImpl.setProductionStampChecking(vrcopReportRepository.getProductionStampChecking());
		vrcopReportRepositoryImpl.setTestingEquipmentChecking(vrcopReportRepository.getTestingEquipmentChecking());
		vrcopReportRepositoryImpl.setProductionPlantClassification(vrcopReportRepository.getProductionPlantClassification());
		vrcopReportRepositoryImpl.setActualCapacity(vrcopReportRepository.getActualCapacity());
		vrcopReportRepositoryImpl.setMaxCapacity(vrcopReportRepository.getMaxCapacity());
		vrcopReportRepositoryImpl.setAverageCapacity(vrcopReportRepository.getAverageCapacity());
		vrcopReportRepositoryImpl.setTotalEmployee(vrcopReportRepository.getTotalEmployee());
		vrcopReportRepositoryImpl.setTotalWorker(vrcopReportRepository.getTotalWorker());
		vrcopReportRepositoryImpl.setTotalManager(vrcopReportRepository.getTotalManager());
		vrcopReportRepositoryImpl.setTotalTechnical(vrcopReportRepository.getTotalTechnical());
		vrcopReportRepositoryImpl.setTotalQaEmployee(vrcopReportRepository.getTotalQaEmployee());
		vrcopReportRepositoryImpl.setTotalSquareMeter(vrcopReportRepository.getTotalSquareMeter());
		vrcopReportRepositoryImpl.setWareHouseSquare(vrcopReportRepository.getWareHouseSquare());
		vrcopReportRepositoryImpl.setOfficeSquare(vrcopReportRepository.getOfficeSquare());
		vrcopReportRepositoryImpl.setProductionSquare(vrcopReportRepository.getProductionSquare());
		vrcopReportRepositoryImpl.setMachiningArea(vrcopReportRepository.getMachiningArea());
		vrcopReportRepositoryImpl.setWeldingArea(vrcopReportRepository.getWeldingArea());
		vrcopReportRepositoryImpl.setPaintingArea(vrcopReportRepository.getPaintingArea());
		vrcopReportRepositoryImpl.setProductionAssembleArea(vrcopReportRepository.getProductionAssembleArea());
		vrcopReportRepositoryImpl.setFinishProductArea(vrcopReportRepository.getFinishProductArea());
		vrcopReportRepositoryImpl.setTestingArea(vrcopReportRepository.getTestingArea());
		vrcopReportRepositoryImpl.setSelfEquipment(vrcopReportRepository.getSelfEquipment());
		vrcopReportRepositoryImpl.setContractEquipment(vrcopReportRepository.getContractEquipment());
		vrcopReportRepositoryImpl.setCircularNo(vrcopReportRepository.getCircularNo());
		vrcopReportRepositoryImpl.setCircularDate(vrcopReportRepository.getCircularDate());
		vrcopReportRepositoryImpl.setCircularNo2(vrcopReportRepository.getCircularNo2());
		vrcopReportRepositoryImpl.setCircularDate2(vrcopReportRepository.getCircularDate2());

		return vrcopReportRepositoryImpl;
	}

	/**
	 * Returns the vrcop report repository with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPReportRepositoryException {
		VRCOPReportRepository vrcopReportRepository = fetchByPrimaryKey(primaryKey);

		if (vrcopReportRepository == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPReportRepositoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository
	 * @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository findByPrimaryKey(long id)
		throws NoSuchVRCOPReportRepositoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report repository
	 * @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportRepositoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPReportRepository vrcopReportRepository = (VRCOPReportRepository)serializable;

		if (vrcopReportRepository == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopReportRepository = (VRCOPReportRepository)session.get(VRCOPReportRepositoryImpl.class,
						primaryKey);

				if (vrcopReportRepository != null) {
					cacheResult(vrcopReportRepository);
				}
				else {
					entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportRepositoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopReportRepository;
	}

	/**
	 * Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPReportRepository> map = new HashMap<Serializable, VRCOPReportRepository>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPReportRepository vrcopReportRepository = fetchByPrimaryKey(primaryKey);

			if (vrcopReportRepository != null) {
				map.put(primaryKey, vrcopReportRepository);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPReportRepository)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE_PKS_IN);

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

			for (VRCOPReportRepository vrcopReportRepository : (List<VRCOPReportRepository>)q.list()) {
				map.put(vrcopReportRepository.getPrimaryKeyObj(),
					vrcopReportRepository);

				cacheResult(vrcopReportRepository);

				uncachedPrimaryKeys.remove(vrcopReportRepository.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPReportRepositoryModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportRepositoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcop report repositories.
	 *
	 * @return the vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
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

		List<VRCOPReportRepository> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportRepository>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPREPORTREPOSITORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPREPORTREPOSITORY;

				if (pagination) {
					sql = sql.concat(VRCOPReportRepositoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportRepository>)QueryUtil.list(q,
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
	 * Removes all the vrcop report repositories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPReportRepository vrcopReportRepository : findAll()) {
			remove(vrcopReportRepository);
		}
	}

	/**
	 * Returns the number of vrcop report repositories.
	 *
	 * @return the number of vrcop report repositories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPREPORTREPOSITORY);

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
		return VRCOPReportRepositoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop report repository persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPReportRepositoryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository";
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE_PKS_IN = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPREPORTREPOSITORY_WHERE = "SELECT vrcopReportRepository FROM VRCOPReportRepository vrcopReportRepository WHERE ";
	private static final String _SQL_COUNT_VRCOPREPORTREPOSITORY = "SELECT COUNT(vrcopReportRepository) FROM VRCOPReportRepository vrcopReportRepository";
	private static final String _SQL_COUNT_VRCOPREPORTREPOSITORY_WHERE = "SELECT COUNT(vrcopReportRepository) FROM VRCOPReportRepository vrcopReportRepository WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopReportRepository.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPReportRepository exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPReportRepository exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPReportRepositoryPersistenceImpl.class);
}