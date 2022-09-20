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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XMYPart2Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XMYPart2;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart2Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XMYPart2ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XMYPart2Persistence;

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
 * The persistence implementation for the vr technical spec_xmy part2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XMYPart2Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XMYPart2Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XMYPart2PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XMYPart2>
	implements VRTechnicalSpec_XMYPart2Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XMYPart2Util} to access the vr technical spec_xmy part2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XMYPart2Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XMYPart2.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XMYPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XMYPart2 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XMYPart2.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XMYPart2.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XMYPart2.dossierNo IS NULL OR vrTechnicalSpec_XMYPart2.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XMYPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XMYPart2.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart2 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XMYPart2.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XMYPart2.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XMYPart2.dossierIdCTN IS NULL OR vrTechnicalSpec_XMYPart2.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XMYPart2.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, deliverableCode,
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

	protected VRTechnicalSpec_XMYPart2 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
		"vrTechnicalSpec_XMYPart2.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XMYPart2.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XMYPart2.deliverableCode IS NULL OR vrTechnicalSpec_XMYPart2.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if ((dossierId != vrTechnicalSpec_XMYPart2.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XMYPart2.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierId, mtCore,
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

	protected VRTechnicalSpec_XMYPart2 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XMYPart2.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XMYPart2.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if ((dossierId != vrTechnicalSpec_XMYPart2.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart2 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XMYPart2.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XMYPart2.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, convertAssembleId,
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

	protected VRTechnicalSpec_XMYPart2 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
		"vrTechnicalSpec_XMYPart2.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XMYPart2.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XMYPart2 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XMYPart2.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XMYPart2.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XMYPart2.referenceUid IS NULL OR vrTechnicalSpec_XMYPart2.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XMYPart2ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XMYPart2ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XMYPart2.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xmy part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xmy part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		List<VRTechnicalSpec_XMYPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XMYPart2 != null) {
			return vrTechnicalSpec_XMYPart2;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XMYPart2Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xmy part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xmy part2, or <code>null</code> if a matching vr technical spec_xmy part2 could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XMYPart2> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xmy part2s before and after the current vr technical spec_xmy part2 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xmy part2
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2[] array = new VRTechnicalSpec_XMYPart2Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XMYPart2;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XMYPart2, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XMYPart2 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
			query.append(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XMYPart2);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XMYPart2> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xmy part2s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE);

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
		"vrTechnicalSpec_XMYPart2.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XMYPart2PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XMYPart2.class);
	}

	/**
	 * Caches the vr technical spec_xmy part2 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XMYPart2 the vr technical spec_xmy part2
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		entityCache.putResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			vrTechnicalSpec_XMYPart2.getPrimaryKey(), vrTechnicalSpec_XMYPart2);

		vrTechnicalSpec_XMYPart2.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xmy part2s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XMYPart2s the vr technical spec_xmy part2s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XMYPart2> vrTechnicalSpec_XMYPart2s) {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : vrTechnicalSpec_XMYPart2s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XMYPart2Impl.class,
						vrTechnicalSpec_XMYPart2.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XMYPart2);
			}
			else {
				vrTechnicalSpec_XMYPart2.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xmy part2s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XMYPart2Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xmy part2.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		entityCache.removeResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			vrTechnicalSpec_XMYPart2.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XMYPart2> vrTechnicalSpec_XMYPart2s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : vrTechnicalSpec_XMYPart2s) {
			entityCache.removeResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XMYPart2Impl.class,
				vrTechnicalSpec_XMYPart2.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xmy part2 with the primary key. Does not add the vr technical spec_xmy part2 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xmy part2
	 * @return the new vr technical spec_xmy part2
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 create(long id) {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = new VRTechnicalSpec_XMYPart2Impl();

		vrTechnicalSpec_XMYPart2.setNew(true);
		vrTechnicalSpec_XMYPart2.setPrimaryKey(id);

		return vrTechnicalSpec_XMYPart2;
	}

	/**
	 * Removes the vr technical spec_xmy part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 remove(long id)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xmy part2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2 that was removed
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = (VRTechnicalSpec_XMYPart2)session.get(VRTechnicalSpec_XMYPart2Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XMYPart2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XMYPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XMYPart2);
		}
		catch (NoSuchVRTechnicalSpec_XMYPart2Exception nsee) {
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
	protected VRTechnicalSpec_XMYPart2 removeImpl(
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		vrTechnicalSpec_XMYPart2 = toUnwrappedModel(vrTechnicalSpec_XMYPart2);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XMYPart2)) {
				vrTechnicalSpec_XMYPart2 = (VRTechnicalSpec_XMYPart2)session.get(VRTechnicalSpec_XMYPart2Impl.class,
						vrTechnicalSpec_XMYPart2.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XMYPart2 != null) {
				session.delete(vrTechnicalSpec_XMYPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XMYPart2 != null) {
			clearCache(vrTechnicalSpec_XMYPart2);
		}

		return vrTechnicalSpec_XMYPart2;
	}

	@Override
	public VRTechnicalSpec_XMYPart2 updateImpl(
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		vrTechnicalSpec_XMYPart2 = toUnwrappedModel(vrTechnicalSpec_XMYPart2);

		boolean isNew = vrTechnicalSpec_XMYPart2.isNew();

		VRTechnicalSpec_XMYPart2ModelImpl vrTechnicalSpec_XMYPart2ModelImpl = (VRTechnicalSpec_XMYPart2ModelImpl)vrTechnicalSpec_XMYPart2;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XMYPart2.isNew()) {
				session.save(vrTechnicalSpec_XMYPart2);

				vrTechnicalSpec_XMYPart2.setNew(false);
			}
			else {
				vrTechnicalSpec_XMYPart2 = (VRTechnicalSpec_XMYPart2)session.merge(vrTechnicalSpec_XMYPart2);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XMYPart2ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getDossierNo(),
						vrTechnicalSpec_XMYPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getDossierId(),
						vrTechnicalSpec_XMYPart2ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XMYPart2ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XMYPart2ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XMYPart2Impl.class,
			vrTechnicalSpec_XMYPart2.getPrimaryKey(), vrTechnicalSpec_XMYPart2,
			false);

		vrTechnicalSpec_XMYPart2.resetOriginalValues();

		return vrTechnicalSpec_XMYPart2;
	}

	protected VRTechnicalSpec_XMYPart2 toUnwrappedModel(
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2) {
		if (vrTechnicalSpec_XMYPart2 instanceof VRTechnicalSpec_XMYPart2Impl) {
			return vrTechnicalSpec_XMYPart2;
		}

		VRTechnicalSpec_XMYPart2Impl vrTechnicalSpec_XMYPart2Impl = new VRTechnicalSpec_XMYPart2Impl();

		vrTechnicalSpec_XMYPart2Impl.setNew(vrTechnicalSpec_XMYPart2.isNew());
		vrTechnicalSpec_XMYPart2Impl.setPrimaryKey(vrTechnicalSpec_XMYPart2.getPrimaryKey());

		vrTechnicalSpec_XMYPart2Impl.setId(vrTechnicalSpec_XMYPart2.getId());
		vrTechnicalSpec_XMYPart2Impl.setMtCore(vrTechnicalSpec_XMYPart2.getMtCore());
		vrTechnicalSpec_XMYPart2Impl.setConvertAssembleId(vrTechnicalSpec_XMYPart2.getConvertAssembleId());
		vrTechnicalSpec_XMYPart2Impl.setDossierId(vrTechnicalSpec_XMYPart2.getDossierId());
		vrTechnicalSpec_XMYPart2Impl.setDossierNo(vrTechnicalSpec_XMYPart2.getDossierNo());
		vrTechnicalSpec_XMYPart2Impl.setReferenceUid(vrTechnicalSpec_XMYPart2.getReferenceUid());
		vrTechnicalSpec_XMYPart2Impl.setDossierIdCTN(vrTechnicalSpec_XMYPart2.getDossierIdCTN());
		vrTechnicalSpec_XMYPart2Impl.setDeliverableCode(vrTechnicalSpec_XMYPart2.getDeliverableCode());
		vrTechnicalSpec_XMYPart2Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XMYPart2.getVehicleTypeCertificateId());
		vrTechnicalSpec_XMYPart2Impl.setXMY0010(vrTechnicalSpec_XMYPart2.getXMY0010());
		vrTechnicalSpec_XMYPart2Impl.setXMY0011(vrTechnicalSpec_XMYPart2.getXMY0011());
		vrTechnicalSpec_XMYPart2Impl.setXMY0012(vrTechnicalSpec_XMYPart2.getXMY0012());
		vrTechnicalSpec_XMYPart2Impl.setXMY0013(vrTechnicalSpec_XMYPart2.getXMY0013());
		vrTechnicalSpec_XMYPart2Impl.setXMY0014(vrTechnicalSpec_XMYPart2.getXMY0014());
		vrTechnicalSpec_XMYPart2Impl.setXMY0015(vrTechnicalSpec_XMYPart2.getXMY0015());
		vrTechnicalSpec_XMYPart2Impl.setXMY0016(vrTechnicalSpec_XMYPart2.getXMY0016());
		vrTechnicalSpec_XMYPart2Impl.setXMY0017(vrTechnicalSpec_XMYPart2.getXMY0017());
		vrTechnicalSpec_XMYPart2Impl.setXMY0018(vrTechnicalSpec_XMYPart2.getXMY0018());
		vrTechnicalSpec_XMYPart2Impl.setXMY0019(vrTechnicalSpec_XMYPart2.getXMY0019());
		vrTechnicalSpec_XMYPart2Impl.setXMY0020(vrTechnicalSpec_XMYPart2.getXMY0020());
		vrTechnicalSpec_XMYPart2Impl.setXMY0021(vrTechnicalSpec_XMYPart2.getXMY0021());
		vrTechnicalSpec_XMYPart2Impl.setXMY0022(vrTechnicalSpec_XMYPart2.getXMY0022());
		vrTechnicalSpec_XMYPart2Impl.setXMY0023(vrTechnicalSpec_XMYPart2.getXMY0023());
		vrTechnicalSpec_XMYPart2Impl.setXMY0024(vrTechnicalSpec_XMYPart2.getXMY0024());
		vrTechnicalSpec_XMYPart2Impl.setXMY0025(vrTechnicalSpec_XMYPart2.getXMY0025());
		vrTechnicalSpec_XMYPart2Impl.setXMY0026(vrTechnicalSpec_XMYPart2.getXMY0026());
		vrTechnicalSpec_XMYPart2Impl.setXMY0027(vrTechnicalSpec_XMYPart2.getXMY0027());
		vrTechnicalSpec_XMYPart2Impl.setXMY0028(vrTechnicalSpec_XMYPart2.getXMY0028());
		vrTechnicalSpec_XMYPart2Impl.setXMY0029(vrTechnicalSpec_XMYPart2.getXMY0029());
		vrTechnicalSpec_XMYPart2Impl.setXMY0030(vrTechnicalSpec_XMYPart2.getXMY0030());
		vrTechnicalSpec_XMYPart2Impl.setXMY0031(vrTechnicalSpec_XMYPart2.getXMY0031());
		vrTechnicalSpec_XMYPart2Impl.setXMY0032(vrTechnicalSpec_XMYPart2.getXMY0032());
		vrTechnicalSpec_XMYPart2Impl.setXMY0033(vrTechnicalSpec_XMYPart2.getXMY0033());
		vrTechnicalSpec_XMYPart2Impl.setXMY0034(vrTechnicalSpec_XMYPart2.getXMY0034());
		vrTechnicalSpec_XMYPart2Impl.setXMY0036(vrTechnicalSpec_XMYPart2.getXMY0036());
		vrTechnicalSpec_XMYPart2Impl.setXMY0037(vrTechnicalSpec_XMYPart2.getXMY0037());
		vrTechnicalSpec_XMYPart2Impl.setXMY0038(vrTechnicalSpec_XMYPart2.getXMY0038());
		vrTechnicalSpec_XMYPart2Impl.setXMY0039(vrTechnicalSpec_XMYPart2.getXMY0039());
		vrTechnicalSpec_XMYPart2Impl.setXMY0040(vrTechnicalSpec_XMYPart2.getXMY0040());
		vrTechnicalSpec_XMYPart2Impl.setXMY0041(vrTechnicalSpec_XMYPart2.getXMY0041());
		vrTechnicalSpec_XMYPart2Impl.setXMY0042(vrTechnicalSpec_XMYPart2.getXMY0042());
		vrTechnicalSpec_XMYPart2Impl.setXMY0043(vrTechnicalSpec_XMYPart2.getXMY0043());
		vrTechnicalSpec_XMYPart2Impl.setXMY0044(vrTechnicalSpec_XMYPart2.getXMY0044());
		vrTechnicalSpec_XMYPart2Impl.setXMY0045(vrTechnicalSpec_XMYPart2.getXMY0045());
		vrTechnicalSpec_XMYPart2Impl.setXMY0046(vrTechnicalSpec_XMYPart2.getXMY0046());
		vrTechnicalSpec_XMYPart2Impl.setXMY0048(vrTechnicalSpec_XMYPart2.getXMY0048());
		vrTechnicalSpec_XMYPart2Impl.setXMY0049(vrTechnicalSpec_XMYPart2.getXMY0049());
		vrTechnicalSpec_XMYPart2Impl.setXMY0050(vrTechnicalSpec_XMYPart2.getXMY0050());
		vrTechnicalSpec_XMYPart2Impl.setXMY0051(vrTechnicalSpec_XMYPart2.getXMY0051());
		vrTechnicalSpec_XMYPart2Impl.setXMY0052(vrTechnicalSpec_XMYPart2.getXMY0052());
		vrTechnicalSpec_XMYPart2Impl.setXMY0053(vrTechnicalSpec_XMYPart2.getXMY0053());
		vrTechnicalSpec_XMYPart2Impl.setXMY0054(vrTechnicalSpec_XMYPart2.getXMY0054());
		vrTechnicalSpec_XMYPart2Impl.setXMY0055(vrTechnicalSpec_XMYPart2.getXMY0055());
		vrTechnicalSpec_XMYPart2Impl.setXMY0056(vrTechnicalSpec_XMYPart2.getXMY0056());
		vrTechnicalSpec_XMYPart2Impl.setXMY0057(vrTechnicalSpec_XMYPart2.getXMY0057());
		vrTechnicalSpec_XMYPart2Impl.setXMY0058(vrTechnicalSpec_XMYPart2.getXMY0058());
		vrTechnicalSpec_XMYPart2Impl.setXMY0059(vrTechnicalSpec_XMYPart2.getXMY0059());
		vrTechnicalSpec_XMYPart2Impl.setXMY0060(vrTechnicalSpec_XMYPart2.getXMY0060());
		vrTechnicalSpec_XMYPart2Impl.setXMY0061(vrTechnicalSpec_XMYPart2.getXMY0061());
		vrTechnicalSpec_XMYPart2Impl.setXMY0062(vrTechnicalSpec_XMYPart2.getXMY0062());
		vrTechnicalSpec_XMYPart2Impl.setXMY0063(vrTechnicalSpec_XMYPart2.getXMY0063());
		vrTechnicalSpec_XMYPart2Impl.setXMY0064(vrTechnicalSpec_XMYPart2.getXMY0064());
		vrTechnicalSpec_XMYPart2Impl.setXMY0065(vrTechnicalSpec_XMYPart2.getXMY0065());
		vrTechnicalSpec_XMYPart2Impl.setXMY0066(vrTechnicalSpec_XMYPart2.getXMY0066());
		vrTechnicalSpec_XMYPart2Impl.setXMY0067(vrTechnicalSpec_XMYPart2.getXMY0067());
		vrTechnicalSpec_XMYPart2Impl.setXMY0068(vrTechnicalSpec_XMYPart2.getXMY0068());
		vrTechnicalSpec_XMYPart2Impl.setXMY0070(vrTechnicalSpec_XMYPart2.getXMY0070());
		vrTechnicalSpec_XMYPart2Impl.setXMY0071(vrTechnicalSpec_XMYPart2.getXMY0071());
		vrTechnicalSpec_XMYPart2Impl.setXMY0072(vrTechnicalSpec_XMYPart2.getXMY0072());
		vrTechnicalSpec_XMYPart2Impl.setXMY0073(vrTechnicalSpec_XMYPart2.getXMY0073());
		vrTechnicalSpec_XMYPart2Impl.setXMY0074(vrTechnicalSpec_XMYPart2.getXMY0074());
		vrTechnicalSpec_XMYPart2Impl.setXMY0075(vrTechnicalSpec_XMYPart2.getXMY0075());
		vrTechnicalSpec_XMYPart2Impl.setXMY0076(vrTechnicalSpec_XMYPart2.getXMY0076());
		vrTechnicalSpec_XMYPart2Impl.setXMY0077(vrTechnicalSpec_XMYPart2.getXMY0077());
		vrTechnicalSpec_XMYPart2Impl.setXMY0078(vrTechnicalSpec_XMYPart2.getXMY0078());
		vrTechnicalSpec_XMYPart2Impl.setXMY0079(vrTechnicalSpec_XMYPart2.getXMY0079());
		vrTechnicalSpec_XMYPart2Impl.setXMY0080(vrTechnicalSpec_XMYPart2.getXMY0080());
		vrTechnicalSpec_XMYPart2Impl.setXMY0081(vrTechnicalSpec_XMYPart2.getXMY0081());
		vrTechnicalSpec_XMYPart2Impl.setXMY0082(vrTechnicalSpec_XMYPart2.getXMY0082());
		vrTechnicalSpec_XMYPart2Impl.setXMY0083(vrTechnicalSpec_XMYPart2.getXMY0083());
		vrTechnicalSpec_XMYPart2Impl.setXMY0084(vrTechnicalSpec_XMYPart2.getXMY0084());
		vrTechnicalSpec_XMYPart2Impl.setXMY0085(vrTechnicalSpec_XMYPart2.getXMY0085());
		vrTechnicalSpec_XMYPart2Impl.setXMY0086(vrTechnicalSpec_XMYPart2.getXMY0086());
		vrTechnicalSpec_XMYPart2Impl.setXMY0087(vrTechnicalSpec_XMYPart2.getXMY0087());
		vrTechnicalSpec_XMYPart2Impl.setXMY0088(vrTechnicalSpec_XMYPart2.getXMY0088());
		vrTechnicalSpec_XMYPart2Impl.setXMY0089(vrTechnicalSpec_XMYPart2.getXMY0089());
		vrTechnicalSpec_XMYPart2Impl.setXMY0090(vrTechnicalSpec_XMYPart2.getXMY0090());
		vrTechnicalSpec_XMYPart2Impl.setXMY0091(vrTechnicalSpec_XMYPart2.getXMY0091());
		vrTechnicalSpec_XMYPart2Impl.setXMY0092(vrTechnicalSpec_XMYPart2.getXMY0092());
		vrTechnicalSpec_XMYPart2Impl.setXMY0093(vrTechnicalSpec_XMYPart2.getXMY0093());
		vrTechnicalSpec_XMYPart2Impl.setXMY0094(vrTechnicalSpec_XMYPart2.getXMY0094());
		vrTechnicalSpec_XMYPart2Impl.setXMY0095(vrTechnicalSpec_XMYPart2.getXMY0095());
		vrTechnicalSpec_XMYPart2Impl.setXMY0096(vrTechnicalSpec_XMYPart2.getXMY0096());
		vrTechnicalSpec_XMYPart2Impl.setXMY0097(vrTechnicalSpec_XMYPart2.getXMY0097());
		vrTechnicalSpec_XMYPart2Impl.setXMY0098(vrTechnicalSpec_XMYPart2.getXMY0098());
		vrTechnicalSpec_XMYPart2Impl.setXMY0099(vrTechnicalSpec_XMYPart2.getXMY0099());
		vrTechnicalSpec_XMYPart2Impl.setXMY0100(vrTechnicalSpec_XMYPart2.getXMY0100());
		vrTechnicalSpec_XMYPart2Impl.setXMY0101(vrTechnicalSpec_XMYPart2.getXMY0101());
		vrTechnicalSpec_XMYPart2Impl.setXMY0102(vrTechnicalSpec_XMYPart2.getXMY0102());
		vrTechnicalSpec_XMYPart2Impl.setXMY0103(vrTechnicalSpec_XMYPart2.getXMY0103());
		vrTechnicalSpec_XMYPart2Impl.setXMY0104(vrTechnicalSpec_XMYPart2.getXMY0104());
		vrTechnicalSpec_XMYPart2Impl.setXMY0105(vrTechnicalSpec_XMYPart2.getXMY0105());
		vrTechnicalSpec_XMYPart2Impl.setXMY0106(vrTechnicalSpec_XMYPart2.getXMY0106());
		vrTechnicalSpec_XMYPart2Impl.setXMY0107(vrTechnicalSpec_XMYPart2.getXMY0107());
		vrTechnicalSpec_XMYPart2Impl.setXMY0108(vrTechnicalSpec_XMYPart2.getXMY0108());
		vrTechnicalSpec_XMYPart2Impl.setXMY0109(vrTechnicalSpec_XMYPart2.getXMY0109());
		vrTechnicalSpec_XMYPart2Impl.setXMY0110(vrTechnicalSpec_XMYPart2.getXMY0110());
		vrTechnicalSpec_XMYPart2Impl.setXMY0111(vrTechnicalSpec_XMYPart2.getXMY0111());
		vrTechnicalSpec_XMYPart2Impl.setXMY0112(vrTechnicalSpec_XMYPart2.getXMY0112());
		vrTechnicalSpec_XMYPart2Impl.setXMY0113(vrTechnicalSpec_XMYPart2.getXMY0113());
		vrTechnicalSpec_XMYPart2Impl.setXMY0114(vrTechnicalSpec_XMYPart2.getXMY0114());
		vrTechnicalSpec_XMYPart2Impl.setXMY0115(vrTechnicalSpec_XMYPart2.getXMY0115());
		vrTechnicalSpec_XMYPart2Impl.setXMY0116(vrTechnicalSpec_XMYPart2.getXMY0116());
		vrTechnicalSpec_XMYPart2Impl.setXMY0117(vrTechnicalSpec_XMYPart2.getXMY0117());
		vrTechnicalSpec_XMYPart2Impl.setXMY0118(vrTechnicalSpec_XMYPart2.getXMY0118());
		vrTechnicalSpec_XMYPart2Impl.setXMY0119(vrTechnicalSpec_XMYPart2.getXMY0119());
		vrTechnicalSpec_XMYPart2Impl.setXMY0120(vrTechnicalSpec_XMYPart2.getXMY0120());
		vrTechnicalSpec_XMYPart2Impl.setXMY0121(vrTechnicalSpec_XMYPart2.getXMY0121());
		vrTechnicalSpec_XMYPart2Impl.setXMY0122(vrTechnicalSpec_XMYPart2.getXMY0122());
		vrTechnicalSpec_XMYPart2Impl.setXMY0123(vrTechnicalSpec_XMYPart2.getXMY0123());
		vrTechnicalSpec_XMYPart2Impl.setXMY0124(vrTechnicalSpec_XMYPart2.getXMY0124());
		vrTechnicalSpec_XMYPart2Impl.setXMY0125(vrTechnicalSpec_XMYPart2.getXMY0125());
		vrTechnicalSpec_XMYPart2Impl.setXMY0126(vrTechnicalSpec_XMYPart2.getXMY0126());
		vrTechnicalSpec_XMYPart2Impl.setXMY0127(vrTechnicalSpec_XMYPart2.getXMY0127());
		vrTechnicalSpec_XMYPart2Impl.setXMY0128(vrTechnicalSpec_XMYPart2.getXMY0128());
		vrTechnicalSpec_XMYPart2Impl.setXMY0129(vrTechnicalSpec_XMYPart2.getXMY0129());
		vrTechnicalSpec_XMYPart2Impl.setXMY0130(vrTechnicalSpec_XMYPart2.getXMY0130());
		vrTechnicalSpec_XMYPart2Impl.setXMY0131(vrTechnicalSpec_XMYPart2.getXMY0131());
		vrTechnicalSpec_XMYPart2Impl.setXMY0132(vrTechnicalSpec_XMYPart2.getXMY0132());
		vrTechnicalSpec_XMYPart2Impl.setXMY0133(vrTechnicalSpec_XMYPart2.getXMY0133());
		vrTechnicalSpec_XMYPart2Impl.setXMY0134(vrTechnicalSpec_XMYPart2.getXMY0134());
		vrTechnicalSpec_XMYPart2Impl.setXMY0135(vrTechnicalSpec_XMYPart2.getXMY0135());
		vrTechnicalSpec_XMYPart2Impl.setXMY0136(vrTechnicalSpec_XMYPart2.getXMY0136());
		vrTechnicalSpec_XMYPart2Impl.setXMY0137(vrTechnicalSpec_XMYPart2.getXMY0137());
		vrTechnicalSpec_XMYPart2Impl.setXMY0138(vrTechnicalSpec_XMYPart2.getXMY0138());
		vrTechnicalSpec_XMYPart2Impl.setXMY0139(vrTechnicalSpec_XMYPart2.getXMY0139());
		vrTechnicalSpec_XMYPart2Impl.setXMY0140(vrTechnicalSpec_XMYPart2.getXMY0140());
		vrTechnicalSpec_XMYPart2Impl.setXMY0141(vrTechnicalSpec_XMYPart2.getXMY0141());
		vrTechnicalSpec_XMYPart2Impl.setXMY0142(vrTechnicalSpec_XMYPart2.getXMY0142());
		vrTechnicalSpec_XMYPart2Impl.setXMY0143(vrTechnicalSpec_XMYPart2.getXMY0143());
		vrTechnicalSpec_XMYPart2Impl.setXMY0144(vrTechnicalSpec_XMYPart2.getXMY0144());
		vrTechnicalSpec_XMYPart2Impl.setXMY0145(vrTechnicalSpec_XMYPart2.getXMY0145());
		vrTechnicalSpec_XMYPart2Impl.setXMY0146(vrTechnicalSpec_XMYPart2.getXMY0146());
		vrTechnicalSpec_XMYPart2Impl.setXMY0147(vrTechnicalSpec_XMYPart2.getXMY0147());
		vrTechnicalSpec_XMYPart2Impl.setXMY0148(vrTechnicalSpec_XMYPart2.getXMY0148());
		vrTechnicalSpec_XMYPart2Impl.setModifyDate(vrTechnicalSpec_XMYPart2.getModifyDate());
		vrTechnicalSpec_XMYPart2Impl.setSyncDate(vrTechnicalSpec_XMYPart2.getSyncDate());

		return vrTechnicalSpec_XMYPart2Impl;
	}

	/**
	 * Returns the vr technical spec_xmy part2 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XMYPart2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XMYPart2Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XMYPart2;
	}

	/**
	 * Returns the vr technical spec_xmy part2 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XMYPart2Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2
	 * @throws NoSuchVRTechnicalSpec_XMYPart2Exception if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XMYPart2Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xmy part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2, or <code>null</code> if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XMYPart2Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = (VRTechnicalSpec_XMYPart2)serializable;

		if (vrTechnicalSpec_XMYPart2 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XMYPart2 = (VRTechnicalSpec_XMYPart2)session.get(VRTechnicalSpec_XMYPart2Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XMYPart2 != null) {
					cacheResult(vrTechnicalSpec_XMYPart2);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XMYPart2Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart2Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XMYPart2;
	}

	/**
	 * Returns the vr technical spec_xmy part2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xmy part2
	 * @return the vr technical spec_xmy part2, or <code>null</code> if a vr technical spec_xmy part2 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XMYPart2 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XMYPart2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XMYPart2> map = new HashMap<Serializable, VRTechnicalSpec_XMYPart2>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XMYPart2 != null) {
				map.put(primaryKey, vrTechnicalSpec_XMYPart2);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart2Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XMYPart2)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : (List<VRTechnicalSpec_XMYPart2>)q.list()) {
				map.put(vrTechnicalSpec_XMYPart2.getPrimaryKeyObj(),
					vrTechnicalSpec_XMYPart2);

				cacheResult(vrTechnicalSpec_XMYPart2);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XMYPart2.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XMYPart2ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XMYPart2Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xmy part2s.
	 *
	 * @return the vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xmy part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @return the range of vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xmy part2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XMYPart2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xmy part2s
	 * @param end the upper bound of the range of vr technical spec_xmy part2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xmy part2s
	 */
	@Override
	public List<VRTechnicalSpec_XMYPart2> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XMYPart2> orderByComparator,
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

		List<VRTechnicalSpec_XMYPart2> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XMYPart2>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XMYPART2);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XMYPART2;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XMYPart2ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XMYPart2>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xmy part2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 : findAll()) {
			remove(vrTechnicalSpec_XMYPart2);
		}
	}

	/**
	 * Returns the number of vr technical spec_xmy part2s.
	 *
	 * @return the number of vr technical spec_xmy part2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XMYPART2);

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
		return VRTechnicalSpec_XMYPart2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xmy part2 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XMYPart2Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART2 = "SELECT vrTechnicalSpec_XMYPart2 FROM VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XMYPart2 FROM VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XMYPART2_WHERE = "SELECT vrTechnicalSpec_XMYPart2 FROM VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XMYPART2 = "SELECT COUNT(vrTechnicalSpec_XMYPart2) FROM VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XMYPART2_WHERE = "SELECT COUNT(vrTechnicalSpec_XMYPart2) FROM VRTechnicalSpec_XMYPart2 vrTechnicalSpec_XMYPart2 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XMYPart2.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XMYPart2 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XMYPart2 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XMYPart2PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}