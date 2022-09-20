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

import com.fds.vr.business.exception.NoSuchVRCOPReportAttachException;
import com.fds.vr.business.model.VRCOPReportAttach;
import com.fds.vr.business.model.impl.VRCOPReportAttachImpl;
import com.fds.vr.business.model.impl.VRCOPReportAttachModelImpl;
import com.fds.vr.business.service.persistence.VRCOPReportAttachPersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
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
 * The persistence implementation for the vrcop report attach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportAttachPersistence
 * @see com.fds.vr.business.service.persistence.VRCOPReportAttachUtil
 * @generated
 */
@ProviderType
public class VRCOPReportAttachPersistenceImpl extends BasePersistenceImpl<VRCOPReportAttach>
	implements VRCOPReportAttachPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPReportAttachUtil} to access the vrcop report attach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPReportAttachImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPReportAttachModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.COPREPORTREPOSITORYID_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @return the range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID;
			finderArgs = new Object[] { mtCore, copReportRepositoryID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID;
			finderArgs = new Object[] {
					mtCore, copReportRepositoryID,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportAttach> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportAttach>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportAttach vrcopReportAttach : list) {
					if ((mtCore != vrcopReportAttach.getMtCore()) ||
							(copReportRepositoryID != vrcopReportAttach.getCopReportRepositoryID())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(copReportRepositoryID);

				if (!pagination) {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
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
	 * Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopReportRepositoryID_First(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopReportRepositoryID_First(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		List<VRCOPReportAttach> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopReportRepositoryID_Last(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopReportRepositoryID_Last(long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		int count = countBycopReportRepositoryID(mtCore, copReportRepositoryID);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportAttach> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param id the primary key of the current vrcop report attach
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportAttach[] array = new VRCOPReportAttachImpl[3];

			array[0] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopReportAttach, mtCore, copReportRepositoryID,
					orderByComparator, true);

			array[1] = vrcopReportAttach;

			array[2] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopReportAttach, mtCore, copReportRepositoryID,
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

	protected VRCOPReportAttach getBycopReportRepositoryID_PrevAndNext(
		Session session, VRCOPReportAttach vrcopReportAttach, long mtCore,
		long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

		query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

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
			query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(copReportRepositoryID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportAttach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportAttach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 */
	@Override
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		for (VRCOPReportAttach vrcopReportAttach : findBycopReportRepositoryID(
				mtCore, copReportRepositoryID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopReportAttach);
		}
	}

	/**
	 * Returns the number of vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the number of matching vrcop report attachs
	 */
	@Override
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID;

		Object[] finderArgs = new Object[] { mtCore, copReportRepositoryID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(mtCore);

				qPos.add(copReportRepositoryID);

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

	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2 = "vrcopReportAttach.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2 =
		"vrcopReportAttach.copReportRepositoryID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPReportAttachModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @return the range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
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

		List<VRCOPReportAttach> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportAttach>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportAttach vrcopReportAttach : list) {
					if ((mtCore != vrcopReportAttach.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrcopReportAttach.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

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
				query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
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
	 * Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopReportNo_First(mtCore,
				copReportNo, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		List<VRCOPReportAttach> list = findBycopReportNo(mtCore, copReportNo,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopReportNo_Last(mtCore,
				copReportNo, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportAttach> list = findBycopReportNo(mtCore, copReportNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop report attach
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportAttach[] array = new VRCOPReportAttachImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session, vrcopReportAttach,
					mtCore, copReportNo, orderByComparator, true);

			array[1] = vrcopReportAttach;

			array[2] = getBycopReportNo_PrevAndNext(session, vrcopReportAttach,
					mtCore, copReportNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPReportAttach getBycopReportNo_PrevAndNext(Session session,
		VRCOPReportAttach vrcopReportAttach, long mtCore, String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

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
			query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportAttach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportAttach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRCOPReportAttach vrcopReportAttach : findBycopReportNo(mtCore,
				copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportAttach);
		}
	}

	/**
	 * Returns the number of vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop report attachs
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTATTACH_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopReportAttach.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopReportAttach.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopReportAttach.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopReportAttach.copReportNo IS NULL OR vrcopReportAttach.copReportNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopDossierId",
			new String[] { Long.class.getName() },
			VRCOPReportAttachModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPDOSSIERID = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycopDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vrcop report attachs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopDossierId(long dossierId) {
		return findBycopDossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report attachs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @return the range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopDossierId(long dossierId,
		int start, int end) {
		return findBycopDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return findBycopDossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findBycopDossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPDOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRCOPReportAttach> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportAttach>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportAttach vrcopReportAttach : list) {
					if ((dossierId != vrcopReportAttach.getDossierId())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
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
	 * Returns the first vrcop report attach in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopDossierId_First(long dossierId,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopDossierId_First(dossierId,
				orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the first vrcop report attach in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopDossierId_First(long dossierId,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		List<VRCOPReportAttach> list = findBycopDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findBycopDossierId_Last(long dossierId,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchBycopDossierId_Last(dossierId,
				orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchBycopDossierId_Last(long dossierId,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		int count = countBycopDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportAttach> list = findBycopDossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vrcop report attach
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach[] findBycopDossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportAttach[] array = new VRCOPReportAttachImpl[3];

			array[0] = getBycopDossierId_PrevAndNext(session,
					vrcopReportAttach, dossierId, orderByComparator, true);

			array[1] = vrcopReportAttach;

			array[2] = getBycopDossierId_PrevAndNext(session,
					vrcopReportAttach, dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRCOPReportAttach getBycopDossierId_PrevAndNext(Session session,
		VRCOPReportAttach vrcopReportAttach, long dossierId,
		OrderByComparator<VRCOPReportAttach> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

		query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

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
			query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportAttach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportAttach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report attachs where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBycopDossierId(long dossierId) {
		for (VRCOPReportAttach vrcopReportAttach : findBycopDossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportAttach);
		}
	}

	/**
	 * Returns the number of vrcop report attachs where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vrcop report attachs
	 */
	@Override
	public int countBycopDossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPDOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

	private static final String _FINDER_COLUMN_COPDOSSIERID_DOSSIERID_2 = "vrcopReportAttach.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId_MtCore",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE =
		new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED,
			VRCOPReportAttachImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPReportAttachModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPReportAttachModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE = new FinderPath(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierId_MtCore",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop report attachs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findByDossierId_MtCore(long dossierId,
		long mtCore) {
		return findByDossierId_MtCore(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report attachs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @return the range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return findByDossierId_MtCore(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findByDossierId_MtCore(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] { dossierId, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID_MTCORE;
			finderArgs = new Object[] {
					dossierId, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRCOPReportAttach> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportAttach>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPReportAttach vrcopReportAttach : list) {
					if ((dossierId != vrcopReportAttach.getDossierId()) ||
							(mtCore != vrcopReportAttach.getMtCore())) {
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

			query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
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
	 * Returns the first vrcop report attach in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findByDossierId_MtCore_First(long dossierId,
		long mtCore, OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchByDossierId_MtCore_First(dossierId,
				mtCore, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the first vrcop report attach in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchByDossierId_MtCore_First(long dossierId,
		long mtCore, OrderByComparator<VRCOPReportAttach> orderByComparator) {
		List<VRCOPReportAttach> list = findByDossierId_MtCore(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach findByDossierId_MtCore_Last(long dossierId,
		long mtCore, OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchByDossierId_MtCore_Last(dossierId,
				mtCore, orderByComparator);

		if (vrcopReportAttach != null) {
			return vrcopReportAttach;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPReportAttachException(msg.toString());
	}

	/**
	 * Returns the last vrcop report attach in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	 */
	@Override
	public VRCOPReportAttach fetchByDossierId_MtCore_Last(long dossierId,
		long mtCore, OrderByComparator<VRCOPReportAttach> orderByComparator) {
		int count = countByDossierId_MtCore(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRCOPReportAttach> list = findByDossierId_MtCore(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vrcop report attach
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach[] findByDossierId_MtCore_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPReportAttach[] array = new VRCOPReportAttachImpl[3];

			array[0] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopReportAttach, dossierId, mtCore, orderByComparator,
					true);

			array[1] = vrcopReportAttach;

			array[2] = getByDossierId_MtCore_PrevAndNext(session,
					vrcopReportAttach, dossierId, mtCore, orderByComparator,
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

	protected VRCOPReportAttach getByDossierId_MtCore_PrevAndNext(
		Session session, VRCOPReportAttach vrcopReportAttach, long dossierId,
		long mtCore, OrderByComparator<VRCOPReportAttach> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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
			query.append(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopReportAttach);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPReportAttach> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop report attachs where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId_MtCore(long dossierId, long mtCore) {
		for (VRCOPReportAttach vrcopReportAttach : findByDossierId_MtCore(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopReportAttach);
		}
	}

	/**
	 * Returns the number of vrcop report attachs where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vrcop report attachs
	 */
	@Override
	public int countByDossierId_MtCore(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPREPORTATTACH_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_DOSSIERID_2 = "vrcopReportAttach.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_MTCORE_2 = "vrcopReportAttach.mtCore = ?";

	public VRCOPReportAttachPersistenceImpl() {
		setModelClass(VRCOPReportAttach.class);
	}

	/**
	 * Caches the vrcop report attach in the entity cache if it is enabled.
	 *
	 * @param vrcopReportAttach the vrcop report attach
	 */
	@Override
	public void cacheResult(VRCOPReportAttach vrcopReportAttach) {
		entityCache.putResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachImpl.class, vrcopReportAttach.getPrimaryKey(),
			vrcopReportAttach);

		vrcopReportAttach.resetOriginalValues();
	}

	/**
	 * Caches the vrcop report attachs in the entity cache if it is enabled.
	 *
	 * @param vrcopReportAttachs the vrcop report attachs
	 */
	@Override
	public void cacheResult(List<VRCOPReportAttach> vrcopReportAttachs) {
		for (VRCOPReportAttach vrcopReportAttach : vrcopReportAttachs) {
			if (entityCache.getResult(
						VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportAttachImpl.class,
						vrcopReportAttach.getPrimaryKey()) == null) {
				cacheResult(vrcopReportAttach);
			}
			else {
				vrcopReportAttach.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop report attachs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPReportAttachImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop report attach.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRCOPReportAttach vrcopReportAttach) {
		entityCache.removeResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachImpl.class, vrcopReportAttach.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<VRCOPReportAttach> vrcopReportAttachs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPReportAttach vrcopReportAttach : vrcopReportAttachs) {
			entityCache.removeResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportAttachImpl.class, vrcopReportAttach.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop report attach with the primary key. Does not add the vrcop report attach to the database.
	 *
	 * @param id the primary key for the new vrcop report attach
	 * @return the new vrcop report attach
	 */
	@Override
	public VRCOPReportAttach create(long id) {
		VRCOPReportAttach vrcopReportAttach = new VRCOPReportAttachImpl();

		vrcopReportAttach.setNew(true);
		vrcopReportAttach.setPrimaryKey(id);

		return vrcopReportAttach;
	}

	/**
	 * Removes the vrcop report attach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop report attach
	 * @return the vrcop report attach that was removed
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach remove(long id)
		throws NoSuchVRCOPReportAttachException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop report attach with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop report attach
	 * @return the vrcop report attach that was removed
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach remove(Serializable primaryKey)
		throws NoSuchVRCOPReportAttachException {
		Session session = null;

		try {
			session = openSession();

			VRCOPReportAttach vrcopReportAttach = (VRCOPReportAttach)session.get(VRCOPReportAttachImpl.class,
					primaryKey);

			if (vrcopReportAttach == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPReportAttachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopReportAttach);
		}
		catch (NoSuchVRCOPReportAttachException nsee) {
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
	protected VRCOPReportAttach removeImpl(VRCOPReportAttach vrcopReportAttach) {
		vrcopReportAttach = toUnwrappedModel(vrcopReportAttach);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopReportAttach)) {
				vrcopReportAttach = (VRCOPReportAttach)session.get(VRCOPReportAttachImpl.class,
						vrcopReportAttach.getPrimaryKeyObj());
			}

			if (vrcopReportAttach != null) {
				session.delete(vrcopReportAttach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopReportAttach != null) {
			clearCache(vrcopReportAttach);
		}

		return vrcopReportAttach;
	}

	@Override
	public VRCOPReportAttach updateImpl(VRCOPReportAttach vrcopReportAttach) {
		vrcopReportAttach = toUnwrappedModel(vrcopReportAttach);

		boolean isNew = vrcopReportAttach.isNew();

		VRCOPReportAttachModelImpl vrcopReportAttachModelImpl = (VRCOPReportAttachModelImpl)vrcopReportAttach;

		Session session = null;

		try {
			session = openSession();

			if (vrcopReportAttach.isNew()) {
				session.save(vrcopReportAttach);

				vrcopReportAttach.setNew(false);
			}
			else {
				vrcopReportAttach = (VRCOPReportAttach)session.merge(vrcopReportAttach);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRCOPReportAttachModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopReportAttachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportAttachModelImpl.getOriginalMtCore(),
						vrcopReportAttachModelImpl.getOriginalCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);

				args = new Object[] {
						vrcopReportAttachModelImpl.getMtCore(),
						vrcopReportAttachModelImpl.getCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);
			}

			if ((vrcopReportAttachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportAttachModelImpl.getOriginalMtCore(),
						vrcopReportAttachModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrcopReportAttachModelImpl.getMtCore(),
						vrcopReportAttachModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}

			if ((vrcopReportAttachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportAttachModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);

				args = new Object[] { vrcopReportAttachModelImpl.getDossierId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPDOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPDOSSIERID,
					args);
			}

			if ((vrcopReportAttachModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopReportAttachModelImpl.getOriginalDossierId(),
						vrcopReportAttachModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);

				args = new Object[] {
						vrcopReportAttachModelImpl.getDossierId(),
						vrcopReportAttachModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID_MTCORE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID_MTCORE,
					args);
			}
		}

		entityCache.putResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPReportAttachImpl.class, vrcopReportAttach.getPrimaryKey(),
			vrcopReportAttach, false);

		vrcopReportAttach.resetOriginalValues();

		return vrcopReportAttach;
	}

	protected VRCOPReportAttach toUnwrappedModel(
		VRCOPReportAttach vrcopReportAttach) {
		if (vrcopReportAttach instanceof VRCOPReportAttachImpl) {
			return vrcopReportAttach;
		}

		VRCOPReportAttachImpl vrcopReportAttachImpl = new VRCOPReportAttachImpl();

		vrcopReportAttachImpl.setNew(vrcopReportAttach.isNew());
		vrcopReportAttachImpl.setPrimaryKey(vrcopReportAttach.getPrimaryKey());

		vrcopReportAttachImpl.setId(vrcopReportAttach.getId());
		vrcopReportAttachImpl.setMtCore(vrcopReportAttach.getMtCore());
		vrcopReportAttachImpl.setCopReportRepositoryID(vrcopReportAttach.getCopReportRepositoryID());
		vrcopReportAttachImpl.setCopReportNo(vrcopReportAttach.getCopReportNo());
		vrcopReportAttachImpl.setSequenceNo(vrcopReportAttach.getSequenceNo());
		vrcopReportAttachImpl.setDocName(vrcopReportAttach.getDocName());
		vrcopReportAttachImpl.setDocNo(vrcopReportAttach.getDocNo());
		vrcopReportAttachImpl.setRemarks(vrcopReportAttach.getRemarks());
		vrcopReportAttachImpl.setModifyDate(vrcopReportAttach.getModifyDate());
		vrcopReportAttachImpl.setSyncDate(vrcopReportAttach.getSyncDate());
		vrcopReportAttachImpl.setDossierId(vrcopReportAttach.getDossierId());
		vrcopReportAttachImpl.setDossierIdCTN(vrcopReportAttach.getDossierIdCTN());
		vrcopReportAttachImpl.setDossierNo(vrcopReportAttach.getDossierNo());

		return vrcopReportAttachImpl;
	}

	/**
	 * Returns the vrcop report attach with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report attach
	 * @return the vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPReportAttachException {
		VRCOPReportAttach vrcopReportAttach = fetchByPrimaryKey(primaryKey);

		if (vrcopReportAttach == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPReportAttachException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopReportAttach;
	}

	/**
	 * Returns the vrcop report attach with the primary key or throws a {@link NoSuchVRCOPReportAttachException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop report attach
	 * @return the vrcop report attach
	 * @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach findByPrimaryKey(long id)
		throws NoSuchVRCOPReportAttachException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop report attach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop report attach
	 * @return the vrcop report attach, or <code>null</code> if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPReportAttachImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPReportAttach vrcopReportAttach = (VRCOPReportAttach)serializable;

		if (vrcopReportAttach == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopReportAttach = (VRCOPReportAttach)session.get(VRCOPReportAttachImpl.class,
						primaryKey);

				if (vrcopReportAttach != null) {
					cacheResult(vrcopReportAttach);
				}
				else {
					entityCache.putResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPReportAttachImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportAttachImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopReportAttach;
	}

	/**
	 * Returns the vrcop report attach with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop report attach
	 * @return the vrcop report attach, or <code>null</code> if a vrcop report attach with the primary key could not be found
	 */
	@Override
	public VRCOPReportAttach fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPReportAttach> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPReportAttach> map = new HashMap<Serializable, VRCOPReportAttach>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPReportAttach vrcopReportAttach = fetchByPrimaryKey(primaryKey);

			if (vrcopReportAttach != null) {
				map.put(primaryKey, vrcopReportAttach);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportAttachImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPReportAttach)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPREPORTATTACH_WHERE_PKS_IN);

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

			for (VRCOPReportAttach vrcopReportAttach : (List<VRCOPReportAttach>)q.list()) {
				map.put(vrcopReportAttach.getPrimaryKeyObj(), vrcopReportAttach);

				cacheResult(vrcopReportAttach);

				uncachedPrimaryKeys.remove(vrcopReportAttach.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPReportAttachModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPReportAttachImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcop report attachs.
	 *
	 * @return the vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop report attachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @return the range of vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findAll(int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop report attachs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report attachs
	 * @param end the upper bound of the range of vrcop report attachs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop report attachs
	 */
	@Override
	public List<VRCOPReportAttach> findAll(int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
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

		List<VRCOPReportAttach> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPReportAttach>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPREPORTATTACH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPREPORTATTACH;

				if (pagination) {
					sql = sql.concat(VRCOPReportAttachModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPReportAttach>)QueryUtil.list(q,
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
	 * Removes all the vrcop report attachs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPReportAttach vrcopReportAttach : findAll()) {
			remove(vrcopReportAttach);
		}
	}

	/**
	 * Returns the number of vrcop report attachs.
	 *
	 * @return the number of vrcop report attachs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPREPORTATTACH);

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
		return VRCOPReportAttachModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop report attach persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPReportAttachImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPREPORTATTACH = "SELECT vrcopReportAttach FROM VRCOPReportAttach vrcopReportAttach";
	private static final String _SQL_SELECT_VRCOPREPORTATTACH_WHERE_PKS_IN = "SELECT vrcopReportAttach FROM VRCOPReportAttach vrcopReportAttach WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPREPORTATTACH_WHERE = "SELECT vrcopReportAttach FROM VRCOPReportAttach vrcopReportAttach WHERE ";
	private static final String _SQL_COUNT_VRCOPREPORTATTACH = "SELECT COUNT(vrcopReportAttach) FROM VRCOPReportAttach vrcopReportAttach";
	private static final String _SQL_COUNT_VRCOPREPORTATTACH_WHERE = "SELECT COUNT(vrcopReportAttach) FROM VRCOPReportAttach vrcopReportAttach WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopReportAttach.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPReportAttach exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPReportAttach exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPReportAttachPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"docName", "docNo", "remarks"
			});
}