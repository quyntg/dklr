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

import com.fds.vr.business.exception.NoSuchVRCOPProductClassificationException;
import com.fds.vr.business.model.VRCOPProductClassification;
import com.fds.vr.business.model.impl.VRCOPProductClassificationImpl;
import com.fds.vr.business.model.impl.VRCOPProductClassificationModelImpl;
import com.fds.vr.business.service.persistence.VRCOPProductClassificationPersistence;

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
 * The persistence implementation for the vrcop product classification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPProductClassificationPersistence
 * @see com.fds.vr.business.service.persistence.VRCOPProductClassificationUtil
 * @generated
 */
@ProviderType
public class VRCOPProductClassificationPersistenceImpl
	extends BasePersistenceImpl<VRCOPProductClassification>
	implements VRCOPProductClassificationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRCOPProductClassificationUtil} to access the vrcop product classification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRCOPProductClassificationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID =
		new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRCOPProductClassificationModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductClassificationModelImpl.COPREPORTREPOSITORYID_COLUMN_BITMASK |
			VRCOPProductClassificationModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID = new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportRepositoryID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @return the range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
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

		List<VRCOPProductClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductClassification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductClassification vrcopProductClassification : list) {
					if ((mtCore != vrcopProductClassification.getMtCore()) ||
							(copReportRepositoryID != vrcopProductClassification.getCopReportRepositoryID())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2);

			query.append(_FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRCOPProductClassificationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
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
	 * Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = fetchBycopReportRepositoryID_First(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductClassification != null) {
			return vrcopProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductClassificationException(msg.toString());
	}

	/**
	 * Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		List<VRCOPProductClassification> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = fetchBycopReportRepositoryID_Last(mtCore,
				copReportRepositoryID, orderByComparator);

		if (vrcopProductClassification != null) {
			return vrcopProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportRepositoryID=");
		msg.append(copReportRepositoryID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductClassificationException(msg.toString());
	}

	/**
	 * Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		int count = countBycopReportRepositoryID(mtCore, copReportRepositoryID);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductClassification> list = findBycopReportRepositoryID(mtCore,
				copReportRepositoryID, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param id the primary key of the current vrcop product classification
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductClassification[] array = new VRCOPProductClassificationImpl[3];

			array[0] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductClassification, mtCore, copReportRepositoryID,
					orderByComparator, true);

			array[1] = vrcopProductClassification;

			array[2] = getBycopReportRepositoryID_PrevAndNext(session,
					vrcopProductClassification, mtCore, copReportRepositoryID,
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

	protected VRCOPProductClassification getBycopReportRepositoryID_PrevAndNext(
		Session session, VRCOPProductClassification vrcopProductClassification,
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE);

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
			query.append(VRCOPProductClassificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(mtCore);

		qPos.add(copReportRepositoryID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductClassification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductClassification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 */
	@Override
	public void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		for (VRCOPProductClassification vrcopProductClassification : findBycopReportRepositoryID(
				mtCore, copReportRepositoryID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(vrcopProductClassification);
		}
	}

	/**
	 * Returns the number of vrcop product classifications where mtCore = &#63; and copReportRepositoryID = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportRepositoryID the cop report repository ID
	 * @return the number of matching vrcop product classifications
	 */
	@Override
	public int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID;

		Object[] finderArgs = new Object[] { mtCore, copReportRepositoryID };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTCLASSIFICATION_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_MTCORE_2 = "vrcopProductClassification.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTREPOSITORYID_COPREPORTREPOSITORYID_2 =
		"vrcopProductClassification.copReportRepositoryID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycopReportNo",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO =
		new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() },
			VRCOPProductClassificationModelImpl.MTCORE_COLUMN_BITMASK |
			VRCOPProductClassificationModelImpl.COPREPORTNO_COLUMN_BITMASK |
			VRCOPProductClassificationModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTNO = new FinderPath(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycopReportNo",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportNo(long mtCore,
		String copReportNo) {
		return findBycopReportNo(mtCore, copReportNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @return the range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end) {
		return findBycopReportNo(mtCore, copReportNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findBycopReportNo(long mtCore,
		String copReportNo, int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
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

		List<VRCOPProductClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductClassification>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRCOPProductClassification vrcopProductClassification : list) {
					if ((mtCore != vrcopProductClassification.getMtCore()) ||
							!Objects.equals(copReportNo,
								vrcopProductClassification.getCopReportNo())) {
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

			query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE);

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
				query.append(VRCOPProductClassificationModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
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
	 * Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification findBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = fetchBycopReportNo_First(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductClassification != null) {
			return vrcopProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductClassificationException(msg.toString());
	}

	/**
	 * Returns the first vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification fetchBycopReportNo_First(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		List<VRCOPProductClassification> list = findBycopReportNo(mtCore,
				copReportNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification findBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = fetchBycopReportNo_Last(mtCore,
				copReportNo, orderByComparator);

		if (vrcopProductClassification != null) {
			return vrcopProductClassification;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mtCore=");
		msg.append(mtCore);

		msg.append(", copReportNo=");
		msg.append(copReportNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRCOPProductClassificationException(msg.toString());
	}

	/**
	 * Returns the last vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrcop product classification, or <code>null</code> if a matching vrcop product classification could not be found
	 */
	@Override
	public VRCOPProductClassification fetchBycopReportNo_Last(long mtCore,
		String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		int count = countBycopReportNo(mtCore, copReportNo);

		if (count == 0) {
			return null;
		}

		List<VRCOPProductClassification> list = findBycopReportNo(mtCore,
				copReportNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrcop product classifications before and after the current vrcop product classification in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param id the primary key of the current vrcop product classification
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRCOPProductClassification[] array = new VRCOPProductClassificationImpl[3];

			array[0] = getBycopReportNo_PrevAndNext(session,
					vrcopProductClassification, mtCore, copReportNo,
					orderByComparator, true);

			array[1] = vrcopProductClassification;

			array[2] = getBycopReportNo_PrevAndNext(session,
					vrcopProductClassification, mtCore, copReportNo,
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

	protected VRCOPProductClassification getBycopReportNo_PrevAndNext(
		Session session, VRCOPProductClassification vrcopProductClassification,
		long mtCore, String copReportNo,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
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

		query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE);

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
			query.append(VRCOPProductClassificationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrcopProductClassification);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRCOPProductClassification> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrcop product classifications where mtCore = &#63; and copReportNo = &#63; from the database.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 */
	@Override
	public void removeBycopReportNo(long mtCore, String copReportNo) {
		for (VRCOPProductClassification vrcopProductClassification : findBycopReportNo(
				mtCore, copReportNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrcopProductClassification);
		}
	}

	/**
	 * Returns the number of vrcop product classifications where mtCore = &#63; and copReportNo = &#63;.
	 *
	 * @param mtCore the mt core
	 * @param copReportNo the cop report no
	 * @return the number of matching vrcop product classifications
	 */
	@Override
	public int countBycopReportNo(long mtCore, String copReportNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTNO;

		Object[] finderArgs = new Object[] { mtCore, copReportNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRCOPPRODUCTCLASSIFICATION_WHERE);

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

	private static final String _FINDER_COLUMN_COPREPORTNO_MTCORE_2 = "vrcopProductClassification.mtCore = ? AND ";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_1 = "vrcopProductClassification.copReportNo IS NULL";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_2 = "vrcopProductClassification.copReportNo = ?";
	private static final String _FINDER_COLUMN_COPREPORTNO_COPREPORTNO_3 = "(vrcopProductClassification.copReportNo IS NULL OR vrcopProductClassification.copReportNo = '')";

	public VRCOPProductClassificationPersistenceImpl() {
		setModelClass(VRCOPProductClassification.class);
	}

	/**
	 * Caches the vrcop product classification in the entity cache if it is enabled.
	 *
	 * @param vrcopProductClassification the vrcop product classification
	 */
	@Override
	public void cacheResult(
		VRCOPProductClassification vrcopProductClassification) {
		entityCache.putResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			vrcopProductClassification.getPrimaryKey(),
			vrcopProductClassification);

		vrcopProductClassification.resetOriginalValues();
	}

	/**
	 * Caches the vrcop product classifications in the entity cache if it is enabled.
	 *
	 * @param vrcopProductClassifications the vrcop product classifications
	 */
	@Override
	public void cacheResult(
		List<VRCOPProductClassification> vrcopProductClassifications) {
		for (VRCOPProductClassification vrcopProductClassification : vrcopProductClassifications) {
			if (entityCache.getResult(
						VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductClassificationImpl.class,
						vrcopProductClassification.getPrimaryKey()) == null) {
				cacheResult(vrcopProductClassification);
			}
			else {
				vrcopProductClassification.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrcop product classifications.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRCOPProductClassificationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrcop product classification.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		VRCOPProductClassification vrcopProductClassification) {
		entityCache.removeResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			vrcopProductClassification.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRCOPProductClassification> vrcopProductClassifications) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRCOPProductClassification vrcopProductClassification : vrcopProductClassifications) {
			entityCache.removeResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductClassificationImpl.class,
				vrcopProductClassification.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vrcop product classification with the primary key. Does not add the vrcop product classification to the database.
	 *
	 * @param id the primary key for the new vrcop product classification
	 * @return the new vrcop product classification
	 */
	@Override
	public VRCOPProductClassification create(long id) {
		VRCOPProductClassification vrcopProductClassification = new VRCOPProductClassificationImpl();

		vrcopProductClassification.setNew(true);
		vrcopProductClassification.setPrimaryKey(id);

		return vrcopProductClassification;
	}

	/**
	 * Removes the vrcop product classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop product classification
	 * @return the vrcop product classification that was removed
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification remove(long id)
		throws NoSuchVRCOPProductClassificationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrcop product classification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrcop product classification
	 * @return the vrcop product classification that was removed
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification remove(Serializable primaryKey)
		throws NoSuchVRCOPProductClassificationException {
		Session session = null;

		try {
			session = openSession();

			VRCOPProductClassification vrcopProductClassification = (VRCOPProductClassification)session.get(VRCOPProductClassificationImpl.class,
					primaryKey);

			if (vrcopProductClassification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRCOPProductClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrcopProductClassification);
		}
		catch (NoSuchVRCOPProductClassificationException nsee) {
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
	protected VRCOPProductClassification removeImpl(
		VRCOPProductClassification vrcopProductClassification) {
		vrcopProductClassification = toUnwrappedModel(vrcopProductClassification);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrcopProductClassification)) {
				vrcopProductClassification = (VRCOPProductClassification)session.get(VRCOPProductClassificationImpl.class,
						vrcopProductClassification.getPrimaryKeyObj());
			}

			if (vrcopProductClassification != null) {
				session.delete(vrcopProductClassification);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrcopProductClassification != null) {
			clearCache(vrcopProductClassification);
		}

		return vrcopProductClassification;
	}

	@Override
	public VRCOPProductClassification updateImpl(
		VRCOPProductClassification vrcopProductClassification) {
		vrcopProductClassification = toUnwrappedModel(vrcopProductClassification);

		boolean isNew = vrcopProductClassification.isNew();

		VRCOPProductClassificationModelImpl vrcopProductClassificationModelImpl = (VRCOPProductClassificationModelImpl)vrcopProductClassification;

		Session session = null;

		try {
			session = openSession();

			if (vrcopProductClassification.isNew()) {
				session.save(vrcopProductClassification);

				vrcopProductClassification.setNew(false);
			}
			else {
				vrcopProductClassification = (VRCOPProductClassification)session.merge(vrcopProductClassification);
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
				!VRCOPProductClassificationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrcopProductClassificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductClassificationModelImpl.getOriginalMtCore(),
						vrcopProductClassificationModelImpl.getOriginalCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);

				args = new Object[] {
						vrcopProductClassificationModelImpl.getMtCore(),
						vrcopProductClassificationModelImpl.getCopReportRepositoryID()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTREPOSITORYID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTREPOSITORYID,
					args);
			}

			if ((vrcopProductClassificationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrcopProductClassificationModelImpl.getOriginalMtCore(),
						vrcopProductClassificationModelImpl.getOriginalCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);

				args = new Object[] {
						vrcopProductClassificationModelImpl.getMtCore(),
						vrcopProductClassificationModelImpl.getCopReportNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COPREPORTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTNO,
					args);
			}
		}

		entityCache.putResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
			VRCOPProductClassificationImpl.class,
			vrcopProductClassification.getPrimaryKey(),
			vrcopProductClassification, false);

		vrcopProductClassification.resetOriginalValues();

		return vrcopProductClassification;
	}

	protected VRCOPProductClassification toUnwrappedModel(
		VRCOPProductClassification vrcopProductClassification) {
		if (vrcopProductClassification instanceof VRCOPProductClassificationImpl) {
			return vrcopProductClassification;
		}

		VRCOPProductClassificationImpl vrcopProductClassificationImpl = new VRCOPProductClassificationImpl();

		vrcopProductClassificationImpl.setNew(vrcopProductClassification.isNew());
		vrcopProductClassificationImpl.setPrimaryKey(vrcopProductClassification.getPrimaryKey());

		vrcopProductClassificationImpl.setId(vrcopProductClassification.getId());
		vrcopProductClassificationImpl.setMtCore(vrcopProductClassification.getMtCore());
		vrcopProductClassificationImpl.setCopReportRepositoryID(vrcopProductClassification.getCopReportRepositoryID());
		vrcopProductClassificationImpl.setCopReportNo(vrcopProductClassification.getCopReportNo());
		vrcopProductClassificationImpl.setSequenceNo(vrcopProductClassification.getSequenceNo());
		vrcopProductClassificationImpl.setProductClassificationCode(vrcopProductClassification.getProductClassificationCode());
		vrcopProductClassificationImpl.setProductClassificationDescription(vrcopProductClassification.getProductClassificationDescription());
		vrcopProductClassificationImpl.setModifyDate(vrcopProductClassification.getModifyDate());
		vrcopProductClassificationImpl.setSyncDate(vrcopProductClassification.getSyncDate());

		return vrcopProductClassificationImpl;
	}

	/**
	 * Returns the vrcop product classification with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop product classification
	 * @return the vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRCOPProductClassificationException {
		VRCOPProductClassification vrcopProductClassification = fetchByPrimaryKey(primaryKey);

		if (vrcopProductClassification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRCOPProductClassificationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrcopProductClassification;
	}

	/**
	 * Returns the vrcop product classification with the primary key or throws a {@link NoSuchVRCOPProductClassificationException} if it could not be found.
	 *
	 * @param id the primary key of the vrcop product classification
	 * @return the vrcop product classification
	 * @throws NoSuchVRCOPProductClassificationException if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification findByPrimaryKey(long id)
		throws NoSuchVRCOPProductClassificationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrcop product classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrcop product classification
	 * @return the vrcop product classification, or <code>null</code> if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
				VRCOPProductClassificationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRCOPProductClassification vrcopProductClassification = (VRCOPProductClassification)serializable;

		if (vrcopProductClassification == null) {
			Session session = null;

			try {
				session = openSession();

				vrcopProductClassification = (VRCOPProductClassification)session.get(VRCOPProductClassificationImpl.class,
						primaryKey);

				if (vrcopProductClassification != null) {
					cacheResult(vrcopProductClassification);
				}
				else {
					entityCache.putResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
						VRCOPProductClassificationImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductClassificationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrcopProductClassification;
	}

	/**
	 * Returns the vrcop product classification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrcop product classification
	 * @return the vrcop product classification, or <code>null</code> if a vrcop product classification with the primary key could not be found
	 */
	@Override
	public VRCOPProductClassification fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRCOPProductClassification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRCOPProductClassification> map = new HashMap<Serializable, VRCOPProductClassification>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRCOPProductClassification vrcopProductClassification = fetchByPrimaryKey(primaryKey);

			if (vrcopProductClassification != null) {
				map.put(primaryKey, vrcopProductClassification);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductClassificationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRCOPProductClassification)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE_PKS_IN);

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

			for (VRCOPProductClassification vrcopProductClassification : (List<VRCOPProductClassification>)q.list()) {
				map.put(vrcopProductClassification.getPrimaryKeyObj(),
					vrcopProductClassification);

				cacheResult(vrcopProductClassification);

				uncachedPrimaryKeys.remove(vrcopProductClassification.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRCOPProductClassificationModelImpl.ENTITY_CACHE_ENABLED,
					VRCOPProductClassificationImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrcop product classifications.
	 *
	 * @return the vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrcop product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @return the range of vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findAll(int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrcop product classifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductClassificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop product classifications
	 * @param end the upper bound of the range of vrcop product classifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrcop product classifications
	 */
	@Override
	public List<VRCOPProductClassification> findAll(int start, int end,
		OrderByComparator<VRCOPProductClassification> orderByComparator,
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

		List<VRCOPProductClassification> list = null;

		if (retrieveFromCache) {
			list = (List<VRCOPProductClassification>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRCOPPRODUCTCLASSIFICATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRCOPPRODUCTCLASSIFICATION;

				if (pagination) {
					sql = sql.concat(VRCOPProductClassificationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRCOPProductClassification>)QueryUtil.list(q,
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
	 * Removes all the vrcop product classifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRCOPProductClassification vrcopProductClassification : findAll()) {
			remove(vrcopProductClassification);
		}
	}

	/**
	 * Returns the number of vrcop product classifications.
	 *
	 * @return the number of vrcop product classifications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRCOPPRODUCTCLASSIFICATION);

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
		return VRCOPProductClassificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrcop product classification persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRCOPProductClassificationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRCOPPRODUCTCLASSIFICATION = "SELECT vrcopProductClassification FROM VRCOPProductClassification vrcopProductClassification";
	private static final String _SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE_PKS_IN =
		"SELECT vrcopProductClassification FROM VRCOPProductClassification vrcopProductClassification WHERE id IN (";
	private static final String _SQL_SELECT_VRCOPPRODUCTCLASSIFICATION_WHERE = "SELECT vrcopProductClassification FROM VRCOPProductClassification vrcopProductClassification WHERE ";
	private static final String _SQL_COUNT_VRCOPPRODUCTCLASSIFICATION = "SELECT COUNT(vrcopProductClassification) FROM VRCOPProductClassification vrcopProductClassification";
	private static final String _SQL_COUNT_VRCOPPRODUCTCLASSIFICATION_WHERE = "SELECT COUNT(vrcopProductClassification) FROM VRCOPProductClassification vrcopProductClassification WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrcopProductClassification.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRCOPProductClassification exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRCOPProductClassification exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRCOPProductClassificationPersistenceImpl.class);
}