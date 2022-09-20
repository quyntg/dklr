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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGPart2Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart2;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart2ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart2Persistence;

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
 * The persistence implementation for the vr technical spec_xcg part2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart2Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart2Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart2PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCGPart2>
	implements VRTechnicalSpec_XCGPart2Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCGPart2Util} to access the vr technical spec_xcg part2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCGPart2Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCGPart2.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCGPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCGPart2 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCGPart2.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCGPart2.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCGPart2.dossierNo IS NULL OR vrTechnicalSpec_XCGPart2.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCGPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCGPart2.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart2 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCGPart2.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCGPart2.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCGPart2.dossierIdCTN IS NULL OR vrTechnicalSpec_XCGPart2.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCGPart2.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, deliverableCode,
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

	protected VRTechnicalSpec_XCGPart2 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
		"vrTechnicalSpec_XCGPart2.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCGPart2.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCGPart2.deliverableCode IS NULL OR vrTechnicalSpec_XCGPart2.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart2.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCGPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCGPart2 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart2.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCGPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart2.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart2 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart2.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCGPart2.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, convertAssembleId,
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

	protected VRTechnicalSpec_XCGPart2 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
		"vrTechnicalSpec_XCGPart2.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCGPart2.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart2 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCGPart2.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCGPart2.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCGPart2.referenceUid IS NULL OR vrTechnicalSpec_XCGPart2.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart2ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCGPart2.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		List<VRTechnicalSpec_XCGPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart2 != null) {
			return vrTechnicalSpec_XCGPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part2, or <code>null</code> if a matching vr technical spec_xcg part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part2s before and after the current vr technical spec_xcg part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part2
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2[] array = new VRTechnicalSpec_XCGPart2Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart2;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart2, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCGPart2 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xcg part2s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE);

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
		"vrTechnicalSpec_XCGPart2.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCGPart2PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCGPart2.class);
	}

	/**
	 * Caches the vr technical spec_xcg part2 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart2 the vr technical spec_xcg part2
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		entityCache.putResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			vrTechnicalSpec_XCGPart2.getPrimaryKey(), vrTechnicalSpec_XCGPart2);

		vrTechnicalSpec_XCGPart2.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcg part2s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart2s the vr technical spec_xcg part2s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCGPart2> vrTechnicalSpec_XCGPart2s) {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : vrTechnicalSpec_XCGPart2s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart2Impl.class,
						vrTechnicalSpec_XCGPart2.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCGPart2);
			}
			else {
				vrTechnicalSpec_XCGPart2.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcg part2s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCGPart2Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcg part2.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		entityCache.removeResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			vrTechnicalSpec_XCGPart2.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCGPart2> vrTechnicalSpec_XCGPart2s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : vrTechnicalSpec_XCGPart2s) {
			entityCache.removeResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart2Impl.class,
				vrTechnicalSpec_XCGPart2.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcg part2 with the primary key. Does not add the vr technical spec_xcg part2 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcg part2
	 * @return the new vr technical spec_xcg part2
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 create(long id) {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = new VRTechnicalSpec_XCGPart2Impl();

		vrTechnicalSpec_XCGPart2.setNew(true);
		vrTechnicalSpec_XCGPart2.setPrimaryKey(id);

		return vrTechnicalSpec_XCGPart2;
	}

	/**
	 * Removes the vr technical spec_xcg part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 remove(long id)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcg part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = (VRTechnicalSpec_XCGPart2)session.get(VRTechnicalSpec_XCGPart2Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCGPart2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCGPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCGPart2);
		}
		catch (NoSuchVRTechnicalSpec_XCGPart2Exception nsee) {
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
	protected VRTechnicalSpec_XCGPart2 removeImpl(
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		vrTechnicalSpec_XCGPart2 = toUnwrappedModel(vrTechnicalSpec_XCGPart2);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCGPart2)) {
				vrTechnicalSpec_XCGPart2 = (VRTechnicalSpec_XCGPart2)session.get(VRTechnicalSpec_XCGPart2Impl.class,
						vrTechnicalSpec_XCGPart2.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCGPart2 != null) {
				session.delete(vrTechnicalSpec_XCGPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCGPart2 != null) {
			clearCache(vrTechnicalSpec_XCGPart2);
		}

		return vrTechnicalSpec_XCGPart2;
	}

	@Override
	public VRTechnicalSpec_XCGPart2 updateImpl(
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		vrTechnicalSpec_XCGPart2 = toUnwrappedModel(vrTechnicalSpec_XCGPart2);

		boolean isNew = vrTechnicalSpec_XCGPart2.isNew();

		VRTechnicalSpec_XCGPart2ModelImpl vrTechnicalSpec_XCGPart2ModelImpl = (VRTechnicalSpec_XCGPart2ModelImpl)vrTechnicalSpec_XCGPart2;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCGPart2.isNew()) {
				session.save(vrTechnicalSpec_XCGPart2);

				vrTechnicalSpec_XCGPart2.setNew(false);
			}
			else {
				vrTechnicalSpec_XCGPart2 = (VRTechnicalSpec_XCGPart2)session.merge(vrTechnicalSpec_XCGPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCGPart2ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCGPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getDossierId(),
						vrTechnicalSpec_XCGPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart2ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart2Impl.class,
			vrTechnicalSpec_XCGPart2.getPrimaryKey(), vrTechnicalSpec_XCGPart2,
			false);

		vrTechnicalSpec_XCGPart2.resetOriginalValues();

		return vrTechnicalSpec_XCGPart2;
	}

	protected VRTechnicalSpec_XCGPart2 toUnwrappedModel(
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2) {
		if (vrTechnicalSpec_XCGPart2 instanceof VRTechnicalSpec_XCGPart2Impl) {
			return vrTechnicalSpec_XCGPart2;
		}

		VRTechnicalSpec_XCGPart2Impl vrTechnicalSpec_XCGPart2Impl = new VRTechnicalSpec_XCGPart2Impl();

		vrTechnicalSpec_XCGPart2Impl.setNew(vrTechnicalSpec_XCGPart2.isNew());
		vrTechnicalSpec_XCGPart2Impl.setPrimaryKey(vrTechnicalSpec_XCGPart2.getPrimaryKey());

		vrTechnicalSpec_XCGPart2Impl.setId(vrTechnicalSpec_XCGPart2.getId());
		vrTechnicalSpec_XCGPart2Impl.setMtCore(vrTechnicalSpec_XCGPart2.getMtCore());
		vrTechnicalSpec_XCGPart2Impl.setConvertAssembleId(vrTechnicalSpec_XCGPart2.getConvertAssembleId());
		vrTechnicalSpec_XCGPart2Impl.setDossierId(vrTechnicalSpec_XCGPart2.getDossierId());
		vrTechnicalSpec_XCGPart2Impl.setDossierNo(vrTechnicalSpec_XCGPart2.getDossierNo());
		vrTechnicalSpec_XCGPart2Impl.setReferenceUid(vrTechnicalSpec_XCGPart2.getReferenceUid());
		vrTechnicalSpec_XCGPart2Impl.setDossierIdCTN(vrTechnicalSpec_XCGPart2.getDossierIdCTN());
		vrTechnicalSpec_XCGPart2Impl.setDeliverableCode(vrTechnicalSpec_XCGPart2.getDeliverableCode());
		vrTechnicalSpec_XCGPart2Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCGPart2.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCGPart2Impl.setXCG01163(vrTechnicalSpec_XCGPart2.getXCG01163());
		vrTechnicalSpec_XCGPart2Impl.setXCG01164(vrTechnicalSpec_XCGPart2.getXCG01164());
		vrTechnicalSpec_XCGPart2Impl.setXCG01165(vrTechnicalSpec_XCGPart2.getXCG01165());
		vrTechnicalSpec_XCGPart2Impl.setXCG01166(vrTechnicalSpec_XCGPart2.getXCG01166());
		vrTechnicalSpec_XCGPart2Impl.setXCG01167(vrTechnicalSpec_XCGPart2.getXCG01167());
		vrTechnicalSpec_XCGPart2Impl.setXCG01169(vrTechnicalSpec_XCGPart2.getXCG01169());
		vrTechnicalSpec_XCGPart2Impl.setXCG01170(vrTechnicalSpec_XCGPart2.getXCG01170());
		vrTechnicalSpec_XCGPart2Impl.setXCG01171(vrTechnicalSpec_XCGPart2.getXCG01171());
		vrTechnicalSpec_XCGPart2Impl.setXCG01172(vrTechnicalSpec_XCGPart2.getXCG01172());
		vrTechnicalSpec_XCGPart2Impl.setXCG01173(vrTechnicalSpec_XCGPart2.getXCG01173());
		vrTechnicalSpec_XCGPart2Impl.setXCG01174(vrTechnicalSpec_XCGPart2.getXCG01174());
		vrTechnicalSpec_XCGPart2Impl.setXCG01175(vrTechnicalSpec_XCGPart2.getXCG01175());
		vrTechnicalSpec_XCGPart2Impl.setXCG01176(vrTechnicalSpec_XCGPart2.getXCG01176());
		vrTechnicalSpec_XCGPart2Impl.setXCG01177(vrTechnicalSpec_XCGPart2.getXCG01177());
		vrTechnicalSpec_XCGPart2Impl.setXCG01178(vrTechnicalSpec_XCGPart2.getXCG01178());
		vrTechnicalSpec_XCGPart2Impl.setXCG01179(vrTechnicalSpec_XCGPart2.getXCG01179());
		vrTechnicalSpec_XCGPart2Impl.setXCG01180(vrTechnicalSpec_XCGPart2.getXCG01180());
		vrTechnicalSpec_XCGPart2Impl.setXCG01181(vrTechnicalSpec_XCGPart2.getXCG01181());
		vrTechnicalSpec_XCGPart2Impl.setXCG01182(vrTechnicalSpec_XCGPart2.getXCG01182());
		vrTechnicalSpec_XCGPart2Impl.setXCG01183(vrTechnicalSpec_XCGPart2.getXCG01183());
		vrTechnicalSpec_XCGPart2Impl.setXCG01184(vrTechnicalSpec_XCGPart2.getXCG01184());
		vrTechnicalSpec_XCGPart2Impl.setXCG01185(vrTechnicalSpec_XCGPart2.getXCG01185());
		vrTechnicalSpec_XCGPart2Impl.setXCG01186(vrTechnicalSpec_XCGPart2.getXCG01186());
		vrTechnicalSpec_XCGPart2Impl.setXCG01187(vrTechnicalSpec_XCGPart2.getXCG01187());
		vrTechnicalSpec_XCGPart2Impl.setXCG01188(vrTechnicalSpec_XCGPart2.getXCG01188());
		vrTechnicalSpec_XCGPart2Impl.setXCG01189(vrTechnicalSpec_XCGPart2.getXCG01189());
		vrTechnicalSpec_XCGPart2Impl.setXCG01190(vrTechnicalSpec_XCGPart2.getXCG01190());
		vrTechnicalSpec_XCGPart2Impl.setXCG01191(vrTechnicalSpec_XCGPart2.getXCG01191());
		vrTechnicalSpec_XCGPart2Impl.setXCG01192(vrTechnicalSpec_XCGPart2.getXCG01192());
		vrTechnicalSpec_XCGPart2Impl.setXCG01193(vrTechnicalSpec_XCGPart2.getXCG01193());
		vrTechnicalSpec_XCGPart2Impl.setXCG01194(vrTechnicalSpec_XCGPart2.getXCG01194());
		vrTechnicalSpec_XCGPart2Impl.setXCG01195(vrTechnicalSpec_XCGPart2.getXCG01195());
		vrTechnicalSpec_XCGPart2Impl.setXCG01196(vrTechnicalSpec_XCGPart2.getXCG01196());
		vrTechnicalSpec_XCGPart2Impl.setXCG01197(vrTechnicalSpec_XCGPart2.getXCG01197());
		vrTechnicalSpec_XCGPart2Impl.setXCG01198(vrTechnicalSpec_XCGPart2.getXCG01198());
		vrTechnicalSpec_XCGPart2Impl.setXCG01199(vrTechnicalSpec_XCGPart2.getXCG01199());
		vrTechnicalSpec_XCGPart2Impl.setXCG01200(vrTechnicalSpec_XCGPart2.getXCG01200());
		vrTechnicalSpec_XCGPart2Impl.setXCG01202(vrTechnicalSpec_XCGPart2.getXCG01202());
		vrTechnicalSpec_XCGPart2Impl.setXCG01203(vrTechnicalSpec_XCGPart2.getXCG01203());
		vrTechnicalSpec_XCGPart2Impl.setXCG01204(vrTechnicalSpec_XCGPart2.getXCG01204());
		vrTechnicalSpec_XCGPart2Impl.setXCG01205(vrTechnicalSpec_XCGPart2.getXCG01205());
		vrTechnicalSpec_XCGPart2Impl.setXCG01206(vrTechnicalSpec_XCGPart2.getXCG01206());
		vrTechnicalSpec_XCGPart2Impl.setXCG01207(vrTechnicalSpec_XCGPart2.getXCG01207());
		vrTechnicalSpec_XCGPart2Impl.setXCG01208(vrTechnicalSpec_XCGPart2.getXCG01208());
		vrTechnicalSpec_XCGPart2Impl.setXCG01209(vrTechnicalSpec_XCGPart2.getXCG01209());
		vrTechnicalSpec_XCGPart2Impl.setXCG01210(vrTechnicalSpec_XCGPart2.getXCG01210());
		vrTechnicalSpec_XCGPart2Impl.setXCG01212(vrTechnicalSpec_XCGPart2.getXCG01212());
		vrTechnicalSpec_XCGPart2Impl.setXCG01213(vrTechnicalSpec_XCGPart2.getXCG01213());
		vrTechnicalSpec_XCGPart2Impl.setXCG01214(vrTechnicalSpec_XCGPart2.getXCG01214());
		vrTechnicalSpec_XCGPart2Impl.setXCG01215(vrTechnicalSpec_XCGPart2.getXCG01215());
		vrTechnicalSpec_XCGPart2Impl.setXCG01216(vrTechnicalSpec_XCGPart2.getXCG01216());
		vrTechnicalSpec_XCGPart2Impl.setXCG01217(vrTechnicalSpec_XCGPart2.getXCG01217());
		vrTechnicalSpec_XCGPart2Impl.setXCG01218(vrTechnicalSpec_XCGPart2.getXCG01218());
		vrTechnicalSpec_XCGPart2Impl.setXCG01219(vrTechnicalSpec_XCGPart2.getXCG01219());
		vrTechnicalSpec_XCGPart2Impl.setXCG01220(vrTechnicalSpec_XCGPart2.getXCG01220());
		vrTechnicalSpec_XCGPart2Impl.setXCG01221(vrTechnicalSpec_XCGPart2.getXCG01221());
		vrTechnicalSpec_XCGPart2Impl.setXCG01222(vrTechnicalSpec_XCGPart2.getXCG01222());
		vrTechnicalSpec_XCGPart2Impl.setXCG01223(vrTechnicalSpec_XCGPart2.getXCG01223());
		vrTechnicalSpec_XCGPart2Impl.setXCG01224(vrTechnicalSpec_XCGPart2.getXCG01224());
		vrTechnicalSpec_XCGPart2Impl.setXCG01225(vrTechnicalSpec_XCGPart2.getXCG01225());
		vrTechnicalSpec_XCGPart2Impl.setXCG01226(vrTechnicalSpec_XCGPart2.getXCG01226());
		vrTechnicalSpec_XCGPart2Impl.setXCG01228(vrTechnicalSpec_XCGPart2.getXCG01228());
		vrTechnicalSpec_XCGPart2Impl.setXCG01230(vrTechnicalSpec_XCGPart2.getXCG01230());
		vrTechnicalSpec_XCGPart2Impl.setXCG01231(vrTechnicalSpec_XCGPart2.getXCG01231());
		vrTechnicalSpec_XCGPart2Impl.setXCG01232(vrTechnicalSpec_XCGPart2.getXCG01232());
		vrTechnicalSpec_XCGPart2Impl.setXCG01234(vrTechnicalSpec_XCGPart2.getXCG01234());
		vrTechnicalSpec_XCGPart2Impl.setXCG01236(vrTechnicalSpec_XCGPart2.getXCG01236());
		vrTechnicalSpec_XCGPart2Impl.setXCG01237(vrTechnicalSpec_XCGPart2.getXCG01237());
		vrTechnicalSpec_XCGPart2Impl.setXCG01229(vrTechnicalSpec_XCGPart2.getXCG01229());
		vrTechnicalSpec_XCGPart2Impl.setXCG01238(vrTechnicalSpec_XCGPart2.getXCG01238());
		vrTechnicalSpec_XCGPart2Impl.setXCG01239(vrTechnicalSpec_XCGPart2.getXCG01239());
		vrTechnicalSpec_XCGPart2Impl.setXCG01240(vrTechnicalSpec_XCGPart2.getXCG01240());
		vrTechnicalSpec_XCGPart2Impl.setXCG01241(vrTechnicalSpec_XCGPart2.getXCG01241());
		vrTechnicalSpec_XCGPart2Impl.setXCG01242(vrTechnicalSpec_XCGPart2.getXCG01242());
		vrTechnicalSpec_XCGPart2Impl.setXCG01243(vrTechnicalSpec_XCGPart2.getXCG01243());
		vrTechnicalSpec_XCGPart2Impl.setXCG01235(vrTechnicalSpec_XCGPart2.getXCG01235());
		vrTechnicalSpec_XCGPart2Impl.setXCG01244(vrTechnicalSpec_XCGPart2.getXCG01244());
		vrTechnicalSpec_XCGPart2Impl.setXCG01245(vrTechnicalSpec_XCGPart2.getXCG01245());
		vrTechnicalSpec_XCGPart2Impl.setXCG01246(vrTechnicalSpec_XCGPart2.getXCG01246());
		vrTechnicalSpec_XCGPart2Impl.setXCG01247(vrTechnicalSpec_XCGPart2.getXCG01247());
		vrTechnicalSpec_XCGPart2Impl.setXCG01248(vrTechnicalSpec_XCGPart2.getXCG01248());
		vrTechnicalSpec_XCGPart2Impl.setXCG01249(vrTechnicalSpec_XCGPart2.getXCG01249());
		vrTechnicalSpec_XCGPart2Impl.setXCG11248(vrTechnicalSpec_XCGPart2.getXCG11248());
		vrTechnicalSpec_XCGPart2Impl.setXCG11249(vrTechnicalSpec_XCGPart2.getXCG11249());
		vrTechnicalSpec_XCGPart2Impl.setXCG01250(vrTechnicalSpec_XCGPart2.getXCG01250());
		vrTechnicalSpec_XCGPart2Impl.setXCG01251(vrTechnicalSpec_XCGPart2.getXCG01251());
		vrTechnicalSpec_XCGPart2Impl.setXCG01252(vrTechnicalSpec_XCGPart2.getXCG01252());
		vrTechnicalSpec_XCGPart2Impl.setXCG01253(vrTechnicalSpec_XCGPart2.getXCG01253());
		vrTechnicalSpec_XCGPart2Impl.setXCG01255(vrTechnicalSpec_XCGPart2.getXCG01255());
		vrTechnicalSpec_XCGPart2Impl.setXCG01256(vrTechnicalSpec_XCGPart2.getXCG01256());
		vrTechnicalSpec_XCGPart2Impl.setXCG01257(vrTechnicalSpec_XCGPart2.getXCG01257());
		vrTechnicalSpec_XCGPart2Impl.setXCG01258(vrTechnicalSpec_XCGPart2.getXCG01258());
		vrTechnicalSpec_XCGPart2Impl.setXCG01259(vrTechnicalSpec_XCGPart2.getXCG01259());
		vrTechnicalSpec_XCGPart2Impl.setXCG01260(vrTechnicalSpec_XCGPart2.getXCG01260());
		vrTechnicalSpec_XCGPart2Impl.setXCG01261(vrTechnicalSpec_XCGPart2.getXCG01261());
		vrTechnicalSpec_XCGPart2Impl.setXCG01262(vrTechnicalSpec_XCGPart2.getXCG01262());
		vrTechnicalSpec_XCGPart2Impl.setXCG11253(vrTechnicalSpec_XCGPart2.getXCG11253());
		vrTechnicalSpec_XCGPart2Impl.setXCG01263(vrTechnicalSpec_XCGPart2.getXCG01263());
		vrTechnicalSpec_XCGPart2Impl.setXCG01264(vrTechnicalSpec_XCGPart2.getXCG01264());
		vrTechnicalSpec_XCGPart2Impl.setXCG01265(vrTechnicalSpec_XCGPart2.getXCG01265());
		vrTechnicalSpec_XCGPart2Impl.setXCG01266(vrTechnicalSpec_XCGPart2.getXCG01266());
		vrTechnicalSpec_XCGPart2Impl.setXCG01901(vrTechnicalSpec_XCGPart2.getXCG01901());
		vrTechnicalSpec_XCGPart2Impl.setXCG01267(vrTechnicalSpec_XCGPart2.getXCG01267());
		vrTechnicalSpec_XCGPart2Impl.setXCG01902(vrTechnicalSpec_XCGPart2.getXCG01902());
		vrTechnicalSpec_XCGPart2Impl.setXCG01268(vrTechnicalSpec_XCGPart2.getXCG01268());
		vrTechnicalSpec_XCGPart2Impl.setXCG01269(vrTechnicalSpec_XCGPart2.getXCG01269());
		vrTechnicalSpec_XCGPart2Impl.setXCG01903(vrTechnicalSpec_XCGPart2.getXCG01903());
		vrTechnicalSpec_XCGPart2Impl.setXCG01270(vrTechnicalSpec_XCGPart2.getXCG01270());
		vrTechnicalSpec_XCGPart2Impl.setXCG01271(vrTechnicalSpec_XCGPart2.getXCG01271());
		vrTechnicalSpec_XCGPart2Impl.setXCG01273(vrTechnicalSpec_XCGPart2.getXCG01273());
		vrTechnicalSpec_XCGPart2Impl.setXCG01274(vrTechnicalSpec_XCGPart2.getXCG01274());
		vrTechnicalSpec_XCGPart2Impl.setXCG01275(vrTechnicalSpec_XCGPart2.getXCG01275());
		vrTechnicalSpec_XCGPart2Impl.setXCG01276(vrTechnicalSpec_XCGPart2.getXCG01276());
		vrTechnicalSpec_XCGPart2Impl.setXCG01277(vrTechnicalSpec_XCGPart2.getXCG01277());
		vrTechnicalSpec_XCGPart2Impl.setXCG01278(vrTechnicalSpec_XCGPart2.getXCG01278());
		vrTechnicalSpec_XCGPart2Impl.setXCG01279(vrTechnicalSpec_XCGPart2.getXCG01279());
		vrTechnicalSpec_XCGPart2Impl.setXCG01280(vrTechnicalSpec_XCGPart2.getXCG01280());
		vrTechnicalSpec_XCGPart2Impl.setXCG01281(vrTechnicalSpec_XCGPart2.getXCG01281());
		vrTechnicalSpec_XCGPart2Impl.setXCG01282(vrTechnicalSpec_XCGPart2.getXCG01282());
		vrTechnicalSpec_XCGPart2Impl.setXCG01283(vrTechnicalSpec_XCGPart2.getXCG01283());
		vrTechnicalSpec_XCGPart2Impl.setXCG01284(vrTechnicalSpec_XCGPart2.getXCG01284());
		vrTechnicalSpec_XCGPart2Impl.setXCG01285(vrTechnicalSpec_XCGPart2.getXCG01285());
		vrTechnicalSpec_XCGPart2Impl.setXCG01286(vrTechnicalSpec_XCGPart2.getXCG01286());
		vrTechnicalSpec_XCGPart2Impl.setXCG01287(vrTechnicalSpec_XCGPart2.getXCG01287());
		vrTechnicalSpec_XCGPart2Impl.setXCG01288(vrTechnicalSpec_XCGPart2.getXCG01288());
		vrTechnicalSpec_XCGPart2Impl.setXCG01289(vrTechnicalSpec_XCGPart2.getXCG01289());
		vrTechnicalSpec_XCGPart2Impl.setXCG01290(vrTechnicalSpec_XCGPart2.getXCG01290());
		vrTechnicalSpec_XCGPart2Impl.setXCG01291(vrTechnicalSpec_XCGPart2.getXCG01291());
		vrTechnicalSpec_XCGPart2Impl.setXCG01292(vrTechnicalSpec_XCGPart2.getXCG01292());
		vrTechnicalSpec_XCGPart2Impl.setXCG01293(vrTechnicalSpec_XCGPart2.getXCG01293());
		vrTechnicalSpec_XCGPart2Impl.setXCG01294(vrTechnicalSpec_XCGPart2.getXCG01294());
		vrTechnicalSpec_XCGPart2Impl.setXCG01295(vrTechnicalSpec_XCGPart2.getXCG01295());
		vrTechnicalSpec_XCGPart2Impl.setXCG01296(vrTechnicalSpec_XCGPart2.getXCG01296());
		vrTechnicalSpec_XCGPart2Impl.setXCG01297(vrTechnicalSpec_XCGPart2.getXCG01297());
		vrTechnicalSpec_XCGPart2Impl.setXCG01298(vrTechnicalSpec_XCGPart2.getXCG01298());
		vrTechnicalSpec_XCGPart2Impl.setXCG01300(vrTechnicalSpec_XCGPart2.getXCG01300());
		vrTechnicalSpec_XCGPart2Impl.setXCG01301(vrTechnicalSpec_XCGPart2.getXCG01301());
		vrTechnicalSpec_XCGPart2Impl.setXCG01302(vrTechnicalSpec_XCGPart2.getXCG01302());
		vrTechnicalSpec_XCGPart2Impl.setXCG01303(vrTechnicalSpec_XCGPart2.getXCG01303());
		vrTechnicalSpec_XCGPart2Impl.setXCG01304(vrTechnicalSpec_XCGPart2.getXCG01304());
		vrTechnicalSpec_XCGPart2Impl.setXCG01305(vrTechnicalSpec_XCGPart2.getXCG01305());
		vrTechnicalSpec_XCGPart2Impl.setXCG01306(vrTechnicalSpec_XCGPart2.getXCG01306());
		vrTechnicalSpec_XCGPart2Impl.setXCG01307(vrTechnicalSpec_XCGPart2.getXCG01307());
		vrTechnicalSpec_XCGPart2Impl.setXCG01308(vrTechnicalSpec_XCGPart2.getXCG01308());
		vrTechnicalSpec_XCGPart2Impl.setModifyDate(vrTechnicalSpec_XCGPart2.getModifyDate());
		vrTechnicalSpec_XCGPart2Impl.setSyncDate(vrTechnicalSpec_XCGPart2.getSyncDate());

		return vrTechnicalSpec_XCGPart2Impl;
	}

	/**
	 * Returns the vr technical spec_xcg part2 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCGPart2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCGPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCGPart2;
	}

	/**
	 * Returns the vr technical spec_xcg part2 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGPart2Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2
	 * @throws NoSuchVRTechnicalSpec_XCGPart2Exception if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGPart2Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcg part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2, or <code>null</code> if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart2Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = (VRTechnicalSpec_XCGPart2)serializable;

		if (vrTechnicalSpec_XCGPart2 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCGPart2 = (VRTechnicalSpec_XCGPart2)session.get(VRTechnicalSpec_XCGPart2Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCGPart2 != null) {
					cacheResult(vrTechnicalSpec_XCGPart2);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart2Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart2Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCGPart2;
	}

	/**
	 * Returns the vr technical spec_xcg part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part2
	 * @return the vr technical spec_xcg part2, or <code>null</code> if a vr technical spec_xcg part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart2 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCGPart2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCGPart2> map = new HashMap<Serializable, VRTechnicalSpec_XCGPart2>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCGPart2 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCGPart2);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart2Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCGPart2)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : (List<VRTechnicalSpec_XCGPart2>)q.list()) {
				map.put(vrTechnicalSpec_XCGPart2.getPrimaryKeyObj(),
					vrTechnicalSpec_XCGPart2);

				cacheResult(vrTechnicalSpec_XCGPart2);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCGPart2.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCGPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart2Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcg part2s.
	 *
	 * @return the vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @return the range of vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part2s
	 * @param end the upper bound of the range of vr technical spec_xcg part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcg part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart2>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART2);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCGPART2;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCGPart2ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart2>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcg part2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 : findAll()) {
			remove(vrTechnicalSpec_XCGPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part2s.
	 *
	 * @return the number of vr technical spec_xcg part2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCGPART2);

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
		return VRTechnicalSpec_XCGPart2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcg part2 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCGPart2Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART2 = "SELECT vrTechnicalSpec_XCGPart2 FROM VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCGPart2 FROM VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART2_WHERE = "SELECT vrTechnicalSpec_XCGPart2 FROM VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART2 = "SELECT COUNT(vrTechnicalSpec_XCGPart2) FROM VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART2_WHERE = "SELECT COUNT(vrTechnicalSpec_XCGPart2) FROM VRTechnicalSpec_XCGPart2 vrTechnicalSpec_XCGPart2 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCGPart2.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCGPart2 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCGPart2 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGPart2PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}