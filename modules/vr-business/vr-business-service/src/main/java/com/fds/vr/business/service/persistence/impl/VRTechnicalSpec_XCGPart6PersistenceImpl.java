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

import com.fds.vr.business.exception.NoSuchVRTechnicalSpec_XCGPart6Exception;
import com.fds.vr.business.model.VRTechnicalSpec_XCGPart6;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart6Impl;
import com.fds.vr.business.model.impl.VRTechnicalSpec_XCGPart6ModelImpl;
import com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart6Persistence;

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
 * The persistence implementation for the vr technical spec_xcg part6 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGPart6Persistence
 * @see com.fds.vr.business.service.persistence.VRTechnicalSpec_XCGPart6Util
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGPart6PersistenceImpl extends BasePersistenceImpl<VRTechnicalSpec_XCGPart6>
	implements VRTechnicalSpec_XCGPart6Persistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link VRTechnicalSpec_XCGPart6Util} to access the vr technical spec_xcg part6 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = VRTechnicalSpec_XCGPart6Impl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierNo",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.DOSSIERNO_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERNO = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierNo",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierNo(String dossierNo,
		long mtCore) {
		return findByDossierNo(dossierNo, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierNo(String dossierNo,
		long mtCore, int start, int end) {
		return findByDossierNo(dossierNo, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByDossierNo(dossierNo, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierNo(String dossierNo,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if (!Objects.equals(dossierNo,
								vrTechnicalSpec_XCGPart6.getDossierNo()) ||
							(mtCore != vrTechnicalSpec_XCGPart6.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierNo_First(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierNo_First(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByDossierNo(dossierNo,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierNo_Last(dossierNo,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierNo=");
		msg.append(dossierNo);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierNo_Last(String dossierNo,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByDossierNo(dossierNo, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByDossierNo(dossierNo,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByDossierNo_PrevAndNext(long id,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierNo, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByDossierNo_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierNo, mtCore,
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

	protected VRTechnicalSpec_XCGPart6 getByDossierNo_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		String dossierNo, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierNo(String dossierNo, long mtCore) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByDossierNo(
				dossierNo, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where dossierNo = &#63; and mtCore = &#63;.
	 *
	 * @param dossierNo the dossier no
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByDossierNo(String dossierNo, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERNO;

		Object[] finderArgs = new Object[] { dossierNo, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_1 = "vrTechnicalSpec_XCGPart6.dossierNo IS NULL AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_2 = "vrTechnicalSpec_XCGPart6.dossierNo = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_DOSSIERNO_3 = "(vrTechnicalSpec_XCGPart6.dossierNo IS NULL OR vrTechnicalSpec_XCGPart6.dossierNo = '') AND ";
	private static final String _FINDER_COLUMN_DOSSIERNO_MTCORE_2 = "vrTechnicalSpec_XCGPart6.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierIdCTN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierIdCTN",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.DOSSIERIDCTN_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDCTN = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierIdCTN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierIdCTN(
		String dossierIdCTN) {
		return findByDossierIdCTN(dossierIdCTN, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierIdCTN(
		String dossierIdCTN, int start, int end) {
		return findByDossierIdCTN(dossierIdCTN, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByDossierIdCTN(dossierIdCTN, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierIdCTN = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierIdCTN(
		String dossierIdCTN, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if (!Objects.equals(dossierIdCTN,
								vrTechnicalSpec_XCGPart6.getDossierIdCTN())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierIdCTN_First(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierIdCTN_First(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByDossierIdCTN(dossierIdCTN,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierIdCTN_Last(dossierIdCTN,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierIdCTN=");
		msg.append(dossierIdCTN);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierIdCTN_Last(
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByDossierIdCTN(dossierIdCTN);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByDossierIdCTN(dossierIdCTN,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where dossierIdCTN = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param dossierIdCTN the dossier ID ctn
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByDossierIdCTN_PrevAndNext(long id,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierIdCTN, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByDossierIdCTN_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierIdCTN, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart6 getByDossierIdCTN_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		String dossierIdCTN,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where dossierIdCTN = &#63; from the database.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 */
	@Override
	public void removeByDossierIdCTN(String dossierIdCTN) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByDossierIdCTN(
				dossierIdCTN, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where dossierIdCTN = &#63;.
	 *
	 * @param dossierIdCTN the dossier ID ctn
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByDossierIdCTN(String dossierIdCTN) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDCTN;

		Object[] finderArgs = new Object[] { dossierIdCTN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_1 = "vrTechnicalSpec_XCGPart6.dossierIdCTN IS NULL";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_2 = "vrTechnicalSpec_XCGPart6.dossierIdCTN = ?";
	private static final String _FINDER_COLUMN_DOSSIERIDCTN_DOSSIERIDCTN_3 = "(vrTechnicalSpec_XCGPart6.dossierIdCTN IS NULL OR vrTechnicalSpec_XCGPart6.dossierIdCTN = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeliverableCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeliverableCode",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.DELIVERABLECODE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELIVERABLECODE = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDeliverableCode", new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDeliverableCode(
		String deliverableCode) {
		return findByDeliverableCode(deliverableCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDeliverableCode(
		String deliverableCode, int start, int end) {
		return findByDeliverableCode(deliverableCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByDeliverableCode(deliverableCode, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where deliverableCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param deliverableCode the deliverable code
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDeliverableCode(
		String deliverableCode, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if (!Objects.equals(deliverableCode,
								vrTechnicalSpec_XCGPart6.getDeliverableCode())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDeliverableCode_First(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDeliverableCode_First(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByDeliverableCode(deliverableCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDeliverableCode_Last(deliverableCode,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deliverableCode=");
		msg.append(deliverableCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDeliverableCode_Last(
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByDeliverableCode(deliverableCode);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByDeliverableCode(deliverableCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where deliverableCode = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param deliverableCode the deliverable code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByDeliverableCode_PrevAndNext(
		long id, String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, deliverableCode,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByDeliverableCode_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, deliverableCode,
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

	protected VRTechnicalSpec_XCGPart6 getByDeliverableCode_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		String deliverableCode,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where deliverableCode = &#63; from the database.
	 *
	 * @param deliverableCode the deliverable code
	 */
	@Override
	public void removeByDeliverableCode(String deliverableCode) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByDeliverableCode(
				deliverableCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where deliverableCode = &#63;.
	 *
	 * @param deliverableCode the deliverable code
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByDeliverableCode(String deliverableCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELIVERABLECODE;

		Object[] finderArgs = new Object[] { deliverableCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
		"vrTechnicalSpec_XCGPart6.deliverableCode IS NULL";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_2 =
		"vrTechnicalSpec_XCGPart6.deliverableCode = ?";
	private static final String _FINDER_COLUMN_DELIVERABLECODE_DELIVERABLECODE_3 =
		"(vrTechnicalSpec_XCGPart6.deliverableCode IS NULL OR vrTechnicalSpec_XCGPart6.deliverableCode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MTCORE_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierId(long dossierId,
		long mtCore) {
		return findByDossierId(dossierId, mtCore, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierId(long dossierId,
		long mtCore, int start, int end) {
		return findByDossierId(dossierId, mtCore, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByDossierId(dossierId, mtCore, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByDossierId(long dossierId,
		long mtCore, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart6.getDossierId()) ||
							(mtCore != vrTechnicalSpec_XCGPart6.getMtCore())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERID_MTCORE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierId_First(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierId_First(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByDossierId(dossierId,
				mtCore, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByDossierId_Last(dossierId,
				mtCore, orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", mtCore=");
		msg.append(mtCore);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByDossierId_Last(long dossierId,
		long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByDossierId(dossierId, mtCore);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByDossierId(dossierId,
				mtCore, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByDossierId_PrevAndNext(long id,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierId, mtCore,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByDossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierId, mtCore,
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

	protected VRTechnicalSpec_XCGPart6 getByDossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		long dossierId, long mtCore,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(mtCore);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 */
	@Override
	public void removeByDossierId(long dossierId, long mtCore) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByDossierId(
				dossierId, mtCore, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where dossierId = &#63; and mtCore = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param mtCore the mt core
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByDossierId(long dossierId, long mtCore) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId, mtCore };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart6.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERID_MTCORE_2 = "vrTechnicalSpec_XCGPart6.mtCore = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBy_DossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBy_DossierId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.DOSSIERID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY__DOSSIERID = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBy_DossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findBy_DossierId(long dossierId) {
		return findBy_DossierId(dossierId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findBy_DossierId(long dossierId,
		int start, int end) {
		return findBy_DossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findBy_DossierId(dossierId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findBy_DossierId(long dossierId,
		int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if ((dossierId != vrTechnicalSpec_XCGPart6.getDossierId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

			query.append(_FINDER_COLUMN__DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchBy_DossierId_First(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchBy_DossierId_First(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findBy_DossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchBy_DossierId_Last(dossierId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchBy_DossierId_Last(long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countBy_DossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findBy_DossierId(dossierId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findBy_DossierId_PrevAndNext(long id,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierId, orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getBy_DossierId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, dossierId, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart6 getBy_DossierId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		long dossierId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 */
	@Override
	public void removeBy_DossierId(long dossierId) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findBy_DossierId(
				dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countBy_DossierId(long dossierId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY__DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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

	private static final String _FINDER_COLUMN__DOSSIERID_DOSSIERID_2 = "vrTechnicalSpec_XCGPart6.dossierId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConvertAssembleId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConvertAssembleId", new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.CONVERTASSEMBLEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConvertAssembleId", new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByConvertAssembleId(
		long convertAssembleId) {
		return findByConvertAssembleId(convertAssembleId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByConvertAssembleId(
		long convertAssembleId, int start, int end) {
		return findByConvertAssembleId(convertAssembleId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByConvertAssembleId(convertAssembleId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where convertAssembleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByConvertAssembleId(
		long convertAssembleId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if ((convertAssembleId != vrTechnicalSpec_XCGPart6.getConvertAssembleId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

			query.append(_FINDER_COLUMN_CONVERTASSEMBLEID_CONVERTASSEMBLEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(convertAssembleId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByConvertAssembleId_First(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByConvertAssembleId_First(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByConvertAssembleId(convertAssembleId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByConvertAssembleId_Last(convertAssembleId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("convertAssembleId=");
		msg.append(convertAssembleId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByConvertAssembleId_Last(
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByConvertAssembleId(convertAssembleId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByConvertAssembleId(convertAssembleId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where convertAssembleId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param convertAssembleId the convert assemble ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByConvertAssembleId_PrevAndNext(
		long id, long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, convertAssembleId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByConvertAssembleId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, convertAssembleId,
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

	protected VRTechnicalSpec_XCGPart6 getByConvertAssembleId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		long convertAssembleId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(convertAssembleId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where convertAssembleId = &#63; from the database.
	 *
	 * @param convertAssembleId the convert assemble ID
	 */
	@Override
	public void removeByConvertAssembleId(long convertAssembleId) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByConvertAssembleId(
				convertAssembleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where convertAssembleId = &#63;.
	 *
	 * @param convertAssembleId the convert assemble ID
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByConvertAssembleId(long convertAssembleId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID;

		Object[] finderArgs = new Object[] { convertAssembleId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
		"vrTechnicalSpec_XCGPart6.convertAssembleId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByReferenceUid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByReferenceUid",
			new String[] { String.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.REFERENCEUID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REFERENCEUID = new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByReferenceUid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByReferenceUid(
		String referenceUid) {
		return findByReferenceUid(referenceUid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByReferenceUid(
		String referenceUid, int start, int end) {
		return findByReferenceUid(referenceUid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByReferenceUid(referenceUid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where referenceUid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param referenceUid the reference uid
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByReferenceUid(
		String referenceUid, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if (!Objects.equals(referenceUid,
								vrTechnicalSpec_XCGPart6.getReferenceUid())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByReferenceUid_First(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByReferenceUid_First(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByReferenceUid(referenceUid,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByReferenceUid_Last(referenceUid,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("referenceUid=");
		msg.append(referenceUid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByReferenceUid_Last(
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByReferenceUid(referenceUid);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByReferenceUid(referenceUid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where referenceUid = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param referenceUid the reference uid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByReferenceUid_PrevAndNext(long id,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, referenceUid, orderByComparator,
					true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByReferenceUid_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, referenceUid, orderByComparator,
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

	protected VRTechnicalSpec_XCGPart6 getByReferenceUid_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		String referenceUid,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where referenceUid = &#63; from the database.
	 *
	 * @param referenceUid the reference uid
	 */
	@Override
	public void removeByReferenceUid(String referenceUid) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByReferenceUid(
				referenceUid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where referenceUid = &#63;.
	 *
	 * @param referenceUid the reference uid
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByReferenceUid(String referenceUid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REFERENCEUID;

		Object[] finderArgs = new Object[] { referenceUid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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

	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_1 = "vrTechnicalSpec_XCGPart6.referenceUid IS NULL";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_2 = "vrTechnicalSpec_XCGPart6.referenceUid = ?";
	private static final String _FINDER_COLUMN_REFERENCEUID_REFERENCEUID_3 = "(vrTechnicalSpec_XCGPart6.referenceUid IS NULL OR vrTechnicalSpec_XCGPart6.referenceUid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByvehicleTypeCertificateId",
			new String[] { Long.class.getName() },
			VRTechnicalSpec_XCGPart6ModelImpl.VEHICLETYPECERTIFICATEID_COLUMN_BITMASK |
			VRTechnicalSpec_XCGPart6ModelImpl.MODIFYDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID =
		new FinderPath(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6ModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByvehicleTypeCertificateId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findByvehicleTypeCertificateId(vehicleTypeCertificateId, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findByvehicleTypeCertificateId(
		long vehicleTypeCertificateId, int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : list) {
					if ((vehicleTypeCertificateId != vrTechnicalSpec_XCGPart6.getVehicleTypeCertificateId())) {
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

			query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

			query.append(_FINDER_COLUMN_VEHICLETYPECERTIFICATEID_VEHICLETYPECERTIFICATEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(vehicleTypeCertificateId);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Returns the first vr technical spec_xcg part6 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByvehicleTypeCertificateId_First(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the first vr technical spec_xcg part6 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByvehicleTypeCertificateId_First(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		List<VRTechnicalSpec_XCGPart6> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByvehicleTypeCertificateId_Last(vehicleTypeCertificateId,
				orderByComparator);

		if (vrTechnicalSpec_XCGPart6 != null) {
			return vrTechnicalSpec_XCGPart6;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("vehicleTypeCertificateId=");
		msg.append(vehicleTypeCertificateId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchVRTechnicalSpec_XCGPart6Exception(msg.toString());
	}

	/**
	 * Returns the last vr technical spec_xcg part6 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vr technical spec_xcg part6, or <code>null</code> if a matching vr technical spec_xcg part6 could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByvehicleTypeCertificateId_Last(
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		int count = countByvehicleTypeCertificateId(vehicleTypeCertificateId);

		if (count == 0) {
			return null;
		}

		List<VRTechnicalSpec_XCGPart6> list = findByvehicleTypeCertificateId(vehicleTypeCertificateId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vr technical spec_xcg part6s before and after the current vr technical spec_xcg part6 in the ordered set where vehicleTypeCertificateId = &#63;.
	 *
	 * @param id the primary key of the current vr technical spec_xcg part6
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6[] findByvehicleTypeCertificateId_PrevAndNext(
		long id, long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6[] array = new VRTechnicalSpec_XCGPart6Impl[3];

			array[0] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, vehicleTypeCertificateId,
					orderByComparator, true);

			array[1] = vrTechnicalSpec_XCGPart6;

			array[2] = getByvehicleTypeCertificateId_PrevAndNext(session,
					vrTechnicalSpec_XCGPart6, vehicleTypeCertificateId,
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

	protected VRTechnicalSpec_XCGPart6 getByvehicleTypeCertificateId_PrevAndNext(
		Session session, VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6,
		long vehicleTypeCertificateId,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
			query.append(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(vehicleTypeCertificateId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(vrTechnicalSpec_XCGPart6);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VRTechnicalSpec_XCGPart6> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63; from the database.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 */
	@Override
	public void removeByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findByvehicleTypeCertificateId(
				vehicleTypeCertificateId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s where vehicleTypeCertificateId = &#63;.
	 *
	 * @param vehicleTypeCertificateId the vehicle type certificate ID
	 * @return the number of matching vr technical spec_xcg part6s
	 */
	@Override
	public int countByvehicleTypeCertificateId(long vehicleTypeCertificateId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID;

		Object[] finderArgs = new Object[] { vehicleTypeCertificateId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE);

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
		"vrTechnicalSpec_XCGPart6.vehicleTypeCertificateId = ?";

	public VRTechnicalSpec_XCGPart6PersistenceImpl() {
		setModelClass(VRTechnicalSpec_XCGPart6.class);
	}

	/**
	 * Caches the vr technical spec_xcg part6 in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart6 the vr technical spec_xcg part6
	 */
	@Override
	public void cacheResult(VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		entityCache.putResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			vrTechnicalSpec_XCGPart6.getPrimaryKey(), vrTechnicalSpec_XCGPart6);

		vrTechnicalSpec_XCGPart6.resetOriginalValues();
	}

	/**
	 * Caches the vr technical spec_xcg part6s in the entity cache if it is enabled.
	 *
	 * @param vrTechnicalSpec_XCGPart6s the vr technical spec_xcg part6s
	 */
	@Override
	public void cacheResult(
		List<VRTechnicalSpec_XCGPart6> vrTechnicalSpec_XCGPart6s) {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : vrTechnicalSpec_XCGPart6s) {
			if (entityCache.getResult(
						VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart6Impl.class,
						vrTechnicalSpec_XCGPart6.getPrimaryKey()) == null) {
				cacheResult(vrTechnicalSpec_XCGPart6);
			}
			else {
				vrTechnicalSpec_XCGPart6.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all vr technical spec_xcg part6s.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VRTechnicalSpec_XCGPart6Impl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the vr technical spec_xcg part6.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		entityCache.removeResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			vrTechnicalSpec_XCGPart6.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<VRTechnicalSpec_XCGPart6> vrTechnicalSpec_XCGPart6s) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : vrTechnicalSpec_XCGPart6s) {
			entityCache.removeResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart6Impl.class,
				vrTechnicalSpec_XCGPart6.getPrimaryKey());
		}
	}

	/**
	 * Creates a new vr technical spec_xcg part6 with the primary key. Does not add the vr technical spec_xcg part6 to the database.
	 *
	 * @param id the primary key for the new vr technical spec_xcg part6
	 * @return the new vr technical spec_xcg part6
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 create(long id) {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = new VRTechnicalSpec_XCGPart6Impl();

		vrTechnicalSpec_XCGPart6.setNew(true);
		vrTechnicalSpec_XCGPart6.setPrimaryKey(id);

		return vrTechnicalSpec_XCGPart6;
	}

	/**
	 * Removes the vr technical spec_xcg part6 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 remove(long id)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		return remove((Serializable)id);
	}

	/**
	 * Removes the vr technical spec_xcg part6 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6 that was removed
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 remove(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		Session session = null;

		try {
			session = openSession();

			VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = (VRTechnicalSpec_XCGPart6)session.get(VRTechnicalSpec_XCGPart6Impl.class,
					primaryKey);

			if (vrTechnicalSpec_XCGPart6 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVRTechnicalSpec_XCGPart6Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(vrTechnicalSpec_XCGPart6);
		}
		catch (NoSuchVRTechnicalSpec_XCGPart6Exception nsee) {
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
	protected VRTechnicalSpec_XCGPart6 removeImpl(
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		vrTechnicalSpec_XCGPart6 = toUnwrappedModel(vrTechnicalSpec_XCGPart6);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vrTechnicalSpec_XCGPart6)) {
				vrTechnicalSpec_XCGPart6 = (VRTechnicalSpec_XCGPart6)session.get(VRTechnicalSpec_XCGPart6Impl.class,
						vrTechnicalSpec_XCGPart6.getPrimaryKeyObj());
			}

			if (vrTechnicalSpec_XCGPart6 != null) {
				session.delete(vrTechnicalSpec_XCGPart6);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (vrTechnicalSpec_XCGPart6 != null) {
			clearCache(vrTechnicalSpec_XCGPart6);
		}

		return vrTechnicalSpec_XCGPart6;
	}

	@Override
	public VRTechnicalSpec_XCGPart6 updateImpl(
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		vrTechnicalSpec_XCGPart6 = toUnwrappedModel(vrTechnicalSpec_XCGPart6);

		boolean isNew = vrTechnicalSpec_XCGPart6.isNew();

		VRTechnicalSpec_XCGPart6ModelImpl vrTechnicalSpec_XCGPart6ModelImpl = (VRTechnicalSpec_XCGPart6ModelImpl)vrTechnicalSpec_XCGPart6;

		Session session = null;

		try {
			session = openSession();

			if (vrTechnicalSpec_XCGPart6.isNew()) {
				session.save(vrTechnicalSpec_XCGPart6);

				vrTechnicalSpec_XCGPart6.setNew(false);
			}
			else {
				vrTechnicalSpec_XCGPart6 = (VRTechnicalSpec_XCGPart6)session.merge(vrTechnicalSpec_XCGPart6);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !VRTechnicalSpec_XCGPart6ModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalDossierNo(),
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getDossierNo(),
						vrTechnicalSpec_XCGPart6ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERNO,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getDossierIdCTN()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDCTN, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDCTN,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getDeliverableCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELIVERABLECODE,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELIVERABLECODE,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalDossierId(),
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getDossierId(),
						vrTechnicalSpec_XCGPart6ModelImpl.getMtCore()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getDossierId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY__DOSSIERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY__DOSSIERID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getConvertAssembleId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONVERTASSEMBLEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONVERTASSEMBLEID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getReferenceUid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REFERENCEUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REFERENCEUID,
					args);
			}

			if ((vrTechnicalSpec_XCGPart6ModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getOriginalVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);

				args = new Object[] {
						vrTechnicalSpec_XCGPart6ModelImpl.getVehicleTypeCertificateId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_VEHICLETYPECERTIFICATEID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VEHICLETYPECERTIFICATEID,
					args);
			}
		}

		entityCache.putResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
			VRTechnicalSpec_XCGPart6Impl.class,
			vrTechnicalSpec_XCGPart6.getPrimaryKey(), vrTechnicalSpec_XCGPart6,
			false);

		vrTechnicalSpec_XCGPart6.resetOriginalValues();

		return vrTechnicalSpec_XCGPart6;
	}

	protected VRTechnicalSpec_XCGPart6 toUnwrappedModel(
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6) {
		if (vrTechnicalSpec_XCGPart6 instanceof VRTechnicalSpec_XCGPart6Impl) {
			return vrTechnicalSpec_XCGPart6;
		}

		VRTechnicalSpec_XCGPart6Impl vrTechnicalSpec_XCGPart6Impl = new VRTechnicalSpec_XCGPart6Impl();

		vrTechnicalSpec_XCGPart6Impl.setNew(vrTechnicalSpec_XCGPart6.isNew());
		vrTechnicalSpec_XCGPart6Impl.setPrimaryKey(vrTechnicalSpec_XCGPart6.getPrimaryKey());

		vrTechnicalSpec_XCGPart6Impl.setId(vrTechnicalSpec_XCGPart6.getId());
		vrTechnicalSpec_XCGPart6Impl.setMtCore(vrTechnicalSpec_XCGPart6.getMtCore());
		vrTechnicalSpec_XCGPart6Impl.setConvertAssembleId(vrTechnicalSpec_XCGPart6.getConvertAssembleId());
		vrTechnicalSpec_XCGPart6Impl.setDossierId(vrTechnicalSpec_XCGPart6.getDossierId());
		vrTechnicalSpec_XCGPart6Impl.setDossierNo(vrTechnicalSpec_XCGPart6.getDossierNo());
		vrTechnicalSpec_XCGPart6Impl.setReferenceUid(vrTechnicalSpec_XCGPart6.getReferenceUid());
		vrTechnicalSpec_XCGPart6Impl.setDossierIdCTN(vrTechnicalSpec_XCGPart6.getDossierIdCTN());
		vrTechnicalSpec_XCGPart6Impl.setDeliverableCode(vrTechnicalSpec_XCGPart6.getDeliverableCode());
		vrTechnicalSpec_XCGPart6Impl.setVehicleTypeCertificateId(vrTechnicalSpec_XCGPart6.getVehicleTypeCertificateId());
		vrTechnicalSpec_XCGPart6Impl.setXCG01757(vrTechnicalSpec_XCGPart6.getXCG01757());
		vrTechnicalSpec_XCGPart6Impl.setXCG01758(vrTechnicalSpec_XCGPart6.getXCG01758());
		vrTechnicalSpec_XCGPart6Impl.setXCG01759(vrTechnicalSpec_XCGPart6.getXCG01759());
		vrTechnicalSpec_XCGPart6Impl.setXCG01948(vrTechnicalSpec_XCGPart6.getXCG01948());
		vrTechnicalSpec_XCGPart6Impl.setXCG01760(vrTechnicalSpec_XCGPart6.getXCG01760());
		vrTechnicalSpec_XCGPart6Impl.setXCG01949(vrTechnicalSpec_XCGPart6.getXCG01949());
		vrTechnicalSpec_XCGPart6Impl.setXCG01761(vrTechnicalSpec_XCGPart6.getXCG01761());
		vrTechnicalSpec_XCGPart6Impl.setXCG01950(vrTechnicalSpec_XCGPart6.getXCG01950());
		vrTechnicalSpec_XCGPart6Impl.setXCG01762(vrTechnicalSpec_XCGPart6.getXCG01762());
		vrTechnicalSpec_XCGPart6Impl.setXCG01951(vrTechnicalSpec_XCGPart6.getXCG01951());
		vrTechnicalSpec_XCGPart6Impl.setXCG01763(vrTechnicalSpec_XCGPart6.getXCG01763());
		vrTechnicalSpec_XCGPart6Impl.setXCG01952(vrTechnicalSpec_XCGPart6.getXCG01952());
		vrTechnicalSpec_XCGPart6Impl.setXCG01764(vrTechnicalSpec_XCGPart6.getXCG01764());
		vrTechnicalSpec_XCGPart6Impl.setXCG01953(vrTechnicalSpec_XCGPart6.getXCG01953());
		vrTechnicalSpec_XCGPart6Impl.setXCG01765(vrTechnicalSpec_XCGPart6.getXCG01765());
		vrTechnicalSpec_XCGPart6Impl.setXCG01954(vrTechnicalSpec_XCGPart6.getXCG01954());
		vrTechnicalSpec_XCGPart6Impl.setXCG01766(vrTechnicalSpec_XCGPart6.getXCG01766());
		vrTechnicalSpec_XCGPart6Impl.setXCG01955(vrTechnicalSpec_XCGPart6.getXCG01955());
		vrTechnicalSpec_XCGPart6Impl.setXCG01767(vrTechnicalSpec_XCGPart6.getXCG01767());
		vrTechnicalSpec_XCGPart6Impl.setXCG01956(vrTechnicalSpec_XCGPart6.getXCG01956());
		vrTechnicalSpec_XCGPart6Impl.setXCG01768(vrTechnicalSpec_XCGPart6.getXCG01768());
		vrTechnicalSpec_XCGPart6Impl.setXCG01957(vrTechnicalSpec_XCGPart6.getXCG01957());
		vrTechnicalSpec_XCGPart6Impl.setXCG01769(vrTechnicalSpec_XCGPart6.getXCG01769());
		vrTechnicalSpec_XCGPart6Impl.setXCG01958(vrTechnicalSpec_XCGPart6.getXCG01958());
		vrTechnicalSpec_XCGPart6Impl.setXCG01770(vrTechnicalSpec_XCGPart6.getXCG01770());
		vrTechnicalSpec_XCGPart6Impl.setXCG01771(vrTechnicalSpec_XCGPart6.getXCG01771());
		vrTechnicalSpec_XCGPart6Impl.setXCG01959(vrTechnicalSpec_XCGPart6.getXCG01959());
		vrTechnicalSpec_XCGPart6Impl.setXCG01772(vrTechnicalSpec_XCGPart6.getXCG01772());
		vrTechnicalSpec_XCGPart6Impl.setXCG01773(vrTechnicalSpec_XCGPart6.getXCG01773());
		vrTechnicalSpec_XCGPart6Impl.setXCG01774(vrTechnicalSpec_XCGPart6.getXCG01774());
		vrTechnicalSpec_XCGPart6Impl.setXCG01775(vrTechnicalSpec_XCGPart6.getXCG01775());
		vrTechnicalSpec_XCGPart6Impl.setXCG01776(vrTechnicalSpec_XCGPart6.getXCG01776());
		vrTechnicalSpec_XCGPart6Impl.setXCG01777(vrTechnicalSpec_XCGPart6.getXCG01777());
		vrTechnicalSpec_XCGPart6Impl.setXCG01778(vrTechnicalSpec_XCGPart6.getXCG01778());
		vrTechnicalSpec_XCGPart6Impl.setXCG01779(vrTechnicalSpec_XCGPart6.getXCG01779());
		vrTechnicalSpec_XCGPart6Impl.setXCG01780(vrTechnicalSpec_XCGPart6.getXCG01780());
		vrTechnicalSpec_XCGPart6Impl.setXCG01781(vrTechnicalSpec_XCGPart6.getXCG01781());
		vrTechnicalSpec_XCGPart6Impl.setXCG01783(vrTechnicalSpec_XCGPart6.getXCG01783());
		vrTechnicalSpec_XCGPart6Impl.setXCG01785(vrTechnicalSpec_XCGPart6.getXCG01785());
		vrTechnicalSpec_XCGPart6Impl.setXCG01786(vrTechnicalSpec_XCGPart6.getXCG01786());
		vrTechnicalSpec_XCGPart6Impl.setXCG01787(vrTechnicalSpec_XCGPart6.getXCG01787());
		vrTechnicalSpec_XCGPart6Impl.setXCG01788(vrTechnicalSpec_XCGPart6.getXCG01788());
		vrTechnicalSpec_XCGPart6Impl.setXCG01789(vrTechnicalSpec_XCGPart6.getXCG01789());
		vrTechnicalSpec_XCGPart6Impl.setXCG01790(vrTechnicalSpec_XCGPart6.getXCG01790());
		vrTechnicalSpec_XCGPart6Impl.setXCG01791(vrTechnicalSpec_XCGPart6.getXCG01791());
		vrTechnicalSpec_XCGPart6Impl.setXCG01792(vrTechnicalSpec_XCGPart6.getXCG01792());
		vrTechnicalSpec_XCGPart6Impl.setXCG01793(vrTechnicalSpec_XCGPart6.getXCG01793());
		vrTechnicalSpec_XCGPart6Impl.setXCG01794(vrTechnicalSpec_XCGPart6.getXCG01794());
		vrTechnicalSpec_XCGPart6Impl.setXCG01795(vrTechnicalSpec_XCGPart6.getXCG01795());
		vrTechnicalSpec_XCGPart6Impl.setXCG01796(vrTechnicalSpec_XCGPart6.getXCG01796());
		vrTechnicalSpec_XCGPart6Impl.setXCG01797(vrTechnicalSpec_XCGPart6.getXCG01797());
		vrTechnicalSpec_XCGPart6Impl.setXCG01798(vrTechnicalSpec_XCGPart6.getXCG01798());
		vrTechnicalSpec_XCGPart6Impl.setXCG01799(vrTechnicalSpec_XCGPart6.getXCG01799());
		vrTechnicalSpec_XCGPart6Impl.setXCG01801(vrTechnicalSpec_XCGPart6.getXCG01801());
		vrTechnicalSpec_XCGPart6Impl.setXCG01802(vrTechnicalSpec_XCGPart6.getXCG01802());
		vrTechnicalSpec_XCGPart6Impl.setXCG01803(vrTechnicalSpec_XCGPart6.getXCG01803());
		vrTechnicalSpec_XCGPart6Impl.setXCG01804(vrTechnicalSpec_XCGPart6.getXCG01804());
		vrTechnicalSpec_XCGPart6Impl.setXCG01805(vrTechnicalSpec_XCGPart6.getXCG01805());
		vrTechnicalSpec_XCGPart6Impl.setXCG01806(vrTechnicalSpec_XCGPart6.getXCG01806());
		vrTechnicalSpec_XCGPart6Impl.setXCG01807(vrTechnicalSpec_XCGPart6.getXCG01807());
		vrTechnicalSpec_XCGPart6Impl.setXCG01808(vrTechnicalSpec_XCGPart6.getXCG01808());
		vrTechnicalSpec_XCGPart6Impl.setXCG01809(vrTechnicalSpec_XCGPart6.getXCG01809());
		vrTechnicalSpec_XCGPart6Impl.setXCG01810(vrTechnicalSpec_XCGPart6.getXCG01810());
		vrTechnicalSpec_XCGPart6Impl.setXCG01811(vrTechnicalSpec_XCGPart6.getXCG01811());
		vrTechnicalSpec_XCGPart6Impl.setXCG01812(vrTechnicalSpec_XCGPart6.getXCG01812());
		vrTechnicalSpec_XCGPart6Impl.setXCG01813(vrTechnicalSpec_XCGPart6.getXCG01813());
		vrTechnicalSpec_XCGPart6Impl.setXCG01814(vrTechnicalSpec_XCGPart6.getXCG01814());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG001(vrTechnicalSpec_XCGPart6.getTDTKXCG001());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG002(vrTechnicalSpec_XCGPart6.getTDTKXCG002());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG003(vrTechnicalSpec_XCGPart6.getTDTKXCG003());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG004(vrTechnicalSpec_XCGPart6.getTDTKXCG004());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG005(vrTechnicalSpec_XCGPart6.getTDTKXCG005());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG006(vrTechnicalSpec_XCGPart6.getTDTKXCG006());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG007(vrTechnicalSpec_XCGPart6.getTDTKXCG007());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG008(vrTechnicalSpec_XCGPart6.getTDTKXCG008());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG009(vrTechnicalSpec_XCGPart6.getTDTKXCG009());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG010(vrTechnicalSpec_XCGPart6.getTDTKXCG010());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG011(vrTechnicalSpec_XCGPart6.getTDTKXCG011());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG012(vrTechnicalSpec_XCGPart6.getTDTKXCG012());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG013(vrTechnicalSpec_XCGPart6.getTDTKXCG013());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG014(vrTechnicalSpec_XCGPart6.getTDTKXCG014());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG015(vrTechnicalSpec_XCGPart6.getTDTKXCG015());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG016(vrTechnicalSpec_XCGPart6.getTDTKXCG016());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG017(vrTechnicalSpec_XCGPart6.getTDTKXCG017());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG018(vrTechnicalSpec_XCGPart6.getTDTKXCG018());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG019(vrTechnicalSpec_XCGPart6.getTDTKXCG019());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG020(vrTechnicalSpec_XCGPart6.getTDTKXCG020());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG021(vrTechnicalSpec_XCGPart6.getTDTKXCG021());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG022(vrTechnicalSpec_XCGPart6.getTDTKXCG022());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG023(vrTechnicalSpec_XCGPart6.getTDTKXCG023());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG024(vrTechnicalSpec_XCGPart6.getTDTKXCG024());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG025(vrTechnicalSpec_XCGPart6.getTDTKXCG025());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG026(vrTechnicalSpec_XCGPart6.getTDTKXCG026());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG027(vrTechnicalSpec_XCGPart6.getTDTKXCG027());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG028(vrTechnicalSpec_XCGPart6.getTDTKXCG028());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG029(vrTechnicalSpec_XCGPart6.getTDTKXCG029());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG030(vrTechnicalSpec_XCGPart6.getTDTKXCG030());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG031(vrTechnicalSpec_XCGPart6.getTDTKXCG031());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG032(vrTechnicalSpec_XCGPart6.getTDTKXCG032());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG033(vrTechnicalSpec_XCGPart6.getTDTKXCG033());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG034(vrTechnicalSpec_XCGPart6.getTDTKXCG034());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG035(vrTechnicalSpec_XCGPart6.getTDTKXCG035());
		vrTechnicalSpec_XCGPart6Impl.setTDTKXCG036(vrTechnicalSpec_XCGPart6.getTDTKXCG036());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG01(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG01());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG02(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG02());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG03(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG03());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG04(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG04());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG05(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG05());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG06(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG06());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG07(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG07());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG08(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG08());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG09(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG09());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG10(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG10());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG11(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG11());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG12(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG12());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG13(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG13());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG14(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG14());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG15(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG15());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG16(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG16());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG17(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG17());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG18(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG18());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG19(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG19());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG20(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG20());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG21(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG21());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG22(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG22());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG23(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG23());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG24(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG24());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG26(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG26());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG27(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG27());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG28(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG28());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG29(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG29());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG30(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG30());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG31(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG31());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG33(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG33());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG34(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG34());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG35(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG35());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG36(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG36());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG38(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG38());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG39(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG39());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG40(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG40());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG42(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG42());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG43(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG43());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG44(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG44());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG45(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG45());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG46(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG46());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG47(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG47());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG48(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG48());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG49(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG49());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG50(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG50());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG51(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG51());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG52(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG52());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG53(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG53());
		vrTechnicalSpec_XCGPart6Impl.setBBCNCLKLXCG54(vrTechnicalSpec_XCGPart6.getBBCNCLKLXCG54());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG001(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG001());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG002(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG002());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG003(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG003());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG004(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG004());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG005(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG005());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG006(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG006());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG007(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG007());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG008(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG008());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG009(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG009());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG010(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG010());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG011(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG011());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG012(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG012());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG013(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG013());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG014(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG014());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG015(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG015());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG016(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG016());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG017(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG017());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG018(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG018());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG019(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG019());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG020(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG020());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG021(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG021());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG022(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG022());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG023(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG023());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG024(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG024());
		vrTechnicalSpec_XCGPart6Impl.setBBKTSPMXCG025(vrTechnicalSpec_XCGPart6.getBBKTSPMXCG025());
		vrTechnicalSpec_XCGPart6Impl.setModifyDate(vrTechnicalSpec_XCGPart6.getModifyDate());
		vrTechnicalSpec_XCGPart6Impl.setSyncDate(vrTechnicalSpec_XCGPart6.getSyncDate());

		return vrTechnicalSpec_XCGPart6Impl;
	}

	/**
	 * Returns the vr technical spec_xcg part6 with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByPrimaryKey(primaryKey);

		if (vrTechnicalSpec_XCGPart6 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVRTechnicalSpec_XCGPart6Exception(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return vrTechnicalSpec_XCGPart6;
	}

	/**
	 * Returns the vr technical spec_xcg part6 with the primary key or throws a {@link NoSuchVRTechnicalSpec_XCGPart6Exception} if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6
	 * @throws NoSuchVRTechnicalSpec_XCGPart6Exception if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 findByPrimaryKey(long id)
		throws NoSuchVRTechnicalSpec_XCGPart6Exception {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the vr technical spec_xcg part6 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6, or <code>null</code> if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
				VRTechnicalSpec_XCGPart6Impl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = (VRTechnicalSpec_XCGPart6)serializable;

		if (vrTechnicalSpec_XCGPart6 == null) {
			Session session = null;

			try {
				session = openSession();

				vrTechnicalSpec_XCGPart6 = (VRTechnicalSpec_XCGPart6)session.get(VRTechnicalSpec_XCGPart6Impl.class,
						primaryKey);

				if (vrTechnicalSpec_XCGPart6 != null) {
					cacheResult(vrTechnicalSpec_XCGPart6);
				}
				else {
					entityCache.putResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
						VRTechnicalSpec_XCGPart6Impl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart6Impl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return vrTechnicalSpec_XCGPart6;
	}

	/**
	 * Returns the vr technical spec_xcg part6 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the vr technical spec_xcg part6
	 * @return the vr technical spec_xcg part6, or <code>null</code> if a vr technical spec_xcg part6 with the primary key could not be found
	 */
	@Override
	public VRTechnicalSpec_XCGPart6 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, VRTechnicalSpec_XCGPart6> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, VRTechnicalSpec_XCGPart6> map = new HashMap<Serializable, VRTechnicalSpec_XCGPart6>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 = fetchByPrimaryKey(primaryKey);

			if (vrTechnicalSpec_XCGPart6 != null) {
				map.put(primaryKey, vrTechnicalSpec_XCGPart6);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart6Impl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (VRTechnicalSpec_XCGPart6)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE_PKS_IN);

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

			for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : (List<VRTechnicalSpec_XCGPart6>)q.list()) {
				map.put(vrTechnicalSpec_XCGPart6.getPrimaryKeyObj(),
					vrTechnicalSpec_XCGPart6);

				cacheResult(vrTechnicalSpec_XCGPart6);

				uncachedPrimaryKeys.remove(vrTechnicalSpec_XCGPart6.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(VRTechnicalSpec_XCGPart6ModelImpl.ENTITY_CACHE_ENABLED,
					VRTechnicalSpec_XCGPart6Impl.class, primaryKey, nullModel);
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
	 * Returns all the vr technical spec_xcg part6s.
	 *
	 * @return the vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vr technical spec_xcg part6s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @return the range of vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vr technical spec_xcg part6s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRTechnicalSpec_XCGPart6ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vr technical spec_xcg part6s
	 * @param end the upper bound of the range of vr technical spec_xcg part6s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of vr technical spec_xcg part6s
	 */
	@Override
	public List<VRTechnicalSpec_XCGPart6> findAll(int start, int end,
		OrderByComparator<VRTechnicalSpec_XCGPart6> orderByComparator,
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

		List<VRTechnicalSpec_XCGPart6> list = null;

		if (retrieveFromCache) {
			list = (List<VRTechnicalSpec_XCGPart6>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VRTECHNICALSPEC_XCGPART6);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VRTECHNICALSPEC_XCGPART6;

				if (pagination) {
					sql = sql.concat(VRTechnicalSpec_XCGPart6ModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<VRTechnicalSpec_XCGPart6>)QueryUtil.list(q,
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
	 * Removes all the vr technical spec_xcg part6s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 : findAll()) {
			remove(vrTechnicalSpec_XCGPart6);
		}
	}

	/**
	 * Returns the number of vr technical spec_xcg part6s.
	 *
	 * @return the number of vr technical spec_xcg part6s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VRTECHNICALSPEC_XCGPART6);

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
		return VRTechnicalSpec_XCGPart6ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vr technical spec_xcg part6 persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(VRTechnicalSpec_XCGPart6Impl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART6 = "SELECT vrTechnicalSpec_XCGPart6 FROM VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE_PKS_IN =
		"SELECT vrTechnicalSpec_XCGPart6 FROM VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 WHERE id IN (";
	private static final String _SQL_SELECT_VRTECHNICALSPEC_XCGPART6_WHERE = "SELECT vrTechnicalSpec_XCGPart6 FROM VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 WHERE ";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART6 = "SELECT COUNT(vrTechnicalSpec_XCGPart6) FROM VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6";
	private static final String _SQL_COUNT_VRTECHNICALSPEC_XCGPART6_WHERE = "SELECT COUNT(vrTechnicalSpec_XCGPart6) FROM VRTechnicalSpec_XCGPart6 vrTechnicalSpec_XCGPart6 WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vrTechnicalSpec_XCGPart6.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VRTechnicalSpec_XCGPart6 exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VRTechnicalSpec_XCGPart6 exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(VRTechnicalSpec_XCGPart6PersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"convertAssembleId"
			});
}