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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCHPart2Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCHPart2;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCHPart2ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCHPart2Persistence;

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
 * The persistence implementation for the vr technical spec_xch part2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCHPart2Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCHPart2Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCHPart2PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCHPart2>
	implements VRTechnicalSpec_XCHPart2Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCHPart2Util} to access the vr technical spec_xch part2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCHPart2Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCHPart2.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCHPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCHPart2 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCHPart2.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCHPart2.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCHPart2.dossierNo IS NULL OR vrTechnicalSpec_XCHPart2.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCHPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCHPart2.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCHPart2 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCHPart2.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCHPart2.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCHPart2.dossierIdCTN IS NULL OR vrTechnicalSpec_XCHPart2.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCHPart2.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, deliverableCode,
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

	protected VRTechnicalSpec_XCHPart2 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
		"vrTechnicalSpec_XCHPart2.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCHPart2.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCHPart2.deliverableCode IS NULL OR vrTechnicalSpec_XCHPart2.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if ((dossierId != vrTechnicalSpec_XCHPart2.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCHPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCHPart2 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCHPart2.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCHPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCHPart2.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, convertAssembleId,
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

	protected VRTechnicalSpec_XCHPart2 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
		"vrTechnicalSpec_XCHPart2.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCHPart2.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCHPart2 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCHPart2.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCHPart2.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCHPart2.referenceUid IS NULL OR vrTechnicalSpec_XCHPart2.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCHPart2ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCHPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xch part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCHPart2.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xch part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xch part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		List<VRTechnicalSpec_XCHPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCHPart2 != null) {
			return vrTechnicalSpec_XCHPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCHPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xch part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xch part2, or <code>null</code> if a matching vr technical spec_xch part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCHPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xch part2s before and after the current vr technical spec_xch part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xch part2
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2[] array = new VRTechnicalSpec_XCHPart2Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCHPart2;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCHPart2, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCHPart2 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
			query.append(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCHPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCHPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xch part2s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xch part2s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE);

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
		"vrTechnicalSpec_XCHPart2.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCHPart2PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCHPart2.class);
	}

	/**
	 * Caches the vr technical spec_xch part2 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCHPart2 the vr technical spec_xch part2
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		entityCache.putResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			vrTechnicalSpec_XCHPart2.getPrimaryKey(), vrTechnicalSpec_XCHPart2);

		vrTechnicalSpec_XCHPart2.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xch part2s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCHPart2s the vr technical spec_xch part2s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCHPart2> vrTechnicalSpec_XCHPart2s) {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : vrTechnicalSpec_XCHPart2s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCHPart2Impl.class,
						vrTechnicalSpec_XCHPart2.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCHPart2);
			}
			else {
				vrTechnicalSpec_XCHPart2.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xch part2s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCHPart2Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xch part2.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		entityCache.removeResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			vrTechnicalSpec_XCHPart2.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCHPart2> vrTechnicalSpec_XCHPart2s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : vrTechnicalSpec_XCHPart2s) {
			entityCache.removeResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCHPart2Impl.class,
				vrTechnicalSpec_XCHPart2.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xch part2 with the primary key. Does not add the vr technical spec_xch part2 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xch part2
	 * @return the new vr technical spec_xch part2
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 create(long id) {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = new VRTechnicalSpec_XCHPart2Impl();

		vrTechnicalSpec_XCHPart2.setNew(true);
		vrTechnicalSpec_XCHPart2.setPrimaryKey(id);

		return vrTechnicalSpec_XCHPart2;
	}

	/**
	 * Removes the vr technical spec_xch part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 remove(long id)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xch part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = (VRTechnicalSpec_XCHPart2)session.get(VRTechnicalSpec_XCHPart2Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCHPart2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCHPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCHPart2);
		}
		catch (NoSuchVRTechnicalSpec_XCHPart2Exception nsee) {
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
	protected VRTechnicalSpec_XCHPart2 removeImpl(
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		vrTechnicalSpec_XCHPart2 = toUnwrappedModel(vrTechnicalSpec_XCHPart2);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCHPart2)) {
				vrTechnicalSpec_XCHPart2 = (VRTechnicalSpec_XCHPart2)session.get(VRTechnicalSpec_XCHPart2Impl.class,
						vrTechnicalSpec_XCHPart2.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCHPart2 != null) {
				session.delete(vrTechnicalSpec_XCHPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCHPart2 != null) {
			clearCache(vrTechnicalSpec_XCHPart2);
		}

		return vrTechnicalSpec_XCHPart2;
	}

	@Override
	public VRTechnicalSpec_XCHPart2 updateImpl(
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		vrTechnicalSpec_XCHPart2 = toUnwrappedModel(vrTechnicalSpec_XCHPart2);

		boolean isNew = vrTechnicalSpec_XCHPart2.isNew();

		VRTechnicalSpec_XCHPart2ModelImpl vrTechnicalSpec_XCHPart2ModelImpl = (VRTechnicalSpec_XCHPart2ModelImpl)vrTechnicalSpec_XCHPart2;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCHPart2.isNew()) {
				session.save(vrTechnicalSpec_XCHPart2);

				vrTechnicalSpec_XCHPart2.setNew(false);
			}
			else {
				vrTechnicalSpec_XCHPart2 = (VRTechnicalSpec_XCHPart2)session.merge(vrTechnicalSpec_XCHPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCHPart2ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCHPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getDossierId(),
						vrTechnicalSpec_XCHPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCHPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCHPart2ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCHPart2Impl.class,
			vrTechnicalSpec_XCHPart2.getPrimaryKey(), vrTechnicalSpec_XCHPart2,
			false);

		vrTechnicalSpec_XCHPart2.resetOriginalValues();

		return vrTechnicalSpec_XCHPart2;
	}

	protected VRTechnicalSpec_XCHPart2 toUnwrappedModel(
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2) {
		if (vrTechnicalSpec_XCHPart2 instanceof VRTechnicalSpec_XCHPart2Impl) {
			return vrTechnicalSpec_XCHPart2;
		}

		VRTechnicalSpec_XCHPart2Impl vrTechnicalSpec_XCHPart2Impl = new VRTechnicalSpec_XCHPart2Impl();

		vrTechnicalSpec_XCHPart2Impl.setNew(vrTechnicalSpec_XCHPart2.isNew());
		vrTechnicalSpec_XCHPart2Impl.setPrimaryKey(vrTechnicalSpec_XCHPart2.getPrimaryKey());

		vrTechnicalSpec_XCHPart2Impl.setId(vrTechnicalSpec_XCHPart2.getId());
		vrTechnicalSpec_XCHPart2Impl.setMtCore(vrTechnicalSpec_XCHPart2.getMtCore());
		vrTechnicalSpec_XCHPart2Impl.setConvertAssembleId(vrTechnicalSpec_XCHPart2.getConvertAssembleId());
		vrTechnicalSpec_XCHPart2Impl.setDossierId(vrTechnicalSpec_XCHPart2.getDossierId());
		vrTechnicalSpec_XCHPart2Impl.setDossierNo(vrTechnicalSpec_XCHPart2.getDossierNo());
		vrTechnicalSpec_XCHPart2Impl.setReferenceUid(vrTechnicalSpec_XCHPart2.getReferenceUid());
		vrTechnicalSpec_XCHPart2Impl.setDossierIdCTN(vrTechnicalSpec_XCHPart2.getDossierIdCTN());
		vrTechnicalSpec_XCHPart2Impl.setDeliverableCode(vrTechnicalSpec_XCHPart2.getDeliverableCode());
		vrTechnicalSpec_XCHPart2Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCHPart2.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCHPart2Impl.setXCH01273(vrTechnicalSpec_XCHPart2.getXCH01273());
		vrTechnicalSpec_XCHPart2Impl.setXCH01274(vrTechnicalSpec_XCHPart2.getXCH01274());
		vrTechnicalSpec_XCHPart2Impl.setXCH01275(vrTechnicalSpec_XCHPart2.getXCH01275());
		vrTechnicalSpec_XCHPart2Impl.setXCH01276(vrTechnicalSpec_XCHPart2.getXCH01276());
		vrTechnicalSpec_XCHPart2Impl.setXCH01277(vrTechnicalSpec_XCHPart2.getXCH01277());
		vrTechnicalSpec_XCHPart2Impl.setXCH01278(vrTechnicalSpec_XCHPart2.getXCH01278());
		vrTechnicalSpec_XCHPart2Impl.setXCH01279(vrTechnicalSpec_XCHPart2.getXCH01279());
		vrTechnicalSpec_XCHPart2Impl.setXCH01280(vrTechnicalSpec_XCHPart2.getXCH01280());
		vrTechnicalSpec_XCHPart2Impl.setXCH01281(vrTechnicalSpec_XCHPart2.getXCH01281());
		vrTechnicalSpec_XCHPart2Impl.setXCH01282(vrTechnicalSpec_XCHPart2.getXCH01282());
		vrTechnicalSpec_XCHPart2Impl.setXCH01283(vrTechnicalSpec_XCHPart2.getXCH01283());
		vrTechnicalSpec_XCHPart2Impl.setXCH01284(vrTechnicalSpec_XCHPart2.getXCH01284());
		vrTechnicalSpec_XCHPart2Impl.setXCH01285(vrTechnicalSpec_XCHPart2.getXCH01285());
		vrTechnicalSpec_XCHPart2Impl.setXCH01286(vrTechnicalSpec_XCHPart2.getXCH01286());
		vrTechnicalSpec_XCHPart2Impl.setXCH01287(vrTechnicalSpec_XCHPart2.getXCH01287());
		vrTechnicalSpec_XCHPart2Impl.setXCH01288(vrTechnicalSpec_XCHPart2.getXCH01288());
		vrTechnicalSpec_XCHPart2Impl.setXCH01289(vrTechnicalSpec_XCHPart2.getXCH01289());
		vrTechnicalSpec_XCHPart2Impl.setXCH01290(vrTechnicalSpec_XCHPart2.getXCH01290());
		vrTechnicalSpec_XCHPart2Impl.setXCH01291(vrTechnicalSpec_XCHPart2.getXCH01291());
		vrTechnicalSpec_XCHPart2Impl.setXCH01292(vrTechnicalSpec_XCHPart2.getXCH01292());
		vrTechnicalSpec_XCHPart2Impl.setXCH01293(vrTechnicalSpec_XCHPart2.getXCH01293());
		vrTechnicalSpec_XCHPart2Impl.setXCH01294(vrTechnicalSpec_XCHPart2.getXCH01294());
		vrTechnicalSpec_XCHPart2Impl.setXCH01295(vrTechnicalSpec_XCHPart2.getXCH01295());
		vrTechnicalSpec_XCHPart2Impl.setXCH01296(vrTechnicalSpec_XCHPart2.getXCH01296());
		vrTechnicalSpec_XCHPart2Impl.setXCH01297(vrTechnicalSpec_XCHPart2.getXCH01297());
		vrTechnicalSpec_XCHPart2Impl.setXCH01298(vrTechnicalSpec_XCHPart2.getXCH01298());
		vrTechnicalSpec_XCHPart2Impl.setXCH01299(vrTechnicalSpec_XCHPart2.getXCH01299());
		vrTechnicalSpec_XCHPart2Impl.setXCH01300(vrTechnicalSpec_XCHPart2.getXCH01300());
		vrTechnicalSpec_XCHPart2Impl.setXCH01301(vrTechnicalSpec_XCHPart2.getXCH01301());
		vrTechnicalSpec_XCHPart2Impl.setXCH01302(vrTechnicalSpec_XCHPart2.getXCH01302());
		vrTechnicalSpec_XCHPart2Impl.setXCH01303(vrTechnicalSpec_XCHPart2.getXCH01303());
		vrTechnicalSpec_XCHPart2Impl.setXCH01304(vrTechnicalSpec_XCHPart2.getXCH01304());
		vrTechnicalSpec_XCHPart2Impl.setXCH01305(vrTechnicalSpec_XCHPart2.getXCH01305());
		vrTechnicalSpec_XCHPart2Impl.setXCH01306(vrTechnicalSpec_XCHPart2.getXCH01306());
		vrTechnicalSpec_XCHPart2Impl.setXCH01307(vrTechnicalSpec_XCHPart2.getXCH01307());
		vrTechnicalSpec_XCHPart2Impl.setXCH01308(vrTechnicalSpec_XCHPart2.getXCH01308());
		vrTechnicalSpec_XCHPart2Impl.setXCH01309(vrTechnicalSpec_XCHPart2.getXCH01309());
		vrTechnicalSpec_XCHPart2Impl.setXCH01310(vrTechnicalSpec_XCHPart2.getXCH01310());
		vrTechnicalSpec_XCHPart2Impl.setXCH01311(vrTechnicalSpec_XCHPart2.getXCH01311());
		vrTechnicalSpec_XCHPart2Impl.setXCH01312(vrTechnicalSpec_XCHPart2.getXCH01312());
		vrTechnicalSpec_XCHPart2Impl.setXCH01313(vrTechnicalSpec_XCHPart2.getXCH01313());
		vrTechnicalSpec_XCHPart2Impl.setXCH01314(vrTechnicalSpec_XCHPart2.getXCH01314());
		vrTechnicalSpec_XCHPart2Impl.setXCH01315(vrTechnicalSpec_XCHPart2.getXCH01315());
		vrTechnicalSpec_XCHPart2Impl.setXCH01316(vrTechnicalSpec_XCHPart2.getXCH01316());
		vrTechnicalSpec_XCHPart2Impl.setXCH01317(vrTechnicalSpec_XCHPart2.getXCH01317());
		vrTechnicalSpec_XCHPart2Impl.setXCH01318(vrTechnicalSpec_XCHPart2.getXCH01318());
		vrTechnicalSpec_XCHPart2Impl.setXCH01319(vrTechnicalSpec_XCHPart2.getXCH01319());
		vrTechnicalSpec_XCHPart2Impl.setXCH01320(vrTechnicalSpec_XCHPart2.getXCH01320());
		vrTechnicalSpec_XCHPart2Impl.setXCH01321(vrTechnicalSpec_XCHPart2.getXCH01321());
		vrTechnicalSpec_XCHPart2Impl.setXCH01322(vrTechnicalSpec_XCHPart2.getXCH01322());
		vrTechnicalSpec_XCHPart2Impl.setXCH01323(vrTechnicalSpec_XCHPart2.getXCH01323());
		vrTechnicalSpec_XCHPart2Impl.setXCH01324(vrTechnicalSpec_XCHPart2.getXCH01324());
		vrTechnicalSpec_XCHPart2Impl.setXCH01325(vrTechnicalSpec_XCHPart2.getXCH01325());
		vrTechnicalSpec_XCHPart2Impl.setXCH01326(vrTechnicalSpec_XCHPart2.getXCH01326());
		vrTechnicalSpec_XCHPart2Impl.setXCH01327(vrTechnicalSpec_XCHPart2.getXCH01327());
		vrTechnicalSpec_XCHPart2Impl.setXCH01328(vrTechnicalSpec_XCHPart2.getXCH01328());
		vrTechnicalSpec_XCHPart2Impl.setXCH01329(vrTechnicalSpec_XCHPart2.getXCH01329());
		vrTechnicalSpec_XCHPart2Impl.setXCH01330(vrTechnicalSpec_XCHPart2.getXCH01330());
		vrTechnicalSpec_XCHPart2Impl.setXCH01331(vrTechnicalSpec_XCHPart2.getXCH01331());
		vrTechnicalSpec_XCHPart2Impl.setXCH01332(vrTechnicalSpec_XCHPart2.getXCH01332());
		vrTechnicalSpec_XCHPart2Impl.setXCH01333(vrTechnicalSpec_XCHPart2.getXCH01333());
		vrTechnicalSpec_XCHPart2Impl.setXCH01334(vrTechnicalSpec_XCHPart2.getXCH01334());
		vrTechnicalSpec_XCHPart2Impl.setXCH01335(vrTechnicalSpec_XCHPart2.getXCH01335());
		vrTechnicalSpec_XCHPart2Impl.setXCH01336(vrTechnicalSpec_XCHPart2.getXCH01336());
		vrTechnicalSpec_XCHPart2Impl.setXCH01337(vrTechnicalSpec_XCHPart2.getXCH01337());
		vrTechnicalSpec_XCHPart2Impl.setXCH01338(vrTechnicalSpec_XCHPart2.getXCH01338());
		vrTechnicalSpec_XCHPart2Impl.setXCH01339(vrTechnicalSpec_XCHPart2.getXCH01339());
		vrTechnicalSpec_XCHPart2Impl.setXCH01340(vrTechnicalSpec_XCHPart2.getXCH01340());
		vrTechnicalSpec_XCHPart2Impl.setXCH01341(vrTechnicalSpec_XCHPart2.getXCH01341());
		vrTechnicalSpec_XCHPart2Impl.setXCH01342(vrTechnicalSpec_XCHPart2.getXCH01342());
		vrTechnicalSpec_XCHPart2Impl.setXCH01343(vrTechnicalSpec_XCHPart2.getXCH01343());
		vrTechnicalSpec_XCHPart2Impl.setXCH01344(vrTechnicalSpec_XCHPart2.getXCH01344());
		vrTechnicalSpec_XCHPart2Impl.setXCH01345(vrTechnicalSpec_XCHPart2.getXCH01345());
		vrTechnicalSpec_XCHPart2Impl.setXCH01346(vrTechnicalSpec_XCHPart2.getXCH01346());
		vrTechnicalSpec_XCHPart2Impl.setXCH01347(vrTechnicalSpec_XCHPart2.getXCH01347());
		vrTechnicalSpec_XCHPart2Impl.setXCH01348(vrTechnicalSpec_XCHPart2.getXCH01348());
		vrTechnicalSpec_XCHPart2Impl.setXCH01349(vrTechnicalSpec_XCHPart2.getXCH01349());
		vrTechnicalSpec_XCHPart2Impl.setXCH01350(vrTechnicalSpec_XCHPart2.getXCH01350());
		vrTechnicalSpec_XCHPart2Impl.setXCH01351(vrTechnicalSpec_XCHPart2.getXCH01351());
		vrTechnicalSpec_XCHPart2Impl.setXCH01352(vrTechnicalSpec_XCHPart2.getXCH01352());
		vrTechnicalSpec_XCHPart2Impl.setXCH01353(vrTechnicalSpec_XCHPart2.getXCH01353());
		vrTechnicalSpec_XCHPart2Impl.setXCH01354(vrTechnicalSpec_XCHPart2.getXCH01354());
		vrTechnicalSpec_XCHPart2Impl.setXCH01355(vrTechnicalSpec_XCHPart2.getXCH01355());
		vrTechnicalSpec_XCHPart2Impl.setXCH01356(vrTechnicalSpec_XCHPart2.getXCH01356());
		vrTechnicalSpec_XCHPart2Impl.setXCH01357(vrTechnicalSpec_XCHPart2.getXCH01357());
		vrTechnicalSpec_XCHPart2Impl.setXCH01358(vrTechnicalSpec_XCHPart2.getXCH01358());
		vrTechnicalSpec_XCHPart2Impl.setXCH01359(vrTechnicalSpec_XCHPart2.getXCH01359());
		vrTechnicalSpec_XCHPart2Impl.setXCH01360(vrTechnicalSpec_XCHPart2.getXCH01360());
		vrTechnicalSpec_XCHPart2Impl.setXCH01361(vrTechnicalSpec_XCHPart2.getXCH01361());
		vrTechnicalSpec_XCHPart2Impl.setXCH01362(vrTechnicalSpec_XCHPart2.getXCH01362());
		vrTechnicalSpec_XCHPart2Impl.setXCH01363(vrTechnicalSpec_XCHPart2.getXCH01363());
		vrTechnicalSpec_XCHPart2Impl.setXCH01364(vrTechnicalSpec_XCHPart2.getXCH01364());
		vrTechnicalSpec_XCHPart2Impl.setXCH01365(vrTechnicalSpec_XCHPart2.getXCH01365());
		vrTechnicalSpec_XCHPart2Impl.setXCH01366(vrTechnicalSpec_XCHPart2.getXCH01366());
		vrTechnicalSpec_XCHPart2Impl.setXCH01367(vrTechnicalSpec_XCHPart2.getXCH01367());
		vrTechnicalSpec_XCHPart2Impl.setXCH01368(vrTechnicalSpec_XCHPart2.getXCH01368());
		vrTechnicalSpec_XCHPart2Impl.setXCH01369(vrTechnicalSpec_XCHPart2.getXCH01369());
		vrTechnicalSpec_XCHPart2Impl.setXCH01370(vrTechnicalSpec_XCHPart2.getXCH01370());
		vrTechnicalSpec_XCHPart2Impl.setXCH01371(vrTechnicalSpec_XCHPart2.getXCH01371());
		vrTechnicalSpec_XCHPart2Impl.setXCH01372(vrTechnicalSpec_XCHPart2.getXCH01372());
		vrTechnicalSpec_XCHPart2Impl.setXCH01373(vrTechnicalSpec_XCHPart2.getXCH01373());
		vrTechnicalSpec_XCHPart2Impl.setXCH01374(vrTechnicalSpec_XCHPart2.getXCH01374());
		vrTechnicalSpec_XCHPart2Impl.setXCH01375(vrTechnicalSpec_XCHPart2.getXCH01375());
		vrTechnicalSpec_XCHPart2Impl.setXCH01376(vrTechnicalSpec_XCHPart2.getXCH01376());
		vrTechnicalSpec_XCHPart2Impl.setXCH01377(vrTechnicalSpec_XCHPart2.getXCH01377());
		vrTechnicalSpec_XCHPart2Impl.setXCH01378(vrTechnicalSpec_XCHPart2.getXCH01378());
		vrTechnicalSpec_XCHPart2Impl.setXCH01379(vrTechnicalSpec_XCHPart2.getXCH01379());
		vrTechnicalSpec_XCHPart2Impl.setXCH01380(vrTechnicalSpec_XCHPart2.getXCH01380());
		vrTechnicalSpec_XCHPart2Impl.setXCH01381(vrTechnicalSpec_XCHPart2.getXCH01381());
		vrTechnicalSpec_XCHPart2Impl.setXCH01382(vrTechnicalSpec_XCHPart2.getXCH01382());
		vrTechnicalSpec_XCHPart2Impl.setXCH01383(vrTechnicalSpec_XCHPart2.getXCH01383());
		vrTechnicalSpec_XCHPart2Impl.setXCH01384(vrTechnicalSpec_XCHPart2.getXCH01384());
		vrTechnicalSpec_XCHPart2Impl.setXCH01385(vrTechnicalSpec_XCHPart2.getXCH01385());
		vrTechnicalSpec_XCHPart2Impl.setXCH01386(vrTechnicalSpec_XCHPart2.getXCH01386());
		vrTechnicalSpec_XCHPart2Impl.setXCH01387(vrTechnicalSpec_XCHPart2.getXCH01387());
		vrTechnicalSpec_XCHPart2Impl.setXCH01388(vrTechnicalSpec_XCHPart2.getXCH01388());
		vrTechnicalSpec_XCHPart2Impl.setXCH01389(vrTechnicalSpec_XCHPart2.getXCH01389());
		vrTechnicalSpec_XCHPart2Impl.setXCH01390(vrTechnicalSpec_XCHPart2.getXCH01390());
		vrTechnicalSpec_XCHPart2Impl.setXCH01391(vrTechnicalSpec_XCHPart2.getXCH01391());
		vrTechnicalSpec_XCHPart2Impl.setXCH01392(vrTechnicalSpec_XCHPart2.getXCH01392());
		vrTechnicalSpec_XCHPart2Impl.setXCH01393(vrTechnicalSpec_XCHPart2.getXCH01393());
		vrTechnicalSpec_XCHPart2Impl.setXCH01394(vrTechnicalSpec_XCHPart2.getXCH01394());
		vrTechnicalSpec_XCHPart2Impl.setXCH01395(vrTechnicalSpec_XCHPart2.getXCH01395());
		vrTechnicalSpec_XCHPart2Impl.setXCH01396(vrTechnicalSpec_XCHPart2.getXCH01396());
		vrTechnicalSpec_XCHPart2Impl.setXCH01397(vrTechnicalSpec_XCHPart2.getXCH01397());
		vrTechnicalSpec_XCHPart2Impl.setXCH01398(vrTechnicalSpec_XCHPart2.getXCH01398());
		vrTechnicalSpec_XCHPart2Impl.setXCH01399(vrTechnicalSpec_XCHPart2.getXCH01399());
		vrTechnicalSpec_XCHPart2Impl.setXCH01400(vrTechnicalSpec_XCHPart2.getXCH01400());
		vrTechnicalSpec_XCHPart2Impl.setXCH01401(vrTechnicalSpec_XCHPart2.getXCH01401());
		vrTechnicalSpec_XCHPart2Impl.setXCH01402(vrTechnicalSpec_XCHPart2.getXCH01402());
		vrTechnicalSpec_XCHPart2Impl.setXCH01403(vrTechnicalSpec_XCHPart2.getXCH01403());
		vrTechnicalSpec_XCHPart2Impl.setXCH01404(vrTechnicalSpec_XCHPart2.getXCH01404());
		vrTechnicalSpec_XCHPart2Impl.setXCH01405(vrTechnicalSpec_XCHPart2.getXCH01405());
		vrTechnicalSpec_XCHPart2Impl.setXCH01406(vrTechnicalSpec_XCHPart2.getXCH01406());
		vrTechnicalSpec_XCHPart2Impl.setXCH01407(vrTechnicalSpec_XCHPart2.getXCH01407());
		vrTechnicalSpec_XCHPart2Impl.setXCH01408(vrTechnicalSpec_XCHPart2.getXCH01408());
		vrTechnicalSpec_XCHPart2Impl.setXCH01409(vrTechnicalSpec_XCHPart2.getXCH01409());
		vrTechnicalSpec_XCHPart2Impl.setXCH01410(vrTechnicalSpec_XCHPart2.getXCH01410());
		vrTechnicalSpec_XCHPart2Impl.setXCH01411(vrTechnicalSpec_XCHPart2.getXCH01411());
		vrTechnicalSpec_XCHPart2Impl.setXCH01412(vrTechnicalSpec_XCHPart2.getXCH01412());
		vrTechnicalSpec_XCHPart2Impl.setXCH01413(vrTechnicalSpec_XCHPart2.getXCH01413());
		vrTechnicalSpec_XCHPart2Impl.setXCH01414(vrTechnicalSpec_XCHPart2.getXCH01414());
		vrTechnicalSpec_XCHPart2Impl.setXCH01415(vrTechnicalSpec_XCHPart2.getXCH01415());
		vrTechnicalSpec_XCHPart2Impl.setXCH01416(vrTechnicalSpec_XCHPart2.getXCH01416());
		vrTechnicalSpec_XCHPart2Impl.setXCH01417(vrTechnicalSpec_XCHPart2.getXCH01417());
		vrTechnicalSpec_XCHPart2Impl.setXCH01418(vrTechnicalSpec_XCHPart2.getXCH01418());
		vrTechnicalSpec_XCHPart2Impl.setXCH01419(vrTechnicalSpec_XCHPart2.getXCH01419());
		vrTechnicalSpec_XCHPart2Impl.setXCH01420(vrTechnicalSpec_XCHPart2.getXCH01420());
		vrTechnicalSpec_XCHPart2Impl.setXCH01421(vrTechnicalSpec_XCHPart2.getXCH01421());
		vrTechnicalSpec_XCHPart2Impl.setXCH01422(vrTechnicalSpec_XCHPart2.getXCH01422());
		vrTechnicalSpec_XCHPart2Impl.setXCH01423(vrTechnicalSpec_XCHPart2.getXCH01423());
		vrTechnicalSpec_XCHPart2Impl.setXCH01424(vrTechnicalSpec_XCHPart2.getXCH01424());
		vrTechnicalSpec_XCHPart2Impl.setXCH01425(vrTechnicalSpec_XCHPart2.getXCH01425());
		vrTechnicalSpec_XCHPart2Impl.setXCH01426(vrTechnicalSpec_XCHPart2.getXCH01426());
		vrTechnicalSpec_XCHPart2Impl.setXCH01427(vrTechnicalSpec_XCHPart2.getXCH01427());
		vrTechnicalSpec_XCHPart2Impl.setXCH01428(vrTechnicalSpec_XCHPart2.getXCH01428());
		vrTechnicalSpec_XCHPart2Impl.setXCH01429(vrTechnicalSpec_XCHPart2.getXCH01429());
		vrTechnicalSpec_XCHPart2Impl.setXCH01430(vrTechnicalSpec_XCHPart2.getXCH01430());
		vrTechnicalSpec_XCHPart2Impl.setXCH01431(vrTechnicalSpec_XCHPart2.getXCH01431());
		vrTechnicalSpec_XCHPart2Impl.setXCH01432(vrTechnicalSpec_XCHPart2.getXCH01432());
		vrTechnicalSpec_XCHPart2Impl.setXCH01433(vrTechnicalSpec_XCHPart2.getXCH01433());
		vrTechnicalSpec_XCHPart2Impl.setXCH01434(vrTechnicalSpec_XCHPart2.getXCH01434());
		vrTechnicalSpec_XCHPart2Impl.setXCH01435(vrTechnicalSpec_XCHPart2.getXCH01435());
		vrTechnicalSpec_XCHPart2Impl.setXCH01436(vrTechnicalSpec_XCHPart2.getXCH01436());
		vrTechnicalSpec_XCHPart2Impl.setXCH01437(vrTechnicalSpec_XCHPart2.getXCH01437());
		vrTechnicalSpec_XCHPart2Impl.setXCH01438(vrTechnicalSpec_XCHPart2.getXCH01438());
		vrTechnicalSpec_XCHPart2Impl.setXCH01439(vrTechnicalSpec_XCHPart2.getXCH01439());
		vrTechnicalSpec_XCHPart2Impl.setXCH01440(vrTechnicalSpec_XCHPart2.getXCH01440());
		vrTechnicalSpec_XCHPart2Impl.setXCH01441(vrTechnicalSpec_XCHPart2.getXCH01441());
		vrTechnicalSpec_XCHPart2Impl.setXCH01442(vrTechnicalSpec_XCHPart2.getXCH01442());
		vrTechnicalSpec_XCHPart2Impl.setXCH01443(vrTechnicalSpec_XCHPart2.getXCH01443());
		vrTechnicalSpec_XCHPart2Impl.setXCH01444(vrTechnicalSpec_XCHPart2.getXCH01444());
		vrTechnicalSpec_XCHPart2Impl.setXCH01445(vrTechnicalSpec_XCHPart2.getXCH01445());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH001(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH001());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH002(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH002());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH003(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH003());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH004(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH004());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH005(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH005());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH006(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH006());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH012(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH012());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH013(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH013());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH014(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH014());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH015(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH015());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH016(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH016());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH017(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH017());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH018(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH018());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH019(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH019());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH020(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH020());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH021(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH021());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH022(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH022());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH023(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH023());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH026(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH026());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH027(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH027());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH028(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH028());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH033(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH033());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH034(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH034());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH037(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH037());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH038(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH038());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH039(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH039());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH040(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH040());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH041(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH041());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH042(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH042());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH043(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH043());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH044(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH044());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH045(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH045());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH046(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH046());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH047(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH047());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH053(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH053());
		vrTechnicalSpec_XCHPart2Impl.setBBCNCLKLXCH054(vrTechnicalSpec_XCHPart2.getBBCNCLKLXCH054());
		vrTechnicalSpec_XCHPart2Impl.setModifyDate(vrTechnicalSpec_XCHPart2.getModifyDate());
		vrTechnicalSpec_XCHPart2Impl.setSyncDate(vrTechnicalSpec_XCHPart2.getSyncDate());

		return vrTechnicalSpec_XCHPart2Impl;
	}

	/**
	 * Returns the vr technical spec_xch part2 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCHPart2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCHPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCHPart2;
	}

	/**
	 * Returns the vr technical spec_xch part2 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCHPart2Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2
	 * @throws NoSuchVRTechnicalSpec_XCHPart2Exception if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCHPart2Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xch part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2, or <code>null</code> if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCHPart2Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = (VRTechnicalSpec_XCHPart2)serializable;

		if (vrTechnicalSpec_XCHPart2 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCHPart2 = (VRTechnicalSpec_XCHPart2)session.get(VRTechnicalSpec_XCHPart2Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCHPart2 != null) {
					cacheResult(vrTechnicalSpec_XCHPart2);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCHPart2Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHPart2Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCHPart2;
	}

	/**
	 * Returns the vr technical spec_xch part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xch part2
	 * @return the vr technical spec_xch part2, or <code>null</code> if a vr technical spec_xch part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCHPart2 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCHPart2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCHPart2> map = new HashMap<Serializable, VRTechnicalSpec_XCHPart2>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCHPart2 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCHPart2);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHPart2Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCHPart2)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : (List<VRTechnicalSpec_XCHPart2>)q.list()) {
				map.put(vrTechnicalSpec_XCHPart2.getPrimaryKeyObj(),
					vrTechnicalSpec_XCHPart2);

				cacheResult(vrTechnicalSpec_XCHPart2);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCHPart2.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCHPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCHPart2Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xch part2s.
	 *
	 * @return the vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xch part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @return the range of vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xch part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCHPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xch part2s
	 * @param end the upper bound of the range of vr technical spec_xch part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xch part2s
	 */
	@Override
	public List<VRTechnicalSpec_XCHPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCHPart2> orderByComparator,
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

		List<VRTechnicalSpec_XCHPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCHPart2>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCHPART2);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCHPART2;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCHPart2ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCHPart2>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xch part2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 : findAll()) {
			remove(vrTechnicalSpec_XCHPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xch part2s.
	 *
	 * @return the number of vr technical spec_xch part2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCHPART2);

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
		return VRTechnicalSpec_XCHPart2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xch part2 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCHPart2Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCHPART2 = "SELECT vrTechnicalSpec_XCHPart2 FROM VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCHPart2 FROM VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCHPART2_WHERE = "SELECT vrTechnicalSpec_XCHPart2 FROM VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCHPART2 = "SELECT COUNT(vrTechnicalSpec_XCHPart2) FROM VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCHPART2_WHERE = "SELECT COUNT(vrTechnicalSpec_XCHPart2) FROM VRTechnicalSpec_XCHPart2 vrTechnicalSpec_XCHPart2 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCHPart2.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCHPart2 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCHPart2 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCHPart2PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}