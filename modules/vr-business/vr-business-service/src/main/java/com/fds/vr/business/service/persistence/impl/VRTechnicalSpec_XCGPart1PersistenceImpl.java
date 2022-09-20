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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGPart1Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart1;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart1Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart1ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart1Persistence;

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
 * The persistence implementation for the vr technical spec_xcg part1 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart1Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart1Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart1PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCGPart1>
	implements VRTechnicalSpec_XCGPart1Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCGPart1Util} to access the vr technical spec_xcg part1 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCGPart1Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] { dossierNo, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO;
			finderArgs = new Object[] {
					dossierNo, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCGPart1.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCGPart1.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

				qPos.add(mtCore);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCGPart1 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		boolean bindDossierNo = false;

		if (dossierNo == null) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
		}
		else if (dossierNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
		}
		else {
			bindDossierNo = true;

			query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
		}

		query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierNo) {
			qPos.add(dossierNo);
		}

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindDossierNo = false;

			if (dossierNo == null) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1);
			}
			else if (dossierNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3);
			}
			else {
				bindDossierNo = true;

				query.append(_FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2);
			}

			query.append(_FINDER_COLUMN_DOSSIERNO_MTCORE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDossierNo) {
					qPos.add(dossierNo);
				}

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCGPart1.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCGPart1.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCGPart1.dossierNo IS NULL OR vrTechnicalSpec_XCGPart1.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCGPart1.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] { dossierIdCTN };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN;
			finderArgs = new Object[] {
					dossierIdCTN,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCGPart1.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart1 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDossierIdCTN) {
			qPos.add(dossierIdCTN);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCGPart1.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCGPart1.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCGPart1.dossierIdCTN IS NULL OR vrTechnicalSpec_XCGPart1.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] { deliverableCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE;
			finderArgs = new Object[] {
					deliverableCode,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCGPart1.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
				}

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, deliverableCode,
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

	protected VRTechnicalSpec_XCGPart1 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		boolean bindDeliverableCode = false;

		if (deliverableCode == null) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
		}
		else if (deliverableCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
		}
		else {
			bindDeliverableCode = true;

			query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDeliverableCode) {
			qPos.add(deliverableCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindDeliverableCode = false;

			if (deliverableCode == null) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1);
			}
			else if (deliverableCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3);
			}
			else {
				bindDeliverableCode = true;

				query.append(_FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeliverableCode) {
					qPos.add(deliverableCode);
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

	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_1 =
		"vrTechnicalSpec_XCGPart1.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCGPart1.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCGPart1.deliverableCode IS NULL OR vrTechnicalSpec_XCGPart1.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, mtCore };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] {
					dossierId, mtCore,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart1.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCGPart1.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCGPart1 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart1.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCGPart1.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart1.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart1 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart1.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID;
			finderArgs = new Object[] { convertAssembleId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID;
			finderArgs = new Object[] {
					convertAssembleId,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCGPart1.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, convertAssembleId,
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

	protected VRTechnicalSpec_XCGPart1 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

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

	private static final String _FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2 =
		"vrTechnicalSpec_XCGPart1.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID;
			finderArgs = new Object[] { referenceUid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID;
			finderArgs = new Object[] {
					referenceUid,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCGPart1.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
				}

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart1 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		boolean bindReferenceUid = false;

		if (referenceUid == null) {
			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
		}
		else if (referenceUid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
		}
		else {
			bindReferenceUid = true;

			query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindReferenceUid) {
			qPos.add(referenceUid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			boolean bindReferenceUid = false;

			if (referenceUid == null) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1);
			}
			else if (referenceUid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3);
			}
			else {
				bindReferenceUid = true;

				query.append(_FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReferenceUid) {
					qPos.add(referenceUid);
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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCGPart1.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCGPart1.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCGPart1.referenceUid IS NULL OR vrTechnicalSpec_XCGPart1.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart1ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart1ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID;
			finderArgs = new Object[] { vehicleTypeCertificateId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID;
			finderArgs = new Object[] {
					vehicleTypeCertificateId,
					
					start, end, orderByComparator
				};
		}

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCGPart1.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part1 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part1 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		List<VRTechnicalSpec_XCGPart1> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart1 != null) {
			return vrTechnicalSpec_XCGPart1;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart1Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part1 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part1, or <code>null</code> if a matching vr technical spec_xcg part1 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart1> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part1s before and after the current vr technical spec_xcg part1 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part1
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1[] array = new VRTechnicalSpec_XCGPart1Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart1;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart1, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCGPart1 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE);

		query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

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
			query.append(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart1);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart1> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xcg part1s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

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

	private static final String _FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2 =
		"vrTechnicalSpec_XCGPart1.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCGPart1PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCGPart1.class);
	}

	/**
	 * Caches the vr technical spec_xcg part1 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart1 the vr technical spec_xcg part1
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		entityCache.putResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			vrTechnicalSpec_XCGPart1.getPrimaryKey(), vrTechnicalSpec_XCGPart1);

		vrTechnicalSpec_XCGPart1.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcg part1s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart1s the vr technical spec_xcg part1s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCGPart1> vrTechnicalSpec_XCGPart1s) {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : vrTechnicalSpec_XCGPart1s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart1Impl.class,
						vrTechnicalSpec_XCGPart1.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCGPart1);
			}
			else {
				vrTechnicalSpec_XCGPart1.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcg part1s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCGPart1Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcg part1.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		entityCache.removeResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			vrTechnicalSpec_XCGPart1.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCGPart1> vrTechnicalSpec_XCGPart1s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : vrTechnicalSpec_XCGPart1s) {
			entityCache.removeResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart1Impl.class,
				vrTechnicalSpec_XCGPart1.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcg part1 with the primary key. Does not add the vr technical spec_xcg part1 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcg part1
	 * @return the new vr technical spec_xcg part1
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 create(long id) {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = new VRTechnicalSpec_XCGPart1Impl();

		vrTechnicalSpec_XCGPart1.setNew(true);
		vrTechnicalSpec_XCGPart1.setPrimaryKey(id);

		return vrTechnicalSpec_XCGPart1;
	}

	/**
	 * Removes the vr technical spec_xcg part1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 remove(long id)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcg part1 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = (VRTechnicalSpec_XCGPart1)session.get(VRTechnicalSpec_XCGPart1Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCGPart1 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCGPart1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCGPart1);
		}
		catch (NoSuchVRTechnicalSpec_XCGPart1Exception nsee) {
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
	protected VRTechnicalSpec_XCGPart1 removeImpl(
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		vrTechnicalSpec_XCGPart1 = toUnwrappedModel(vrTechnicalSpec_XCGPart1);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCGPart1)) {
				vrTechnicalSpec_XCGPart1 = (VRTechnicalSpec_XCGPart1)session.get(VRTechnicalSpec_XCGPart1Impl.class,
						vrTechnicalSpec_XCGPart1.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCGPart1 != null) {
				session.delete(vrTechnicalSpec_XCGPart1);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCGPart1 != null) {
			clearCache(vrTechnicalSpec_XCGPart1);
		}

		return vrTechnicalSpec_XCGPart1;
	}

	@Override
	public VRTechnicalSpec_XCGPart1 updateImpl(
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		vrTechnicalSpec_XCGPart1 = toUnwrappedModel(vrTechnicalSpec_XCGPart1);

		boolean isNew = vrTechnicalSpec_XCGPart1.isNew();

		VRTechnicalSpec_XCGPart1ModelImpl vrTechnicalSpec_XCGPart1ModelImpl = (VRTechnicalSpec_XCGPart1ModelImpl)vrTechnicalSpec_XCGPart1;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCGPart1.isNew()) {
				session.save(vrTechnicalSpec_XCGPart1);

				vrTechnicalSpec_XCGPart1.setNew(false);
			}
			else {
				vrTechnicalSpec_XCGPart1 = (VRTechnicalSpec_XCGPart1)session.merge(vrTechnicalSpec_XCGPart1);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCGPart1ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCGPart1ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getDossierId(),
						vrTechnicalSpec_XCGPart1ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart1ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart1ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart1Impl.class,
			vrTechnicalSpec_XCGPart1.getPrimaryKey(), vrTechnicalSpec_XCGPart1,
			false);

		vrTechnicalSpec_XCGPart1.resetOriginalValues();

		return vrTechnicalSpec_XCGPart1;
	}

	protected VRTechnicalSpec_XCGPart1 toUnwrappedModel(
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1) {
		if (vrTechnicalSpec_XCGPart1 instanceof VRTechnicalSpec_XCGPart1Impl) {
			return vrTechnicalSpec_XCGPart1;
		}

		VRTechnicalSpec_XCGPart1Impl vrTechnicalSpec_XCGPart1Impl = new VRTechnicalSpec_XCGPart1Impl();

		vrTechnicalSpec_XCGPart1Impl.setNew(vrTechnicalSpec_XCGPart1.isNew());
		vrTechnicalSpec_XCGPart1Impl.setPrimaryKey(vrTechnicalSpec_XCGPart1.getPrimaryKey());

		vrTechnicalSpec_XCGPart1Impl.setId(vrTechnicalSpec_XCGPart1.getId());
		vrTechnicalSpec_XCGPart1Impl.setMtCore(vrTechnicalSpec_XCGPart1.getMtCore());
		vrTechnicalSpec_XCGPart1Impl.setConvertAssembleId(vrTechnicalSpec_XCGPart1.getConvertAssembleId());
		vrTechnicalSpec_XCGPart1Impl.setDossierId(vrTechnicalSpec_XCGPart1.getDossierId());
		vrTechnicalSpec_XCGPart1Impl.setDossierNo(vrTechnicalSpec_XCGPart1.getDossierNo());
		vrTechnicalSpec_XCGPart1Impl.setReferenceUid(vrTechnicalSpec_XCGPart1.getReferenceUid());
		vrTechnicalSpec_XCGPart1Impl.setDossierIdCTN(vrTechnicalSpec_XCGPart1.getDossierIdCTN());
		vrTechnicalSpec_XCGPart1Impl.setDeliverableCode(vrTechnicalSpec_XCGPart1.getDeliverableCode());
		vrTechnicalSpec_XCGPart1Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCGPart1.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCGPart1Impl.setLoai_dong_co(vrTechnicalSpec_XCGPart1.getLoai_dong_co());
		vrTechnicalSpec_XCGPart1Impl.setXCG01001(vrTechnicalSpec_XCGPart1.getXCG01001());
		vrTechnicalSpec_XCGPart1Impl.setXCG01002(vrTechnicalSpec_XCGPart1.getXCG01002());
		vrTechnicalSpec_XCGPart1Impl.setXCG01003(vrTechnicalSpec_XCGPart1.getXCG01003());
		vrTechnicalSpec_XCGPart1Impl.setXCG01004(vrTechnicalSpec_XCGPart1.getXCG01004());
		vrTechnicalSpec_XCGPart1Impl.setXCG01005(vrTechnicalSpec_XCGPart1.getXCG01005());
		vrTechnicalSpec_XCGPart1Impl.setXCG01006(vrTechnicalSpec_XCGPart1.getXCG01006());
		vrTechnicalSpec_XCGPart1Impl.setXCG01007(vrTechnicalSpec_XCGPart1.getXCG01007());
		vrTechnicalSpec_XCGPart1Impl.setXCG01008(vrTechnicalSpec_XCGPart1.getXCG01008());
		vrTechnicalSpec_XCGPart1Impl.setXCG01009(vrTechnicalSpec_XCGPart1.getXCG01009());
		vrTechnicalSpec_XCGPart1Impl.setXCG01010(vrTechnicalSpec_XCGPart1.getXCG01010());
		vrTechnicalSpec_XCGPart1Impl.setXCG01011(vrTechnicalSpec_XCGPart1.getXCG01011());
		vrTechnicalSpec_XCGPart1Impl.setXCG01012(vrTechnicalSpec_XCGPart1.getXCG01012());
		vrTechnicalSpec_XCGPart1Impl.setXCG01013(vrTechnicalSpec_XCGPart1.getXCG01013());
		vrTechnicalSpec_XCGPart1Impl.setXCG01014(vrTechnicalSpec_XCGPart1.getXCG01014());
		vrTechnicalSpec_XCGPart1Impl.setXCG01016(vrTechnicalSpec_XCGPart1.getXCG01016());
		vrTechnicalSpec_XCGPart1Impl.setXCG01017(vrTechnicalSpec_XCGPart1.getXCG01017());
		vrTechnicalSpec_XCGPart1Impl.setXCG01019(vrTechnicalSpec_XCGPart1.getXCG01019());
		vrTechnicalSpec_XCGPart1Impl.setXCG01020(vrTechnicalSpec_XCGPart1.getXCG01020());
		vrTechnicalSpec_XCGPart1Impl.setXCG01021(vrTechnicalSpec_XCGPart1.getXCG01021());
		vrTechnicalSpec_XCGPart1Impl.setXCG01022(vrTechnicalSpec_XCGPart1.getXCG01022());
		vrTechnicalSpec_XCGPart1Impl.setXCG01024(vrTechnicalSpec_XCGPart1.getXCG01024());
		vrTechnicalSpec_XCGPart1Impl.setXCG01025(vrTechnicalSpec_XCGPart1.getXCG01025());
		vrTechnicalSpec_XCGPart1Impl.setXCG01026(vrTechnicalSpec_XCGPart1.getXCG01026());
		vrTechnicalSpec_XCGPart1Impl.setXCG01027(vrTechnicalSpec_XCGPart1.getXCG01027());
		vrTechnicalSpec_XCGPart1Impl.setXCG01028(vrTechnicalSpec_XCGPart1.getXCG01028());
		vrTechnicalSpec_XCGPart1Impl.setXCG01030(vrTechnicalSpec_XCGPart1.getXCG01030());
		vrTechnicalSpec_XCGPart1Impl.setXCG01031(vrTechnicalSpec_XCGPart1.getXCG01031());
		vrTechnicalSpec_XCGPart1Impl.setXCG01032(vrTechnicalSpec_XCGPart1.getXCG01032());
		vrTechnicalSpec_XCGPart1Impl.setXCG01033(vrTechnicalSpec_XCGPart1.getXCG01033());
		vrTechnicalSpec_XCGPart1Impl.setXCG01034(vrTechnicalSpec_XCGPart1.getXCG01034());
		vrTechnicalSpec_XCGPart1Impl.setXCG01035(vrTechnicalSpec_XCGPart1.getXCG01035());
		vrTechnicalSpec_XCGPart1Impl.setXCG01036(vrTechnicalSpec_XCGPart1.getXCG01036());
		vrTechnicalSpec_XCGPart1Impl.setXCG01037(vrTechnicalSpec_XCGPart1.getXCG01037());
		vrTechnicalSpec_XCGPart1Impl.setXCG01038(vrTechnicalSpec_XCGPart1.getXCG01038());
		vrTechnicalSpec_XCGPart1Impl.setXCG01039(vrTechnicalSpec_XCGPart1.getXCG01039());
		vrTechnicalSpec_XCGPart1Impl.setXCG01040(vrTechnicalSpec_XCGPart1.getXCG01040());
		vrTechnicalSpec_XCGPart1Impl.setXCG01041(vrTechnicalSpec_XCGPart1.getXCG01041());
		vrTechnicalSpec_XCGPart1Impl.setXCG01042(vrTechnicalSpec_XCGPart1.getXCG01042());
		vrTechnicalSpec_XCGPart1Impl.setXCG01043(vrTechnicalSpec_XCGPart1.getXCG01043());
		vrTechnicalSpec_XCGPart1Impl.setXCG01044(vrTechnicalSpec_XCGPart1.getXCG01044());
		vrTechnicalSpec_XCGPart1Impl.setXCG01045(vrTechnicalSpec_XCGPart1.getXCG01045());
		vrTechnicalSpec_XCGPart1Impl.setXCG01046(vrTechnicalSpec_XCGPart1.getXCG01046());
		vrTechnicalSpec_XCGPart1Impl.setXCG01047(vrTechnicalSpec_XCGPart1.getXCG01047());
		vrTechnicalSpec_XCGPart1Impl.setXCG01049(vrTechnicalSpec_XCGPart1.getXCG01049());
		vrTechnicalSpec_XCGPart1Impl.setXCG01050(vrTechnicalSpec_XCGPart1.getXCG01050());
		vrTechnicalSpec_XCGPart1Impl.setXCG01051(vrTechnicalSpec_XCGPart1.getXCG01051());
		vrTechnicalSpec_XCGPart1Impl.setXCG01052(vrTechnicalSpec_XCGPart1.getXCG01052());
		vrTechnicalSpec_XCGPart1Impl.setXCG01053(vrTechnicalSpec_XCGPart1.getXCG01053());
		vrTechnicalSpec_XCGPart1Impl.setXCG01054(vrTechnicalSpec_XCGPart1.getXCG01054());
		vrTechnicalSpec_XCGPart1Impl.setXCG01055(vrTechnicalSpec_XCGPart1.getXCG01055());
		vrTechnicalSpec_XCGPart1Impl.setXCG01056(vrTechnicalSpec_XCGPart1.getXCG01056());
		vrTechnicalSpec_XCGPart1Impl.setXCG01057(vrTechnicalSpec_XCGPart1.getXCG01057());
		vrTechnicalSpec_XCGPart1Impl.setXCG01058(vrTechnicalSpec_XCGPart1.getXCG01058());
		vrTechnicalSpec_XCGPart1Impl.setXCG01059(vrTechnicalSpec_XCGPart1.getXCG01059());
		vrTechnicalSpec_XCGPart1Impl.setXCG01060(vrTechnicalSpec_XCGPart1.getXCG01060());
		vrTechnicalSpec_XCGPart1Impl.setXCG01062(vrTechnicalSpec_XCGPart1.getXCG01062());
		vrTechnicalSpec_XCGPart1Impl.setXCG01063(vrTechnicalSpec_XCGPart1.getXCG01063());
		vrTechnicalSpec_XCGPart1Impl.setXCG01064(vrTechnicalSpec_XCGPart1.getXCG01064());
		vrTechnicalSpec_XCGPart1Impl.setXCG01065(vrTechnicalSpec_XCGPart1.getXCG01065());
		vrTechnicalSpec_XCGPart1Impl.setXCG01066(vrTechnicalSpec_XCGPart1.getXCG01066());
		vrTechnicalSpec_XCGPart1Impl.setXCG01067(vrTechnicalSpec_XCGPart1.getXCG01067());
		vrTechnicalSpec_XCGPart1Impl.setXCG01068(vrTechnicalSpec_XCGPart1.getXCG01068());
		vrTechnicalSpec_XCGPart1Impl.setXCG01069(vrTechnicalSpec_XCGPart1.getXCG01069());
		vrTechnicalSpec_XCGPart1Impl.setXCG01070(vrTechnicalSpec_XCGPart1.getXCG01070());
		vrTechnicalSpec_XCGPart1Impl.setXCG01072(vrTechnicalSpec_XCGPart1.getXCG01072());
		vrTechnicalSpec_XCGPart1Impl.setXCG01073(vrTechnicalSpec_XCGPart1.getXCG01073());
		vrTechnicalSpec_XCGPart1Impl.setXCG01074(vrTechnicalSpec_XCGPart1.getXCG01074());
		vrTechnicalSpec_XCGPart1Impl.setXCG01075(vrTechnicalSpec_XCGPart1.getXCG01075());
		vrTechnicalSpec_XCGPart1Impl.setXCG01076(vrTechnicalSpec_XCGPart1.getXCG01076());
		vrTechnicalSpec_XCGPart1Impl.setXCG01077(vrTechnicalSpec_XCGPart1.getXCG01077());
		vrTechnicalSpec_XCGPart1Impl.setXCG01078(vrTechnicalSpec_XCGPart1.getXCG01078());
		vrTechnicalSpec_XCGPart1Impl.setXCG01079(vrTechnicalSpec_XCGPart1.getXCG01079());
		vrTechnicalSpec_XCGPart1Impl.setXCG01080(vrTechnicalSpec_XCGPart1.getXCG01080());
		vrTechnicalSpec_XCGPart1Impl.setXCG01081(vrTechnicalSpec_XCGPart1.getXCG01081());
		vrTechnicalSpec_XCGPart1Impl.setXCG01082(vrTechnicalSpec_XCGPart1.getXCG01082());
		vrTechnicalSpec_XCGPart1Impl.setXCG01083(vrTechnicalSpec_XCGPart1.getXCG01083());
		vrTechnicalSpec_XCGPart1Impl.setXCG01084(vrTechnicalSpec_XCGPart1.getXCG01084());
		vrTechnicalSpec_XCGPart1Impl.setXCG01085(vrTechnicalSpec_XCGPart1.getXCG01085());
		vrTechnicalSpec_XCGPart1Impl.setXCG01086(vrTechnicalSpec_XCGPart1.getXCG01086());
		vrTechnicalSpec_XCGPart1Impl.setXCG01087(vrTechnicalSpec_XCGPart1.getXCG01087());
		vrTechnicalSpec_XCGPart1Impl.setXCG01088(vrTechnicalSpec_XCGPart1.getXCG01088());
		vrTechnicalSpec_XCGPart1Impl.setXCG01089(vrTechnicalSpec_XCGPart1.getXCG01089());
		vrTechnicalSpec_XCGPart1Impl.setXCG01090(vrTechnicalSpec_XCGPart1.getXCG01090());
		vrTechnicalSpec_XCGPart1Impl.setXCG01091(vrTechnicalSpec_XCGPart1.getXCG01091());
		vrTechnicalSpec_XCGPart1Impl.setXCG01092(vrTechnicalSpec_XCGPart1.getXCG01092());
		vrTechnicalSpec_XCGPart1Impl.setXCG01093(vrTechnicalSpec_XCGPart1.getXCG01093());
		vrTechnicalSpec_XCGPart1Impl.setXCG01094(vrTechnicalSpec_XCGPart1.getXCG01094());
		vrTechnicalSpec_XCGPart1Impl.setXCG01095(vrTechnicalSpec_XCGPart1.getXCG01095());
		vrTechnicalSpec_XCGPart1Impl.setXCG01096(vrTechnicalSpec_XCGPart1.getXCG01096());
		vrTechnicalSpec_XCGPart1Impl.setXCG01097(vrTechnicalSpec_XCGPart1.getXCG01097());
		vrTechnicalSpec_XCGPart1Impl.setXCG01098(vrTechnicalSpec_XCGPart1.getXCG01098());
		vrTechnicalSpec_XCGPart1Impl.setXCG01099(vrTechnicalSpec_XCGPart1.getXCG01099());
		vrTechnicalSpec_XCGPart1Impl.setXCG01100(vrTechnicalSpec_XCGPart1.getXCG01100());
		vrTechnicalSpec_XCGPart1Impl.setXCG01101(vrTechnicalSpec_XCGPart1.getXCG01101());
		vrTechnicalSpec_XCGPart1Impl.setXCG01102(vrTechnicalSpec_XCGPart1.getXCG01102());
		vrTechnicalSpec_XCGPart1Impl.setXCG01103(vrTechnicalSpec_XCGPart1.getXCG01103());
		vrTechnicalSpec_XCGPart1Impl.setXCG01104(vrTechnicalSpec_XCGPart1.getXCG01104());
		vrTechnicalSpec_XCGPart1Impl.setXCG01105(vrTechnicalSpec_XCGPart1.getXCG01105());
		vrTechnicalSpec_XCGPart1Impl.setXCG01106(vrTechnicalSpec_XCGPart1.getXCG01106());
		vrTechnicalSpec_XCGPart1Impl.setXCG01107(vrTechnicalSpec_XCGPart1.getXCG01107());
		vrTechnicalSpec_XCGPart1Impl.setXCG01108(vrTechnicalSpec_XCGPart1.getXCG01108());
		vrTechnicalSpec_XCGPart1Impl.setXCG01109(vrTechnicalSpec_XCGPart1.getXCG01109());
		vrTechnicalSpec_XCGPart1Impl.setXCG01110(vrTechnicalSpec_XCGPart1.getXCG01110());
		vrTechnicalSpec_XCGPart1Impl.setXCG01111(vrTechnicalSpec_XCGPart1.getXCG01111());
		vrTechnicalSpec_XCGPart1Impl.setXCG01112(vrTechnicalSpec_XCGPart1.getXCG01112());
		vrTechnicalSpec_XCGPart1Impl.setXCG01113(vrTechnicalSpec_XCGPart1.getXCG01113());
		vrTechnicalSpec_XCGPart1Impl.setXCG01114(vrTechnicalSpec_XCGPart1.getXCG01114());
		vrTechnicalSpec_XCGPart1Impl.setXCG01115(vrTechnicalSpec_XCGPart1.getXCG01115());
		vrTechnicalSpec_XCGPart1Impl.setXCG01116(vrTechnicalSpec_XCGPart1.getXCG01116());
		vrTechnicalSpec_XCGPart1Impl.setXCG01117(vrTechnicalSpec_XCGPart1.getXCG01117());
		vrTechnicalSpec_XCGPart1Impl.setXCG01118(vrTechnicalSpec_XCGPart1.getXCG01118());
		vrTechnicalSpec_XCGPart1Impl.setXCG01119(vrTechnicalSpec_XCGPart1.getXCG01119());
		vrTechnicalSpec_XCGPart1Impl.setXCG01120(vrTechnicalSpec_XCGPart1.getXCG01120());
		vrTechnicalSpec_XCGPart1Impl.setXCG01121(vrTechnicalSpec_XCGPart1.getXCG01121());
		vrTechnicalSpec_XCGPart1Impl.setXCG01122(vrTechnicalSpec_XCGPart1.getXCG01122());
		vrTechnicalSpec_XCGPart1Impl.setXCG01123(vrTechnicalSpec_XCGPart1.getXCG01123());
		vrTechnicalSpec_XCGPart1Impl.setXCG01124(vrTechnicalSpec_XCGPart1.getXCG01124());
		vrTechnicalSpec_XCGPart1Impl.setXCG01125(vrTechnicalSpec_XCGPart1.getXCG01125());
		vrTechnicalSpec_XCGPart1Impl.setXCG01126(vrTechnicalSpec_XCGPart1.getXCG01126());
		vrTechnicalSpec_XCGPart1Impl.setXCG01127(vrTechnicalSpec_XCGPart1.getXCG01127());
		vrTechnicalSpec_XCGPart1Impl.setXCG01128(vrTechnicalSpec_XCGPart1.getXCG01128());
		vrTechnicalSpec_XCGPart1Impl.setXCG01129(vrTechnicalSpec_XCGPart1.getXCG01129());
		vrTechnicalSpec_XCGPart1Impl.setXCG01130(vrTechnicalSpec_XCGPart1.getXCG01130());
		vrTechnicalSpec_XCGPart1Impl.setXCG01131(vrTechnicalSpec_XCGPart1.getXCG01131());
		vrTechnicalSpec_XCGPart1Impl.setXCG01132(vrTechnicalSpec_XCGPart1.getXCG01132());
		vrTechnicalSpec_XCGPart1Impl.setXCG01133(vrTechnicalSpec_XCGPart1.getXCG01133());
		vrTechnicalSpec_XCGPart1Impl.setXCG01134(vrTechnicalSpec_XCGPart1.getXCG01134());
		vrTechnicalSpec_XCGPart1Impl.setXCG01135(vrTechnicalSpec_XCGPart1.getXCG01135());
		vrTechnicalSpec_XCGPart1Impl.setXCG01136(vrTechnicalSpec_XCGPart1.getXCG01136());
		vrTechnicalSpec_XCGPart1Impl.setXCG01137(vrTechnicalSpec_XCGPart1.getXCG01137());
		vrTechnicalSpec_XCGPart1Impl.setXCG01138(vrTechnicalSpec_XCGPart1.getXCG01138());
		vrTechnicalSpec_XCGPart1Impl.setXCG01139(vrTechnicalSpec_XCGPart1.getXCG01139());
		vrTechnicalSpec_XCGPart1Impl.setXCG01140(vrTechnicalSpec_XCGPart1.getXCG01140());
		vrTechnicalSpec_XCGPart1Impl.setXCG01141(vrTechnicalSpec_XCGPart1.getXCG01141());
		vrTechnicalSpec_XCGPart1Impl.setXCG01142(vrTechnicalSpec_XCGPart1.getXCG01142());
		vrTechnicalSpec_XCGPart1Impl.setXCG01143(vrTechnicalSpec_XCGPart1.getXCG01143());
		vrTechnicalSpec_XCGPart1Impl.setXCG01144(vrTechnicalSpec_XCGPart1.getXCG01144());
		vrTechnicalSpec_XCGPart1Impl.setXCG01145(vrTechnicalSpec_XCGPart1.getXCG01145());
		vrTechnicalSpec_XCGPart1Impl.setXCG01146(vrTechnicalSpec_XCGPart1.getXCG01146());
		vrTechnicalSpec_XCGPart1Impl.setXCG01147(vrTechnicalSpec_XCGPart1.getXCG01147());
		vrTechnicalSpec_XCGPart1Impl.setXCG01148(vrTechnicalSpec_XCGPart1.getXCG01148());
		vrTechnicalSpec_XCGPart1Impl.setXCG01149(vrTechnicalSpec_XCGPart1.getXCG01149());
		vrTechnicalSpec_XCGPart1Impl.setXCG01150(vrTechnicalSpec_XCGPart1.getXCG01150());
		vrTechnicalSpec_XCGPart1Impl.setXCG01151(vrTechnicalSpec_XCGPart1.getXCG01151());
		vrTechnicalSpec_XCGPart1Impl.setXCG01152(vrTechnicalSpec_XCGPart1.getXCG01152());
		vrTechnicalSpec_XCGPart1Impl.setXCG01153(vrTechnicalSpec_XCGPart1.getXCG01153());
		vrTechnicalSpec_XCGPart1Impl.setXCG01154(vrTechnicalSpec_XCGPart1.getXCG01154());
		vrTechnicalSpec_XCGPart1Impl.setXCG01155(vrTechnicalSpec_XCGPart1.getXCG01155());
		vrTechnicalSpec_XCGPart1Impl.setXCG01156(vrTechnicalSpec_XCGPart1.getXCG01156());
		vrTechnicalSpec_XCGPart1Impl.setXCG01157(vrTechnicalSpec_XCGPart1.getXCG01157());
		vrTechnicalSpec_XCGPart1Impl.setXCG01158(vrTechnicalSpec_XCGPart1.getXCG01158());
		vrTechnicalSpec_XCGPart1Impl.setXCG01159(vrTechnicalSpec_XCGPart1.getXCG01159());
		vrTechnicalSpec_XCGPart1Impl.setXCG01160(vrTechnicalSpec_XCGPart1.getXCG01160());
		vrTechnicalSpec_XCGPart1Impl.setXCG01161(vrTechnicalSpec_XCGPart1.getXCG01161());
		vrTechnicalSpec_XCGPart1Impl.setXCG01162(vrTechnicalSpec_XCGPart1.getXCG01162());
		vrTechnicalSpec_XCGPart1Impl.setModifyDate(vrTechnicalSpec_XCGPart1.getModifyDate());
		vrTechnicalSpec_XCGPart1Impl.setSyncDate(vrTechnicalSpec_XCGPart1.getSyncDate());

		return vrTechnicalSpec_XCGPart1Impl;
	}

	/**
	 * Returns the vr technical spec_xcg part1 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCGPart1 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCGPart1Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCGPart1;
	}

	/**
	 * Returns the vr technical spec_xcg part1 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGPart1Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1
	 * @throws NoSuchVRTechnicalSpec_XCGPart1Exception if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGPart1Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcg part1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1, or <code>null</code> if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart1Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = (VRTechnicalSpec_XCGPart1)serializable;

		if (vrTechnicalSpec_XCGPart1 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCGPart1 = (VRTechnicalSpec_XCGPart1)session.get(VRTechnicalSpec_XCGPart1Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCGPart1 != null) {
					cacheResult(vrTechnicalSpec_XCGPart1);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart1Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart1Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCGPart1;
	}

	/**
	 * Returns the vr technical spec_xcg part1 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part1
	 * @return the vr technical spec_xcg part1, or <code>null</code> if a vr technical spec_xcg part1 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart1 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCGPart1> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCGPart1> map = new HashMap<Serializable, VRTechnicalSpec_XCGPart1>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCGPart1 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCGPart1);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart1Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCGPart1)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : (List<VRTechnicalSpec_XCGPart1>)q.list()) {
				map.put(vrTechnicalSpec_XCGPart1.getPrimaryKeyObj(),
					vrTechnicalSpec_XCGPart1);

				cacheResult(vrTechnicalSpec_XCGPart1);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCGPart1.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCGPart1ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart1Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcg part1s.
	 *
	 * @return the vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @return the range of vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part1s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart1ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part1s
	 * @param end the upper bound of the range of vr technical spec_xcg part1s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcg part1s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart1> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart1> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart1> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart1>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART1);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCGPART1;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCGPart1ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart1>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcg part1s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 : findAll()) {
			remove(vrTechnicalSpec_XCGPart1);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part1s.
	 *
	 * @return the number of vr technical spec_xcg part1s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCGPART1);

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
		return VRTechnicalSpec_XCGPart1ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcg part1 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCGPart1Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART1 = "SELECT vrTechnicalSpec_XCGPart1 FROM VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCGPart1 FROM VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART1_WHERE = "SELECT vrTechnicalSpec_XCGPart1 FROM VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART1 = "SELECT COUNT(vrTechnicalSpec_XCGPart1) FROM VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART1_WHERE = "SELECT COUNT(vrTechnicalSpec_XCGPart1) FROM VRTechnicalSpec_XCGPart1 vrTechnicalSpec_XCGPart1 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCGPart1.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCGPart1 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCGPart1 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGPart1PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}