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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGPart4Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart4;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart4Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart4ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart4Persistence;

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
 * The persistence implementation for the vr technical spec_xcg part4 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart4Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart4Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart4PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCGPart4>
	implements VRTechnicalSpec_XCGPart4Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCGPart4Util} to access the vr technical spec_xcg part4 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCGPart4Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCGPart4.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCGPart4.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCGPart4 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCGPart4.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCGPart4.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCGPart4.dossierNo IS NULL OR vrTechnicalSpec_XCGPart4.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCGPart4.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCGPart4.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart4 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCGPart4.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCGPart4.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCGPart4.dossierIdCTN IS NULL OR vrTechnicalSpec_XCGPart4.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCGPart4.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, deliverableCode,
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

	protected VRTechnicalSpec_XCGPart4 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
		"vrTechnicalSpec_XCGPart4.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCGPart4.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCGPart4.deliverableCode IS NULL OR vrTechnicalSpec_XCGPart4.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart4.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCGPart4.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCGPart4 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart4.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCGPart4.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart4.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart4 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart4.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCGPart4.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, convertAssembleId,
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

	protected VRTechnicalSpec_XCGPart4 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
		"vrTechnicalSpec_XCGPart4.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCGPart4.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart4 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCGPart4.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCGPart4.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCGPart4.referenceUid IS NULL OR vrTechnicalSpec_XCGPart4.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart4ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart4ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCGPart4.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part4 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part4 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		List<VRTechnicalSpec_XCGPart4> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart4 != null) {
			return vrTechnicalSpec_XCGPart4;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart4Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part4 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part4, or <code>null</code> if a matching vr technical spec_xcg part4 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart4> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part4s before and after the current vr technical spec_xcg part4 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part4
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4[] array = new VRTechnicalSpec_XCGPart4Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart4;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart4, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCGPart4 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart4);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart4> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xcg part4s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE);

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
		"vrTechnicalSpec_XCGPart4.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCGPart4PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCGPart4.class);
	}

	/**
	 * Caches the vr technical spec_xcg part4 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart4 the vr technical spec_xcg part4
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		entityCache.putResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			vrTechnicalSpec_XCGPart4.getPrimaryKey(), vrTechnicalSpec_XCGPart4);

		vrTechnicalSpec_XCGPart4.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcg part4s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart4s the vr technical spec_xcg part4s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCGPart4> vrTechnicalSpec_XCGPart4s) {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : vrTechnicalSpec_XCGPart4s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart4Impl.class,
						vrTechnicalSpec_XCGPart4.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCGPart4);
			}
			else {
				vrTechnicalSpec_XCGPart4.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcg part4s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCGPart4Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcg part4.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		entityCache.removeResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			vrTechnicalSpec_XCGPart4.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCGPart4> vrTechnicalSpec_XCGPart4s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : vrTechnicalSpec_XCGPart4s) {
			entityCache.removeResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart4Impl.class,
				vrTechnicalSpec_XCGPart4.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcg part4 with the primary key. Does not add the vr technical spec_xcg part4 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcg part4
	 * @return the new vr technical spec_xcg part4
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 create(long id) {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = new VRTechnicalSpec_XCGPart4Impl();

		vrTechnicalSpec_XCGPart4.setNew(true);
		vrTechnicalSpec_XCGPart4.setPrimaryKey(id);

		return vrTechnicalSpec_XCGPart4;
	}

	/**
	 * Removes the vr technical spec_xcg part4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 remove(long id)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcg part4 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = (VRTechnicalSpec_XCGPart4)session.get(VRTechnicalSpec_XCGPart4Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCGPart4 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCGPart4Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCGPart4);
		}
		catch (NoSuchVRTechnicalSpec_XCGPart4Exception nsee) {
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
	protected VRTechnicalSpec_XCGPart4 removeImpl(
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		vrTechnicalSpec_XCGPart4 = toUnwrappedModel(vrTechnicalSpec_XCGPart4);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCGPart4)) {
				vrTechnicalSpec_XCGPart4 = (VRTechnicalSpec_XCGPart4)session.get(VRTechnicalSpec_XCGPart4Impl.class,
						vrTechnicalSpec_XCGPart4.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCGPart4 != null) {
				session.delete(vrTechnicalSpec_XCGPart4);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCGPart4 != null) {
			clearCache(vrTechnicalSpec_XCGPart4);
		}

		return vrTechnicalSpec_XCGPart4;
	}

	@Override
	public VRTechnicalSpec_XCGPart4 updateImpl(
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		vrTechnicalSpec_XCGPart4 = toUnwrappedModel(vrTechnicalSpec_XCGPart4);

		boolean isNew = vrTechnicalSpec_XCGPart4.isNew();

		VRTechnicalSpec_XCGPart4ModelImpl vrTechnicalSpec_XCGPart4ModelImpl = (VRTechnicalSpec_XCGPart4ModelImpl)vrTechnicalSpec_XCGPart4;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCGPart4.isNew()) {
				session.save(vrTechnicalSpec_XCGPart4);

				vrTechnicalSpec_XCGPart4.setNew(false);
			}
			else {
				vrTechnicalSpec_XCGPart4 = (VRTechnicalSpec_XCGPart4)session.merge(vrTechnicalSpec_XCGPart4);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCGPart4ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCGPart4ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getDossierId(),
						vrTechnicalSpec_XCGPart4ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart4ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart4ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart4Impl.class,
			vrTechnicalSpec_XCGPart4.getPrimaryKey(), vrTechnicalSpec_XCGPart4,
			false);

		vrTechnicalSpec_XCGPart4.resetOriginalValues();

		return vrTechnicalSpec_XCGPart4;
	}

	protected VRTechnicalSpec_XCGPart4 toUnwrappedModel(
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4) {
		if (vrTechnicalSpec_XCGPart4 instanceof VRTechnicalSpec_XCGPart4Impl) {
			return vrTechnicalSpec_XCGPart4;
		}

		VRTechnicalSpec_XCGPart4Impl vrTechnicalSpec_XCGPart4Impl = new VRTechnicalSpec_XCGPart4Impl();

		vrTechnicalSpec_XCGPart4Impl.setNew(vrTechnicalSpec_XCGPart4.isNew());
		vrTechnicalSpec_XCGPart4Impl.setPrimaryKey(vrTechnicalSpec_XCGPart4.getPrimaryKey());

		vrTechnicalSpec_XCGPart4Impl.setId(vrTechnicalSpec_XCGPart4.getId());
		vrTechnicalSpec_XCGPart4Impl.setMtCore(vrTechnicalSpec_XCGPart4.getMtCore());
		vrTechnicalSpec_XCGPart4Impl.setConvertAssembleId(vrTechnicalSpec_XCGPart4.getConvertAssembleId());
		vrTechnicalSpec_XCGPart4Impl.setDossierId(vrTechnicalSpec_XCGPart4.getDossierId());
		vrTechnicalSpec_XCGPart4Impl.setDossierNo(vrTechnicalSpec_XCGPart4.getDossierNo());
		vrTechnicalSpec_XCGPart4Impl.setReferenceUid(vrTechnicalSpec_XCGPart4.getReferenceUid());
		vrTechnicalSpec_XCGPart4Impl.setDossierIdCTN(vrTechnicalSpec_XCGPart4.getDossierIdCTN());
		vrTechnicalSpec_XCGPart4Impl.setDeliverableCode(vrTechnicalSpec_XCGPart4.getDeliverableCode());
		vrTechnicalSpec_XCGPart4Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCGPart4.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCGPart4Impl.setXCG01496(vrTechnicalSpec_XCGPart4.getXCG01496());
		vrTechnicalSpec_XCGPart4Impl.setXCG01497(vrTechnicalSpec_XCGPart4.getXCG01497());
		vrTechnicalSpec_XCGPart4Impl.setXCG01498(vrTechnicalSpec_XCGPart4.getXCG01498());
		vrTechnicalSpec_XCGPart4Impl.setXCG01499(vrTechnicalSpec_XCGPart4.getXCG01499());
		vrTechnicalSpec_XCGPart4Impl.setXCG01500(vrTechnicalSpec_XCGPart4.getXCG01500());
		vrTechnicalSpec_XCGPart4Impl.setXCG01501(vrTechnicalSpec_XCGPart4.getXCG01501());
		vrTechnicalSpec_XCGPart4Impl.setXCG01502(vrTechnicalSpec_XCGPart4.getXCG01502());
		vrTechnicalSpec_XCGPart4Impl.setXCG01503(vrTechnicalSpec_XCGPart4.getXCG01503());
		vrTechnicalSpec_XCGPart4Impl.setXCG01504(vrTechnicalSpec_XCGPart4.getXCG01504());
		vrTechnicalSpec_XCGPart4Impl.setXCG01505(vrTechnicalSpec_XCGPart4.getXCG01505());
		vrTechnicalSpec_XCGPart4Impl.setXCG01506(vrTechnicalSpec_XCGPart4.getXCG01506());
		vrTechnicalSpec_XCGPart4Impl.setXCG01507(vrTechnicalSpec_XCGPart4.getXCG01507());
		vrTechnicalSpec_XCGPart4Impl.setXCG01508(vrTechnicalSpec_XCGPart4.getXCG01508());
		vrTechnicalSpec_XCGPart4Impl.setXCG01509(vrTechnicalSpec_XCGPart4.getXCG01509());
		vrTechnicalSpec_XCGPart4Impl.setXCG01510(vrTechnicalSpec_XCGPart4.getXCG01510());
		vrTechnicalSpec_XCGPart4Impl.setXCG01512(vrTechnicalSpec_XCGPart4.getXCG01512());
		vrTechnicalSpec_XCGPart4Impl.setXCG01513(vrTechnicalSpec_XCGPart4.getXCG01513());
		vrTechnicalSpec_XCGPart4Impl.setXCG01514(vrTechnicalSpec_XCGPart4.getXCG01514());
		vrTechnicalSpec_XCGPart4Impl.setXCG01515(vrTechnicalSpec_XCGPart4.getXCG01515());
		vrTechnicalSpec_XCGPart4Impl.setXCG01516(vrTechnicalSpec_XCGPart4.getXCG01516());
		vrTechnicalSpec_XCGPart4Impl.setXCG01517(vrTechnicalSpec_XCGPart4.getXCG01517());
		vrTechnicalSpec_XCGPart4Impl.setXCG01518(vrTechnicalSpec_XCGPart4.getXCG01518());
		vrTechnicalSpec_XCGPart4Impl.setXCG01519(vrTechnicalSpec_XCGPart4.getXCG01519());
		vrTechnicalSpec_XCGPart4Impl.setXCG01520(vrTechnicalSpec_XCGPart4.getXCG01520());
		vrTechnicalSpec_XCGPart4Impl.setXCG01521(vrTechnicalSpec_XCGPart4.getXCG01521());
		vrTechnicalSpec_XCGPart4Impl.setXCG01522(vrTechnicalSpec_XCGPart4.getXCG01522());
		vrTechnicalSpec_XCGPart4Impl.setXCG01523(vrTechnicalSpec_XCGPart4.getXCG01523());
		vrTechnicalSpec_XCGPart4Impl.setXCG01524(vrTechnicalSpec_XCGPart4.getXCG01524());
		vrTechnicalSpec_XCGPart4Impl.setXCG01525(vrTechnicalSpec_XCGPart4.getXCG01525());
		vrTechnicalSpec_XCGPart4Impl.setXCG01526(vrTechnicalSpec_XCGPart4.getXCG01526());
		vrTechnicalSpec_XCGPart4Impl.setXCG01527(vrTechnicalSpec_XCGPart4.getXCG01527());
		vrTechnicalSpec_XCGPart4Impl.setXCG01528(vrTechnicalSpec_XCGPart4.getXCG01528());
		vrTechnicalSpec_XCGPart4Impl.setXCG01529(vrTechnicalSpec_XCGPart4.getXCG01529());
		vrTechnicalSpec_XCGPart4Impl.setXCG01530(vrTechnicalSpec_XCGPart4.getXCG01530());
		vrTechnicalSpec_XCGPart4Impl.setXCG01531(vrTechnicalSpec_XCGPart4.getXCG01531());
		vrTechnicalSpec_XCGPart4Impl.setXCG01904(vrTechnicalSpec_XCGPart4.getXCG01904());
		vrTechnicalSpec_XCGPart4Impl.setXCG01533(vrTechnicalSpec_XCGPart4.getXCG01533());
		vrTechnicalSpec_XCGPart4Impl.setXCG01905(vrTechnicalSpec_XCGPart4.getXCG01905());
		vrTechnicalSpec_XCGPart4Impl.setXCG01534(vrTechnicalSpec_XCGPart4.getXCG01534());
		vrTechnicalSpec_XCGPart4Impl.setXCG01906(vrTechnicalSpec_XCGPart4.getXCG01906());
		vrTechnicalSpec_XCGPart4Impl.setXCG01535(vrTechnicalSpec_XCGPart4.getXCG01535());
		vrTechnicalSpec_XCGPart4Impl.setXCG01907(vrTechnicalSpec_XCGPart4.getXCG01907());
		vrTechnicalSpec_XCGPart4Impl.setXCG01536(vrTechnicalSpec_XCGPart4.getXCG01536());
		vrTechnicalSpec_XCGPart4Impl.setXCG01908(vrTechnicalSpec_XCGPart4.getXCG01908());
		vrTechnicalSpec_XCGPart4Impl.setXCG01537(vrTechnicalSpec_XCGPart4.getXCG01537());
		vrTechnicalSpec_XCGPart4Impl.setXCG01909(vrTechnicalSpec_XCGPart4.getXCG01909());
		vrTechnicalSpec_XCGPart4Impl.setXCG01538(vrTechnicalSpec_XCGPart4.getXCG01538());
		vrTechnicalSpec_XCGPart4Impl.setXCG01910(vrTechnicalSpec_XCGPart4.getXCG01910());
		vrTechnicalSpec_XCGPart4Impl.setXCG01539(vrTechnicalSpec_XCGPart4.getXCG01539());
		vrTechnicalSpec_XCGPart4Impl.setXCG11535(vrTechnicalSpec_XCGPart4.getXCG11535());
		vrTechnicalSpec_XCGPart4Impl.setXCG01541(vrTechnicalSpec_XCGPart4.getXCG01541());
		vrTechnicalSpec_XCGPart4Impl.setXCG01542(vrTechnicalSpec_XCGPart4.getXCG01542());
		vrTechnicalSpec_XCGPart4Impl.setXCG01911(vrTechnicalSpec_XCGPart4.getXCG01911());
		vrTechnicalSpec_XCGPart4Impl.setXCG01543(vrTechnicalSpec_XCGPart4.getXCG01543());
		vrTechnicalSpec_XCGPart4Impl.setXCG01912(vrTechnicalSpec_XCGPart4.getXCG01912());
		vrTechnicalSpec_XCGPart4Impl.setXCG01544(vrTechnicalSpec_XCGPart4.getXCG01544());
		vrTechnicalSpec_XCGPart4Impl.setXCG01545(vrTechnicalSpec_XCGPart4.getXCG01545());
		vrTechnicalSpec_XCGPart4Impl.setXCG01546(vrTechnicalSpec_XCGPart4.getXCG01546());
		vrTechnicalSpec_XCGPart4Impl.setXCG01547(vrTechnicalSpec_XCGPart4.getXCG01547());
		vrTechnicalSpec_XCGPart4Impl.setXCG01548(vrTechnicalSpec_XCGPart4.getXCG01548());
		vrTechnicalSpec_XCGPart4Impl.setXCG01913(vrTechnicalSpec_XCGPart4.getXCG01913());
		vrTechnicalSpec_XCGPart4Impl.setXCG01549(vrTechnicalSpec_XCGPart4.getXCG01549());
		vrTechnicalSpec_XCGPart4Impl.setXCG01914(vrTechnicalSpec_XCGPart4.getXCG01914());
		vrTechnicalSpec_XCGPart4Impl.setXCG01550(vrTechnicalSpec_XCGPart4.getXCG01550());
		vrTechnicalSpec_XCGPart4Impl.setXCG01551(vrTechnicalSpec_XCGPart4.getXCG01551());
		vrTechnicalSpec_XCGPart4Impl.setXCG01552(vrTechnicalSpec_XCGPart4.getXCG01552());
		vrTechnicalSpec_XCGPart4Impl.setXCG01553(vrTechnicalSpec_XCGPart4.getXCG01553());
		vrTechnicalSpec_XCGPart4Impl.setXCG01554(vrTechnicalSpec_XCGPart4.getXCG01554());
		vrTechnicalSpec_XCGPart4Impl.setXCG01915(vrTechnicalSpec_XCGPart4.getXCG01915());
		vrTechnicalSpec_XCGPart4Impl.setXCG01555(vrTechnicalSpec_XCGPart4.getXCG01555());
		vrTechnicalSpec_XCGPart4Impl.setXCG01556(vrTechnicalSpec_XCGPart4.getXCG01556());
		vrTechnicalSpec_XCGPart4Impl.setXCG01557(vrTechnicalSpec_XCGPart4.getXCG01557());
		vrTechnicalSpec_XCGPart4Impl.setXCG01558(vrTechnicalSpec_XCGPart4.getXCG01558());
		vrTechnicalSpec_XCGPart4Impl.setXCG01559(vrTechnicalSpec_XCGPart4.getXCG01559());
		vrTechnicalSpec_XCGPart4Impl.setXCG01560(vrTechnicalSpec_XCGPart4.getXCG01560());
		vrTechnicalSpec_XCGPart4Impl.setXCG01561(vrTechnicalSpec_XCGPart4.getXCG01561());
		vrTechnicalSpec_XCGPart4Impl.setXCG01916(vrTechnicalSpec_XCGPart4.getXCG01916());
		vrTechnicalSpec_XCGPart4Impl.setXCG01562(vrTechnicalSpec_XCGPart4.getXCG01562());
		vrTechnicalSpec_XCGPart4Impl.setXCG01917(vrTechnicalSpec_XCGPart4.getXCG01917());
		vrTechnicalSpec_XCGPart4Impl.setXCG01563(vrTechnicalSpec_XCGPart4.getXCG01563());
		vrTechnicalSpec_XCGPart4Impl.setXCG01918(vrTechnicalSpec_XCGPart4.getXCG01918());
		vrTechnicalSpec_XCGPart4Impl.setXCG01564(vrTechnicalSpec_XCGPart4.getXCG01564());
		vrTechnicalSpec_XCGPart4Impl.setXCG01565(vrTechnicalSpec_XCGPart4.getXCG01565());
		vrTechnicalSpec_XCGPart4Impl.setXCG01566(vrTechnicalSpec_XCGPart4.getXCG01566());
		vrTechnicalSpec_XCGPart4Impl.setXCG01567(vrTechnicalSpec_XCGPart4.getXCG01567());
		vrTechnicalSpec_XCGPart4Impl.setXCG01568(vrTechnicalSpec_XCGPart4.getXCG01568());
		vrTechnicalSpec_XCGPart4Impl.setXCG01919(vrTechnicalSpec_XCGPart4.getXCG01919());
		vrTechnicalSpec_XCGPart4Impl.setXCG01569(vrTechnicalSpec_XCGPart4.getXCG01569());
		vrTechnicalSpec_XCGPart4Impl.setXCG01570(vrTechnicalSpec_XCGPart4.getXCG01570());
		vrTechnicalSpec_XCGPart4Impl.setXCG01571(vrTechnicalSpec_XCGPart4.getXCG01571());
		vrTechnicalSpec_XCGPart4Impl.setXCG01572(vrTechnicalSpec_XCGPart4.getXCG01572());
		vrTechnicalSpec_XCGPart4Impl.setXCG01920(vrTechnicalSpec_XCGPart4.getXCG01920());
		vrTechnicalSpec_XCGPart4Impl.setXCG01573(vrTechnicalSpec_XCGPart4.getXCG01573());
		vrTechnicalSpec_XCGPart4Impl.setXCG01921(vrTechnicalSpec_XCGPart4.getXCG01921());
		vrTechnicalSpec_XCGPart4Impl.setXCG01574(vrTechnicalSpec_XCGPart4.getXCG01574());
		vrTechnicalSpec_XCGPart4Impl.setXCG01922(vrTechnicalSpec_XCGPart4.getXCG01922());
		vrTechnicalSpec_XCGPart4Impl.setXCG01575(vrTechnicalSpec_XCGPart4.getXCG01575());
		vrTechnicalSpec_XCGPart4Impl.setXCG01576(vrTechnicalSpec_XCGPart4.getXCG01576());
		vrTechnicalSpec_XCGPart4Impl.setXCG01577(vrTechnicalSpec_XCGPart4.getXCG01577());
		vrTechnicalSpec_XCGPart4Impl.setXCG01578(vrTechnicalSpec_XCGPart4.getXCG01578());
		vrTechnicalSpec_XCGPart4Impl.setXCG01579(vrTechnicalSpec_XCGPart4.getXCG01579());
		vrTechnicalSpec_XCGPart4Impl.setXCG01580(vrTechnicalSpec_XCGPart4.getXCG01580());
		vrTechnicalSpec_XCGPart4Impl.setXCG01581(vrTechnicalSpec_XCGPart4.getXCG01581());
		vrTechnicalSpec_XCGPart4Impl.setXCG01582(vrTechnicalSpec_XCGPart4.getXCG01582());
		vrTechnicalSpec_XCGPart4Impl.setXCG01583(vrTechnicalSpec_XCGPart4.getXCG01583());
		vrTechnicalSpec_XCGPart4Impl.setXCG01584(vrTechnicalSpec_XCGPart4.getXCG01584());
		vrTechnicalSpec_XCGPart4Impl.setXCG01585(vrTechnicalSpec_XCGPart4.getXCG01585());
		vrTechnicalSpec_XCGPart4Impl.setXCG01586(vrTechnicalSpec_XCGPart4.getXCG01586());
		vrTechnicalSpec_XCGPart4Impl.setXCG01587(vrTechnicalSpec_XCGPart4.getXCG01587());
		vrTechnicalSpec_XCGPart4Impl.setXCG01588(vrTechnicalSpec_XCGPart4.getXCG01588());
		vrTechnicalSpec_XCGPart4Impl.setXCG01589(vrTechnicalSpec_XCGPart4.getXCG01589());
		vrTechnicalSpec_XCGPart4Impl.setXCG01590(vrTechnicalSpec_XCGPart4.getXCG01590());
		vrTechnicalSpec_XCGPart4Impl.setXCG01591(vrTechnicalSpec_XCGPart4.getXCG01591());
		vrTechnicalSpec_XCGPart4Impl.setXCG01592(vrTechnicalSpec_XCGPart4.getXCG01592());
		vrTechnicalSpec_XCGPart4Impl.setXCG01593(vrTechnicalSpec_XCGPart4.getXCG01593());
		vrTechnicalSpec_XCGPart4Impl.setXCG01594(vrTechnicalSpec_XCGPart4.getXCG01594());
		vrTechnicalSpec_XCGPart4Impl.setXCG01595(vrTechnicalSpec_XCGPart4.getXCG01595());
		vrTechnicalSpec_XCGPart4Impl.setXCG01596(vrTechnicalSpec_XCGPart4.getXCG01596());
		vrTechnicalSpec_XCGPart4Impl.setXCG01597(vrTechnicalSpec_XCGPart4.getXCG01597());
		vrTechnicalSpec_XCGPart4Impl.setModifyDate(vrTechnicalSpec_XCGPart4.getModifyDate());
		vrTechnicalSpec_XCGPart4Impl.setSyncDate(vrTechnicalSpec_XCGPart4.getSyncDate());

		return vrTechnicalSpec_XCGPart4Impl;
	}

	/**
	 * Returns the vr technical spec_xcg part4 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCGPart4 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCGPart4Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCGPart4;
	}

	/**
	 * Returns the vr technical spec_xcg part4 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGPart4Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4
	 * @throws NoSuchVRTechnicalSpec_XCGPart4Exception if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGPart4Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcg part4 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4, or <code>null</code> if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart4Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = (VRTechnicalSpec_XCGPart4)serializable;

		if (vrTechnicalSpec_XCGPart4 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCGPart4 = (VRTechnicalSpec_XCGPart4)session.get(VRTechnicalSpec_XCGPart4Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCGPart4 != null) {
					cacheResult(vrTechnicalSpec_XCGPart4);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart4Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart4Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCGPart4;
	}

	/**
	 * Returns the vr technical spec_xcg part4 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part4
	 * @return the vr technical spec_xcg part4, or <code>null</code> if a vr technical spec_xcg part4 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart4 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCGPart4> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCGPart4> map = new HashMap<Serializable, VRTechnicalSpec_XCGPart4>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCGPart4 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCGPart4);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart4Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCGPart4)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : (List<VRTechnicalSpec_XCGPart4>)q.list()) {
				map.put(vrTechnicalSpec_XCGPart4.getPrimaryKeyObj(),
					vrTechnicalSpec_XCGPart4);

				cacheResult(vrTechnicalSpec_XCGPart4);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCGPart4.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCGPart4ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart4Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcg part4s.
	 *
	 * @return the vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @return the range of vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part4s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart4ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part4s
	 * @param end the upper bound of the range of vr technical spec_xcg part4s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcg part4s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart4> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart4> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart4> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart4>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART4);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCGPART4;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCGPart4ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart4>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcg part4s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 : findAll()) {
			remove(vrTechnicalSpec_XCGPart4);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part4s.
	 *
	 * @return the number of vr technical spec_xcg part4s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCGPART4);

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
		return VRTechnicalSpec_XCGPart4ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcg part4 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCGPart4Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART4 = "SELECT vrTechnicalSpec_XCGPart4 FROM VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCGPart4 FROM VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART4_WHERE = "SELECT vrTechnicalSpec_XCGPart4 FROM VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART4 = "SELECT COUNT(vrTechnicalSpec_XCGPart4) FROM VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART4_WHERE = "SELECT COUNT(vrTechnicalSpec_XCGPart4) FROM VRTechnicalSpec_XCGPart4 vrTechnicalSpec_XCGPart4 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCGPart4.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCGPart4 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCGPart4 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGPart4PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}