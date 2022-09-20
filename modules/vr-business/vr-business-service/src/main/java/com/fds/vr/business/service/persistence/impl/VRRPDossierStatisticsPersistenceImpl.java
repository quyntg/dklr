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

import com.fds.vr.business.exception.NoSuchVRRPDossierStatisticsException;
import com.fds.vr.business.model.VRRPDossierStatistics;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsImpl;
import com.fds.vr.business.model.impl.VRRPDossierStatisticsModelImpl;
import com.fds.vr.business.service.persistence.VRRPDossierStatisticsPersistence;

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
 * The persistence implementation for the vrrp dossier statistics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRRPDossierStatisticsPersistence
 * @see com.fds.vr.business.service.persistence.VRRPDossierStatisticsUtil
 * @generated
 */
@ProviderType
public class VRRPDossierStatisticsPersistenceImpl extends BasePersistenceImpl<VRRPDossierStatistics>
	implements VRRPDossierStatisticsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRRPDossierStatisticsUtil} to access the vrrp dossier statistics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRRPDossierStatisticsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { Long.class.getName(), String.class.getName() },
			VRRPDossierStatisticsModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierIdCTN(long dossierid,
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierid, dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierIdCTN(long dossierid,
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierid, dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierIdCTN(long dossierid,
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByDossierIdCTN(dossierid, dossierIdCTN, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierIdCTN(long dossierid,
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] { dossierid, dossierIdCTN };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] {
					dossierid, dossierIdCTN,
					
					start, end, orderByComparator
				};
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if ((dossierid != vrrpDossierStatistics.getDossierid()) ||
							!Objects.equals(dossierIdCTN,
								vrrpDossierStatistics.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERID_2);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierid);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierIdCTN_First(long dossierid,
		String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierIdCTN_First(dossierid,
				dossierIdCTN, orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierid=");
		msg.append(dossierid);

		msg.append(", dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierIdCTN_First(long dossierid,
		String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByDossierIdCTN(dossierid,
				dossierIdCTN, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierIdCTN_Last(long dossierid,
		String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierIdCTN_Last(dossierid,
				dossierIdCTN, orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierid=");
		msg.append(dossierid);

		msg.append(", dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierIdCTN_Last(long dossierid,
		String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByDossierIdCTN(dossierid, dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByDossierIdCTN(dossierid,
				dossierIdCTN, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByDossierIdCTN_PrevAndNext(long id,
		long dossierid, String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrrpDossierStatistics, dossierid, dossierIdCTN,
					orderByComparator, true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrrpDossierStatistics, dossierid, dossierIdCTN,
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

	protected VRRPDossierStatistics getByDossierIdCTN_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		long dossierid, String dossierIdCTN,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
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

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERID_2);

		boolean bindDossierIdCTN = false;

		if (dossierIdCTN == null) {
			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
		}
		else if (dossierIdCTN.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
		}
		else {
			bindDossierIdCTN = true;

			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierid);

		if (bindDossierIdCTN) {
			qPos.add(dossierIdCTN);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(long dossierid, String dossierIdCTN) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByDossierIdCTN(
				dossierid, dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where dossierid = &#63; and dossierIdCTN = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByDossierIdCTN(long dossierid, String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierid, dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERID_2);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierid);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERID_2 = "vrrpDossierStatistics.dossierid = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrrpDossierStatistics.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrrpDossierStatistics.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrrpDossierStatistics.dossierIdCTN IS NULL OR vrrpDossierStatistics.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			VRRPDossierStatisticsModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierId(long dossierid) {
		return findByDossierId(dossierid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where dossierid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end) {
		return findByDossierId(dossierid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByDossierId(dossierid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierid the dossierid
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierId(long dossierid,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierid, start, end, orderByComparator };
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if ((dossierid != vrrpDossierStatistics.getDossierid())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierid);

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierId_First(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierId_First(dossierid,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierid=");
		msg.append(dossierid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierId_First(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByDossierId(dossierid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierId_Last(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierId_Last(dossierid,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierid=");
		msg.append(dossierid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierId_Last(long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByDossierId(dossierid);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByDossierId(dossierid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierid = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param dossierid the dossierid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByDossierId_PrevAndNext(long id,
		long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrrpDossierStatistics, dossierid, orderByComparator, true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByDossierId_PrevAndNext(session,
					vrrpDossierStatistics, dossierid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRPDossierStatistics getByDossierId_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		long dossierid,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where dossierid = &#63; from the database.
	 *
	 * @param dossierid the dossierid
	 */
	@Override
	public void removeByDossierId(long dossierid) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByDossierId(
				dossierid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where dossierid = &#63;.
	 *
	 * @param dossierid the dossierid
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByDossierId(long dossierid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierid);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrrpDossierStatistics.dossierid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName() },
			VRRPDossierStatisticsModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierNo(String dossierno) {
		return findByDossierNo(dossierno, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where dossierno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierno the dossierno
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierNo(String dossierno,
		int start, int end) {
		return findByDossierNo(dossierno, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierno the dossierno
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierNo(String dossierno,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByDossierNo(dossierno, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where dossierno = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierno the dossierno
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByDossierNo(String dossierno,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] { dossierno };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] { dossierno, start, end, orderByComparator };
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if (!Objects.equals(dossierno,
								vrrpDossierStatistics.getDossierno())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindDossierno = false;

			if (dossierno == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierno = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierno) {
					qPos.add(dossierno);
				}

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierNo_First(String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierNo_First(dossierno,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierno=");
		msg.append(dossierno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierNo_First(String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByDossierNo(dossierno, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByDossierNo_Last(String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByDossierNo_Last(dossierno,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierno=");
		msg.append(dossierno);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByDossierNo_Last(String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByDossierNo(dossierno);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByDossierNo(dossierno,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where dossierno = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param dossierno the dossierno
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByDossierNo_PrevAndNext(long id,
		String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrrpDossierStatistics, dossierno, orderByComparator, true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrrpDossierStatistics, dossierno, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRPDossierStatistics getByDossierNo_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		String dossierno,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

		boolean bindDossierno = false;

		if (dossierno == null) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
		}
		else if (dossierno.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
		}
		else {
			bindDossierno = true;

			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierno) {
			qPos.add(dossierno);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where dossierno = &#63; from the database.
	 *
	 * @param dossierno the dossierno
	 */
	@Override
	public void removeByDossierNo(String dossierno) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByDossierNo(
				dossierno, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where dossierno = &#63;.
	 *
	 * @param dossierno the dossierno
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByDossierNo(String dossierno) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierno };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindDossierno = false;

			if (dossierno == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierno = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierno) {
					qPos.add(dossierno);
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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrrpDossierStatistics.dossierno IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrrpDossierStatistics.dossierno = ?";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrrpDossierStatistics.dossierno IS NULL OR vrrpDossierStatistics.dossierno = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApplicantNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApplicantNo",
			new String[] { String.class.getName() },
			VRRPDossierStatisticsModelImpl.APPLICANTNO_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLICANTNO = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApplicantNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByApplicantNo(String applicantNo) {
		return findByApplicantNo(applicantNo, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByApplicantNo(String applicantNo,
		int start, int end) {
		return findByApplicantNo(applicantNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByApplicantNo(String applicantNo,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByApplicantNo(applicantNo, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where applicantNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param applicantNo the applicant no
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByApplicantNo(String applicantNo,
		int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO;
			finderArgs = new Object[] { applicantNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLICANTNO;
			finderArgs = new Object[] { applicantNo, start, end, orderByComparator };
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if (!Objects.equals(applicantNo,
								vrrpDossierStatistics.getApplicantNo())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
				}

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByApplicantNo_First(String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByApplicantNo_First(applicantNo,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByApplicantNo_First(String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByApplicantNo(applicantNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByApplicantNo_Last(String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByApplicantNo_Last(applicantNo,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applicantNo=");
		msg.append(applicantNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByApplicantNo_Last(String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByApplicantNo(applicantNo);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByApplicantNo(applicantNo,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where applicantNo = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param applicantNo the applicant no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByApplicantNo_PrevAndNext(long id,
		String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByApplicantNo_PrevAndNext(session,
					vrrpDossierStatistics, applicantNo, orderByComparator, true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByApplicantNo_PrevAndNext(session,
					vrrpDossierStatistics, applicantNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VRRPDossierStatistics getByApplicantNo_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		String applicantNo,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

		boolean bindApplicantNo = false;

		if (applicantNo == null) {
			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
		}
		else if (applicantNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
		}
		else {
			bindApplicantNo = true;

			query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindApplicantNo) {
			qPos.add(applicantNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where applicantNo = &#63; from the database.
	 *
	 * @param applicantNo the applicant no
	 */
	@Override
	public void removeByApplicantNo(String applicantNo) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByApplicantNo(
				applicantNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where applicantNo = &#63;.
	 *
	 * @param applicantNo the applicant no
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByApplicantNo(String applicantNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLICANTNO;

		Object[] finderArgs = new Object[] { applicantNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindApplicantNo = false;

			if (applicantNo == null) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1);
			}
			else if (applicantNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3);
			}
			else {
				bindApplicantNo = true;

				query.append(_FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindApplicantNo) {
					qPos.add(applicantNo);
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

	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_1 = "vrrpDossierStatistics.applicantNo IS NULL";
	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_2 = "vrrpDossierStatistics.applicantNo = ?";
	private static final String _FINDER_COLUMN_APPLICANTNO_APPLICANTNO_3 = "(vrrpDossierStatistics.applicantNo IS NULL OR vrrpDossierStatistics.applicantNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			VRRPDossierStatisticsModelImpl.CORPORATIONID_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByCorporationId(String corporationId) {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByCorporationId(
		String corporationId, int start, int end) {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByCorporationId(corporationId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByCorporationId(
		String corporationId, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					corporationId,
					
					start, end, orderByComparator
				};
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if (!Objects.equals(corporationId,
								vrrpDossierStatistics.getCorporationId())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

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
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByCorporationId_First(
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByCorporationId_First(
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByCorporationId(corporationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByCorporationId_Last(
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByCorporationId_PrevAndNext(long id,
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session,
					vrrpDossierStatistics, corporationId, orderByComparator,
					true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByCorporationId_PrevAndNext(session,
					vrrpDossierStatistics, corporationId, orderByComparator,
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

	protected VRRPDossierStatistics getByCorporationId_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		String corporationId,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 */
	@Override
	public void removeByCorporationId(String corporationId) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByCorporationId(String corporationId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "vrrpDossierStatistics.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "vrrpDossierStatistics.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(vrrpDossierStatistics.corporationId IS NULL OR vrrpDossierStatistics.corporationId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCODE =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorcode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE =
		new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorcode",
			new String[] { String.class.getName() },
			VRRPDossierStatisticsModelImpl.INSPECTORCODE_COLUMN_BITMASK |
			VRRPDossierStatisticsModelImpl.SYNCDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORCODE = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorcode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vrrp dossier statisticses where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @return the matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByInspectorcode(String inspectorcode) {
		return findByInspectorcode(inspectorcode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcode the inspectorcode
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByInspectorcode(
		String inspectorcode, int start, int end) {
		return findByInspectorcode(inspectorcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcode the inspectorcode
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByInspectorcode(
		String inspectorcode, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findByInspectorcode(inspectorcode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses where inspectorcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorcode the inspectorcode
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findByInspectorcode(
		String inspectorcode, int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE;
			finderArgs = new Object[] { inspectorcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORCODE;
			finderArgs = new Object[] {
					inspectorcode,
					
					start, end, orderByComparator
				};
		}

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRRPDossierStatistics vrrpDossierStatistics : list) {
					if (!Objects.equals(inspectorcode,
								vrrpDossierStatistics.getInspectorcode())) {
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

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindInspectorcode = false;

			if (inspectorcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_1);
			}
			else if (inspectorcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_3);
			}
			else {
				bindInspectorcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcode) {
					qPos.add(inspectorcode);
				}

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByInspectorcode_First(
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByInspectorcode_First(inspectorcode,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcode=");
		msg.append(inspectorcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the first vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByInspectorcode_First(
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		List<VRRPDossierStatistics> list = findByInspectorcode(inspectorcode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByInspectorcode_Last(
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByInspectorcode_Last(inspectorcode,
				orderByComparator);

		if (vrrpDossierStatistics != null) {
			return vrrpDossierStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorcode=");
		msg.append(inspectorcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRRPDossierStatisticsException(msg.toString());
	}

	/**
	 * Returns the last vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByInspectorcode_Last(
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		int count = countByInspectorcode(inspectorcode);

		if (count == 0) {
			return null;
		}

		List<VRRPDossierStatistics> list = findByInspectorcode(inspectorcode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vrrp dossier statisticses before and after the current vrrp dossier statistics in the ordered set where inspectorcode = &#63;.
	 *
	 * @param id the primary key of the current vrrp dossier statistics
	 * @param inspectorcode the inspectorcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics[] findByInspectorcode_PrevAndNext(long id,
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics[] array = new VRRPDossierStatisticsImpl[3];

			array[0] = getByInspectorcode_PrevAndNext(session,
					vrrpDossierStatistics, inspectorcode, orderByComparator,
					true);

			array[1] = vrrpDossierStatistics;

			array[2] = getByInspectorcode_PrevAndNext(session,
					vrrpDossierStatistics, inspectorcode, orderByComparator,
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

	protected VRRPDossierStatistics getByInspectorcode_PrevAndNext(
		Session session, VRRPDossierStatistics vrrpDossierStatistics,
		String inspectorcode,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

		boolean bindInspectorcode = false;

		if (inspectorcode == null) {
			query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_1);
		}
		else if (inspectorcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_3);
		}
		else {
			bindInspectorcode = true;

			query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_2);
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
			query.append(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectorcode) {
			qPos.add(inspectorcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrrpDossierStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRRPDossierStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vrrp dossier statisticses where inspectorcode = &#63; from the database.
	 *
	 * @param inspectorcode the inspectorcode
	 */
	@Override
	public void removeByInspectorcode(String inspectorcode) {
		for (VRRPDossierStatistics vrrpDossierStatistics : findByInspectorcode(
				inspectorcode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses where inspectorcode = &#63;.
	 *
	 * @param inspectorcode the inspectorcode
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByInspectorcode(String inspectorcode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORCODE;

		Object[] finderArgs = new Object[] { inspectorcode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindInspectorcode = false;

			if (inspectorcode == null) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_1);
			}
			else if (inspectorcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_3);
			}
			else {
				bindInspectorcode = true;

				query.append(_FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectorcode) {
					qPos.add(inspectorcode);
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

	private static final String _FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_1 = "vrrpDossierStatistics.inspectorcode IS NULL";
	private static final String _FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_2 = "vrrpDossierStatistics.inspectorcode = ?";
	private static final String _FINDER_COLUMN_INSPECTORCODE_INSPECTORCODE_3 = "(vrrpDossierStatistics.inspectorcode IS NULL OR vrrpDossierStatistics.inspectorcode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_dossierIdCTN", new String[] { String.class.getName() },
			VRRPDossierStatisticsModelImpl.DOSSIERIDCTN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN = new FinderPath(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_dossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns the vrrp dossier statistics where dossierIdCTN = &#63; or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics findByF_dossierIdCTN(String dossierIdCTN)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByF_dossierIdCTN(dossierIdCTN);

		if (vrrpDossierStatistics == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("dossierIdCTN=");
			msg.append(dossierIdCTN);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchVRRPDossierStatisticsException(msg.toString());
		}

		return vrrpDossierStatistics;
	}

	/**
	 * Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByF_dossierIdCTN(String dossierIdCTN) {
		return fetchByF_dossierIdCTN(dossierIdCTN, true);
	}

	/**
	 * Returns the vrrp dossier statistics where dossierIdCTN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching vrrp dossier statistics, or <code>null</code> if a matching vrrp dossier statistics could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByF_dossierIdCTN(String dossierIdCTN,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { dossierIdCTN };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN,
					finderArgs, this);
		}

		if (result instanceof VRRPDossierStatistics) {
			VRRPDossierStatistics vrrpDossierStatistics = (VRRPDossierStatistics)result;

			if (!Objects.equals(dossierIdCTN,
						vrrpDossierStatistics.getDossierIdCTN())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
				}

				List<VRRPDossierStatistics> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"VRRPDossierStatisticsPersistenceImpl.fetchByF_dossierIdCTN(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					VRRPDossierStatistics vrrpDossierStatistics = list.get(0);

					result = vrrpDossierStatistics;

					cacheResult(vrrpDossierStatistics);

					if ((vrrpDossierStatistics.getDossierIdCTN() == null) ||
							!vrrpDossierStatistics.getDossierIdCTN()
													  .equals(dossierIdCTN)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN,
							finderArgs, vrrpDossierStatistics);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN,
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
			return (VRRPDossierStatistics)result;
		}
	}

	/**
	 * Removes the vrrp dossier statistics where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the vrrp dossier statistics that was removed
	 */
	@Override
	public VRRPDossierStatistics removeByF_dossierIdCTN(String dossierIdCTN)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = findByF_dossierIdCTN(dossierIdCTN);

		return remove(vrrpDossierStatistics);
	}

	/**
	 * Returns the number of vrrp dossier statisticses where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vrrp dossier statisticses
	 */
	@Override
	public int countByF_dossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE);

			boolean bindDossierIdCTN = false;

			if (dossierIdCTN == null) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1);
			}
			else if (dossierIdCTN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3);
			}
			else {
				bindDossierIdCTN = true;

				query.append(_FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierIdCTN) {
					qPos.add(dossierIdCTN);
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

	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrrpDossierStatistics.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrrpDossierStatistics.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_F_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrrpDossierStatistics.dossierIdCTN IS NULL OR vrrpDossierStatistics.dossierIdCTN = '')";

	public VRRPDossierStatisticsPersistenceImpl() {
		setModelClass(VRRPDossierStatistics.class);
	}

	/**
	 * Caches the vrrp dossier statistics in the entity cache if it is enabled.
	 *
	 * @param vrrpDossierStatistics the vrrp dossier statistics
	 */
	@Override
	public void cacheResult(VRRPDossierStatistics vrrpDossierStatistics) {
		entityCache.putResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			vrrpDossierStatistics.getPrimaryKey(), vrrpDossierStatistics);

		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN,
			new Object[] { vrrpDossierStatistics.getDossierIdCTN() },
			vrrpDossierStatistics);

		vrrpDossierStatistics.resetOriginalValues();
	}

	/**
	 * Caches the vrrp dossier statisticses in the entity cache if it is enabled.
	 *
	 * @param vrrpDossierStatisticses the vrrp dossier statisticses
	 */
	@Override
	public void cacheResult(List<VRRPDossierStatistics> vrrpDossierStatisticses) {
		for (VRRPDossierStatistics vrrpDossierStatistics : vrrpDossierStatisticses) {
			if (entityCache.getResult(
						VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						VRRPDossierStatisticsImpl.class,
						vrrpDossierStatistics.getPrimaryKey()) == null) {
				cacheResult(vrrpDossierStatistics);
			}
			else {
				vrrpDossierStatistics.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vrrp dossier statisticses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRRPDossierStatisticsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vrrp dossier statistics.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRRPDossierStatistics vrrpDossierStatistics) {
		entityCache.removeResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			vrrpDossierStatistics.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((VRRPDossierStatisticsModelImpl)vrrpDossierStatistics,
			true);
	}

	@Override
	public void clearCache(List<VRRPDossierStatistics> vrrpDossierStatisticses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRRPDossierStatistics vrrpDossierStatistics : vrrpDossierStatisticses) {
			entityCache.removeResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				VRRPDossierStatisticsImpl.class,
				vrrpDossierStatistics.getPrimaryKey());

			clearUniqueFindersCache((VRRPDossierStatisticsModelImpl)vrrpDossierStatistics,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		VRRPDossierStatisticsModelImpl vrrpDossierStatisticsModelImpl) {
		Object[] args = new Object[] {
				vrrpDossierStatisticsModelImpl.getDossierIdCTN()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN, args,
			vrrpDossierStatisticsModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		VRRPDossierStatisticsModelImpl vrrpDossierStatisticsModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					vrrpDossierStatisticsModelImpl.getDossierIdCTN()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN, args);
		}

		if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					vrrpDossierStatisticsModelImpl.getOriginalDossierIdCTN()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_F_DOSSIERIDCTN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_F_DOSSIERIDCTN, args);
		}
	}

	/**
	 * Creates a new vrrp dossier statistics with the primary key. Does not add the vrrp dossier statistics to the database.
	 *
	 * @param id the primary key for the new vrrp dossier statistics
	 * @return the new vrrp dossier statistics
	 */
	@Override
	public VRRPDossierStatistics create(long id) {
		VRRPDossierStatistics vrrpDossierStatistics = new VRRPDossierStatisticsImpl();

		vrrpDossierStatistics.setNew(true);
		vrrpDossierStatistics.setPrimaryKey(id);

		return vrrpDossierStatistics;
	}

	/**
	 * Removes the vrrp dossier statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics that was removed
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics remove(long id)
		throws NoSuchVRRPDossierStatisticsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vrrp dossier statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics that was removed
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics remove(Serializable primaryKey)
		throws NoSuchVRRPDossierStatisticsException {
		Session session = null;

		try {
			session = openSession();

			VRRPDossierStatistics vrrpDossierStatistics = (VRRPDossierStatistics)session.get(VRRPDossierStatisticsImpl.class,
					primaryKey);

			if (vrrpDossierStatistics == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRRPDossierStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrrpDossierStatistics);
		}
		catch (NoSuchVRRPDossierStatisticsException nsee) {
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
	protected VRRPDossierStatistics removeImpl(
		VRRPDossierStatistics vrrpDossierStatistics) {
		vrrpDossierStatistics = toUnwrappedModel(vrrpDossierStatistics);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrrpDossierStatistics)) {
				vrrpDossierStatistics = (VRRPDossierStatistics)session.get(VRRPDossierStatisticsImpl.class,
						vrrpDossierStatistics.getPrimaryKeyObj());
			}

			if (vrrpDossierStatistics != null) {
				session.delete(vrrpDossierStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrrpDossierStatistics != null) {
			clearCache(vrrpDossierStatistics);
		}

		return vrrpDossierStatistics;
	}

	@Override
	public VRRPDossierStatistics updateImpl(
		VRRPDossierStatistics vrrpDossierStatistics) {
		vrrpDossierStatistics = toUnwrappedModel(vrrpDossierStatistics);

		boolean isNew = vrrpDossierStatistics.isNew();

		VRRPDossierStatisticsModelImpl vrrpDossierStatisticsModelImpl = (VRRPDossierStatisticsModelImpl)vrrpDossierStatistics;

		Session session = null;

		try {
			session = openSession();

			if (vrrpDossierStatistics.isNew()) {
				session.save(vrrpDossierStatistics);

				vrrpDossierStatistics.setNew(false);
			}
			else {
				vrrpDossierStatistics = (VRRPDossierStatistics)session.merge(vrrpDossierStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRRPDossierStatisticsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalDossierid(),
						vrrpDossierStatisticsModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getDossierid(),
						vrrpDossierStatisticsModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalDossierid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getDossierid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalDossierno()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getDossierno()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalApplicantNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getApplicantNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_APPLICANTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLICANTNO,
					args);
			}

			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getCorporationId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((vrrpDossierStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrrpDossierStatisticsModelImpl.getOriginalInspectorcode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE,
					args);

				args = new Object[] {
						vrrpDossierStatisticsModelImpl.getInspectorcode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INSPECTORCODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORCODE,
					args);
			}
		}

		entityCache.putResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			VRRPDossierStatisticsImpl.class,
			vrrpDossierStatistics.getPrimaryKey(), vrrpDossierStatistics, false);

		clearUniqueFindersCache(vrrpDossierStatisticsModelImpl, false);
		cacheUniqueFindersCache(vrrpDossierStatisticsModelImpl);

		vrrpDossierStatistics.resetOriginalValues();

		return vrrpDossierStatistics;
	}

	protected VRRPDossierStatistics toUnwrappedModel(
		VRRPDossierStatistics vrrpDossierStatistics) {
		if (vrrpDossierStatistics instanceof VRRPDossierStatisticsImpl) {
			return vrrpDossierStatistics;
		}

		VRRPDossierStatisticsImpl vrrpDossierStatisticsImpl = new VRRPDossierStatisticsImpl();

		vrrpDossierStatisticsImpl.setNew(vrrpDossierStatistics.isNew());
		vrrpDossierStatisticsImpl.setPrimaryKey(vrrpDossierStatistics.getPrimaryKey());

		vrrpDossierStatisticsImpl.setId(vrrpDossierStatistics.getId());
		vrrpDossierStatisticsImpl.setDossierid(vrrpDossierStatistics.getDossierid());
		vrrpDossierStatisticsImpl.setDossierIdCTN(vrrpDossierStatistics.getDossierIdCTN());
		vrrpDossierStatisticsImpl.setDossierno(vrrpDossierStatistics.getDossierno());
		vrrpDossierStatisticsImpl.setDossiersendingdate(vrrpDossierStatistics.getDossiersendingdate());
		vrrpDossierStatisticsImpl.setDossierreceivingdate(vrrpDossierStatistics.getDossierreceivingdate());
		vrrpDossierStatisticsImpl.setDossierfirstupdatingdate(vrrpDossierStatistics.getDossierfirstupdatingdate());
		vrrpDossierStatisticsImpl.setDossierlastupdatingdate(vrrpDossierStatistics.getDossierlastupdatingdate());
		vrrpDossierStatisticsImpl.setDossierendorsementdate(vrrpDossierStatistics.getDossierendorsementdate());
		vrrpDossierStatisticsImpl.setDossiersubmittingdate(vrrpDossierStatistics.getDossiersubmittingdate());
		vrrpDossierStatisticsImpl.setDossierfirstcertificatesigndate(vrrpDossierStatistics.getDossierfirstcertificatesigndate());
		vrrpDossierStatisticsImpl.setDossierfirstassignmentdate(vrrpDossierStatistics.getDossierfirstassignmentdate());
		vrrpDossierStatisticsImpl.setDossierfirstreviewdate(vrrpDossierStatistics.getDossierfirstreviewdate());
		vrrpDossierStatisticsImpl.setDossiernexttreviewdate(vrrpDossierStatistics.getDossiernexttreviewdate());
		vrrpDossierStatisticsImpl.setDossierlastassignmentdate(vrrpDossierStatistics.getDossierlastassignmentdate());
		vrrpDossierStatisticsImpl.setDossierreviewadjustdate(vrrpDossierStatistics.getDossierreviewadjustdate());
		vrrpDossierStatisticsImpl.setDossierlastreviewadjustdate(vrrpDossierStatistics.getDossierlastreviewadjustdate());
		vrrpDossierStatisticsImpl.setDossierlastcertificatesigndate(vrrpDossierStatistics.getDossierlastcertificatesigndate());
		vrrpDossierStatisticsImpl.setDossierdeadline(vrrpDossierStatistics.getDossierdeadline());
		vrrpDossierStatisticsImpl.setDossierfinisheddate(vrrpDossierStatistics.getDossierfinisheddate());
		vrrpDossierStatisticsImpl.setDossiercancellingdate(vrrpDossierStatistics.getDossiercancellingdate());
		vrrpDossierStatisticsImpl.setDossierexpiredate(vrrpDossierStatistics.getDossierexpiredate());
		vrrpDossierStatisticsImpl.setDossierviolatingdate(vrrpDossierStatistics.getDossierviolatingdate());
		vrrpDossierStatisticsImpl.setDossierviolatingfromdate(vrrpDossierStatistics.getDossierviolatingfromdate());
		vrrpDossierStatisticsImpl.setDossierviolatingtodate(vrrpDossierStatistics.getDossierviolatingtodate());
		vrrpDossierStatisticsImpl.setDossiertype(vrrpDossierStatistics.getDossiertype());
		vrrpDossierStatisticsImpl.setDossiertype_endorsed(vrrpDossierStatistics.getDossiertype_endorsed());
		vrrpDossierStatisticsImpl.setDossiertype_expired(vrrpDossierStatistics.getDossiertype_expired());
		vrrpDossierStatisticsImpl.setDossiertype_updated(vrrpDossierStatistics.getDossiertype_updated());
		vrrpDossierStatisticsImpl.setDossiertype_delayed(vrrpDossierStatistics.getDossiertype_delayed());
		vrrpDossierStatisticsImpl.setDossierdelayday(vrrpDossierStatistics.getDossierdelayday());
		vrrpDossierStatisticsImpl.setDossierdelayreason(vrrpDossierStatistics.getDossierdelayreason());
		vrrpDossierStatisticsImpl.setDossierstatus_processing(vrrpDossierStatistics.getDossierstatus_processing());
		vrrpDossierStatisticsImpl.setDossiersubstatus(vrrpDossierStatistics.getDossiersubstatus());
		vrrpDossierStatisticsImpl.setDossierresult(vrrpDossierStatistics.getDossierresult());
		vrrpDossierStatisticsImpl.setRemarkToUpdate(vrrpDossierStatistics.getRemarkToUpdate());
		vrrpDossierStatisticsImpl.setRemarkToResult(vrrpDossierStatistics.getRemarkToResult());
		vrrpDossierStatisticsImpl.setResultdescription1(vrrpDossierStatistics.getResultdescription1());
		vrrpDossierStatisticsImpl.setResultdescription2(vrrpDossierStatistics.getResultdescription2());
		vrrpDossierStatisticsImpl.setResultdescription3(vrrpDossierStatistics.getResultdescription3());
		vrrpDossierStatisticsImpl.setApplicantNo(vrrpDossierStatistics.getApplicantNo());
		vrrpDossierStatisticsImpl.setApplicantname(vrrpDossierStatistics.getApplicantname());
		vrrpDossierStatisticsImpl.setApplicantaddress(vrrpDossierStatistics.getApplicantaddress());
		vrrpDossierStatisticsImpl.setProductionplantname(vrrpDossierStatistics.getProductionplantname());
		vrrpDossierStatisticsImpl.setProductionplantaddress(vrrpDossierStatistics.getProductionplantaddress());
		vrrpDossierStatisticsImpl.setDomesticFDI(vrrpDossierStatistics.getDomesticFDI());
		vrrpDossierStatisticsImpl.setVehicleclass(vrrpDossierStatistics.getVehicleclass());
		vrrpDossierStatisticsImpl.setCertifiedvehicletype(vrrpDossierStatistics.getCertifiedvehicletype());
		vrrpDossierStatisticsImpl.setCertifiedvehicletypedescription(vrrpDossierStatistics.getCertifiedvehicletypedescription());
		vrrpDossierStatisticsImpl.setCertifiedtrademark(vrrpDossierStatistics.getCertifiedtrademark());
		vrrpDossierStatisticsImpl.setCertifiedtrademarkname(vrrpDossierStatistics.getCertifiedtrademarkname());
		vrrpDossierStatisticsImpl.setCertifiedcommercialname(vrrpDossierStatistics.getCertifiedcommercialname());
		vrrpDossierStatisticsImpl.setCertifiedmodelcode(vrrpDossierStatistics.getCertifiedmodelcode());
		vrrpDossierStatisticsImpl.setCertifiedassemblytype(vrrpDossierStatistics.getCertifiedassemblytype());
		vrrpDossierStatisticsImpl.setCertifiedassemblytypedescription(vrrpDossierStatistics.getCertifiedassemblytypedescription());
		vrrpDossierStatisticsImpl.setEquipmentimportquantity(vrrpDossierStatistics.getEquipmentimportquantity());
		vrrpDossierStatisticsImpl.setSeatNumber(vrrpDossierStatistics.getSeatNumber());
		vrrpDossierStatisticsImpl.setEngineType(vrrpDossierStatistics.getEngineType());
		vrrpDossierStatisticsImpl.setEngineTypeDescription(vrrpDossierStatistics.getEngineTypeDescription());
		vrrpDossierStatisticsImpl.setCertificaterecordno_new(vrrpDossierStatistics.getCertificaterecordno_new());
		vrrpDossierStatisticsImpl.setCertificaterecordno_renew(vrrpDossierStatistics.getCertificaterecordno_renew());
		vrrpDossierStatisticsImpl.setCertificateyear(vrrpDossierStatistics.getCertificateyear());
		vrrpDossierStatisticsImpl.setCertificatemonth(vrrpDossierStatistics.getCertificatemonth());
		vrrpDossierStatisticsImpl.setCorporationId(vrrpDossierStatistics.getCorporationId());
		vrrpDossierStatisticsImpl.setInspectorcode(vrrpDossierStatistics.getInspectorcode());
		vrrpDossierStatisticsImpl.setInspectorname(vrrpDossierStatistics.getInspectorname());
		vrrpDossierStatisticsImpl.setLeadername(vrrpDossierStatistics.getLeadername());
		vrrpDossierStatisticsImpl.setMen2receiving(vrrpDossierStatistics.getMen2receiving());
		vrrpDossierStatisticsImpl.setMen2firstupdating(vrrpDossierStatistics.getMen2firstupdating());
		vrrpDossierStatisticsImpl.setMen2lastupdating(vrrpDossierStatistics.getMen2lastupdating());
		vrrpDossierStatisticsImpl.setMen2endorsement(vrrpDossierStatistics.getMen2endorsement());
		vrrpDossierStatisticsImpl.setMen2submitting(vrrpDossierStatistics.getMen2submitting());
		vrrpDossierStatisticsImpl.setMen2firstcertificate(vrrpDossierStatistics.getMen2firstcertificate());
		vrrpDossierStatisticsImpl.setMen2firstassignment(vrrpDossierStatistics.getMen2firstassignment());
		vrrpDossierStatisticsImpl.setMen2firstreview(vrrpDossierStatistics.getMen2firstreview());
		vrrpDossierStatisticsImpl.setMen2nexttreview(vrrpDossierStatistics.getMen2nexttreview());
		vrrpDossierStatisticsImpl.setMen2lastassignment(vrrpDossierStatistics.getMen2lastassignment());
		vrrpDossierStatisticsImpl.setMen2reviewadjust(vrrpDossierStatistics.getMen2reviewadjust());
		vrrpDossierStatisticsImpl.setMen2lastreviewadjust(vrrpDossierStatistics.getMen2lastreviewadjust());
		vrrpDossierStatisticsImpl.setMen2lastcertificatesign(vrrpDossierStatistics.getMen2lastcertificatesign());
		vrrpDossierStatisticsImpl.setMen2finished(vrrpDossierStatistics.getMen2finished());
		vrrpDossierStatisticsImpl.setMen2cancelled(vrrpDossierStatistics.getMen2cancelled());
		vrrpDossierStatisticsImpl.setMen2expired(vrrpDossierStatistics.getMen2expired());
		vrrpDossierStatisticsImpl.setMen2violated(vrrpDossierStatistics.getMen2violated());
		vrrpDossierStatisticsImpl.setDossierPaymentDate(vrrpDossierStatistics.getDossierPaymentDate());
		vrrpDossierStatisticsImpl.setMen2PaymentApproval(vrrpDossierStatistics.getMen2PaymentApproval());
		vrrpDossierStatisticsImpl.setModifyDate(vrrpDossierStatistics.getModifyDate());
		vrrpDossierStatisticsImpl.setSyncDate(vrrpDossierStatistics.getSyncDate());

		return vrrpDossierStatisticsImpl;
	}

	/**
	 * Returns the vrrp dossier statistics with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRRPDossierStatisticsException {
		VRRPDossierStatistics vrrpDossierStatistics = fetchByPrimaryKey(primaryKey);

		if (vrrpDossierStatistics == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRRPDossierStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrrpDossierStatistics;
	}

	/**
	 * Returns the vrrp dossier statistics with the primary key or throws a {@link NoSuchVRRPDossierStatisticsException} if it could not be found.
	 *
	 * @param id the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics
	 * @throws NoSuchVRRPDossierStatisticsException if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics findByPrimaryKey(long id)
		throws NoSuchVRRPDossierStatisticsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vrrp dossier statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics, or <code>null</code> if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				VRRPDossierStatisticsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRRPDossierStatistics vrrpDossierStatistics = (VRRPDossierStatistics)serializable;

		if (vrrpDossierStatistics == null) {
			Session session = null;

			try {
				session = openSession();

				vrrpDossierStatistics = (VRRPDossierStatistics)session.get(VRRPDossierStatisticsImpl.class,
						primaryKey);

				if (vrrpDossierStatistics != null) {
					cacheResult(vrrpDossierStatistics);
				}
				else {
					entityCache.putResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						VRRPDossierStatisticsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
					VRRPDossierStatisticsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrrpDossierStatistics;
	}

	/**
	 * Returns the vrrp dossier statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vrrp dossier statistics
	 * @return the vrrp dossier statistics, or <code>null</code> if a vrrp dossier statistics with the primary key could not be found
	 */
	@Override
	public VRRPDossierStatistics fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRRPDossierStatistics> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRRPDossierStatistics> map = new HashMap<Serializable, VRRPDossierStatistics>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRRPDossierStatistics vrrpDossierStatistics = fetchByPrimaryKey(primaryKey);

			if (vrrpDossierStatistics != null) {
				map.put(primaryKey, vrrpDossierStatistics);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
					VRRPDossierStatisticsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRRPDossierStatistics)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE_PKS_IN);

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

			for (VRRPDossierStatistics vrrpDossierStatistics : (List<VRRPDossierStatistics>)q.list()) {
				map.put(vrrpDossierStatistics.getPrimaryKeyObj(),
					vrrpDossierStatistics);

				cacheResult(vrrpDossierStatistics);

				uncachedPrimaryKeys.remove(vrrpDossierStatistics.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRRPDossierStatisticsModelImpl.ENTITY_CACHE_ENABLED,
					VRRPDossierStatisticsImpl.class, primaryKey, nullModel);
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
	 * Returns all the vrrp dossier statisticses.
	 *
	 * @return the vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vrrp dossier statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @return the range of vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findAll(int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vrrp dossier statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRRPDossierStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrrp dossier statisticses
	 * @param end the upper bound of the range of vrrp dossier statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vrrp dossier statisticses
	 */
	@Override
	public List<VRRPDossierStatistics> findAll(int start, int end,
		OrderByComparator<VRRPDossierStatistics> orderByComparator,
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

		List<VRRPDossierStatistics> list = null;

		if (retrieveFromCache) {
			list = (List<VRRPDossierStatistics>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRRPDOSSIERSTATISTICS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRRPDOSSIERSTATISTICS;

				if (pagination) {
					sql = sql.concat(VRRPDossierStatisticsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRRPDossierStatistics>)QueryUtil.list(q,
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
	 * Removes all the vrrp dossier statisticses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRRPDossierStatistics vrrpDossierStatistics : findAll()) {
			remove(vrrpDossierStatistics);
		}
	}

	/**
	 * Returns the number of vrrp dossier statisticses.
	 *
	 * @return the number of vrrp dossier statisticses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRRPDOSSIERSTATISTICS);

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
		return VRRPDossierStatisticsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vrrp dossier statistics persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRRPDossierStatisticsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRRPDOSSIERSTATISTICS = "SELECT vrrpDossierStatistics FROM VRRPDossierStatistics vrrpDossierStatistics";
	private static final String _SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE_PKS_IN = "SELECT vrrpDossierStatistics FROM VRRPDossierStatistics vrrpDossierStatistics WHERE id IN (";
	private static final String _SQL_SELECT_VRRPDOSSIERSTATISTICS_WHERE = "SELECT vrrpDossierStatistics FROM VRRPDossierStatistics vrrpDossierStatistics WHERE ";
	private static final String _SQL_COUNT_VRRPDOSSIERSTATISTICS = "SELECT COUNT(vrrpDossierStatistics) FROM VRRPDossierStatistics vrrpDossierStatistics";
	private static final String _SQL_COUNT_VRRPDOSSIERSTATISTICS_WHERE = "SELECT COUNT(vrrpDossierStatistics) FROM VRRPDossierStatistics vrrpDossierStatistics WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrrpDossierStatistics.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRRPDossierStatistics exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRRPDossierStatistics exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRRPDossierStatisticsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"dossierPaymentDate", "men2PaymentApproval"
			});
}